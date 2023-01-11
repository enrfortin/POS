package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class purchaseinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.purchaseinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.purchaseinformation.class).invoke(this, new Object[] {null});
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
public String  _checkismobilebrowser(b4j.example.purchaseinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="purchaseinformation";
if (Debug.shouldDelegate(ba, "checkismobilebrowser", false))
	 {return ((String) Debug.delegate(ba, "checkismobilebrowser", null));}
String _str = "";
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Sub CheckIsMobileBrowser";
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="Try";
try {RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="str = $\"	 if(/Android|webOS|iPhone|iPad|iPod|Bla";
_str = ("	\n"+"if(/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)){\n"+"	 \n"+"	document.getElementById(\"divismobiledev\").innerHTML = \"1\";\n"+"	\n"+"}else{\n"+"	 document.getElementById(\"divismobiledev\").innerHTML = \"0\";\n"+"}\n"+"		");
RDebugUtils.currentLine=18153485;
 //BA.debugLineNum = 18153485;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=18153487;
 //BA.debugLineNum = 18153487;BA.debugLine="IntIsMobileDev = divismobiledev.GetHtml.Value";
__ref._intismobiledev /*int*/  = (int)(BA.ObjectToNumber(__ref._divismobiledev /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetHtml().getValue()));
RDebugUtils.currentLine=18153488;
 //BA.debugLineNum = 18153488;BA.debugLine="Log(IntIsMobileDev)";
__c.LogImpl("218153488",BA.NumberToString(__ref._intismobiledev /*int*/ ),0);
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=18153490;
 //BA.debugLineNum = 18153490;BA.debugLine="Log(LastException)";
__c.LogImpl("218153490",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=18153492;
 //BA.debugLineNum = 18153492;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.purchaseinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="purchaseinformation";
RDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="Private divlist As JQueryElement";
_divlist = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=17563655;
 //BA.debugLineNum = 17563655;BA.debugLine="Private IntIsMobileDev As Int";
_intismobiledev = 0;
RDebugUtils.currentLine=17563656;
 //BA.debugLineNum = 17563656;BA.debugLine="Private divismobiledev As JQueryElement";
_divismobiledev = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=17563657;
 //BA.debugLineNum = 17563657;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=17563659;
 //BA.debugLineNum = 17563659;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table(b4j.example.purchaseinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="purchaseinformation";
if (Debug.shouldDelegate(ba, "delete_button_table", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Private Sub Delete_button_table(params As Map)";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("217956865",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=17956869;
 //BA.debugLineNum = 17956869;BA.debugLine="sql1.ExecNonQuery(\"delete from PurchaseInvoiceH w";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from PurchaseInvoiceH where PurchaseInvoiceHID="+BA.ObjectToString(_params.Get((Object)("val"))));
RDebugUtils.currentLine=17956870;
 //BA.debugLineNum = 17956870;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=17956872;
 //BA.debugLineNum = 17956872;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.reload(true)",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=17956874;
 //BA.debugLineNum = 17956874;BA.debugLine="End Sub";
return "";
}
public String  _edit_button_table(b4j.example.purchaseinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="purchaseinformation";
if (Debug.shouldDelegate(ba, "edit_button_table", false))
	 {return ((String) Debug.delegate(ba, "edit_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Private Sub Edit_button_table(params As Map)";
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("217891329",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=17891331;
 //BA.debugLineNum = 17891331;BA.debugLine="ws.Session.SetAttribute(\"InvoiceID\",params.Get(\"v";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("InvoiceID",_params.Get((Object)("val")));
RDebugUtils.currentLine=17891333;
 //BA.debugLineNum = 17891333;BA.debugLine="ws.Eval(\"document.location.replace('AddPurchaseIn";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('AddPurchaseInfo.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=17891335;
 //BA.debugLineNum = 17891335;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.purchaseinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="purchaseinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="End Sub";
return "";
}
public String  _load_data(b4j.example.purchaseinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="purchaseinformation";
if (Debug.shouldDelegate(ba, "load_data", false))
	 {return ((String) Debug.delegate(ba, "load_data", null));}
String _str = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cursor = null;
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Sub Load_Data";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="Try";
try {RDebugUtils.currentLine=17825795;
 //BA.debugLineNum = 17825795;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=17825797;
 //BA.debugLineNum = 17825797;BA.debugLine="If IntIsMobileDev = 0 Then";
if (__ref._intismobiledev /*int*/ ==0) { 
RDebugUtils.currentLine=17825799;
 //BA.debugLineNum = 17825799;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Date</th>\n"+"									                  <th class=\"wd-10p\">Supplier</th>\n"+"									                  <th class=\"wd-15p\">Total Invoice</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=17825811;
 //BA.debugLineNum = 17825811;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=17825812;
 //BA.debugLineNum = 17825812;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        Purchase";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT        PurchaseInvoiceH.PurchaseInvoiceHID, PurchaseInvoiceH.InvDT, PurchaseInvoiceH.InvTotal, PurchaseInvoiceH.InvTotalTax, PurchaseInvoiceH.InvTotalDiscount, PurchaseInvoiceH.InvTotalShipping, \n"+"                         PurchaseInvoiceH.PaidAmount, PurchaseInvoiceH.StrNotes, PurchaseInvoiceH.SupplierID, SuppliersInfo.SupplierName\n"+"FROM            PurchaseInvoiceH LEFT OUTER JOIN\n"+"                         SuppliersInfo ON PurchaseInvoiceH.SupplierID = SuppliersInfo.SupplierID"));
RDebugUtils.currentLine=17825817;
 //BA.debugLineNum = 17825817;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=17825819;
 //BA.debugLineNum = 17825819;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=17825820;
 //BA.debugLineNum = 17825820;BA.debugLine="str = str & \"<td>\"& Cursor.GetInt(\"PurchaseInvo";
_str = _str+"<td>"+BA.NumberToString(_cursor.GetInt("PurchaseInvoiceHID"))+"</td>";
RDebugUtils.currentLine=17825821;
 //BA.debugLineNum = 17825821;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"InvDT\") &";
_str = _str+"<td>"+_cursor.GetString("InvDT")+"</td>";
RDebugUtils.currentLine=17825822;
 //BA.debugLineNum = 17825822;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"SupplierN";
_str = _str+"<td>"+_cursor.GetString("SupplierName")+"</td>";
RDebugUtils.currentLine=17825823;
 //BA.debugLineNum = 17825823;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"InvTotal\"";
_str = _str+"<td>"+_cursor.GetString("InvTotal")+"</td>";
RDebugUtils.currentLine=17825825;
 //BA.debugLineNum = 17825825;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("PurchaseInvoiceHID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "+" <a href='javascript:void(0);' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("PurchaseInvoiceHID"))+")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=17825831;
 //BA.debugLineNum = 17825831;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=17825833;
 //BA.debugLineNum = 17825833;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
 }else {
RDebugUtils.currentLine=17825837;
 //BA.debugLineNum = 17825837;BA.debugLine="str = $\" <table id='datatable1' class='table d";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=17825846;
 //BA.debugLineNum = 17825846;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=17825847;
 //BA.debugLineNum = 17825847;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        Purcha";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT        PurchaseInvoiceH.PurchaseInvoiceHID, PurchaseInvoiceH.InvDT, PurchaseInvoiceH.InvTotal, PurchaseInvoiceH.InvTotalTax, PurchaseInvoiceH.InvTotalDiscount, PurchaseInvoiceH.InvTotalShipping, \n"+"                         PurchaseInvoiceH.PaidAmount, PurchaseInvoiceH.StrNotes, PurchaseInvoiceH.SupplierID, SuppliersInfo.SupplierName\n"+"FROM            PurchaseInvoiceH LEFT OUTER JOIN\n"+"                         SuppliersInfo ON PurchaseInvoiceH.SupplierID = SuppliersInfo.SupplierID"));
RDebugUtils.currentLine=17825852;
 //BA.debugLineNum = 17825852;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=17825854;
 //BA.debugLineNum = 17825854;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=17825855;
 //BA.debugLineNum = 17825855;BA.debugLine="str = str & \"<td>\"& Cursor.GetInt(\"PurchaseIn";
_str = _str+"<td>"+BA.NumberToString(_cursor.GetInt("PurchaseInvoiceHID"))+"</td>";
RDebugUtils.currentLine=17825857;
 //BA.debugLineNum = 17825857;BA.debugLine="str = str & \"  <td style=' vertical-align: mi";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("PurchaseInvoiceHID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "+" <a href='javascript:void(0);' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("PurchaseInvoiceHID"))+")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=17825863;
 //BA.debugLineNum = 17825863;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=17825865;
 //BA.debugLineNum = 17825865;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
 };
RDebugUtils.currentLine=17825871;
 //BA.debugLineNum = 17825871;BA.debugLine="divlist.SetHtml(str)";
__ref._divlist /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
 } 
       catch (Exception e31) {
			ba.setLastException(e31);RDebugUtils.currentLine=17825875;
 //BA.debugLineNum = 17825875;BA.debugLine="Log(LastException)";
__c.LogImpl("217825875",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=17825877;
 //BA.debugLineNum = 17825877;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.purchaseinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="purchaseinformation";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="Try";
try {RDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=18087940;
 //BA.debugLineNum = 18087940;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"          responsive: true,\n"+"          language: {\n"+"            searchPlaceholder: 'Search...',\n"+"            sSearch: '',\n"+"            lengthMenu: '_MENU_ items/page',\n"+"          }\n"+"        });\n"+"\n"+"      \n"+"        // Select2\n"+"        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"+"\n"+"      });");
RDebugUtils.currentLine=18087958;
 //BA.debugLineNum = 18087958;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=18087961;
 //BA.debugLineNum = 18087961;BA.debugLine="Log(LastException)";
__c.LogImpl("218087961",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=18087963;
 //BA.debugLineNum = 18087963;BA.debugLine="End Sub";
return "";
}
public String  _print_table_data(b4j.example.purchaseinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="purchaseinformation";
if (Debug.shouldDelegate(ba, "print_table_data", false))
	 {return ((String) Debug.delegate(ba, "print_table_data", new Object[] {_params}));}
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Private Sub Print_Table_Data(params As Map)";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("218022401",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=18022403;
 //BA.debugLineNum = 18022403;BA.debugLine="ws.Session.SetAttribute(\"TempRID\",params.Get(\"val";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("TempRID",_params.Get((Object)("val")));
RDebugUtils.currentLine=18022405;
 //BA.debugLineNum = 18022405;BA.debugLine="ws.Eval(\"window.open('PrintInvoiceReport.html', '";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("window.open('PrintInvoiceReport.html', '_blank')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=18022407;
 //BA.debugLineNum = 18022407;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.purchaseinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="purchaseinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="ws.Session.SetAttribute(\"InvoiceID\",0)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("InvoiceID",(Object)(0));
RDebugUtils.currentLine=17694725;
 //BA.debugLineNum = 17694725;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=17694727;
 //BA.debugLineNum = 17694727;BA.debugLine="CheckIsMobileBrowser";
__ref._checkismobilebrowser /*String*/ (null);
RDebugUtils.currentLine=17694729;
 //BA.debugLineNum = 17694729;BA.debugLine="Load_Data";
__ref._load_data /*String*/ (null);
RDebugUtils.currentLine=17694730;
 //BA.debugLineNum = 17694730;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
RDebugUtils.currentLine=17694731;
 //BA.debugLineNum = 17694731;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.purchaseinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="purchaseinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=17760260;
 //BA.debugLineNum = 17760260;BA.debugLine="End Sub";
return "";
}
}