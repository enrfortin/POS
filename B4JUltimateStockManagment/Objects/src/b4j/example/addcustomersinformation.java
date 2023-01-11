package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class addcustomersinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.addcustomersinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.addcustomersinformation.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtaddress = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtcity = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtcountry = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtphone = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtemail = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _btnsave = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _btncancel = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblusernamemain = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divmenu = null;
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public b4j.example.main _main = null;
public String  _btncancel_click(b4j.example.addcustomersinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addcustomersinformation";
if (Debug.shouldDelegate(ba, "btncancel_click", false))
	 {return ((String) Debug.delegate(ba, "btncancel_click", new Object[] {_params}));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub btncancel_Click (Params As Map)";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="ws.Eval(\"document.location.replace('CustomersInf";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('CustomersInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="End Sub";
return "";
}
public String  _btnsave_click(b4j.example.addcustomersinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addcustomersinformation";
if (Debug.shouldDelegate(ba, "btnsave_click", false))
	 {return ((String) Debug.delegate(ba, "btnsave_click", new Object[] {_params}));}
int _customerid = 0;
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub btnsave_Click (Params As Map)";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Try";
try {RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="If txtname.GetVal.Value = \"\" Or txtaddress.GetVa";
if ((__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtaddress /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtcity /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtphone /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7077896;
 //BA.debugLineNum = 7077896;BA.debugLine="Dim CustomerID As Int = ws.Session.GetAttribute(";
_customerid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("CustomerID")));
RDebugUtils.currentLine=7077897;
 //BA.debugLineNum = 7077897;BA.debugLine="If CustomerID > 0 Then";
if (_customerid>0) { 
RDebugUtils.currentLine=7077899;
 //BA.debugLineNum = 7077899;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=7077900;
 //BA.debugLineNum = 7077900;BA.debugLine="sql1.ExecNonQuery2($\"UPDATE CustomersInformati";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("UPDATE CustomersInformation\n"+"   SET CustomerName = ?\n"+"      ,CustEmail = ?\n"+"      ,CustPhone = ?\n"+"      ,CustCountry = ?\n"+"      ,CustCity = ?\n"+"      ,CustAddress = ? where CustomerID=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtemail /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtphone /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtcountry /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtcity /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtaddress /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_customerid)}));
RDebugUtils.currentLine=7077907;
 //BA.debugLineNum = 7077907;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }else {
RDebugUtils.currentLine=7077912;
 //BA.debugLineNum = 7077912;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=7077913;
 //BA.debugLineNum = 7077913;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO CustomersInfo";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO CustomersInformation(CustomerName,CustEmail,CustPhone,CustCountry,CustCity,CustAddress) VALUES (?,?,?,?,?,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtemail /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtphone /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtcountry /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtcity /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtaddress /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()}));
RDebugUtils.currentLine=7077915;
 //BA.debugLineNum = 7077915;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 };
RDebugUtils.currentLine=7077920;
 //BA.debugLineNum = 7077920;BA.debugLine="Main.Insert_UsersLogs(ws,\"Customer Information\")";
_main._insert_userslogs /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,"Customer Information");
RDebugUtils.currentLine=7077922;
 //BA.debugLineNum = 7077922;BA.debugLine="ws.Eval(\"document.location.replace('CustomersInf";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('CustomersInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=7077926;
 //BA.debugLineNum = 7077926;BA.debugLine="Log(LastException)";
__c.LogImpl("27077926",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=7077928;
 //BA.debugLineNum = 7077928;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.addcustomersinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addcustomersinformation";
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="Private txtname,txtaddress,txtcity,txtcountry,txt";
_txtname = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtaddress = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtcity = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtcountry = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtphone = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtemail = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_btnsave = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_btncancel = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=6881285;
 //BA.debugLineNum = 6881285;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.addcustomersinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="addcustomersinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="End Sub";
return "";
}
public String  _load_data_byid(b4j.example.addcustomersinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addcustomersinformation";
if (Debug.shouldDelegate(ba, "load_data_byid", false))
	 {return ((String) Debug.delegate(ba, "load_data_byid", null));}
int _customerid = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub Load_Data_ByID";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="Try";
try {RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="Dim CustomerID As Int = ws.Session.GetAttribute(";
_customerid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("CustomerID")));
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="If CustomerID > 0 Then";
if (_customerid>0) { 
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=7274503;
 //BA.debugLineNum = 7274503;BA.debugLine="rs = sql1.ExecQuery(\"select * from  CustomersIn";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from  CustomersInformation where CustomerID="+BA.NumberToString(_customerid));
RDebugUtils.currentLine=7274504;
 //BA.debugLineNum = 7274504;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=7274506;
 //BA.debugLineNum = 7274506;BA.debugLine="txtname.SetVal(rs.GetString(\"CustomerName\"))";
__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("CustomerName")));
RDebugUtils.currentLine=7274507;
 //BA.debugLineNum = 7274507;BA.debugLine="txtaddress.SetVal(rs.GetString(\"CustAddress\"))";
__ref._txtaddress /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("CustAddress")));
RDebugUtils.currentLine=7274508;
 //BA.debugLineNum = 7274508;BA.debugLine="txtcountry.SetVal(rs.GetString(\"CustCountry\"))";
__ref._txtcountry /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("CustCountry")));
RDebugUtils.currentLine=7274509;
 //BA.debugLineNum = 7274509;BA.debugLine="txtcity.SetVal(rs.GetString(\"CustCity\"))";
__ref._txtcity /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("CustCity")));
RDebugUtils.currentLine=7274511;
 //BA.debugLineNum = 7274511;BA.debugLine="txtphone.SetVal(rs.GetString(\"CustPhone\"))";
__ref._txtphone /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("CustPhone")));
RDebugUtils.currentLine=7274512;
 //BA.debugLineNum = 7274512;BA.debugLine="txtemail.SetVal(rs.GetString(\"CustEmail\"))";
__ref._txtemail /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("CustEmail")));
 }
;
RDebugUtils.currentLine=7274515;
 //BA.debugLineNum = 7274515;BA.debugLine="rs.Close";
_rs.Close();
 };
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=7274520;
 //BA.debugLineNum = 7274520;BA.debugLine="Log(LastException)";
__c.LogImpl("27274520",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=7274522;
 //BA.debugLineNum = 7274522;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.addcustomersinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="addcustomersinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="Load_Data_ByID";
__ref._load_data_byid /*String*/ (null);
RDebugUtils.currentLine=7012360;
 //BA.debugLineNum = 7012360;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.addcustomersinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addcustomersinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="End Sub";
return "";
}
}