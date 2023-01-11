B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.95
@EndOfDesignText@
'WebSocket class
Sub Class_Globals
	Private ws As WebSocket
	Private txtemail,txtpassword,btnlogin As JQueryElement
	Private sql1 As SQL
	
End Sub

Public Sub Initialize
	
End Sub

Private Sub WebSocket_Connected (WebSocket1 As WebSocket)
		ws = WebSocket1
	
			ws.Session.SetAttribute("UserID",0)
			ws.Session.SetAttribute("UserFullName",0)
			ws.Session.SetAttribute("UserEmailAddress",0)
			
	sql1 = Main.pool.GetConnection
			
End Sub

Private Sub WebSocket_Disconnected
If sql1.IsInitialized Then
		sql1.Close
	End If
End Sub
Sub btnlogin_Click (Params As Map)
	Try
		Dim intIsFound As Int = 0
		
		Dim rs As ResultSet
		rs = sql1.ExecQuery2("select * from UsersInformation where UserEmailAddress=? and UserPassword=?", Array As Object(txtemail.GetVal.Value,txtpassword.GetVal.Value))
		Do While rs.NextRow
			intIsFound = 1
			ws.Session.SetAttribute("UserID",rs.GetInt("UserID"))
			ws.Session.SetAttribute("UserFullName",rs.GetString("UserFullName"))
			ws.Session.SetAttribute("UserEmailAddress",rs.GetString("UserEmailAddress"))
			
		Loop
		rs.Close
		
		Load_CompanyInformation
		
		If intIsFound = 1 Then
			ws.Eval("document.location.replace('index.html')",Null)
		Else
			ws.Eval("document.location.replace('login.html')",Null)
			
		End If
		
	Catch
		Log(LastException)
	End Try
End Sub

Sub Load_CompanyInformation
	Try
		Dim rs As ResultSet
		rs = sql1.ExecQuery("select * from CompaniesInformation limit 1")
		Do While rs.NextRow
			ws.Session.SetAttribute("CompanyID",rs.GetInt("CompanyID"))	
		Loop
		rs.Close
		
	Catch
		Log(LastException)
	End Try
End Sub


Sub btnloginpos_Click (Params As Map)
	Try
		Dim intIsFound As Int = 0
		
		Dim rs As ResultSet
		rs = sql1.ExecQuery2("select * from UsersInformation where UserEmailAddress=? and UserPassword=?", Array As Object(txtemail.GetVal.Value,txtpassword.GetVal.Value))
		Do While rs.NextRow
			intIsFound = 1
			ws.Session.SetAttribute("UserID",rs.GetInt("UserID"))
			ws.Session.SetAttribute("UserFullName",rs.GetString("UserFullName"))
			ws.Session.SetAttribute("UserEmailAddress",rs.GetString("UserEmailAddress"))
			
		Loop
		rs.Close
		
		Load_CompanyInformation
		
		If intIsFound = 1 Then
			ws.Eval("document.location.replace('POS/POS.html')",Null)
		Else
			ws.Eval("document.location.replace('login.html')",Null)
			
		End If
		
	Catch
		Log(LastException)
	End Try
End Sub