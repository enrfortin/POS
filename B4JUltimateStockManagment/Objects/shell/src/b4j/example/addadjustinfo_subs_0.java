package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class addadjustinfo_subs_0 {


public static RemoteObject  _btnaddproduct_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btnaddproduct_Click (addadjustinfo) ","addadjustinfo",6,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("btnaddproduct_click")) { return __ref.runUserSub(false, "addadjustinfo","btnaddproduct_click", __ref, _params);}
RemoteObject _classtempprod = RemoteObject.declareNull("b4j.example.clstempproducts");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 91;BA.debugLine="Sub btnaddproduct_Click (Params As Map)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 93;BA.debugLine="If cmbproduct.GetVal.Value = \"0\" Or txtqty.GetVa";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cmbproduct" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable(("0"))) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtqty" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 94;BA.debugLine="Return";
Debug.ShouldStop(536870912);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 97;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
Debug.ShouldStop(1);
_classtempprod = RemoteObject.createNew ("b4j.example.clstempproducts");Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 98;BA.debugLine="ClassTempProd.Initialize";
Debug.ShouldStop(2);
_classtempprod.runClassMethod (b4j.example.clstempproducts.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 99;BA.debugLine="ClassTempProd.SetValues(cmbproduct.GetVal.Value,";
Debug.ShouldStop(4);
_classtempprod.runClassMethod (b4j.example.clstempproducts.class, "_setvalues" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_cmbproduct" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtqty" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"))),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 101;BA.debugLine="TempProductsTable.Add(ClassTempProd)";
Debug.ShouldStop(16);
__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_classtempprod)));
 BA.debugLineNum = 102;BA.debugLine="Load_AddedProducts_Temp";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.addadjustinfo.class, "_load_addedproducts_temp" /*RemoteObject*/ );
 BA.debugLineNum = 104;BA.debugLine="txtqty.SetVal(\"1\")";
Debug.ShouldStop(128);
__ref.getField(false,"_txtqty" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable("1"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 107;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
addadjustinfo.__c.runVoidMethod ("LogImpl","24456464",BA.ObjectToString(addadjustinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("btncancel_Click (addadjustinfo) ","addadjustinfo",6,__ref.getField(false, "ba"),__ref,287);
if (RapidSub.canDelegate("btncancel_click")) { return __ref.runUserSub(false, "addadjustinfo","btncancel_click", __ref, _params);}
Debug.locals.put("Params", _params);
 BA.debugLineNum = 287;BA.debugLine="Sub btncancel_Click (Params As Map)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 288;BA.debugLine="ws.Eval(\"document.location.replace('AdjustmentIn";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('AdjustmentInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addadjustinfo.__c.getField(false,"Null")));
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("btnsave_Click (addadjustinfo) ","addadjustinfo",6,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("btnsave_click")) { return __ref.runUserSub(false, "addadjustinfo","btnsave_click", __ref, _params);}
RemoteObject _lastsavedid = RemoteObject.createImmutable(0);
RemoteObject _invoiceid = RemoteObject.createImmutable(0);
RemoteObject _dblinvtotal = RemoteObject.createImmutable(0);
RemoteObject _dblinvtotaltax = RemoteObject.createImmutable(0);
RemoteObject _dblinvtotaldiscount = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _classtempprod = RemoteObject.declareNull("b4j.example.clstempproducts");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 167;BA.debugLine="Sub btnsave_Click (Params As Map)";
Debug.ShouldStop(64);
 BA.debugLineNum = 168;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 170;BA.debugLine="Dim LastSavedID As Int = 0";
Debug.ShouldStop(512);
_lastsavedid = BA.numberCast(int.class, 0);Debug.locals.put("LastSavedID", _lastsavedid);Debug.locals.put("LastSavedID", _lastsavedid);
 BA.debugLineNum = 173;BA.debugLine="If txtinvdate.GetVal.Value = \"\"  Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtinvdate" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 174;BA.debugLine="Return";
Debug.ShouldStop(8192);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 177;BA.debugLine="Dim InvoiceID As Int = 0";
Debug.ShouldStop(65536);
_invoiceid = BA.numberCast(int.class, 0);Debug.locals.put("InvoiceID", _invoiceid);Debug.locals.put("InvoiceID", _invoiceid);
 BA.debugLineNum = 178;BA.debugLine="If ws.Session.GetAttribute(\"InvoiceID\") = Null T";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("InvoiceID"))))) { 
 }else {
 BA.debugLineNum = 181;BA.debugLine="InvoiceID = ws.Session.GetAttribute(\"InvoiceID\"";
Debug.ShouldStop(1048576);
_invoiceid = BA.numberCast(int.class, __ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("InvoiceID"))));Debug.locals.put("InvoiceID", _invoiceid);
 BA.debugLineNum = 182;BA.debugLine="LastSavedID = InvoiceID";
Debug.ShouldStop(2097152);
_lastsavedid = _invoiceid;Debug.locals.put("LastSavedID", _lastsavedid);
 };
 BA.debugLineNum = 185;BA.debugLine="Dim dblinvtotal,dblinvtotaltax,dblinvtotaldisco";
Debug.ShouldStop(16777216);
_dblinvtotal = RemoteObject.createImmutable(0);Debug.locals.put("dblinvtotal", _dblinvtotal);
_dblinvtotaltax = RemoteObject.createImmutable(0);Debug.locals.put("dblinvtotaltax", _dblinvtotaltax);
_dblinvtotaldiscount = BA.numberCast(double.class, 0);Debug.locals.put("dblinvtotaldiscount", _dblinvtotaldiscount);Debug.locals.put("dblinvtotaldiscount", _dblinvtotaldiscount);
 BA.debugLineNum = 187;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
Debug.ShouldStop(67108864);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 189;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
Debug.ShouldStop(268435456);
_classtempprod = RemoteObject.createNew ("b4j.example.clstempproducts");Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 190;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
Debug.ShouldStop(536870912);
_classtempprod = (__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 192;BA.debugLine="dblinvtotal = ClassTempProd.Qty * ClassTempPr";
Debug.ShouldStop(-2147483648);
_dblinvtotal = RemoteObject.solve(new RemoteObject[] {_classtempprod.getField(true,"_qty" /*RemoteObject*/ ),_classtempprod.getField(true,"_unitprice" /*RemoteObject*/ )}, "*",0, 0);Debug.locals.put("dblinvtotal", _dblinvtotal);
 BA.debugLineNum = 193;BA.debugLine="dblinvtotaltax = dblinvtotal * (ClassTempProd";
Debug.ShouldStop(1);
_dblinvtotaltax = RemoteObject.solve(new RemoteObject[] {_dblinvtotal,(RemoteObject.solve(new RemoteObject[] {_classtempprod.getField(true,"_taxid" /*RemoteObject*/ ),RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0);Debug.locals.put("dblinvtotaltax", _dblinvtotaltax);
 BA.debugLineNum = 194;BA.debugLine="dblinvtotaldiscount = ClassTempProd.Discount";
Debug.ShouldStop(2);
_dblinvtotaldiscount = _classtempprod.getField(true,"_discount" /*RemoteObject*/ );Debug.locals.put("dblinvtotaldiscount", _dblinvtotaldiscount);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 197;BA.debugLine="dblinvtotal = dblinvtotal + dblinvtotaltax";
Debug.ShouldStop(16);
_dblinvtotal = RemoteObject.solve(new RemoteObject[] {_dblinvtotal,_dblinvtotaltax}, "+",1, 0);Debug.locals.put("dblinvtotal", _dblinvtotal);
 BA.debugLineNum = 198;BA.debugLine="dblinvtotal = dblinvtotal - dblinvtotaldiscoun";
Debug.ShouldStop(32);
_dblinvtotal = RemoteObject.solve(new RemoteObject[] {_dblinvtotal,_dblinvtotaldiscount}, "-",1, 0);Debug.locals.put("dblinvtotal", _dblinvtotal);
 BA.debugLineNum = 200;BA.debugLine="If InvoiceID > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_invoiceid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 205;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(4096);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 206;BA.debugLine="sql1.ExecNonQuery2($\"UPDATE InWarehouseH";
Debug.ShouldStop(8192);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("UPDATE InWarehouseH\n"),RemoteObject.createImmutable("				   SET WarehouseID = ?\n"),RemoteObject.createImmutable("				      ,InWarehouseDate = ?\n"),RemoteObject.createImmutable("				      ,InWarehouseNotes = ?\n"),RemoteObject.createImmutable("				 WHERE InWarehouseHID=?")))),(Object)(addadjustinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {__ref.getField(false,"_cmbwarehouse" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtinvdate" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtinvnote" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(_invoiceid)})))));
 BA.debugLineNum = 211;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(262144);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 213;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 214;BA.debugLine="sql1.ExecNonQuery2(\"delete from InWarehouseD w";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("delete from InWarehouseD where InWarehouseHID=?")),(Object)(addadjustinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_invoiceid)})))));
 BA.debugLineNum = 215;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 217;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
Debug.ShouldStop(16777216);
{
final int step29 = 1;
final int limit29 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29) ;_i = ((int)(0 + _i + step29))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 219;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
Debug.ShouldStop(67108864);
_classtempprod = RemoteObject.createNew ("b4j.example.clstempproducts");Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 220;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
Debug.ShouldStop(134217728);
_classtempprod = (__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 222;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 223;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO InWarehouseD";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO InWarehouseD\n"),RemoteObject.createImmutable("			           (InWarehouseHID\n"),RemoteObject.createImmutable("			           ,ProductID\n"),RemoteObject.createImmutable("			           ,InQty)\n"),RemoteObject.createImmutable("			     VALUES\n"),RemoteObject.createImmutable("			           (?\n"),RemoteObject.createImmutable("			           ,?\n"),RemoteObject.createImmutable("			           ,?)")))),(Object)(addadjustinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_invoiceid),(_classtempprod.getField(true,"_productid" /*RemoteObject*/ )),(_classtempprod.getField(true,"_qty" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 231;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(64);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 240;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(32768);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 241;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO InWarehouseH";
Debug.ShouldStop(65536);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO InWarehouseH\n"),RemoteObject.createImmutable("				           (WarehouseID\n"),RemoteObject.createImmutable("				           ,InWarehouseDate\n"),RemoteObject.createImmutable("				           ,InWarehouseNotes)\n"),RemoteObject.createImmutable("				     VALUES\n"),RemoteObject.createImmutable("				           (?\n"),RemoteObject.createImmutable("				           ,?\n"),RemoteObject.createImmutable("				           ,?)")))),(Object)(addadjustinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {__ref.getField(false,"_cmbwarehouse" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtinvdate" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtinvnote" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue")})))));
 BA.debugLineNum = 249;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 251;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(67108864);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 252;BA.debugLine="rs = sql1.ExecQuery(\"select InWarehouseHID fr";
Debug.ShouldStop(134217728);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select InWarehouseHID from InWarehouseH order by InWarehouseHID desc limit 1")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 253;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(268435456);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 254;BA.debugLine="LastSavedID = rs.GetInt(\"InWarehouseHID\")";
Debug.ShouldStop(536870912);
_lastsavedid = _rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("InWarehouseHID")));Debug.locals.put("LastSavedID", _lastsavedid);
 }
;
 BA.debugLineNum = 256;BA.debugLine="rs.Close";
Debug.ShouldStop(-2147483648);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 258;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
Debug.ShouldStop(2);
{
final int step46 = 1;
final int limit46 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step46 > 0 && _i <= limit46) || (step46 < 0 && _i >= limit46) ;_i = ((int)(0 + _i + step46))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 259;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
Debug.ShouldStop(4);
_classtempprod = RemoteObject.createNew ("b4j.example.clstempproducts");Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 260;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
Debug.ShouldStop(8);
_classtempprod = (__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 262;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(32);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 263;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO InWarehous";
Debug.ShouldStop(64);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO InWarehouseD\n"),RemoteObject.createImmutable("					           (InWarehouseHID\n"),RemoteObject.createImmutable("					           ,ProductID\n"),RemoteObject.createImmutable("					           ,InQty)\n"),RemoteObject.createImmutable("					     VALUES\n"),RemoteObject.createImmutable("					           (?\n"),RemoteObject.createImmutable("					           ,?\n"),RemoteObject.createImmutable("					           ,?)")))),(Object)(addadjustinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_lastsavedid),(_classtempprod.getField(true,"_productid" /*RemoteObject*/ )),(_classtempprod.getField(true,"_qty" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 271;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(16384);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 278;BA.debugLine="Main.Insert_UsersLogs(ws,\"Invoice Information\")";
Debug.ShouldStop(2097152);
addadjustinfo._main.runVoidMethod ("_insert_userslogs" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("Invoice Information")));
 BA.debugLineNum = 281;BA.debugLine="ws.Eval(\"document.location.replace('AdjustmentIn";
Debug.ShouldStop(16777216);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('AdjustmentInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addadjustinfo.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e57) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e57.toString()); BA.debugLineNum = 284;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
addadjustinfo.__c.runVoidMethod ("LogImpl","24653173",BA.ObjectToString(addadjustinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 286;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
addadjustinfo._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",addadjustinfo._ws);
 //BA.debugLineNum = 5;BA.debugLine="Private txtinvdate,cmbwarehouse,txtinvnote,cmbpro";
addadjustinfo._txtinvdate = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtinvdate",addadjustinfo._txtinvdate);
addadjustinfo._cmbwarehouse = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_cmbwarehouse",addadjustinfo._cmbwarehouse);
addadjustinfo._txtinvnote = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtinvnote",addadjustinfo._txtinvnote);
addadjustinfo._cmbproduct = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_cmbproduct",addadjustinfo._cmbproduct);
addadjustinfo._txtqty = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtqty",addadjustinfo._txtqty);
addadjustinfo._btnaddproduct = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_btnaddproduct",addadjustinfo._btnaddproduct);
addadjustinfo._btnsave = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_btnsave",addadjustinfo._btnsave);
addadjustinfo._btncancel = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_btncancel",addadjustinfo._btncancel);
addadjustinfo._divproducts = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divproducts",addadjustinfo._divproducts);
 //BA.debugLineNum = 7;BA.debugLine="Private TempProductsTable As List";
addadjustinfo._tempproductstable = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_tempproductstable",addadjustinfo._tempproductstable);
 //BA.debugLineNum = 9;BA.debugLine="Private templistcmbcustomer As List";
addadjustinfo._templistcmbcustomer = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_templistcmbcustomer",addadjustinfo._templistcmbcustomer);
 //BA.debugLineNum = 10;BA.debugLine="Private templistpaymenttype As List";
addadjustinfo._templistpaymenttype = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_templistpaymenttype",addadjustinfo._templistpaymenttype);
 //BA.debugLineNum = 11;BA.debugLine="Private lblusernamemain As JQueryElement";
addadjustinfo._lblusernamemain = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblusernamemain",addadjustinfo._lblusernamemain);
 //BA.debugLineNum = 12;BA.debugLine="Private divMenu As JQueryElement";
addadjustinfo._divmenu = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divmenu",addadjustinfo._divmenu);
 //BA.debugLineNum = 13;BA.debugLine="Private sql1 As SQL";
addadjustinfo._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",addadjustinfo._sql1);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _delete_button_table_products(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Delete_button_table_Products (addadjustinfo) ","addadjustinfo",6,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("delete_button_table_products")) { return __ref.runUserSub(false, "addadjustinfo","delete_button_table_products", __ref, _params);}
RemoteObject _index = RemoteObject.createImmutable(0);
Debug.locals.put("params", _params);
 BA.debugLineNum = 155;BA.debugLine="Private Sub Delete_button_table_Products(params As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 157;BA.debugLine="Dim index As Int = params.Get(\"val\")";
Debug.ShouldStop(268435456);
_index = BA.numberCast(int.class, _params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val")))));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 159;BA.debugLine="TempProductsTable.RemoveAt(index)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 160;BA.debugLine="Load_AddedProducts_Temp";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.addadjustinfo.class, "_load_addedproducts_temp" /*RemoteObject*/ );
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Initialize (addadjustinfo) ","addadjustinfo",6,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "addadjustinfo","initialize", __ref, _ba);}
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
		Debug.PushSubsStack("Load_AddedProducts_Temp (addadjustinfo) ","addadjustinfo",6,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("load_addedproducts_temp")) { return __ref.runUserSub(false, "addadjustinfo","load_addedproducts_temp", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _classtempprod = RemoteObject.declareNull("b4j.example.clstempproducts");
 BA.debugLineNum = 111;BA.debugLine="Sub Load_AddedProducts_Temp";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 114;BA.debugLine="Dim str As String";
Debug.ShouldStop(131072);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 115;BA.debugLine="str = $\" <table id='datatable1' class='table di";
Debug.ShouldStop(262144);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" <table id='datatable1' class='table display responsive nowrap'>\n"),RemoteObject.createImmutable("		                                    <thead class=\"thead-dark\">\n"),RemoteObject.createImmutable("		                                        <tr>\n"),RemoteObject.createImmutable("		                                              <th class=\"wd-15p\">ID</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">Product Name</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-10p\">Quantity</th>\n"),RemoteObject.createImmutable("													  <th class=\"wd-25p\">Action</th>\n"),RemoteObject.createImmutable("		                                        </tr>\n"),RemoteObject.createImmutable("		                                    </thead>\n"),RemoteObject.createImmutable("		                                    <tbody> ")));Debug.locals.put("str", _str);
 BA.debugLineNum = 127;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
Debug.ShouldStop(1073741824);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 129;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
Debug.ShouldStop(1);
_classtempprod = RemoteObject.createNew ("b4j.example.clstempproducts");Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 130;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
Debug.ShouldStop(2);
_classtempprod = (__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 132;BA.debugLine="str = str & \"  <tr> \"";
Debug.ShouldStop(8);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <tr> "));Debug.locals.put("str", _str);
 BA.debugLineNum = 133;BA.debugLine="str = str & \"<td>\"& ClassTempProd.ProductID &\"<";
Debug.ShouldStop(16);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_classtempprod.getField(true,"_productid" /*RemoteObject*/ ),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 134;BA.debugLine="str = str & \"<td>\"& ClassTempProd.ProductName &";
Debug.ShouldStop(32);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_classtempprod.getField(true,"_productname" /*RemoteObject*/ ),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 135;BA.debugLine="str = str & \"<td>\"& ClassTempProd.Qty &\"</td>\"";
Debug.ShouldStop(64);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_classtempprod.getField(true,"_qty" /*RemoteObject*/ ),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 138;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
Debug.ShouldStop(512);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"deleteproductTbl("),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "),RemoteObject.createImmutable(" </td> </tr>"));Debug.locals.put("str", _str);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 144;BA.debugLine="str= str & \" </tbody> </table>\"";
Debug.ShouldStop(32768);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" </tbody> </table>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 146;BA.debugLine="divproducts.SetHtml(str)";
Debug.ShouldStop(131072);
__ref.getField(false,"_divproducts" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_str));
 BA.debugLineNum = 148;BA.debugLine="Load_Datatable_Controls";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.addadjustinfo.class, "_load_datatable_controls" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e17.toString()); BA.debugLineNum = 151;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
addadjustinfo.__c.runVoidMethod ("LogImpl","24522024",BA.ObjectToString(addadjustinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Load_Data_ByID (addadjustinfo) ","addadjustinfo",6,__ref.getField(false, "ba"),__ref,293);
if (RapidSub.canDelegate("load_data_byid")) { return __ref.runUserSub(false, "addadjustinfo","load_data_byid", __ref);}
RemoteObject _invoiceid = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _strid = RemoteObject.createImmutable("");
RemoteObject _classtempprod = RemoteObject.declareNull("b4j.example.clstempproducts");
 BA.debugLineNum = 293;BA.debugLine="Sub Load_Data_ByID";
Debug.ShouldStop(16);
 BA.debugLineNum = 294;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 296;BA.debugLine="Dim InvoiceID As Int = 0";
Debug.ShouldStop(128);
_invoiceid = BA.numberCast(int.class, 0);Debug.locals.put("InvoiceID", _invoiceid);Debug.locals.put("InvoiceID", _invoiceid);
 BA.debugLineNum = 297;BA.debugLine="If ws.Session.GetAttribute(\"InvoiceID\") = Null T";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("InvoiceID"))))) { 
 }else {
 BA.debugLineNum = 300;BA.debugLine="InvoiceID = ws.Session.GetAttribute(\"InvoiceID\"";
Debug.ShouldStop(2048);
_invoiceid = BA.numberCast(int.class, __ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("InvoiceID"))));Debug.locals.put("InvoiceID", _invoiceid);
 };
 BA.debugLineNum = 303;BA.debugLine="If InvoiceID > 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_invoiceid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 305;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(65536);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 306;BA.debugLine="rs = sql1.ExecQuery(\"select * from InWarehouseH";
Debug.ShouldStop(131072);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from InWarehouseH where InWarehouseHID="),_invoiceid)));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 307;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(262144);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 309;BA.debugLine="txtinvdate.SetVal(rs.GetString(\"InWarehouseDat";
Debug.ShouldStop(1048576);
__ref.getField(false,"_txtinvdate" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("InWarehouseDate"))))));
 BA.debugLineNum = 310;BA.debugLine="txtinvnote.SetVal(rs.GetString(\"InWarehouseNot";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtinvnote" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("InWarehouseNotes"))))));
 BA.debugLineNum = 312;BA.debugLine="Dim strID As String = cmbwarehouse.id";
Debug.ShouldStop(8388608);
_strid = __ref.getField(false,"_cmbwarehouse" /*RemoteObject*/ ).runMethod(true,"getId");Debug.locals.put("strID", _strid);Debug.locals.put("strID", _strid);
 BA.debugLineNum = 313;BA.debugLine="strID = strID.Replace(\"#\",\"\")";
Debug.ShouldStop(16777216);
_strid = _strid.runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strID", _strid);
 BA.debugLineNum = 314;BA.debugLine="ws.RunFunction(\"setSelectedRow\", Array As Obje";
Debug.ShouldStop(33554432);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("RunFunction",(Object)(BA.ObjectToString("setSelectedRow")),(Object)(addadjustinfo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_strid),(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("WarehouseID"))))})))));
 }
;
 BA.debugLineNum = 317;BA.debugLine="rs.Close";
Debug.ShouldStop(268435456);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 320;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(-2147483648);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 321;BA.debugLine="rs = sql1.ExecQuery(\"select * from InWarehouseD";
Debug.ShouldStop(1);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from InWarehouseD where InWarehouseHID="),_invoiceid)));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 322;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(2);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 324;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
Debug.ShouldStop(8);
_classtempprod = RemoteObject.createNew ("b4j.example.clstempproducts");Debug.locals.put("ClassTempProd", _classtempprod);
 BA.debugLineNum = 325;BA.debugLine="ClassTempProd.Initialize";
Debug.ShouldStop(16);
_classtempprod.runClassMethod (b4j.example.clstempproducts.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 326;BA.debugLine="ClassTempProd.SetValues(rs.GetInt(\"ProductID\")";
Debug.ShouldStop(32);
_classtempprod.runClassMethod (b4j.example.clstempproducts.class, "_setvalues" /*RemoteObject*/ ,(Object)(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ProductID")))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("InQty")))),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 328;BA.debugLine="TempProductsTable.Add(ClassTempProd)";
Debug.ShouldStop(128);
__ref.getField(false,"_tempproductstable" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_classtempprod)));
 BA.debugLineNum = 329;BA.debugLine="Load_AddedProducts_Temp";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.addadjustinfo.class, "_load_addedproducts_temp" /*RemoteObject*/ );
 }
;
 BA.debugLineNum = 332;BA.debugLine="rs.Close";
Debug.ShouldStop(2048);
_rs.runVoidMethod ("Close");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e30) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e30.toString()); BA.debugLineNum = 338;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
addadjustinfo.__c.runVoidMethod ("LogImpl","24784173",BA.ObjectToString(addadjustinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 340;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Load_Datatable_Controls (addadjustinfo) ","addadjustinfo",6,__ref.getField(false, "ba"),__ref,344);
if (RapidSub.canDelegate("load_datatable_controls")) { return __ref.runUserSub(false, "addadjustinfo","load_datatable_controls", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 344;BA.debugLine="Sub Load_Datatable_Controls";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 345;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 347;BA.debugLine="Dim str As String";
Debug.ShouldStop(67108864);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 348;BA.debugLine="str = $\" $(function(){         'use strict';";
Debug.ShouldStop(134217728);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" $(function(){\n"),RemoteObject.createImmutable("        'use strict';\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("        $('#datatable1').DataTable({\n"),RemoteObject.createImmutable("  bLengthChange: false,\n"),RemoteObject.createImmutable("  searching: false,\n"),RemoteObject.createImmutable("  responsive: true\n"),RemoteObject.createImmutable("});\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("      });")));Debug.locals.put("str", _str);
 BA.debugLineNum = 359;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(64);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addadjustinfo.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 362;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
addadjustinfo.__c.runVoidMethod ("LogImpl","24849682",BA.ObjectToString(addadjustinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 364;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Load_Datatable_Controls2 (addadjustinfo) ","addadjustinfo",6,__ref.getField(false, "ba"),__ref,366);
if (RapidSub.canDelegate("load_datatable_controls2")) { return __ref.runUserSub(false, "addadjustinfo","load_datatable_controls2", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 366;BA.debugLine="Sub Load_Datatable_Controls2";
Debug.ShouldStop(8192);
 BA.debugLineNum = 367;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 369;BA.debugLine="Dim str As String";
Debug.ShouldStop(65536);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 370;BA.debugLine="str = $\" $(function(){         'use strict';";
Debug.ShouldStop(131072);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" $(function(){\n"),RemoteObject.createImmutable("        'use strict';\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("        $('#datatable2').DataTable({\n"),RemoteObject.createImmutable("  bLengthChange: false,\n"),RemoteObject.createImmutable("  searching: false,\n"),RemoteObject.createImmutable("  responsive: true\n"),RemoteObject.createImmutable("});\n"),RemoteObject.createImmutable("      });")));Debug.locals.put("str", _str);
 BA.debugLineNum = 380;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addadjustinfo.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 383;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
addadjustinfo.__c.runVoidMethod ("LogImpl","24915217",BA.ObjectToString(addadjustinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 385;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Load_Products (addadjustinfo) ","addadjustinfo",6,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("load_products")) { return __ref.runUserSub(false, "addadjustinfo","load_products", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _val = RemoteObject.createImmutable("");
 BA.debugLineNum = 70;BA.debugLine="Sub Load_Products";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 73;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(256);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 74;BA.debugLine="sb.Initialize";
Debug.ShouldStop(512);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 75;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(1024);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 76;BA.debugLine="rs = sql1.ExecQuery(\"select * from ProductsInfor";
Debug.ShouldStop(2048);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from ProductsInformation")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 77;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(4096);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 78;BA.debugLine="Dim val As String = rs.GetInt(\"ProductID\")";
Debug.ShouldStop(8192);
_val = BA.NumberToString(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ProductID"))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 79;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
Debug.ShouldStop(16384);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<option value='"))).runMethod(false,"Append",(Object)(_val)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("'>"))).runMethod(false,"Append",(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductName"))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</option>")));
 }
;
 BA.debugLineNum = 81;BA.debugLine="rs.Close";
Debug.ShouldStop(65536);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 82;BA.debugLine="cmbproduct.SetHtml(sb.ToString)";
Debug.ShouldStop(131072);
__ref.getField(false,"_cmbproduct" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_sb.runMethod(true,"ToString")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e13.toString()); BA.debugLineNum = 85;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
addadjustinfo.__c.runVoidMethod ("LogImpl","24390927",BA.ObjectToString(addadjustinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
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
public static RemoteObject  _load_warehouseinformation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_WarehouseInformation (addadjustinfo) ","addadjustinfo",6,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("load_warehouseinformation")) { return __ref.runUserSub(false, "addadjustinfo","load_warehouseinformation", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _val = RemoteObject.createImmutable("");
 BA.debugLineNum = 46;BA.debugLine="Sub Load_WarehouseInformation";
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
 BA.debugLineNum = 59;BA.debugLine="cmbwarehouse.SetHtml(sb.ToString)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_cmbwarehouse" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_sb.runMethod(true,"ToString")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e13.toString()); BA.debugLineNum = 62;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
addadjustinfo.__c.runVoidMethod ("LogImpl","24325392",BA.ObjectToString(addadjustinfo.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
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
public static RemoteObject  _websocket_connected(RemoteObject __ref,RemoteObject _websocket1) throws Exception{
try {
		Debug.PushSubsStack("WebSocket_Connected (addadjustinfo) ","addadjustinfo",6,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "addadjustinfo","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 21;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(2097152);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 23;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
Debug.ShouldStop(4194304);
addadjustinfo._main.runVoidMethod ("_validateusers" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblusernamemain" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_divmenu" /*RemoteObject*/ )));
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
__ref.setField ("_sql1" /*RemoteObject*/ ,addadjustinfo._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 30;BA.debugLine="Load_Products";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.addadjustinfo.class, "_load_products" /*RemoteObject*/ );
 BA.debugLineNum = 32;BA.debugLine="Load_WarehouseInformation";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.addadjustinfo.class, "_load_warehouseinformation" /*RemoteObject*/ );
 BA.debugLineNum = 33;BA.debugLine="Load_Data_ByID";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.addadjustinfo.class, "_load_data_byid" /*RemoteObject*/ );
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("WebSocket_Disconnected (addadjustinfo) ","addadjustinfo",6,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "addadjustinfo","websocket_disconnected", __ref);}
 BA.debugLineNum = 37;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="If sql1.IsInitialized Then";
Debug.ShouldStop(32);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 39;BA.debugLine="sql1.Close";
Debug.ShouldStop(64);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}