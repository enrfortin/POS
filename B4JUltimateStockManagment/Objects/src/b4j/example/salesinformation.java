package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class salesinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.salesinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.salesinformation.class).invoke(this, new Object[] {null});
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
public String  _checkismobilebrowser(b4j.example.salesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="salesinformation";
if (Debug.shouldDelegate(ba, "checkismobilebrowser", false))
	 {return ((String) Debug.delegate(ba, "checkismobilebrowser", null));}
String _str = "";
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Sub CheckIsMobileBrowser";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="Try";
try {RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=20119555;
 //BA.debugLineNum = 20119555;BA.debugLine="str = $\"	 if(/Android|webOS|iPhone|iPad|iPod|Bla";
_str = ("	\n"+"if(/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)){\n"+"	 \n"+"	document.getElementById(\"divismobiledev\").innerHTML = \"1\";\n"+"	\n"+"}else{\n"+"	 document.getElementById(\"divismobiledev\").innerHTML = \"0\";\n"+"}\n"+"		");
RDebugUtils.currentLine=20119565;
 //BA.debugLineNum = 20119565;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=20119567;
 //BA.debugLineNum = 20119567;BA.debugLine="IntIsMobileDev = divismobiledev.GetHtml.Value";
__ref._intismobiledev /*int*/  = (int)(BA.ObjectToNumber(__ref._divismobiledev /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetHtml().getValue()));
RDebugUtils.currentLine=20119568;
 //BA.debugLineNum = 20119568;BA.debugLine="Log(IntIsMobileDev)";
__c.LogImpl("220119568",BA.NumberToString(__ref._intismobiledev /*int*/ ),0);
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=20119570;
 //BA.debugLineNum = 20119570;BA.debugLine="Log(LastException)";
__c.LogImpl("220119570",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=20119572;
 //BA.debugLineNum = 20119572;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.salesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="salesinformation";
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="Private divlist As JQueryElement";
_divlist = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=19529732;
 //BA.debugLineNum = 19529732;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=19529735;
 //BA.debugLineNum = 19529735;BA.debugLine="Private IntIsMobileDev As Int";
_intismobiledev = 0;
RDebugUtils.currentLine=19529736;
 //BA.debugLineNum = 19529736;BA.debugLine="Private divismobiledev As JQueryElement";
_divismobiledev = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=19529737;
 //BA.debugLineNum = 19529737;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=19529739;
 //BA.debugLineNum = 19529739;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table(b4j.example.salesinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="salesinformation";
if (Debug.shouldDelegate(ba, "delete_button_table", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Private Sub Delete_button_table(params As Map)";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("219922945",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=19922947;
 //BA.debugLineNum = 19922947;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=19922949;
 //BA.debugLineNum = 19922949;BA.debugLine="sql1.ExecNonQuery(\"delete from InvoiceH where Inv";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from InvoiceH where InvoiceID="+BA.ObjectToString(_params.Get((Object)("val"))));
RDebugUtils.currentLine=19922950;
 //BA.debugLineNum = 19922950;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=19922952;
 //BA.debugLineNum = 19922952;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.reload(true)",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=19922954;
 //BA.debugLineNum = 19922954;BA.debugLine="End Sub";
return "";
}
public String  _edit_button_table(b4j.example.salesinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="salesinformation";
if (Debug.shouldDelegate(ba, "edit_button_table", false))
	 {return ((String) Debug.delegate(ba, "edit_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Private Sub Edit_button_table(params As Map)";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("219857409",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=19857411;
 //BA.debugLineNum = 19857411;BA.debugLine="ws.Session.SetAttribute(\"InvoiceID\",params.Get(\"v";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("InvoiceID",_params.Get((Object)("val")));
RDebugUtils.currentLine=19857413;
 //BA.debugLineNum = 19857413;BA.debugLine="ws.Eval(\"document.location.replace('AddSalesInfo.";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('AddSalesInfo.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=19857415;
 //BA.debugLineNum = 19857415;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.salesinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="salesinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="End Sub";
return "";
}
public String  _load_data(b4j.example.salesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="salesinformation";
if (Debug.shouldDelegate(ba, "load_data", false))
	 {return ((String) Debug.delegate(ba, "load_data", null));}
String _str = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cursor = null;
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Sub Load_Data";
RDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="Try";
try {RDebugUtils.currentLine=19791875;
 //BA.debugLineNum = 19791875;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=19791877;
 //BA.debugLineNum = 19791877;BA.debugLine="If IntIsMobileDev = 0 Then";
if (__ref._intismobiledev /*int*/ ==0) { 
RDebugUtils.currentLine=19791879;
 //BA.debugLineNum = 19791879;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Date</th>\n"+"									                  <th class=\"wd-10p\">Customer</th>\n"+"									                  <th class=\"wd-15p\">Total Invoice</th>\n"+"									                  <th class=\"wd-10p\">User</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=19791892;
 //BA.debugLineNum = 19791892;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=19791893;
 //BA.debugLineNum = 19791893;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        SalesInv";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT        SalesInvoiceH.SalesInvoiceHID, SalesInvoiceH.InvDT, SalesInvoiceH.InvTotal, SalesInvoiceH.UserID, SalesInvoiceH.InvTotalTax, SalesInvoiceH.InvTotalDiscount, SalesInvoiceH.InvTotalShipping, \n"+"                         SalesInvoiceH.PaidAmount, SalesInvoiceH.StrNotes, SalesInvoiceH.PaymenttypeID, SalesInvoiceH.CustomerID, CustomersInformation.CustomerName, UsersInformation.UserFullName\n"+"FROM            SalesInvoiceH LEFT OUTER JOIN\n"+"                         CustomersInformation ON SalesInvoiceH.CustomerID = CustomersInformation.CustomerID LEFT OUTER JOIN\n"+"                         UsersInformation ON SalesInvoiceH.UserID = UsersInformation.UserID"));
RDebugUtils.currentLine=19791899;
 //BA.debugLineNum = 19791899;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=19791901;
 //BA.debugLineNum = 19791901;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=19791902;
 //BA.debugLineNum = 19791902;BA.debugLine="str = str & \"<td>\"& Cursor.GetInt(\"SalesInvoice";
_str = _str+"<td>"+BA.NumberToString(_cursor.GetInt("SalesInvoiceHID"))+"</td>";
RDebugUtils.currentLine=19791903;
 //BA.debugLineNum = 19791903;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"InvDT\") &";
_str = _str+"<td>"+_cursor.GetString("InvDT")+"</td>";
RDebugUtils.currentLine=19791904;
 //BA.debugLineNum = 19791904;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"CustomerN";
_str = _str+"<td>"+_cursor.GetString("CustomerName")+"</td>";
RDebugUtils.currentLine=19791905;
 //BA.debugLineNum = 19791905;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"InvTotal\"";
_str = _str+"<td>"+_cursor.GetString("InvTotal")+"</td>";
RDebugUtils.currentLine=19791906;
 //BA.debugLineNum = 19791906;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"UserFullN";
_str = _str+"<td>"+_cursor.GetString("UserFullName")+"</td>";
RDebugUtils.currentLine=19791908;
 //BA.debugLineNum = 19791908;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("SalesInvoiceHID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "+" <a href='javascript:void(0);' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("SalesInvoiceHID"))+")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=19791914;
 //BA.debugLineNum = 19791914;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=19791916;
 //BA.debugLineNum = 19791916;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
 }else {
RDebugUtils.currentLine=19791920;
 //BA.debugLineNum = 19791920;BA.debugLine="str = $\" <table id='datatable1' class='table d";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=19791929;
 //BA.debugLineNum = 19791929;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=19791930;
 //BA.debugLineNum = 19791930;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        SalesI";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT        SalesInvoiceH.SalesInvoiceHID, SalesInvoiceH.InvDT, SalesInvoiceH.InvTotal, SalesInvoiceH.UserID, SalesInvoiceH.InvTotalTax, SalesInvoiceH.InvTotalDiscount, SalesInvoiceH.InvTotalShipping, \n"+"                         SalesInvoiceH.PaidAmount, SalesInvoiceH.StrNotes, SalesInvoiceH.PaymenttypeID, SalesInvoiceH.CustomerID, CustomersInformation.CustomerName, UsersInformation.UserFullName\n"+"FROM            SalesInvoiceH LEFT OUTER JOIN\n"+"                         CustomersInformation ON SalesInvoiceH.CustomerID = CustomersInformation.CustomerID LEFT OUTER JOIN\n"+"                         UsersInformation ON SalesInvoiceH.UserID = UsersInformation.UserID"));
RDebugUtils.currentLine=19791936;
 //BA.debugLineNum = 19791936;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=19791938;
 //BA.debugLineNum = 19791938;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=19791939;
 //BA.debugLineNum = 19791939;BA.debugLine="str = str & \"<td>\"& Cursor.GetInt(\"SalesInvoi";
_str = _str+"<td>"+BA.NumberToString(_cursor.GetInt("SalesInvoiceHID"))+"</td>";
RDebugUtils.currentLine=19791941;
 //BA.debugLineNum = 19791941;BA.debugLine="str = str & \"  <td style=' vertical-align: mi";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("SalesInvoiceHID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "+" <a href='javascript:void(0);' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("SalesInvoiceHID"))+")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=19791947;
 //BA.debugLineNum = 19791947;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=19791949;
 //BA.debugLineNum = 19791949;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
 };
RDebugUtils.currentLine=19791955;
 //BA.debugLineNum = 19791955;BA.debugLine="divlist.SetHtml(str)";
__ref._divlist /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
 } 
       catch (Exception e32) {
			ba.setLastException(e32);RDebugUtils.currentLine=19791959;
 //BA.debugLineNum = 19791959;BA.debugLine="Log(LastException)";
__c.LogImpl("219791959",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=19791961;
 //BA.debugLineNum = 19791961;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.salesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="salesinformation";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="Try";
try {RDebugUtils.currentLine=20054019;
 //BA.debugLineNum = 20054019;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=20054020;
 //BA.debugLineNum = 20054020;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"          responsive: true,\n"+"          language: {\n"+"            searchPlaceholder: 'Search...',\n"+"            sSearch: '',\n"+"            lengthMenu: '_MENU_ items/page',\n"+"          }\n"+"        });\n"+"\n"+"      \n"+"        // Select2\n"+"        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"+"\n"+"      });");
RDebugUtils.currentLine=20054038;
 //BA.debugLineNum = 20054038;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=20054041;
 //BA.debugLineNum = 20054041;BA.debugLine="Log(LastException)";
__c.LogImpl("220054041",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=20054043;
 //BA.debugLineNum = 20054043;BA.debugLine="End Sub";
return "";
}
public String  _print_table_data(b4j.example.salesinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="salesinformation";
if (Debug.shouldDelegate(ba, "print_table_data", false))
	 {return ((String) Debug.delegate(ba, "print_table_data", new Object[] {_params}));}
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Private Sub Print_Table_Data(params As Map)";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("219988481",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=19988483;
 //BA.debugLineNum = 19988483;BA.debugLine="ws.Session.SetAttribute(\"TempRID\",params.Get(\"val";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("TempRID",_params.Get((Object)("val")));
RDebugUtils.currentLine=19988485;
 //BA.debugLineNum = 19988485;BA.debugLine="ws.Eval(\"window.open('PrintInvoiceReport.html', '";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("window.open('PrintInvoiceReport.html', '_blank')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=19988487;
 //BA.debugLineNum = 19988487;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.salesinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="salesinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=19660804;
 //BA.debugLineNum = 19660804;BA.debugLine="ws.Session.SetAttribute(\"InvoiceID\",0)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("InvoiceID",(Object)(0));
RDebugUtils.currentLine=19660805;
 //BA.debugLineNum = 19660805;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=19660807;
 //BA.debugLineNum = 19660807;BA.debugLine="CheckIsMobileBrowser";
__ref._checkismobilebrowser /*String*/ (null);
RDebugUtils.currentLine=19660809;
 //BA.debugLineNum = 19660809;BA.debugLine="Load_Data";
__ref._load_data /*String*/ (null);
RDebugUtils.currentLine=19660810;
 //BA.debugLineNum = 19660810;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
RDebugUtils.currentLine=19660811;
 //BA.debugLineNum = 19660811;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.salesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="salesinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="End Sub";
return "";
}
}