package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class addtransferinfo_subs_0 {


public static RemoteObject  _btnaddproduct_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btnaddproduct_Click (addtransferinfo) ","addtransferinfo",18,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("btnaddproduct_click")) { return __ref.runUserSub(false, "addtransferinfo","btnaddproduct_click", __ref, _params);}
RemoteObject _classtempprod = RemoteObject.declareNull("b4j.example.clstempproducts");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 94;BA.debugLine="Sub btnaddproduct_Click (Params As Map)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 96;BA.debugLine="If cmbproduct.GetVal.Value = \"0\" Or txtunitprice";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cmbproduct" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable(("0"))) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtunitprice" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable((""))) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtqty" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable((""))) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtdiscount" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 97;BA.debugLine="Return";
Debug.ShouldStop(1);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 100;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
Debug.ShouldStop(8);
_classtempprod = RemoteObject.createNew ("b4j.example.clstempproducts");Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 101;BA.debugLine="ClassTempProd.Initialize";
Debug.ShouldStop(16);
_classtempprod.runClassMethod (b4j.example.clstempproducts.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 102;BA.debugLine="ClassTempProd.SetValues(cmbproduct.GetVal.Value,";
Debug.ShouldStop(32);
_classtempprod.runClassMethod (b4j.example.clstempproducts.class, "_setvalues" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_cmbproduct" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txttax" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"))),(Object)(BA.numberCast(float.class, __ref.getField(false,"_txtunitprice" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtqty" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"))),(Object)(BA.numberCast(float.class, __ref.getField(false,"_txtdiscount" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"))));
 BA.debugLineNum = 104;BA.debugLine="TempProductsTable.Add(ClassTempProd)";
Debug.ShouldStop(128);
__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_classtempprod)));
 BA.debugLineNum = 105;BA.debugLine="Load_AddedProducts_Temp";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.addtransferinfo.class, "_load_addedproducts_temp" /*RemoteObject*/ );
 BA.debugLineNum = 107;BA.debugLine="txtunitprice.SetVal(\"0\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_txtunitprice" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 108;BA.debugLine="txtqty.SetVal(\"0\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_txtqty" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 109;BA.debugLine="txtdiscount.SetVal(\"0\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_txtdiscount" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable("0"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e14.toString()); BA.debugLineNum = 112;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
addtransferinfo.__c.runVoidMethod ("LogImpl","212845074",BA.ObjectToString(addtransferinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncancel_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btncancel_Click (addtransferinfo) ","addtransferinfo",18,__ref.getField(false, "ba"),__ref,356);
if (RapidSub.canDelegate("btncancel_click")) { return __ref.runUserSub(false, "addtransferinfo","btncancel_click", __ref, _params);}
Debug.locals.put("Params", _params);
 BA.debugLineNum = 356;BA.debugLine="Sub btncancel_Click (Params As Map)";
Debug.ShouldStop(8);
 BA.debugLineNum = 357;BA.debugLine="ws.Eval(\"document.location.replace('TransferInfo";
Debug.ShouldStop(16);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('TransferInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addtransferinfo.__c.getField(false,"Null")));
 BA.debugLineNum = 358;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("btnsave_Click (addtransferinfo) ","addtransferinfo",18,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("btnsave_click")) { return __ref.runUserSub(false, "addtransferinfo","btnsave_click", __ref, _params);}
RemoteObject _lastsavedid = RemoteObject.createImmutable(0);
RemoteObject _invoiceid = RemoteObject.createImmutable(0);
RemoteObject _dblinvtotal = RemoteObject.createImmutable(0);
RemoteObject _dblinvtotaltax = RemoteObject.createImmutable(0);
RemoteObject _dblinvtotaldiscount = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _classtempprod = RemoteObject.declareNull("b4j.example.clstempproducts");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 200;BA.debugLine="Sub btnsave_Click (Params As Map)";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 203;BA.debugLine="Dim LastSavedID As Int = 0";
Debug.ShouldStop(1024);
_lastsavedid = BA.numberCast(int.class, 0);Debug.locals.put("LastSavedID", _lastsavedid);Debug.locals.put("LastSavedID", _lastsavedid);
 BA.debugLineNum = 206;BA.debugLine="If txtinvdate.GetVal.Value = \"\"  Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtinvdate" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 207;BA.debugLine="Return";
Debug.ShouldStop(16384);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 210;BA.debugLine="Dim InvoiceID As Int = 0";
Debug.ShouldStop(131072);
_invoiceid = BA.numberCast(int.class, 0);Debug.locals.put("InvoiceID", _invoiceid);Debug.locals.put("InvoiceID", _invoiceid);
 BA.debugLineNum = 211;BA.debugLine="If ws.Session.GetAttribute(\"InvoiceID\") = Null T";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("InvoiceID"))))) { 
 }else {
 BA.debugLineNum = 214;BA.debugLine="InvoiceID = ws.Session.GetAttribute(\"InvoiceID\"";
Debug.ShouldStop(2097152);
_invoiceid = BA.numberCast(int.class, __ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("InvoiceID"))));Debug.locals.put("InvoiceID", _invoiceid);
 BA.debugLineNum = 215;BA.debugLine="LastSavedID = InvoiceID";
Debug.ShouldStop(4194304);
_lastsavedid = _invoiceid;Debug.locals.put("LastSavedID", _lastsavedid);
 };
 BA.debugLineNum = 218;BA.debugLine="Dim dblinvtotal,dblinvtotaltax,dblinvtotaldisco";
Debug.ShouldStop(33554432);
_dblinvtotal = RemoteObject.createImmutable(0);Debug.locals.put("dblinvtotal", _dblinvtotal);
_dblinvtotaltax = RemoteObject.createImmutable(0);Debug.locals.put("dblinvtotaltax", _dblinvtotaltax);
_dblinvtotaldiscount = BA.numberCast(double.class, 0);Debug.locals.put("dblinvtotaldiscount", _dblinvtotaldiscount);Debug.locals.put("dblinvtotaldiscount", _dblinvtotaldiscount);
 BA.debugLineNum = 220;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
Debug.ShouldStop(134217728);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 222;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
Debug.ShouldStop(536870912);
_classtempprod = RemoteObject.createNew ("b4j.example.clstempproducts");Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 223;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
Debug.ShouldStop(1073741824);
_classtempprod = (__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 225;BA.debugLine="dblinvtotal = ClassTempProd.Qty * ClassTempPr";
Debug.ShouldStop(1);
_dblinvtotal = RemoteObject.solve(new RemoteObject[] {_classtempprod.getField(true,"_qty" /*RemoteObject*/ ),_classtempprod.getField(true,"_unitprice" /*RemoteObject*/ )}, "*",0, 0);Debug.locals.put("dblinvtotal", _dblinvtotal);
 BA.debugLineNum = 226;BA.debugLine="dblinvtotaltax = dblinvtotal * (ClassTempProd";
Debug.ShouldStop(2);
_dblinvtotaltax = RemoteObject.solve(new RemoteObject[] {_dblinvtotal,(RemoteObject.solve(new RemoteObject[] {_classtempprod.getField(true,"_taxid" /*RemoteObject*/ ),RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0);Debug.locals.put("dblinvtotaltax", _dblinvtotaltax);
 BA.debugLineNum = 227;BA.debugLine="dblinvtotaldiscount = ClassTempProd.Discount";
Debug.ShouldStop(4);
_dblinvtotaldiscount = _classtempprod.getField(true,"_discount" /*RemoteObject*/ );Debug.locals.put("dblinvtotaldiscount", _dblinvtotaldiscount);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 230;BA.debugLine="dblinvtotal = dblinvtotal + dblinvtotaltax";
Debug.ShouldStop(32);
_dblinvtotal = RemoteObject.solve(new RemoteObject[] {_dblinvtotal,_dblinvtotaltax}, "+",1, 0);Debug.locals.put("dblinvtotal", _dblinvtotal);
 BA.debugLineNum = 231;BA.debugLine="dblinvtotal = dblinvtotal - dblinvtotaldiscoun";
Debug.ShouldStop(64);
_dblinvtotal = RemoteObject.solve(new RemoteObject[] {_dblinvtotal,_dblinvtotaldiscount}, "-",1, 0);Debug.locals.put("dblinvtotal", _dblinvtotal);
 BA.debugLineNum = 233;BA.debugLine="If InvoiceID > 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_invoiceid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 238;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(8192);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 239;BA.debugLine="sql1.ExecNonQuery2($\"UPDATE TransferH 				   S";
Debug.ShouldStop(16384);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("UPDATE TransferH\n"),RemoteObject.createImmutable("				   SET InvDT = ?\n"),RemoteObject.createImmutable("				      ,InvTotal = ?\n"),RemoteObject.createImmutable("				      ,FromWarehouseID = ?\n"),RemoteObject.createImmutable("				      ,InvTotalTax = ?\n"),RemoteObject.createImmutable("				      ,InvTotalDiscount = ?\n"),RemoteObject.createImmutable("				      ,InvTotalShipping = ?\n"),RemoteObject.createImmutable("				      ,PaidAmount = ?\n"),RemoteObject.createImmutable("				      ,StrNotes = ?\n"),RemoteObject.createImmutable("				      ,PaymenttypeID = ?\n"),RemoteObject.createImmutable("				      ,ToWarehouseID = ?\n"),RemoteObject.createImmutable("				 WHERE TransferHID=?")))),(Object)(addtransferinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {11},new Object[] {__ref.getField(false,"_txtinvdate" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(_dblinvtotal),__ref.getField(false,"_cmbfromwarehouse" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(_dblinvtotaltax),(_dblinvtotaldiscount),RemoteObject.createImmutable((0)),RemoteObject.createImmutable((0)),__ref.getField(false,"_txtinvnote" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable((0)),__ref.getField(false,"_cmbtowarehouse" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(_invoiceid)})))));
 BA.debugLineNum = 252;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 254;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 255;BA.debugLine="sql1.ExecNonQuery2(\"delete from TransferD wher";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("delete from TransferD where TransferHID=?")),(Object)(addtransferinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_invoiceid)})))));
 BA.debugLineNum = 256;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 258;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
Debug.ShouldStop(2);
{
final int step29 = 1;
final int limit29 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29) ;_i = ((int)(0 + _i + step29))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 260;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
Debug.ShouldStop(8);
_classtempprod = RemoteObject.createNew ("b4j.example.clstempproducts");Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 261;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
Debug.ShouldStop(16);
_classtempprod = (__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 263;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(64);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 264;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO TransferD";
Debug.ShouldStop(128);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO TransferD\n"),RemoteObject.createImmutable("			           (TransferHID\n"),RemoteObject.createImmutable("			           ,ProductID\n"),RemoteObject.createImmutable("			           ,ProductSellPrice\n"),RemoteObject.createImmutable("			           ,ProductCostPrice\n"),RemoteObject.createImmutable("			           ,TaxPerc\n"),RemoteObject.createImmutable("			           ,ProductQty)\n"),RemoteObject.createImmutable("			     VALUES\n"),RemoteObject.createImmutable("			           (?\n"),RemoteObject.createImmutable("			           ,?\n"),RemoteObject.createImmutable("			           ,?\n"),RemoteObject.createImmutable("			           ,?\n"),RemoteObject.createImmutable("			           ,?\n"),RemoteObject.createImmutable("			           ,?)")))),(Object)(addtransferinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_invoiceid),(_classtempprod.getField(true,"_productid" /*RemoteObject*/ )),(_classtempprod.getField(true,"_unitprice" /*RemoteObject*/ )),(_classtempprod.getField(true,"_productcostprice" /*RemoteObject*/ )),(_classtempprod.getField(true,"_taxid" /*RemoteObject*/ )),(_classtempprod.getField(true,"_qty" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 278;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 287;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 288;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO TransferH";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO TransferH\n"),RemoteObject.createImmutable("				           (InvDT\n"),RemoteObject.createImmutable("				           ,InvTotal\n"),RemoteObject.createImmutable("				           ,FromWarehouseID\n"),RemoteObject.createImmutable("				           ,InvTotalTax\n"),RemoteObject.createImmutable("				           ,InvTotalDiscount\n"),RemoteObject.createImmutable("				           ,InvTotalShipping\n"),RemoteObject.createImmutable("				           ,PaidAmount\n"),RemoteObject.createImmutable("				           ,StrNotes\n"),RemoteObject.createImmutable("				           ,PaymenttypeID\n"),RemoteObject.createImmutable("				           ,ToWarehouseID)\n"),RemoteObject.createImmutable("				     VALUES\n"),RemoteObject.createImmutable("				           (?\n"),RemoteObject.createImmutable("				           ,?\n"),RemoteObject.createImmutable("				           ,?\n"),RemoteObject.createImmutable("				           ,?\n"),RemoteObject.createImmutable("				           ,?\n"),RemoteObject.createImmutable("				           ,?\n"),RemoteObject.createImmutable("				           ,?\n"),RemoteObject.createImmutable("				           ,?\n"),RemoteObject.createImmutable("				           ,?\n"),RemoteObject.createImmutable("				           ,?)")))),(Object)(addtransferinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {10},new Object[] {__ref.getField(false,"_txtinvdate" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(_dblinvtotal),__ref.getField(false,"_cmbfromwarehouse" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(_dblinvtotaltax),(_dblinvtotaldiscount),RemoteObject.createImmutable((0)),RemoteObject.createImmutable((0)),__ref.getField(false,"_txtinvnote" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable((0)),__ref.getField(false,"_cmbtowarehouse" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue")})))));
 BA.debugLineNum = 312;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(8388608);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 314;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(33554432);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 315;BA.debugLine="rs = sql1.ExecQuery(\"select TransferHID from";
Debug.ShouldStop(67108864);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select TransferHID from TransferH order by TransferHID desc limit 1")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 316;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(134217728);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 317;BA.debugLine="LastSavedID = rs.GetInt(\"TransferHID\")";
Debug.ShouldStop(268435456);
_lastsavedid = _rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("TransferHID")));Debug.locals.put("LastSavedID", _lastsavedid);
 }
;
 BA.debugLineNum = 319;BA.debugLine="rs.Close";
Debug.ShouldStop(1073741824);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 321;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
Debug.ShouldStop(1);
{
final int step46 = 1;
final int limit46 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step46 > 0 && _i <= limit46) || (step46 < 0 && _i >= limit46) ;_i = ((int)(0 + _i + step46))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 322;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
Debug.ShouldStop(2);
_classtempprod = RemoteObject.createNew ("b4j.example.clstempproducts");Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 323;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
Debug.ShouldStop(4);
_classtempprod = (__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 325;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(16);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 326;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO TransferD";
Debug.ShouldStop(32);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO TransferD\n"),RemoteObject.createImmutable("					           (TransferHID\n"),RemoteObject.createImmutable("					           ,ProductID\n"),RemoteObject.createImmutable("					           ,ProductSellPrice\n"),RemoteObject.createImmutable("					           ,ProductCostPrice\n"),RemoteObject.createImmutable("					           ,TaxPerc\n"),RemoteObject.createImmutable("					           ,ProductQty)\n"),RemoteObject.createImmutable("					     VALUES\n"),RemoteObject.createImmutable("					           (?\n"),RemoteObject.createImmutable("					           ,?\n"),RemoteObject.createImmutable("					           ,?\n"),RemoteObject.createImmutable("					           ,?\n"),RemoteObject.createImmutable("					           ,?\n"),RemoteObject.createImmutable("					           ,?)")))),(Object)(addtransferinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_invoiceid),(_classtempprod.getField(true,"_productid" /*RemoteObject*/ )),(_classtempprod.getField(true,"_unitprice" /*RemoteObject*/ )),(_classtempprod.getField(true,"_productcostprice" /*RemoteObject*/ )),(_classtempprod.getField(true,"_taxid" /*RemoteObject*/ )),(_classtempprod.getField(true,"_qty" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 340;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(524288);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 347;BA.debugLine="Main.Insert_UsersLogs(ws,\"Invoice Information\")";
Debug.ShouldStop(67108864);
addtransferinfo._main.runVoidMethod ("_insert_userslogs" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("Invoice Information")));
 BA.debugLineNum = 350;BA.debugLine="ws.Eval(\"document.location.replace('TransferInfo";
Debug.ShouldStop(536870912);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('TransferInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addtransferinfo.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e57) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e57.toString()); BA.debugLineNum = 353;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
addtransferinfo.__c.runVoidMethod ("LogImpl","213107353",BA.ObjectToString(addtransferinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 355;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
addtransferinfo._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",addtransferinfo._ws);
 //BA.debugLineNum = 5;BA.debugLine="Private txtinvdate,cmbfromwarehouse,cmbtowarehous";
addtransferinfo._txtinvdate = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtinvdate",addtransferinfo._txtinvdate);
addtransferinfo._cmbfromwarehouse = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_cmbfromwarehouse",addtransferinfo._cmbfromwarehouse);
addtransferinfo._cmbtowarehouse = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_cmbtowarehouse",addtransferinfo._cmbtowarehouse);
addtransferinfo._txtinvnote = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtinvnote",addtransferinfo._txtinvnote);
addtransferinfo._cmbproduct = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_cmbproduct",addtransferinfo._cmbproduct);
addtransferinfo._txttax = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txttax",addtransferinfo._txttax);
addtransferinfo._txtunitprice = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtunitprice",addtransferinfo._txtunitprice);
addtransferinfo._txtqty = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtqty",addtransferinfo._txtqty);
addtransferinfo._txtdiscount = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtdiscount",addtransferinfo._txtdiscount);
addtransferinfo._btnaddproduct = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_btnaddproduct",addtransferinfo._btnaddproduct);
addtransferinfo._btnsave = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_btnsave",addtransferinfo._btnsave);
addtransferinfo._btncancel = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_btncancel",addtransferinfo._btncancel);
addtransferinfo._divproducts = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divproducts",addtransferinfo._divproducts);
 //BA.debugLineNum = 7;BA.debugLine="Private TempProductsTable As List";
addtransferinfo._tempproductstable = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_tempproductstable",addtransferinfo._tempproductstable);
 //BA.debugLineNum = 9;BA.debugLine="Private templistpaymenttype As List";
addtransferinfo._templistpaymenttype = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_templistpaymenttype",addtransferinfo._templistpaymenttype);
 //BA.debugLineNum = 10;BA.debugLine="Private lblusernamemain As JQueryElement";
addtransferinfo._lblusernamemain = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblusernamemain",addtransferinfo._lblusernamemain);
 //BA.debugLineNum = 11;BA.debugLine="Private divMenu As JQueryElement";
addtransferinfo._divmenu = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divmenu",addtransferinfo._divmenu);
 //BA.debugLineNum = 12;BA.debugLine="Private sql1 As SQL";
addtransferinfo._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",addtransferinfo._sql1);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cmbproduct_change(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("cmbproduct_Change (addtransferinfo) ","addtransferinfo",18,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("cmbproduct_change")) { return __ref.runUserSub(false, "addtransferinfo","cmbproduct_change", __ref, _params);}
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 116;BA.debugLine="Sub cmbproduct_Change (Params As Map)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 118;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(2097152);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 119;BA.debugLine="rs = sql1.ExecQuery(\"select ProductPrice from Pr";
Debug.ShouldStop(4194304);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select ProductPrice from ProductsInformation where ProductID="),__ref.getField(false,"_cmbproduct" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"))));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 120;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(8388608);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 121;BA.debugLine="txtunitprice.SetVal(rs.GetString(\"ProductPrice\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_txtunitprice" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductPrice"))))));
 }
;
 BA.debugLineNum = 123;BA.debugLine="rs.Close";
Debug.ShouldStop(67108864);
_rs.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e9.toString()); BA.debugLineNum = 126;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
addtransferinfo.__c.runVoidMethod ("LogImpl","212910602",BA.ObjectToString(addtransferinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delete_button_table_products(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Delete_button_table_Products (addtransferinfo) ","addtransferinfo",18,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("delete_button_table_products")) { return __ref.runUserSub(false, "addtransferinfo","delete_button_table_products", __ref, _params);}
RemoteObject _index = RemoteObject.createImmutable(0);
Debug.locals.put("params", _params);
 BA.debugLineNum = 188;BA.debugLine="Private Sub Delete_button_table_Products(params As";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 190;BA.debugLine="Dim index As Int = params.Get(\"val\")";
Debug.ShouldStop(536870912);
_index = BA.numberCast(int.class, _params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val")))));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 192;BA.debugLine="TempProductsTable.RemoveAt(index)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 193;BA.debugLine="Load_AddedProducts_Temp";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.addtransferinfo.class, "_load_addedproducts_temp" /*RemoteObject*/ );
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Initialize (addtransferinfo) ","addtransferinfo",18,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "addtransferinfo","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32768);
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_addedproducts_temp(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_AddedProducts_Temp (addtransferinfo) ","addtransferinfo",18,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("load_addedproducts_temp")) { return __ref.runUserSub(false, "addtransferinfo","load_addedproducts_temp", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _classtempprod = RemoteObject.declareNull("b4j.example.clstempproducts");
RemoteObject _taxperc = RemoteObject.createImmutable(0f);
RemoteObject _totalamount = RemoteObject.createImmutable(0f);
RemoteObject _temptotalamount = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 130;BA.debugLine="Sub Load_AddedProducts_Temp";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 133;BA.debugLine="Dim str As String";
Debug.ShouldStop(16);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 134;BA.debugLine="str = $\" <table id='datatable1' class='table di";
Debug.ShouldStop(32);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" <table id='datatable1' class='table display responsive nowrap'>\n"),RemoteObject.createImmutable("		                                    <thead class=\"thead-dark\">\n"),RemoteObject.createImmutable("		                                        <tr>\n"),RemoteObject.createImmutable("		                                              <th class=\"wd-15p\">ID</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">Product Name</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-20p\">Unit Price</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-10p\">Quantity</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">Total</th>\n"),RemoteObject.createImmutable("													  <th class=\"wd-25p\">Action</th>\n"),RemoteObject.createImmutable("		                                        </tr>\n"),RemoteObject.createImmutable("		                                    </thead>\n"),RemoteObject.createImmutable("		                                    <tbody> ")));Debug.locals.put("str", _str);
 BA.debugLineNum = 148;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
Debug.ShouldStop(524288);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 150;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
Debug.ShouldStop(2097152);
_classtempprod = RemoteObject.createNew ("b4j.example.clstempproducts");Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 151;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
Debug.ShouldStop(4194304);
_classtempprod = (__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 153;BA.debugLine="str = str & \"  <tr> \"";
Debug.ShouldStop(16777216);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <tr> "));Debug.locals.put("str", _str);
 BA.debugLineNum = 154;BA.debugLine="str = str & \"<td>\"& ClassTempProd.ProductID &\"<";
Debug.ShouldStop(33554432);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_classtempprod.getField(true,"_productid" /*RemoteObject*/ ),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 155;BA.debugLine="str = str & \"<td>\"& ClassTempProd.ProductName &";
Debug.ShouldStop(67108864);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_classtempprod.getField(true,"_productname" /*RemoteObject*/ ),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 156;BA.debugLine="str = str & \"<td>\"& ClassTempProd.UnitPrice &\"<";
Debug.ShouldStop(134217728);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_classtempprod.getField(true,"_unitprice" /*RemoteObject*/ ),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 157;BA.debugLine="str = str & \"<td>\"& ClassTempProd.Qty &\"</td>\"";
Debug.ShouldStop(268435456);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_classtempprod.getField(true,"_qty" /*RemoteObject*/ ),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 159;BA.debugLine="Dim taxPerc As Float = 0";
Debug.ShouldStop(1073741824);
_taxperc = BA.numberCast(float.class, 0);Debug.locals.put("taxPerc", _taxperc);Debug.locals.put("taxPerc", _taxperc);
 BA.debugLineNum = 160;BA.debugLine="taxPerc = ClassTempProd.TaxID";
Debug.ShouldStop(-2147483648);
_taxperc = BA.numberCast(float.class, _classtempprod.getField(true,"_taxid" /*RemoteObject*/ ));Debug.locals.put("taxPerc", _taxperc);
 BA.debugLineNum = 162;BA.debugLine="Dim TotalAmount As Float =  ((ClassTempProd.Uni";
Debug.ShouldStop(2);
_totalamount = BA.numberCast(float.class, (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_classtempprod.getField(true,"_unitprice" /*RemoteObject*/ ),_classtempprod.getField(true,"_qty" /*RemoteObject*/ )}, "*",0, 0)),_classtempprod.getField(true,"_discount" /*RemoteObject*/ )}, "-",1, 0)));Debug.locals.put("TotalAmount", _totalamount);Debug.locals.put("TotalAmount", _totalamount);
 BA.debugLineNum = 163;BA.debugLine="Dim TempTotalAmount As Float = 0";
Debug.ShouldStop(4);
_temptotalamount = BA.numberCast(float.class, 0);Debug.locals.put("TempTotalAmount", _temptotalamount);Debug.locals.put("TempTotalAmount", _temptotalamount);
 BA.debugLineNum = 164;BA.debugLine="If taxPerc > 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_taxperc,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 165;BA.debugLine="TempTotalAmount = TotalAmount";
Debug.ShouldStop(16);
_temptotalamount = _totalamount;Debug.locals.put("TempTotalAmount", _temptotalamount);
 BA.debugLineNum = 166;BA.debugLine="TempTotalAmount = TempTotalAmount * (taxPerc /";
Debug.ShouldStop(32);
_temptotalamount = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_temptotalamount,(RemoteObject.solve(new RemoteObject[] {_taxperc,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0));Debug.locals.put("TempTotalAmount", _temptotalamount);
 };
 BA.debugLineNum = 169;BA.debugLine="str = str & \"<td>\"& NumberFormat((TotalAmount +";
Debug.ShouldStop(256);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),addtransferinfo.__c.runMethod(true,"NumberFormat",(Object)((RemoteObject.solve(new RemoteObject[] {_totalamount,_temptotalamount}, "+",1, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 4))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 171;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
Debug.ShouldStop(1024);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"deleteproductTbl("),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "),RemoteObject.createImmutable(" </td> </tr>"));Debug.locals.put("str", _str);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 177;BA.debugLine="str= str & \" </tbody> </table>\"";
Debug.ShouldStop(65536);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" </tbody> </table>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 179;BA.debugLine="divproducts.SetHtml(str)";
Debug.ShouldStop(262144);
__ref.getField(false,"_divproducts" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_str));
 BA.debugLineNum = 181;BA.debugLine="Load_Datatable_Controls";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.addtransferinfo.class, "_load_datatable_controls" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e27) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e27.toString()); BA.debugLineNum = 184;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
addtransferinfo.__c.runVoidMethod ("LogImpl","212976182",BA.ObjectToString(addtransferinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Load_Data_ByID (addtransferinfo) ","addtransferinfo",18,__ref.getField(false, "ba"),__ref,362);
if (RapidSub.canDelegate("load_data_byid")) { return __ref.runUserSub(false, "addtransferinfo","load_data_byid", __ref);}
RemoteObject _invoiceid = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _strid = RemoteObject.createImmutable("");
RemoteObject _classtempprod = RemoteObject.declareNull("b4j.example.clstempproducts");
 BA.debugLineNum = 362;BA.debugLine="Sub Load_Data_ByID";
Debug.ShouldStop(512);
 BA.debugLineNum = 363;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 365;BA.debugLine="Dim InvoiceID As Int = 0";
Debug.ShouldStop(4096);
_invoiceid = BA.numberCast(int.class, 0);Debug.locals.put("InvoiceID", _invoiceid);Debug.locals.put("InvoiceID", _invoiceid);
 BA.debugLineNum = 366;BA.debugLine="If ws.Session.GetAttribute(\"InvoiceID\") = Null T";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("InvoiceID"))))) { 
 }else {
 BA.debugLineNum = 369;BA.debugLine="InvoiceID = ws.Session.GetAttribute(\"InvoiceID\"";
Debug.ShouldStop(65536);
_invoiceid = BA.numberCast(int.class, __ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("InvoiceID"))));Debug.locals.put("InvoiceID", _invoiceid);
 };
 BA.debugLineNum = 372;BA.debugLine="If InvoiceID > 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_invoiceid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 374;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(2097152);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 375;BA.debugLine="rs = sql1.ExecQuery(\"select * from TransferH wh";
Debug.ShouldStop(4194304);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TransferH where TransferHID="),_invoiceid)));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 376;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(8388608);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 378;BA.debugLine="txtinvdate.SetVal(rs.GetString(\"InvDT\"))";
Debug.ShouldStop(33554432);
__ref.getField(false,"_txtinvdate" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("InvDT"))))));
 BA.debugLineNum = 379;BA.debugLine="txtinvnote.SetVal(rs.GetString(\"StrNotes\"))";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txtinvnote" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("StrNotes"))))));
 BA.debugLineNum = 381;BA.debugLine="Dim strID As String = cmbfromwarehouse.id";
Debug.ShouldStop(268435456);
_strid = __ref.getField(false,"_cmbfromwarehouse" /*RemoteObject*/ ).runMethod(true,"getId");Debug.locals.put("strID", _strid);Debug.locals.put("strID", _strid);
 BA.debugLineNum = 382;BA.debugLine="strID = strID.Replace(\"#\",\"\")";
Debug.ShouldStop(536870912);
_strid = _strid.runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strID", _strid);
 BA.debugLineNum = 383;BA.debugLine="ws.RunFunction(\"setSelectedRow\", Array As Obje";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("RunFunction",(Object)(BA.ObjectToString("setSelectedRow")),(Object)(addtransferinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_strid),(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("FromWarehouseID"))))})))));
 BA.debugLineNum = 386;BA.debugLine="Dim strID As String = cmbtowarehouse.id";
Debug.ShouldStop(2);
_strid = __ref.getField(false,"_cmbtowarehouse" /*RemoteObject*/ ).runMethod(true,"getId");Debug.locals.put("strID", _strid);Debug.locals.put("strID", _strid);
 BA.debugLineNum = 387;BA.debugLine="strID = strID.Replace(\"#\",\"\")";
Debug.ShouldStop(4);
_strid = _strid.runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strID", _strid);
 BA.debugLineNum = 388;BA.debugLine="ws.RunFunction(\"setSelectedRow\", Array As Obje";
Debug.ShouldStop(8);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("RunFunction",(Object)(BA.ObjectToString("setSelectedRow")),(Object)(addtransferinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_strid),(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ToWarehouseID"))))})))));
 }
;
 BA.debugLineNum = 391;BA.debugLine="rs.Close";
Debug.ShouldStop(64);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 394;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(512);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 395;BA.debugLine="rs = sql1.ExecQuery(\"select * from TransferD wh";
Debug.ShouldStop(1024);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TransferD where TransferHID="),_invoiceid)));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 396;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(2048);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 398;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
Debug.ShouldStop(8192);
_classtempprod = RemoteObject.createNew ("b4j.example.clstempproducts");Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 399;BA.debugLine="ClassTempProd.Initialize";
Debug.ShouldStop(16384);
_classtempprod.runClassMethod (b4j.example.clstempproducts.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 400;BA.debugLine="ClassTempProd.SetValues(rs.GetInt(\"ProductID\")";
Debug.ShouldStop(32768);
_classtempprod.runClassMethod (b4j.example.clstempproducts.class, "_setvalues" /*RemoteObject*/ ,(Object)(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ProductID")))),(Object)(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("TaxPerc")))),(Object)(BA.numberCast(float.class, _rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductSellPrice"))))),(Object)(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ProductQty")))),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 402;BA.debugLine="TempProductsTable.Add(ClassTempProd)";
Debug.ShouldStop(131072);
__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_classtempprod)));
 BA.debugLineNum = 403;BA.debugLine="Load_AddedProducts_Temp";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.addtransferinfo.class, "_load_addedproducts_temp" /*RemoteObject*/ );
 }
;
 BA.debugLineNum = 406;BA.debugLine="rs.Close";
Debug.ShouldStop(2097152);
_rs.runVoidMethod ("Close");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e33) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e33.toString()); BA.debugLineNum = 412;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
addtransferinfo.__c.runVoidMethod ("LogImpl","213238322",BA.ObjectToString(addtransferinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 414;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_datatable_controls(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_Datatable_Controls (addtransferinfo) ","addtransferinfo",18,__ref.getField(false, "ba"),__ref,418);
if (RapidSub.canDelegate("load_datatable_controls")) { return __ref.runUserSub(false, "addtransferinfo","load_datatable_controls", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 418;BA.debugLine="Sub Load_Datatable_Controls";
Debug.ShouldStop(2);
 BA.debugLineNum = 419;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 421;BA.debugLine="Dim str As String";
Debug.ShouldStop(16);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 422;BA.debugLine="str = $\" $(function(){         'use strict';";
Debug.ShouldStop(32);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" $(function(){\n"),RemoteObject.createImmutable("        'use strict';\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("        $('#datatable1').DataTable({\n"),RemoteObject.createImmutable("  bLengthChange: false,\n"),RemoteObject.createImmutable("  searching: false,\n"),RemoteObject.createImmutable("  responsive: true\n"),RemoteObject.createImmutable("});\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("      });")));Debug.locals.put("str", _str);
 BA.debugLineNum = 433;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(65536);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addtransferinfo.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 436;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
addtransferinfo.__c.runVoidMethod ("LogImpl","213303826",BA.ObjectToString(addtransferinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 438;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_datatable_controls2(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_Datatable_Controls2 (addtransferinfo) ","addtransferinfo",18,__ref.getField(false, "ba"),__ref,440);
if (RapidSub.canDelegate("load_datatable_controls2")) { return __ref.runUserSub(false, "addtransferinfo","load_datatable_controls2", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 440;BA.debugLine="Sub Load_Datatable_Controls2";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 441;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 443;BA.debugLine="Dim str As String";
Debug.ShouldStop(67108864);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 444;BA.debugLine="str = $\" $(function(){         'use strict';";
Debug.ShouldStop(134217728);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" $(function(){\n"),RemoteObject.createImmutable("        'use strict';\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("        $('#datatable2').DataTable({\n"),RemoteObject.createImmutable("  bLengthChange: false,\n"),RemoteObject.createImmutable("  searching: false,\n"),RemoteObject.createImmutable("  responsive: true\n"),RemoteObject.createImmutable("});\n"),RemoteObject.createImmutable("      });")));Debug.locals.put("str", _str);
 BA.debugLineNum = 454;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(32);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addtransferinfo.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 457;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
addtransferinfo.__c.runVoidMethod ("LogImpl","213369361",BA.ObjectToString(addtransferinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 459;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Load_Products (addtransferinfo) ","addtransferinfo",18,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("load_products")) { return __ref.runUserSub(false, "addtransferinfo","load_products", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _val = RemoteObject.createImmutable("");
 BA.debugLineNum = 73;BA.debugLine="Sub Load_Products";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 76;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(2048);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 77;BA.debugLine="sb.Initialize";
Debug.ShouldStop(4096);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 78;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(8192);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 79;BA.debugLine="rs = sql1.ExecQuery(\"select * from ProductsInfor";
Debug.ShouldStop(16384);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from ProductsInformation")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 80;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(32768);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 81;BA.debugLine="Dim val As String = rs.GetInt(\"ProductID\")";
Debug.ShouldStop(65536);
_val = BA.NumberToString(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ProductID"))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 82;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
Debug.ShouldStop(131072);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<option value='"))).runMethod(false,"Append",(Object)(_val)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("'>"))).runMethod(false,"Append",(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductName"))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</option>")));
 }
;
 BA.debugLineNum = 84;BA.debugLine="rs.Close";
Debug.ShouldStop(524288);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 85;BA.debugLine="cmbproduct.SetHtml(sb.ToString)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_cmbproduct" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_sb.runMethod(true,"ToString")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e13.toString()); BA.debugLineNum = 88;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
addtransferinfo.__c.runVoidMethod ("LogImpl","212779535",BA.ObjectToString(addtransferinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_warehouses(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_Warehouses (addtransferinfo) ","addtransferinfo",18,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("load_warehouses")) { return __ref.runUserSub(false, "addtransferinfo","load_warehouses", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _val = RemoteObject.createImmutable("");
 BA.debugLineNum = 46;BA.debugLine="Sub Load_Warehouses";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 49;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(65536);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 50;BA.debugLine="sb.Initialize";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 51;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(262144);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 52;BA.debugLine="rs = sql1.ExecQuery(\"select * from WarehouseInfo";
Debug.ShouldStop(524288);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from WarehouseInfo")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 53;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(1048576);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 54;BA.debugLine="Dim val As String = rs.GetInt(\"WarehouseID\")";
Debug.ShouldStop(2097152);
_val = BA.NumberToString(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("WarehouseID"))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 55;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
Debug.ShouldStop(4194304);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<option value='"))).runMethod(false,"Append",(Object)(_val)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("'>"))).runMethod(false,"Append",(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("WarehouseDesc"))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</option>")));
 }
;
 BA.debugLineNum = 58;BA.debugLine="rs.Close";
Debug.ShouldStop(33554432);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 59;BA.debugLine="cmbfromwarehouse.SetHtml(sb.ToString)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_cmbfromwarehouse" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 60;BA.debugLine="cmbtowarehouse.SetHtml(sb.ToString)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_cmbtowarehouse" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_sb.runMethod(true,"ToString")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e14.toString()); BA.debugLineNum = 63;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
addtransferinfo.__c.runVoidMethod ("LogImpl","212714001",BA.ObjectToString(addtransferinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
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
public static RemoteObject  _websocket_connected(RemoteObject __ref,RemoteObject _websocket1) throws Exception{
try {
		Debug.PushSubsStack("WebSocket_Connected (addtransferinfo) ","addtransferinfo",18,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "addtransferinfo","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 20;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(1048576);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 22;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
Debug.ShouldStop(2097152);
addtransferinfo._main.runVoidMethod ("_validateusers" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblusernamemain" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_divmenu" /*RemoteObject*/ )));
 BA.debugLineNum = 24;BA.debugLine="TempProductsTable.Initialize";
Debug.ShouldStop(8388608);
__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 25;BA.debugLine="templistpaymenttype.Initialize";
Debug.ShouldStop(16777216);
__ref.getField(false,"_templistpaymenttype" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 26;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(33554432);
__ref.setField ("_sql1" /*RemoteObject*/ ,addtransferinfo._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 28;BA.debugLine="Load_Warehouses";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.addtransferinfo.class, "_load_warehouses" /*RemoteObject*/ );
 BA.debugLineNum = 30;BA.debugLine="Load_Products";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.addtransferinfo.class, "_load_products" /*RemoteObject*/ );
 BA.debugLineNum = 33;BA.debugLine="Load_Data_ByID";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.addtransferinfo.class, "_load_data_byid" /*RemoteObject*/ );
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("WebSocket_Disconnected (addtransferinfo) ","addtransferinfo",18,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "addtransferinfo","websocket_disconnected", __ref);}
 BA.debugLineNum = 38;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="If sql1.IsInitialized Then";
Debug.ShouldStop(64);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 40;BA.debugLine="sql1.Close";
Debug.ShouldStop(128);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 42;BA.debugLine="End Sub";
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