package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class addcurrenciesinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.addcurrenciesinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.addcurrenciesinformation.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtsymbol = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblusernamemain = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divmenu = null;
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public b4j.example.main _main = null;
public String  _btncancel_click(b4j.example.addcurrenciesinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addcurrenciesinformation";
if (Debug.shouldDelegate(ba, "btncancel_click", false))
	 {return ((String) Debug.delegate(ba, "btncancel_click", new Object[] {_params}));}
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub btncancel_Click (Params As Map)";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="ws.Eval(\"document.location.replace('CurrenciesIn";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('CurrenciesInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="End Sub";
return "";
}
public String  _btnsave_click(b4j.example.addcurrenciesinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addcurrenciesinformation";
if (Debug.shouldDelegate(ba, "btnsave_click", false))
	 {return ((String) Debug.delegate(ba, "btnsave_click", new Object[] {_params}));}
int _currencyid = 0;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub btnsave_Click (Params As Map)";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Try";
try {RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="If txtname.GetVal.Value = \"\" Or txtsymbol.GetVal";
if ((__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtsymbol /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=6684679;
 //BA.debugLineNum = 6684679;BA.debugLine="Dim CurrencyID As Int = ws.Session.GetAttribute(";
_currencyid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("CurrencyID")));
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="If CurrencyID > 0 Then";
if (_currencyid>0) { 
RDebugUtils.currentLine=6684681;
 //BA.debugLineNum = 6684681;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=6684682;
 //BA.debugLineNum = 6684682;BA.debugLine="sql1.ExecNonQuery2(\"Update CurrenciesInformati";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("Update CurrenciesInformation set CurrencyName=?,CurrencySymbol=? where CurrencyID=? ",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtsymbol /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_currencyid)}));
RDebugUtils.currentLine=6684684;
 //BA.debugLineNum = 6684684;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }else {
RDebugUtils.currentLine=6684687;
 //BA.debugLineNum = 6684687;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=6684688;
 //BA.debugLineNum = 6684688;BA.debugLine="sql1.ExecNonQuery2(\"insert into CurrenciesInfo";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("insert into CurrenciesInformation (CurrencyName,CurrencySymbol) values (?,?) ",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtsymbol /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()}));
RDebugUtils.currentLine=6684690;
 //BA.debugLineNum = 6684690;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 };
RDebugUtils.currentLine=6684694;
 //BA.debugLineNum = 6684694;BA.debugLine="Main.Insert_UsersLogs(ws,\"Currency Information\")";
_main._insert_userslogs /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,"Currency Information");
RDebugUtils.currentLine=6684697;
 //BA.debugLineNum = 6684697;BA.debugLine="ws.Eval(\"document.location.replace('CurrenciesIn";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('CurrenciesInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=6684700;
 //BA.debugLineNum = 6684700;BA.debugLine="Log(LastException)";
__c.LogImpl("26684700",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=6684702;
 //BA.debugLineNum = 6684702;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.addcurrenciesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addcurrenciesinformation";
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="Private txtname,txtsymbol As JQueryElement";
_txtname = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtsymbol = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.addcurrenciesinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="addcurrenciesinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="End Sub";
return "";
}
public String  _load_data_byid(b4j.example.addcurrenciesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addcurrenciesinformation";
if (Debug.shouldDelegate(ba, "load_data_byid", false))
	 {return ((String) Debug.delegate(ba, "load_data_byid", null));}
int _currencyid = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub Load_Data_ByID";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Try";
try {RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="Dim CurrencyID As Int = ws.Session.GetAttribute(";
_currencyid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("CurrencyID")));
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="If CurrencyID > 0 Then";
if (_currencyid>0) { 
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=6815751;
 //BA.debugLineNum = 6815751;BA.debugLine="rs = sql1.ExecQuery(\"select * from  CurrenciesI";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from  CurrenciesInformation where CurrencyID="+BA.NumberToString(_currencyid));
RDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=6815754;
 //BA.debugLineNum = 6815754;BA.debugLine="txtname.SetVal(rs.GetString(\"CurrencyName\"))";
__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("CurrencyName")));
RDebugUtils.currentLine=6815755;
 //BA.debugLineNum = 6815755;BA.debugLine="txtsymbol.SetVal(rs.GetString(\"CurrencySymbol\"";
__ref._txtsymbol /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("CurrencySymbol")));
 }
;
RDebugUtils.currentLine=6815758;
 //BA.debugLineNum = 6815758;BA.debugLine="rs.Close";
_rs.Close();
 };
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=6815764;
 //BA.debugLineNum = 6815764;BA.debugLine="Log(LastException)";
__c.LogImpl("26815764",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=6815766;
 //BA.debugLineNum = 6815766;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.addcurrenciesinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="addcurrenciesinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="Load_Data_ByID";
__ref._load_data_byid /*String*/ (null);
RDebugUtils.currentLine=6553607;
 //BA.debugLineNum = 6553607;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.addcurrenciesinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addcurrenciesinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="End Sub";
return "";
}
}