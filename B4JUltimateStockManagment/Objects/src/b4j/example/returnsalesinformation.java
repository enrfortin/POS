package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class returnsalesinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.returnsalesinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.returnsalesinformation.class).invoke(this, new Object[] {null});
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
public String  _checkismobilebrowser(b4j.example.returnsalesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="returnsalesinformation";
if (Debug.shouldDelegate(ba, "checkismobilebrowser", false))
	 {return ((String) Debug.delegate(ba, "checkismobilebrowser", null));}
String _str = "";
RDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Sub CheckIsMobileBrowser";
RDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="Try";
try {RDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=19464195;
 //BA.debugLineNum = 19464195;BA.debugLine="str = $\"	 if(/Android|webOS|iPhone|iPad|iPod|Bla";
_str = ("	\n"+"if(/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)){\n"+"	 \n"+"	document.getElementById(\"divismobiledev\").innerHTML = \"1\";\n"+"	\n"+"}else{\n"+"	 document.getElementById(\"divismobiledev\").innerHTML = \"0\";\n"+"}\n"+"		");
RDebugUtils.currentLine=19464205;
 //BA.debugLineNum = 19464205;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=19464207;
 //BA.debugLineNum = 19464207;BA.debugLine="IntIsMobileDev = divismobiledev.GetHtml.Value";
__ref._intismobiledev /*int*/  = (int)(BA.ObjectToNumber(__ref._divismobiledev /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetHtml().getValue()));
RDebugUtils.currentLine=19464208;
 //BA.debugLineNum = 19464208;BA.debugLine="Log(IntIsMobileDev)";
__c.LogImpl("219464208",BA.NumberToString(__ref._intismobiledev /*int*/ ),0);
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=19464210;
 //BA.debugLineNum = 19464210;BA.debugLine="Log(LastException)";
__c.LogImpl("219464210",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=19464212;
 //BA.debugLineNum = 19464212;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.returnsalesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="returnsalesinformation";
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="Private divlist As JQueryElement";
_divlist = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=18874371;
 //BA.debugLineNum = 18874371;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=18874372;
 //BA.debugLineNum = 18874372;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=18874375;
 //BA.debugLineNum = 18874375;BA.debugLine="Private IntIsMobileDev As Int";
_intismobiledev = 0;
RDebugUtils.currentLine=18874376;
 //BA.debugLineNum = 18874376;BA.debugLine="Private divismobiledev As JQueryElement";
_divismobiledev = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=18874377;
 //BA.debugLineNum = 18874377;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=18874379;
 //BA.debugLineNum = 18874379;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table(b4j.example.returnsalesinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="returnsalesinformation";
if (Debug.shouldDelegate(ba, "delete_button_table", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Private Sub Delete_button_table(params As Map)";
RDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("219267585",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=19267587;
 //BA.debugLineNum = 19267587;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=19267589;
 //BA.debugLineNum = 19267589;BA.debugLine="sql1.ExecNonQuery(\"delete from InvoiceH where Inv";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from InvoiceH where InvoiceID="+BA.ObjectToString(_params.Get((Object)("val"))));
RDebugUtils.currentLine=19267590;
 //BA.debugLineNum = 19267590;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=19267592;
 //BA.debugLineNum = 19267592;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.reload(true)",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=19267594;
 //BA.debugLineNum = 19267594;BA.debugLine="End Sub";
return "";
}
public String  _edit_button_table(b4j.example.returnsalesinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="returnsalesinformation";
if (Debug.shouldDelegate(ba, "edit_button_table", false))
	 {return ((String) Debug.delegate(ba, "edit_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=19202048;
 //BA.debugLineNum = 19202048;BA.debugLine="Private Sub Edit_button_table(params As Map)";
RDebugUtils.currentLine=19202049;
 //BA.debugLineNum = 19202049;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("219202049",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=19202051;
 //BA.debugLineNum = 19202051;BA.debugLine="ws.Session.SetAttribute(\"InvoiceID\",params.Get(\"v";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("InvoiceID",_params.Get((Object)("val")));
RDebugUtils.currentLine=19202053;
 //BA.debugLineNum = 19202053;BA.debugLine="ws.Eval(\"document.location.replace('AddReturnSale";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('AddReturnSalesInfo.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=19202055;
 //BA.debugLineNum = 19202055;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.returnsalesinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="returnsalesinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="End Sub";
return "";
}
public String  _load_data(b4j.example.returnsalesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="returnsalesinformation";
if (Debug.shouldDelegate(ba, "load_data", false))
	 {return ((String) Debug.delegate(ba, "load_data", null));}
String _str = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cursor = null;
RDebugUtils.currentLine=19136512;
 //BA.debugLineNum = 19136512;BA.debugLine="Sub Load_Data";
RDebugUtils.currentLine=19136513;
 //BA.debugLineNum = 19136513;BA.debugLine="Try";
try {RDebugUtils.currentLine=19136515;
 //BA.debugLineNum = 19136515;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=19136517;
 //BA.debugLineNum = 19136517;BA.debugLine="If IntIsMobileDev = 0 Then";
if (__ref._intismobiledev /*int*/ ==0) { 
RDebugUtils.currentLine=19136519;
 //BA.debugLineNum = 19136519;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Date</th>\n"+"									                  <th class=\"wd-10p\">Customer</th>\n"+"									                  <th class=\"wd-15p\">Total Invoice</th>\n"+"									                  <th class=\"wd-10p\">User</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=19136532;
 //BA.debugLineNum = 19136532;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=19136533;
 //BA.debugLineNum = 19136533;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        ReturnSa";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT        ReturnSalesInvoiceH.ReturnReturnSalesInvoiceHID, ReturnSalesInvoiceH.InvDT, ReturnSalesInvoiceH.InvTotal, ReturnSalesInvoiceH.UserID, ReturnSalesInvoiceH.InvTotalTax, ReturnSalesInvoiceH.InvTotalDiscount, ReturnSalesInvoiceH.InvTotalShipping, \n"+"                         ReturnSalesInvoiceH.PaidAmount, ReturnSalesInvoiceH.StrNotes, ReturnSalesInvoiceH.PaymenttypeID, ReturnSalesInvoiceH.CustomerID, CustomersInformation.CustomerName, UsersInformation.UserFullName\n"+"FROM            ReturnSalesInvoiceH LEFT OUTER JOIN\n"+"                         CustomersInformation ON ReturnSalesInvoiceH.CustomerID = CustomersInformation.CustomerID LEFT OUTER JOIN\n"+"                         UsersInformation ON ReturnSalesInvoiceH.UserID = UsersInformation.UserID"));
RDebugUtils.currentLine=19136539;
 //BA.debugLineNum = 19136539;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=19136541;
 //BA.debugLineNum = 19136541;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=19136542;
 //BA.debugLineNum = 19136542;BA.debugLine="str = str & \"<td>\"& Cursor.GetInt(\"ReturnReturn";
_str = _str+"<td>"+BA.NumberToString(_cursor.GetInt("ReturnReturnSalesInvoiceHID"))+"</td>";
RDebugUtils.currentLine=19136543;
 //BA.debugLineNum = 19136543;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"InvDT\") &";
_str = _str+"<td>"+_cursor.GetString("InvDT")+"</td>";
RDebugUtils.currentLine=19136544;
 //BA.debugLineNum = 19136544;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"CustomerN";
_str = _str+"<td>"+_cursor.GetString("CustomerName")+"</td>";
RDebugUtils.currentLine=19136545;
 //BA.debugLineNum = 19136545;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"InvTotal\"";
_str = _str+"<td>"+_cursor.GetString("InvTotal")+"</td>";
RDebugUtils.currentLine=19136546;
 //BA.debugLineNum = 19136546;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"UserFullN";
_str = _str+"<td>"+_cursor.GetString("UserFullName")+"</td>";
RDebugUtils.currentLine=19136548;
 //BA.debugLineNum = 19136548;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("ReturnReturnSalesInvoiceHID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "+" <a href='javascript:void(0);' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("ReturnReturnSalesInvoiceHID"))+")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=19136554;
 //BA.debugLineNum = 19136554;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=19136556;
 //BA.debugLineNum = 19136556;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
 }else {
RDebugUtils.currentLine=19136560;
 //BA.debugLineNum = 19136560;BA.debugLine="str = $\" <table id='datatable1' class='table d";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=19136569;
 //BA.debugLineNum = 19136569;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=19136570;
 //BA.debugLineNum = 19136570;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        Return";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT        ReturnSalesInvoiceH.ReturnReturnSalesInvoiceHID, ReturnSalesInvoiceH.InvDT, ReturnSalesInvoiceH.InvTotal, ReturnSalesInvoiceH.UserID, ReturnSalesInvoiceH.InvTotalTax, ReturnSalesInvoiceH.InvTotalDiscount, ReturnSalesInvoiceH.InvTotalShipping, \n"+"                         ReturnSalesInvoiceH.PaidAmount, ReturnSalesInvoiceH.StrNotes, ReturnSalesInvoiceH.PaymenttypeID, ReturnSalesInvoiceH.CustomerID, CustomersInformation.CustomerName, UsersInformation.UserFullName\n"+"FROM            ReturnSalesInvoiceH LEFT OUTER JOIN\n"+"                         CustomersInformation ON ReturnSalesInvoiceH.CustomerID = CustomersInformation.CustomerID LEFT OUTER JOIN\n"+"                         UsersInformation ON ReturnSalesInvoiceH.UserID = UsersInformation.UserID"));
RDebugUtils.currentLine=19136576;
 //BA.debugLineNum = 19136576;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=19136578;
 //BA.debugLineNum = 19136578;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=19136579;
 //BA.debugLineNum = 19136579;BA.debugLine="str = str & \"<td>\"& Cursor.GetInt(\"ReturnRetu";
_str = _str+"<td>"+BA.NumberToString(_cursor.GetInt("ReturnReturnSalesInvoiceHID"))+"</td>";
RDebugUtils.currentLine=19136581;
 //BA.debugLineNum = 19136581;BA.debugLine="str = str & \"  <td style=' vertical-align: mi";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("ReturnReturnSalesInvoiceHID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "+" <a href='javascript:void(0);' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("ReturnReturnSalesInvoiceHID"))+")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=19136587;
 //BA.debugLineNum = 19136587;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=19136589;
 //BA.debugLineNum = 19136589;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
 };
RDebugUtils.currentLine=19136595;
 //BA.debugLineNum = 19136595;BA.debugLine="divlist.SetHtml(str)";
__ref._divlist /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
 } 
       catch (Exception e32) {
			ba.setLastException(e32);RDebugUtils.currentLine=19136599;
 //BA.debugLineNum = 19136599;BA.debugLine="Log(LastException)";
__c.LogImpl("219136599",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=19136601;
 //BA.debugLineNum = 19136601;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.returnsalesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="returnsalesinformation";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="Try";
try {RDebugUtils.currentLine=19398659;
 //BA.debugLineNum = 19398659;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=19398660;
 //BA.debugLineNum = 19398660;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"          responsive: true,\n"+"          language: {\n"+"            searchPlaceholder: 'Search...',\n"+"            sSearch: '',\n"+"            lengthMenu: '_MENU_ items/page',\n"+"          }\n"+"        });\n"+"\n"+"      \n"+"        // Select2\n"+"        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"+"\n"+"      });");
RDebugUtils.currentLine=19398678;
 //BA.debugLineNum = 19398678;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=19398681;
 //BA.debugLineNum = 19398681;BA.debugLine="Log(LastException)";
__c.LogImpl("219398681",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=19398683;
 //BA.debugLineNum = 19398683;BA.debugLine="End Sub";
return "";
}
public String  _print_table_data(b4j.example.returnsalesinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="returnsalesinformation";
if (Debug.shouldDelegate(ba, "print_table_data", false))
	 {return ((String) Debug.delegate(ba, "print_table_data", new Object[] {_params}));}
RDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Private Sub Print_Table_Data(params As Map)";
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("219333121",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=19333123;
 //BA.debugLineNum = 19333123;BA.debugLine="ws.Session.SetAttribute(\"TempRID\",params.Get(\"val";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("TempRID",_params.Get((Object)("val")));
RDebugUtils.currentLine=19333125;
 //BA.debugLineNum = 19333125;BA.debugLine="ws.Eval(\"window.open('PrintInvoiceReport.html', '";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("window.open('PrintInvoiceReport.html', '_blank')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=19333127;
 //BA.debugLineNum = 19333127;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.returnsalesinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="returnsalesinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=19005444;
 //BA.debugLineNum = 19005444;BA.debugLine="ws.Session.SetAttribute(\"InvoiceID\",0)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("InvoiceID",(Object)(0));
RDebugUtils.currentLine=19005445;
 //BA.debugLineNum = 19005445;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=19005447;
 //BA.debugLineNum = 19005447;BA.debugLine="CheckIsMobileBrowser";
__ref._checkismobilebrowser /*String*/ (null);
RDebugUtils.currentLine=19005449;
 //BA.debugLineNum = 19005449;BA.debugLine="Load_Data";
__ref._load_data /*String*/ (null);
RDebugUtils.currentLine=19005450;
 //BA.debugLineNum = 19005450;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
RDebugUtils.currentLine=19005451;
 //BA.debugLineNum = 19005451;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.returnsalesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="returnsalesinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=19070976;
 //BA.debugLineNum = 19070976;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=19070980;
 //BA.debugLineNum = 19070980;BA.debugLine="End Sub";
return "";
}
}