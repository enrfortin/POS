package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class addcurrenciesinformation_subs_0 {


public static RemoteObject  _btncancel_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btncancel_Click (addcurrenciesinformation) ","addcurrenciesinformation",10,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("btncancel_click")) { return __ref.runUserSub(false, "addcurrenciesinformation","btncancel_click", __ref, _params);}
Debug.locals.put("Params", _params);
 BA.debugLineNum = 61;BA.debugLine="Sub btncancel_Click (Params As Map)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="ws.Eval(\"document.location.replace('CurrenciesIn";
Debug.ShouldStop(536870912);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('CurrenciesInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addcurrenciesinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsave_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btnsave_Click (addcurrenciesinformation) ","addcurrenciesinformation",10,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("btnsave_click")) { return __ref.runUserSub(false, "addcurrenciesinformation","btnsave_click", __ref, _params);}
RemoteObject _currencyid = RemoteObject.createImmutable(0);
Debug.locals.put("Params", _params);
 BA.debugLineNum = 30;BA.debugLine="Sub btnsave_Click (Params As Map)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 33;BA.debugLine="If txtname.GetVal.Value = \"\" Or txtsymbol.GetVal";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable((""))) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtsymbol" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 34;BA.debugLine="Return";
Debug.ShouldStop(2);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 37;BA.debugLine="Dim CurrencyID As Int = ws.Session.GetAttribute(";
Debug.ShouldStop(16);
_currencyid = BA.numberCast(int.class, __ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("CurrencyID"))));Debug.locals.put("CurrencyID", _currencyid);Debug.locals.put("CurrencyID", _currencyid);
 BA.debugLineNum = 38;BA.debugLine="If CurrencyID > 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_currencyid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 39;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(64);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 40;BA.debugLine="sql1.ExecNonQuery2(\"Update CurrenciesInformati";
Debug.ShouldStop(128);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("Update CurrenciesInformation set CurrencyName=?,CurrencySymbol=? where CurrencyID=? ")),(Object)(addcurrenciesinformation.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtsymbol" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(_currencyid)})))));
 BA.debugLineNum = 42;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(512);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 }else {
 BA.debugLineNum = 45;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(4096);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 46;BA.debugLine="sql1.ExecNonQuery2(\"insert into CurrenciesInfo";
Debug.ShouldStop(8192);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("insert into CurrenciesInformation (CurrencyName,CurrencySymbol) values (?,?) ")),(Object)(addcurrenciesinformation.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtsymbol" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue")})))));
 BA.debugLineNum = 48;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(32768);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 };
 BA.debugLineNum = 52;BA.debugLine="Main.Insert_UsersLogs(ws,\"Currency Information\")";
Debug.ShouldStop(524288);
addcurrenciesinformation._main.runVoidMethod ("_insert_userslogs" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("Currency Information")));
 BA.debugLineNum = 55;BA.debugLine="ws.Eval(\"document.location.replace('CurrenciesIn";
Debug.ShouldStop(4194304);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('CurrenciesInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addcurrenciesinformation.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e18.toString()); BA.debugLineNum = 58;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
addcurrenciesinformation.__c.runVoidMethod ("LogImpl","26684700",BA.ObjectToString(addcurrenciesinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
addcurrenciesinformation._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",addcurrenciesinformation._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private txtname,txtsymbol As JQueryElement";
addcurrenciesinformation._txtname = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtname",addcurrenciesinformation._txtname);
addcurrenciesinformation._txtsymbol = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtsymbol",addcurrenciesinformation._txtsymbol);
 //BA.debugLineNum = 5;BA.debugLine="Private lblusernamemain As JQueryElement";
addcurrenciesinformation._lblusernamemain = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblusernamemain",addcurrenciesinformation._lblusernamemain);
 //BA.debugLineNum = 6;BA.debugLine="Private divMenu As JQueryElement";
addcurrenciesinformation._divmenu = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divmenu",addcurrenciesinformation._divmenu);
 //BA.debugLineNum = 7;BA.debugLine="Private sql1 As SQL";
addcurrenciesinformation._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",addcurrenciesinformation._sql1);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (addcurrenciesinformation) ","addcurrenciesinformation",10,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "addcurrenciesinformation","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1024);
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_data_byid(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_Data_ByID (addcurrenciesinformation) ","addcurrenciesinformation",10,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("load_data_byid")) { return __ref.runUserSub(false, "addcurrenciesinformation","load_data_byid", __ref);}
RemoteObject _currencyid = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
 BA.debugLineNum = 65;BA.debugLine="Sub Load_Data_ByID";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 68;BA.debugLine="Dim CurrencyID As Int = ws.Session.GetAttribute(";
Debug.ShouldStop(8);
_currencyid = BA.numberCast(int.class, __ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("CurrencyID"))));Debug.locals.put("CurrencyID", _currencyid);Debug.locals.put("CurrencyID", _currencyid);
 BA.debugLineNum = 69;BA.debugLine="If CurrencyID > 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_currencyid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 71;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(64);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 72;BA.debugLine="rs = sql1.ExecQuery(\"select * from  CurrenciesI";
Debug.ShouldStop(128);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from  CurrenciesInformation where CurrencyID="),_currencyid)));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 73;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(256);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 75;BA.debugLine="txtname.SetVal(rs.GetString(\"CurrencyName\"))";
Debug.ShouldStop(1024);
__ref.getField(false,"_txtname" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CurrencyName"))))));
 BA.debugLineNum = 76;BA.debugLine="txtsymbol.SetVal(rs.GetString(\"CurrencySymbol\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_txtsymbol" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CurrencySymbol"))))));
 }
;
 BA.debugLineNum = 79;BA.debugLine="rs.Close";
Debug.ShouldStop(16384);
_rs.runVoidMethod ("Close");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e13.toString()); BA.debugLineNum = 85;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
addcurrenciesinformation.__c.runVoidMethod ("LogImpl","26815764",BA.ObjectToString(addcurrenciesinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("WebSocket_Connected (addcurrenciesinformation) ","addcurrenciesinformation",10,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "addcurrenciesinformation","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 15;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(32768);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 17;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
Debug.ShouldStop(65536);
addcurrenciesinformation._main.runVoidMethod ("_validateusers" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblusernamemain" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_divmenu" /*RemoteObject*/ )));
 BA.debugLineNum = 18;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(131072);
__ref.setField ("_sql1" /*RemoteObject*/ ,addcurrenciesinformation._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 20;BA.debugLine="Load_Data_ByID";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.addcurrenciesinformation.class, "_load_data_byid" /*RemoteObject*/ );
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("WebSocket_Disconnected (addcurrenciesinformation) ","addcurrenciesinformation",10,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "addcurrenciesinformation","websocket_disconnected", __ref);}
 BA.debugLineNum = 24;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="If sql1.IsInitialized Then";
Debug.ShouldStop(16777216);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 26;BA.debugLine="sql1.Close";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}