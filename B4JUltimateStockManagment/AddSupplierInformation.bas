B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.95
@EndOfDesignText@
'WebSocket class
Sub Class_Globals
	Private ws As WebSocket
	Private txtname,txtaddress,txtcity,txtcountry,txtphone,txtemail,btnsave,btncancel As JQueryElement
	Private lblusernamemain As JQueryElement
	Private divMenu As JQueryElement
	Private sql1 As SQL
	
End Sub

Public Sub Initialize
	
End Sub

Private Sub WebSocket_Connected (WebSocket1 As WebSocket)
	ws = WebSocket1
	Main.ValidateUsers(ws,lblusernamemain,divMenu)
	sql1 = Main.pool.GetConnection
	
	
	Load_Data_ByID
	
End Sub

Sub btnsave_Click (Params As Map)
	Try
		
		If txtname.GetVal.Value = "" Or txtaddress.GetVal.Value = "" Or txtcity.GetVal.Value = ""  Or txtphone.GetVal.Value = "" Then
			Return
		End If
		
		
		Dim CustomerID As Int = ws.Session.GetAttribute("CustomerID")	
		If CustomerID > 0 Then
			
				sql1.BeginTransaction
				sql1.ExecNonQuery2($"UPDATE SuppliersInfo
   SET SupplierName = ?
      ,SupplierEmail = ?
      ,SupplierPhone = ?
      ,SupplierCountry = ?
      ,SupplierCity = ?
      ,SupplierAddress = ? where SupplierID=?"$,Array As Object(txtname.GetVal.Value,txtemail.GetVal.Value,txtphone.GetVal.Value,txtcountry.GetVal.Value,txtcity.GetVal.Value,txtaddress.GetVal.Value,CustomerID))
				sql1.TransactionSuccessful
				
				
			Else
			
				sql1.BeginTransaction
				sql1.ExecNonQuery2($"INSERT INTO SuppliersInfo
           (SupplierName
           ,SupplierEmail
           ,SupplierPhone
           ,SupplierCountry
           ,SupplierCity
           ,SupplierAddress)
     VALUES
           (?
           ,?
           ,?
           ,?
           ,?
           ,?)"$,Array As Object(txtname.GetVal.Value,txtemail.GetVal.Value,txtphone.GetVal.Value,txtcountry.GetVal.Value,txtcity.GetVal.Value,txtaddress.GetVal.Value))
				
				sql1.TransactionSuccessful
			
		
		End If
				
		Main.Insert_UsersLogs(ws,"Supplier Information")
		
		ws.Eval("document.location.replace('SupplierInformation.html')",Null)
		
		
	Catch
		Log(LastException)
	End Try
End Sub
Sub btncancel_Click (Params As Map)
		ws.Eval("document.location.replace('SupplierInformation.html')",Null)	
End Sub

Private Sub WebSocket_Disconnected
	If sql1.IsInitialized Then
		sql1.Close
	End If
End Sub

Sub Load_Data_ByID
	Try

		Dim CustomerID As Int = ws.Session.GetAttribute("CustomerID")	
		If CustomerID > 0 Then
			
			Dim rs As ResultSet
			rs = sql1.ExecQuery("select * from  SuppliersInfo where SupplierID="&CustomerID)
			Do While rs.NextRow
				
				txtname.SetVal(rs.GetString("SupplierName"))
				txtaddress.SetVal(rs.GetString("SupplierAddress"))
				txtcountry.SetVal(rs.GetString("SupplierCountry"))
				txtcity.SetVal(rs.GetString("SupplierCity"))

				txtphone.SetVal(rs.GetString("SupplierPhone"))
				txtemail.SetVal(rs.GetString("SupplierEmail"))
				
			Loop
			rs.Close
			
		End If
		
	Catch
		Log(LastException)
	End Try
End Sub