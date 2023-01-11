B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.95
@EndOfDesignText@
'WebSocket class
Sub Class_Globals
	Private ws As WebSocket
	Private txtname As JQueryElement
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
		
		If txtname.GetVal.Value = "" Then
			Return
		End If
		
		Dim CatID As Int = ws.Session.GetAttribute("CatID")	
		If CatID > 0 Then
				sql1.BeginTransaction
				sql1.ExecNonQuery2("Update WarehouseInfo set WarehouseDesc=?  where WarehouseID=? ", _
				Array As Object(txtname.GetVal.Value,CatID))
				sql1.TransactionSuccessful
			
			Else
				sql1.BeginTransaction
				sql1.ExecNonQuery2("insert into WarehouseInfo (WarehouseDesc) values (?) ", _
				Array As Object(txtname.GetVal.Value))
				sql1.TransactionSuccessful
				
		End If
		
		Main.Insert_UsersLogs(ws,"Warehouse Information")
		
		
		ws.Eval("document.location.replace('WarehouseInformation.html')",Null)
		
	Catch
		Log(LastException)
	End Try
End Sub
Sub btncancel_Click (Params As Map)
		ws.Eval("document.location.replace('WarehouseInformation.html')",Null)	
End Sub

Sub Load_Data_ByID
	Try
		
		Dim CatID As Int = ws.Session.GetAttribute("CatID")	
		If CatID > 0 Then
			
			Dim rs As ResultSet
			rs = sql1.ExecQuery("select * from  WarehouseInfo where WarehouseID="&CatID)
			Do While rs.NextRow
				
				txtname.SetVal(rs.GetString("WarehouseDesc"))
				
			Loop
			rs.Close
			
		End If
		
	Catch
		Log(LastException)
	End Try
End Sub