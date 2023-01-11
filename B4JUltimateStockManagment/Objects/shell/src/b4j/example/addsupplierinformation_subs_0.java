package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class addsupplierinformation_subs_0 {


public static RemoteObject  _btncancel_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btncancel_Click (addsupplierinformation) ","addsupplierinformation",17,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("btncancel_click")) { return __ref.runUserSub(false, "addsupplierinformation","btncancel_click", __ref, _params);}
Debug.locals.put("Params", _params);
 BA.debugLineNum = 79;BA.debugLine="Sub btncancel_Click (Params As Map)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="ws.Eval(\"document.location.replace('SupplierInfo";
Debug.ShouldStop(32768);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('SupplierInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addsupplierinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("btnsave_Click (addsupplierinformation) ","addsupplierinformation",17,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("btnsave_click")) { return __ref.runUserSub(false, "addsupplierinformation","btnsave_click", __ref, _params);}
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
 BA.debugLineNum = 37;BA.debugLine="sql1.ExecNonQuery2($\"UPDATE SuppliersInfo    S";
Debug.ShouldStop(16);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("UPDATE SuppliersInfo\n"),RemoteObject.createImmutable("   SET SupplierName = ?\n"),RemoteObject.createImmutable("      ,SupplierEmail = ?\n"),RemoteObject.createImmutable("      ,SupplierPhone = ?\n"),RemoteObject.createImmutable("      ,SupplierCountry = ?\n"),RemoteObject.createImmutable("      ,SupplierCity = ?\n"),RemoteObject.createImmutable("      ,SupplierAddress = ? where SupplierID=?")))),(Object)(addsupplierinformation.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtemail" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtphone" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtcountry" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtcity" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtaddress" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(_customerid)})))));
 BA.debugLineNum = 44;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(2048);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 }else {
 BA.debugLineNum = 49;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(65536);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 50;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO SuppliersInfo";
Debug.ShouldStop(131072);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO SuppliersInfo\n"),RemoteObject.createImmutable("           (SupplierName\n"),RemoteObject.createImmutable("           ,SupplierEmail\n"),RemoteObject.createImmutable("           ,SupplierPhone\n"),RemoteObject.createImmutable("           ,SupplierCountry\n"),RemoteObject.createImmutable("           ,SupplierCity\n"),RemoteObject.createImmutable("           ,SupplierAddress)\n"),RemoteObject.createImmutable("     VALUES\n"),RemoteObject.createImmutable("           (?\n"),RemoteObject.createImmutable("           ,?\n"),RemoteObject.createImmutable("           ,?\n"),RemoteObject.createImmutable("           ,?\n"),RemoteObject.createImmutable("           ,?\n"),RemoteObject.createImmutable("           ,?)")))),(Object)(addsupplierinformation.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtemail" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtphone" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtcountry" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtcity" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtaddress" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue")})))));
 BA.debugLineNum = 65;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(1);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 };
 BA.debugLineNum = 70;BA.debugLine="Main.Insert_UsersLogs(ws,\"Supplier Information\")";
Debug.ShouldStop(32);
addsupplierinformation._main.runVoidMethod ("_insert_userslogs" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("Supplier Information")));
 BA.debugLineNum = 72;BA.debugLine="ws.Eval(\"document.location.replace('SupplierInfo";
Debug.ShouldStop(128);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('SupplierInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addsupplierinformation.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e18.toString()); BA.debugLineNum = 76;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
addsupplierinformation.__c.runVoidMethod ("LogImpl","212189747",BA.ObjectToString(addsupplierinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
addsupplierinformation._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",addsupplierinformation._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private txtname,txtaddress,txtcity,txtcountry,txt";
addsupplierinformation._txtname = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtname",addsupplierinformation._txtname);
addsupplierinformation._txtaddress = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtaddress",addsupplierinformation._txtaddress);
addsupplierinformation._txtcity = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtcity",addsupplierinformation._txtcity);
addsupplierinformation._txtcountry = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtcountry",addsupplierinformation._txtcountry);
addsupplierinformation._txtphone = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtphone",addsupplierinformation._txtphone);
addsupplierinformation._txtemail = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtemail",addsupplierinformation._txtemail);
addsupplierinformation._btnsave = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_btnsave",addsupplierinformation._btnsave);
addsupplierinformation._btncancel = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_btncancel",addsupplierinformation._btncancel);
 //BA.debugLineNum = 5;BA.debugLine="Private lblusernamemain As JQueryElement";
addsupplierinformation._lblusernamemain = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblusernamemain",addsupplierinformation._lblusernamemain);
 //BA.debugLineNum = 6;BA.debugLine="Private divMenu As JQueryElement";
addsupplierinformation._divmenu = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divmenu",addsupplierinformation._divmenu);
 //BA.debugLineNum = 7;BA.debugLine="Private sql1 As SQL";
addsupplierinformation._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",addsupplierinformation._sql1);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (addsupplierinformation) ","addsupplierinformation",17,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "addsupplierinformation","initialize", __ref, _ba);}
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
		Debug.PushSubsStack("Load_Data_ByID (addsupplierinformation) ","addsupplierinformation",17,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("load_data_byid")) { return __ref.runUserSub(false, "addsupplierinformation","load_data_byid", __ref);}
RemoteObject _customerid = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
 BA.debugLineNum = 89;BA.debugLine="Sub Load_Data_ByID";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 92;BA.debugLine="Dim CustomerID As Int = ws.Session.GetAttribute(";
Debug.ShouldStop(134217728);
_customerid = BA.numberCast(int.class, __ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("CustomerID"))));Debug.locals.put("CustomerID", _customerid);Debug.locals.put("CustomerID", _customerid);
 BA.debugLineNum = 93;BA.debugLine="If CustomerID > 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_customerid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 95;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(1073741824);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 96;BA.debugLine="rs = sql1.ExecQuery(\"select * from  SuppliersIn";
Debug.ShouldStop(-2147483648);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from  SuppliersInfo where SupplierID="),_customerid)));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 97;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(1);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 99;BA.debugLine="txtname.SetVal(rs.GetString(\"SupplierName\"))";
Debug.ShouldStop(4);
__ref.getField(false,"_txtname" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SupplierName"))))));
 BA.debugLineNum = 100;BA.debugLine="txtaddress.SetVal(rs.GetString(\"SupplierAddres";
Debug.ShouldStop(8);
__ref.getField(false,"_txtaddress" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SupplierAddress"))))));
 BA.debugLineNum = 101;BA.debugLine="txtcountry.SetVal(rs.GetString(\"SupplierCountr";
Debug.ShouldStop(16);
__ref.getField(false,"_txtcountry" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SupplierCountry"))))));
 BA.debugLineNum = 102;BA.debugLine="txtcity.SetVal(rs.GetString(\"SupplierCity\"))";
Debug.ShouldStop(32);
__ref.getField(false,"_txtcity" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SupplierCity"))))));
 BA.debugLineNum = 104;BA.debugLine="txtphone.SetVal(rs.GetString(\"SupplierPhone\"))";
Debug.ShouldStop(128);
__ref.getField(false,"_txtphone" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SupplierPhone"))))));
 BA.debugLineNum = 105;BA.debugLine="txtemail.SetVal(rs.GetString(\"SupplierEmail\"))";
Debug.ShouldStop(256);
__ref.getField(false,"_txtemail" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SupplierEmail"))))));
 }
;
 BA.debugLineNum = 108;BA.debugLine="rs.Close";
Debug.ShouldStop(2048);
_rs.runVoidMethod ("Close");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e17.toString()); BA.debugLineNum = 113;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
addsupplierinformation.__c.runVoidMethod ("LogImpl","212386328",BA.ObjectToString(addsupplierinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("WebSocket_Connected (addsupplierinformation) ","addsupplierinformation",17,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "addsupplierinformation","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 15;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(32768);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 17;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
Debug.ShouldStop(65536);
addsupplierinformation._main.runVoidMethod ("_validateusers" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblusernamemain" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_divmenu" /*RemoteObject*/ )));
 BA.debugLineNum = 18;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(131072);
__ref.setField ("_sql1" /*RemoteObject*/ ,addsupplierinformation._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 21;BA.debugLine="Load_Data_ByID";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.addsupplierinformation.class, "_load_data_byid" /*RemoteObject*/ );
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
		Debug.PushSubsStack("WebSocket_Disconnected (addsupplierinformation) ","addsupplierinformation",17,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "addsupplierinformation","websocket_disconnected", __ref);}
 BA.debugLineNum = 83;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="If sql1.IsInitialized Then";
Debug.ShouldStop(524288);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 85;BA.debugLine="sql1.Close";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
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
}