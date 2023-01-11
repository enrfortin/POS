B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.95
@EndOfDesignText@
'WebSocket class
Sub Class_Globals
	Private ws As WebSocket
	Private sql1 As SQL
	Private cmbproduct,btncreatebarcode As JQueryElement
	
	
End Sub

Public Sub Initialize
	
End Sub

Private Sub WebSocket_Connected (WebSocket1 As WebSocket)
	ws = WebSocket1
	sql1 = Main.pool.GetConnection
	
	Load_Products
End Sub

Private Sub WebSocket_Disconnected
	If sql1.IsInitialized Then
		sql1.Close
	End If
End Sub

Sub cmbproduct_Change (Params As Map)
	Try
		Dim str As String = ""
		
		Dim rs As ResultSet
		rs = sql1.ExecQuery("select ProductBarcode from ProductsInformation where ProductID="&cmbproduct.GetVal.Value)
		Do While rs.NextRow
			str = $"
			  JsBarcode("#barcode1", "${rs.GetString("ProductBarcode").Trim}")
			 "$
			
		Loop
		rs.Close
		
		ws.Eval(str,Null)
	Catch
		Log(LastException)
	End Try
End Sub

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
