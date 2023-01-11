package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class addcustomersinformation_subs_0 {


public static RemoteObject  _btncancel_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btncancel_Click (addcustomersinformation) ","addcustomersinformation",11,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("btncancel_click")) { return __ref.runUserSub(false, "addcustomersinformation","btncancel_click", __ref, _params);}
Debug.locals.put("Params", _params);
 BA.debugLineNum = 66;BA.debugLine="Sub btncancel_Click (Params As Map)";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="ws.Eval(\"document.location.replace('CustomersInf";
Debug.ShouldStop(4);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('CustomersInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addcustomersinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("btnsave_Click (addcustomersinformation) ","addcustomersinformation",11,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("btnsave_click")) { return __ref.runUserSub(false, "addcustomersinformation","btnsave_click", __ref, _params);}
RemoteObject _customerid = RemoteObject.createImmutable(0);
Debug.locals.put("Params", _params);
 BA.debugLineNum = 25;BA.debugLine="Sub btnsave_Click (Params As Map)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 28;BA.debugLine="If txtname.GetVal.Value = \"\" Or txtaddress.GetVa";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable((""))) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtaddress" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable((""))) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtcity" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable((""))) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtphone" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 29;BA.debugLine="Return";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 33;BA.debugLine="Dim CustomerID As Int = ws.Session.GetAttribute(";
Debug.ShouldStop(1);
_customerid = BA.numberCast(int.class, __ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("CustomerID"))));Debug.locals.put("CustomerID", _customerid);Debug.locals.put("CustomerID", _customerid);
 BA.debugLineNum = 34;BA.debugLine="If CustomerID > 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_customerid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 36;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(8);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 37;BA.debugLine="sql1.ExecNonQuery2($\"UPDATE CustomersInformati";
Debug.ShouldStop(16);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("UPDATE CustomersInformation\n"),RemoteObject.createImmutable("   SET CustomerName = ?\n"),RemoteObject.createImmutable("      ,CustEmail = ?\n"),RemoteObject.createImmutable("      ,CustPhone = ?\n"),RemoteObject.createImmutable("      ,CustCountry = ?\n"),RemoteObject.createImmutable("      ,CustCity = ?\n"),RemoteObject.createImmutable("      ,CustAddress = ? where CustomerID=?")))),(Object)(addcustomersinformation.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtemail" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtphone" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtcountry" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtcity" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtaddress" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(_customerid)})))));
 BA.debugLineNum = 44;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(2048);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 }else {
 BA.debugLineNum = 49;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(65536);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 50;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO CustomersInfo";
Debug.ShouldStop(131072);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.createImmutable("INSERT INTO CustomersInformation(CustomerName,CustEmail,CustPhone,CustCountry,CustCity,CustAddress) VALUES (?,?,?,?,?,?)"))),(Object)(addcustomersinformation.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtemail" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtphone" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtcountry" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtcity" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtaddress" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue")})))));
 BA.debugLineNum = 52;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(524288);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 };
 BA.debugLineNum = 57;BA.debugLine="Main.Insert_UsersLogs(ws,\"Customer Information\")";
Debug.ShouldStop(16777216);
addcustomersinformation._main.runVoidMethod ("_insert_userslogs" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("Customer Information")));
 BA.debugLineNum = 59;BA.debugLine="ws.Eval(\"document.location.replace('CustomersInf";
Debug.ShouldStop(67108864);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('CustomersInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addcustomersinformation.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e18.toString()); BA.debugLineNum = 63;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
addcustomersinformation.__c.runVoidMethod ("LogImpl","27077926",BA.ObjectToString(addcustomersinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
addcustomersinformation._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",addcustomersinformation._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private txtname,txtaddress,txtcity,txtcountry,txt";
addcustomersinformation._txtname = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtname",addcustomersinformation._txtname);
addcustomersinformation._txtaddress = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtaddress",addcustomersinformation._txtaddress);
addcustomersinformation._txtcity = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtcity",addcustomersinformation._txtcity);
addcustomersinformation._txtcountry = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtcountry",addcustomersinformation._txtcountry);
addcustomersinformation._txtphone = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtphone",addcustomersinformation._txtphone);
addcustomersinformation._txtemail = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtemail",addcustomersinformation._txtemail);
addcustomersinformation._btnsave = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_btnsave",addcustomersinformation._btnsave);
addcustomersinformation._btncancel = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_btncancel",addcustomersinformation._btncancel);
 //BA.debugLineNum = 5;BA.debugLine="Private lblusernamemain As JQueryElement";
addcustomersinformation._lblusernamemain = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblusernamemain",addcustomersinformation._lblusernamemain);
 //BA.debugLineNum = 6;BA.debugLine="Private divMenu As JQueryElement";
addcustomersinformation._divmenu = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divmenu",addcustomersinformation._divmenu);
 //BA.debugLineNum = 7;BA.debugLine="Private sql1 As SQL";
addcustomersinformation._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",addcustomersinformation._sql1);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (addcustomersinformation) ","addcustomersinformation",11,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "addcustomersinformation","initialize", __ref, _ba);}
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
		Debug.PushSubsStack("Load_Data_ByID (addcustomersinformation) ","addcustomersinformation",11,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("load_data_byid")) { return __ref.runUserSub(false, "addcustomersinformation","load_data_byid", __ref);}
RemoteObject _customerid = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
 BA.debugLineNum = 76;BA.debugLine="Sub Load_Data_ByID";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 79;BA.debugLine="Dim CustomerID As Int = ws.Session.GetAttribute(";
Debug.ShouldStop(16384);
_customerid = BA.numberCast(int.class, __ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("CustomerID"))));Debug.locals.put("CustomerID", _customerid);Debug.locals.put("CustomerID", _customerid);
 BA.debugLineNum = 80;BA.debugLine="If CustomerID > 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",_customerid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 82;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(131072);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 83;BA.debugLine="rs = sql1.ExecQuery(\"select * from  CustomersIn";
Debug.ShouldStop(262144);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from  CustomersInformation where CustomerID="),_customerid)));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 84;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(524288);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 86;BA.debugLine="txtname.SetVal(rs.GetString(\"CustomerName\"))";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtname" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CustomerName"))))));
 BA.debugLineNum = 87;BA.debugLine="txtaddress.SetVal(rs.GetString(\"CustAddress\"))";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txtaddress" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CustAddress"))))));
 BA.debugLineNum = 88;BA.debugLine="txtcountry.SetVal(rs.GetString(\"CustCountry\"))";
Debug.ShouldStop(8388608);
__ref.getField(false,"_txtcountry" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CustCountry"))))));
 BA.debugLineNum = 89;BA.debugLine="txtcity.SetVal(rs.GetString(\"CustCity\"))";
Debug.ShouldStop(16777216);
__ref.getField(false,"_txtcity" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CustCity"))))));
 BA.debugLineNum = 91;BA.debugLine="txtphone.SetVal(rs.GetString(\"CustPhone\"))";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txtphone" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CustPhone"))))));
 BA.debugLineNum = 92;BA.debugLine="txtemail.SetVal(rs.GetString(\"CustEmail\"))";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txtemail" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CustEmail"))))));
 }
;
 BA.debugLineNum = 95;BA.debugLine="rs.Close";
Debug.ShouldStop(1073741824);
_rs.runVoidMethod ("Close");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e17.toString()); BA.debugLineNum = 100;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
addcustomersinformation.__c.runVoidMethod ("LogImpl","27274520",BA.ObjectToString(addcustomersinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 102;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("WebSocket_Connected (addcustomersinformation) ","addcustomersinformation",11,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "addcustomersinformation","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 15;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(32768);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 17;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
Debug.ShouldStop(65536);
addcustomersinformation._main.runVoidMethod ("_validateusers" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblusernamemain" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_divmenu" /*RemoteObject*/ )));
 BA.debugLineNum = 18;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(131072);
__ref.setField ("_sql1" /*RemoteObject*/ ,addcustomersinformation._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 21;BA.debugLine="Load_Data_ByID";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.addcustomersinformation.class, "_load_data_byid" /*RemoteObject*/ );
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
		Debug.PushSubsStack("WebSocket_Disconnected (addcustomersinformation) ","addcustomersinformation",11,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "addcustomersinformation","websocket_disconnected", __ref);}
 BA.debugLineNum = 70;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="If sql1.IsInitialized Then";
Debug.ShouldStop(64);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 72;BA.debugLine="sql1.Close";
Debug.ShouldStop(128);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}