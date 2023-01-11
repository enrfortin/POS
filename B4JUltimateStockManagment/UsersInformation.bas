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
	Private sql1 As SQL
	
End Sub

Public Sub Initialize
	
End Sub

Private Sub WebSocket_Connected (WebSocket1 As WebSocket)
	ws = WebSocket1
	Main.ValidateUsers(ws,lblusernamemain,divMenu)
	
	sql1 = Main.pool.GetConnection
	
	ws.Session.SetAttribute("tempUserID",0)
	
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
			str = $" <table id='datatable1' class='table display responsive nowrap'>
		                                    <thead class="thead-dark">
		                                        <tr>
		                                              <th class="wd-15p">ID</th>
									                  <th class="wd-15p">User Full Name</th>
									                  <th class="wd-15p">User Email</th>
													  <th class="wd-25p">Action</th>
		                                        </tr>
		                                    </thead>
		                                    <tbody> "$
			
		Dim Cursor As ResultSet
		Cursor = sql1.ExecQuery("select * from UsersInformation")
		
		Do While Cursor.NextRow
			
			str = str & "  <tr> "
			str = str & "<td>"& Cursor.GetString("UserID") &"</td>"
			str = str & "<td>"& Cursor.GetString("UserFullName") &"</td>"
			str = str & "<td>"& Cursor.GetString("UserEmailAddress") &"</td>"
			
			str = str & "  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> " _
			&" <a href='javascript:void(0);' onclick=""editTbl("& Cursor.GetInt("UserID") &")"" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> " _
			&" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=""deleteTbl("& Cursor.GetInt("UserID") &")""></i></div></a> " _
			&" </td> </tr>"
			
		Loop
		Cursor.Close
		
		str= str & " </tbody> </table>"
	
		divlist.SetHtml(str)
		
		
	Catch
		Log(LastException)
	End Try
End Sub


Private Sub Edit_button_table(params As Map)
	Log(params.Get("val"))
		
	ws.Session.SetAttribute("tempUserID",params.Get("val"))
	
	ws.Eval("document.location.replace('AddUsersInfo.html')",Null)
		
End Sub

Private Sub Delete_button_table(params As Map)
	Log(params.Get("val"))
		
	sql1.BeginTransaction
	
	sql1.ExecNonQuery("delete from UsersInformation where UserID="&params.Get("val"))
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