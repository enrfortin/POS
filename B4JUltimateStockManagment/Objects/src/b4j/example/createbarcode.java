package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class createbarcode extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.createbarcode", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.createbarcode.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _cmbproduct = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _btncreatebarcode = null;
public b4j.example.main _main = null;
public String  _class_globals(b4j.example.createbarcode __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="createbarcode";
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=16121859;
 //BA.debugLineNum = 16121859;BA.debugLine="Private cmbproduct,btncreatebarcode As JQueryElem";
_cmbproduct = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_btncreatebarcode = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=16121862;
 //BA.debugLineNum = 16121862;BA.debugLine="End Sub";
return "";
}
public String  _cmbproduct_change(b4j.example.createbarcode __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="createbarcode";
if (Debug.shouldDelegate(ba, "cmbproduct_change", false))
	 {return ((String) Debug.delegate(ba, "cmbproduct_change", new Object[] {_params}));}
String _str = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Sub cmbproduct_Change (Params As Map)";
RDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="Try";
try {RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="Dim str As String = \"\"";
_str = "";
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=16384005;
 //BA.debugLineNum = 16384005;BA.debugLine="rs = sql1.ExecQuery(\"select ProductBarcode from";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select ProductBarcode from ProductsInformation where ProductID="+BA.ObjectToString(__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()));
RDebugUtils.currentLine=16384006;
 //BA.debugLineNum = 16384006;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=16384007;
 //BA.debugLineNum = 16384007;BA.debugLine="str = $\" 			  JsBarcode(\"#barcode1\", \"${rs.GetS";
_str = ("\n"+"			  JsBarcode(\"#barcode1\", \""+__c.SmartStringFormatter("",(Object)(_rs.GetString("ProductBarcode").trim()))+"\")\n"+"			 ");
 }
;
RDebugUtils.currentLine=16384012;
 //BA.debugLineNum = 16384012;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=16384014;
 //BA.debugLineNum = 16384014;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=16384016;
 //BA.debugLineNum = 16384016;BA.debugLine="Log(LastException)";
__c.LogImpl("216384016",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=16384018;
 //BA.debugLineNum = 16384018;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.createbarcode __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="createbarcode";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="End Sub";
return "";
}
public String  _load_products(b4j.example.createbarcode __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="createbarcode";
if (Debug.shouldDelegate(ba, "load_products", false))
	 {return ((String) Debug.delegate(ba, "load_products", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Sub Load_Products";
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="Try";
try {RDebugUtils.currentLine=16449539;
 //BA.debugLineNum = 16449539;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=16449540;
 //BA.debugLineNum = 16449540;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=16449541;
 //BA.debugLineNum = 16449541;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=16449542;
 //BA.debugLineNum = 16449542;BA.debugLine="rs = sql1.ExecQuery(\"select * from ProductsInfor";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from ProductsInformation");
RDebugUtils.currentLine=16449543;
 //BA.debugLineNum = 16449543;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=16449544;
 //BA.debugLineNum = 16449544;BA.debugLine="Dim val As String = rs.GetInt(\"ProductID\")";
_val = BA.NumberToString(_rs.GetInt("ProductID"));
RDebugUtils.currentLine=16449545;
 //BA.debugLineNum = 16449545;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("ProductName")).Append("</option>");
 }
;
RDebugUtils.currentLine=16449547;
 //BA.debugLineNum = 16449547;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=16449548;
 //BA.debugLineNum = 16449548;BA.debugLine="cmbproduct.SetHtml(sb.ToString)";
__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=16449551;
 //BA.debugLineNum = 16449551;BA.debugLine="Log(LastException)";
__c.LogImpl("216449551",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=16449553;
 //BA.debugLineNum = 16449553;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.createbarcode __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="createbarcode";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=16252932;
 //BA.debugLineNum = 16252932;BA.debugLine="Load_Products";
__ref._load_products /*String*/ (null);
RDebugUtils.currentLine=16252933;
 //BA.debugLineNum = 16252933;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.createbarcode __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="createbarcode";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=16318468;
 //BA.debugLineNum = 16318468;BA.debugLine="End Sub";
return "";
}
}