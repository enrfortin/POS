package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class createbarcode_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
createbarcode._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",createbarcode._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private sql1 As SQL";
createbarcode._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",createbarcode._sql1);
 //BA.debugLineNum = 5;BA.debugLine="Private cmbproduct,btncreatebarcode As JQueryElem";
createbarcode._cmbproduct = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_cmbproduct",createbarcode._cmbproduct);
createbarcode._btncreatebarcode = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_btncreatebarcode",createbarcode._btncreatebarcode);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cmbproduct_change(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("cmbproduct_Change (createbarcode) ","createbarcode",25,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("cmbproduct_change")) { return __ref.runUserSub(false, "createbarcode","cmbproduct_change", __ref, _params);}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 27;BA.debugLine="Sub cmbproduct_Change (Params As Map)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 29;BA.debugLine="Dim str As String = \"\"";
Debug.ShouldStop(268435456);
_str = BA.ObjectToString("");Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 31;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(1073741824);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 32;BA.debugLine="rs = sql1.ExecQuery(\"select ProductBarcode from";
Debug.ShouldStop(-2147483648);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select ProductBarcode from ProductsInformation where ProductID="),__ref.getField(false,"_cmbproduct" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"))));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 33;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(1);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 34;BA.debugLine="str = $\" 			  JsBarcode(\"#barcode1\", \"${rs.GetS";
Debug.ShouldStop(2);
_str = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("			  JsBarcode(\"#barcode1\", \""),createbarcode.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductBarcode"))).runMethod(true,"trim")))),RemoteObject.createImmutable("\")\n"),RemoteObject.createImmutable("			 ")));Debug.locals.put("str", _str);
 }
;
 BA.debugLineNum = 39;BA.debugLine="rs.Close";
Debug.ShouldStop(64);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 41;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(256);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), createbarcode.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 43;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
createbarcode.__c.runVoidMethod ("LogImpl","216384016",BA.ObjectToString(createbarcode.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (createbarcode) ","createbarcode",25,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "createbarcode","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_products(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_Products (createbarcode) ","createbarcode",25,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("load_products")) { return __ref.runUserSub(false, "createbarcode","load_products", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _val = RemoteObject.createImmutable("");
 BA.debugLineNum = 47;BA.debugLine="Sub Load_Products";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 50;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(131072);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 51;BA.debugLine="sb.Initialize";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 52;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(524288);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 53;BA.debugLine="rs = sql1.ExecQuery(\"select * from ProductsInfor";
Debug.ShouldStop(1048576);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from ProductsInformation")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 54;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(2097152);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 55;BA.debugLine="Dim val As String = rs.GetInt(\"ProductID\")";
Debug.ShouldStop(4194304);
_val = BA.NumberToString(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ProductID"))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 56;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
Debug.ShouldStop(8388608);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<option value='"))).runMethod(false,"Append",(Object)(_val)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("'>"))).runMethod(false,"Append",(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductName"))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</option>")));
 }
;
 BA.debugLineNum = 58;BA.debugLine="rs.Close";
Debug.ShouldStop(33554432);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 59;BA.debugLine="cmbproduct.SetHtml(sb.ToString)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_cmbproduct" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_sb.runMethod(true,"ToString")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e13.toString()); BA.debugLineNum = 62;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
createbarcode.__c.runVoidMethod ("LogImpl","216449551",BA.ObjectToString(createbarcode.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _websocket_connected(RemoteObject __ref,RemoteObject _websocket1) throws Exception{
try {
		Debug.PushSubsStack("WebSocket_Connected (createbarcode) ","createbarcode",25,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "createbarcode","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 14;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(16384);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 16;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(32768);
__ref.setField ("_sql1" /*RemoteObject*/ ,createbarcode._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 18;BA.debugLine="Load_Products";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.createbarcode.class, "_load_products" /*RemoteObject*/ );
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _websocket_disconnected(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("WebSocket_Disconnected (createbarcode) ","createbarcode",25,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "createbarcode","websocket_disconnected", __ref);}
 BA.debugLineNum = 21;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="If sql1.IsInitialized Then";
Debug.ShouldStop(2097152);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 23;BA.debugLine="sql1.Close";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}