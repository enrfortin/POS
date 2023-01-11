package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class login_subs_0 {


public static RemoteObject  _btnlogin_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btnlogin_Click (login) ","login",7,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("btnlogin_click")) { return __ref.runUserSub(false, "login","btnlogin_click", __ref, _params);}
RemoteObject _intisfound = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 29;BA.debugLine="Sub btnlogin_Click (Params As Map)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 31;BA.debugLine="Dim intIsFound As Int = 0";
Debug.ShouldStop(1073741824);
_intisfound = BA.numberCast(int.class, 0);Debug.locals.put("intIsFound", _intisfound);Debug.locals.put("intIsFound", _intisfound);
 BA.debugLineNum = 33;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(1);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 34;BA.debugLine="rs = sql1.ExecQuery2(\"select * from UsersInforma";
Debug.ShouldStop(2);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("select * from UsersInformation where UserEmailAddress=? and UserPassword=?")),(Object)(login.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {__ref.getField(false,"_txtemail" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtpassword" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue")})))));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 35;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(4);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 36;BA.debugLine="intIsFound = 1";
Debug.ShouldStop(8);
_intisfound = BA.numberCast(int.class, 1);Debug.locals.put("intIsFound", _intisfound);
 BA.debugLineNum = 37;BA.debugLine="ws.Session.SetAttribute(\"UserID\",rs.GetInt(\"Use";
Debug.ShouldStop(16);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("UserID")),(Object)((_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("UserID"))))));
 BA.debugLineNum = 38;BA.debugLine="ws.Session.SetAttribute(\"UserFullName\",rs.GetSt";
Debug.ShouldStop(32);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("UserFullName")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("UserFullName"))))));
 BA.debugLineNum = 39;BA.debugLine="ws.Session.SetAttribute(\"UserEmailAddress\",rs.G";
Debug.ShouldStop(64);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("UserEmailAddress")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("UserEmailAddress"))))));
 }
;
 BA.debugLineNum = 42;BA.debugLine="rs.Close";
Debug.ShouldStop(512);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 44;BA.debugLine="Load_CompanyInformation";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.login.class, "_load_companyinformation" /*RemoteObject*/ );
 BA.debugLineNum = 46;BA.debugLine="If intIsFound = 1 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_intisfound,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 47;BA.debugLine="ws.Eval(\"document.location.replace('index.html'";
Debug.ShouldStop(16384);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('index.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), login.__c.getField(false,"Null")));
 }else {
 BA.debugLineNum = 49;BA.debugLine="ws.Eval(\"document.location.replace('login.html'";
Debug.ShouldStop(65536);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('login.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), login.__c.getField(false,"Null")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e19) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e19.toString()); BA.debugLineNum = 54;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
login.__c.runVoidMethod ("LogImpl","25242905",BA.ObjectToString(login.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnloginpos_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btnloginpos_Click (login) ","login",7,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("btnloginpos_click")) { return __ref.runUserSub(false, "login","btnloginpos_click", __ref, _params);}
RemoteObject _intisfound = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 73;BA.debugLine="Sub btnloginpos_Click (Params As Map)";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 75;BA.debugLine="Dim intIsFound As Int = 0";
Debug.ShouldStop(1024);
_intisfound = BA.numberCast(int.class, 0);Debug.locals.put("intIsFound", _intisfound);Debug.locals.put("intIsFound", _intisfound);
 BA.debugLineNum = 77;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(4096);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 78;BA.debugLine="rs = sql1.ExecQuery2(\"select * from UsersInforma";
Debug.ShouldStop(8192);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("select * from UsersInformation where UserEmailAddress=? and UserPassword=?")),(Object)(login.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {__ref.getField(false,"_txtemail" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtpassword" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue")})))));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 79;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(16384);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 80;BA.debugLine="intIsFound = 1";
Debug.ShouldStop(32768);
_intisfound = BA.numberCast(int.class, 1);Debug.locals.put("intIsFound", _intisfound);
 BA.debugLineNum = 81;BA.debugLine="ws.Session.SetAttribute(\"UserID\",rs.GetInt(\"Use";
Debug.ShouldStop(65536);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("UserID")),(Object)((_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("UserID"))))));
 BA.debugLineNum = 82;BA.debugLine="ws.Session.SetAttribute(\"UserFullName\",rs.GetSt";
Debug.ShouldStop(131072);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("UserFullName")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("UserFullName"))))));
 BA.debugLineNum = 83;BA.debugLine="ws.Session.SetAttribute(\"UserEmailAddress\",rs.G";
Debug.ShouldStop(262144);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("UserEmailAddress")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("UserEmailAddress"))))));
 }
;
 BA.debugLineNum = 86;BA.debugLine="rs.Close";
Debug.ShouldStop(2097152);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 88;BA.debugLine="Load_CompanyInformation";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.login.class, "_load_companyinformation" /*RemoteObject*/ );
 BA.debugLineNum = 90;BA.debugLine="If intIsFound = 1 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_intisfound,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 91;BA.debugLine="ws.Eval(\"document.location.replace('POS/POS.htm";
Debug.ShouldStop(67108864);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('POS/POS.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), login.__c.getField(false,"Null")));
 }else {
 BA.debugLineNum = 93;BA.debugLine="ws.Eval(\"document.location.replace('login.html'";
Debug.ShouldStop(268435456);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('login.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), login.__c.getField(false,"Null")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e19) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e19.toString()); BA.debugLineNum = 98;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
login.__c.runVoidMethod ("LogImpl","25373977",BA.ObjectToString(login.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
login._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",login._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private txtemail,txtpassword,btnlogin As JQueryEl";
login._txtemail = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtemail",login._txtemail);
login._txtpassword = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtpassword",login._txtpassword);
login._btnlogin = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_btnlogin",login._btnlogin);
 //BA.debugLineNum = 5;BA.debugLine="Private sql1 As SQL";
login._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",login._sql1);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (login) ","login",7,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "login","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_companyinformation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_CompanyInformation (login) ","login",7,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("load_companyinformation")) { return __ref.runUserSub(false, "login","load_companyinformation", __ref);}
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
 BA.debugLineNum = 58;BA.debugLine="Sub Load_CompanyInformation";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 60;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(134217728);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 61;BA.debugLine="rs = sql1.ExecQuery(\"select * from CompaniesInfo";
Debug.ShouldStop(268435456);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from CompaniesInformation limit 1")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 62;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(536870912);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 63;BA.debugLine="ws.Session.SetAttribute(\"CompanyID\",rs.GetInt(\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("CompanyID")),(Object)((_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("CompanyID"))))));
 }
;
 BA.debugLineNum = 65;BA.debugLine="rs.Close";
Debug.ShouldStop(1);
_rs.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e9.toString()); BA.debugLineNum = 68;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
login.__c.runVoidMethod ("LogImpl","25308426",BA.ObjectToString(login.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("WebSocket_Connected (login) ","login",7,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "login","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 13;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(8192);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 16;BA.debugLine="ws.Session.SetAttribute(\"UserID\",0)";
Debug.ShouldStop(32768);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("UserID")),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 17;BA.debugLine="ws.Session.SetAttribute(\"UserFullName\",0)";
Debug.ShouldStop(65536);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("UserFullName")),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 18;BA.debugLine="ws.Session.SetAttribute(\"UserEmailAddress\",0)";
Debug.ShouldStop(131072);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("UserEmailAddress")),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 20;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(524288);
__ref.setField ("_sql1" /*RemoteObject*/ ,login._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
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
		Debug.PushSubsStack("WebSocket_Disconnected (login) ","login",7,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "login","websocket_disconnected", __ref);}
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