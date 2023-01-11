package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class userslogsinformation_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
userslogsinformation._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",userslogsinformation._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private divlist As JQueryElement";
userslogsinformation._divlist = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divlist",userslogsinformation._divlist);
 //BA.debugLineNum = 5;BA.debugLine="Private lblusernamemain As JQueryElement";
userslogsinformation._lblusernamemain = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblusernamemain",userslogsinformation._lblusernamemain);
 //BA.debugLineNum = 6;BA.debugLine="Private divMenu As JQueryElement";
userslogsinformation._divmenu = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divmenu",userslogsinformation._divmenu);
 //BA.debugLineNum = 7;BA.debugLine="Private sql1 As SQL";
userslogsinformation._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",userslogsinformation._sql1);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (userslogsinformation) ","userslogsinformation",36,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "userslogsinformation","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1024);
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_data(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_Data (userslogsinformation) ","userslogsinformation",36,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("load_data")) { return __ref.runUserSub(false, "userslogsinformation","load_data", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
 BA.debugLineNum = 32;BA.debugLine="Sub Load_Data";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 35;BA.debugLine="Dim str As String";
Debug.ShouldStop(4);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 36;BA.debugLine="str = $\" <table id='datatable1' class='table di";
Debug.ShouldStop(8);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" <table id='datatable1' class='table display responsive nowrap'>\n"),RemoteObject.createImmutable("		                                    <thead class=\"thead-dark\">\n"),RemoteObject.createImmutable("		                                        <tr>\n"),RemoteObject.createImmutable("		                                              <th class=\"wd-15p\">Transaction ID</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">User Full Name</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">Description</th>\n"),RemoteObject.createImmutable("													  <th class=\"wd-25p\">Datetime</th>\n"),RemoteObject.createImmutable("		                                        </tr>\n"),RemoteObject.createImmutable("		                                    </thead>\n"),RemoteObject.createImmutable("		                                    <tbody> ")));Debug.locals.put("str", _str);
 BA.debugLineNum = 47;BA.debugLine="Dim Cursor As ResultSet";
Debug.ShouldStop(16384);
_cursor = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 48;BA.debugLine="Cursor = sql1.ExecQuery(\"SELECT        UsersLogs";
Debug.ShouldStop(32768);
_cursor = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT        UsersLogs.UserLogID, UsersLogs.UserID, UsersLogs.ActivityDesc, UsersLogs.ActivityDatetime, UsersInformation.UserFullName "),RemoteObject.createImmutable(" FROM            UsersLogs LEFT OUTER JOIN "),RemoteObject.createImmutable(" UsersInformation ON UsersLogs.UserID = UsersInformation.UserID order by UsersLogs.UserLogID desc"))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 52;BA.debugLine="Do While Cursor.NextRow";
Debug.ShouldStop(524288);
while (_cursor.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 54;BA.debugLine="str = str & \"  <tr> \"";
Debug.ShouldStop(2097152);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <tr> "));Debug.locals.put("str", _str);
 BA.debugLineNum = 55;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"UserLogID";
Debug.ShouldStop(4194304);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("UserLogID"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 56;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"UserFullN";
Debug.ShouldStop(8388608);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("UserFullName"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 57;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ActivityD";
Debug.ShouldStop(16777216);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ActivityDesc"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 58;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ActivityD";
Debug.ShouldStop(33554432);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ActivityDatetime"))),RemoteObject.createImmutable("</td></tr>"));Debug.locals.put("str", _str);
 }
;
 BA.debugLineNum = 62;BA.debugLine="Cursor.Close";
Debug.ShouldStop(536870912);
_cursor.runVoidMethod ("Close");
 BA.debugLineNum = 64;BA.debugLine="str= str & \" </tbody> </table>\"";
Debug.ShouldStop(-2147483648);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" </tbody> </table>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 66;BA.debugLine="divlist.SetHtml(str)";
Debug.ShouldStop(2);
__ref.getField(false,"_divlist" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_str));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e17.toString()); BA.debugLineNum = 70;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
userslogsinformation.__c.runVoidMethod ("LogImpl","222413350",BA.ObjectToString(userslogsinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_datatable_controls(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_Datatable_Controls (userslogsinformation) ","userslogsinformation",36,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("load_datatable_controls")) { return __ref.runUserSub(false, "userslogsinformation","load_datatable_controls", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 75;BA.debugLine="Sub Load_Datatable_Controls";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 78;BA.debugLine="Dim str As String";
Debug.ShouldStop(8192);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 79;BA.debugLine="str = $\" $(function(){         'use strict';";
Debug.ShouldStop(16384);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" $(function(){\n"),RemoteObject.createImmutable("        'use strict';\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("        $('#datatable1').DataTable({\n"),RemoteObject.createImmutable("          responsive: true,\n"),RemoteObject.createImmutable("          language: {\n"),RemoteObject.createImmutable("            searchPlaceholder: 'Search...',\n"),RemoteObject.createImmutable("            sSearch: '',\n"),RemoteObject.createImmutable("            lengthMenu: '_MENU_ items/page',\n"),RemoteObject.createImmutable("          }\n"),RemoteObject.createImmutable("        });\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("      \n"),RemoteObject.createImmutable("        // Select2\n"),RemoteObject.createImmutable("        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("      });")));Debug.locals.put("str", _str);
 BA.debugLineNum = 97;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(1);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), userslogsinformation.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 100;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
userslogsinformation.__c.runVoidMethod ("LogImpl","222478873",BA.ObjectToString(userslogsinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _websocket_connected(RemoteObject __ref,RemoteObject _websocket1) throws Exception{
try {
		Debug.PushSubsStack("WebSocket_Connected (userslogsinformation) ","userslogsinformation",36,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "userslogsinformation","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 15;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(32768);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 17;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
Debug.ShouldStop(65536);
userslogsinformation._main.runVoidMethod ("_validateusers" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblusernamemain" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_divmenu" /*RemoteObject*/ )));
 BA.debugLineNum = 19;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(262144);
__ref.setField ("_sql1" /*RemoteObject*/ ,userslogsinformation._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 22;BA.debugLine="Load_Data";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.userslogsinformation.class, "_load_data" /*RemoteObject*/ );
 BA.debugLineNum = 23;BA.debugLine="Load_Datatable_Controls";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.userslogsinformation.class, "_load_datatable_controls" /*RemoteObject*/ );
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _websocket_disconnected(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("WebSocket_Disconnected (userslogsinformation) ","userslogsinformation",36,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "userslogsinformation","websocket_disconnected", __ref);}
 BA.debugLineNum = 27;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="If sql1.IsInitialized Then";
Debug.ShouldStop(134217728);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 29;BA.debugLine="sql1.Close";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}