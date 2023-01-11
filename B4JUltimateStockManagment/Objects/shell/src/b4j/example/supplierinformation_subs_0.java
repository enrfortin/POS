package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class supplierinformation_subs_0 {


public static RemoteObject  _checkismobilebrowser(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckIsMobileBrowser (supplierinformation) ","supplierinformation",33,__ref.getField(false, "ba"),__ref,179);
if (RapidSub.canDelegate("checkismobilebrowser")) { return __ref.runUserSub(false, "supplierinformation","checkismobilebrowser", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 179;BA.debugLine="Sub CheckIsMobileBrowser";
Debug.ShouldStop(262144);
 BA.debugLineNum = 180;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 181;BA.debugLine="Dim str As String";
Debug.ShouldStop(1048576);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 182;BA.debugLine="str = $\"	 if(/Android|webOS|iPhone|iPad|iPod|Bla";
Debug.ShouldStop(2097152);
_str = (RemoteObject.concat(RemoteObject.createImmutable("	\n"),RemoteObject.createImmutable("if(/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)){\n"),RemoteObject.createImmutable("	 \n"),RemoteObject.createImmutable("	document.getElementById(\"divismobiledev\").innerHTML = \"1\";\n"),RemoteObject.createImmutable("	\n"),RemoteObject.createImmutable("}else{\n"),RemoteObject.createImmutable("	 document.getElementById(\"divismobiledev\").innerHTML = \"0\";\n"),RemoteObject.createImmutable("}\n"),RemoteObject.createImmutable("		")));Debug.locals.put("str", _str);
 BA.debugLineNum = 192;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), supplierinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 194;BA.debugLine="IntIsMobileDev = divismobiledev.GetHtml.Value";
Debug.ShouldStop(2);
__ref.setField ("_intismobiledev" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_divismobiledev" /*RemoteObject*/ ).runMethod(false,"GetHtml").runMethod(false,"getValue")));
 BA.debugLineNum = 195;BA.debugLine="Log(IntIsMobileDev)";
Debug.ShouldStop(4);
supplierinformation.__c.runVoidMethod ("LogImpl","220906000",BA.NumberToString(__ref.getField(true,"_intismobiledev" /*RemoteObject*/ )),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 197;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
supplierinformation.__c.runVoidMethod ("LogImpl","220906002",BA.ObjectToString(supplierinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
supplierinformation._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",supplierinformation._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private divlist As JQueryElement";
supplierinformation._divlist = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divlist",supplierinformation._divlist);
 //BA.debugLineNum = 5;BA.debugLine="Private lblusernamemain As JQueryElement";
supplierinformation._lblusernamemain = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblusernamemain",supplierinformation._lblusernamemain);
 //BA.debugLineNum = 6;BA.debugLine="Private divMenu As JQueryElement";
supplierinformation._divmenu = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divmenu",supplierinformation._divmenu);
 //BA.debugLineNum = 10;BA.debugLine="Private IntIsMobileDev As Int";
supplierinformation._intismobiledev = RemoteObject.createImmutable(0);__ref.setField("_intismobiledev",supplierinformation._intismobiledev);
 //BA.debugLineNum = 11;BA.debugLine="Private divismobiledev As JQueryElement";
supplierinformation._divismobiledev = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divismobiledev",supplierinformation._divismobiledev);
 //BA.debugLineNum = 12;BA.debugLine="Private sql1 As SQL";
supplierinformation._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",supplierinformation._sql1);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _delete_button_table(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Delete_button_table (supplierinformation) ","supplierinformation",33,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("delete_button_table")) { return __ref.runUserSub(false, "supplierinformation","delete_button_table", __ref, _params);}
Debug.locals.put("params", _params);
 BA.debugLineNum = 138;BA.debugLine="Private Sub Delete_button_table(params As Map)";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="Log(params.Get(\"val\"))";
Debug.ShouldStop(1024);
supplierinformation.__c.runVoidMethod ("LogImpl","220774913",BA.ObjectToString(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))),0);
 BA.debugLineNum = 141;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(4096);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 143;BA.debugLine="sql1.ExecNonQuery(\"delete from SuppliersInfo wher";
Debug.ShouldStop(16384);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("delete from SuppliersInfo where SupplierID="),_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val")))))));
 BA.debugLineNum = 144;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(32768);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 146;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
Debug.ShouldStop(131072);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.reload(true)")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), supplierinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Edit_button_table (supplierinformation) ","supplierinformation",33,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("edit_button_table")) { return __ref.runUserSub(false, "supplierinformation","edit_button_table", __ref, _params);}
Debug.locals.put("params", _params);
 BA.debugLineNum = 129;BA.debugLine="Private Sub Edit_button_table(params As Map)";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="Log(params.Get(\"val\"))";
Debug.ShouldStop(2);
supplierinformation.__c.runVoidMethod ("LogImpl","220709377",BA.ObjectToString(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))),0);
 BA.debugLineNum = 132;BA.debugLine="ws.Session.SetAttribute(\"CustomerID\",params.Get(\"";
Debug.ShouldStop(8);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("CustomerID")),(Object)(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))));
 BA.debugLineNum = 134;BA.debugLine="ws.Eval(\"document.location.replace('AddSupplierIn";
Debug.ShouldStop(32);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('AddSupplierInfo.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), supplierinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Initialize (supplierinformation) ","supplierinformation",33,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "supplierinformation","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32768);
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Load_Data (supplierinformation) ","supplierinformation",33,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("load_data")) { return __ref.runUserSub(false, "supplierinformation","load_data", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
 BA.debugLineNum = 40;BA.debugLine="Sub Load_Data";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 42;BA.debugLine="Dim str As String";
Debug.ShouldStop(512);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 44;BA.debugLine="If IntIsMobileDev = 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_intismobiledev" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 46;BA.debugLine="str = $\" <table id='datatable1' class='table di";
Debug.ShouldStop(8192);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" <table id='datatable1' class='table display responsive nowrap'>\n"),RemoteObject.createImmutable("		                                    <thead class=\"thead-dark\">\n"),RemoteObject.createImmutable("		                                        <tr>\n"),RemoteObject.createImmutable("		                                              <th class=\"wd-15p\">ID</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">Supplier Name</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-20p\">Email</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">Phone</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-10p\">Country</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-25p\">City</th>\n"),RemoteObject.createImmutable("													  <th class=\"wd-25p\">Action</th>\n"),RemoteObject.createImmutable("		                                        </tr>\n"),RemoteObject.createImmutable("		                                    </thead>\n"),RemoteObject.createImmutable("		                                    <tbody> ")));Debug.locals.put("str", _str);
 BA.debugLineNum = 60;BA.debugLine="Dim Cursor As ResultSet";
Debug.ShouldStop(134217728);
_cursor = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 61;BA.debugLine="Cursor = sql1.ExecQuery(\"select * from Suppliers";
Debug.ShouldStop(268435456);
_cursor = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from SuppliersInfo")));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 63;BA.debugLine="Do While Cursor.NextRow";
Debug.ShouldStop(1073741824);
while (_cursor.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 65;BA.debugLine="str = str & \"  <tr> \"";
Debug.ShouldStop(1);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <tr> "));Debug.locals.put("str", _str);
 BA.debugLineNum = 66;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"SupplierI";
Debug.ShouldStop(2);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SupplierID"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 67;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"SupplierN";
Debug.ShouldStop(4);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SupplierName"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 68;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"SupplierE";
Debug.ShouldStop(8);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SupplierEmail"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 69;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"SupplierP";
Debug.ShouldStop(16);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SupplierPhone"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 70;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"SupplierC";
Debug.ShouldStop(32);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SupplierCountry"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 71;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"SupplierC";
Debug.ShouldStop(64);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SupplierCity"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 73;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
Debug.ShouldStop(256);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"editTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("SupplierID"))),RemoteObject.createImmutable(")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil'></i></div></a> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=\"deleteTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("SupplierID"))),RemoteObject.createImmutable(")\"></i></div></a> "),RemoteObject.createImmutable(" </td> </tr>"));Debug.locals.put("str", _str);
 }
;
 BA.debugLineNum = 79;BA.debugLine="Cursor.Close";
Debug.ShouldStop(16384);
_cursor.runVoidMethod ("Close");
 BA.debugLineNum = 81;BA.debugLine="str= str & \" </tbody> </table>\"";
Debug.ShouldStop(65536);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" </tbody> </table>"));Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 87;BA.debugLine="str = $\" <table id='datatable1' class='table d";
Debug.ShouldStop(4194304);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" <table id='datatable1' class='table display responsive nowrap'>\n"),RemoteObject.createImmutable("			                                    <thead class=\"thead-dark\">\n"),RemoteObject.createImmutable("			                                        <tr>\n"),RemoteObject.createImmutable("			                                              <th class=\"wd-15p\">ID</th>\n"),RemoteObject.createImmutable("										                  <th class=\"wd-15p\">Customer Name</th>\n"),RemoteObject.createImmutable("														  <th class=\"wd-25p\">Action</th>\n"),RemoteObject.createImmutable("			                                        </tr>\n"),RemoteObject.createImmutable("			                                    </thead>\n"),RemoteObject.createImmutable("			                                    <tbody> ")));Debug.locals.put("str", _str);
 BA.debugLineNum = 97;BA.debugLine="Dim Cursor As ResultSet";
Debug.ShouldStop(1);
_cursor = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 98;BA.debugLine="Cursor = sql1.ExecQuery(\"select * from Supplier";
Debug.ShouldStop(2);
_cursor = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from SuppliersInfo")));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 100;BA.debugLine="Do While Cursor.NextRow";
Debug.ShouldStop(8);
while (_cursor.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 102;BA.debugLine="str = str & \"  <tr> \"";
Debug.ShouldStop(32);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <tr> "));Debug.locals.put("str", _str);
 BA.debugLineNum = 103;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"Supplier";
Debug.ShouldStop(64);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SupplierID"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 104;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"Supplier";
Debug.ShouldStop(128);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SupplierName"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 106;BA.debugLine="str = str & \"  <td style=' vertical-align: mid";
Debug.ShouldStop(512);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"editTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("SupplierID"))),RemoteObject.createImmutable(")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil'></i></div></a> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=\"deleteTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("SupplierID"))),RemoteObject.createImmutable(")\"></i></div></a> "),RemoteObject.createImmutable(" </td> </tr>"));Debug.locals.put("str", _str);
 }
;
 BA.debugLineNum = 112;BA.debugLine="Cursor.Close";
Debug.ShouldStop(32768);
_cursor.runVoidMethod ("Close");
 BA.debugLineNum = 114;BA.debugLine="str= str & \" </tbody> </table>\"";
Debug.ShouldStop(131072);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" </tbody> </table>"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 121;BA.debugLine="divlist.SetHtml(str)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_divlist" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_str));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e34) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e34.toString()); BA.debugLineNum = 124;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
supplierinformation.__c.runVoidMethod ("LogImpl","220643924",BA.ObjectToString(supplierinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
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
public static RemoteObject  _load_datatable_controls(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_Datatable_Controls (supplierinformation) ","supplierinformation",33,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("load_datatable_controls")) { return __ref.runUserSub(false, "supplierinformation","load_datatable_controls", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 150;BA.debugLine="Sub Load_Datatable_Controls";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 153;BA.debugLine="Dim str As String";
Debug.ShouldStop(16777216);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 154;BA.debugLine="str = $\" $(function(){         'use strict';";
Debug.ShouldStop(33554432);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" $(function(){\n"),RemoteObject.createImmutable("        'use strict';\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("        $('#datatable1').DataTable({\n"),RemoteObject.createImmutable("          responsive: true,\n"),RemoteObject.createImmutable("          language: {\n"),RemoteObject.createImmutable("            searchPlaceholder: 'Search...',\n"),RemoteObject.createImmutable("            sSearch: '',\n"),RemoteObject.createImmutable("            lengthMenu: '_MENU_ items/page',\n"),RemoteObject.createImmutable("          }\n"),RemoteObject.createImmutable("        });\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("      \n"),RemoteObject.createImmutable("        // Select2\n"),RemoteObject.createImmutable("        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("      });")));Debug.locals.put("str", _str);
 BA.debugLineNum = 172;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(2048);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), supplierinformation.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 175;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
supplierinformation.__c.runVoidMethod ("LogImpl","220840473",BA.ObjectToString(supplierinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("WebSocket_Connected (supplierinformation) ","supplierinformation",33,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "supplierinformation","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 20;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(1048576);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 22;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
Debug.ShouldStop(2097152);
supplierinformation._main.runVoidMethod ("_validateusers" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblusernamemain" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_divmenu" /*RemoteObject*/ )));
 BA.debugLineNum = 24;BA.debugLine="ws.Session.SetAttribute(\"CustomerID\",0)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("CustomerID")),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 25;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(16777216);
__ref.setField ("_sql1" /*RemoteObject*/ ,supplierinformation._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 27;BA.debugLine="CheckIsMobileBrowser";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.supplierinformation.class, "_checkismobilebrowser" /*RemoteObject*/ );
 BA.debugLineNum = 30;BA.debugLine="Load_Data";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.supplierinformation.class, "_load_data" /*RemoteObject*/ );
 BA.debugLineNum = 31;BA.debugLine="Load_Datatable_Controls";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.supplierinformation.class, "_load_datatable_controls" /*RemoteObject*/ );
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("WebSocket_Disconnected (supplierinformation) ","supplierinformation",33,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "supplierinformation","websocket_disconnected", __ref);}
 BA.debugLineNum = 34;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="If sql1.IsInitialized Then";
Debug.ShouldStop(4);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 36;BA.debugLine="sql1.Close";
Debug.ShouldStop(8);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}