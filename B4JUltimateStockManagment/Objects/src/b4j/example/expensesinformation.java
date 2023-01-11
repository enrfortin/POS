package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class expensesinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.expensesinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.expensesinformation.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public b4j.example.main _main = null;
public String  _class_globals(b4j.example.expensesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expensesinformation";
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="Private divlist As JQueryElement";
_divlist = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=17039363;
 //BA.debugLineNum = 17039363;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=17039364;
 //BA.debugLineNum = 17039364;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=17039365;
 //BA.debugLineNum = 17039365;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=17039367;
 //BA.debugLineNum = 17039367;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table(b4j.example.expensesinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="expensesinformation";
if (Debug.shouldDelegate(ba, "delete_button_table", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Private Sub Delete_button_table(params As Map)";
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=17432580;
 //BA.debugLineNum = 17432580;BA.debugLine="sql1.ExecNonQuery(\"delete from ExpensesInfo where";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from ExpensesInfo where ExpensesID="+BA.ObjectToString(_params.Get((Object)("val"))));
RDebugUtils.currentLine=17432581;
 //BA.debugLineNum = 17432581;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=17432583;
 //BA.debugLineNum = 17432583;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.reload(true)",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=17432585;
 //BA.debugLineNum = 17432585;BA.debugLine="End Sub";
return "";
}
public String  _edit_button_table(b4j.example.expensesinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="expensesinformation";
if (Debug.shouldDelegate(ba, "edit_button_table", false))
	 {return ((String) Debug.delegate(ba, "edit_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Private Sub Edit_button_table(params As Map)";
RDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="ws.Session.SetAttribute(\"CatID\",params.Get(\"val\")";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("CatID",_params.Get((Object)("val")));
RDebugUtils.currentLine=17367044;
 //BA.debugLineNum = 17367044;BA.debugLine="ws.Eval(\"document.location.replace('AddExpensesIn";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('AddExpensesInfo.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=17367046;
 //BA.debugLineNum = 17367046;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.expensesinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="expensesinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="End Sub";
return "";
}
public String  _load_data(b4j.example.expensesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expensesinformation";
if (Debug.shouldDelegate(ba, "load_data", false))
	 {return ((String) Debug.delegate(ba, "load_data", null));}
String _str = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cursor = null;
RDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Sub Load_Data";
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="Try";
try {RDebugUtils.currentLine=17301507;
 //BA.debugLineNum = 17301507;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=17301508;
 //BA.debugLineNum = 17301508;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Date</th>\n"+"									                  <th class=\"wd-15p\">Amount</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=17301520;
 //BA.debugLineNum = 17301520;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=17301521;
 //BA.debugLineNum = 17301521;BA.debugLine="Cursor = sql1.ExecQuery(\"select * from ExpensesI";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from ExpensesInfo");
RDebugUtils.currentLine=17301523;
 //BA.debugLineNum = 17301523;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=17301525;
 //BA.debugLineNum = 17301525;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=17301526;
 //BA.debugLineNum = 17301526;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ExpensesI";
_str = _str+"<td>"+_cursor.GetString("ExpensesID")+"</td>";
RDebugUtils.currentLine=17301527;
 //BA.debugLineNum = 17301527;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ExpensesD";
_str = _str+"<td>"+_cursor.GetString("ExpensesDate")+"</td>";
RDebugUtils.currentLine=17301528;
 //BA.debugLineNum = 17301528;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ExpensesA";
_str = _str+"<td>"+_cursor.GetString("ExpensesAmt")+"</td>";
RDebugUtils.currentLine=17301530;
 //BA.debugLineNum = 17301530;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("ExpensesID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "+" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("ExpensesID"))+")\"></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=17301536;
 //BA.debugLineNum = 17301536;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=17301538;
 //BA.debugLineNum = 17301538;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
RDebugUtils.currentLine=17301540;
 //BA.debugLineNum = 17301540;BA.debugLine="divlist.SetHtml(str)";
__ref._divlist /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=17301544;
 //BA.debugLineNum = 17301544;BA.debugLine="Log(LastException)";
__c.LogImpl("217301544",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=17301546;
 //BA.debugLineNum = 17301546;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.expensesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expensesinformation";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="Try";
try {RDebugUtils.currentLine=17498115;
 //BA.debugLineNum = 17498115;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=17498116;
 //BA.debugLineNum = 17498116;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"          responsive: true,\n"+"          language: {\n"+"            searchPlaceholder: 'Search...',\n"+"            sSearch: '',\n"+"            lengthMenu: '_MENU_ items/page',\n"+"          }\n"+"        });\n"+"\n"+"      \n"+"        // Select2\n"+"        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"+"\n"+"      });");
RDebugUtils.currentLine=17498134;
 //BA.debugLineNum = 17498134;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=17498137;
 //BA.debugLineNum = 17498137;BA.debugLine="Log(LastException)";
__c.LogImpl("217498137",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=17498139;
 //BA.debugLineNum = 17498139;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.expensesinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="expensesinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=17170433;
 //BA.debugLineNum = 17170433;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=17170436;
 //BA.debugLineNum = 17170436;BA.debugLine="ws.Session.SetAttribute(\"CatID\",0)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("CatID",(Object)(0));
RDebugUtils.currentLine=17170438;
 //BA.debugLineNum = 17170438;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=17170440;
 //BA.debugLineNum = 17170440;BA.debugLine="Load_Data";
__ref._load_data /*String*/ (null);
RDebugUtils.currentLine=17170442;
 //BA.debugLineNum = 17170442;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
RDebugUtils.currentLine=17170444;
 //BA.debugLineNum = 17170444;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.expensesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expensesinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=17235972;
 //BA.debugLineNum = 17235972;BA.debugLine="End Sub";
return "";
}
}