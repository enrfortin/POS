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
		                                              <th class="wd-15p">Transaction ID</th>
									                  <th class="wd-15p">User Full Name</th>
									                  <th class="wd-15p">Description</th>
													  <th class="wd-25p">Datetime</th>
		                                        </tr>
		                                    </thead>
		                                    <tbody> "$
			
		Dim Cursor As ResultSet
		Cursor = sql1.ExecQuery("SELECT        UsersLogs.UserLogID, UsersLogs.UserID, UsersLogs.ActivityDesc, UsersLogs.ActivityDatetime, UsersInformation.UserFullName " _
&" FROM            UsersLogs LEFT OUTER JOIN " _
                         &" UsersInformation ON UsersLogs.UserID = UsersInformation.UserID order by UsersLogs.UserLogID desc")
		
		Do While Cursor.NextRow
			
			str = str & "  <tr> "
			str = str & "<td>"& Cursor.GetString("UserLogID") &"</td>"
			str = str & "<td>"& Cursor.GetString("UserFullName") &"</td>"
			str = str & "<td>"& Cursor.GetString("ActivityDesc") &"</td>"
			str = str & "<td>"& Cursor.GetString("ActivityDatetime") &"</td></tr>"
			
			
		Loop
		Cursor.Close
		
		str= str & " </tbody> </table>"
	
		divlist.SetHtml(str)
		
		
	Catch
		Log(LastException)
	End Try
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