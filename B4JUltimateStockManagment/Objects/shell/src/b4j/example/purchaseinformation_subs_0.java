package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class purchaseinformation_subs_0 {


public static RemoteObject  _checkismobilebrowser(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckIsMobileBrowser (purchaseinformation) ","purchaseinformation",28,__ref.getField(false, "ba"),__ref,185);
if (RapidSub.canDelegate("checkismobilebrowser")) { return __ref.runUserSub(false, "purchaseinformation","checkismobilebrowser", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 185;BA.debugLine="Sub CheckIsMobileBrowser";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 186;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 187;BA.debugLine="Dim str As String";
Debug.ShouldStop(67108864);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 188;BA.debugLine="str = $\"	 if(/Android|webOS|iPhone|iPad|iPod|Bla";
Debug.ShouldStop(134217728);
_str = (RemoteObject.concat(RemoteObject.createImmutable("	\n"),RemoteObject.createImmutable("if(/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)){\n"),RemoteObject.createImmutable("	 \n"),RemoteObject.createImmutable("	document.getElementById(\"divismobiledev\").innerHTML = \"1\";\n"),RemoteObject.createImmutable("	\n"),RemoteObject.createImmutable("}else{\n"),RemoteObject.createImmutable("	 document.getElementById(\"divismobiledev\").innerHTML = \"0\";\n"),RemoteObject.createImmutable("}\n"),RemoteObject.createImmutable("		")));Debug.locals.put("str", _str);
 BA.debugLineNum = 198;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(32);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), purchaseinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 200;BA.debugLine="IntIsMobileDev = divismobiledev.GetHtml.Value";
Debug.ShouldStop(128);
__ref.setField ("_intismobiledev" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_divismobiledev" /*RemoteObject*/ ).runMethod(false,"GetHtml").runMethod(false,"getValue")));
 BA.debugLineNum = 201;BA.debugLine="Log(IntIsMobileDev)";
Debug.ShouldStop(256);
purchaseinformation.__c.runVoidMethod ("LogImpl","218153488",BA.NumberToString(__ref.getField(true,"_intismobiledev" /*RemoteObject*/ )),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 203;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
purchaseinformation.__c.runVoidMethod ("LogImpl","218153490",BA.ObjectToString(purchaseinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 205;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
purchaseinformation._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",purchaseinformation._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private divlist As JQueryElement";
purchaseinformation._divlist = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divlist",purchaseinformation._divlist);
 //BA.debugLineNum = 5;BA.debugLine="Private lblusernamemain As JQueryElement";
purchaseinformation._lblusernamemain = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblusernamemain",purchaseinformation._lblusernamemain);
 //BA.debugLineNum = 6;BA.debugLine="Private divMenu As JQueryElement";
purchaseinformation._divmenu = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divmenu",purchaseinformation._divmenu);
 //BA.debugLineNum = 9;BA.debugLine="Private IntIsMobileDev As Int";
purchaseinformation._intismobiledev = RemoteObject.createImmutable(0);__ref.setField("_intismobiledev",purchaseinformation._intismobiledev);
 //BA.debugLineNum = 10;BA.debugLine="Private divismobiledev As JQueryElement";
purchaseinformation._divismobiledev = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divismobiledev",purchaseinformation._divismobiledev);
 //BA.debugLineNum = 11;BA.debugLine="Private sql1 As SQL";
purchaseinformation._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",purchaseinformation._sql1);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _delete_button_table(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Delete_button_table (purchaseinformation) ","purchaseinformation",28,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("delete_button_table")) { return __ref.runUserSub(false, "purchaseinformation","delete_button_table", __ref, _params);}
Debug.locals.put("params", _params);
 BA.debugLineNum = 134;BA.debugLine="Private Sub Delete_button_table(params As Map)";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="Log(params.Get(\"val\"))";
Debug.ShouldStop(64);
purchaseinformation.__c.runVoidMethod ("LogImpl","217956865",BA.ObjectToString(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))),0);
 BA.debugLineNum = 137;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(256);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 139;BA.debugLine="sql1.ExecNonQuery(\"delete from PurchaseInvoiceH w";
Debug.ShouldStop(1024);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("delete from PurchaseInvoiceH where PurchaseInvoiceHID="),_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val")))))));
 BA.debugLineNum = 140;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(2048);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 142;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
Debug.ShouldStop(8192);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.reload(true)")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), purchaseinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Edit_button_table (purchaseinformation) ","purchaseinformation",28,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("edit_button_table")) { return __ref.runUserSub(false, "purchaseinformation","edit_button_table", __ref, _params);}
Debug.locals.put("params", _params);
 BA.debugLineNum = 125;BA.debugLine="Private Sub Edit_button_table(params As Map)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="Log(params.Get(\"val\"))";
Debug.ShouldStop(536870912);
purchaseinformation.__c.runVoidMethod ("LogImpl","217891329",BA.ObjectToString(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))),0);
 BA.debugLineNum = 128;BA.debugLine="ws.Session.SetAttribute(\"InvoiceID\",params.Get(\"v";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("InvoiceID")),(Object)(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))));
 BA.debugLineNum = 130;BA.debugLine="ws.Eval(\"document.location.replace('AddPurchaseIn";
Debug.ShouldStop(2);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('AddPurchaseInfo.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), purchaseinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Initialize (purchaseinformation) ","purchaseinformation",28,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "purchaseinformation","initialize", __ref, _ba);}
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
		Debug.PushSubsStack("Load_Data (purchaseinformation) ","purchaseinformation",28,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("load_data")) { return __ref.runUserSub(false, "purchaseinformation","load_data", __ref);}
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
_str = (RemoteObject.concat(RemoteObject.createImmutable(" <table id='datatable1' class='table display responsive nowrap'>\n"),RemoteObject.createImmutable("		                                    <thead class=\"thead-dark\">\n"),RemoteObject.createImmutable("		                                        <tr>\n"),RemoteObject.createImmutable("		                                              <th class=\"wd-15p\">ID</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">Date</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-10p\">Supplier</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">Total Invoice</th>\n"),RemoteObject.createImmutable("													  <th class=\"wd-25p\">Action</th>\n"),RemoteObject.createImmutable("		                                        </tr>\n"),RemoteObject.createImmutable("		                                    </thead>\n"),RemoteObject.createImmutable("		                                    <tbody> ")));Debug.locals.put("str", _str);
 BA.debugLineNum = 57;BA.debugLine="Dim Cursor As ResultSet";
Debug.ShouldStop(16777216);
_cursor = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 58;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        Purchase";
Debug.ShouldStop(33554432);
_cursor = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT        PurchaseInvoiceH.PurchaseInvoiceHID, PurchaseInvoiceH.InvDT, PurchaseInvoiceH.InvTotal, PurchaseInvoiceH.InvTotalTax, PurchaseInvoiceH.InvTotalDiscount, PurchaseInvoiceH.InvTotalShipping, \n"),RemoteObject.createImmutable("                         PurchaseInvoiceH.PaidAmount, PurchaseInvoiceH.StrNotes, PurchaseInvoiceH.SupplierID, SuppliersInfo.SupplierName\n"),RemoteObject.createImmutable("FROM            PurchaseInvoiceH LEFT OUTER JOIN\n"),RemoteObject.createImmutable("                         SuppliersInfo ON PurchaseInvoiceH.SupplierID = SuppliersInfo.SupplierID")))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 63;BA.debugLine="Do While Cursor.NextRow";
Debug.ShouldStop(1073741824);
while (_cursor.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 65;BA.debugLine="str = str & \"  <tr> \"";
Debug.ShouldStop(1);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <tr> "));Debug.locals.put("str", _str);
 BA.debugLineNum = 66;BA.debugLine="str = str & \"<td>\"& Cursor.GetInt(\"PurchaseInvo";
Debug.ShouldStop(2);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("PurchaseInvoiceHID"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 67;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"InvDT\") &";
Debug.ShouldStop(4);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("InvDT"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 68;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"SupplierN";
Debug.ShouldStop(8);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SupplierName"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 69;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"InvTotal\"";
Debug.ShouldStop(16);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("InvTotal"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 71;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
Debug.ShouldStop(64);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"editTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("PurchaseInvoiceHID"))),RemoteObject.createImmutable(")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"deleteTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("PurchaseInvoiceHID"))),RemoteObject.createImmutable(")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "),RemoteObject.createImmutable(" </td> </tr>"));Debug.locals.put("str", _str);
 }
;
 BA.debugLineNum = 77;BA.debugLine="Cursor.Close";
Debug.ShouldStop(4096);
_cursor.runVoidMethod ("Close");
 BA.debugLineNum = 79;BA.debugLine="str= str & \" </tbody> </table>\"";
Debug.ShouldStop(16384);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" </tbody> </table>"));Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 83;BA.debugLine="str = $\" <table id='datatable1' class='table d";
Debug.ShouldStop(262144);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" <table id='datatable1' class='table display responsive nowrap'>\n"),RemoteObject.createImmutable("		                                    <thead class=\"thead-dark\">\n"),RemoteObject.createImmutable("		                                        <tr>\n"),RemoteObject.createImmutable("		                                              <th class=\"wd-15p\">ID</th>\n"),RemoteObject.createImmutable("													  <th class=\"wd-25p\">Action</th>\n"),RemoteObject.createImmutable("		                                        </tr>\n"),RemoteObject.createImmutable("		                                    </thead>\n"),RemoteObject.createImmutable("		                                    <tbody> ")));Debug.locals.put("str", _str);
 BA.debugLineNum = 92;BA.debugLine="Dim Cursor As ResultSet";
Debug.ShouldStop(134217728);
_cursor = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 93;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        Purcha";
Debug.ShouldStop(268435456);
_cursor = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT        PurchaseInvoiceH.PurchaseInvoiceHID, PurchaseInvoiceH.InvDT, PurchaseInvoiceH.InvTotal, PurchaseInvoiceH.InvTotalTax, PurchaseInvoiceH.InvTotalDiscount, PurchaseInvoiceH.InvTotalShipping, \n"),RemoteObject.createImmutable("                         PurchaseInvoiceH.PaidAmount, PurchaseInvoiceH.StrNotes, PurchaseInvoiceH.SupplierID, SuppliersInfo.SupplierName\n"),RemoteObject.createImmutable("FROM            PurchaseInvoiceH LEFT OUTER JOIN\n"),RemoteObject.createImmutable("                         SuppliersInfo ON PurchaseInvoiceH.SupplierID = SuppliersInfo.SupplierID")))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 98;BA.debugLine="Do While Cursor.NextRow";
Debug.ShouldStop(2);
while (_cursor.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 100;BA.debugLine="str = str & \"  <tr> \"";
Debug.ShouldStop(8);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <tr> "));Debug.locals.put("str", _str);
 BA.debugLineNum = 101;BA.debugLine="str = str & \"<td>\"& Cursor.GetInt(\"PurchaseIn";
Debug.ShouldStop(16);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("PurchaseInvoiceHID"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 103;BA.debugLine="str = str & \"  <td style=' vertical-align: mi";
Debug.ShouldStop(64);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"editTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("PurchaseInvoiceHID"))),RemoteObject.createImmutable(")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"deleteTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("PurchaseInvoiceHID"))),RemoteObject.createImmutable(")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "),RemoteObject.createImmutable(" </td> </tr>"));Debug.locals.put("str", _str);
 }
;
 BA.debugLineNum = 109;BA.debugLine="Cursor.Close";
Debug.ShouldStop(4096);
_cursor.runVoidMethod ("Close");
 BA.debugLineNum = 111;BA.debugLine="str= str & \" </tbody> </table>\"";
Debug.ShouldStop(16384);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" </tbody> </table>"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 117;BA.debugLine="divlist.SetHtml(str)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_divlist" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_str));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e31) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e31.toString()); BA.debugLineNum = 121;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
purchaseinformation.__c.runVoidMethod ("LogImpl","217825875",BA.ObjectToString(purchaseinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Load_Datatable_Controls (purchaseinformation) ","purchaseinformation",28,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("load_datatable_controls")) { return __ref.runUserSub(false, "purchaseinformation","load_datatable_controls", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 155;BA.debugLine="Sub Load_Datatable_Controls";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 158;BA.debugLine="Dim str As String";
Debug.ShouldStop(536870912);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 159;BA.debugLine="str = $\" $(function(){         'use strict';";
Debug.ShouldStop(1073741824);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" $(function(){\n"),RemoteObject.createImmutable("        'use strict';\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("        $('#datatable1').DataTable({\n"),RemoteObject.createImmutable("          responsive: true,\n"),RemoteObject.createImmutable("          language: {\n"),RemoteObject.createImmutable("            searchPlaceholder: 'Search...',\n"),RemoteObject.createImmutable("            sSearch: '',\n"),RemoteObject.createImmutable("            lengthMenu: '_MENU_ items/page',\n"),RemoteObject.createImmutable("          }\n"),RemoteObject.createImmutable("        });\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("      \n"),RemoteObject.createImmutable("        // Select2\n"),RemoteObject.createImmutable("        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("      });")));Debug.locals.put("str", _str);
 BA.debugLineNum = 177;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(65536);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), purchaseinformation.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 180;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
purchaseinformation.__c.runVoidMethod ("LogImpl","218087961",BA.ObjectToString(purchaseinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Print_Table_Data (purchaseinformation) ","purchaseinformation",28,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("print_table_data")) { return __ref.runUserSub(false, "purchaseinformation","print_table_data", __ref, _params);}
Debug.locals.put("params", _params);
 BA.debugLineNum = 146;BA.debugLine="Private Sub Print_Table_Data(params As Map)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="Log(params.Get(\"val\"))";
Debug.ShouldStop(262144);
purchaseinformation.__c.runVoidMethod ("LogImpl","218022401",BA.ObjectToString(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))),0);
 BA.debugLineNum = 149;BA.debugLine="ws.Session.SetAttribute(\"TempRID\",params.Get(\"val";
Debug.ShouldStop(1048576);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("TempRID")),(Object)(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))));
 BA.debugLineNum = 151;BA.debugLine="ws.Eval(\"window.open('PrintInvoiceReport.html', '";
Debug.ShouldStop(4194304);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("window.open('PrintInvoiceReport.html', '_blank')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), purchaseinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("WebSocket_Connected (purchaseinformation) ","purchaseinformation",28,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "purchaseinformation","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 19;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(524288);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 21;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
Debug.ShouldStop(1048576);
purchaseinformation._main.runVoidMethod ("_validateusers" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblusernamemain" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_divmenu" /*RemoteObject*/ )));
 BA.debugLineNum = 23;BA.debugLine="ws.Session.SetAttribute(\"InvoiceID\",0)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("InvoiceID")),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 24;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(8388608);
__ref.setField ("_sql1" /*RemoteObject*/ ,purchaseinformation._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 26;BA.debugLine="CheckIsMobileBrowser";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.purchaseinformation.class, "_checkismobilebrowser" /*RemoteObject*/ );
 BA.debugLineNum = 28;BA.debugLine="Load_Data";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.purchaseinformation.class, "_load_data" /*RemoteObject*/ );
 BA.debugLineNum = 29;BA.debugLine="Load_Datatable_Controls";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.purchaseinformation.class, "_load_datatable_controls" /*RemoteObject*/ );
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
		Debug.PushSubsStack("WebSocket_Disconnected (purchaseinformation) ","purchaseinformation",28,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "purchaseinformation","websocket_disconnected", __ref);}
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