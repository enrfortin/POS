package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class addexpensesinfo_subs_0 {


public static RemoteObject  _btncancel_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btncancel_Click (addexpensesinfo) ","addexpensesinfo",12,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("btncancel_click")) { return __ref.runUserSub(false, "addexpensesinfo","btncancel_click", __ref, _params);}
Debug.locals.put("Params", _params);
 BA.debugLineNum = 62;BA.debugLine="Sub btncancel_Click (Params As Map)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="ws.Eval(\"document.location.replace('ExpensesInfo";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('ExpensesInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addexpensesinfo.__c.getField(false,"Null")));
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
public static RemoteObject  _btnsave_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btnsave_Click (addexpensesinfo) ","addexpensesinfo",12,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("btnsave_click")) { return __ref.runUserSub(false, "addexpensesinfo","btnsave_click", __ref, _params);}
RemoteObject _catid = RemoteObject.createImmutable(0);
Debug.locals.put("Params", _params);
 BA.debugLineNum = 32;BA.debugLine="Sub btnsave_Click (Params As Map)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 35;BA.debugLine="If txtinvdate.GetVal.Value = \"\" Or txtamt.GetVal";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtinvdate" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable((""))) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtamt" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 36;BA.debugLine="Return";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 39;BA.debugLine="Dim CatID As Int = ws.Session.GetAttribute(\"CatI";
Debug.ShouldStop(64);
_catid = BA.numberCast(int.class, __ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("CatID"))));Debug.locals.put("CatID", _catid);Debug.locals.put("CatID", _catid);
 BA.debugLineNum = 40;BA.debugLine="If CatID > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_catid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 41;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(256);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 42;BA.debugLine="sql1.ExecNonQuery2(\"Update ExpensesInfo set Ex";
Debug.ShouldStop(512);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("Update ExpensesInfo set ExpensesAmt=? , ExpensesDate=? , ExpensesNotes=?  where ExpensesID=? ")),(Object)(addexpensesinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {__ref.getField(false,"_txtamt" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtinvdate" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtnotes" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(_catid)})))));
 BA.debugLineNum = 44;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(2048);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 }else {
 BA.debugLineNum = 47;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(16384);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 48;BA.debugLine="sql1.ExecNonQuery2(\"insert into ExpensesInfo (";
Debug.ShouldStop(32768);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("insert into ExpensesInfo (ExpensesAmt,ExpensesDate,ExpensesNotes) values (?,?,?) ")),(Object)(addexpensesinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {__ref.getField(false,"_txtamt" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtinvdate" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtnotes" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue")})))));
 BA.debugLineNum = 50;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(131072);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 };
 BA.debugLineNum = 54;BA.debugLine="Main.Insert_UsersLogs(ws,\"Expenses Information\")";
Debug.ShouldStop(2097152);
addexpensesinfo._main.runVoidMethod ("_insert_userslogs" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("Expenses Information")));
 BA.debugLineNum = 56;BA.debugLine="ws.Eval(\"document.location.replace('ExpensesInfo";
Debug.ShouldStop(8388608);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('ExpensesInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addexpensesinfo.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e18.toString()); BA.debugLineNum = 59;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
addexpensesinfo.__c.runVoidMethod ("LogImpl","27602203",BA.ObjectToString(addexpensesinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
addexpensesinfo._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",addexpensesinfo._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private lblusernamemain As JQueryElement";
addexpensesinfo._lblusernamemain = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblusernamemain",addexpensesinfo._lblusernamemain);
 //BA.debugLineNum = 5;BA.debugLine="Private divMenu As JQueryElement";
addexpensesinfo._divmenu = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divmenu",addexpensesinfo._divmenu);
 //BA.debugLineNum = 6;BA.debugLine="Private sql1 As SQL";
addexpensesinfo._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",addexpensesinfo._sql1);
 //BA.debugLineNum = 8;BA.debugLine="Private txtinvdate,txtamt,txtnotes As JQueryEleme";
addexpensesinfo._txtinvdate = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtinvdate",addexpensesinfo._txtinvdate);
addexpensesinfo._txtamt = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtamt",addexpensesinfo._txtamt);
addexpensesinfo._txtnotes = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtnotes",addexpensesinfo._txtnotes);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (addexpensesinfo) ","addexpensesinfo",12,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "addexpensesinfo","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4096);
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Load_Data_ByID (addexpensesinfo) ","addexpensesinfo",12,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("load_data_byid")) { return __ref.runUserSub(false, "addexpensesinfo","load_data_byid", __ref);}
RemoteObject _catid = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
 BA.debugLineNum = 66;BA.debugLine="Sub Load_Data_ByID";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 69;BA.debugLine="Dim CatID As Int = ws.Session.GetAttribute(\"CatI";
Debug.ShouldStop(16);
_catid = BA.numberCast(int.class, __ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("CatID"))));Debug.locals.put("CatID", _catid);Debug.locals.put("CatID", _catid);
 BA.debugLineNum = 70;BA.debugLine="If CatID > 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_catid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 72;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(128);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 73;BA.debugLine="rs = sql1.ExecQuery(\"select * from  ExpensesInf";
Debug.ShouldStop(256);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from  ExpensesInfo where ExpensesID="),_catid)));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 74;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(512);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 76;BA.debugLine="txtamt.SetVal(rs.GetString(\"ExpensesAmt\"))";
Debug.ShouldStop(2048);
__ref.getField(false,"_txtamt" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ExpensesAmt"))))));
 BA.debugLineNum = 77;BA.debugLine="txtinvdate.SetVal(rs.GetString(\"ExpensesDate\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_txtinvdate" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ExpensesDate"))))));
 BA.debugLineNum = 78;BA.debugLine="txtnotes.SetVal(rs.GetString(\"ExpensesNotes\"))";
Debug.ShouldStop(8192);
__ref.getField(false,"_txtnotes" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ExpensesNotes"))))));
 }
;
 BA.debugLineNum = 81;BA.debugLine="rs.Close";
Debug.ShouldStop(65536);
_rs.runVoidMethod ("Close");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e14.toString()); BA.debugLineNum = 86;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
addexpensesinfo.__c.runVoidMethod ("LogImpl","27733268",BA.ObjectToString(addexpensesinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("WebSocket_Connected (addexpensesinfo) ","addexpensesinfo",12,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "addexpensesinfo","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 17;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(131072);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 19;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
Debug.ShouldStop(262144);
addexpensesinfo._main.runVoidMethod ("_validateusers" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblusernamemain" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_divmenu" /*RemoteObject*/ )));
 BA.debugLineNum = 20;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(524288);
__ref.setField ("_sql1" /*RemoteObject*/ ,addexpensesinfo._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 22;BA.debugLine="Load_Data_ByID";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.addexpensesinfo.class, "_load_data_byid" /*RemoteObject*/ );
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("WebSocket_Disconnected (addexpensesinfo) ","addexpensesinfo",12,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "addexpensesinfo","websocket_disconnected", __ref);}
 BA.debugLineNum = 26;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="If sql1.IsInitialized Then";
Debug.ShouldStop(67108864);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 28;BA.debugLine="sql1.Close";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}