package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class addwarehouseinfo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.addwarehouseinfo", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.addwarehouseinfo.class).invoke(this, new Object[] {null});
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
public String  _btncancel_click(b4j.example.addwarehouseinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addwarehouseinfo";
if (Debug.shouldDelegate(ba, "btncancel_click", false))
	 {return ((String) Debug.delegate(ba, "btncancel_click", new Object[] {_params}));}
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Sub btncancel_Click (Params As Map)";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="ws.Eval(\"document.location.replace('WarehouseInf";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('WarehouseInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="End Sub";
return "";
}
public String  _btnsave_click(b4j.example.addwarehouseinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addwarehouseinfo";
if (Debug.shouldDelegate(ba, "btnsave_click", false))
	 {return ((String) Debug.delegate(ba, "btnsave_click", new Object[] {_params}));}
int _catid = 0;
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Sub btnsave_Click (Params As Map)";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="Try";
try {RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="If txtname.GetVal.Value = \"\" Then";
if ((__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=14155780;
 //BA.debugLineNum = 14155780;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=14155783;
 //BA.debugLineNum = 14155783;BA.debugLine="Dim CatID As Int = ws.Session.GetAttribute(\"CatI";
_catid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("CatID")));
RDebugUtils.currentLine=14155784;
 //BA.debugLineNum = 14155784;BA.debugLine="If CatID > 0 Then";
if (_catid>0) { 
RDebugUtils.currentLine=14155785;
 //BA.debugLineNum = 14155785;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=14155786;
 //BA.debugLineNum = 14155786;BA.debugLine="sql1.ExecNonQuery2(\"Update WarehouseInfo set W";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("Update WarehouseInfo set WarehouseDesc=?  where WarehouseID=? ",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_catid)}));
RDebugUtils.currentLine=14155788;
 //BA.debugLineNum = 14155788;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }else {
RDebugUtils.currentLine=14155791;
 //BA.debugLineNum = 14155791;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=14155792;
 //BA.debugLineNum = 14155792;BA.debugLine="sql1.ExecNonQuery2(\"insert into WarehouseInfo";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("insert into WarehouseInfo (WarehouseDesc) values (?) ",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()}));
RDebugUtils.currentLine=14155794;
 //BA.debugLineNum = 14155794;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 };
RDebugUtils.currentLine=14155798;
 //BA.debugLineNum = 14155798;BA.debugLine="Main.Insert_UsersLogs(ws,\"Warehouse Information\"";
_main._insert_userslogs /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,"Warehouse Information");
RDebugUtils.currentLine=14155801;
 //BA.debugLineNum = 14155801;BA.debugLine="ws.Eval(\"document.location.replace('WarehouseInf";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('WarehouseInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=14155804;
 //BA.debugLineNum = 14155804;BA.debugLine="Log(LastException)";
__c.LogImpl("214155804",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=14155806;
 //BA.debugLineNum = 14155806;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.addwarehouseinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addwarehouseinfo";
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="Private txtname As JQueryElement";
_txtname = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=13893637;
 //BA.debugLineNum = 13893637;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=13893640;
 //BA.debugLineNum = 13893640;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.addwarehouseinfo __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="addwarehouseinfo";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="End Sub";
return "";
}
public String  _load_data_byid(b4j.example.addwarehouseinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addwarehouseinfo";
if (Debug.shouldDelegate(ba, "load_data_byid", false))
	 {return ((String) Debug.delegate(ba, "load_data_byid", null));}
int _catid = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Sub Load_Data_ByID";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="Try";
try {RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="Dim CatID As Int = ws.Session.GetAttribute(\"CatI";
_catid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("CatID")));
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="If CatID > 0 Then";
if (_catid>0) { 
RDebugUtils.currentLine=14286854;
 //BA.debugLineNum = 14286854;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=14286855;
 //BA.debugLineNum = 14286855;BA.debugLine="rs = sql1.ExecQuery(\"select * from  WarehouseIn";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from  WarehouseInfo where WarehouseID="+BA.NumberToString(_catid));
RDebugUtils.currentLine=14286856;
 //BA.debugLineNum = 14286856;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=14286858;
 //BA.debugLineNum = 14286858;BA.debugLine="txtname.SetVal(rs.GetString(\"WarehouseDesc\"))";
__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("WarehouseDesc")));
 }
;
RDebugUtils.currentLine=14286861;
 //BA.debugLineNum = 14286861;BA.debugLine="rs.Close";
_rs.Close();
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=14286866;
 //BA.debugLineNum = 14286866;BA.debugLine="Log(LastException)";
__c.LogImpl("214286866",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=14286868;
 //BA.debugLineNum = 14286868;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.addwarehouseinfo __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="addwarehouseinfo";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=14024709;
 //BA.debugLineNum = 14024709;BA.debugLine="Load_Data_ByID";
__ref._load_data_byid /*String*/ (null);
RDebugUtils.currentLine=14024711;
 //BA.debugLineNum = 14024711;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.addwarehouseinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addwarehouseinfo";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=14090244;
 //BA.debugLineNum = 14090244;BA.debugLine="End Sub";
return "";
}
}