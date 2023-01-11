package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class addproductsinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.addproductsinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.addproductsinformation.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.WebSocket.JQueryElement _cmbcat = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtbarcode = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtunitprice = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtcostprice = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txttax = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtimagen = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblusernamemain = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divmenu = null;
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public b4j.example.main _main = null;
public String  _btncancel_click(b4j.example.addproductsinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addproductsinformation";
if (Debug.shouldDelegate(ba, "btncancel_click", false))
	 {return ((String) Debug.delegate(ba, "btncancel_click", new Object[] {_params}));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub btncancel_Click (Params As Map)";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="ws.Eval(\"document.location.replace('ProductsInfo";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('ProductsInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return "";
}
public String  _btnsave_click(b4j.example.addproductsinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addproductsinformation";
if (Debug.shouldDelegate(ba, "btnsave_click", false))
	 {return ((String) Debug.delegate(ba, "btnsave_click", new Object[] {_params}));}
int _productid = 0;
String _payloadstr = "";
int _commapos = 0;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub btnsave_Click (Params As Map)";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Try";
try {RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="If txtname.GetVal.Value = \"\" Or txtunitprice.Get";
if ((__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtcostprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="Dim ProductID As Int = ws.Session.GetAttribute(\"";
_productid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("ProductID")));
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="If ProductID > 0 Then";
if (_productid>0) { 
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="Dim PayLoadStr As String =txtimagen.GetVal.Valu";
_payloadstr = BA.ObjectToString(__ref._txtimagen /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue());
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="Dim commapos As Int =PayLoadStr.IndexOf(\"\\\")";
_commapos = _payloadstr.indexOf("\\");
RDebugUtils.currentLine=2752529;
 //BA.debugLineNum = 2752529;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=2752530;
 //BA.debugLineNum = 2752530;BA.debugLine="sql1.ExecNonQuery2($\"UPDATE ProductsInformatio";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("UPDATE ProductsInformation\n"+"   SET ProductName = ?\n"+"      ,ProductPrice = ?\n"+"      ,ProductImage = ?\n"+"      ,CatID = ?\n"+"      ,CostPrice = ?\n"+"      ,ProductBarcode = ?\n"+"      ,ProductTax = ? where ProductID=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)("images/products/"+_payloadstr.substring((int) (_commapos+10))),__ref._cmbcat /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtcostprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtbarcode /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txttax /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_productid)}));
RDebugUtils.currentLine=2752538;
 //BA.debugLineNum = 2752538;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }else {
RDebugUtils.currentLine=2752542;
 //BA.debugLineNum = 2752542;BA.debugLine="Dim PayLoadStr As String =txtimagen.GetVal.Valu";
_payloadstr = BA.ObjectToString(__ref._txtimagen /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue());
RDebugUtils.currentLine=2752543;
 //BA.debugLineNum = 2752543;BA.debugLine="Dim commapos As Int =PayLoadStr.IndexOf(\"\\\")";
_commapos = _payloadstr.indexOf("\\");
RDebugUtils.currentLine=2752547;
 //BA.debugLineNum = 2752547;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=2752548;
 //BA.debugLineNum = 2752548;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO ProductsInfor";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO ProductsInformation\n"+"		           (ProductName\n"+"		           ,ProductPrice\n"+"		           ,ProductImage\n"+"		           ,CatID\n"+"		           ,CostPrice\n"+"		           ,ProductBarcode\n"+"		           ,ProductTax)\n"+"		     VALUES\n"+"		           (?\n"+"		           ,?\n"+"		           ,?\n"+"		           ,?\n"+"		           ,?\n"+"		           ,?\n"+"		           ,? )"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)("images/products/"+_payloadstr.substring((int) (_commapos+10))),__ref._cmbcat /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtcostprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtbarcode /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txttax /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()}));
RDebugUtils.currentLine=2752565;
 //BA.debugLineNum = 2752565;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 };
RDebugUtils.currentLine=2752569;
 //BA.debugLineNum = 2752569;BA.debugLine="Main.Insert_UsersLogs(ws,\"Products Information\")";
_main._insert_userslogs /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,"Products Information");
RDebugUtils.currentLine=2752571;
 //BA.debugLineNum = 2752571;BA.debugLine="ws.Eval(\"document.location.replace('ProductsInfo";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('ProductsInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e22) {
			ba.setLastException(e22);RDebugUtils.currentLine=2752575;
 //BA.debugLineNum = 2752575;BA.debugLine="Log(LastException)";
__c.LogImpl("22752575",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=2752577;
 //BA.debugLineNum = 2752577;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.addproductsinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addproductsinformation";
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Private txtname,cmbcat,txtbarcode,txtunitprice,tx";
_txtname = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_cmbcat = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtbarcode = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtunitprice = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtcostprice = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txttax = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtimagen = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.addproductsinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="addproductsinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return "";
}
public String  _load_cats(b4j.example.addproductsinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addproductsinformation";
if (Debug.shouldDelegate(ba, "load_cats", false))
	 {return ((String) Debug.delegate(ba, "load_cats", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub Load_Cats";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Log(txtimagen.GetText.Value)";
__c.LogImpl("22686977",BA.ObjectToString(__ref._txtimagen /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetText().getValue()),0);
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Log(txtimagen.GetVal.Value)";
__c.LogImpl("22686978",BA.ObjectToString(__ref._txtimagen /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()),0);
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="Try";
try {RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="rs = sql1.ExecQuery(\"select * from CatInfo\")";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from CatInfo");
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=2686987;
 //BA.debugLineNum = 2686987;BA.debugLine="Dim val As String = rs.GetInt(\"CatID\")";
_val = BA.NumberToString(_rs.GetInt("CatID"));
RDebugUtils.currentLine=2686988;
 //BA.debugLineNum = 2686988;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("CatDesc")).Append("</option>");
 }
;
RDebugUtils.currentLine=2686990;
 //BA.debugLineNum = 2686990;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=2686991;
 //BA.debugLineNum = 2686991;BA.debugLine="cmbcat.SetHtml(sb.ToString)";
__ref._cmbcat /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
 } 
       catch (Exception e15) {
			ba.setLastException(e15);RDebugUtils.currentLine=2686994;
 //BA.debugLineNum = 2686994;BA.debugLine="Log(LastException)";
__c.LogImpl("22686994",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=2686996;
 //BA.debugLineNum = 2686996;BA.debugLine="End Sub";
return "";
}
public String  _load_data_byid(b4j.example.addproductsinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addproductsinformation";
if (Debug.shouldDelegate(ba, "load_data_byid", false))
	 {return ((String) Debug.delegate(ba, "load_data_byid", null));}
int _productid = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _strid = "";
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub Load_Data_ByID";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Try";
try {RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Dim ProductID As Int = ws.Session.GetAttribute(\"";
_productid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("ProductID")));
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="If ProductID > 0 Then";
if (_productid>0) { 
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="rs = sql1.ExecQuery(\"select * from  ProductsInf";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from  ProductsInformation where ProductID="+BA.NumberToString(_productid));
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="txtname.SetVal(rs.GetString(\"ProductName\"))";
__ref._txtname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("ProductName")));
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="Dim strID As String = cmbcat.id";
_strid = __ref._cmbcat /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .getId();
RDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="strID = strID.Replace(\"#\",\"\")";
_strid = _strid.replace("#","");
RDebugUtils.currentLine=2949134;
 //BA.debugLineNum = 2949134;BA.debugLine="ws.RunFunction(\"setSelectedRow\", Array As Obje";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .RunFunction("setSelectedRow",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_strid),(Object)(_rs.GetInt("CatID"))}));
RDebugUtils.currentLine=2949136;
 //BA.debugLineNum = 2949136;BA.debugLine="txtbarcode.SetVal(rs.GetString(\"ProductBarcode";
__ref._txtbarcode /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("ProductBarcode")));
RDebugUtils.currentLine=2949137;
 //BA.debugLineNum = 2949137;BA.debugLine="txtunitprice.SetVal(rs.GetString(\"ProductPrice";
__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("ProductPrice")));
RDebugUtils.currentLine=2949138;
 //BA.debugLineNum = 2949138;BA.debugLine="txtcostprice.SetVal(rs.GetString(\"CostPrice\"))";
__ref._txtcostprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("CostPrice")));
RDebugUtils.currentLine=2949139;
 //BA.debugLineNum = 2949139;BA.debugLine="txttax.SetVal(rs.GetString(\"ProductTax\"))";
__ref._txttax /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("ProductTax")));
 }
;
RDebugUtils.currentLine=2949142;
 //BA.debugLineNum = 2949142;BA.debugLine="rs.Close";
_rs.Close();
 };
 } 
       catch (Exception e19) {
			ba.setLastException(e19);RDebugUtils.currentLine=2949148;
 //BA.debugLineNum = 2949148;BA.debugLine="Log(LastException)";
__c.LogImpl("22949148",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=2949150;
 //BA.debugLineNum = 2949150;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.addproductsinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="addproductsinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="ws.Session.SetAttribute(\"ProductID\",0)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("ProductID",(Object)(0));
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="Load_Cats";
__ref._load_cats /*String*/ (null);
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="Load_Data_ByID";
__ref._load_data_byid /*String*/ (null);
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.addproductsinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addproductsinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="End Sub";
return "";
}
}