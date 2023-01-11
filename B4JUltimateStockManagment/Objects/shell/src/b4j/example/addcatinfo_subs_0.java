package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class addcatinfo_subs_0 {


public static RemoteObject  _btncancel_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btncancel_Click (addcatinfo) ","addcatinfo",9,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("btncancel_click")) { return __ref.runUserSub(false, "addcatinfo","btncancel_click", __ref, _params);}
Debug.locals.put("Params", _params);
 BA.debugLineNum = 62;BA.debugLine="Sub btncancel_Click (Params As Map)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="ws.Eval(\"document.location.replace('CatsInformat";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('CatsInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addcatinfo.__c.getField(false,"Null")));
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
		Debug.PushSubsStack("btnsave_Click (addcatinfo) ","addcatinfo",9,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("btnsave_click")) { return __ref.runUserSub(false, "addcatinfo","btnsave_click", __ref, _params);}
RemoteObject _catid = RemoteObject.createImmutable(0);
Debug.locals.put("Params", _params);
 BA.debugLineNum = 31;BA.debugLine="Sub btnsave_Click (Params As Map)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 34;BA.debugLine="If txtname.GetVal.Value = \"\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 35;BA.debugLine="Return";
Debug.ShouldStop(4);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 38;BA.debugLine="Dim CatID As Int = ws.Session.GetAttribute(\"CatI";
Debug.ShouldStop(32);
_catid = BA.numberCast(int.class, __ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("CatID"))));Debug.locals.put("CatID", _catid);Debug.locals.put("CatID", _catid);
 BA.debugLineNum = 39;BA.debugLine="If CatID > 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",_catid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 40;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(128);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 41;BA.debugLine="sql1.ExecNonQuery2(\"Update CatInfo set [CatDes";
Debug.ShouldStop(256);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("Update CatInfo set [CatDesc]=?  where CatID=? ")),(Object)(addcatinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(_catid)})))));
 BA.debugLineNum = 43;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(1024);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 }else {
 BA.debugLineNum = 46;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(8192);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 47;BA.debugLine="sql1.ExecNonQuery2(\"insert into CatInfo (CatDe";
Debug.ShouldStop(16384);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("insert into CatInfo (CatDesc) values (?) ")),(Object)(addcatinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue")})))));
 BA.debugLineNum = 49;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(65536);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 };
 BA.debugLineNum = 53;BA.debugLine="Main.Insert_UsersLogs(ws,\"Categories Information";
Debug.ShouldStop(1048576);
addcatinfo._main.runVoidMethod ("_insert_userslogs" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("Categories Information")));
 BA.debugLineNum = 56;BA.debugLine="ws.Eval(\"document.location.replace('CatsInformat";
Debug.ShouldStop(8388608);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('CatsInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addcatinfo.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e18.toString()); BA.debugLineNum = 59;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
addcatinfo.__c.runVoidMethod ("LogImpl","26225948",BA.ObjectToString(addcatinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
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
addcatinfo._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",addcatinfo._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private txtname As JQueryElement";
addcatinfo._txtname = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtname",addcatinfo._txtname);
 //BA.debugLineNum = 5;BA.debugLine="Private lblusernamemain As JQueryElement";
addcatinfo._lblusernamemain = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblusernamemain",addcatinfo._lblusernamemain);
 //BA.debugLineNum = 6;BA.debugLine="Private divMenu As JQueryElement";
addcatinfo._divmenu = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divmenu",addcatinfo._divmenu);
 //BA.debugLineNum = 7;BA.debugLine="Private sql1 As SQL";
addcatinfo._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",addcatinfo._sql1);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (addcatinfo) ","addcatinfo",9,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "addcatinfo","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(2048);
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Load_Data_ByID (addcatinfo) ","addcatinfo",9,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("load_data_byid")) { return __ref.runUserSub(false, "addcatinfo","load_data_byid", __ref);}
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
 BA.debugLineNum = 73;BA.debugLine="rs = sql1.ExecQuery(\"select * from  CatInfo whe";
Debug.ShouldStop(256);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from  CatInfo where CatID="),_catid)));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 74;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(512);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 76;BA.debugLine="txtname.SetVal(rs.GetString(\"CatDesc\"))";
Debug.ShouldStop(2048);
__ref.getField(false,"_txtname" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CatDesc"))))));
 }
;
 BA.debugLineNum = 79;BA.debugLine="rs.Close";
Debug.ShouldStop(16384);
_rs.runVoidMethod ("Close");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 84;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
addcatinfo.__c.runVoidMethod ("LogImpl","26357010",BA.ObjectToString(addcatinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("WebSocket_Connected (addcatinfo) ","addcatinfo",9,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "addcatinfo","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 16;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(65536);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 18;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
Debug.ShouldStop(131072);
addcatinfo._main.runVoidMethod ("_validateusers" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblusernamemain" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_divmenu" /*RemoteObject*/ )));
 BA.debugLineNum = 19;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(262144);
__ref.setField ("_sql1" /*RemoteObject*/ ,addcatinfo._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 21;BA.debugLine="Load_Data_ByID";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.addcatinfo.class, "_load_data_byid" /*RemoteObject*/ );
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("WebSocket_Disconnected (addcatinfo) ","addcatinfo",9,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "addcatinfo","websocket_disconnected", __ref);}
 BA.debugLineNum = 25;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="If sql1.IsInitialized Then";
Debug.ShouldStop(33554432);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 27;BA.debugLine="sql1.Close";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}