package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class userslogsinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.userslogsinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.userslogsinformation.class).invoke(this, new Object[] {null});
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
public String  _class_globals(b4j.example.userslogsinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userslogsinformation";
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="Private divlist As JQueryElement";
_divlist = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=22151171;
 //BA.debugLineNum = 22151171;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=22151172;
 //BA.debugLineNum = 22151172;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=22151173;
 //BA.debugLineNum = 22151173;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=22151175;
 //BA.debugLineNum = 22151175;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.userslogsinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="userslogsinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="End Sub";
return "";
}
public String  _load_data(b4j.example.userslogsinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userslogsinformation";
if (Debug.shouldDelegate(ba, "load_data", false))
	 {return ((String) Debug.delegate(ba, "load_data", null));}
String _str = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cursor = null;
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Sub Load_Data";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="Try";
try {RDebugUtils.currentLine=22413315;
 //BA.debugLineNum = 22413315;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=22413316;
 //BA.debugLineNum = 22413316;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">Transaction ID</th>\n"+"									                  <th class=\"wd-15p\">User Full Name</th>\n"+"									                  <th class=\"wd-15p\">Description</th>\n"+"													  <th class=\"wd-25p\">Datetime</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=22413327;
 //BA.debugLineNum = 22413327;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=22413328;
 //BA.debugLineNum = 22413328;BA.debugLine="Cursor = sql1.ExecQuery(\"SELECT        UsersLogs";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT        UsersLogs.UserLogID, UsersLogs.UserID, UsersLogs.ActivityDesc, UsersLogs.ActivityDatetime, UsersInformation.UserFullName "+" FROM            UsersLogs LEFT OUTER JOIN "+" UsersInformation ON UsersLogs.UserID = UsersInformation.UserID order by UsersLogs.UserLogID desc");
RDebugUtils.currentLine=22413332;
 //BA.debugLineNum = 22413332;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=22413334;
 //BA.debugLineNum = 22413334;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=22413335;
 //BA.debugLineNum = 22413335;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"UserLogID";
_str = _str+"<td>"+_cursor.GetString("UserLogID")+"</td>";
RDebugUtils.currentLine=22413336;
 //BA.debugLineNum = 22413336;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"UserFullN";
_str = _str+"<td>"+_cursor.GetString("UserFullName")+"</td>";
RDebugUtils.currentLine=22413337;
 //BA.debugLineNum = 22413337;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ActivityD";
_str = _str+"<td>"+_cursor.GetString("ActivityDesc")+"</td>";
RDebugUtils.currentLine=22413338;
 //BA.debugLineNum = 22413338;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ActivityD";
_str = _str+"<td>"+_cursor.GetString("ActivityDatetime")+"</td></tr>";
 }
;
RDebugUtils.currentLine=22413342;
 //BA.debugLineNum = 22413342;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=22413344;
 //BA.debugLineNum = 22413344;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
RDebugUtils.currentLine=22413346;
 //BA.debugLineNum = 22413346;BA.debugLine="divlist.SetHtml(str)";
__ref._divlist /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=22413350;
 //BA.debugLineNum = 22413350;BA.debugLine="Log(LastException)";
__c.LogImpl("222413350",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=22413352;
 //BA.debugLineNum = 22413352;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.userslogsinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userslogsinformation";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="Try";
try {RDebugUtils.currentLine=22478851;
 //BA.debugLineNum = 22478851;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=22478852;
 //BA.debugLineNum = 22478852;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"          responsive: true,\n"+"          language: {\n"+"            searchPlaceholder: 'Search...',\n"+"            sSearch: '',\n"+"            lengthMenu: '_MENU_ items/page',\n"+"          }\n"+"        });\n"+"\n"+"      \n"+"        // Select2\n"+"        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"+"\n"+"      });");
RDebugUtils.currentLine=22478870;
 //BA.debugLineNum = 22478870;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=22478873;
 //BA.debugLineNum = 22478873;BA.debugLine="Log(LastException)";
__c.LogImpl("222478873",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=22478875;
 //BA.debugLineNum = 22478875;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.userslogsinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="userslogsinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=22282244;
 //BA.debugLineNum = 22282244;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=22282247;
 //BA.debugLineNum = 22282247;BA.debugLine="Load_Data";
__ref._load_data /*String*/ (null);
RDebugUtils.currentLine=22282248;
 //BA.debugLineNum = 22282248;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
RDebugUtils.currentLine=22282250;
 //BA.debugLineNum = 22282250;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.userslogsinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userslogsinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=22347780;
 //BA.debugLineNum = 22347780;BA.debugLine="End Sub";
return "";
}
}