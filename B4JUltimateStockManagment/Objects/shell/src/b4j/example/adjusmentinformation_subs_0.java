package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class adjusmentinformation_subs_0 {


public static RemoteObject  _checkismobilebrowser(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckIsMobileBrowser (adjusmentinformation) ","adjusmentinformation",21,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("checkismobilebrowser")) { return __ref.runUserSub(false, "adjusmentinformation","checkismobilebrowser", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 202;BA.debugLine="Sub CheckIsMobileBrowser";
Debug.ShouldStop(512);
 BA.debugLineNum = 203;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 204;BA.debugLine="Dim str As String";
Debug.ShouldStop(2048);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 205;BA.debugLine="str = $\"	 if(/Android|webOS|iPhone|iPad|iPod|Bla";
Debug.ShouldStop(4096);
_str = (RemoteObject.concat(RemoteObject.createImmutable("	\n"),RemoteObject.createImmutable("if(/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)){\n"),RemoteObject.createImmutable("	 \n"),RemoteObject.createImmutable("	document.getElementById(\"divismobiledev\").innerHTML = \"1\";\n"),RemoteObject.createImmutable("	\n"),RemoteObject.createImmutable("}else{\n"),RemoteObject.createImmutable("	 document.getElementById(\"divismobiledev\").innerHTML = \"0\";\n"),RemoteObject.createImmutable("}\n"),RemoteObject.createImmutable("		")));Debug.locals.put("str", _str);
 BA.debugLineNum = 215;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), adjusmentinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 217;BA.debugLine="IntIsMobileDev = divismobiledev.GetHtml.Value";
Debug.ShouldStop(16777216);
__ref.setField ("_intismobiledev" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_divismobiledev" /*RemoteObject*/ ).runMethod(false,"GetHtml").runMethod(false,"getValue")));
 BA.debugLineNum = 218;BA.debugLine="Log(IntIsMobileDev)";
Debug.ShouldStop(33554432);
adjusmentinformation.__c.runVoidMethod ("LogImpl","215007760",BA.NumberToString(__ref.getField(true,"_intismobiledev" /*RemoteObject*/ )),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 220;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
adjusmentinformation.__c.runVoidMethod ("LogImpl","215007762",BA.ObjectToString(adjusmentinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
adjusmentinformation._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",adjusmentinformation._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private divlist As JQueryElement";
adjusmentinformation._divlist = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divlist",adjusmentinformation._divlist);
 //BA.debugLineNum = 5;BA.debugLine="Private lblusernamemain As JQueryElement";
adjusmentinformation._lblusernamemain = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblusernamemain",adjusmentinformation._lblusernamemain);
 //BA.debugLineNum = 6;BA.debugLine="Private divMenu As JQueryElement";
adjusmentinformation._divmenu = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divmenu",adjusmentinformation._divmenu);
 //BA.debugLineNum = 9;BA.debugLine="Private IntIsMobileDev As Int";
adjusmentinformation._intismobiledev = RemoteObject.createImmutable(0);__ref.setField("_intismobiledev",adjusmentinformation._intismobiledev);
 //BA.debugLineNum = 10;BA.debugLine="Private divismobiledev As JQueryElement";
adjusmentinformation._divismobiledev = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divismobiledev",adjusmentinformation._divismobiledev);
 //BA.debugLineNum = 11;BA.debugLine="Private sql1 As SQL";
adjusmentinformation._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",adjusmentinformation._sql1);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _delete_button_table(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Delete_button_table (adjusmentinformation) ","adjusmentinformation",21,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("delete_button_table")) { return __ref.runUserSub(false, "adjusmentinformation","delete_button_table", __ref, _params);}
Debug.locals.put("params", _params);
 BA.debugLineNum = 151;BA.debugLine="Private Sub Delete_button_table(params As Map)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="Log(params.Get(\"val\"))";
Debug.ShouldStop(8388608);
adjusmentinformation.__c.runVoidMethod ("LogImpl","214811137",BA.ObjectToString(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))),0);
 BA.debugLineNum = 154;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 156;BA.debugLine="sql1.ExecNonQuery(\"delete from InvoiceH where Inv";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("delete from InvoiceH where InvoiceID="),_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val")))))));
 BA.debugLineNum = 157;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 159;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.reload(true)")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), adjusmentinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Edit_button_table (adjusmentinformation) ","adjusmentinformation",21,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("edit_button_table")) { return __ref.runUserSub(false, "adjusmentinformation","edit_button_table", __ref, _params);}
Debug.locals.put("params", _params);
 BA.debugLineNum = 142;BA.debugLine="Private Sub Edit_button_table(params As Map)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="Log(params.Get(\"val\"))";
Debug.ShouldStop(16384);
adjusmentinformation.__c.runVoidMethod ("LogImpl","214745601",BA.ObjectToString(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))),0);
 BA.debugLineNum = 145;BA.debugLine="ws.Session.SetAttribute(\"InvoiceID\",params.Get(\"v";
Debug.ShouldStop(65536);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("InvoiceID")),(Object)(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))));
 BA.debugLineNum = 147;BA.debugLine="ws.Eval(\"document.location.replace('AddAdjustInfo";
Debug.ShouldStop(262144);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('AddAdjustInfo.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), adjusmentinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 149;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (adjusmentinformation) ","adjusmentinformation",21,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "adjusmentinformation","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16384);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Load_Data (adjusmentinformation) ","adjusmentinformation",21,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("load_data")) { return __ref.runUserSub(false, "adjusmentinformation","load_data", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
 BA.debugLineNum = 38;BA.debugLine="Sub Load_Data";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 41;BA.debugLine="Dim str As String";
Debug.ShouldStop(256);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 43;BA.debugLine="If IntIsMobileDev = 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_intismobiledev" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 45;BA.debugLine="str = $\" <table id='datatable1' class='table di";
Debug.ShouldStop(4096);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" <table id='datatable1' class='table display responsive nowrap'>\n"),RemoteObject.createImmutable("		                                    <thead class=\"thead-dark\">\n"),RemoteObject.createImmutable("		                                        <tr>\n"),RemoteObject.createImmutable("		                                              <th class=\"wd-15p\">ID</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">Date</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-10p\">Warehouse</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">Total Products</th>\n"),RemoteObject.createImmutable("													  <th class=\"wd-25p\">Action</th>\n"),RemoteObject.createImmutable("		                                        </tr>\n"),RemoteObject.createImmutable("		                                    </thead>\n"),RemoteObject.createImmutable("		                                    <tbody> ")));Debug.locals.put("str", _str);
 BA.debugLineNum = 57;BA.debugLine="Dim Cursor As ResultSet";
Debug.ShouldStop(16777216);
_cursor = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 58;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        InWareho";
Debug.ShouldStop(33554432);
_cursor = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT        InWarehouseH.InWarehouseHID, InWarehouseH.WarehouseID, InWarehouseH.InWarehouseDate, InWarehouseH.InWarehouseNotes, WarehouseInfo.WarehouseDesc\n"),RemoteObject.createImmutable("FROM            InWarehouseH LEFT OUTER JOIN\n"),RemoteObject.createImmutable("                         WarehouseInfo ON InWarehouseH.WarehouseID = WarehouseInfo.WarehouseID")))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 62;BA.debugLine="Do While Cursor.NextRow";
Debug.ShouldStop(536870912);
while (_cursor.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 64;BA.debugLine="str = str & \"  <tr> \"";
Debug.ShouldStop(-2147483648);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <tr> "));Debug.locals.put("str", _str);
 BA.debugLineNum = 65;BA.debugLine="str = str & \"<td>\"& Cursor.GetInt(\"InWarehouseH";
Debug.ShouldStop(1);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("InWarehouseHID"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 66;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"InWarehou";
Debug.ShouldStop(2);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("InWarehouseDate"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 67;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"Warehouse";
Debug.ShouldStop(4);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("WarehouseDesc"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 68;BA.debugLine="str = str & \"<td>\"& Load_Total_Products(Cursor.";
Debug.ShouldStop(8);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),__ref.runClassMethod (b4j.example.adjusmentinformation.class, "_load_total_products" /*RemoteObject*/ ,(Object)(_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("InWarehouseHID"))))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 70;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
Debug.ShouldStop(32);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"editTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("InWarehouseHID"))),RemoteObject.createImmutable(")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"deleteTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("InWarehouseHID"))),RemoteObject.createImmutable(")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "),RemoteObject.createImmutable(" </td> </tr>"));Debug.locals.put("str", _str);
 }
;
 BA.debugLineNum = 76;BA.debugLine="Cursor.Close";
Debug.ShouldStop(2048);
_cursor.runVoidMethod ("Close");
 BA.debugLineNum = 78;BA.debugLine="str= str & \" </tbody> </table>\"";
Debug.ShouldStop(8192);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" </tbody> </table>"));Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 82;BA.debugLine="str = $\" <table id='datatable1' class='table d";
Debug.ShouldStop(131072);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" <table id='datatable1' class='table display responsive nowrap'>\n"),RemoteObject.createImmutable("		                                    <thead class=\"thead-dark\">\n"),RemoteObject.createImmutable("		                                        <tr>\n"),RemoteObject.createImmutable("		                                              <th class=\"wd-15p\">ID</th>\n"),RemoteObject.createImmutable("													  <th class=\"wd-25p\">Action</th>\n"),RemoteObject.createImmutable("		                                        </tr>\n"),RemoteObject.createImmutable("		                                    </thead>\n"),RemoteObject.createImmutable("		                                    <tbody> ")));Debug.locals.put("str", _str);
 BA.debugLineNum = 91;BA.debugLine="Dim Cursor As ResultSet";
Debug.ShouldStop(67108864);
_cursor = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 92;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        InWare";
Debug.ShouldStop(134217728);
_cursor = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT        InWarehouseH.InWarehouseHID, InWarehouseH.WarehouseID, InWarehouseH.InWarehouseDate, InWarehouseH.InWarehouseNotes, WarehouseInfo.WarehouseDesc\n"),RemoteObject.createImmutable("FROM            InWarehouseH LEFT OUTER JOIN\n"),RemoteObject.createImmutable("                         WarehouseInfo ON InWarehouseH.WarehouseID = WarehouseInfo.WarehouseID")))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 96;BA.debugLine="Do While Cursor.NextRow";
Debug.ShouldStop(-2147483648);
while (_cursor.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 98;BA.debugLine="str = str & \"  <tr> \"";
Debug.ShouldStop(2);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <tr> "));Debug.locals.put("str", _str);
 BA.debugLineNum = 99;BA.debugLine="str = str & \"<td>\"& Cursor.GetInt(\"InWarehous";
Debug.ShouldStop(4);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("InWarehouseHID"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 101;BA.debugLine="str = str & \"  <td style=' vertical-align: mi";
Debug.ShouldStop(16);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"editTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("InWarehouseHID"))),RemoteObject.createImmutable(")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"deleteTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("InWarehouseHID"))),RemoteObject.createImmutable(")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "),RemoteObject.createImmutable(" </td> </tr>"));Debug.locals.put("str", _str);
 }
;
 BA.debugLineNum = 107;BA.debugLine="Cursor.Close";
Debug.ShouldStop(1024);
_cursor.runVoidMethod ("Close");
 BA.debugLineNum = 109;BA.debugLine="str= str & \" </tbody> </table>\"";
Debug.ShouldStop(4096);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" </tbody> </table>"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 115;BA.debugLine="divlist.SetHtml(str)";
Debug.ShouldStop(262144);
__ref.getField(false,"_divlist" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_str));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e31) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e31.toString()); BA.debugLineNum = 119;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
adjusmentinformation.__c.runVoidMethod ("LogImpl","214614609",BA.ObjectToString(adjusmentinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Load_Datatable_Controls (adjusmentinformation) ","adjusmentinformation",21,__ref.getField(false, "ba"),__ref,172);
if (RapidSub.canDelegate("load_datatable_controls")) { return __ref.runUserSub(false, "adjusmentinformation","load_datatable_controls", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 172;BA.debugLine="Sub Load_Datatable_Controls";
Debug.ShouldStop(2048);
 BA.debugLineNum = 173;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 175;BA.debugLine="Dim str As String";
Debug.ShouldStop(16384);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 176;BA.debugLine="str = $\" $(function(){         'use strict';";
Debug.ShouldStop(32768);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" $(function(){\n"),RemoteObject.createImmutable("        'use strict';\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("        $('#datatable1').DataTable({\n"),RemoteObject.createImmutable("          responsive: true,\n"),RemoteObject.createImmutable("          language: {\n"),RemoteObject.createImmutable("            searchPlaceholder: 'Search...',\n"),RemoteObject.createImmutable("            sSearch: '',\n"),RemoteObject.createImmutable("            lengthMenu: '_MENU_ items/page',\n"),RemoteObject.createImmutable("          }\n"),RemoteObject.createImmutable("        });\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("      \n"),RemoteObject.createImmutable("        // Select2\n"),RemoteObject.createImmutable("        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("      });")));Debug.locals.put("str", _str);
 BA.debugLineNum = 194;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(2);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), adjusmentinformation.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 197;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
adjusmentinformation.__c.runVoidMethod ("LogImpl","214942233",BA.ObjectToString(adjusmentinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_total_products(RemoteObject __ref,RemoteObject _inwarehousehid) throws Exception{
try {
		Debug.PushSubsStack("Load_Total_Products (adjusmentinformation) ","adjusmentinformation",21,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("load_total_products")) { return __ref.runUserSub(false, "adjusmentinformation","load_total_products", __ref, _inwarehousehid);}
RemoteObject _intqty = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
Debug.locals.put("inwarehouseHID", _inwarehousehid);
 BA.debugLineNum = 123;BA.debugLine="Sub Load_Total_Products(inwarehouseHID As Int)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 125;BA.debugLine="Dim intQty As Int = 0";
Debug.ShouldStop(268435456);
_intqty = BA.numberCast(int.class, 0);Debug.locals.put("intQty", _intqty);Debug.locals.put("intQty", _intqty);
 BA.debugLineNum = 126;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(536870912);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 127;BA.debugLine="rs = sql1.ExecQuery2(\"select count(InQty) as InQ";
Debug.ShouldStop(1073741824);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("select count(InQty) as InQtyTotal from InWarehouseD where InWarehouseHID=?")),(Object)(adjusmentinformation.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_inwarehousehid)})))));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 129;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(1);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 130;BA.debugLine="intQty = rs.GetInt(\"InQtyTotal\")";
Debug.ShouldStop(2);
_intqty = _rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("InQtyTotal")));Debug.locals.put("intQty", _intqty);
 }
;
 BA.debugLineNum = 132;BA.debugLine="rs.Close";
Debug.ShouldStop(8);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 134;BA.debugLine="Return intQty";
Debug.ShouldStop(32);
Debug.CheckDeviceExceptions();if (true) return BA.NumberToString(_intqty);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 137;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
adjusmentinformation.__c.runVoidMethod ("LogImpl","214680078",BA.ObjectToString(adjusmentinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _print_table_data(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Print_Table_Data (adjusmentinformation) ","adjusmentinformation",21,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("print_table_data")) { return __ref.runUserSub(false, "adjusmentinformation","print_table_data", __ref, _params);}
Debug.locals.put("params", _params);
 BA.debugLineNum = 163;BA.debugLine="Private Sub Print_Table_Data(params As Map)";
Debug.ShouldStop(4);
 BA.debugLineNum = 164;BA.debugLine="Log(params.Get(\"val\"))";
Debug.ShouldStop(8);
adjusmentinformation.__c.runVoidMethod ("LogImpl","214876673",BA.ObjectToString(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))),0);
 BA.debugLineNum = 166;BA.debugLine="ws.Session.SetAttribute(\"TempRID\",params.Get(\"val";
Debug.ShouldStop(32);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("TempRID")),(Object)(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))));
 BA.debugLineNum = 168;BA.debugLine="ws.Eval(\"window.open('PrintInvoiceReport.html', '";
Debug.ShouldStop(128);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("window.open('PrintInvoiceReport.html', '_blank')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), adjusmentinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("WebSocket_Connected (adjusmentinformation) ","adjusmentinformation",21,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "adjusmentinformation","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 19;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(524288);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 21;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
Debug.ShouldStop(1048576);
adjusmentinformation._main.runVoidMethod ("_validateusers" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblusernamemain" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_divmenu" /*RemoteObject*/ )));
 BA.debugLineNum = 23;BA.debugLine="ws.Session.SetAttribute(\"InvoiceID\",0)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("InvoiceID")),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 24;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(8388608);
__ref.setField ("_sql1" /*RemoteObject*/ ,adjusmentinformation._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 26;BA.debugLine="CheckIsMobileBrowser";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.adjusmentinformation.class, "_checkismobilebrowser" /*RemoteObject*/ );
 BA.debugLineNum = 28;BA.debugLine="Load_Data";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.adjusmentinformation.class, "_load_data" /*RemoteObject*/ );
 BA.debugLineNum = 29;BA.debugLine="Load_Datatable_Controls";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.adjusmentinformation.class, "_load_datatable_controls" /*RemoteObject*/ );
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("WebSocket_Disconnected (adjusmentinformation) ","adjusmentinformation",21,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "adjusmentinformation","websocket_disconnected", __ref);}
 BA.debugLineNum = 32;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="If sql1.IsInitialized Then";
Debug.ShouldStop(1);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 34;BA.debugLine="sql1.Close";
Debug.ShouldStop(2);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}