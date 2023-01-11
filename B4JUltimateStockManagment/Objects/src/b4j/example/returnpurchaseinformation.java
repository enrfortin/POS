package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class returnpurchaseinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.returnpurchaseinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.returnpurchaseinformation.class).invoke(this, new Object[] {null});
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
public String  _checkismobilebrowser(b4j.example.returnpurchaseinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="returnpurchaseinformation";
if (Debug.shouldDelegate(ba, "checkismobilebrowser", false))
	 {return ((String) Debug.delegate(ba, "checkismobilebrowser", null));}
String _str = "";
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Sub CheckIsMobileBrowser";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="Try";
try {RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="str = $\"	 if(/Android|webOS|iPhone|iPad|iPod|Bla";
_str = ("	\n"+"if(/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)){\n"+"	 \n"+"	document.getElementById(\"divismobiledev\").innerHTML = \"1\";\n"+"	\n"+"}else{\n"+"	 document.getElementById(\"divismobiledev\").innerHTML = \"0\";\n"+"}\n"+"		");
RDebugUtils.currentLine=18808845;
 //BA.debugLineNum = 18808845;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=18808847;
 //BA.debugLineNum = 18808847;BA.debugLine="IntIsMobileDev = divismobiledev.GetHtml.Value";
__ref._intismobiledev /*int*/  = (int)(BA.ObjectToNumber(__ref._divismobiledev /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetHtml().getValue()));
RDebugUtils.currentLine=18808848;
 //BA.debugLineNum = 18808848;BA.debugLine="Log(IntIsMobileDev)";
__c.LogImpl("218808848",BA.NumberToString(__ref._intismobiledev /*int*/ ),0);
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=18808850;
 //BA.debugLineNum = 18808850;BA.debugLine="Log(LastException)";
__c.LogImpl("218808850",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=18808852;
 //BA.debugLineNum = 18808852;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.returnpurchaseinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="returnpurchaseinformation";
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="Private divlist As JQueryElement";
_divlist = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=18219011;
 //BA.debugLineNum = 18219011;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=18219012;
 //BA.debugLineNum = 18219012;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=18219015;
 //BA.debugLineNum = 18219015;BA.debugLine="Private IntIsMobileDev As Int";
_intismobiledev = 0;
RDebugUtils.currentLine=18219016;
 //BA.debugLineNum = 18219016;BA.debugLine="Private divismobiledev As JQueryElement";
_divismobiledev = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=18219017;
 //BA.debugLineNum = 18219017;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=18219019;
 //BA.debugLineNum = 18219019;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table(b4j.example.returnpurchaseinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="returnpurchaseinformation";
if (Debug.shouldDelegate(ba, "delete_button_table", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Private Sub Delete_button_table(params As Map)";
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("218612225",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=18612227;
 //BA.debugLineNum = 18612227;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=18612229;
 //BA.debugLineNum = 18612229;BA.debugLine="sql1.ExecNonQuery(\"delete from InvoiceH where Inv";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from InvoiceH where InvoiceID="+BA.ObjectToString(_params.Get((Object)("val"))));
RDebugUtils.currentLine=18612230;
 //BA.debugLineNum = 18612230;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=18612232;
 //BA.debugLineNum = 18612232;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.reload(true)",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=18612234;
 //BA.debugLineNum = 18612234;BA.debugLine="End Sub";
return "";
}
public String  _edit_button_table(b4j.example.returnpurchaseinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="returnpurchaseinformation";
if (Debug.shouldDelegate(ba, "edit_button_table", false))
	 {return ((String) Debug.delegate(ba, "edit_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Private Sub Edit_button_table(params As Map)";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("218546689",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=18546691;
 //BA.debugLineNum = 18546691;BA.debugLine="ws.Session.SetAttribute(\"InvoiceID\",params.Get(\"v";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("InvoiceID",_params.Get((Object)("val")));
RDebugUtils.currentLine=18546693;
 //BA.debugLineNum = 18546693;BA.debugLine="ws.Eval(\"document.location.replace('AddPurchaseIn";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('AddPurchaseInfo.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=18546695;
 //BA.debugLineNum = 18546695;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.returnpurchaseinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="returnpurchaseinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="End Sub";
return "";
}
public String  _load_data(b4j.example.returnpurchaseinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="returnpurchaseinformation";
if (Debug.shouldDelegate(ba, "load_data", false))
	 {return ((String) Debug.delegate(ba, "load_data", null));}
String _str = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cursor = null;
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Sub Load_Data";
RDebugUtils.currentLine=18481153;
 //BA.debugLineNum = 18481153;BA.debugLine="Try";
try {RDebugUtils.currentLine=18481155;
 //BA.debugLineNum = 18481155;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=18481157;
 //BA.debugLineNum = 18481157;BA.debugLine="If IntIsMobileDev = 0 Then";
if (__ref._intismobiledev /*int*/ ==0) { 
RDebugUtils.currentLine=18481159;
 //BA.debugLineNum = 18481159;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Date</th>\n"+"									                  <th class=\"wd-10p\">Supplier</th>\n"+"									                  <th class=\"wd-15p\">Total Invoice</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=18481171;
 //BA.debugLineNum = 18481171;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=18481172;
 //BA.debugLineNum = 18481172;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        ReturnPu";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT        ReturnPurchaseInvoiceH.ReturnPurchaseInvoiceHID, ReturnPurchaseInvoiceH.InvDT, ReturnPurchaseInvoiceH.InvTotal, ReturnPurchaseInvoiceH.InvTotalTax, ReturnPurchaseInvoiceH.InvTotalDiscount, ReturnPurchaseInvoiceH.InvTotalShipping, \n"+"                         ReturnPurchaseInvoiceH.PaidAmount, ReturnPurchaseInvoiceH.StrNotes, ReturnPurchaseInvoiceH.SupplierID, SuppliersInfo.SupplierName\n"+"FROM            ReturnPurchaseInvoiceH LEFT OUTER JOIN\n"+"                         SuppliersInfo ON ReturnPurchaseInvoiceH.SupplierID = SuppliersInfo.SupplierID"));
RDebugUtils.currentLine=18481177;
 //BA.debugLineNum = 18481177;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=18481179;
 //BA.debugLineNum = 18481179;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=18481180;
 //BA.debugLineNum = 18481180;BA.debugLine="str = str & \"<td>\"& Cursor.GetInt(\"ReturnPurcha";
_str = _str+"<td>"+BA.NumberToString(_cursor.GetInt("ReturnPurchaseInvoiceHID"))+"</td>";
RDebugUtils.currentLine=18481181;
 //BA.debugLineNum = 18481181;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"InvDT\") &";
_str = _str+"<td>"+_cursor.GetString("InvDT")+"</td>";
RDebugUtils.currentLine=18481182;
 //BA.debugLineNum = 18481182;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"SupplierN";
_str = _str+"<td>"+_cursor.GetString("SupplierName")+"</td>";
RDebugUtils.currentLine=18481183;
 //BA.debugLineNum = 18481183;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"InvTotal\"";
_str = _str+"<td>"+_cursor.GetString("InvTotal")+"</td>";
RDebugUtils.currentLine=18481185;
 //BA.debugLineNum = 18481185;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("ReturnPurchaseInvoiceHID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "+" <a href='javascript:void(0);' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("ReturnPurchaseInvoiceHID"))+")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=18481191;
 //BA.debugLineNum = 18481191;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=18481193;
 //BA.debugLineNum = 18481193;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
 }else {
RDebugUtils.currentLine=18481197;
 //BA.debugLineNum = 18481197;BA.debugLine="str = $\" <table id='datatable1' class='table d";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=18481206;
 //BA.debugLineNum = 18481206;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=18481207;
 //BA.debugLineNum = 18481207;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        Return";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT        ReturnPurchaseInvoiceH.ReturnPurchaseInvoiceHID, ReturnPurchaseInvoiceH.InvDT, ReturnPurchaseInvoiceH.InvTotal, ReturnPurchaseInvoiceH.InvTotalTax, ReturnPurchaseInvoiceH.InvTotalDiscount, ReturnPurchaseInvoiceH.InvTotalShipping, \n"+"                         ReturnPurchaseInvoiceH.PaidAmount, ReturnPurchaseInvoiceH.StrNotes, ReturnPurchaseInvoiceH.SupplierID, SuppliersInfo.SupplierName\n"+"FROM            ReturnPurchaseInvoiceH LEFT OUTER JOIN\n"+"                         SuppliersInfo ON ReturnPurchaseInvoiceH.SupplierID = SuppliersInfo.SupplierID"));
RDebugUtils.currentLine=18481212;
 //BA.debugLineNum = 18481212;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=18481214;
 //BA.debugLineNum = 18481214;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=18481215;
 //BA.debugLineNum = 18481215;BA.debugLine="str = str & \"<td>\"& Cursor.GetInt(\"ReturnPurc";
_str = _str+"<td>"+BA.NumberToString(_cursor.GetInt("ReturnPurchaseInvoiceHID"))+"</td>";
RDebugUtils.currentLine=18481217;
 //BA.debugLineNum = 18481217;BA.debugLine="str = str & \"  <td style=' vertical-align: mi";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("ReturnPurchaseInvoiceHID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "+" <a href='javascript:void(0);' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("ReturnPurchaseInvoiceHID"))+")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=18481223;
 //BA.debugLineNum = 18481223;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=18481225;
 //BA.debugLineNum = 18481225;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
 };
RDebugUtils.currentLine=18481231;
 //BA.debugLineNum = 18481231;BA.debugLine="divlist.SetHtml(str)";
__ref._divlist /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
 } 
       catch (Exception e31) {
			ba.setLastException(e31);RDebugUtils.currentLine=18481235;
 //BA.debugLineNum = 18481235;BA.debugLine="Log(LastException)";
__c.LogImpl("218481235",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=18481237;
 //BA.debugLineNum = 18481237;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.returnpurchaseinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="returnpurchaseinformation";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="Try";
try {RDebugUtils.currentLine=18743299;
 //BA.debugLineNum = 18743299;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=18743300;
 //BA.debugLineNum = 18743300;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"          responsive: true,\n"+"          language: {\n"+"            searchPlaceholder: 'Search...',\n"+"            sSearch: '',\n"+"            lengthMenu: '_MENU_ items/page',\n"+"          }\n"+"        });\n"+"\n"+"      \n"+"        // Select2\n"+"        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"+"\n"+"      });");
RDebugUtils.currentLine=18743318;
 //BA.debugLineNum = 18743318;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=18743321;
 //BA.debugLineNum = 18743321;BA.debugLine="Log(LastException)";
__c.LogImpl("218743321",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=18743323;
 //BA.debugLineNum = 18743323;BA.debugLine="End Sub";
return "";
}
public String  _print_table_data(b4j.example.returnpurchaseinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="returnpurchaseinformation";
if (Debug.shouldDelegate(ba, "print_table_data", false))
	 {return ((String) Debug.delegate(ba, "print_table_data", new Object[] {_params}));}
RDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Private Sub Print_Table_Data(params As Map)";
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("218677761",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=18677763;
 //BA.debugLineNum = 18677763;BA.debugLine="ws.Session.SetAttribute(\"TempRID\",params.Get(\"val";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("TempRID",_params.Get((Object)("val")));
RDebugUtils.currentLine=18677765;
 //BA.debugLineNum = 18677765;BA.debugLine="ws.Eval(\"window.open('PrintInvoiceReport.html', '";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("window.open('PrintInvoiceReport.html', '_blank')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=18677767;
 //BA.debugLineNum = 18677767;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.returnpurchaseinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="returnpurchaseinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=18350081;
 //BA.debugLineNum = 18350081;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=18350084;
 //BA.debugLineNum = 18350084;BA.debugLine="ws.Session.SetAttribute(\"InvoiceID\",0)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("InvoiceID",(Object)(0));
RDebugUtils.currentLine=18350085;
 //BA.debugLineNum = 18350085;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=18350087;
 //BA.debugLineNum = 18350087;BA.debugLine="CheckIsMobileBrowser";
__ref._checkismobilebrowser /*String*/ (null);
RDebugUtils.currentLine=18350089;
 //BA.debugLineNum = 18350089;BA.debugLine="Load_Data";
__ref._load_data /*String*/ (null);
RDebugUtils.currentLine=18350090;
 //BA.debugLineNum = 18350090;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
RDebugUtils.currentLine=18350091;
 //BA.debugLineNum = 18350091;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.returnpurchaseinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="returnpurchaseinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=18415620;
 //BA.debugLineNum = 18415620;BA.debugLine="End Sub";
return "";
}
}