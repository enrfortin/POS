B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.95
@EndOfDesignText@
'WebSocket class
Sub Class_Globals
	Private ws As WebSocket
	Private divlist As JQueryElement
	Private lblusernamemain As JQueryElement
	Private divMenu As JQueryElement
	
	'--- check If mobile device
	Private IntIsMobileDev As Int
	Private divismobiledev As JQueryElement
	Private sql1 As SQL
	
End Sub

Public Sub Initialize
	
End Sub

Private Sub WebSocket_Connected (WebSocket1 As WebSocket)
	ws = WebSocket1
	Main.ValidateUsers(ws,lblusernamemain,divMenu)
	
	ws.Session.SetAttribute("InvoiceID",0)
	sql1 = Main.pool.GetConnection
	
	CheckIsMobileBrowser
	
	Load_Data
	Load_Datatable_Controls
End Sub

Private Sub WebSocket_Disconnected
	If sql1.IsInitialized Then
		sql1.Close
	End If
End Sub

Sub Load_Data
	Try
		
			Dim str As String
			
			If IntIsMobileDev = 0 Then
				
			str = $" <table id='datatable1' class='table display responsive nowrap'>
		                                    <thead class="thead-dark">
		                                        <tr>
		                                              <th class="wd-15p">ID</th>
									                  <th class="wd-15p">Date</th>
									                  <th class="wd-10p">Warehouse</th>
									                  <th class="wd-15p">Total Products</th>
													  <th class="wd-25p">Action</th>
		                                        </tr>
		                                    </thead>
		                                    <tbody> "$
			
		Dim Cursor As ResultSet
		Cursor = sql1.ExecQuery($"SELECT        InWarehouseH.InWarehouseHID, InWarehouseH.WarehouseID, InWarehouseH.InWarehouseDate, InWarehouseH.InWarehouseNotes, WarehouseInfo.WarehouseDesc
FROM            InWarehouseH LEFT OUTER JOIN
                         WarehouseInfo ON InWarehouseH.WarehouseID = WarehouseInfo.WarehouseID"$)
		
		Do While Cursor.NextRow
			
			str = str & "  <tr> "
			str = str & "<td>"& Cursor.GetInt("InWarehouseHID") &"</td>"
			str = str & "<td>"& Cursor.GetString("InWarehouseDate") &"</td>"
			str = str & "<td>"& Cursor.GetString("WarehouseDesc") &"</td>"
			str = str & "<td>"& Load_Total_Products(Cursor.GetInt("InWarehouseHID")) &"</td>"
			
			str = str & "  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> " _
			&" <a href='javascript:void(0);' onclick=""editTbl("& Cursor.GetInt("InWarehouseHID") &")"" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> " _
			&" <a href='javascript:void(0);' onclick=""deleteTbl("& Cursor.GetInt("InWarehouseHID") &")"" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> " _
			&" </td> </tr>"
			
		Loop
		Cursor.Close
		
		str= str & " </tbody> </table>"
			
			Else
				
				str = $" <table id='datatable1' class='table display responsive nowrap'>
		                                    <thead class="thead-dark">
		                                        <tr>
		                                              <th class="wd-15p">ID</th>
													  <th class="wd-25p">Action</th>
		                                        </tr>
		                                    </thead>
		                                    <tbody> "$
			
				Dim Cursor As ResultSet
				Cursor = sql1.ExecQuery($"SELECT        InWarehouseH.InWarehouseHID, InWarehouseH.WarehouseID, InWarehouseH.InWarehouseDate, InWarehouseH.InWarehouseNotes, WarehouseInfo.WarehouseDesc
FROM            InWarehouseH LEFT OUTER JOIN
                         WarehouseInfo ON InWarehouseH.WarehouseID = WarehouseInfo.WarehouseID"$)
				
				Do While Cursor.NextRow
					
					str = str & "  <tr> "
					str = str & "<td>"& Cursor.GetInt("InWarehouseHID") &"</td>"
					
					str = str & "  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> " _
					&" <a href='javascript:void(0);' onclick=""editTbl("& Cursor.GetInt("InWarehouseHID") &")"" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> " _
					&" <a href='javascript:void(0);' onclick=""deleteTbl("& Cursor.GetInt("InWarehouseHID") &")"" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> " _
					&" </td> </tr>"
					
				Loop
				Cursor.Close
				
				str= str & " </tbody> </table>"
				
	
			End If
	
	
		divlist.SetHtml(str)
		
		
	Catch
		Log(LastException)
	End Try
End Sub

Sub Load_Total_Products(inwarehouseHID As Int)
	Try
		Dim intQty As Int = 0
		Dim rs As ResultSet
		rs = sql1.ExecQuery2("select count(InQty) as InQtyTotal from InWarehouseD where InWarehouseHID=?",Array As Object(inwarehouseHID))
		
		Do While rs.NextRow
			intQty = rs.GetInt("InQtyTotal")
		Loop
		rs.Close
		
		Return intQty
		
	Catch
		Log(LastException)
	End Try
End Sub


Private Sub Edit_button_table(params As Map)
	Log(params.Get("val"))
		
	ws.Session.SetAttribute("InvoiceID",params.Get("val"))
	
	ws.Eval("document.location.replace('AddAdjustInfo.html')",Null)
		
End Sub

Private Sub Delete_button_table(params As Map)
	Log(params.Get("val"))
		
	sql1.BeginTransaction
	
	sql1.ExecNonQuery("delete from InvoiceH where InvoiceID="&params.Get("val"))
	sql1.TransactionSuccessful	
 
	ws.Eval("document.location.reload(true)",Null)
	
End Sub

Private Sub Print_Table_Data(params As Map)
	Log(params.Get("val"))
	
	ws.Session.SetAttribute("TempRID",params.Get("val"))
	
	ws.Eval("window.open('PrintInvoiceReport.html', '_blank')",Null)
	
End Sub

Sub Load_Datatable_Controls
	Try
		
		Dim str As String
		str = $" $(function(){
        'use strict';

        $('#datatable1').DataTable({
          responsive: true,
          language: {
            searchPlaceholder: 'Search...',
            sSearch: '',
            lengthMenu: '_MENU_ items/page',
          }
        });

      
        // Select2
        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });

      });"$
	  
		ws.Eval(str,Null)
	  
	Catch
		Log(LastException)
	End Try
End Sub


Sub CheckIsMobileBrowser
	Try
		Dim str As String
		str = $"	
if(/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)){
	 
	document.getElementById("divismobiledev").innerHTML = "1";
	
}else{
	 document.getElementById("divismobiledev").innerHTML = "0";
}
		"$
		
		ws.Eval(str,Null)

		IntIsMobileDev = divismobiledev.GetHtml.Value
		Log(IntIsMobileDev)
	Catch
		Log(LastException)
	End Try
End Sub