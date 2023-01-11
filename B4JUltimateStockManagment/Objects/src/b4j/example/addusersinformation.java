package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class addusersinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.addusersinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.addusersinformation.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtname = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtuseremail = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtuserpassword = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _btnsave = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _btncancel = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblusernamemain = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divmenu = null;
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public b4j.example.main _main = null;
public String  _btncancel_click(b4j.example.addusersinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addusersinformation";
if (Debug.shouldDelegate(ba, "btncancel_click", false))
	 {return ((String) Debug.delegate(ba, "btncancel_click", new Object[] {_params}));}
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Sub btncancel_Click (Params As Map)";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="ws.Eval(\"document.location.replace('UsersInforma";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('UsersInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="End Sub";
return "";
}
public String  _btnsave_click(b4j.example.addusersinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addusersinformation";
if (Debug.shouldDelegate(ba, "btnsave_click", false))
	 {return ((String) Debug.delegate(ba, "btnsave_click", new Object[] {_params}));}
int _userid = 0;
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Sub btnsave_Click (Params As Map)";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Try";
try {RDebugUtils.currentLine=13697027;
 //BA.debugLineNum = 13697027;BA.debugLine="If txtname.GetVal.Value = \"\" Or txtname.GetVal.V";
if ((__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtuserpassword /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=13697028;
 //BA.debugLineNum = 13697028;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=13697031;
 //BA.debugLineNum = 13697031;BA.debugLine="Dim UserID As Int = ws.Session.GetAttribute(\"tem";
_userid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("tempUserID")));
RDebugUtils.currentLine=13697032;
 //BA.debugLineNum = 13697032;BA.debugLine="If UserID > 0 Then";
if (_userid>0) { 
RDebugUtils.currentLine=13697034;
 //BA.debugLineNum = 13697034;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=13697035;
 //BA.debugLineNum = 13697035;BA.debugLine="sql1.ExecNonQuery2(\"Update UsersInformation se";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("Update UsersInformation set [UserFullName]=?,[UserEmailAddress]=?,[UserPassword]=?  where UserID=? ",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtuseremail /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtuserpassword /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_userid)}));
RDebugUtils.currentLine=13697037;
 //BA.debugLineNum = 13697037;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }else {
RDebugUtils.currentLine=13697040;
 //BA.debugLineNum = 13697040;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=13697041;
 //BA.debugLineNum = 13697041;BA.debugLine="sql1.ExecNonQuery2(\"insert into UsersInformati";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("insert into UsersInformation (UserFullName,UserEmailAddress,UserPassword) values (?,?,?) ",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtuseremail /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtuserpassword /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()}));
RDebugUtils.currentLine=13697043;
 //BA.debugLineNum = 13697043;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 };
RDebugUtils.currentLine=13697047;
 //BA.debugLineNum = 13697047;BA.debugLine="Main.Insert_UsersLogs(ws,\"Users Information\")";
_main._insert_userslogs /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,"Users Information");
RDebugUtils.currentLine=13697050;
 //BA.debugLineNum = 13697050;BA.debugLine="ws.Eval(\"document.location.replace('UsersInforma";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('UsersInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=13697053;
 //BA.debugLineNum = 13697053;BA.debugLine="Log(LastException)";
__c.LogImpl("213697053",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=13697055;
 //BA.debugLineNum = 13697055;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.addusersinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addusersinformation";
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="Private txtname,txtuseremail,txtuserpassword,btns";
_txtname = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtuseremail = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtuserpassword = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_btnsave = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_btncancel = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=13434885;
 //BA.debugLineNum = 13434885;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=13434887;
 //BA.debugLineNum = 13434887;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.addusersinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="addusersinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="End Sub";
return "";
}
public String  _load_data_byid(b4j.example.addusersinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addusersinformation";
if (Debug.shouldDelegate(ba, "load_data_byid", false))
	 {return ((String) Debug.delegate(ba, "load_data_byid", null));}
int _userid = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Sub Load_Data_ByID";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="Try";
try {RDebugUtils.currentLine=13828099;
 //BA.debugLineNum = 13828099;BA.debugLine="Dim UserID As Int = ws.Session.GetAttribute(\"tem";
_userid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("tempUserID")));
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="If UserID > 0 Then";
if (_userid>0) { 
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=13828103;
 //BA.debugLineNum = 13828103;BA.debugLine="rs = sql1.ExecQuery(\"select * from UsersInforma";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from UsersInformation where UserID="+BA.NumberToString(_userid));
RDebugUtils.currentLine=13828104;
 //BA.debugLineNum = 13828104;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=13828105;
 //BA.debugLineNum = 13828105;BA.debugLine="txtname.SetVal(rs.GetString(\"UserFullName\"))";
__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("UserFullName")));
RDebugUtils.currentLine=13828106;
 //BA.debugLineNum = 13828106;BA.debugLine="txtuseremail.SetVal(rs.GetString(\"UserEmailAdd";
__ref._txtuseremail /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("UserEmailAddress")));
RDebugUtils.currentLine=13828107;
 //BA.debugLineNum = 13828107;BA.debugLine="txtuserpassword.SetVal(rs.GetString(\"UserPassw";
__ref._txtuserpassword /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("UserPassword")));
 }
;
RDebugUtils.currentLine=13828110;
 //BA.debugLineNum = 13828110;BA.debugLine="rs.Close";
_rs.Close();
 };
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=13828115;
 //BA.debugLineNum = 13828115;BA.debugLine="Log(LastException)";
__c.LogImpl("213828115",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=13828117;
 //BA.debugLineNum = 13828117;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.addusersinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="addusersinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=13565955;
 //BA.debugLineNum = 13565955;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=13565957;
 //BA.debugLineNum = 13565957;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=13565959;
 //BA.debugLineNum = 13565959;BA.debugLine="Load_Data_ByID";
__ref._load_data_byid /*String*/ (null);
RDebugUtils.currentLine=13565961;
 //BA.debugLineNum = 13565961;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.addusersinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addusersinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=13631492;
 //BA.debugLineNum = 13631492;BA.debugLine="End Sub";
return "";
}
}