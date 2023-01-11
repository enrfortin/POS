package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class usersinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.usersinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.usersinformation.class).invoke(this, new Object[] {null});
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
public String  _class_globals(b4j.example.usersinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="usersinformation";
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="Private divlist As JQueryElement";
_divlist = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=21626884;
 //BA.debugLineNum = 21626884;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=21626885;
 //BA.debugLineNum = 21626885;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=21626887;
 //BA.debugLineNum = 21626887;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table(b4j.example.usersinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="usersinformation";
if (Debug.shouldDelegate(ba, "delete_button_table", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Private Sub Delete_button_table(params As Map)";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("222020097",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=22020099;
 //BA.debugLineNum = 22020099;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=22020101;
 //BA.debugLineNum = 22020101;BA.debugLine="sql1.ExecNonQuery(\"delete from UsersInformation w";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from UsersInformation where UserID="+BA.ObjectToString(_params.Get((Object)("val"))));
RDebugUtils.currentLine=22020102;
 //BA.debugLineNum = 22020102;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=22020104;
 //BA.debugLineNum = 22020104;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.reload(true)",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=22020106;
 //BA.debugLineNum = 22020106;BA.debugLine="End Sub";
return "";
}
public String  _edit_button_table(b4j.example.usersinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="usersinformation";
if (Debug.shouldDelegate(ba, "edit_button_table", false))
	 {return ((String) Debug.delegate(ba, "edit_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Private Sub Edit_button_table(params As Map)";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("221954561",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=21954563;
 //BA.debugLineNum = 21954563;BA.debugLine="ws.Session.SetAttribute(\"tempUserID\",params.Get(\"";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("tempUserID",_params.Get((Object)("val")));
RDebugUtils.currentLine=21954565;
 //BA.debugLineNum = 21954565;BA.debugLine="ws.Eval(\"document.location.replace('AddUsersInfo.";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('AddUsersInfo.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=21954567;
 //BA.debugLineNum = 21954567;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.usersinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="usersinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="End Sub";
return "";
}
public String  _load_data(b4j.example.usersinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="usersinformation";
if (Debug.shouldDelegate(ba, "load_data", false))
	 {return ((String) Debug.delegate(ba, "load_data", null));}
String _str = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cursor = null;
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Sub Load_Data";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="Try";
try {RDebugUtils.currentLine=21889027;
 //BA.debugLineNum = 21889027;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=21889028;
 //BA.debugLineNum = 21889028;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">User Full Name</th>\n"+"									                  <th class=\"wd-15p\">User Email</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=21889039;
 //BA.debugLineNum = 21889039;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=21889040;
 //BA.debugLineNum = 21889040;BA.debugLine="Cursor = sql1.ExecQuery(\"select * from UsersInfo";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from UsersInformation");
RDebugUtils.currentLine=21889042;
 //BA.debugLineNum = 21889042;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=21889044;
 //BA.debugLineNum = 21889044;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=21889045;
 //BA.debugLineNum = 21889045;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"UserID\")";
_str = _str+"<td>"+_cursor.GetString("UserID")+"</td>";
RDebugUtils.currentLine=21889046;
 //BA.debugLineNum = 21889046;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"UserFullN";
_str = _str+"<td>"+_cursor.GetString("UserFullName")+"</td>";
RDebugUtils.currentLine=21889047;
 //BA.debugLineNum = 21889047;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"UserEmail";
_str = _str+"<td>"+_cursor.GetString("UserEmailAddress")+"</td>";
RDebugUtils.currentLine=21889049;
 //BA.debugLineNum = 21889049;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("UserID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "+" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("UserID"))+")\"></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=21889055;
 //BA.debugLineNum = 21889055;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=21889057;
 //BA.debugLineNum = 21889057;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
RDebugUtils.currentLine=21889059;
 //BA.debugLineNum = 21889059;BA.debugLine="divlist.SetHtml(str)";
__ref._divlist /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=21889063;
 //BA.debugLineNum = 21889063;BA.debugLine="Log(LastException)";
__c.LogImpl("221889063",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=21889065;
 //BA.debugLineNum = 21889065;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.usersinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="usersinformation";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="Try";
try {RDebugUtils.currentLine=22085635;
 //BA.debugLineNum = 22085635;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=22085636;
 //BA.debugLineNum = 22085636;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"          responsive: true,\n"+"          language: {\n"+"            searchPlaceholder: 'Search...',\n"+"            sSearch: '',\n"+"            lengthMenu: '_MENU_ items/page',\n"+"          }\n"+"        });\n"+"\n"+"      \n"+"        // Select2\n"+"        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"+"\n"+"      });");
RDebugUtils.currentLine=22085654;
 //BA.debugLineNum = 22085654;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=22085657;
 //BA.debugLineNum = 22085657;BA.debugLine="Log(LastException)";
__c.LogImpl("222085657",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=22085659;
 //BA.debugLineNum = 22085659;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.usersinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="usersinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=21757958;
 //BA.debugLineNum = 21757958;BA.debugLine="ws.Session.SetAttribute(\"tempUserID\",0)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("tempUserID",(Object)(0));
RDebugUtils.currentLine=21757960;
 //BA.debugLineNum = 21757960;BA.debugLine="Load_Data";
__ref._load_data /*String*/ (null);
RDebugUtils.currentLine=21757961;
 //BA.debugLineNum = 21757961;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
RDebugUtils.currentLine=21757963;
 //BA.debugLineNum = 21757963;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.usersinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="usersinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=21823492;
 //BA.debugLineNum = 21823492;BA.debugLine="End Sub";
return "";
}
}