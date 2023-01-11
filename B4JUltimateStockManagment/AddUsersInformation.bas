B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.95
@EndOfDesignText@
'WebSocket class
Sub Class_Globals
	Private ws As WebSocket
	Private txtname,txtuseremail,txtuserpassword,btnsave,btncancel As JQueryElement
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

Private Sub WebSocket_Disconnected
	If sql1.IsInitialized Then
		sql1.Close
	End If
End Sub


Sub btnsave_Click (Params As Map)
	Try
		
		If txtname.GetVal.Value = "" Or txtname.GetVal.Value = ""  Or txtuserpassword.GetVal.Value = "" Then
			Return
		End If
		
		Dim UserID As Int = ws.Session.GetAttribute("tempUserID")
		If UserID > 0 Then
			
				sql1.BeginTransaction
				sql1.ExecNonQuery2("Update UsersInformation set [UserFullName]=?,[UserEmailAddress]=?,[UserPassword]=?  where UserID=? ", _
				Array As Object(txtname.GetVal.Value,txtuseremail.GetVal.Value,txtuserpassword.GetVal.Value,UserID))
				sql1.TransactionSuccessful
				
			Else
				sql1.BeginTransaction
				sql1.ExecNonQuery2("insert into UsersInformation (UserFullName,UserEmailAddress,UserPassword) values (?,?,?) ", _
				Array As Object(txtname.GetVal.Value,txtuseremail.GetVal.Value,txtuserpassword.GetVal.Value))
				sql1.TransactionSuccessful
		End If
		
		
		Main.Insert_UsersLogs(ws,"Users Information")
		
		
		ws.Eval("document.location.replace('UsersInformation.html')",Null)
		
	Catch
		Log(LastException)
	End Try
End Sub
Sub btncancel_Click (Params As Map)
		ws.Eval("document.location.replace('UsersInformation.html')",Null)	
End Sub


Sub Load_Data_ByID
	Try
		
		Dim UserID As Int = ws.Session.GetAttribute("tempUserID")
		If UserID > 0 Then
			
			Dim rs As ResultSet
			rs = sql1.ExecQuery("select * from UsersInformation where UserID="&UserID)
			Do While rs.NextRow
				txtname.SetVal(rs.GetString("UserFullName"))
				txtuseremail.SetVal(rs.GetString("UserEmailAddress"))
				txtuserpassword.SetVal(rs.GetString("UserPassword"))
				 
			Loop
			rs.Close
			
		End If
		
	Catch
		Log(LastException)
	End Try
End Sub
