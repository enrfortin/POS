package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class login extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.login", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.login.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtemail = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtpassword = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _btnlogin = null;
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public b4j.example.main _main = null;
public String  _btnlogin_click(b4j.example.login __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(ba, "btnlogin_click", false))
	 {return ((String) Debug.delegate(ba, "btnlogin_click", new Object[] {_params}));}
int _intisfound = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub btnlogin_Click (Params As Map)";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Try";
try {RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="Dim intIsFound As Int = 0";
_intisfound = (int) (0);
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="rs = sql1.ExecQuery2(\"select * from UsersInforma";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2("select * from UsersInformation where UserEmailAddress=? and UserPassword=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtemail /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtpassword /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()}));
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="intIsFound = 1";
_intisfound = (int) (1);
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="ws.Session.SetAttribute(\"UserID\",rs.GetInt(\"Use";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("UserID",(Object)(_rs.GetInt("UserID")));
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="ws.Session.SetAttribute(\"UserFullName\",rs.GetSt";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("UserFullName",(Object)(_rs.GetString("UserFullName")));
RDebugUtils.currentLine=5242890;
 //BA.debugLineNum = 5242890;BA.debugLine="ws.Session.SetAttribute(\"UserEmailAddress\",rs.G";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("UserEmailAddress",(Object)(_rs.GetString("UserEmailAddress")));
 }
;
RDebugUtils.currentLine=5242893;
 //BA.debugLineNum = 5242893;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=5242895;
 //BA.debugLineNum = 5242895;BA.debugLine="Load_CompanyInformation";
__ref._load_companyinformation /*String*/ (null);
RDebugUtils.currentLine=5242897;
 //BA.debugLineNum = 5242897;BA.debugLine="If intIsFound = 1 Then";
if (_intisfound==1) { 
RDebugUtils.currentLine=5242898;
 //BA.debugLineNum = 5242898;BA.debugLine="ws.Eval(\"document.location.replace('index.html'";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('index.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 }else {
RDebugUtils.currentLine=5242900;
 //BA.debugLineNum = 5242900;BA.debugLine="ws.Eval(\"document.location.replace('login.html'";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('login.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 };
 } 
       catch (Exception e19) {
			ba.setLastException(e19);RDebugUtils.currentLine=5242905;
 //BA.debugLineNum = 5242905;BA.debugLine="Log(LastException)";
__c.LogImpl("25242905",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=5242907;
 //BA.debugLineNum = 5242907;BA.debugLine="End Sub";
return "";
}
public String  _load_companyinformation(b4j.example.login __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(ba, "load_companyinformation", false))
	 {return ((String) Debug.delegate(ba, "load_companyinformation", null));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub Load_CompanyInformation";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Try";
try {RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="rs = sql1.ExecQuery(\"select * from CompaniesInfo";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from CompaniesInformation limit 1");
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="ws.Session.SetAttribute(\"CompanyID\",rs.GetInt(\"";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("CompanyID",(Object)(_rs.GetInt("CompanyID")));
 }
;
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="rs.Close";
_rs.Close();
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=5308426;
 //BA.debugLineNum = 5308426;BA.debugLine="Log(LastException)";
__c.LogImpl("25308426",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=5308428;
 //BA.debugLineNum = 5308428;BA.debugLine="End Sub";
return "";
}
public String  _btnloginpos_click(b4j.example.login __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(ba, "btnloginpos_click", false))
	 {return ((String) Debug.delegate(ba, "btnloginpos_click", new Object[] {_params}));}
int _intisfound = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub btnloginpos_Click (Params As Map)";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Try";
try {RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="Dim intIsFound As Int = 0";
_intisfound = (int) (0);
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="rs = sql1.ExecQuery2(\"select * from UsersInforma";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2("select * from UsersInformation where UserEmailAddress=? and UserPassword=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtemail /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtpassword /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()}));
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="intIsFound = 1";
_intisfound = (int) (1);
RDebugUtils.currentLine=5373960;
 //BA.debugLineNum = 5373960;BA.debugLine="ws.Session.SetAttribute(\"UserID\",rs.GetInt(\"Use";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("UserID",(Object)(_rs.GetInt("UserID")));
RDebugUtils.currentLine=5373961;
 //BA.debugLineNum = 5373961;BA.debugLine="ws.Session.SetAttribute(\"UserFullName\",rs.GetSt";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("UserFullName",(Object)(_rs.GetString("UserFullName")));
RDebugUtils.currentLine=5373962;
 //BA.debugLineNum = 5373962;BA.debugLine="ws.Session.SetAttribute(\"UserEmailAddress\",rs.G";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("UserEmailAddress",(Object)(_rs.GetString("UserEmailAddress")));
 }
;
RDebugUtils.currentLine=5373965;
 //BA.debugLineNum = 5373965;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=5373967;
 //BA.debugLineNum = 5373967;BA.debugLine="Load_CompanyInformation";
__ref._load_companyinformation /*String*/ (null);
RDebugUtils.currentLine=5373969;
 //BA.debugLineNum = 5373969;BA.debugLine="If intIsFound = 1 Then";
if (_intisfound==1) { 
RDebugUtils.currentLine=5373970;
 //BA.debugLineNum = 5373970;BA.debugLine="ws.Eval(\"document.location.replace('POS/POS.htm";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('POS/POS.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 }else {
RDebugUtils.currentLine=5373972;
 //BA.debugLineNum = 5373972;BA.debugLine="ws.Eval(\"document.location.replace('login.html'";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('login.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 };
 } 
       catch (Exception e19) {
			ba.setLastException(e19);RDebugUtils.currentLine=5373977;
 //BA.debugLineNum = 5373977;BA.debugLine="Log(LastException)";
__c.LogImpl("25373977",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=5373979;
 //BA.debugLineNum = 5373979;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.login __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="login";
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Private txtemail,txtpassword,btnlogin As JQueryEl";
_txtemail = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtpassword = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_btnlogin = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.login __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.login __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="ws.Session.SetAttribute(\"UserID\",0)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("UserID",(Object)(0));
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="ws.Session.SetAttribute(\"UserFullName\",0)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("UserFullName",(Object)(0));
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="ws.Session.SetAttribute(\"UserEmailAddress\",0)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("UserEmailAddress",(Object)(0));
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=5111817;
 //BA.debugLineNum = 5111817;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.login __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="End Sub";
return "";
}
}