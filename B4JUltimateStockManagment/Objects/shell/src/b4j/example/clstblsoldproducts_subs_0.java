package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clstblsoldproducts_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim PID As Int";
clstblsoldproducts._pid = RemoteObject.createImmutable(0);__ref.setField("_pid",clstblsoldproducts._pid);
 //BA.debugLineNum = 3;BA.debugLine="Dim PName As String";
clstblsoldproducts._pname = RemoteObject.createImmutable("");__ref.setField("_pname",clstblsoldproducts._pname);
 //BA.debugLineNum = 4;BA.debugLine="Dim PSellPrice As Double";
clstblsoldproducts._psellprice = RemoteObject.createImmutable(0);__ref.setField("_psellprice",clstblsoldproducts._psellprice);
 //BA.debugLineNum = 5;BA.debugLine="Dim PCostPrice As Double";
clstblsoldproducts._pcostprice = RemoteObject.createImmutable(0);__ref.setField("_pcostprice",clstblsoldproducts._pcostprice);
 //BA.debugLineNum = 6;BA.debugLine="Dim PTax As Double";
clstblsoldproducts._ptax = RemoteObject.createImmutable(0);__ref.setField("_ptax",clstblsoldproducts._ptax);
 //BA.debugLineNum = 7;BA.debugLine="Dim PQty As Int";
clstblsoldproducts._pqty = RemoteObject.createImmutable(0);__ref.setField("_pqty",clstblsoldproducts._pqty);
 //BA.debugLineNum = 8;BA.debugLine="Dim PSubTotal As Double";
clstblsoldproducts._psubtotal = RemoteObject.createImmutable(0);__ref.setField("_psubtotal",clstblsoldproducts._psubtotal);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clstblsoldproducts) ","clstblsoldproducts",23,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clstblsoldproducts","initialize", __ref, _ba);}
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
public static RemoteObject  _setup(RemoteObject __ref,RemoteObject _temppid,RemoteObject _temppname,RemoteObject _temppsellprice,RemoteObject _tempcostprice,RemoteObject _temptax,RemoteObject _tempqty,RemoteObject _tempsubtotal) throws Exception{
try {
		Debug.PushSubsStack("Setup (clstblsoldproducts) ","clstblsoldproducts",23,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("setup")) { return __ref.runUserSub(false, "clstblsoldproducts","setup", __ref, _temppid, _temppname, _temppsellprice, _tempcostprice, _temptax, _tempqty, _tempsubtotal);}
Debug.locals.put("tempPID", _temppid);
Debug.locals.put("tempPName", _temppname);
Debug.locals.put("tempPSellPrice", _temppsellprice);
Debug.locals.put("tempCostPrice", _tempcostprice);
Debug.locals.put("tempTax", _temptax);
Debug.locals.put("tempQty", _tempqty);
Debug.locals.put("tempSubTotal", _tempsubtotal);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Setup(tempPID As Int,tempPName As Strin";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="PID = tempPID";
Debug.ShouldStop(65536);
__ref.setField ("_pid" /*RemoteObject*/ ,_temppid);
 BA.debugLineNum = 18;BA.debugLine="PName = tempPName";
Debug.ShouldStop(131072);
__ref.setField ("_pname" /*RemoteObject*/ ,_temppname);
 BA.debugLineNum = 19;BA.debugLine="PSellPrice = tempPSellPrice";
Debug.ShouldStop(262144);
__ref.setField ("_psellprice" /*RemoteObject*/ ,_temppsellprice);
 BA.debugLineNum = 20;BA.debugLine="PCostPrice = tempCostPrice";
Debug.ShouldStop(524288);
__ref.setField ("_pcostprice" /*RemoteObject*/ ,_tempcostprice);
 BA.debugLineNum = 21;BA.debugLine="PTax = tempTax";
Debug.ShouldStop(1048576);
__ref.setField ("_ptax" /*RemoteObject*/ ,BA.numberCast(double.class, _temptax));
 BA.debugLineNum = 22;BA.debugLine="PQty = tempQty";
Debug.ShouldStop(2097152);
__ref.setField ("_pqty" /*RemoteObject*/ ,_tempqty);
 BA.debugLineNum = 23;BA.debugLine="PSubTotal = tempSubTotal";
Debug.ShouldStop(4194304);
__ref.setField ("_psubtotal" /*RemoteObject*/ ,_tempsubtotal);
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
}