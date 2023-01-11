package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class addcatinfo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.addcatinfo", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.addcatinfo.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblusernamemain = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divmenu = null;
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public b4j.example.main _main = null;
public String  _btncancel_click(b4j.example.addcatinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addcatinfo";
if (Debug.shouldDelegate(ba, "btncancel_click", false))
	 {return ((String) Debug.delegate(ba, "btncancel_click", new Object[] {_params}));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub btncancel_Click (Params As Map)";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="ws.Eval(\"document.location.replace('CatsInformat";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('CatsInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="End Sub";
return "";
}
public String  _btnsave_click(b4j.example.addcatinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addcatinfo";
if (Debug.shouldDelegate(ba, "btnsave_click", false))
	 {return ((String) Debug.delegate(ba, "btnsave_click", new Object[] {_params}));}
int _catid = 0;
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub btnsave_Click (Params As Map)";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Try";
try {RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="If txtname.GetVal.Value = \"\" Then";
if ((__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=6225927;
 //BA.debugLineNum = 6225927;BA.debugLine="Dim CatID As Int = ws.Session.GetAttribute(\"CatI";
_catid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("CatID")));
RDebugUtils.currentLine=6225928;
 //BA.debugLineNum = 6225928;BA.debugLine="If CatID > 0 Then";
if (_catid>0) { 
RDebugUtils.currentLine=6225929;
 //BA.debugLineNum = 6225929;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=6225930;
 //BA.debugLineNum = 6225930;BA.debugLine="sql1.ExecNonQuery2(\"Update CatInfo set [CatDes";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("Update CatInfo set [CatDesc]=?  where CatID=? ",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_catid)}));
RDebugUtils.currentLine=6225932;
 //BA.debugLineNum = 6225932;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }else {
RDebugUtils.currentLine=6225935;
 //BA.debugLineNum = 6225935;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=6225936;
 //BA.debugLineNum = 6225936;BA.debugLine="sql1.ExecNonQuery2(\"insert into CatInfo (CatDe";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("insert into CatInfo (CatDesc) values (?) ",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()}));
RDebugUtils.currentLine=6225938;
 //BA.debugLineNum = 6225938;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 };
RDebugUtils.currentLine=6225942;
 //BA.debugLineNum = 6225942;BA.debugLine="Main.Insert_UsersLogs(ws,\"Categories Information";
_main._insert_userslogs /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,"Categories Information");
RDebugUtils.currentLine=6225945;
 //BA.debugLineNum = 6225945;BA.debugLine="ws.Eval(\"document.location.replace('CatsInformat";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('CatsInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=6225948;
 //BA.debugLineNum = 6225948;BA.debugLine="Log(LastException)";
__c.LogImpl("26225948",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=6225950;
 //BA.debugLineNum = 6225950;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.addcatinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addcatinfo";
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="Private txtname As JQueryElement";
_txtname = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=5963784;
 //BA.debugLineNum = 5963784;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.addcatinfo __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="addcatinfo";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="End Sub";
return "";
}
public String  _load_data_byid(b4j.example.addcatinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addcatinfo";
if (Debug.shouldDelegate(ba, "load_data_byid", false))
	 {return ((String) Debug.delegate(ba, "load_data_byid", null));}
int _catid = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub Load_Data_ByID";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Try";
try {RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="Dim CatID As Int = ws.Session.GetAttribute(\"CatI";
_catid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("CatID")));
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="If CatID > 0 Then";
if (_catid>0) { 
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="rs = sql1.ExecQuery(\"select * from  CatInfo whe";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from  CatInfo where CatID="+BA.NumberToString(_catid));
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=6357002;
 //BA.debugLineNum = 6357002;BA.debugLine="txtname.SetVal(rs.GetString(\"CatDesc\"))";
__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("CatDesc")));
 }
;
RDebugUtils.currentLine=6357005;
 //BA.debugLineNum = 6357005;BA.debugLine="rs.Close";
_rs.Close();
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=6357010;
 //BA.debugLineNum = 6357010;BA.debugLine="Log(LastException)";
__c.LogImpl("26357010",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=6357012;
 //BA.debugLineNum = 6357012;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.addcatinfo __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="addcatinfo";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="Load_Data_ByID";
__ref._load_data_byid /*String*/ (null);
RDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.addcatinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addcatinfo";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="End Sub";
return "";
}
}