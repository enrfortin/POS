package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class expensesinformation_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
expensesinformation._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",expensesinformation._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private divlist As JQueryElement";
expensesinformation._divlist = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divlist",expensesinformation._divlist);
 //BA.debugLineNum = 5;BA.debugLine="Private lblusernamemain As JQueryElement";
expensesinformation._lblusernamemain = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblusernamemain",expensesinformation._lblusernamemain);
 //BA.debugLineNum = 6;BA.debugLine="Private divMenu As JQueryElement";
expensesinformation._divmenu = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divmenu",expensesinformation._divmenu);
 //BA.debugLineNum = 7;BA.debugLine="Private sql1 As SQL";
expensesinformation._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",expensesinformation._sql1);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _delete_button_table(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Delete_button_table (expensesinformation) ","expensesinformation",27,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("delete_button_table")) { return __ref.runUserSub(false, "expensesinformation","delete_button_table", __ref, _params);}
Debug.locals.put("params", _params);
 BA.debugLineNum = 87;BA.debugLine="Private Sub Delete_button_table(params As Map)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 89;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 91;BA.debugLine="sql1.ExecNonQuery(\"delete from ExpensesInfo where";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("delete from ExpensesInfo where ExpensesID="),_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val")))))));
 BA.debugLineNum = 92;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 94;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.reload(true)")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), expensesinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edit_button_table(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Edit_button_table (expensesinformation) ","expensesinformation",27,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("edit_button_table")) { return __ref.runUserSub(false, "expensesinformation","edit_button_table", __ref, _params);}
Debug.locals.put("params", _params);
 BA.debugLineNum = 79;BA.debugLine="Private Sub Edit_button_table(params As Map)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 81;BA.debugLine="ws.Session.SetAttribute(\"CatID\",params.Get(\"val\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("CatID")),(Object)(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))));
 BA.debugLineNum = 83;BA.debugLine="ws.Eval(\"document.location.replace('AddExpensesIn";
Debug.ShouldStop(262144);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('AddExpensesInfo.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), expensesinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (expensesinformation) ","expensesinformation",27,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "expensesinformation","initialize", __ref, _ba);}
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
		Debug.PushSubsStack("Load_Data (expensesinformation) ","expensesinformation",27,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("load_data")) { return __ref.runUserSub(false, "expensesinformation","load_data", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
 BA.debugLineNum = 34;BA.debugLine="Sub Load_Data";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 37;BA.debugLine="Dim str As String";
Debug.ShouldStop(16);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 38;BA.debugLine="str = $\" <table id='datatable1' class='table di";
Debug.ShouldStop(32);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" <table id='datatable1' class='table display responsive nowrap'>\n"),RemoteObject.createImmutable("		                                    <thead class=\"thead-dark\">\n"),RemoteObject.createImmutable("		                                        <tr>\n"),RemoteObject.createImmutable("		                                              <th class=\"wd-15p\">ID</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">Date</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">Amount</th>\n"),RemoteObject.createImmutable("													  <th class=\"wd-25p\">Action</th>\n"),RemoteObject.createImmutable("		                                        </tr>\n"),RemoteObject.createImmutable("		                                    </thead>\n"),RemoteObject.createImmutable("		                                    <tbody> ")));Debug.locals.put("str", _str);
 BA.debugLineNum = 50;BA.debugLine="Dim Cursor As ResultSet";
Debug.ShouldStop(131072);
_cursor = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 51;BA.debugLine="Cursor = sql1.ExecQuery(\"select * from ExpensesI";
Debug.ShouldStop(262144);
_cursor = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from ExpensesInfo")));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 53;BA.debugLine="Do While Cursor.NextRow";
Debug.ShouldStop(1048576);
while (_cursor.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 55;BA.debugLine="str = str & \"  <tr> \"";
Debug.ShouldStop(4194304);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <tr> "));Debug.locals.put("str", _str);
 BA.debugLineNum = 56;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ExpensesI";
Debug.ShouldStop(8388608);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ExpensesID"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 57;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ExpensesD";
Debug.ShouldStop(16777216);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ExpensesDate"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 58;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ExpensesA";
Debug.ShouldStop(33554432);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ExpensesAmt"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 60;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
Debug.ShouldStop(134217728);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"editTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ExpensesID"))),RemoteObject.createImmutable(")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=\"deleteTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ExpensesID"))),RemoteObject.createImmutable(")\"></i></div></a> "),RemoteObject.createImmutable(" </td> </tr>"));Debug.locals.put("str", _str);
 }
;
 BA.debugLineNum = 66;BA.debugLine="Cursor.Close";
Debug.ShouldStop(2);
_cursor.runVoidMethod ("Close");
 BA.debugLineNum = 68;BA.debugLine="str= str & \" </tbody> </table>\"";
Debug.ShouldStop(8);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" </tbody> </table>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 70;BA.debugLine="divlist.SetHtml(str)";
Debug.ShouldStop(32);
__ref.getField(false,"_divlist" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_str));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e17.toString()); BA.debugLineNum = 74;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
expensesinformation.__c.runVoidMethod ("LogImpl","217301544",BA.ObjectToString(expensesinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Load_Datatable_Controls (expensesinformation) ","expensesinformation",27,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("load_datatable_controls")) { return __ref.runUserSub(false, "expensesinformation","load_datatable_controls", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 99;BA.debugLine="Sub Load_Datatable_Controls";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 102;BA.debugLine="Dim str As String";
Debug.ShouldStop(32);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 103;BA.debugLine="str = $\" $(function(){         'use strict';";
Debug.ShouldStop(64);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" $(function(){\n"),RemoteObject.createImmutable("        'use strict';\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("        $('#datatable1').DataTable({\n"),RemoteObject.createImmutable("          responsive: true,\n"),RemoteObject.createImmutable("          language: {\n"),RemoteObject.createImmutable("            searchPlaceholder: 'Search...',\n"),RemoteObject.createImmutable("            sSearch: '',\n"),RemoteObject.createImmutable("            lengthMenu: '_MENU_ items/page',\n"),RemoteObject.createImmutable("          }\n"),RemoteObject.createImmutable("        });\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("      \n"),RemoteObject.createImmutable("        // Select2\n"),RemoteObject.createImmutable("        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("      });")));Debug.locals.put("str", _str);
 BA.debugLineNum = 121;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), expensesinformation.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 124;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
expensesinformation.__c.runVoidMethod ("LogImpl","217498137",BA.ObjectToString(expensesinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("WebSocket_Connected (expensesinformation) ","expensesinformation",27,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "expensesinformation","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 15;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(32768);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 17;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
Debug.ShouldStop(65536);
expensesinformation._main.runVoidMethod ("_validateusers" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblusernamemain" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_divmenu" /*RemoteObject*/ )));
 BA.debugLineNum = 19;BA.debugLine="ws.Session.SetAttribute(\"CatID\",0)";
Debug.ShouldStop(262144);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("CatID")),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 21;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(1048576);
__ref.setField ("_sql1" /*RemoteObject*/ ,expensesinformation._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 23;BA.debugLine="Load_Data";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.expensesinformation.class, "_load_data" /*RemoteObject*/ );
 BA.debugLineNum = 25;BA.debugLine="Load_Datatable_Controls";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.expensesinformation.class, "_load_datatable_controls" /*RemoteObject*/ );
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("WebSocket_Disconnected (expensesinformation) ","expensesinformation",27,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "expensesinformation","websocket_disconnected", __ref);}
 BA.debugLineNum = 29;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="If sql1.IsInitialized Then";
Debug.ShouldStop(536870912);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 31;BA.debugLine="sql1.Close";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}