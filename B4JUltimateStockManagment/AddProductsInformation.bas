B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.95
@EndOfDesignText@
'WebSocket class
Sub Class_Globals
	Private ws As WebSocket
	Private txtname,cmbcat,txtbarcode,txtunitprice,txtcostprice,txttax,txtimagen As JQueryElement
	Private lblusernamemain As JQueryElement
	Private divMenu As JQueryElement
	Private sql1 As SQL
	
End Sub

Public Sub Initialize
	
End Sub

Private Sub WebSocket_Connected (WebSocket1 As WebSocket)
	ws = WebSocket1
	Main.ValidateUsers(ws,lblusernamemain,divMenu)
	ws.Session.SetAttribute("ProductID",0)
	sql1 = Main.pool.GetConnection
	
	Load_Cats
	
	Load_Data_ByID
	
End Sub



Sub Load_Cats
	Log(txtimagen.GetText.Value)
	Log(txtimagen.GetVal.Value)

	
	Try
		Dim sb As StringBuilder
		sb.Initialize
		Dim rs As ResultSet
		rs = sql1.ExecQuery("select * from CatInfo")
		Do While rs.NextRow
			Dim val As String = rs.GetInt("CatID")
			sb.Append("<option value='").Append(val).Append("'>").Append(rs.GetString("CatDesc")).Append("</option>")
		Loop
		rs.Close
		cmbcat.SetHtml(sb.ToString)
		
	Catch
		Log(LastException)
	End Try
End Sub

Sub btnsave_Click (Params As Map)
	Try
		
		If txtname.GetVal.Value = "" Or txtunitprice.GetVal.Value = "" Or txtcostprice.GetVal.Value = ""  Then
			Return
		End If
		
		Dim ProductID As Int = ws.Session.GetAttribute("ProductID")	
		If ProductID > 0 Then
			
			Dim PayLoadStr As String =txtimagen.GetVal.Value
			Dim commapos As Int =PayLoadStr.IndexOf("\")
			
		
			
		
			
				sql1.BeginTransaction
				sql1.ExecNonQuery2($"UPDATE ProductsInformation
   SET ProductName = ?
      ,ProductPrice = ?
      ,ProductImage = ?
      ,CatID = ?
      ,CostPrice = ?
      ,ProductBarcode = ?
      ,ProductTax = ? where ProductID=?"$,Array As Object(txtname.GetVal.Value,txtunitprice.GetVal.Value,"images/products/"&PayLoadStr.SubString(commapos+10),cmbcat.GetVal.Value,txtcostprice.GetVal.Value,txtbarcode.GetVal.Value,txttax.GetVal.Value,ProductID))
				sql1.TransactionSuccessful
				
			Else
				
			Dim PayLoadStr As String =txtimagen.GetVal.Value
			Dim commapos As Int =PayLoadStr.IndexOf("\")
	
				
				
				sql1.BeginTransaction
				sql1.ExecNonQuery2($"INSERT INTO ProductsInformation
		           (ProductName
		           ,ProductPrice
		           ,ProductImage
		           ,CatID
		           ,CostPrice
		           ,ProductBarcode
		           ,ProductTax)
		     VALUES
		           (?
		           ,?
		           ,?
		           ,?
		           ,?
		           ,?
		           ,? )"$,Array As Object(txtname.GetVal.Value,txtunitprice.GetVal.Value,"images/products/"&PayLoadStr.SubString(commapos+10),cmbcat.GetVal.Value,txtcostprice.GetVal.Value,txtbarcode.GetVal.Value,txttax.GetVal.Value))
				
				sql1.TransactionSuccessful
			
		End If
				
		Main.Insert_UsersLogs(ws,"Products Information")
				
		ws.Eval("document.location.replace('ProductsInformation.html')",Null)
		
		
	Catch
		Log(LastException)
	End Try
End Sub

Sub btncancel_Click (Params As Map)
		ws.Eval("document.location.replace('ProductsInformation.html')",Null)	
End Sub

Private Sub WebSocket_Disconnected
	If sql1.IsInitialized Then
		sql1.Close
	End If
End Sub

Sub Load_Data_ByID
	Try
				
		Dim ProductID As Int = ws.Session.GetAttribute("ProductID")	
		If ProductID > 0 Then
			
			Dim rs As ResultSet
			rs = sql1.ExecQuery("select * from  ProductsInformation where ProductID="&ProductID)
			Do While rs.NextRow
				
				txtname.SetVal(rs.GetString("ProductName"))
				 
				Dim strID As String = cmbcat.id
				strID = strID.Replace("#","")
				ws.RunFunction("setSelectedRow", Array As Object(strID, rs.GetInt("CatID")))
				
				txtbarcode.SetVal(rs.GetString("ProductBarcode"))
				txtunitprice.SetVal(rs.GetString("ProductPrice"))
				txtcostprice.SetVal(rs.GetString("CostPrice"))
				txttax.SetVal(rs.GetString("ProductTax"))
				
			Loop
			rs.Close
			
		End If
		
		
	Catch
		Log(LastException)
	End Try
End Sub