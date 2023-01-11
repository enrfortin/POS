package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clstempproducts_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim ProductID As Int";
clstempproducts._productid = RemoteObject.createImmutable(0);__ref.setField("_productid",clstempproducts._productid);
 //BA.debugLineNum = 3;BA.debugLine="Dim ProductName As String";
clstempproducts._productname = RemoteObject.createImmutable("");__ref.setField("_productname",clstempproducts._productname);
 //BA.debugLineNum = 4;BA.debugLine="Dim TaxID As Int";
clstempproducts._taxid = RemoteObject.createImmutable(0);__ref.setField("_taxid",clstempproducts._taxid);
 //BA.debugLineNum = 5;BA.debugLine="Dim UnitPrice As Double";
clstempproducts._unitprice = RemoteObject.createImmutable(0);__ref.setField("_unitprice",clstempproducts._unitprice);
 //BA.debugLineNum = 6;BA.debugLine="Dim Qty As Int";
clstempproducts._qty = RemoteObject.createImmutable(0);__ref.setField("_qty",clstempproducts._qty);
 //BA.debugLineNum = 7;BA.debugLine="Dim Discount As Double";
clstempproducts._discount = RemoteObject.createImmutable(0);__ref.setField("_discount",clstempproducts._discount);
 //BA.debugLineNum = 8;BA.debugLine="Dim ProductCostPrice As Double";
clstempproducts._productcostprice = RemoteObject.createImmutable(0);__ref.setField("_productcostprice",clstempproducts._productcostprice);
 //BA.debugLineNum = 9;BA.debugLine="Private sql1 As SQL";
clstempproducts._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",clstempproducts._sql1);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _get_productcostprice(RemoteObject __ref,RemoteObject _tempproductid) throws Exception{
try {
		Debug.PushSubsStack("Get_ProductCostPrice (clstempproducts) ","clstempproducts",24,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("get_productcostprice")) { return __ref.runUserSub(false, "clstempproducts","get_productcostprice", __ref, _tempproductid);}
RemoteObject _tempname = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
Debug.locals.put("tempProductID", _tempproductid);
 BA.debugLineNum = 49;BA.debugLine="Private Sub Get_ProductCostPrice(tempProductID) As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 51;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(262144);
__ref.setField ("_sql1" /*RemoteObject*/ ,clstempproducts._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 53;BA.debugLine="Dim tempName As Double = 0";
Debug.ShouldStop(1048576);
_tempname = BA.numberCast(double.class, 0);Debug.locals.put("tempName", _tempname);Debug.locals.put("tempName", _tempname);
 BA.debugLineNum = 54;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(2097152);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 55;BA.debugLine="rs = sql1.ExecQuery(\"select CostPrice from Produ";
Debug.ShouldStop(4194304);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select CostPrice from ProductsInformation where ProductID="),_tempproductid)));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 56;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(8388608);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 57;BA.debugLine="tempName = rs.GetString(\"CostPrice\")";
Debug.ShouldStop(16777216);
_tempname = BA.numberCast(double.class, _rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CostPrice"))));Debug.locals.put("tempName", _tempname);
 }
;
 BA.debugLineNum = 59;BA.debugLine="rs.Close";
Debug.ShouldStop(67108864);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 61;BA.debugLine="If sql1.IsInitialized Then";
Debug.ShouldStop(268435456);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 62;BA.debugLine="sql1.Close";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 65;BA.debugLine="Return tempName";
Debug.ShouldStop(1);
Debug.CheckDeviceExceptions();if (true) return _tempname;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e15.toString()); BA.debugLineNum = 67;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
clstempproducts.__c.runVoidMethod ("LogImpl","216056338",BA.ObjectToString(clstempproducts.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get_productname(RemoteObject __ref,RemoteObject _tempproductid) throws Exception{
try {
		Debug.PushSubsStack("Get_ProductName (clstempproducts) ","clstempproducts",24,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("get_productname")) { return __ref.runUserSub(false, "clstempproducts","get_productname", __ref, _tempproductid);}
RemoteObject _tempname = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
Debug.locals.put("tempProductID", _tempproductid);
 BA.debugLineNum = 28;BA.debugLine="Private Sub Get_ProductName(tempProductID) As Stri";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 30;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(536870912);
__ref.setField ("_sql1" /*RemoteObject*/ ,clstempproducts._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 32;BA.debugLine="Dim tempName As String= \"\"";
Debug.ShouldStop(-2147483648);
_tempname = BA.ObjectToString("");Debug.locals.put("tempName", _tempname);Debug.locals.put("tempName", _tempname);
 BA.debugLineNum = 33;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(1);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 34;BA.debugLine="rs = sql1.ExecQuery(\"select ProductName from Pro";
Debug.ShouldStop(2);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select ProductName from ProductsInformation where ProductID="),_tempproductid)));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 35;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(4);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 36;BA.debugLine="tempName = rs.GetString(\"ProductName\")";
Debug.ShouldStop(8);
_tempname = _rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductName")));Debug.locals.put("tempName", _tempname);
 }
;
 BA.debugLineNum = 38;BA.debugLine="rs.Close";
Debug.ShouldStop(32);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 40;BA.debugLine="If sql1.IsInitialized Then";
Debug.ShouldStop(128);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 41;BA.debugLine="sql1.Close";
Debug.ShouldStop(256);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 44;BA.debugLine="Return tempName";
Debug.ShouldStop(2048);
Debug.CheckDeviceExceptions();if (true) return _tempname;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e15.toString()); BA.debugLineNum = 46;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
clstempproducts.__c.runVoidMethod ("LogImpl","215990802",BA.ObjectToString(clstempproducts.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Initialize (clstempproducts) ","clstempproducts",24,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clstempproducts","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(8192);
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalues(RemoteObject __ref,RemoteObject _tempproductid,RemoteObject _temptaxid,RemoteObject _tempunitprice,RemoteObject _tempqty,RemoteObject _tempdiscount) throws Exception{
try {
		Debug.PushSubsStack("SetValues (clstempproducts) ","clstempproducts",24,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("setvalues")) { return __ref.runUserSub(false, "clstempproducts","setvalues", __ref, _tempproductid, _temptaxid, _tempunitprice, _tempqty, _tempdiscount);}
Debug.locals.put("tempProductID", _tempproductid);
Debug.locals.put("tempTaxID", _temptaxid);
Debug.locals.put("tempUnitPrice", _tempunitprice);
Debug.locals.put("tempQty", _tempqty);
Debug.locals.put("tempDiscount", _tempdiscount);
 BA.debugLineNum = 17;BA.debugLine="Public Sub SetValues(tempProductID As Int,tempTaxI";
Debug.ShouldStop(65536);
 BA.debugLineNum = 19;BA.debugLine="ProductID = tempProductID";
Debug.ShouldStop(262144);
__ref.setField ("_productid" /*RemoteObject*/ ,_tempproductid);
 BA.debugLineNum = 20;BA.debugLine="TaxID = tempTaxID";
Debug.ShouldStop(524288);
__ref.setField ("_taxid" /*RemoteObject*/ ,_temptaxid);
 BA.debugLineNum = 21;BA.debugLine="UnitPrice = tempUnitPrice";
Debug.ShouldStop(1048576);
__ref.setField ("_unitprice" /*RemoteObject*/ ,BA.numberCast(double.class, _tempunitprice));
 BA.debugLineNum = 22;BA.debugLine="Qty = tempQty";
Debug.ShouldStop(2097152);
__ref.setField ("_qty" /*RemoteObject*/ ,_tempqty);
 BA.debugLineNum = 23;BA.debugLine="Discount = tempDiscount";
Debug.ShouldStop(4194304);
__ref.setField ("_discount" /*RemoteObject*/ ,BA.numberCast(double.class, _tempdiscount));
 BA.debugLineNum = 24;BA.debugLine="ProductCostPrice = Get_ProductCostPrice(tempProdu";
Debug.ShouldStop(8388608);
__ref.setField ("_productcostprice" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.clstempproducts.class, "_get_productcostprice" /*RemoteObject*/ ,(Object)(BA.NumberToString(_tempproductid))));
 BA.debugLineNum = 25;BA.debugLine="ProductName = Get_ProductName(tempProductID)";
Debug.ShouldStop(16777216);
__ref.setField ("_productname" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.clstempproducts.class, "_get_productname" /*RemoteObject*/ ,(Object)(BA.NumberToString(_tempproductid))));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}