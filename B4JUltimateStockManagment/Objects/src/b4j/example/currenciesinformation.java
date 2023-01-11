package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class currenciesinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.currenciesinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.currenciesinformation.class).invoke(this, new Object[] {null});
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
public String  _class_globals(b4j.example.currenciesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="currenciesinformation";
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="Private divlist As JQueryElement";
_divlist = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=16515075;
 //BA.debugLineNum = 16515075;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=16515076;
 //BA.debugLineNum = 16515076;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=16515077;
 //BA.debugLineNum = 16515077;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=16515079;
 //BA.debugLineNum = 16515079;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table(b4j.example.currenciesinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="currenciesinformation";
if (Debug.shouldDelegate(ba, "delete_button_table", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Private Sub Delete_button_table(params As Map)";
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=16908292;
 //BA.debugLineNum = 16908292;BA.debugLine="sql1.ExecNonQuery(\"delete from CurrenciesInformat";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from CurrenciesInformation where CurrencyID="+BA.ObjectToString(_params.Get((Object)("val"))));
RDebugUtils.currentLine=16908293;
 //BA.debugLineNum = 16908293;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=16908295;
 //BA.debugLineNum = 16908295;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.reload(true)",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=16908297;
 //BA.debugLineNum = 16908297;BA.debugLine="End Sub";
return "";
}
public String  _edit_button_table(b4j.example.currenciesinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="currenciesinformation";
if (Debug.shouldDelegate(ba, "edit_button_table", false))
	 {return ((String) Debug.delegate(ba, "edit_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Private Sub Edit_button_table(params As Map)";
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="ws.Session.SetAttribute(\"CurrencyID\",params.Get(\"";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("CurrencyID",_params.Get((Object)("val")));
RDebugUtils.currentLine=16842756;
 //BA.debugLineNum = 16842756;BA.debugLine="ws.Eval(\"document.location.replace('AddCurrencyIn";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('AddCurrencyInfo.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=16842758;
 //BA.debugLineNum = 16842758;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.currenciesinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="currenciesinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="End Sub";
return "";
}
public String  _load_data(b4j.example.currenciesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="currenciesinformation";
if (Debug.shouldDelegate(ba, "load_data", false))
	 {return ((String) Debug.delegate(ba, "load_data", null));}
String _str = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cursor = null;
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Sub Load_Data";
RDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="Try";
try {RDebugUtils.currentLine=16777219;
 //BA.debugLineNum = 16777219;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=16777220;
 //BA.debugLineNum = 16777220;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Name</th>\n"+"									                  <th class=\"wd-15p\">Symbol</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=16777232;
 //BA.debugLineNum = 16777232;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=16777233;
 //BA.debugLineNum = 16777233;BA.debugLine="Cursor = sql1.ExecQuery(\"select * from Currencie";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from CurrenciesInformation");
RDebugUtils.currentLine=16777235;
 //BA.debugLineNum = 16777235;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=16777237;
 //BA.debugLineNum = 16777237;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=16777238;
 //BA.debugLineNum = 16777238;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"CurrencyI";
_str = _str+"<td>"+_cursor.GetString("CurrencyID")+"</td>";
RDebugUtils.currentLine=16777239;
 //BA.debugLineNum = 16777239;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"CurrencyN";
_str = _str+"<td>"+_cursor.GetString("CurrencyName")+"</td>";
RDebugUtils.currentLine=16777240;
 //BA.debugLineNum = 16777240;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"CurrencyS";
_str = _str+"<td>"+_cursor.GetString("CurrencySymbol")+"</td>";
RDebugUtils.currentLine=16777242;
 //BA.debugLineNum = 16777242;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("CurrencyID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "+" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("CurrencyID"))+")\"></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=16777248;
 //BA.debugLineNum = 16777248;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=16777250;
 //BA.debugLineNum = 16777250;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
RDebugUtils.currentLine=16777252;
 //BA.debugLineNum = 16777252;BA.debugLine="divlist.SetHtml(str)";
__ref._divlist /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=16777256;
 //BA.debugLineNum = 16777256;BA.debugLine="Log(LastException)";
__c.LogImpl("216777256",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=16777258;
 //BA.debugLineNum = 16777258;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.currenciesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="currenciesinformation";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="Try";
try {RDebugUtils.currentLine=16973827;
 //BA.debugLineNum = 16973827;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=16973828;
 //BA.debugLineNum = 16973828;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"          responsive: true,\n"+"          language: {\n"+"            searchPlaceholder: 'Search...',\n"+"            sSearch: '',\n"+"            lengthMenu: '_MENU_ items/page',\n"+"          }\n"+"        });\n"+"\n"+"      \n"+"        // Select2\n"+"        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"+"\n"+"      });");
RDebugUtils.currentLine=16973846;
 //BA.debugLineNum = 16973846;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=16973849;
 //BA.debugLineNum = 16973849;BA.debugLine="Log(LastException)";
__c.LogImpl("216973849",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=16973851;
 //BA.debugLineNum = 16973851;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.currenciesinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="currenciesinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="ws.Session.SetAttribute(\"CurrencyID\",0)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("CurrencyID",(Object)(0));
RDebugUtils.currentLine=16646150;
 //BA.debugLineNum = 16646150;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=16646153;
 //BA.debugLineNum = 16646153;BA.debugLine="Load_Data";
__ref._load_data /*String*/ (null);
RDebugUtils.currentLine=16646155;
 //BA.debugLineNum = 16646155;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
RDebugUtils.currentLine=16646157;
 //BA.debugLineNum = 16646157;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.currenciesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="currenciesinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=16711684;
 //BA.debugLineNum = 16711684;BA.debugLine="End Sub";
return "";
}
}