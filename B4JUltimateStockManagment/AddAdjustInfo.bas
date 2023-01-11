B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.95
@EndOfDesignText@
'WebSocket class
Sub Class_Globals
	Private ws As WebSocket
	
	Private txtinvdate,cmbwarehouse,txtinvnote,cmbproduct,txtqty,btnaddproduct,btnsave,btncancel,divproducts As JQueryElement
	
	Private TempProductsTable As List
	
	Private templistcmbcustomer As List
	Private templistpaymenttype As List
	Private lblusernamemain As JQueryElement
	Private divMenu As JQueryElement
	Private sql1 As SQL
	
End Sub

Public Sub Initialize
	
End Sub

Private Sub WebSocket_Connected (WebSocket1 As WebSocket)
	ws = WebSocket1
	Main.ValidateUsers(ws,lblusernamemain,divMenu)
	
	TempProductsTable.Initialize
	templistcmbcustomer.Initialize
	templistpaymenttype.Initialize
	sql1 = Main.pool.GetConnection
	 
	Load_Products
	 
	Load_WarehouseInformation
	Load_Data_ByID

End Sub

Private Sub WebSocket_Disconnected
	If sql1.IsInitialized Then
		sql1.Close
	End If
End Sub

#Region Main Invoice Information
  

Sub Load_WarehouseInformation
	Try
		
		Dim sb As StringBuilder
		sb.Initialize
		Dim rs As ResultSet
		rs = sql1.ExecQuery("select * from WarehouseInfo")
		Do While rs.NextRow
			Dim val As String = rs.GetInt("WarehouseID")
			sb.Append("<option value='").Append(val).Append("'>").Append(rs.GetString("WarehouseDesc")).Append("</option>")
			
		Loop
		rs.Close
		cmbwarehouse.SetHtml(sb.ToString)
		
	Catch
		Log(LastException)
	End Try
End Sub


#End Region

#Region Products
Sub Load_Products
	Try
		
		Dim sb As StringBuilder
		sb.Initialize
		Dim rs As ResultSet
		rs = sql1.ExecQuery("select * from ProductsInformation")
		Do While rs.NextRow
			Dim val As String = rs.GetInt("ProductID")
			sb.Append("<option value='").Append(val).Append("'>").Append(rs.GetString("ProductName")).Append("</option>")
		Loop
		rs.Close
		cmbproduct.SetHtml(sb.ToString)
		
	Catch
		Log(LastException)
	End Try
End Sub


'----Add Products
Sub btnaddproduct_Click (Params As Map)
	Try
		If cmbproduct.GetVal.Value = "0" Or txtqty.GetVal.Value = "" Then
			Return
		End If
		
		Dim ClassTempProd As ClsTempProducts
		ClassTempProd.Initialize
		ClassTempProd.SetValues(cmbproduct.GetVal.Value,0,0,txtqty.GetVal.Value,0)
		
		TempProductsTable.Add(ClassTempProd)
		Load_AddedProducts_Temp
		 
		txtqty.SetVal("1") 
		 
	Catch
		Log(LastException)
	End Try
End Sub
 
Sub Load_AddedProducts_Temp
	Try
		
			Dim str As String
			str = $" <table id='datatable1' class='table display responsive nowrap'>
		                                    <thead class="thead-dark">
		                                        <tr>
		                                              <th class="wd-15p">ID</th>
									                  <th class="wd-15p">Product Name</th>
									                  <th class="wd-10p">Quantity</th>
													  <th class="wd-25p">Action</th>
		                                        </tr>
		                                    </thead>
		                                    <tbody> "$
			
	 
		For i = 0 To TempProductsTable.Size -1

			Dim ClassTempProd As ClsTempProducts
			ClassTempProd = TempProductsTable.Get(i)
				
			str = str & "  <tr> "
			str = str & "<td>"& ClassTempProd.ProductID &"</td>"
			str = str & "<td>"& ClassTempProd.ProductName &"</td>"
			str = str & "<td>"& ClassTempProd.Qty &"</td>"
			 
			
			str = str & "  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> " _
			&" <a href='javascript:void(0);' onclick=""deleteproductTbl("& i &")"" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> " _
			&" </td> </tr>"
			
		Next
		
		str= str & " </tbody> </table>"
	
		divproducts.SetHtml(str)
		
		Load_Datatable_Controls
		
	Catch
		Log(LastException)
	End Try
End Sub

Private Sub Delete_button_table_Products(params As Map)
	
	Dim index As Int = params.Get("val")
	 
	TempProductsTable.RemoveAt(index)
 	Load_AddedProducts_Temp
	
End Sub

#End Region


Sub btnsave_Click (Params As Map)
	Try
	 
		Dim LastSavedID As Int = 0
	 
	 
		If txtinvdate.GetVal.Value = ""  Then
			Return
		End If
		
		Dim InvoiceID As Int = 0
		If ws.Session.GetAttribute("InvoiceID") = Null Then
		
		Else
			InvoiceID = ws.Session.GetAttribute("InvoiceID")
			LastSavedID = InvoiceID
		End If
		
			Dim dblinvtotal,dblinvtotaltax,dblinvtotaldiscount As Double = 0
			
				For i = 0 To TempProductsTable.Size -1
			
					Dim ClassTempProd As ClsTempProducts
					ClassTempProd = TempProductsTable.Get(i)
					
					dblinvtotal = ClassTempProd.Qty * ClassTempProd.UnitPrice
					dblinvtotaltax = dblinvtotal * (ClassTempProd.TaxID / 100)
					dblinvtotaldiscount = ClassTempProd.Discount
					
				Next
				dblinvtotal = dblinvtotal + dblinvtotaltax
				dblinvtotal = dblinvtotal - dblinvtotaldiscount
		
		If InvoiceID > 0 Then
			
		
				
			
				sql1.BeginTransaction
				sql1.ExecNonQuery2($"UPDATE InWarehouseH
				   SET WarehouseID = ?
				      ,InWarehouseDate = ?
				      ,InWarehouseNotes = ?
				 WHERE InWarehouseHID=?"$,Array As Object(cmbwarehouse.GetVal.Value,txtinvdate.GetVal.Value,txtinvnote.GetVal.Value,InvoiceID))
				sql1.TransactionSuccessful
			
				sql1.BeginTransaction
				sql1.ExecNonQuery2("delete from InWarehouseD where InWarehouseHID=?",Array As Object(InvoiceID))
				sql1.TransactionSuccessful
				
				For i = 0 To TempProductsTable.Size -1
			
					Dim ClassTempProd As ClsTempProducts
					ClassTempProd = TempProductsTable.Get(i)
					
					sql1.BeginTransaction
					sql1.ExecNonQuery2($"INSERT INTO InWarehouseD
			           (InWarehouseHID
			           ,ProductID
			           ,InQty)
			     VALUES
			           (?
			           ,?
			           ,?)"$,Array As Object(InvoiceID,ClassTempProd.ProductID,ClassTempProd.Qty))
					sql1.TransactionSuccessful
					
				Next
				
			 
			
			
			Else
					
					sql1.BeginTransaction
					sql1.ExecNonQuery2($"INSERT INTO InWarehouseH
				           (WarehouseID
				           ,InWarehouseDate
				           ,InWarehouseNotes)
				     VALUES
				           (?
				           ,?
				           ,?)"$,Array As Object(cmbwarehouse.GetVal.Value,txtinvdate.GetVal.Value,txtinvnote.GetVal.Value))
					sql1.TransactionSuccessful
					
					Dim rs As ResultSet
					rs = sql1.ExecQuery("select InWarehouseHID from InWarehouseH order by InWarehouseHID desc limit 1")
					Do While rs.NextRow
						LastSavedID = rs.GetInt("InWarehouseHID")
					Loop
					rs.Close
					
						For i = 0 To TempProductsTable.Size -1
							Dim ClassTempProd As ClsTempProducts
							ClassTempProd = TempProductsTable.Get(i)
							
							sql1.BeginTransaction
							sql1.ExecNonQuery2($"INSERT INTO InWarehouseD
					           (InWarehouseHID
					           ,ProductID
					           ,InQty)
					     VALUES
					           (?
					           ,?
					           ,?)"$,Array As Object(LastSavedID,ClassTempProd.ProductID,ClassTempProd.Qty))
							sql1.TransactionSuccessful
							
						Next
						
						 
		End If
			
		Main.Insert_UsersLogs(ws,"Invoice Information")
			
		
		ws.Eval("document.location.replace('AdjustmentInformation.html')",Null)
		
	Catch
		Log(LastException)
	End Try
End Sub
Sub btncancel_Click (Params As Map)
		ws.Eval("document.location.replace('AdjustmentInformation.html')",Null)	
End Sub


#Region LoadDataToEdit
Sub Load_Data_ByID
	Try

		Dim InvoiceID As Int = 0
		If ws.Session.GetAttribute("InvoiceID") = Null Then
		
		Else
			InvoiceID = ws.Session.GetAttribute("InvoiceID")
		End If
			
		If InvoiceID > 0 Then
			'----- Load Main Invoice Information
			Dim rs As ResultSet
			rs = sql1.ExecQuery("select * from InWarehouseH where InWarehouseHID="&InvoiceID)
			Do While rs.NextRow
				
				txtinvdate.SetVal(rs.GetString("InWarehouseDate"))
				txtinvnote.SetVal(rs.GetString("InWarehouseNotes"))
				
				Dim strID As String = cmbwarehouse.id
				strID = strID.Replace("#","")
				ws.RunFunction("setSelectedRow", Array As Object(strID, rs.GetInt("WarehouseID")))
			 
			Loop
			rs.Close
		
			'----- Load Products Information
			Dim rs As ResultSet
			rs = sql1.ExecQuery("select * from InWarehouseD where InWarehouseHID="&InvoiceID)
			Do While rs.NextRow
				
				Dim ClassTempProd As ClsTempProducts
				ClassTempProd.Initialize
				ClassTempProd.SetValues(rs.GetInt("ProductID"),0,0,rs.GetInt("InQty"),0)
				
				TempProductsTable.Add(ClassTempProd)
				Load_AddedProducts_Temp
			 
			Loop
			rs.Close
			
		  
		End If
		
	Catch
		Log(LastException)
	End Try
End Sub
#End Region


Sub Load_Datatable_Controls
	Try
		
		Dim str As String
		str = $" $(function(){
        'use strict';

        $('#datatable1').DataTable({
  bLengthChange: false,
  searching: false,
  responsive: true
});

      });"$
	  
		ws.Eval(str,Null)
	  
	Catch
		Log(LastException)
	End Try
End Sub

Sub Load_Datatable_Controls2
	Try
		
		Dim str As String
		str = $" $(function(){
        'use strict';

        $('#datatable2').DataTable({
  bLengthChange: false,
  searching: false,
  responsive: true
});
      });"$
	  
		ws.Eval(str,Null)
	  
	Catch
		Log(LastException)
	End Try
End Sub