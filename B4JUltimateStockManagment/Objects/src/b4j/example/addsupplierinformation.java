package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class addsupplierinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.addsupplierinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.addsupplierinformation.class).invoke(this, new Object[] {null});
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
public String  _btncancel_click(b4j.example.addsupplierinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsupplierinformation";
if (Debug.shouldDelegate(ba, "btncancel_click", false))
	 {return ((String) Debug.delegate(ba, "btncancel_click", new Object[] {_params}));}
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Sub btncancel_Click (Params As Map)";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="ws.Eval(\"document.location.replace('SupplierInfo";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('SupplierInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="End Sub";
return "";
}
public String  _btnsave_click(b4j.example.addsupplierinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsupplierinformation";
if (Debug.shouldDelegate(ba, "btnsave_click", false))
	 {return ((String) Debug.delegate(ba, "btnsave_click", new Object[] {_params}));}
int _customerid = 0;
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Sub btnsave_Click (Params As Map)";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="Try";
try {RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="If txtname.GetVal.Value = \"\" Or txtaddress.GetVa";
if ((__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtaddress /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtcity /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtphone /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=12189704;
 //BA.debugLineNum = 12189704;BA.debugLine="Dim CustomerID As Int = ws.Session.GetAttribute(";
_customerid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("CustomerID")));
RDebugUtils.currentLine=12189705;
 //BA.debugLineNum = 12189705;BA.debugLine="If CustomerID > 0 Then";
if (_customerid>0) { 
RDebugUtils.currentLine=12189707;
 //BA.debugLineNum = 12189707;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=12189708;
 //BA.debugLineNum = 12189708;BA.debugLine="sql1.ExecNonQuery2($\"UPDATE SuppliersInfo    S";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("UPDATE SuppliersInfo\n"+"   SET SupplierName = ?\n"+"      ,SupplierEmail = ?\n"+"      ,SupplierPhone = ?\n"+"      ,SupplierCountry = ?\n"+"      ,SupplierCity = ?\n"+"      ,SupplierAddress = ? where SupplierID=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtemail /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtphone /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtcountry /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtcity /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtaddress /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_customerid)}));
RDebugUtils.currentLine=12189715;
 //BA.debugLineNum = 12189715;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }else {
RDebugUtils.currentLine=12189720;
 //BA.debugLineNum = 12189720;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=12189721;
 //BA.debugLineNum = 12189721;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO SuppliersInfo";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO SuppliersInfo\n"+"           (SupplierName\n"+"           ,SupplierEmail\n"+"           ,SupplierPhone\n"+"           ,SupplierCountry\n"+"           ,SupplierCity\n"+"           ,SupplierAddress)\n"+"     VALUES\n"+"           (?\n"+"           ,?\n"+"           ,?\n"+"           ,?\n"+"           ,?\n"+"           ,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtemail /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtphone /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtcountry /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtcity /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtaddress /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()}));
RDebugUtils.currentLine=12189736;
 //BA.debugLineNum = 12189736;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 };
RDebugUtils.currentLine=12189741;
 //BA.debugLineNum = 12189741;BA.debugLine="Main.Insert_UsersLogs(ws,\"Supplier Information\")";
_main._insert_userslogs /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,"Supplier Information");
RDebugUtils.currentLine=12189743;
 //BA.debugLineNum = 12189743;BA.debugLine="ws.Eval(\"document.location.replace('SupplierInfo";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('SupplierInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=12189747;
 //BA.debugLineNum = 12189747;BA.debugLine="Log(LastException)";
__c.LogImpl("212189747",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=12189749;
 //BA.debugLineNum = 12189749;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.addsupplierinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsupplierinformation";
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="Private txtname,txtaddress,txtcity,txtcountry,txt";
_txtname = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtaddress = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtcity = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtcountry = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtphone = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtemail = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_btnsave = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_btncancel = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=11993092;
 //BA.debugLineNum = 11993092;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=11993093;
 //BA.debugLineNum = 11993093;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=11993095;
 //BA.debugLineNum = 11993095;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.addsupplierinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="addsupplierinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="End Sub";
return "";
}
public String  _load_data_byid(b4j.example.addsupplierinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsupplierinformation";
if (Debug.shouldDelegate(ba, "load_data_byid", false))
	 {return ((String) Debug.delegate(ba, "load_data_byid", null));}
int _customerid = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Sub Load_Data_ByID";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="Try";
try {RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="Dim CustomerID As Int = ws.Session.GetAttribute(";
_customerid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("CustomerID")));
RDebugUtils.currentLine=12386308;
 //BA.debugLineNum = 12386308;BA.debugLine="If CustomerID > 0 Then";
if (_customerid>0) { 
RDebugUtils.currentLine=12386310;
 //BA.debugLineNum = 12386310;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=12386311;
 //BA.debugLineNum = 12386311;BA.debugLine="rs = sql1.ExecQuery(\"select * from  SuppliersIn";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from  SuppliersInfo where SupplierID="+BA.NumberToString(_customerid));
RDebugUtils.currentLine=12386312;
 //BA.debugLineNum = 12386312;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=12386314;
 //BA.debugLineNum = 12386314;BA.debugLine="txtname.SetVal(rs.GetString(\"SupplierName\"))";
__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("SupplierName")));
RDebugUtils.currentLine=12386315;
 //BA.debugLineNum = 12386315;BA.debugLine="txtaddress.SetVal(rs.GetString(\"SupplierAddres";
__ref._txtaddress /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("SupplierAddress")));
RDebugUtils.currentLine=12386316;
 //BA.debugLineNum = 12386316;BA.debugLine="txtcountry.SetVal(rs.GetString(\"SupplierCountr";
__ref._txtcountry /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("SupplierCountry")));
RDebugUtils.currentLine=12386317;
 //BA.debugLineNum = 12386317;BA.debugLine="txtcity.SetVal(rs.GetString(\"SupplierCity\"))";
__ref._txtcity /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("SupplierCity")));
RDebugUtils.currentLine=12386319;
 //BA.debugLineNum = 12386319;BA.debugLine="txtphone.SetVal(rs.GetString(\"SupplierPhone\"))";
__ref._txtphone /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("SupplierPhone")));
RDebugUtils.currentLine=12386320;
 //BA.debugLineNum = 12386320;BA.debugLine="txtemail.SetVal(rs.GetString(\"SupplierEmail\"))";
__ref._txtemail /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("SupplierEmail")));
 }
;
RDebugUtils.currentLine=12386323;
 //BA.debugLineNum = 12386323;BA.debugLine="rs.Close";
_rs.Close();
 };
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=12386328;
 //BA.debugLineNum = 12386328;BA.debugLine="Log(LastException)";
__c.LogImpl("212386328",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=12386330;
 //BA.debugLineNum = 12386330;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.addsupplierinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsupplierinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=12124166;
 //BA.debugLineNum = 12124166;BA.debugLine="Load_Data_ByID";
__ref._load_data_byid /*String*/ (null);
RDebugUtils.currentLine=12124168;
 //BA.debugLineNum = 12124168;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.addsupplierinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsupplierinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=12320772;
 //BA.debugLineNum = 12320772;BA.debugLine="End Sub";
return "";
}
}