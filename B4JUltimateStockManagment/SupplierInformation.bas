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
	
	ws.Session.SetAttribute("CustomerID",0)
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
									                  <th class="wd-15p">Supplier Name</th>
									                  <th class="wd-20p">Email</th>
									                  <th class="wd-15p">Phone</th>
									                  <th class="wd-10p">Country</th>
									                  <th class="wd-25p">City</th>
													  <th class="wd-25p">Action</th>
		                                        </tr>
		                                    </thead>
		                                    <tbody> "$
			
		Dim Cursor As ResultSet
		Cursor = sql1.ExecQuery("select * from SuppliersInfo")
		
		Do While Cursor.NextRow
			
			str = str & "  <tr> "
			str = str & "<td>"& Cursor.GetString("SupplierID") &"</td>"
			str = str & "<td>"& Cursor.GetString("SupplierName") &"</td>"
			str = str & "<td>"& Cursor.GetString("SupplierEmail") &"</td>"
			str = str & "<td>"& Cursor.GetString("SupplierPhone") &"</td>"
			str = str & "<td>"& Cursor.GetString("SupplierCountry") &"</td>"
			str = str & "<td>"& Cursor.GetString("SupplierCity") &"</td>"
			
			str = str & "  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> " _
			&" <a href='javascript:void(0);' onclick=""editTbl("& Cursor.GetInt("SupplierID") &")"" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil'></i></div></a> " _
			&" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=""deleteTbl("& Cursor.GetInt("SupplierID") &")""></i></div></a> " _
			&" </td> </tr>"
			
		Loop
		Cursor.Close
		
		str= str & " </tbody> </table>"
	
		
		Else
			
			
				str = $" <table id='datatable1' class='table display responsive nowrap'>
			                                    <thead class="thead-dark">
			                                        <tr>
			                                              <th class="wd-15p">ID</th>
										                  <th class="wd-15p">Customer Name</th>
														  <th class="wd-25p">Action</th>
			                                        </tr>
			                                    </thead>
			                                    <tbody> "$
				
			Dim Cursor As ResultSet
			Cursor = sql1.ExecQuery("select * from SuppliersInfo")

			Do While Cursor.NextRow
				
				str = str & "  <tr> "
				str = str & "<td>"& Cursor.GetString("SupplierID") &"</td>"
				str = str & "<td>"& Cursor.GetString("SupplierName") &"</td>"
				
				str = str & "  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> " _
				&" <a href='javascript:void(0);' onclick=""editTbl("& Cursor.GetInt("SupplierID") &")"" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil'></i></div></a> " _
				&" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=""deleteTbl("& Cursor.GetInt("SupplierID") &")""></i></div></a> " _
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


Private Sub Edit_button_table(params As Map)
	Log(params.Get("val"))
		
	ws.Session.SetAttribute("CustomerID",params.Get("val"))
	
	ws.Eval("document.location.replace('AddSupplierInfo.html')",Null)
		
End Sub

Private Sub Delete_button_table(params As Map)
	Log(params.Get("val"))
		
	sql1.BeginTransaction
	
	sql1.ExecNonQuery("delete from SuppliersInfo where SupplierID="&params.Get("val"))
	sql1.TransactionSuccessful	
 
	ws.Eval("document.location.reload(true)",Null)
	
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