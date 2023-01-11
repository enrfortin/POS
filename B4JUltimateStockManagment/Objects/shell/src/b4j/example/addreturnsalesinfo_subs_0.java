package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class addreturnsalesinfo_subs_0 {


public static RemoteObject  _btnaddproduct_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btnaddproduct_Click (addreturnsalesinfo) ","addreturnsalesinfo",15,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("btnaddproduct_click")) { return __ref.runUserSub(false, "addreturnsalesinfo","btnaddproduct_click", __ref, _params);}
RemoteObject _classtempprod = RemoteObject.declareNull("b4j.example.clstempproducts");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 141;BA.debugLine="Sub btnaddproduct_Click (Params As Map)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 143;BA.debugLine="If cmbproduct.GetVal.Value = \"0\" Or txtunitprice";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cmbproduct" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable(("0"))) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtunitprice" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable((""))) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtqty" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable((""))) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtdiscount" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 144;BA.debugLine="Return";
Debug.ShouldStop(32768);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 147;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
Debug.ShouldStop(262144);
_classtempprod = RemoteObject.createNew ("b4j.example.clstempproducts");Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 148;BA.debugLine="ClassTempProd.Initialize";
Debug.ShouldStop(524288);
_classtempprod.runClassMethod (b4j.example.clstempproducts.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 149;BA.debugLine="ClassTempProd.SetValues(cmbproduct.GetVal.Value,";
Debug.ShouldStop(1048576);
_classtempprod.runClassMethod (b4j.example.clstempproducts.class, "_setvalues" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_cmbproduct" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txttax" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"))),(Object)(BA.numberCast(float.class, __ref.getField(false,"_txtunitprice" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtqty" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"))),(Object)(BA.numberCast(float.class, __ref.getField(false,"_txtdiscount" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"))));
 BA.debugLineNum = 151;BA.debugLine="TempProductsTable.Add(ClassTempProd)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_classtempprod)));
 BA.debugLineNum = 152;BA.debugLine="Load_AddedProducts_Temp";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.addreturnsalesinfo.class, "_load_addedproducts_temp" /*RemoteObject*/ );
 BA.debugLineNum = 154;BA.debugLine="txtunitprice.SetVal(\"0\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_txtunitprice" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 155;BA.debugLine="txtqty.SetVal(\"0\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txtqty" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 156;BA.debugLine="txtdiscount.SetVal(\"0\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txtdiscount" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable("0"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e14.toString()); BA.debugLineNum = 159;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
addreturnsalesinfo.__c.runVoidMethod ("LogImpl","210289170",BA.ObjectToString(addreturnsalesinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("btncancel_Click (addreturnsalesinfo) ","addreturnsalesinfo",15,__ref.getField(false, "ba"),__ref,402);
if (RapidSub.canDelegate("btncancel_click")) { return __ref.runUserSub(false, "addreturnsalesinfo","btncancel_click", __ref, _params);}
Debug.locals.put("Params", _params);
 BA.debugLineNum = 402;BA.debugLine="Sub btncancel_Click (Params As Map)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 403;BA.debugLine="ws.Eval(\"document.location.replace('SalesInforma";
Debug.ShouldStop(262144);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('SalesInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addreturnsalesinfo.__c.getField(false,"Null")));
 BA.debugLineNum = 404;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("btnsave_Click (addreturnsalesinfo) ","addreturnsalesinfo",15,__ref.getField(false, "ba"),__ref,247);
if (RapidSub.canDelegate("btnsave_click")) { return __ref.runUserSub(false, "addreturnsalesinfo","btnsave_click", __ref, _params);}
RemoteObject _lastsavedid = RemoteObject.createImmutable(0);
RemoteObject _invoiceid = RemoteObject.createImmutable(0);
RemoteObject _dblinvtotal = RemoteObject.createImmutable(0);
RemoteObject _dblinvtotaltax = RemoteObject.createImmutable(0);
RemoteObject _dblinvtotaldiscount = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _classtempprod = RemoteObject.declareNull("b4j.example.clstempproducts");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 247;BA.debugLine="Sub btnsave_Click (Params As Map)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 248;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 250;BA.debugLine="Dim LastSavedID As Int = 0";
Debug.ShouldStop(33554432);
_lastsavedid = BA.numberCast(int.class, 0);Debug.locals.put("LastSavedID", _lastsavedid);Debug.locals.put("LastSavedID", _lastsavedid);
 BA.debugLineNum = 253;BA.debugLine="If txtinvdate.GetVal.Value = \"\"  Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtinvdate" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 254;BA.debugLine="Return";
Debug.ShouldStop(536870912);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 257;BA.debugLine="Dim InvoiceID As Int = 0";
Debug.ShouldStop(1);
_invoiceid = BA.numberCast(int.class, 0);Debug.locals.put("InvoiceID", _invoiceid);Debug.locals.put("InvoiceID", _invoiceid);
 BA.debugLineNum = 258;BA.debugLine="If ws.Session.GetAttribute(\"InvoiceID\") = Null T";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("InvoiceID"))))) { 
 }else {
 BA.debugLineNum = 261;BA.debugLine="InvoiceID = ws.Session.GetAttribute(\"InvoiceID\"";
Debug.ShouldStop(16);
_invoiceid = BA.numberCast(int.class, __ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("InvoiceID"))));Debug.locals.put("InvoiceID", _invoiceid);
 BA.debugLineNum = 262;BA.debugLine="LastSavedID = InvoiceID";
Debug.ShouldStop(32);
_lastsavedid = _invoiceid;Debug.locals.put("LastSavedID", _lastsavedid);
 };
 BA.debugLineNum = 265;BA.debugLine="Dim dblinvtotal,dblinvtotaltax,dblinvtotaldisco";
Debug.ShouldStop(256);
_dblinvtotal = RemoteObject.createImmutable(0);Debug.locals.put("dblinvtotal", _dblinvtotal);
_dblinvtotaltax = RemoteObject.createImmutable(0);Debug.locals.put("dblinvtotaltax", _dblinvtotaltax);
_dblinvtotaldiscount = BA.numberCast(double.class, 0);Debug.locals.put("dblinvtotaldiscount", _dblinvtotaldiscount);Debug.locals.put("dblinvtotaldiscount", _dblinvtotaldiscount);
 BA.debugLineNum = 267;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
Debug.ShouldStop(1024);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 269;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
Debug.ShouldStop(4096);
_classtempprod = RemoteObject.createNew ("b4j.example.clstempproducts");Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 270;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
Debug.ShouldStop(8192);
_classtempprod = (__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 272;BA.debugLine="dblinvtotal = ClassTempProd.Qty * ClassTempPr";
Debug.ShouldStop(32768);
_dblinvtotal = RemoteObject.solve(new RemoteObject[] {_classtempprod.getField(true,"_qty" /*RemoteObject*/ ),_classtempprod.getField(true,"_unitprice" /*RemoteObject*/ )}, "*",0, 0);Debug.locals.put("dblinvtotal", _dblinvtotal);
 BA.debugLineNum = 273;BA.debugLine="dblinvtotaltax = dblinvtotal * (ClassTempProd";
Debug.ShouldStop(65536);
_dblinvtotaltax = RemoteObject.solve(new RemoteObject[] {_dblinvtotal,(RemoteObject.solve(new RemoteObject[] {_classtempprod.getField(true,"_taxid" /*RemoteObject*/ ),RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0);Debug.locals.put("dblinvtotaltax", _dblinvtotaltax);
 BA.debugLineNum = 274;BA.debugLine="dblinvtotaldiscount = ClassTempProd.Discount";
Debug.ShouldStop(131072);
_dblinvtotaldiscount = _classtempprod.getField(true,"_discount" /*RemoteObject*/ );Debug.locals.put("dblinvtotaldiscount", _dblinvtotaldiscount);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 277;BA.debugLine="dblinvtotal = dblinvtotal + dblinvtotaltax";
Debug.ShouldStop(1048576);
_dblinvtotal = RemoteObject.solve(new RemoteObject[] {_dblinvtotal,_dblinvtotaltax}, "+",1, 0);Debug.locals.put("dblinvtotal", _dblinvtotal);
 BA.debugLineNum = 278;BA.debugLine="dblinvtotal = dblinvtotal - dblinvtotaldiscoun";
Debug.ShouldStop(2097152);
_dblinvtotal = RemoteObject.solve(new RemoteObject[] {_dblinvtotal,_dblinvtotaldiscount}, "-",1, 0);Debug.locals.put("dblinvtotal", _dblinvtotal);
 BA.debugLineNum = 280;BA.debugLine="If InvoiceID > 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_invoiceid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 285;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 286;BA.debugLine="sql1.ExecNonQuery2($\"UPDATE SalesInvoiceH";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("UPDATE SalesInvoiceH\n"),RemoteObject.createImmutable("				   SET InvDT = ?\n"),RemoteObject.createImmutable("				      ,InvTotal = ?\n"),RemoteObject.createImmutable("				      ,UserID = ?\n"),RemoteObject.createImmutable("				      ,InvTotalTax = ?\n"),RemoteObject.createImmutable("				      ,InvTotalDiscount = ?\n"),RemoteObject.createImmutable("				      ,InvTotalShipping = ?\n"),RemoteObject.createImmutable("				      ,PaidAmount = ?\n"),RemoteObject.createImmutable("				      ,StrNotes] = ?\n"),RemoteObject.createImmutable("				      ,PaymenttypeID = ?\n"),RemoteObject.createImmutable("				      ,CustomerID = ?\n"),RemoteObject.createImmutable("				 WHERE SalesInvoiceHID=?")))),(Object)(addreturnsalesinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {11},new Object[] {__ref.getField(false,"_txtinvdate" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(_dblinvtotal),__ref.getField(false,"_cmbuser" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(_dblinvtotaltax),(_dblinvtotaldiscount),RemoteObject.createImmutable((0)),RemoteObject.createImmutable((0)),__ref.getField(false,"_txtinvnote" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_cmbpaymenttype" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_cmbcustomer" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(_invoiceid)})))));
 BA.debugLineNum = 299;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(1024);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 301;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(4096);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 302;BA.debugLine="sql1.ExecNonQuery2(\"delete from SalesInvoiceD";
Debug.ShouldStop(8192);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("delete from SalesInvoiceD where SalesInvoiceHID=?")),(Object)(addreturnsalesinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_invoiceid)})))));
 BA.debugLineNum = 303;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(16384);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 305;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
Debug.ShouldStop(65536);
{
final int step29 = 1;
final int limit29 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29) ;_i = ((int)(0 + _i + step29))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 307;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
Debug.ShouldStop(262144);
_classtempprod = RemoteObject.createNew ("b4j.example.clstempproducts");Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 308;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
Debug.ShouldStop(524288);
_classtempprod = (__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 310;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 311;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO SalesInvoice";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO SalesInvoiceD\n"),RemoteObject.createImmutable("			           (SalesInvoiceHID\n"),RemoteObject.createImmutable("			           ,ProductID\n"),RemoteObject.createImmutable("			           ,ProductSellPrice\n"),RemoteObject.createImmutable("			           ,ProductCostPrice\n"),RemoteObject.createImmutable("			           ,TaxPerc\n"),RemoteObject.createImmutable("			           ,ProductQty)\n"),RemoteObject.createImmutable("			     VALUES\n"),RemoteObject.createImmutable("			           (?\n"),RemoteObject.createImmutable("			           ,?\n"),RemoteObject.createImmutable("			           ,?\n"),RemoteObject.createImmutable("			           ,?\n"),RemoteObject.createImmutable("			           ,?\n"),RemoteObject.createImmutable("			           ,?)")))),(Object)(addreturnsalesinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_invoiceid),(_classtempprod.getField(true,"_productid" /*RemoteObject*/ )),(_classtempprod.getField(true,"_unitprice" /*RemoteObject*/ )),(_classtempprod.getField(true,"_productcostprice" /*RemoteObject*/ )),(_classtempprod.getField(true,"_taxid" /*RemoteObject*/ )),(_classtempprod.getField(true,"_qty" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 325;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(16);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 334;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(8192);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 335;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO SalesInvoice";
Debug.ShouldStop(16384);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO SalesInvoiceH\n"),RemoteObject.createImmutable("				           (InvDT\n"),RemoteObject.createImmutable("				           ,InvTotal\n"),RemoteObject.createImmutable("				           ,UserID\n"),RemoteObject.createImmutable("				           ,InvTotalTax\n"),RemoteObject.createImmutable("				           ,InvTotalDiscount\n"),RemoteObject.createImmutable("				           ,InvTotalShipping\n"),RemoteObject.createImmutable("				           ,PaidAmount\n"),RemoteObject.createImmutable("				           ,StrNotes\n"),RemoteObject.createImmutable("				           ,PaymenttypeID\n"),RemoteObject.createImmutable("				           ,CustomerID)\n"),RemoteObject.createImmutable("				     VALUES\n"),RemoteObject.createImmutable("				           (?\n"),RemoteObject.createImmutable("				           ,?\n"),RemoteObject.createImmutable("				           ,?\n"),RemoteObject.createImmutable("				           ,?\n"),RemoteObject.createImmutable("				           ,?\n"),RemoteObject.createImmutable("				           ,?\n"),RemoteObject.createImmutable("				           ,?\n"),RemoteObject.createImmutable("				           ,?\n"),RemoteObject.createImmutable("				           ,?\n"),RemoteObject.createImmutable("				           ,?)")))),(Object)(addreturnsalesinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {10},new Object[] {__ref.getField(false,"_txtinvdate" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(_dblinvtotal),__ref.getField(false,"_cmbuser" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(_dblinvtotaltax),(_dblinvtotaldiscount),RemoteObject.createImmutable((0)),RemoteObject.createImmutable((0)),__ref.getField(false,"_txtinvnote" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_cmbpaymenttype" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_cmbcustomer" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue")})))));
 BA.debugLineNum = 358;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(32);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 360;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(128);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 361;BA.debugLine="rs = sql1.ExecQuery(\"select SalesInvoiceHID f";
Debug.ShouldStop(256);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select SalesInvoiceHID from SalesInvoiceH order by SalesInvoiceHID desc limit 1")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 362;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(512);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 363;BA.debugLine="LastSavedID = rs.GetInt(\"SalesInvoiceHID\")";
Debug.ShouldStop(1024);
_lastsavedid = _rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("SalesInvoiceHID")));Debug.locals.put("LastSavedID", _lastsavedid);
 }
;
 BA.debugLineNum = 365;BA.debugLine="rs.Close";
Debug.ShouldStop(4096);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 367;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
Debug.ShouldStop(16384);
{
final int step46 = 1;
final int limit46 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step46 > 0 && _i <= limit46) || (step46 < 0 && _i >= limit46) ;_i = ((int)(0 + _i + step46))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 368;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
Debug.ShouldStop(32768);
_classtempprod = RemoteObject.createNew ("b4j.example.clstempproducts");Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 369;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
Debug.ShouldStop(65536);
_classtempprod = (__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 371;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(262144);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 372;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO SalesInvoi";
Debug.ShouldStop(524288);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO SalesInvoiceD\n"),RemoteObject.createImmutable("					           (SalesInvoiceHID\n"),RemoteObject.createImmutable("					           ,ProductID\n"),RemoteObject.createImmutable("					           ,ProductSellPrice\n"),RemoteObject.createImmutable("					           ,ProductCostPrice\n"),RemoteObject.createImmutable("					           ,TaxPerc\n"),RemoteObject.createImmutable("					           ,ProductQty)\n"),RemoteObject.createImmutable("					     VALUES\n"),RemoteObject.createImmutable("					           (?\n"),RemoteObject.createImmutable("					           ,?\n"),RemoteObject.createImmutable("					           ,?\n"),RemoteObject.createImmutable("					           ,?\n"),RemoteObject.createImmutable("					           ,?\n"),RemoteObject.createImmutable("					           ,?)")))),(Object)(addreturnsalesinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_lastsavedid),(_classtempprod.getField(true,"_productid" /*RemoteObject*/ )),(_classtempprod.getField(true,"_unitprice" /*RemoteObject*/ )),(_classtempprod.getField(true,"_productcostprice" /*RemoteObject*/ )),(_classtempprod.getField(true,"_taxid" /*RemoteObject*/ )),(_classtempprod.getField(true,"_qty" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 386;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(2);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 393;BA.debugLine="Main.Insert_UsersLogs(ws,\"Invoice Information\")";
Debug.ShouldStop(256);
addreturnsalesinfo._main.runVoidMethod ("_insert_userslogs" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("Invoice Information")));
 BA.debugLineNum = 396;BA.debugLine="ws.Eval(\"document.location.replace('SalesInforma";
Debug.ShouldStop(2048);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('SalesInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addreturnsalesinfo.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e57) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e57.toString()); BA.debugLineNum = 399;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
addreturnsalesinfo.__c.runVoidMethod ("LogImpl","210551448",BA.ObjectToString(addreturnsalesinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 401;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
addreturnsalesinfo._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",addreturnsalesinfo._ws);
 //BA.debugLineNum = 5;BA.debugLine="Private txtinvdate,cmbcustomer,cmbuser,txtinvnote";
addreturnsalesinfo._txtinvdate = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtinvdate",addreturnsalesinfo._txtinvdate);
addreturnsalesinfo._cmbcustomer = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_cmbcustomer",addreturnsalesinfo._cmbcustomer);
addreturnsalesinfo._cmbuser = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_cmbuser",addreturnsalesinfo._cmbuser);
addreturnsalesinfo._txtinvnote = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtinvnote",addreturnsalesinfo._txtinvnote);
addreturnsalesinfo._cmbproduct = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_cmbproduct",addreturnsalesinfo._cmbproduct);
addreturnsalesinfo._txttax = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txttax",addreturnsalesinfo._txttax);
addreturnsalesinfo._txtunitprice = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtunitprice",addreturnsalesinfo._txtunitprice);
addreturnsalesinfo._txtqty = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtqty",addreturnsalesinfo._txtqty);
addreturnsalesinfo._txtdiscount = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtdiscount",addreturnsalesinfo._txtdiscount);
addreturnsalesinfo._btnaddproduct = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_btnaddproduct",addreturnsalesinfo._btnaddproduct);
addreturnsalesinfo._btnsave = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_btnsave",addreturnsalesinfo._btnsave);
addreturnsalesinfo._btncancel = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_btncancel",addreturnsalesinfo._btncancel);
addreturnsalesinfo._divproducts = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divproducts",addreturnsalesinfo._divproducts);
addreturnsalesinfo._cmbpaymenttype = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_cmbpaymenttype",addreturnsalesinfo._cmbpaymenttype);
 //BA.debugLineNum = 7;BA.debugLine="Private TempProductsTable As List";
addreturnsalesinfo._tempproductstable = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_tempproductstable",addreturnsalesinfo._tempproductstable);
 //BA.debugLineNum = 9;BA.debugLine="Private templistcmbcustomer As List";
addreturnsalesinfo._templistcmbcustomer = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_templistcmbcustomer",addreturnsalesinfo._templistcmbcustomer);
 //BA.debugLineNum = 10;BA.debugLine="Private templistpaymenttype As List";
addreturnsalesinfo._templistpaymenttype = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_templistpaymenttype",addreturnsalesinfo._templistpaymenttype);
 //BA.debugLineNum = 11;BA.debugLine="Private lblusernamemain As JQueryElement";
addreturnsalesinfo._lblusernamemain = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblusernamemain",addreturnsalesinfo._lblusernamemain);
 //BA.debugLineNum = 12;BA.debugLine="Private divMenu As JQueryElement";
addreturnsalesinfo._divmenu = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divmenu",addreturnsalesinfo._divmenu);
 //BA.debugLineNum = 13;BA.debugLine="Private sql1 As SQL";
addreturnsalesinfo._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",addreturnsalesinfo._sql1);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cmbproduct_change(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("cmbproduct_Change (addreturnsalesinfo) ","addreturnsalesinfo",15,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("cmbproduct_change")) { return __ref.runUserSub(false, "addreturnsalesinfo","cmbproduct_change", __ref, _params);}
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 163;BA.debugLine="Sub cmbproduct_Change (Params As Map)";
Debug.ShouldStop(4);
 BA.debugLineNum = 164;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 165;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(16);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 166;BA.debugLine="rs = sql1.ExecQuery(\"select ProductPrice from Pr";
Debug.ShouldStop(32);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select ProductPrice from ProductsInformation where ProductID="),__ref.getField(false,"_cmbproduct" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"))));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 167;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(64);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 168;BA.debugLine="txtunitprice.SetVal(rs.GetString(\"ProductPrice\"";
Debug.ShouldStop(128);
__ref.getField(false,"_txtunitprice" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductPrice"))))));
 }
;
 BA.debugLineNum = 170;BA.debugLine="rs.Close";
Debug.ShouldStop(512);
_rs.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e9.toString()); BA.debugLineNum = 173;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
addreturnsalesinfo.__c.runVoidMethod ("LogImpl","210354698",BA.ObjectToString(addreturnsalesinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Delete_button_table_Products (addreturnsalesinfo) ","addreturnsalesinfo",15,__ref.getField(false, "ba"),__ref,235);
if (RapidSub.canDelegate("delete_button_table_products")) { return __ref.runUserSub(false, "addreturnsalesinfo","delete_button_table_products", __ref, _params);}
RemoteObject _index = RemoteObject.createImmutable(0);
Debug.locals.put("params", _params);
 BA.debugLineNum = 235;BA.debugLine="Private Sub Delete_button_table_Products(params As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 237;BA.debugLine="Dim index As Int = params.Get(\"val\")";
Debug.ShouldStop(4096);
_index = BA.numberCast(int.class, _params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val")))));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 239;BA.debugLine="TempProductsTable.RemoveAt(index)";
Debug.ShouldStop(16384);
__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 240;BA.debugLine="Load_AddedProducts_Temp";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.addreturnsalesinfo.class, "_load_addedproducts_temp" /*RemoteObject*/ );
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Initialize (addreturnsalesinfo) ","addreturnsalesinfo",15,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "addreturnsalesinfo","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(65536);
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Load_AddedProducts_Temp (addreturnsalesinfo) ","addreturnsalesinfo",15,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("load_addedproducts_temp")) { return __ref.runUserSub(false, "addreturnsalesinfo","load_addedproducts_temp", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _classtempprod = RemoteObject.declareNull("b4j.example.clstempproducts");
RemoteObject _taxperc = RemoteObject.createImmutable(0f);
RemoteObject _totalamount = RemoteObject.createImmutable(0f);
RemoteObject _temptotalamount = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 177;BA.debugLine="Sub Load_AddedProducts_Temp";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 180;BA.debugLine="Dim str As String";
Debug.ShouldStop(524288);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 181;BA.debugLine="str = $\" <table id='datatable1' class='table di";
Debug.ShouldStop(1048576);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" <table id='datatable1' class='table display responsive nowrap'>\n"),RemoteObject.createImmutable("		                                    <thead class=\"thead-dark\">\n"),RemoteObject.createImmutable("		                                        <tr>\n"),RemoteObject.createImmutable("		                                              <th class=\"wd-15p\">ID</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">Product Name</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-20p\">Unit Price</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-10p\">Quantity</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">Total</th>\n"),RemoteObject.createImmutable("													  <th class=\"wd-25p\">Action</th>\n"),RemoteObject.createImmutable("		                                        </tr>\n"),RemoteObject.createImmutable("		                                    </thead>\n"),RemoteObject.createImmutable("		                                    <tbody> ")));Debug.locals.put("str", _str);
 BA.debugLineNum = 195;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
Debug.ShouldStop(4);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 197;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
Debug.ShouldStop(16);
_classtempprod = RemoteObject.createNew ("b4j.example.clstempproducts");Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 198;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
Debug.ShouldStop(32);
_classtempprod = (__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 200;BA.debugLine="str = str & \"  <tr> \"";
Debug.ShouldStop(128);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <tr> "));Debug.locals.put("str", _str);
 BA.debugLineNum = 201;BA.debugLine="str = str & \"<td>\"& ClassTempProd.ProductID &\"<";
Debug.ShouldStop(256);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_classtempprod.getField(true,"_productid" /*RemoteObject*/ ),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 202;BA.debugLine="str = str & \"<td>\"& ClassTempProd.ProductName &";
Debug.ShouldStop(512);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_classtempprod.getField(true,"_productname" /*RemoteObject*/ ),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 203;BA.debugLine="str = str & \"<td>\"& ClassTempProd.UnitPrice &\"<";
Debug.ShouldStop(1024);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_classtempprod.getField(true,"_unitprice" /*RemoteObject*/ ),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 204;BA.debugLine="str = str & \"<td>\"& ClassTempProd.Qty &\"</td>\"";
Debug.ShouldStop(2048);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_classtempprod.getField(true,"_qty" /*RemoteObject*/ ),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 206;BA.debugLine="Dim taxPerc As Float = 0";
Debug.ShouldStop(8192);
_taxperc = BA.numberCast(float.class, 0);Debug.locals.put("taxPerc", _taxperc);Debug.locals.put("taxPerc", _taxperc);
 BA.debugLineNum = 207;BA.debugLine="taxPerc = ClassTempProd.TaxID";
Debug.ShouldStop(16384);
_taxperc = BA.numberCast(float.class, _classtempprod.getField(true,"_taxid" /*RemoteObject*/ ));Debug.locals.put("taxPerc", _taxperc);
 BA.debugLineNum = 209;BA.debugLine="Dim TotalAmount As Float =  ((ClassTempProd.Uni";
Debug.ShouldStop(65536);
_totalamount = BA.numberCast(float.class, (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_classtempprod.getField(true,"_unitprice" /*RemoteObject*/ ),_classtempprod.getField(true,"_qty" /*RemoteObject*/ )}, "*",0, 0)),_classtempprod.getField(true,"_discount" /*RemoteObject*/ )}, "-",1, 0)));Debug.locals.put("TotalAmount", _totalamount);Debug.locals.put("TotalAmount", _totalamount);
 BA.debugLineNum = 210;BA.debugLine="Dim TempTotalAmount As Float = 0";
Debug.ShouldStop(131072);
_temptotalamount = BA.numberCast(float.class, 0);Debug.locals.put("TempTotalAmount", _temptotalamount);Debug.locals.put("TempTotalAmount", _temptotalamount);
 BA.debugLineNum = 211;BA.debugLine="If taxPerc > 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_taxperc,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 212;BA.debugLine="TempTotalAmount = TotalAmount";
Debug.ShouldStop(524288);
_temptotalamount = _totalamount;Debug.locals.put("TempTotalAmount", _temptotalamount);
 BA.debugLineNum = 213;BA.debugLine="TempTotalAmount = TempTotalAmount * (taxPerc /";
Debug.ShouldStop(1048576);
_temptotalamount = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_temptotalamount,(RemoteObject.solve(new RemoteObject[] {_taxperc,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0));Debug.locals.put("TempTotalAmount", _temptotalamount);
 };
 BA.debugLineNum = 216;BA.debugLine="str = str & \"<td>\"& NumberFormat((TotalAmount +";
Debug.ShouldStop(8388608);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),addreturnsalesinfo.__c.runMethod(true,"NumberFormat",(Object)((RemoteObject.solve(new RemoteObject[] {_totalamount,_temptotalamount}, "+",1, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 4))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 218;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
Debug.ShouldStop(33554432);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"deleteproductTbl("),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "),RemoteObject.createImmutable(" </td> </tr>"));Debug.locals.put("str", _str);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 224;BA.debugLine="str= str & \" </tbody> </table>\"";
Debug.ShouldStop(-2147483648);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" </tbody> </table>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 226;BA.debugLine="divproducts.SetHtml(str)";
Debug.ShouldStop(2);
__ref.getField(false,"_divproducts" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_str));
 BA.debugLineNum = 228;BA.debugLine="Load_Datatable_Controls";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.addreturnsalesinfo.class, "_load_datatable_controls" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e27) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e27.toString()); BA.debugLineNum = 231;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
addreturnsalesinfo.__c.runVoidMethod ("LogImpl","210420278",BA.ObjectToString(addreturnsalesinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_customer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_Customer (addreturnsalesinfo) ","addreturnsalesinfo",15,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("load_customer")) { return __ref.runUserSub(false, "addreturnsalesinfo","load_customer", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _val = RemoteObject.createImmutable("");
 BA.debugLineNum = 50;BA.debugLine="Sub Load_Customer";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 53;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(1048576);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 54;BA.debugLine="sb.Initialize";
Debug.ShouldStop(2097152);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 55;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(4194304);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 56;BA.debugLine="rs = sql1.ExecQuery(\"select * from CustomersInfo";
Debug.ShouldStop(8388608);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from CustomersInformation")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 57;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(16777216);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 58;BA.debugLine="Dim val As String = rs.GetInt(\"CustomerID\")";
Debug.ShouldStop(33554432);
_val = BA.NumberToString(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("CustomerID"))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 59;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
Debug.ShouldStop(67108864);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<option value='"))).runMethod(false,"Append",(Object)(_val)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("'>"))).runMethod(false,"Append",(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CustomerName"))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</option>")));
 BA.debugLineNum = 61;BA.debugLine="templistcmbcustomer.Add(rs.GetInt(\"CustomerID\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_templistcmbcustomer" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("CustomerID"))))));
 }
;
 BA.debugLineNum = 64;BA.debugLine="rs.Close";
Debug.ShouldStop(-2147483648);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 65;BA.debugLine="cmbcustomer.SetHtml(sb.ToString)";
Debug.ShouldStop(1);
__ref.getField(false,"_cmbcustomer" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_sb.runMethod(true,"ToString")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e14.toString()); BA.debugLineNum = 68;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
addreturnsalesinfo.__c.runVoidMethod ("LogImpl","210027026",BA.ObjectToString(addreturnsalesinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
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
public static RemoteObject  _load_data_byid(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_Data_ByID (addreturnsalesinfo) ","addreturnsalesinfo",15,__ref.getField(false, "ba"),__ref,407);
if (RapidSub.canDelegate("load_data_byid")) { return __ref.runUserSub(false, "addreturnsalesinfo","load_data_byid", __ref);}
RemoteObject _invoiceid = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _strid = RemoteObject.createImmutable("");
RemoteObject _classtempprod = RemoteObject.declareNull("b4j.example.clstempproducts");
 BA.debugLineNum = 407;BA.debugLine="Sub Load_Data_ByID";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 408;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 410;BA.debugLine="Dim InvoiceID As Int = 0";
Debug.ShouldStop(33554432);
_invoiceid = BA.numberCast(int.class, 0);Debug.locals.put("InvoiceID", _invoiceid);Debug.locals.put("InvoiceID", _invoiceid);
 BA.debugLineNum = 411;BA.debugLine="If ws.Session.GetAttribute(\"InvoiceID\") = Null T";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("InvoiceID"))))) { 
 }else {
 BA.debugLineNum = 414;BA.debugLine="InvoiceID = ws.Session.GetAttribute(\"InvoiceID\"";
Debug.ShouldStop(536870912);
_invoiceid = BA.numberCast(int.class, __ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("InvoiceID"))));Debug.locals.put("InvoiceID", _invoiceid);
 };
 BA.debugLineNum = 417;BA.debugLine="If InvoiceID > 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_invoiceid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 419;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(4);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 420;BA.debugLine="rs = sql1.ExecQuery(\"select * from SalesInvoice";
Debug.ShouldStop(8);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from SalesInvoiceH where SalesInvoiceHID="),_invoiceid)));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 421;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(16);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 423;BA.debugLine="txtinvdate.SetVal(rs.GetString(\"InvDT\"))";
Debug.ShouldStop(64);
__ref.getField(false,"_txtinvdate" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("InvDT"))))));
 BA.debugLineNum = 424;BA.debugLine="txtinvnote.SetVal(rs.GetString(\"StrNotes\"))";
Debug.ShouldStop(128);
__ref.getField(false,"_txtinvnote" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("StrNotes"))))));
 BA.debugLineNum = 426;BA.debugLine="Dim strID As String = cmbcustomer.id";
Debug.ShouldStop(512);
_strid = __ref.getField(false,"_cmbcustomer" /*RemoteObject*/ ).runMethod(true,"getId");Debug.locals.put("strID", _strid);Debug.locals.put("strID", _strid);
 BA.debugLineNum = 427;BA.debugLine="strID = strID.Replace(\"#\",\"\")";
Debug.ShouldStop(1024);
_strid = _strid.runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strID", _strid);
 BA.debugLineNum = 428;BA.debugLine="ws.RunFunction(\"setSelectedRow\", Array As Obje";
Debug.ShouldStop(2048);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("RunFunction",(Object)(BA.ObjectToString("setSelectedRow")),(Object)(addreturnsalesinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_strid),(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("CustomerID"))))})))));
 BA.debugLineNum = 431;BA.debugLine="Dim strID As String = cmbpaymenttype.id";
Debug.ShouldStop(16384);
_strid = __ref.getField(false,"_cmbpaymenttype" /*RemoteObject*/ ).runMethod(true,"getId");Debug.locals.put("strID", _strid);Debug.locals.put("strID", _strid);
 BA.debugLineNum = 432;BA.debugLine="strID = strID.Replace(\"#\",\"\")";
Debug.ShouldStop(32768);
_strid = _strid.runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strID", _strid);
 BA.debugLineNum = 433;BA.debugLine="ws.RunFunction(\"setSelectedRow\", Array As Obje";
Debug.ShouldStop(65536);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("RunFunction",(Object)(BA.ObjectToString("setSelectedRow")),(Object)(addreturnsalesinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_strid),(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("PaymenttypeID"))))})))));
 BA.debugLineNum = 435;BA.debugLine="Dim strID As String = cmbuser.id";
Debug.ShouldStop(262144);
_strid = __ref.getField(false,"_cmbuser" /*RemoteObject*/ ).runMethod(true,"getId");Debug.locals.put("strID", _strid);Debug.locals.put("strID", _strid);
 BA.debugLineNum = 436;BA.debugLine="strID = strID.Replace(\"#\",\"\")";
Debug.ShouldStop(524288);
_strid = _strid.runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strID", _strid);
 BA.debugLineNum = 437;BA.debugLine="ws.RunFunction(\"setSelectedRow\", Array As Obje";
Debug.ShouldStop(1048576);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("RunFunction",(Object)(BA.ObjectToString("setSelectedRow")),(Object)(addreturnsalesinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_strid),(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("UserID"))))})))));
 }
;
 BA.debugLineNum = 441;BA.debugLine="rs.Close";
Debug.ShouldStop(16777216);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 444;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(134217728);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 445;BA.debugLine="rs = sql1.ExecQuery(\"select * from SalesInvoice";
Debug.ShouldStop(268435456);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from SalesInvoiceD where SalesInvoiceHID="),_invoiceid)));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 446;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(536870912);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 448;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
Debug.ShouldStop(-2147483648);
_classtempprod = RemoteObject.createNew ("b4j.example.clstempproducts");Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 449;BA.debugLine="ClassTempProd.Initialize";
Debug.ShouldStop(1);
_classtempprod.runClassMethod (b4j.example.clstempproducts.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 450;BA.debugLine="ClassTempProd.SetValues(rs.GetInt(\"ProductID\")";
Debug.ShouldStop(2);
_classtempprod.runClassMethod (b4j.example.clstempproducts.class, "_setvalues" /*RemoteObject*/ ,(Object)(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ProductID")))),(Object)(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("TaxPerc")))),(Object)(BA.numberCast(float.class, _rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductSellPrice"))))),(Object)(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ProductCostPrice")))),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 452;BA.debugLine="TempProductsTable.Add(ClassTempProd)";
Debug.ShouldStop(8);
__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_classtempprod)));
 BA.debugLineNum = 453;BA.debugLine="Load_AddedProducts_Temp";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.addreturnsalesinfo.class, "_load_addedproducts_temp" /*RemoteObject*/ );
 }
;
 BA.debugLineNum = 456;BA.debugLine="rs.Close";
Debug.ShouldStop(128);
_rs.runVoidMethod ("Close");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e36) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e36.toString()); BA.debugLineNum = 462;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
addreturnsalesinfo.__c.runVoidMethod ("LogImpl","210682423",BA.ObjectToString(addreturnsalesinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 464;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Load_Datatable_Controls (addreturnsalesinfo) ","addreturnsalesinfo",15,__ref.getField(false, "ba"),__ref,468);
if (RapidSub.canDelegate("load_datatable_controls")) { return __ref.runUserSub(false, "addreturnsalesinfo","load_datatable_controls", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 468;BA.debugLine="Sub Load_Datatable_Controls";
Debug.ShouldStop(524288);
 BA.debugLineNum = 469;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 471;BA.debugLine="Dim str As String";
Debug.ShouldStop(4194304);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 472;BA.debugLine="str = $\" $(function(){         'use strict';";
Debug.ShouldStop(8388608);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" $(function(){\n"),RemoteObject.createImmutable("        'use strict';\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("        $('#datatable1').DataTable({\n"),RemoteObject.createImmutable("  bLengthChange: false,\n"),RemoteObject.createImmutable("  searching: false,\n"),RemoteObject.createImmutable("  responsive: true\n"),RemoteObject.createImmutable("});\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("      });")));Debug.locals.put("str", _str);
 BA.debugLineNum = 483;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(4);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addreturnsalesinfo.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 486;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
addreturnsalesinfo.__c.runVoidMethod ("LogImpl","210747922",BA.ObjectToString(addreturnsalesinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 488;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Load_Datatable_Controls2 (addreturnsalesinfo) ","addreturnsalesinfo",15,__ref.getField(false, "ba"),__ref,490);
if (RapidSub.canDelegate("load_datatable_controls2")) { return __ref.runUserSub(false, "addreturnsalesinfo","load_datatable_controls2", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 490;BA.debugLine="Sub Load_Datatable_Controls2";
Debug.ShouldStop(512);
 BA.debugLineNum = 491;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 493;BA.debugLine="Dim str As String";
Debug.ShouldStop(4096);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 494;BA.debugLine="str = $\" $(function(){         'use strict';";
Debug.ShouldStop(8192);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" $(function(){\n"),RemoteObject.createImmutable("        'use strict';\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("        $('#datatable2').DataTable({\n"),RemoteObject.createImmutable("  bLengthChange: false,\n"),RemoteObject.createImmutable("  searching: false,\n"),RemoteObject.createImmutable("  responsive: true\n"),RemoteObject.createImmutable("});\n"),RemoteObject.createImmutable("      });")));Debug.locals.put("str", _str);
 BA.debugLineNum = 504;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addreturnsalesinfo.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 507;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
addreturnsalesinfo.__c.runVoidMethod ("LogImpl","210813457",BA.ObjectToString(addreturnsalesinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 509;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_paymenttypes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_PaymentTypes (addreturnsalesinfo) ","addreturnsalesinfo",15,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("load_paymenttypes")) { return __ref.runUserSub(false, "addreturnsalesinfo","load_paymenttypes", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _val = RemoteObject.createImmutable("");
 BA.debugLineNum = 73;BA.debugLine="Sub Load_PaymentTypes";
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
 BA.debugLineNum = 79;BA.debugLine="rs = sql1.ExecQuery(\"select * from PaymentTypesI";
Debug.ShouldStop(16384);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from PaymentTypesInfo")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 80;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(32768);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 81;BA.debugLine="Dim val As String = rs.GetInt(\"PaymenttypeID\")";
Debug.ShouldStop(65536);
_val = BA.NumberToString(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("PaymenttypeID"))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 82;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
Debug.ShouldStop(131072);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<option value='"))).runMethod(false,"Append",(Object)(_val)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("'>"))).runMethod(false,"Append",(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("PaymentDesc"))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</option>")));
 BA.debugLineNum = 84;BA.debugLine="templistpaymenttype.Add(rs.GetInt(\"PaymenttypeI";
Debug.ShouldStop(524288);
__ref.getField(false,"_templistpaymenttype" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("PaymenttypeID"))))));
 }
;
 BA.debugLineNum = 87;BA.debugLine="rs.Close";
Debug.ShouldStop(4194304);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 88;BA.debugLine="cmbpaymenttype.SetHtml(sb.ToString)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_cmbpaymenttype" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_sb.runMethod(true,"ToString")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e14.toString()); BA.debugLineNum = 91;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
addreturnsalesinfo.__c.runVoidMethod ("LogImpl","210092562",BA.ObjectToString(addreturnsalesinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Load_Products (addreturnsalesinfo) ","addreturnsalesinfo",15,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("load_products")) { return __ref.runUserSub(false, "addreturnsalesinfo","load_products", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _val = RemoteObject.createImmutable("");
 BA.debugLineNum = 120;BA.debugLine="Sub Load_Products";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 123;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(67108864);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 124;BA.debugLine="sb.Initialize";
Debug.ShouldStop(134217728);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 125;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(268435456);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 126;BA.debugLine="rs = sql1.ExecQuery(\"select * from ProductsInfor";
Debug.ShouldStop(536870912);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from ProductsInformation")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 127;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(1073741824);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 128;BA.debugLine="Dim val As String = rs.GetInt(\"ProductID\")";
Debug.ShouldStop(-2147483648);
_val = BA.NumberToString(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ProductID"))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 129;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
Debug.ShouldStop(1);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<option value='"))).runMethod(false,"Append",(Object)(_val)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("'>"))).runMethod(false,"Append",(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductName"))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</option>")));
 }
;
 BA.debugLineNum = 131;BA.debugLine="rs.Close";
Debug.ShouldStop(4);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 132;BA.debugLine="cmbproduct.SetHtml(sb.ToString)";
Debug.ShouldStop(8);
__ref.getField(false,"_cmbproduct" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_sb.runMethod(true,"ToString")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e13.toString()); BA.debugLineNum = 135;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
addreturnsalesinfo.__c.runVoidMethod ("LogImpl","210223631",BA.ObjectToString(addreturnsalesinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_usersinformation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_UsersInformation (addreturnsalesinfo) ","addreturnsalesinfo",15,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("load_usersinformation")) { return __ref.runUserSub(false, "addreturnsalesinfo","load_usersinformation", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _val = RemoteObject.createImmutable("");
 BA.debugLineNum = 96;BA.debugLine="Sub Load_UsersInformation";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 99;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(4);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 100;BA.debugLine="sb.Initialize";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 101;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(16);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 102;BA.debugLine="rs = sql1.ExecQuery(\"select * from UsersInformat";
Debug.ShouldStop(32);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from UsersInformation")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 103;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(64);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 104;BA.debugLine="Dim val As String = rs.GetInt(\"UserID\")";
Debug.ShouldStop(128);
_val = BA.NumberToString(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("UserID"))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 105;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
Debug.ShouldStop(256);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<option value='"))).runMethod(false,"Append",(Object)(_val)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("'>"))).runMethod(false,"Append",(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("UserFullName"))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</option>")));
 }
;
 BA.debugLineNum = 108;BA.debugLine="rs.Close";
Debug.ShouldStop(2048);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 109;BA.debugLine="cmbuser.SetHtml(sb.ToString)";
Debug.ShouldStop(4096);
__ref.getField(false,"_cmbuser" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_sb.runMethod(true,"ToString")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e13.toString()); BA.debugLineNum = 112;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
addreturnsalesinfo.__c.runVoidMethod ("LogImpl","210158096",BA.ObjectToString(addreturnsalesinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
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
public static RemoteObject  _websocket_connected(RemoteObject __ref,RemoteObject _websocket1) throws Exception{
try {
		Debug.PushSubsStack("WebSocket_Connected (addreturnsalesinfo) ","addreturnsalesinfo",15,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "addreturnsalesinfo","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 21;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(2097152);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 23;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
Debug.ShouldStop(4194304);
addreturnsalesinfo._main.runVoidMethod ("_validateusers" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblusernamemain" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_divmenu" /*RemoteObject*/ )));
 BA.debugLineNum = 25;BA.debugLine="TempProductsTable.Initialize";
Debug.ShouldStop(16777216);
__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 26;BA.debugLine="templistcmbcustomer.Initialize";
Debug.ShouldStop(33554432);
__ref.getField(false,"_templistcmbcustomer" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 27;BA.debugLine="templistpaymenttype.Initialize";
Debug.ShouldStop(67108864);
__ref.getField(false,"_templistpaymenttype" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 28;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(134217728);
__ref.setField ("_sql1" /*RemoteObject*/ ,addreturnsalesinfo._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 30;BA.debugLine="Load_Customer";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.addreturnsalesinfo.class, "_load_customer" /*RemoteObject*/ );
 BA.debugLineNum = 32;BA.debugLine="Load_Products";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.addreturnsalesinfo.class, "_load_products" /*RemoteObject*/ );
 BA.debugLineNum = 34;BA.debugLine="Load_PaymentTypes";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.addreturnsalesinfo.class, "_load_paymenttypes" /*RemoteObject*/ );
 BA.debugLineNum = 36;BA.debugLine="Load_UsersInformation";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.addreturnsalesinfo.class, "_load_usersinformation" /*RemoteObject*/ );
 BA.debugLineNum = 37;BA.debugLine="Load_Data_ByID";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.addreturnsalesinfo.class, "_load_data_byid" /*RemoteObject*/ );
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("WebSocket_Disconnected (addreturnsalesinfo) ","addreturnsalesinfo",15,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "addreturnsalesinfo","websocket_disconnected", __ref);}
 BA.debugLineNum = 42;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="If sql1.IsInitialized Then";
Debug.ShouldStop(1024);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 44;BA.debugLine="sql1.Close";
Debug.ShouldStop(2048);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}