B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.95
@EndOfDesignText@
'WebSocket class
Sub Class_Globals
	Private ws As WebSocket
	
	Private txtinvdate,cmbfromwarehouse,cmbtowarehouse,txtinvnote,cmbproduct,txttax,txtunitprice,txtqty,txtdiscount,btnaddproduct,btnsave,btncancel,divproducts As JQueryElement
	
	Private TempProductsTable As List
	
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
	templistpaymenttype.Initialize
	sql1 = Main.pool.GetConnection
	
	Load_Warehouses
	
	Load_Products
	
	
	Load_Data_ByID


End Sub

Private Sub WebSocket_Disconnected
	If sql1.IsInitialized Then
		sql1.Close
	End If
End Sub

#Region Main Invoice Information

Sub Load_Warehouses
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
		cmbfromwarehouse.SetHtml(sb.ToString)
		cmbtowarehouse.SetHtml(sb.ToString)
		
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
		If cmbproduct.GetVal.Value = "0" Or txtunitprice.GetVal.Value = "" Or txtqty.GetVal.Value = "" Or txtdiscount.GetVal.Value = "" Then
			Return
		End If
		
		Dim ClassTempProd As ClsTempProducts
		ClassTempProd.Initialize
		ClassTempProd.SetValues(cmbproduct.GetVal.Value,txttax.GetVal.Value,txtunitprice.GetVal.Value,txtqty.GetVal.Value,txtdiscount.GetVal.Value)
		
		TempProductsTable.Add(ClassTempProd)
		Load_AddedProducts_Temp
		 
		txtunitprice.SetVal("0") 
		txtqty.SetVal("0") 
		txtdiscount.SetVal("0") 
		 
	Catch
		Log(LastException)
	End Try
End Sub

Sub cmbproduct_Change (Params As Map)
	Try
		Dim rs As ResultSet
		rs = sql1.ExecQuery("select ProductPrice from ProductsInformation where ProductID="&cmbproduct.GetVal.Value)
		Do While rs.NextRow
			txtunitprice.SetVal(rs.GetString("ProductPrice"))
		Loop
		rs.Close
		
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
									                  <th class="wd-20p">Unit Price</th>
									                  <th class="wd-10p">Quantity</th>
									                  <th class="wd-15p">Total</th>
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
			str = str & "<td>"& ClassTempProd.UnitPrice &"</td>"
			str = str & "<td>"& ClassTempProd.Qty &"</td>"
			
			Dim taxPerc As Float = 0
			taxPerc = ClassTempProd.TaxID
			
			Dim TotalAmount As Float =  ((ClassTempProd.UnitPrice * ClassTempProd.Qty) - ClassTempProd.Discount)
			Dim TempTotalAmount As Float = 0
			If taxPerc > 0 Then
				TempTotalAmount = TotalAmount
				TempTotalAmount = TempTotalAmount * (taxPerc / 100)
			End If
			
			str = str & "<td>"& NumberFormat((TotalAmount + TempTotalAmount),0,4) &"</td>"
			
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
				sql1.ExecNonQuery2($"UPDATE TransferH
				   SET InvDT = ?
				      ,InvTotal = ?
				      ,FromWarehouseID = ?
				      ,InvTotalTax = ?
				      ,InvTotalDiscount = ?
				      ,InvTotalShipping = ?
				      ,PaidAmount = ?
				      ,StrNotes = ?
				      ,PaymenttypeID = ?
				      ,ToWarehouseID = ?
				 WHERE TransferHID=?"$,Array As Object(txtinvdate.GetVal.Value,dblinvtotal,cmbfromwarehouse.GetVal.Value,dblinvtotaltax, _
				 dblinvtotaldiscount,0,0,txtinvnote.GetVal.Value,0,cmbtowarehouse.GetVal.Value,InvoiceID))
				sql1.TransactionSuccessful
			
				sql1.BeginTransaction
				sql1.ExecNonQuery2("delete from TransferD where TransferHID=?",Array As Object(InvoiceID))
				sql1.TransactionSuccessful
				
				For i = 0 To TempProductsTable.Size -1
			
					Dim ClassTempProd As ClsTempProducts
					ClassTempProd = TempProductsTable.Get(i)
					
					sql1.BeginTransaction
					sql1.ExecNonQuery2($"INSERT INTO TransferD
			           (TransferHID
			           ,ProductID
			           ,ProductSellPrice
			           ,ProductCostPrice
			           ,TaxPerc
			           ,ProductQty)
			     VALUES
			           (?
			           ,?
			           ,?
			           ,?
			           ,?
			           ,?)"$,Array As Object(InvoiceID,ClassTempProd.ProductID,ClassTempProd.UnitPrice,ClassTempProd.ProductCostPrice,ClassTempProd.TaxID,ClassTempProd.Qty))
					sql1.TransactionSuccessful
					
				Next
				
			 
			
			
			Else
					
					sql1.BeginTransaction
					sql1.ExecNonQuery2($"INSERT INTO TransferH
				           (InvDT
				           ,InvTotal
				           ,FromWarehouseID
				           ,InvTotalTax
				           ,InvTotalDiscount
				           ,InvTotalShipping
				           ,PaidAmount
				           ,StrNotes
				           ,PaymenttypeID
				           ,ToWarehouseID)
				     VALUES
				           (?
				           ,?
				           ,?
				           ,?
				           ,?
				           ,?
				           ,?
				           ,?
				           ,?
				           ,?)"$,Array As Object(txtinvdate.GetVal.Value,dblinvtotal,cmbfromwarehouse.GetVal.Value,dblinvtotaltax, _
				 dblinvtotaldiscount,0,0,txtinvnote.GetVal.Value,0,cmbtowarehouse.GetVal.Value))
				 
					sql1.TransactionSuccessful
					
					Dim rs As ResultSet
					rs = sql1.ExecQuery("select TransferHID from TransferH order by TransferHID desc limit 1")
					Do While rs.NextRow
						LastSavedID = rs.GetInt("TransferHID")
					Loop
					rs.Close
					
						For i = 0 To TempProductsTable.Size -1
							Dim ClassTempProd As ClsTempProducts
							ClassTempProd = TempProductsTable.Get(i)
							
							sql1.BeginTransaction
							sql1.ExecNonQuery2($"INSERT INTO TransferD
					           (TransferHID
					           ,ProductID
					           ,ProductSellPrice
					           ,ProductCostPrice
					           ,TaxPerc
					           ,ProductQty)
					     VALUES
					           (?
					           ,?
					           ,?
					           ,?
					           ,?
					           ,?)"$,Array As Object(InvoiceID,ClassTempProd.ProductID,ClassTempProd.UnitPrice,ClassTempProd.ProductCostPrice,ClassTempProd.TaxID,ClassTempProd.Qty))
							sql1.TransactionSuccessful
							
						Next
						
						 
		End If
			
		Main.Insert_UsersLogs(ws,"Invoice Information")
			
		
		ws.Eval("document.location.replace('TransferInformation.html')",Null)
		
	Catch
		Log(LastException)
	End Try
End Sub
Sub btncancel_Click (Params As Map)
		ws.Eval("document.location.replace('TransferInformation.html')",Null)	
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
			rs = sql1.ExecQuery("select * from TransferH where TransferHID="&InvoiceID)
			Do While rs.NextRow
				
				txtinvdate.SetVal(rs.GetString("InvDT"))
				txtinvnote.SetVal(rs.GetString("StrNotes"))
				
				Dim strID As String = cmbfromwarehouse.id
				strID = strID.Replace("#","")
				ws.RunFunction("setSelectedRow", Array As Object(strID, rs.GetInt("FromWarehouseID")))
				
				
				Dim strID As String = cmbtowarehouse.id
				strID = strID.Replace("#","")
				ws.RunFunction("setSelectedRow", Array As Object(strID, rs.GetInt("ToWarehouseID")))
				 
			Loop
			rs.Close
		
			'----- Load Products Information
			Dim rs As ResultSet
			rs = sql1.ExecQuery("select * from TransferD where TransferHID="&InvoiceID)
			Do While rs.NextRow
				
				Dim ClassTempProd As ClsTempProducts
				ClassTempProd.Initialize
				ClassTempProd.SetValues(rs.GetInt("ProductID"),rs.GetInt("TaxPerc"),rs.GetString("ProductSellPrice"),rs.GetInt("ProductQty"),0)
				
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