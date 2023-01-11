package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class adjusmentinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.adjusmentinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.adjusmentinformation.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.WebSocket _ws = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divlist = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblusernamemain = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divmenu = null;
public int _intismobiledev = 0;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divismobiledev = null;
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public b4j.example.main _main = null;
public String  _checkismobilebrowser(b4j.example.adjusmentinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adjusmentinformation";
if (Debug.shouldDelegate(ba, "checkismobilebrowser", false))
	 {return ((String) Debug.delegate(ba, "checkismobilebrowser", null));}
String _str = "";
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Sub CheckIsMobileBrowser";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="Try";
try {RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="str = $\"	 if(/Android|webOS|iPhone|iPad|iPod|Bla";
_str = ("	\n"+"if(/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)){\n"+"	 \n"+"	document.getElementById(\"divismobiledev\").innerHTML = \"1\";\n"+"	\n"+"}else{\n"+"	 document.getElementById(\"divismobiledev\").innerHTML = \"0\";\n"+"}\n"+"		");
RDebugUtils.currentLine=15007757;
 //BA.debugLineNum = 15007757;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=15007759;
 //BA.debugLineNum = 15007759;BA.debugLine="IntIsMobileDev = divismobiledev.GetHtml.Value";
__ref._intismobiledev /*int*/  = (int)(BA.ObjectToNumber(__ref._divismobiledev /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetHtml().getValue()));
RDebugUtils.currentLine=15007760;
 //BA.debugLineNum = 15007760;BA.debugLine="Log(IntIsMobileDev)";
__c.LogImpl("215007760",BA.NumberToString(__ref._intismobiledev /*int*/ ),0);
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=15007762;
 //BA.debugLineNum = 15007762;BA.debugLine="Log(LastException)";
__c.LogImpl("215007762",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=15007764;
 //BA.debugLineNum = 15007764;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.adjusmentinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adjusmentinformation";
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="Private divlist As JQueryElement";
_divlist = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=14352387;
 //BA.debugLineNum = 14352387;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=14352388;
 //BA.debugLineNum = 14352388;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=14352391;
 //BA.debugLineNum = 14352391;BA.debugLine="Private IntIsMobileDev As Int";
_intismobiledev = 0;
RDebugUtils.currentLine=14352392;
 //BA.debugLineNum = 14352392;BA.debugLine="Private divismobiledev As JQueryElement";
_divismobiledev = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=14352393;
 //BA.debugLineNum = 14352393;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=14352395;
 //BA.debugLineNum = 14352395;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table(b4j.example.adjusmentinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="adjusmentinformation";
if (Debug.shouldDelegate(ba, "delete_button_table", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Private Sub Delete_button_table(params As Map)";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("214811137",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=14811141;
 //BA.debugLineNum = 14811141;BA.debugLine="sql1.ExecNonQuery(\"delete from InvoiceH where Inv";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from InvoiceH where InvoiceID="+BA.ObjectToString(_params.Get((Object)("val"))));
RDebugUtils.currentLine=14811142;
 //BA.debugLineNum = 14811142;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=14811144;
 //BA.debugLineNum = 14811144;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.reload(true)",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=14811146;
 //BA.debugLineNum = 14811146;BA.debugLine="End Sub";
return "";
}
public String  _edit_button_table(b4j.example.adjusmentinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="adjusmentinformation";
if (Debug.shouldDelegate(ba, "edit_button_table", false))
	 {return ((String) Debug.delegate(ba, "edit_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Private Sub Edit_button_table(params As Map)";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("214745601",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=14745603;
 //BA.debugLineNum = 14745603;BA.debugLine="ws.Session.SetAttribute(\"InvoiceID\",params.Get(\"v";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("InvoiceID",_params.Get((Object)("val")));
RDebugUtils.currentLine=14745605;
 //BA.debugLineNum = 14745605;BA.debugLine="ws.Eval(\"document.location.replace('AddAdjustInfo";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('AddAdjustInfo.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=14745607;
 //BA.debugLineNum = 14745607;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.adjusmentinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="adjusmentinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="End Sub";
return "";
}
public String  _load_data(b4j.example.adjusmentinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adjusmentinformation";
if (Debug.shouldDelegate(ba, "load_data", false))
	 {return ((String) Debug.delegate(ba, "load_data", null));}
String _str = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cursor = null;
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Sub Load_Data";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="Try";
try {RDebugUtils.currentLine=14614531;
 //BA.debugLineNum = 14614531;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=14614533;
 //BA.debugLineNum = 14614533;BA.debugLine="If IntIsMobileDev = 0 Then";
if (__ref._intismobiledev /*int*/ ==0) { 
RDebugUtils.currentLine=14614535;
 //BA.debugLineNum = 14614535;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Date</th>\n"+"									                  <th class=\"wd-10p\">Warehouse</th>\n"+"									                  <th class=\"wd-15p\">Total Products</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=14614547;
 //BA.debugLineNum = 14614547;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=14614548;
 //BA.debugLineNum = 14614548;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        InWareho";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT        InWarehouseH.InWarehouseHID, InWarehouseH.WarehouseID, InWarehouseH.InWarehouseDate, InWarehouseH.InWarehouseNotes, WarehouseInfo.WarehouseDesc\n"+"FROM            InWarehouseH LEFT OUTER JOIN\n"+"                         WarehouseInfo ON InWarehouseH.WarehouseID = WarehouseInfo.WarehouseID"));
RDebugUtils.currentLine=14614552;
 //BA.debugLineNum = 14614552;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=14614554;
 //BA.debugLineNum = 14614554;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=14614555;
 //BA.debugLineNum = 14614555;BA.debugLine="str = str & \"<td>\"& Cursor.GetInt(\"InWarehouseH";
_str = _str+"<td>"+BA.NumberToString(_cursor.GetInt("InWarehouseHID"))+"</td>";
RDebugUtils.currentLine=14614556;
 //BA.debugLineNum = 14614556;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"InWarehou";
_str = _str+"<td>"+_cursor.GetString("InWarehouseDate")+"</td>";
RDebugUtils.currentLine=14614557;
 //BA.debugLineNum = 14614557;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"Warehouse";
_str = _str+"<td>"+_cursor.GetString("WarehouseDesc")+"</td>";
RDebugUtils.currentLine=14614558;
 //BA.debugLineNum = 14614558;BA.debugLine="str = str & \"<td>\"& Load_Total_Products(Cursor.";
_str = _str+"<td>"+__ref._load_total_products /*String*/ (null,_cursor.GetInt("InWarehouseHID"))+"</td>";
RDebugUtils.currentLine=14614560;
 //BA.debugLineNum = 14614560;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("InWarehouseHID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "+" <a href='javascript:void(0);' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("InWarehouseHID"))+")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=14614566;
 //BA.debugLineNum = 14614566;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=14614568;
 //BA.debugLineNum = 14614568;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
 }else {
RDebugUtils.currentLine=14614572;
 //BA.debugLineNum = 14614572;BA.debugLine="str = $\" <table id='datatable1' class='table d";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=14614581;
 //BA.debugLineNum = 14614581;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=14614582;
 //BA.debugLineNum = 14614582;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        InWare";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT        InWarehouseH.InWarehouseHID, InWarehouseH.WarehouseID, InWarehouseH.InWarehouseDate, InWarehouseH.InWarehouseNotes, WarehouseInfo.WarehouseDesc\n"+"FROM            InWarehouseH LEFT OUTER JOIN\n"+"                         WarehouseInfo ON InWarehouseH.WarehouseID = WarehouseInfo.WarehouseID"));
RDebugUtils.currentLine=14614586;
 //BA.debugLineNum = 14614586;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=14614588;
 //BA.debugLineNum = 14614588;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=14614589;
 //BA.debugLineNum = 14614589;BA.debugLine="str = str & \"<td>\"& Cursor.GetInt(\"InWarehous";
_str = _str+"<td>"+BA.NumberToString(_cursor.GetInt("InWarehouseHID"))+"</td>";
RDebugUtils.currentLine=14614591;
 //BA.debugLineNum = 14614591;BA.debugLine="str = str & \"  <td style=' vertical-align: mi";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("InWarehouseHID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "+" <a href='javascript:void(0);' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("InWarehouseHID"))+")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=14614597;
 //BA.debugLineNum = 14614597;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=14614599;
 //BA.debugLineNum = 14614599;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
 };
RDebugUtils.currentLine=14614605;
 //BA.debugLineNum = 14614605;BA.debugLine="divlist.SetHtml(str)";
__ref._divlist /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
 } 
       catch (Exception e31) {
			ba.setLastException(e31);RDebugUtils.currentLine=14614609;
 //BA.debugLineNum = 14614609;BA.debugLine="Log(LastException)";
__c.LogImpl("214614609",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=14614611;
 //BA.debugLineNum = 14614611;BA.debugLine="End Sub";
return "";
}
public String  _load_total_products(b4j.example.adjusmentinformation __ref,int _inwarehousehid) throws Exception{
__ref = this;
RDebugUtils.currentModule="adjusmentinformation";
if (Debug.shouldDelegate(ba, "load_total_products", false))
	 {return ((String) Debug.delegate(ba, "load_total_products", new Object[] {_inwarehousehid}));}
int _intqty = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Sub Load_Total_Products(inwarehouseHID As Int)";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="Try";
try {RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="Dim intQty As Int = 0";
_intqty = (int) (0);
RDebugUtils.currentLine=14680067;
 //BA.debugLineNum = 14680067;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=14680068;
 //BA.debugLineNum = 14680068;BA.debugLine="rs = sql1.ExecQuery2(\"select count(InQty) as InQ";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2("select count(InQty) as InQtyTotal from InWarehouseD where InWarehouseHID=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_inwarehousehid)}));
RDebugUtils.currentLine=14680070;
 //BA.debugLineNum = 14680070;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=14680071;
 //BA.debugLineNum = 14680071;BA.debugLine="intQty = rs.GetInt(\"InQtyTotal\")";
_intqty = _rs.GetInt("InQtyTotal");
 }
;
RDebugUtils.currentLine=14680073;
 //BA.debugLineNum = 14680073;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=14680075;
 //BA.debugLineNum = 14680075;BA.debugLine="Return intQty";
if (true) return BA.NumberToString(_intqty);
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=14680078;
 //BA.debugLineNum = 14680078;BA.debugLine="Log(LastException)";
__c.LogImpl("214680078",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=14680080;
 //BA.debugLineNum = 14680080;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.adjusmentinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adjusmentinformation";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="Try";
try {RDebugUtils.currentLine=14942211;
 //BA.debugLineNum = 14942211;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"          responsive: true,\n"+"          language: {\n"+"            searchPlaceholder: 'Search...',\n"+"            sSearch: '',\n"+"            lengthMenu: '_MENU_ items/page',\n"+"          }\n"+"        });\n"+"\n"+"      \n"+"        // Select2\n"+"        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"+"\n"+"      });");
RDebugUtils.currentLine=14942230;
 //BA.debugLineNum = 14942230;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=14942233;
 //BA.debugLineNum = 14942233;BA.debugLine="Log(LastException)";
__c.LogImpl("214942233",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=14942235;
 //BA.debugLineNum = 14942235;BA.debugLine="End Sub";
return "";
}
public String  _print_table_data(b4j.example.adjusmentinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="adjusmentinformation";
if (Debug.shouldDelegate(ba, "print_table_data", false))
	 {return ((String) Debug.delegate(ba, "print_table_data", new Object[] {_params}));}
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Private Sub Print_Table_Data(params As Map)";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("214876673",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="ws.Session.SetAttribute(\"TempRID\",params.Get(\"val";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("TempRID",_params.Get((Object)("val")));
RDebugUtils.currentLine=14876677;
 //BA.debugLineNum = 14876677;BA.debugLine="ws.Eval(\"window.open('PrintInvoiceReport.html', '";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("window.open('PrintInvoiceReport.html', '_blank')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=14876679;
 //BA.debugLineNum = 14876679;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.adjusmentinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="adjusmentinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=14483460;
 //BA.debugLineNum = 14483460;BA.debugLine="ws.Session.SetAttribute(\"InvoiceID\",0)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("InvoiceID",(Object)(0));
RDebugUtils.currentLine=14483461;
 //BA.debugLineNum = 14483461;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=14483463;
 //BA.debugLineNum = 14483463;BA.debugLine="CheckIsMobileBrowser";
__ref._checkismobilebrowser /*String*/ (null);
RDebugUtils.currentLine=14483465;
 //BA.debugLineNum = 14483465;BA.debugLine="Load_Data";
__ref._load_data /*String*/ (null);
RDebugUtils.currentLine=14483466;
 //BA.debugLineNum = 14483466;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
RDebugUtils.currentLine=14483467;
 //BA.debugLineNum = 14483467;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.adjusmentinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adjusmentinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=14548996;
 //BA.debugLineNum = 14548996;BA.debugLine="End Sub";
return "";
}
}