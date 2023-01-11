package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class addusersinformation_subs_0 {


public static RemoteObject  _btncancel_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btncancel_Click (addusersinformation) ","addusersinformation",19,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("btncancel_click")) { return __ref.runUserSub(false, "addusersinformation","btncancel_click", __ref, _params);}
Debug.locals.put("Params", _params);
 BA.debugLineNum = 65;BA.debugLine="Sub btncancel_Click (Params As Map)";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="ws.Eval(\"document.location.replace('UsersInforma";
Debug.ShouldStop(2);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('UsersInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addusersinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("btnsave_Click (addusersinformation) ","addusersinformation",19,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("btnsave_click")) { return __ref.runUserSub(false, "addusersinformation","btnsave_click", __ref, _params);}
RemoteObject _userid = RemoteObject.createImmutable(0);
Debug.locals.put("Params", _params);
 BA.debugLineNum = 33;BA.debugLine="Sub btnsave_Click (Params As Map)";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 36;BA.debugLine="If txtname.GetVal.Value = \"\" Or txtname.GetVal.V";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable((""))) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable((""))) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtuserpassword" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 37;BA.debugLine="Return";
Debug.ShouldStop(16);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 40;BA.debugLine="Dim UserID As Int = ws.Session.GetAttribute(\"tem";
Debug.ShouldStop(128);
_userid = BA.numberCast(int.class, __ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("tempUserID"))));Debug.locals.put("UserID", _userid);Debug.locals.put("UserID", _userid);
 BA.debugLineNum = 41;BA.debugLine="If UserID > 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_userid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 43;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(1024);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 44;BA.debugLine="sql1.ExecNonQuery2(\"Update UsersInformation se";
Debug.ShouldStop(2048);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("Update UsersInformation set [UserFullName]=?,[UserEmailAddress]=?,[UserPassword]=?  where UserID=? ")),(Object)(addusersinformation.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtuseremail" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtuserpassword" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(_userid)})))));
 BA.debugLineNum = 46;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(8192);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 }else {
 BA.debugLineNum = 49;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(65536);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 50;BA.debugLine="sql1.ExecNonQuery2(\"insert into UsersInformati";
Debug.ShouldStop(131072);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("insert into UsersInformation (UserFullName,UserEmailAddress,UserPassword) values (?,?,?) ")),(Object)(addusersinformation.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtuseremail" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtuserpassword" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue")})))));
 BA.debugLineNum = 52;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(524288);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 };
 BA.debugLineNum = 56;BA.debugLine="Main.Insert_UsersLogs(ws,\"Users Information\")";
Debug.ShouldStop(8388608);
addusersinformation._main.runVoidMethod ("_insert_userslogs" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("Users Information")));
 BA.debugLineNum = 59;BA.debugLine="ws.Eval(\"document.location.replace('UsersInforma";
Debug.ShouldStop(67108864);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('UsersInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addusersinformation.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e18.toString()); BA.debugLineNum = 62;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
addusersinformation.__c.runVoidMethod ("LogImpl","213697053",BA.ObjectToString(addusersinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
addusersinformation._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",addusersinformation._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private txtname,txtuseremail,txtuserpassword,btns";
addusersinformation._txtname = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtname",addusersinformation._txtname);
addusersinformation._txtuseremail = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtuseremail",addusersinformation._txtuseremail);
addusersinformation._txtuserpassword = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtuserpassword",addusersinformation._txtuserpassword);
addusersinformation._btnsave = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_btnsave",addusersinformation._btnsave);
addusersinformation._btncancel = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_btncancel",addusersinformation._btncancel);
 //BA.debugLineNum = 5;BA.debugLine="Private lblusernamemain As JQueryElement";
addusersinformation._lblusernamemain = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblusernamemain",addusersinformation._lblusernamemain);
 //BA.debugLineNum = 6;BA.debugLine="Private divMenu As JQueryElement";
addusersinformation._divmenu = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divmenu",addusersinformation._divmenu);
 //BA.debugLineNum = 7;BA.debugLine="Private sql1 As SQL";
addusersinformation._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",addusersinformation._sql1);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (addusersinformation) ","addusersinformation",19,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "addusersinformation","initialize", __ref, _ba);}
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
		Debug.PushSubsStack("Load_Data_ByID (addusersinformation) ","addusersinformation",19,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("load_data_byid")) { return __ref.runUserSub(false, "addusersinformation","load_data_byid", __ref);}
RemoteObject _userid = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
 BA.debugLineNum = 70;BA.debugLine="Sub Load_Data_ByID";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 73;BA.debugLine="Dim UserID As Int = ws.Session.GetAttribute(\"tem";
Debug.ShouldStop(256);
_userid = BA.numberCast(int.class, __ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("tempUserID"))));Debug.locals.put("UserID", _userid);Debug.locals.put("UserID", _userid);
 BA.debugLineNum = 74;BA.debugLine="If UserID > 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_userid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 76;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(2048);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 77;BA.debugLine="rs = sql1.ExecQuery(\"select * from UsersInforma";
Debug.ShouldStop(4096);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from UsersInformation where UserID="),_userid)));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 78;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(8192);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 79;BA.debugLine="txtname.SetVal(rs.GetString(\"UserFullName\"))";
Debug.ShouldStop(16384);
__ref.getField(false,"_txtname" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("UserFullName"))))));
 BA.debugLineNum = 80;BA.debugLine="txtuseremail.SetVal(rs.GetString(\"UserEmailAdd";
Debug.ShouldStop(32768);
__ref.getField(false,"_txtuseremail" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("UserEmailAddress"))))));
 BA.debugLineNum = 81;BA.debugLine="txtuserpassword.SetVal(rs.GetString(\"UserPassw";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtuserpassword" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("UserPassword"))))));
 }
;
 BA.debugLineNum = 84;BA.debugLine="rs.Close";
Debug.ShouldStop(524288);
_rs.runVoidMethod ("Close");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e14.toString()); BA.debugLineNum = 89;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
addusersinformation.__c.runVoidMethod ("LogImpl","213828115",BA.ObjectToString(addusersinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("WebSocket_Connected (addusersinformation) ","addusersinformation",19,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "addusersinformation","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 15;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(32768);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 18;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
Debug.ShouldStop(131072);
addusersinformation._main.runVoidMethod ("_validateusers" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblusernamemain" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_divmenu" /*RemoteObject*/ )));
 BA.debugLineNum = 20;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(524288);
__ref.setField ("_sql1" /*RemoteObject*/ ,addusersinformation._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 22;BA.debugLine="Load_Data_ByID";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.addusersinformation.class, "_load_data_byid" /*RemoteObject*/ );
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
		Debug.PushSubsStack("WebSocket_Disconnected (addusersinformation) ","addusersinformation",19,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "addusersinformation","websocket_disconnected", __ref);}
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