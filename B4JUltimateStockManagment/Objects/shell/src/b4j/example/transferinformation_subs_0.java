package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class transferinformation_subs_0 {


public static RemoteObject  _checkismobilebrowser(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckIsMobileBrowser (transferinformation) ","transferinformation",34,__ref.getField(false, "ba"),__ref,189);
if (RapidSub.canDelegate("checkismobilebrowser")) { return __ref.runUserSub(false, "transferinformation","checkismobilebrowser", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 189;BA.debugLine="Sub CheckIsMobileBrowser";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 190;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 191;BA.debugLine="Dim str As String";
Debug.ShouldStop(1073741824);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 192;BA.debugLine="str = $\"	 if(/Android|webOS|iPhone|iPad|iPod|Bla";
Debug.ShouldStop(-2147483648);
_str = (RemoteObject.concat(RemoteObject.createImmutable("	\n"),RemoteObject.createImmutable("if(/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)){\n"),RemoteObject.createImmutable("	 \n"),RemoteObject.createImmutable("	document.getElementById(\"divismobiledev\").innerHTML = \"1\";\n"),RemoteObject.createImmutable("	\n"),RemoteObject.createImmutable("}else{\n"),RemoteObject.createImmutable("	 document.getElementById(\"divismobiledev\").innerHTML = \"0\";\n"),RemoteObject.createImmutable("}\n"),RemoteObject.createImmutable("		")));Debug.locals.put("str", _str);
 BA.debugLineNum = 202;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(512);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), transferinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 204;BA.debugLine="IntIsMobileDev = divismobiledev.GetHtml.Value";
Debug.ShouldStop(2048);
__ref.setField ("_intismobiledev" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_divismobiledev" /*RemoteObject*/ ).runMethod(false,"GetHtml").runMethod(false,"getValue")));
 BA.debugLineNum = 205;BA.debugLine="Log(IntIsMobileDev)";
Debug.ShouldStop(4096);
transferinformation.__c.runVoidMethod ("LogImpl","221561360",BA.NumberToString(__ref.getField(true,"_intismobiledev" /*RemoteObject*/ )),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 207;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
transferinformation.__c.runVoidMethod ("LogImpl","221561362",BA.ObjectToString(transferinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
transferinformation._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",transferinformation._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private divlist As JQueryElement";
transferinformation._divlist = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divlist",transferinformation._divlist);
 //BA.debugLineNum = 5;BA.debugLine="Private lblusernamemain As JQueryElement";
transferinformation._lblusernamemain = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblusernamemain",transferinformation._lblusernamemain);
 //BA.debugLineNum = 6;BA.debugLine="Private divMenu As JQueryElement";
transferinformation._divmenu = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divmenu",transferinformation._divmenu);
 //BA.debugLineNum = 9;BA.debugLine="Private IntIsMobileDev As Int";
transferinformation._intismobiledev = RemoteObject.createImmutable(0);__ref.setField("_intismobiledev",transferinformation._intismobiledev);
 //BA.debugLineNum = 10;BA.debugLine="Private divismobiledev As JQueryElement";
transferinformation._divismobiledev = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divismobiledev",transferinformation._divismobiledev);
 //BA.debugLineNum = 11;BA.debugLine="Private sql1 As SQL";
transferinformation._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",transferinformation._sql1);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _delete_button_table(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Delete_button_table (transferinformation) ","transferinformation",34,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("delete_button_table")) { return __ref.runUserSub(false, "transferinformation","delete_button_table", __ref, _params);}
Debug.locals.put("params", _params);
 BA.debugLineNum = 138;BA.debugLine="Private Sub Delete_button_table(params As Map)";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="Log(params.Get(\"val\"))";
Debug.ShouldStop(1024);
transferinformation.__c.runVoidMethod ("LogImpl","221364737",BA.ObjectToString(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))),0);
 BA.debugLineNum = 141;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(4096);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 143;BA.debugLine="sql1.ExecNonQuery(\"delete from InvoiceH where Inv";
Debug.ShouldStop(16384);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("delete from InvoiceH where InvoiceID="),_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val")))))));
 BA.debugLineNum = 144;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(32768);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 146;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
Debug.ShouldStop(131072);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.reload(true)")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), transferinformation.__c.getField(false,"Null")));
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
		Debug.PushSubsStack("Edit_button_table (transferinformation) ","transferinformation",34,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("edit_button_table")) { return __ref.runUserSub(false, "transferinformation","edit_button_table", __ref, _params);}
Debug.locals.put("params", _params);
 BA.debugLineNum = 129;BA.debugLine="Private Sub Edit_button_table(params As Map)";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="Log(params.Get(\"val\"))";
Debug.ShouldStop(2);
transferinformation.__c.runVoidMethod ("LogImpl","221299201",BA.ObjectToString(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))),0);
 BA.debugLineNum = 132;BA.debugLine="ws.Session.SetAttribute(\"InvoiceID\",params.Get(\"v";
Debug.ShouldStop(8);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("InvoiceID")),(Object)(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))));
 BA.debugLineNum = 134;BA.debugLine="ws.Eval(\"document.location.replace('AddTransferIn";
Debug.ShouldStop(32);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('AddTransferInfo.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), transferinformation.__c.getField(false,"Null")));
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
		Debug.PushSubsStack("Initialize (transferinformation) ","transferinformation",34,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "transferinformation","initialize", __ref, _ba);}
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
		Debug.PushSubsStack("Load_Data (transferinformation) ","transferinformation",34,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("load_data")) { return __ref.runUserSub(false, "transferinformation","load_data", __ref);}
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
_str = (RemoteObject.concat(RemoteObject.createImmutable(" <table id='datatable1' class='table display responsive nowrap'>\n"),RemoteObject.createImmutable("		                                    <thead class=\"thead-dark\">\n"),RemoteObject.createImmutable("		                                        <tr>\n"),RemoteObject.createImmutable("		                                              <th class=\"wd-15p\">ID</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">Date</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-10p\">From Warehouse</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-10p\">To Warehouse</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">Total Invoice</th>\n"),RemoteObject.createImmutable("													  <th class=\"wd-25p\">Action</th>\n"),RemoteObject.createImmutable("		                                        </tr>\n"),RemoteObject.createImmutable("		                                    </thead>\n"),RemoteObject.createImmutable("		                                    <tbody> ")));Debug.locals.put("str", _str);
 BA.debugLineNum = 58;BA.debugLine="Dim Cursor As ResultSet";
Debug.ShouldStop(33554432);
_cursor = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 59;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        Transfer";
Debug.ShouldStop(67108864);
_cursor = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT        TransferH.TransferHID, TransferH.InvDT, TransferH.InvTotal, TransferH.FromWarehouseID, TransferH.InvTotalTax, TransferH.InvTotalDiscount, TransferH.InvTotalShipping, TransferH.PaidAmount, \n"),RemoteObject.createImmutable("                         TransferH.StrNotes, TransferH.PaymenttypeID, TransferH.ToWarehouseID, WarehouseInfo_1.WarehouseDesc as ToWarehouseDesc, WarehouseInfo.WarehouseDesc as FromWarehouseDesc\n"),RemoteObject.createImmutable("FROM            TransferH LEFT OUTER JOIN\n"),RemoteObject.createImmutable("                         WarehouseInfo AS WarehouseInfo_1 ON TransferH.ToWarehouseID = WarehouseInfo_1.WarehouseID LEFT OUTER JOIN\n"),RemoteObject.createImmutable("                         WarehouseInfo ON TransferH.FromWarehouseID = WarehouseInfo.WarehouseID")))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 65;BA.debugLine="Do While Cursor.NextRow";
Debug.ShouldStop(1);
while (_cursor.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 67;BA.debugLine="str = str & \"  <tr> \"";
Debug.ShouldStop(4);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <tr> "));Debug.locals.put("str", _str);
 BA.debugLineNum = 68;BA.debugLine="str = str & \"<td>\"& Cursor.GetInt(\"TransferHID\"";
Debug.ShouldStop(8);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("TransferHID"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 69;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"InvDT\") &";
Debug.ShouldStop(16);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("InvDT"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 70;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ToWarehou";
Debug.ShouldStop(32);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ToWarehouseDesc"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 71;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"FromWareh";
Debug.ShouldStop(64);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FromWarehouseDesc"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 72;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"InvTotal\"";
Debug.ShouldStop(128);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("InvTotal"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 74;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
Debug.ShouldStop(512);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"editTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("TransferHID"))),RemoteObject.createImmutable(")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"deleteTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("TransferHID"))),RemoteObject.createImmutable(")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "),RemoteObject.createImmutable(" </td> </tr>"));Debug.locals.put("str", _str);
 }
;
 BA.debugLineNum = 80;BA.debugLine="Cursor.Close";
Debug.ShouldStop(32768);
_cursor.runVoidMethod ("Close");
 BA.debugLineNum = 82;BA.debugLine="str= str & \" </tbody> </table>\"";
Debug.ShouldStop(131072);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" </tbody> </table>"));Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 86;BA.debugLine="str = $\" <table id='datatable1' class='table d";
Debug.ShouldStop(2097152);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" <table id='datatable1' class='table display responsive nowrap'>\n"),RemoteObject.createImmutable("		                                    <thead class=\"thead-dark\">\n"),RemoteObject.createImmutable("		                                        <tr>\n"),RemoteObject.createImmutable("		                                              <th class=\"wd-15p\">ID</th>\n"),RemoteObject.createImmutable("													  <th class=\"wd-25p\">Action</th>\n"),RemoteObject.createImmutable("		                                        </tr>\n"),RemoteObject.createImmutable("		                                    </thead>\n"),RemoteObject.createImmutable("		                                    <tbody> ")));Debug.locals.put("str", _str);
 BA.debugLineNum = 95;BA.debugLine="Dim Cursor As ResultSet";
Debug.ShouldStop(1073741824);
_cursor = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 96;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        Transf";
Debug.ShouldStop(-2147483648);
_cursor = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT        TransferH.TransferHID, TransferH.InvDT, TransferH.InvTotal, TransferH.FromWarehouseID, TransferH.InvTotalTax, TransferH.InvTotalDiscount, TransferH.InvTotalShipping, TransferH.PaidAmount, \n"),RemoteObject.createImmutable("                         TransferH.StrNotes, TransferH.PaymenttypeID, TransferH.ToWarehouseID, WarehouseInfo_1.WarehouseDesc as ToWarehouseDesc, WarehouseInfo.WarehouseDesc as FromWarehouseDesc\n"),RemoteObject.createImmutable("FROM            TransferH LEFT OUTER JOIN\n"),RemoteObject.createImmutable("                         WarehouseInfo AS WarehouseInfo_1 ON TransferH.ToWarehouseID = WarehouseInfo_1.WarehouseID LEFT OUTER JOIN\n"),RemoteObject.createImmutable("                         WarehouseInfo ON TransferH.FromWarehouseID = WarehouseInfo.WarehouseID")))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 102;BA.debugLine="Do While Cursor.NextRow";
Debug.ShouldStop(32);
while (_cursor.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 104;BA.debugLine="str = str & \"  <tr> \"";
Debug.ShouldStop(128);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <tr> "));Debug.locals.put("str", _str);
 BA.debugLineNum = 105;BA.debugLine="str = str & \"<td>\"& Cursor.GetInt(\"TransferHI";
Debug.ShouldStop(256);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("TransferHID"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 107;BA.debugLine="str = str & \"  <td style=' vertical-align: mi";
Debug.ShouldStop(1024);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"editTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("TransferHID"))),RemoteObject.createImmutable(")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"deleteTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("TransferHID"))),RemoteObject.createImmutable(")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "),RemoteObject.createImmutable(" </td> </tr>"));Debug.locals.put("str", _str);
 }
;
 BA.debugLineNum = 113;BA.debugLine="Cursor.Close";
Debug.ShouldStop(65536);
_cursor.runVoidMethod ("Close");
 BA.debugLineNum = 115;BA.debugLine="str= str & \" </tbody> </table>\"";
Debug.ShouldStop(262144);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" </tbody> </table>"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 121;BA.debugLine="divlist.SetHtml(str)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_divlist" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_str));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e32) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e32.toString()); BA.debugLineNum = 125;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
transferinformation.__c.runVoidMethod ("LogImpl","221233751",BA.ObjectToString(transferinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Load_Datatable_Controls (transferinformation) ","transferinformation",34,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("load_datatable_controls")) { return __ref.runUserSub(false, "transferinformation","load_datatable_controls", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 159;BA.debugLine="Sub Load_Datatable_Controls";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 160;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 162;BA.debugLine="Dim str As String";
Debug.ShouldStop(2);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 163;BA.debugLine="str = $\" $(function(){         'use strict';";
Debug.ShouldStop(4);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" $(function(){\n"),RemoteObject.createImmutable("        'use strict';\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("        $('#datatable1').DataTable({\n"),RemoteObject.createImmutable("          responsive: true,\n"),RemoteObject.createImmutable("          language: {\n"),RemoteObject.createImmutable("            searchPlaceholder: 'Search...',\n"),RemoteObject.createImmutable("            sSearch: '',\n"),RemoteObject.createImmutable("            lengthMenu: '_MENU_ items/page',\n"),RemoteObject.createImmutable("          }\n"),RemoteObject.createImmutable("        });\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("      \n"),RemoteObject.createImmutable("        // Select2\n"),RemoteObject.createImmutable("        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("      });")));Debug.locals.put("str", _str);
 BA.debugLineNum = 181;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), transferinformation.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 184;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
transferinformation.__c.runVoidMethod ("LogImpl","221495833",BA.ObjectToString(transferinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Print_Table_Data (transferinformation) ","transferinformation",34,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("print_table_data")) { return __ref.runUserSub(false, "transferinformation","print_table_data", __ref, _params);}
Debug.locals.put("params", _params);
 BA.debugLineNum = 150;BA.debugLine="Private Sub Print_Table_Data(params As Map)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="Log(params.Get(\"val\"))";
Debug.ShouldStop(4194304);
transferinformation.__c.runVoidMethod ("LogImpl","221430273",BA.ObjectToString(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))),0);
 BA.debugLineNum = 153;BA.debugLine="ws.Session.SetAttribute(\"TempRID\",params.Get(\"val";
Debug.ShouldStop(16777216);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("TempRID")),(Object)(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))));
 BA.debugLineNum = 155;BA.debugLine="ws.Eval(\"window.open('PrintInvoiceReport.html', '";
Debug.ShouldStop(67108864);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("window.open('PrintInvoiceReport.html', '_blank')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), transferinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("WebSocket_Connected (transferinformation) ","transferinformation",34,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "transferinformation","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 19;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(524288);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 21;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
Debug.ShouldStop(1048576);
transferinformation._main.runVoidMethod ("_validateusers" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblusernamemain" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_divmenu" /*RemoteObject*/ )));
 BA.debugLineNum = 23;BA.debugLine="ws.Session.SetAttribute(\"InvoiceID\",0)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("InvoiceID")),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 24;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(8388608);
__ref.setField ("_sql1" /*RemoteObject*/ ,transferinformation._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 26;BA.debugLine="CheckIsMobileBrowser";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.transferinformation.class, "_checkismobilebrowser" /*RemoteObject*/ );
 BA.debugLineNum = 28;BA.debugLine="Load_Data";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.transferinformation.class, "_load_data" /*RemoteObject*/ );
 BA.debugLineNum = 29;BA.debugLine="Load_Datatable_Controls";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.transferinformation.class, "_load_datatable_controls" /*RemoteObject*/ );
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
		Debug.PushSubsStack("WebSocket_Disconnected (transferinformation) ","transferinformation",34,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "transferinformation","websocket_disconnected", __ref);}
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