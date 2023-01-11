package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pagepos_subs_2 {


public static RemoteObject  _add_invoice(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Add_Invoice (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,641);
if (RapidSub.canDelegate("add_invoice")) { return __ref.runUserSub(false, "pagepos","add_invoice", __ref, _params);}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _lastinsertedid = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _cls = RemoteObject.declareNull("b4j.example.clstblsoldproducts");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 641;BA.debugLine="Private Sub Add_Invoice (Params As Map)";
Debug.ShouldStop(1);
 BA.debugLineNum = 642;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 644;BA.debugLine="If GlobaldblGrandTotal = 0 Or GlobaldblGrandTota";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_globaldblgrandtotal" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("<",__ref.getField(true,"_globaldblgrandtotal" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 645;BA.debugLine="Return";
Debug.ShouldStop(16);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 648;BA.debugLine="Dim str As String";
Debug.ShouldStop(128);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 649;BA.debugLine="str = $\"INSERT INTO SalesInvoiceH            (In";
Debug.ShouldStop(256);
_str = (RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO SalesInvoiceH\n"),RemoteObject.createImmutable("           (InvTotal\n"),RemoteObject.createImmutable("           ,UserID\n"),RemoteObject.createImmutable("           ,InvTotalTax\n"),RemoteObject.createImmutable("           ,InvTotalDiscount\n"),RemoteObject.createImmutable("           ,InvTotalShipping,PaidAmount,StrNotes,PaymenttypeID,CustomerID)\n"),RemoteObject.createImmutable("     VALUES\n"),RemoteObject.createImmutable("           (?\n"),RemoteObject.createImmutable("           ,?\n"),RemoteObject.createImmutable("           ,?\n"),RemoteObject.createImmutable("           ,?\n"),RemoteObject.createImmutable("           ,?,?,?,?,?)")));Debug.locals.put("str", _str);
 BA.debugLineNum = 662;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 663;BA.debugLine="sql1.ExecNonQuery2(str,Array As Object(Globaldbl";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(_str),(Object)(pagepos.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {9},new Object[] {(__ref.getField(true,"_globaldblgrandtotal" /*RemoteObject*/ )),RemoteObject.createImmutable((1)),(__ref.getField(true,"_globaldbltotaltax" /*RemoteObject*/ )),(__ref.getField(true,"_globaldbltotaldiscount" /*RemoteObject*/ )),(__ref.getField(true,"_dblshipping" /*RemoteObject*/ )),__ref.getField(false,"_txtcopaidamount" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtconotes" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_cmbcopaymenttype" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_cmbcustomer" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue")})))));
 BA.debugLineNum = 664;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(8388608);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 666;BA.debugLine="Dim LastInsertedID As Int";
Debug.ShouldStop(33554432);
_lastinsertedid = RemoteObject.createImmutable(0);Debug.locals.put("LastInsertedID", _lastinsertedid);
 BA.debugLineNum = 667;BA.debugLine="LastInsertedID = sql1.ExecQuerySingleResult(\"sel";
Debug.ShouldStop(67108864);
_lastinsertedid = BA.numberCast(int.class, __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("select * from SalesInvoiceH order by SalesInvoiceHID desc limit 1"))));Debug.locals.put("LastInsertedID", _lastinsertedid);
 BA.debugLineNum = 670;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
Debug.ShouldStop(536870912);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 671;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProduct";
Debug.ShouldStop(1073741824);
_cls = (__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("cls", _cls);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 673;BA.debugLine="Dim str As String";
Debug.ShouldStop(1);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 674;BA.debugLine="str = $\"INSERT INTO SalesInvoiceD";
Debug.ShouldStop(2);
_str = (RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO SalesInvoiceD\n"),RemoteObject.createImmutable("			           (SalesInvoiceHID\n"),RemoteObject.createImmutable("			           ,ProductID\n"),RemoteObject.createImmutable("			           ,ProductSellPrice\n"),RemoteObject.createImmutable("			           ,ProductCostPrice\n"),RemoteObject.createImmutable("			           ,TaxPerc\n"),RemoteObject.createImmutable("			           ,ProductQty)\n"),RemoteObject.createImmutable("			     VALUES\n"),RemoteObject.createImmutable("			           (?\n"),RemoteObject.createImmutable("			           ,?\n"),RemoteObject.createImmutable("			           ,?\n"),RemoteObject.createImmutable("			           ,?\n"),RemoteObject.createImmutable("			           ,?\n"),RemoteObject.createImmutable("			           ,?)")));Debug.locals.put("str", _str);
 BA.debugLineNum = 689;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(65536);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 690;BA.debugLine="sql1.ExecNonQuery2(str,Array As Object(LastIns";
Debug.ShouldStop(131072);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(_str),(Object)(pagepos.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_lastinsertedid),(_cls.getField(true,"_pid" /*RemoteObject*/ )),(_cls.getField(true,"_psellprice" /*RemoteObject*/ )),(_cls.getField(true,"_pcostprice" /*RemoteObject*/ )),(_cls.getField(true,"_ptax" /*RemoteObject*/ )),(_cls.getField(true,"_pqty" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 691;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(262144);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 695;BA.debugLine="Create_invoice_ToPrint";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.pagepos.class, "_create_invoice_toprint" /*RemoteObject*/ );
 BA.debugLineNum = 699;BA.debugLine="Reset_Tbl";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.pagepos.class, "_reset_tbl" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e23) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e23.toString()); BA.debugLineNum = 702;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
pagepos.__c.runVoidMethod ("LogImpl","21638461",BA.ObjectToString(pagepos.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 704;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _add_newcustomer(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Add_NewCustomer (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,563);
if (RapidSub.canDelegate("add_newcustomer")) { return __ref.runUserSub(false, "pagepos","add_newcustomer", __ref, _params);}
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 563;BA.debugLine="Private Sub Add_NewCustomer (Params As Map)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 564;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 565;BA.debugLine="Dim str As String";
Debug.ShouldStop(1048576);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 566;BA.debugLine="str = $\"INSERT INTO CustomersInformation";
Debug.ShouldStop(2097152);
_str = (RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO CustomersInformation\n"),RemoteObject.createImmutable("           (CustomerName\n"),RemoteObject.createImmutable("           ,CustEmail\n"),RemoteObject.createImmutable("           ,CustPhone\n"),RemoteObject.createImmutable("           ,CustCountry\n"),RemoteObject.createImmutable("           ,CustCity\n"),RemoteObject.createImmutable("           ,CustAddress\n"),RemoteObject.createImmutable("		   ,RTN)\n"),RemoteObject.createImmutable("     VALUES\n"),RemoteObject.createImmutable("           (?\n"),RemoteObject.createImmutable("           ,?\n"),RemoteObject.createImmutable("           ,?\n"),RemoteObject.createImmutable("           ,?\n"),RemoteObject.createImmutable("           ,?\n"),RemoteObject.createImmutable("           ,?\n"),RemoteObject.createImmutable("		   ,?)")));Debug.locals.put("str", _str);
 BA.debugLineNum = 583;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(64);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 584;BA.debugLine="sql1.ExecNonQuery2(str,Array As Object(txtcustna";
Debug.ShouldStop(128);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(_str),(Object)(pagepos.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {__ref.getField(false,"_txtcustname" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtcustemail" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtcustphone" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtcustcountry" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtcustcity" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtcustaddress" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtcustrtn" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue")})))));
 BA.debugLineNum = 585;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(256);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 587;BA.debugLine="Load_Customers";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.pagepos.class, "_load_customers" /*RemoteObject*/ );
 BA.debugLineNum = 589;BA.debugLine="txtcustname.SetVal(\"\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_txtcustname" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 590;BA.debugLine="txtcustemail.SetVal(\"\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_txtcustemail" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 591;BA.debugLine="txtcustphone.SetVal(\"\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_txtcustphone" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 592;BA.debugLine="txtcustcountry.SetVal(\"\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_txtcustcountry" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 593;BA.debugLine="txtcustcity.SetVal(\"\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtcustcity" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 594;BA.debugLine="txtcustaddress.SetVal(\"\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_txtcustaddress" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 595;BA.debugLine="txtcustrtn.SetVal(\"\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_txtcustrtn" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable(""))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e16.toString()); BA.debugLineNum = 598;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
pagepos.__c.runVoidMethod ("LogImpl","21441827",BA.ObjectToString(pagepos.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 600;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _add_qty_tblproducts(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Add_Qty_tblProducts (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,228);
if (RapidSub.canDelegate("add_qty_tblproducts")) { return __ref.runUserSub(false, "pagepos","add_qty_tblproducts", __ref, _params);}
int _i = 0;
RemoteObject _cls = RemoteObject.declareNull("b4j.example.clstblsoldproducts");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 228;BA.debugLine="Private Sub Add_Qty_tblProducts (Params As Map)";
Debug.ShouldStop(8);
 BA.debugLineNum = 229;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 230;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
Debug.ShouldStop(32);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 231;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProducts";
Debug.ShouldStop(64);
_cls = (__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("cls", _cls);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 232;BA.debugLine="If cls.PID = Params.Get(\"val\") Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_cls.getField(true,"_pid" /*RemoteObject*/ ),BA.numberCast(double.class, _params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))))) { 
 BA.debugLineNum = 233;BA.debugLine="cls.PQty = cls.PQty + 1";
Debug.ShouldStop(256);
_cls.setField ("_pqty" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_pqty" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 234;BA.debugLine="cls.PSubTotal = cls.PSellPrice * cls.PQty";
Debug.ShouldStop(512);
_cls.setField ("_psubtotal" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_psellprice" /*RemoteObject*/ ),_cls.getField(true,"_pqty" /*RemoteObject*/ )}, "*",0, 0));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 239;BA.debugLine="Load_tblSoldProducts";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.pagepos.class, "_load_tblsoldproducts" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 243;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
pagepos.__c.runVoidMethod ("LogImpl","2786447",BA.ObjectToString(pagepos.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclosemodal3_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btnclosemodal3_Click (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,814);
if (RapidSub.canDelegate("btnclosemodal3_click")) { return __ref.runUserSub(false, "pagepos","btnclosemodal3_click", __ref, _params);}
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 814;BA.debugLine="Sub btnclosemodal3_Click (Params As Map)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 815;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 817;BA.debugLine="Dim str As String";
Debug.ShouldStop(65536);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 818;BA.debugLine="str = $\" 		 		var modal9 = document.getElementBy";
Debug.ShouldStop(131072);
_str = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		var modal9 = document.getElementById(\"myModal3\");\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		 modal9.style.display = \"none\";")));Debug.locals.put("str", _str);
 BA.debugLineNum = 824;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), pagepos.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 827;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
pagepos.__c.runVoidMethod ("LogImpl","21769485",BA.ObjectToString(pagepos.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 829;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnresettbl_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btnresettbl_Click (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,268);
if (RapidSub.canDelegate("btnresettbl_click")) { return __ref.runUserSub(false, "pagepos","btnresettbl_click", __ref, _params);}
Debug.locals.put("Params", _params);
 BA.debugLineNum = 268;BA.debugLine="Sub btnresettbl_Click (Params As Map)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 269;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 270;BA.debugLine="lstSoldProducts.Clear";
Debug.ShouldStop(8192);
__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 271;BA.debugLine="Reset_Tbl";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.pagepos.class, "_reset_tbl" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 273;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
pagepos.__c.runVoidMethod ("LogImpl","2917509",BA.ObjectToString(pagepos.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
pagepos._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",pagepos._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private sql1 As SQL";
pagepos._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",pagepos._sql1);
 //BA.debugLineNum = 5;BA.debugLine="Private cmbcategory,divproducts As JQueryElement";
pagepos._cmbcategory = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_cmbcategory",pagepos._cmbcategory);
pagepos._divproducts = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divproducts",pagepos._divproducts);
 //BA.debugLineNum = 6;BA.debugLine="Private tblsoldproducts,lblgrandtotal,txttax,txts";
pagepos._tblsoldproducts = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_tblsoldproducts",pagepos._tblsoldproducts);
pagepos._lblgrandtotal = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblgrandtotal",pagepos._lblgrandtotal);
pagepos._txttax = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txttax",pagepos._txttax);
pagepos._txtsearchproducts = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtsearchproducts",pagepos._txtsearchproducts);
pagepos._txtdiscount = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtdiscount",pagepos._txtdiscount);
 //BA.debugLineNum = 7;BA.debugLine="Private lstSoldProducts As List";
pagepos._lstsoldproducts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstsoldproducts",pagepos._lstsoldproducts);
 //BA.debugLineNum = 8;BA.debugLine="Private dbldiscount,dblshipping As Double";
pagepos._dbldiscount = RemoteObject.createImmutable(0);__ref.setField("_dbldiscount",pagepos._dbldiscount);
pagepos._dblshipping = RemoteObject.createImmutable(0);__ref.setField("_dblshipping",pagepos._dblshipping);
 //BA.debugLineNum = 9;BA.debugLine="Private cmbcustomer As JQueryElement";
pagepos._cmbcustomer = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_cmbcustomer",pagepos._cmbcustomer);
 //BA.debugLineNum = 10;BA.debugLine="Private cmbcopaymenttype As JQueryElement";
pagepos._cmbcopaymenttype = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_cmbcopaymenttype",pagepos._cmbcopaymenttype);
 //BA.debugLineNum = 13;BA.debugLine="Private txtcustname,txtcustemail,txtcustphone,txt";
pagepos._txtcustname = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtcustname",pagepos._txtcustname);
pagepos._txtcustemail = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtcustemail",pagepos._txtcustemail);
pagepos._txtcustphone = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtcustphone",pagepos._txtcustphone);
pagepos._txtcustcountry = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtcustcountry",pagepos._txtcustcountry);
pagepos._txtcustcity = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtcustcity",pagepos._txtcustcity);
pagepos._txtcustaddress = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtcustaddress",pagepos._txtcustaddress);
pagepos._txtcustrtn = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtcustrtn",pagepos._txtcustrtn);
 //BA.debugLineNum = 15;BA.debugLine="Private lblcototalproducts,lblcototaltax,lblcotot";
pagepos._lblcototalproducts = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblcototalproducts",pagepos._lblcototalproducts);
pagepos._lblcototaltax = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblcototaltax",pagepos._lblcototaltax);
pagepos._lblcototaldiscount = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblcototaldiscount",pagepos._lblcototaldiscount);
pagepos._lblcototalshipping = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblcototalshipping",pagepos._lblcototalshipping);
pagepos._lblcograndtotal = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblcograndtotal",pagepos._lblcograndtotal);
 //BA.debugLineNum = 17;BA.debugLine="Private nombre_cliente As String";
pagepos._nombre_cliente = RemoteObject.createImmutable("");__ref.setField("_nombre_cliente",pagepos._nombre_cliente);
 //BA.debugLineNum = 18;BA.debugLine="Private GlobaldblGrandTotal,GlobaldblTotaldiscoun";
pagepos._globaldblgrandtotal = RemoteObject.createImmutable(0);__ref.setField("_globaldblgrandtotal",pagepos._globaldblgrandtotal);
pagepos._globaldbltotaldiscount = RemoteObject.createImmutable(0);__ref.setField("_globaldbltotaldiscount",pagepos._globaldbltotaldiscount);
pagepos._globaldbltotaltax = RemoteObject.createImmutable(0);__ref.setField("_globaldbltotaltax",pagepos._globaldbltotaltax);
 //BA.debugLineNum = 20;BA.debugLine="Private txtcopaidamount,txtconotes,divinvprint As";
pagepos._txtcopaidamount = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtcopaidamount",pagepos._txtcopaidamount);
pagepos._txtconotes = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtconotes",pagepos._txtconotes);
pagepos._divinvprint = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divinvprint",pagepos._divinvprint);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear_customersinputs(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Clear_CustomersInputs (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,601);
if (RapidSub.canDelegate("clear_customersinputs")) { return __ref.runUserSub(false, "pagepos","clear_customersinputs", __ref, _params);}
Debug.locals.put("Params", _params);
 BA.debugLineNum = 601;BA.debugLine="Private Sub Clear_CustomersInputs (Params As Map)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 602;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 604;BA.debugLine="txtcustname.SetVal(\"\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txtcustname" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 605;BA.debugLine="txtcustemail.SetVal(\"\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txtcustemail" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 606;BA.debugLine="txtcustphone.SetVal(\"\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_txtcustphone" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 607;BA.debugLine="txtcustcountry.SetVal(\"\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtcustcountry" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 608;BA.debugLine="txtcustcity.SetVal(\"\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtcustcity" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 609;BA.debugLine="txtcustaddress.SetVal(\"\")";
Debug.ShouldStop(1);
__ref.getField(false,"_txtcustaddress" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 610;BA.debugLine="txtcustrtn.SetVal(\"\")";
Debug.ShouldStop(2);
__ref.getField(false,"_txtcustrtn" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 611;BA.debugLine="ws.Flush";
Debug.ShouldStop(4);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Flush");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 614;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
pagepos.__c.runVoidMethod ("LogImpl","21507341",BA.ObjectToString(pagepos.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 616;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmbcategory_change(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("cmbcategory_Change (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,430);
if (RapidSub.canDelegate("cmbcategory_change")) { return __ref.runUserSub(false, "pagepos","cmbcategory_change", __ref, _params);}
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 430;BA.debugLine="Sub cmbcategory_Change (Params As Map)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 431;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 432;BA.debugLine="txtsearchproducts.SetVal(\"0\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_txtsearchproducts" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 433;BA.debugLine="divproducts.SetHtml(\"\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_divproducts" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 434;BA.debugLine="ws.Flush";
Debug.ShouldStop(131072);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Flush");
 BA.debugLineNum = 437;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(1048576);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 438;BA.debugLine="rs = sql1.ExecQuery($\"SELECT        ProductsInfo";
Debug.ShouldStop(2097152);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT        ProductsInformation.ProductID, ProductsInformation.ProductName, ProductsInformation.ProductPrice, ProductsInformation.ProductImage, ProductsInformation.CatID, ProductsInformation.CostPrice, \n"),RemoteObject.createImmutable("                         ProductsInformation.ProductBarcode, ProductsInformation.ProductTax, CatInfo.CatDesc\n"),RemoteObject.createImmutable("FROM            ProductsInformation LEFT OUTER JOIN\n"),RemoteObject.createImmutable("                         CatInfo ON ProductsInformation.CatID = CatInfo.CatID where ProductsInformation.CatID="),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_cmbcategory" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"))),RemoteObject.createImmutable(" ")))));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 443;BA.debugLine="Dim str As String";
Debug.ShouldStop(67108864);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 444;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(134217728);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 447;BA.debugLine="str =str & $\"<div class=\"card o-hidden bd-highl";
Debug.ShouldStop(1073741824);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable("<div class=\"card o-hidden bd-highlight m-1\">\n"),RemoteObject.createImmutable("                                   <a href='javascript:void(0);' onclick=\"sellproduct("),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ProductID")))))),RemoteObject.createImmutable(")\" > <div class=\"list-thumb d-flex\"><img alt=\"\" src=\""),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductImage")))))),RemoteObject.createImmutable("\"></div></a>\n"),RemoteObject.createImmutable("                                    <div class=\"flex-grow-1 d-bock\">\n"),RemoteObject.createImmutable("                                       <div class=\"card-body align-self-center d-flex flex-column justify-content-between align-items-lg-center\">\n"),RemoteObject.createImmutable("                                          <div class=\"w-40 w-sm-100 item-title\">"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductName")))))),RemoteObject.createImmutable("</div>\n"),RemoteObject.createImmutable("                                          <p class=\"text-muted text-small w-15 w-sm-100 mb-2\">"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductBarcode")))))),RemoteObject.createImmutable("</p>\n"),RemoteObject.createImmutable("                                          <span class=\"badge badge-primary w-15 w-sm-100 mb-2\">"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((pagepos.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductPrice"))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(pagepos.__c.getField(true,"False")))))),RemoteObject.createImmutable(" L</span> \n"),RemoteObject.createImmutable("                                          \n"),RemoteObject.createImmutable("                                       </div>\n"),RemoteObject.createImmutable("                                    </div>\n"),RemoteObject.createImmutable("                                 </div>"))));Debug.locals.put("str", _str);
 BA.debugLineNum = 459;BA.debugLine="divproducts.SetHtml(str)";
Debug.ShouldStop(1024);
__ref.getField(false,"_divproducts" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_str));
 BA.debugLineNum = 461;BA.debugLine="ws.Flush";
Debug.ShouldStop(4096);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Flush");
 }
;
 BA.debugLineNum = 465;BA.debugLine="rs.Close";
Debug.ShouldStop(65536);
_rs.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e15.toString()); BA.debugLineNum = 468;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
pagepos.__c.runVoidMethod ("LogImpl","21179686",BA.ObjectToString(pagepos.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 470;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _create_invoice_toprint(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Create_invoice_ToPrint (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,706);
if (RapidSub.canDelegate("create_invoice_toprint")) { return __ref.runUserSub(false, "pagepos","create_invoice_toprint", __ref);}
RemoteObject _fecha = RemoteObject.createImmutable("");
RemoteObject _str = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _cls = RemoteObject.declareNull("b4j.example.clstblsoldproducts");
 BA.debugLineNum = 706;BA.debugLine="Sub Create_invoice_ToPrint";
Debug.ShouldStop(2);
 BA.debugLineNum = 707;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 708;BA.debugLine="Dim fecha As String =  DateTime.Date(DateTime.No";
Debug.ShouldStop(8);
_fecha = RemoteObject.concat(pagepos.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(pagepos.__c.getField(false,"DateTime").runMethod(true,"getNow"))),RemoteObject.createImmutable(" "),pagepos.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(pagepos.__c.getField(false,"DateTime").runMethod(true,"getNow"))));Debug.locals.put("fecha", _fecha);Debug.locals.put("fecha", _fecha);
 BA.debugLineNum = 709;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy HH:mm:ss\"";
Debug.ShouldStop(16);
pagepos.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy HH:mm:ss"));
 BA.debugLineNum = 711;BA.debugLine="Dim str As String";
Debug.ShouldStop(64);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 712;BA.debugLine="str = $\"<div> 					<div id=\"invoice-POS\">";
Debug.ShouldStop(128);
_str = RemoteObject.concat((RemoteObject.concat(RemoteObject.createImmutable("<div>\n"),RemoteObject.createImmutable("					<div id=\"invoice-POS\">\n"),RemoteObject.createImmutable("						<left>\n"),RemoteObject.createImmutable("						<h6 class=\"text-right\">"))),_fecha,(RemoteObject.concat(RemoteObject.createImmutable("</h6>\n"),RemoteObject.createImmutable("						</left>\n"),RemoteObject.createImmutable("						<center id=\"top\">\n"),RemoteObject.createImmutable("							<div class=\"logo\"><img src=\"images/logo-default.png\"></div>\n"),RemoteObject.createImmutable("							<div class=\"info\">\n"),RemoteObject.createImmutable("								<h2>Soluciones Informáticas Fortin</h2></div>\n"),RemoteObject.createImmutable("						</center>\n"),RemoteObject.createImmutable("						<div class=\"info\">\n"),RemoteObject.createImmutable("						<center>\n"),RemoteObject.createImmutable("							<h6>RTN : 01011992010754</h6>\n"),RemoteObject.createImmutable("							<h6>Dirección : 2da avenida comayaguaela entre 8va y 9na calle edificio CAE</h6>\n"),RemoteObject.createImmutable("							<h6>Email : admin@sifhn.com</h6>\n"),RemoteObject.createImmutable("							<h6>Telefono : (504) 9878-0884</h6>\n"),RemoteObject.createImmutable("							<h6>C.A.I	:  85D968-151D08-A64097-7C6028-7DA36C-FD</h6>\n"),RemoteObject.createImmutable("							<h6>Rango autorizado del 000-001-01-00001401 al 000-001-01-00001500</h6>\n"),RemoteObject.createImmutable("							<h6>fecha limite de emisión: 26/02/2023</h6>\n"),RemoteObject.createImmutable("							<h6>Cliente : "))),__ref.getField(true,"_nombre_cliente" /*RemoteObject*/ ),(RemoteObject.concat(RemoteObject.createImmutable("</h6>\n"),RemoteObject.createImmutable("							<h6>RTN	: 01010101010</h6></div>\n"),RemoteObject.createImmutable("							</center>\n"),RemoteObject.createImmutable("						<table class=\"mt-3 ml-2 table-md\">\n"),RemoteObject.createImmutable("							<thead>\n"),RemoteObject.createImmutable("								<tr>\n"),RemoteObject.createImmutable("									<th scope=\"col\">Producto</th>\n"),RemoteObject.createImmutable("									<th scope=\"col\">Cantidad</th>\n"),RemoteObject.createImmutable("									<th scope=\"col\">Subtotal</th>\n"),RemoteObject.createImmutable("								</tr>\n"),RemoteObject.createImmutable("							</thead>\n"),RemoteObject.createImmutable("							<tbody> "))));Debug.locals.put("str", _str);
 BA.debugLineNum = 746;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
Debug.ShouldStop(512);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 747;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProdu";
Debug.ShouldStop(1024);
_cls = (__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("cls", _cls);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 748;BA.debugLine="str = str & $\"<tr> 									<td>${cls.PName}";
Debug.ShouldStop(2048);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable("<tr>\n"),RemoteObject.createImmutable("									<td>"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cls.getField(true,"_pname" /*RemoteObject*/ )))),RemoteObject.createImmutable("</td>\n"),RemoteObject.createImmutable("									<td>"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cls.getField(true,"_pqty" /*RemoteObject*/ )))),RemoteObject.createImmutable("</td>\n"),RemoteObject.createImmutable("									<td>"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(((RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_psellprice" /*RemoteObject*/ ),_cls.getField(true,"_pqty" /*RemoteObject*/ )}, "*",0, 0))))),RemoteObject.createImmutable(" L</td>\n"),RemoteObject.createImmutable("								</tr>"))));Debug.locals.put("str", _str);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 757;BA.debugLine="str = str & $\" 								 <tr> 									<th></";
Debug.ShouldStop(1048576);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("								 <tr>\n"),RemoteObject.createImmutable("									<th></th>\n"),RemoteObject.createImmutable("									<th>ISV</th>\n"),RemoteObject.createImmutable("									<td>"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_globaldbltotaltax" /*RemoteObject*/ )))),RemoteObject.createImmutable(" L</td>\n"),RemoteObject.createImmutable("								</tr>\n"),RemoteObject.createImmutable("								<tr>\n"),RemoteObject.createImmutable("									<th></th>\n"),RemoteObject.createImmutable("									<th>Descuentos</th>\n"),RemoteObject.createImmutable("									<td>"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_globaldbltotaldiscount" /*RemoteObject*/ )))),RemoteObject.createImmutable(" L</td>\n"),RemoteObject.createImmutable("								</tr>\n"),RemoteObject.createImmutable("								<tr>\n"),RemoteObject.createImmutable("									<th></th>\n"),RemoteObject.createImmutable("									<th>Envio</th>\n"),RemoteObject.createImmutable("									<td>"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_dblshipping" /*RemoteObject*/ )))),RemoteObject.createImmutable(" L</td>\n"),RemoteObject.createImmutable("								</tr>\n"),RemoteObject.createImmutable("								\n"),RemoteObject.createImmutable("							</tbody>\n"),RemoteObject.createImmutable("						</table>\n"),RemoteObject.createImmutable("						\n"),RemoteObject.createImmutable("						<table id=\"total\" class=\"mt-2 ml-2\">\n"),RemoteObject.createImmutable("							<tbody>\n"),RemoteObject.createImmutable("								<tr>\n"),RemoteObject.createImmutable("									<th class=\"p-1 w-75\">Total</th>\n"),RemoteObject.createImmutable("									<th class=\"p-1 w-25\">"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_globaldblgrandtotal" /*RemoteObject*/ )))),RemoteObject.createImmutable(" L</th>\n"),RemoteObject.createImmutable("								</tr>\n"),RemoteObject.createImmutable("							</tbody>\n"),RemoteObject.createImmutable("						</table>\n"),RemoteObject.createImmutable("						<div id=\"legalcopy\" class=\"ml-2\">\n"),RemoteObject.createImmutable("							<p class=\"legal\"><strong>Factura #000-001-01-00001500</strong></p>\n"),RemoteObject.createImmutable("							<p class=\"legal\"><strong>La factura es beneficio de todos ¡Exijala!</strong></p>\n"),RemoteObject.createImmutable("							\n"),RemoteObject.createImmutable("						</div>\n"),RemoteObject.createImmutable("					</div>\n"),RemoteObject.createImmutable("				</div>"))));Debug.locals.put("str", _str);
 BA.debugLineNum = 795;BA.debugLine="divinvprint.SetHtml(str)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_divinvprint" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_str));
 BA.debugLineNum = 798;BA.debugLine="Dim str As String";
Debug.ShouldStop(536870912);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 799;BA.debugLine="str = $\" 		 		var modal = document.getElementByI";
Debug.ShouldStop(1073741824);
_str = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		var modal = document.getElementById(\"myModal3\");\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		 modal.style.display = \"block\";")));Debug.locals.put("str", _str);
 BA.debugLineNum = 805;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(16);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), pagepos.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e16.toString()); BA.debugLineNum = 808;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
pagepos.__c.runVoidMethod ("LogImpl","21704038",BA.ObjectToString(pagepos.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 810;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delete_product(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Delete_Product (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,515);
if (RapidSub.canDelegate("delete_product")) { return __ref.runUserSub(false, "pagepos","delete_product", __ref, _params);}
RemoteObject _isfound = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _cls = RemoteObject.declareNull("b4j.example.clstblsoldproducts");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 515;BA.debugLine="Private Sub Delete_Product (Params As Map)";
Debug.ShouldStop(4);
 BA.debugLineNum = 516;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 517;BA.debugLine="Dim IsFound As Int = -1";
Debug.ShouldStop(16);
_isfound = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("IsFound", _isfound);Debug.locals.put("IsFound", _isfound);
 BA.debugLineNum = 519;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
Debug.ShouldStop(64);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 520;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProducts";
Debug.ShouldStop(128);
_cls = (__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("cls", _cls);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 521;BA.debugLine="If cls.PID = Params.Get(\"val\") Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_cls.getField(true,"_pid" /*RemoteObject*/ ),BA.numberCast(double.class, _params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))))) { 
 BA.debugLineNum = 522;BA.debugLine="IsFound = i";
Debug.ShouldStop(512);
_isfound = BA.numberCast(int.class, _i);Debug.locals.put("IsFound", _isfound);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 525;BA.debugLine="If IsFound > - 1 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_isfound,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 526;BA.debugLine="txtdiscount.SetVal(\"0\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_txtdiscount" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 527;BA.debugLine="lstSoldProducts.RemoveAt(IsFound)";
Debug.ShouldStop(16384);
__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_isfound));
 BA.debugLineNum = 529;BA.debugLine="Load_tblSoldProducts";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.pagepos.class, "_load_tblsoldproducts" /*RemoteObject*/ );
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e15.toString()); BA.debugLineNum = 533;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
pagepos.__c.runVoidMethod ("LogImpl","21310738",BA.ObjectToString(pagepos.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 535;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _discount_change(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("discount_Change (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,312);
if (RapidSub.canDelegate("discount_change")) { return __ref.runUserSub(false, "pagepos","discount_change", __ref, _params);}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _dbltotaltax = RemoteObject.createImmutable(0);
RemoteObject _dblgrandtotal = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _cls = RemoteObject.declareNull("b4j.example.clstblsoldproducts");
RemoteObject _tempdbltax = RemoteObject.createImmutable(0);
RemoteObject _intcount = RemoteObject.createImmutable(0);
Debug.locals.put("Params", _params);
 BA.debugLineNum = 312;BA.debugLine="Private Sub discount_Change (Params As Map)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 314;BA.debugLine="Dim str As String = Params.Get(\"val\")";
Debug.ShouldStop(33554432);
_str = BA.ObjectToString(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val")))));Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 315;BA.debugLine="If str.Trim.Length > 0 And IsNumber(str.Trim) The";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_str.runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",pagepos.__c.runMethod(true,"IsNumber",(Object)(_str.runMethod(true,"trim"))))) { 
 BA.debugLineNum = 316;BA.debugLine="dbldiscount = Params.Get(\"val\")";
Debug.ShouldStop(134217728);
__ref.setField ("_dbldiscount" /*RemoteObject*/ ,BA.numberCast(double.class, _params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))));
 }else {
 BA.debugLineNum = 319;BA.debugLine="dbldiscount = 0";
Debug.ShouldStop(1073741824);
__ref.setField ("_dbldiscount" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 };
 BA.debugLineNum = 323;BA.debugLine="Dim dblTotalTax As Double = 0";
Debug.ShouldStop(4);
_dbltotaltax = BA.numberCast(double.class, 0);Debug.locals.put("dblTotalTax", _dbltotaltax);Debug.locals.put("dblTotalTax", _dbltotaltax);
 BA.debugLineNum = 324;BA.debugLine="Dim dblgrandTotal As Double = 0";
Debug.ShouldStop(8);
_dblgrandtotal = BA.numberCast(double.class, 0);Debug.locals.put("dblgrandTotal", _dblgrandtotal);Debug.locals.put("dblgrandTotal", _dblgrandtotal);
 BA.debugLineNum = 326;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
Debug.ShouldStop(32);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 327;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProduct";
Debug.ShouldStop(64);
_cls = (__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("cls", _cls);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 329;BA.debugLine="Dim tempdbltax As Double = 0";
Debug.ShouldStop(256);
_tempdbltax = BA.numberCast(double.class, 0);Debug.locals.put("tempdbltax", _tempdbltax);Debug.locals.put("tempdbltax", _tempdbltax);
 BA.debugLineNum = 330;BA.debugLine="If cls.PTax > 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_cls.getField(true,"_ptax" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 331;BA.debugLine="dblTotalTax = dblTotalTax + ((cls.PSellPrice";
Debug.ShouldStop(1024);
_dbltotaltax = RemoteObject.solve(new RemoteObject[] {_dbltotaltax,(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_psellprice" /*RemoteObject*/ ),_cls.getField(true,"_pqty" /*RemoteObject*/ )}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_ptax" /*RemoteObject*/ ),RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0))}, "+",1, 0);Debug.locals.put("dblTotalTax", _dbltotaltax);
 BA.debugLineNum = 332;BA.debugLine="tempdbltax = ((cls.PSellPrice * cls.PQty) * (";
Debug.ShouldStop(2048);
_tempdbltax = (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_psellprice" /*RemoteObject*/ ),_cls.getField(true,"_pqty" /*RemoteObject*/ )}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_ptax" /*RemoteObject*/ ),RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0));Debug.locals.put("tempdbltax", _tempdbltax);
 };
 BA.debugLineNum = 334;BA.debugLine="dblgrandTotal = dblgrandTotal + ((cls.PSellPri";
Debug.ShouldStop(8192);
_dblgrandtotal = RemoteObject.solve(new RemoteObject[] {_dblgrandtotal,(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_psellprice" /*RemoteObject*/ ),_cls.getField(true,"_pqty" /*RemoteObject*/ )}, "*",0, 0)),_tempdbltax}, "+",1, 0))}, "+",1, 0);Debug.locals.put("dblgrandTotal", _dblgrandtotal);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 338;BA.debugLine="dblgrandTotal = dblgrandTotal - dbldiscount";
Debug.ShouldStop(131072);
_dblgrandtotal = RemoteObject.solve(new RemoteObject[] {_dblgrandtotal,__ref.getField(true,"_dbldiscount" /*RemoteObject*/ )}, "-",1, 0);Debug.locals.put("dblgrandTotal", _dblgrandtotal);
 BA.debugLineNum = 339;BA.debugLine="dblgrandTotal = dblgrandTotal + dblshipping";
Debug.ShouldStop(262144);
_dblgrandtotal = RemoteObject.solve(new RemoteObject[] {_dblgrandtotal,__ref.getField(true,"_dblshipping" /*RemoteObject*/ )}, "+",1, 0);Debug.locals.put("dblgrandTotal", _dblgrandtotal);
 BA.debugLineNum = 341;BA.debugLine="lblgrandtotal.SetHtml($\"<span>Total : ${NumberF";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblgrandtotal" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)((RemoteObject.concat(RemoteObject.createImmutable("<span>Total : "),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((pagepos.__c.runMethod(true,"NumberFormat2",(Object)(_dblgrandtotal),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False")))))),RemoteObject.createImmutable("L </span>")))));
 BA.debugLineNum = 342;BA.debugLine="txttax.SetVal(NumberFormat2(dblTotalTax,1,3,0,F";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txttax" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((pagepos.__c.runMethod(true,"NumberFormat2",(Object)(_dbltotaltax),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False"))))));
 BA.debugLineNum = 343;BA.debugLine="ws.Flush";
Debug.ShouldStop(4194304);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Flush");
 BA.debugLineNum = 346;BA.debugLine="Dim intcount As Int = 0";
Debug.ShouldStop(33554432);
_intcount = BA.numberCast(int.class, 0);Debug.locals.put("intcount", _intcount);Debug.locals.put("intcount", _intcount);
 BA.debugLineNum = 347;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
Debug.ShouldStop(67108864);
{
final int step24 = 1;
final int limit24 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24) ;_i = ((int)(0 + _i + step24))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 348;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProduc";
Debug.ShouldStop(134217728);
_cls = (__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("cls", _cls);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 349;BA.debugLine="intcount = intcount + cls.PQty";
Debug.ShouldStop(268435456);
_intcount = RemoteObject.solve(new RemoteObject[] {_intcount,_cls.getField(true,"_pqty" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("intcount", _intcount);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 351;BA.debugLine="lblcototalproducts.SetHtml(intcount)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblcototalproducts" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(BA.NumberToString(_intcount)));
 BA.debugLineNum = 354;BA.debugLine="lblcototaltax.SetHtml(NumberFormat2(dblTotalTa";
Debug.ShouldStop(2);
__ref.getField(false,"_lblcototaltax" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(pagepos.__c.runMethod(true,"NumberFormat2",(Object)(_dbltotaltax),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False"))),RemoteObject.createImmutable(" L"))));
 BA.debugLineNum = 355;BA.debugLine="lblcototalshipping.SetHtml(NumberFormat2(dblsh";
Debug.ShouldStop(4);
__ref.getField(false,"_lblcototalshipping" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(pagepos.__c.runMethod(true,"NumberFormat2",(Object)(__ref.getField(true,"_dblshipping" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False"))),RemoteObject.createImmutable(" L"))));
 BA.debugLineNum = 356;BA.debugLine="lblcograndtotal.SetHtml(NumberFormat2(dblgrand";
Debug.ShouldStop(8);
__ref.getField(false,"_lblcograndtotal" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(pagepos.__c.runMethod(true,"NumberFormat2",(Object)(_dblgrandtotal),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False"))),RemoteObject.createImmutable(" L"))));
 BA.debugLineNum = 359;BA.debugLine="lblcototaldiscount.SetHtml(NumberFormat2(dbldi";
Debug.ShouldStop(64);
__ref.getField(false,"_lblcototaldiscount" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(pagepos.__c.runMethod(true,"NumberFormat2",(Object)(__ref.getField(true,"_dbldiscount" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False"))),RemoteObject.createImmutable(" L"))));
 BA.debugLineNum = 362;BA.debugLine="GlobaldblGrandTotal = NumberFormat2(dblgrandTota";
Debug.ShouldStop(512);
__ref.setField ("_globaldblgrandtotal" /*RemoteObject*/ ,BA.numberCast(double.class, pagepos.__c.runMethod(true,"NumberFormat2",(Object)(_dblgrandtotal),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False")))));
 BA.debugLineNum = 363;BA.debugLine="GlobaldblTotaldiscount = NumberFormat2(dbldiscou";
Debug.ShouldStop(1024);
__ref.setField ("_globaldbltotaldiscount" /*RemoteObject*/ ,BA.numberCast(double.class, pagepos.__c.runMethod(true,"NumberFormat2",(Object)(__ref.getField(true,"_dbldiscount" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False")))));
 BA.debugLineNum = 364;BA.debugLine="GlobaldblTotalTax = NumberFormat2(dblTotalTax,1,";
Debug.ShouldStop(2048);
__ref.setField ("_globaldbltotaltax" /*RemoteObject*/ ,BA.numberCast(double.class, pagepos.__c.runMethod(true,"NumberFormat2",(Object)(_dbltotaltax),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False")))));
 BA.debugLineNum = 366;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Initialize (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pagepos","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_categories(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_Categories (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("load_categories")) { return __ref.runUserSub(false, "pagepos","load_categories", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _val = RemoteObject.createImmutable("");
 BA.debugLineNum = 52;BA.debugLine="Sub Load_Categories";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 54;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(2097152);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 55;BA.debugLine="sb.Initialize";
Debug.ShouldStop(4194304);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 56;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(8388608);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 57;BA.debugLine="rs = sql1.ExecQuery(\"select * from CatInfo\")";
Debug.ShouldStop(16777216);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from CatInfo")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 59;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(67108864);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 60;BA.debugLine="Dim val As String = rs.GetInt(\"CatID\")";
Debug.ShouldStop(134217728);
_val = BA.NumberToString(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("CatID"))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 61;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
Debug.ShouldStop(268435456);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<option value='"))).runMethod(false,"Append",(Object)(_val)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("'>"))).runMethod(false,"Append",(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CatDesc"))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</option>")));
 }
;
 BA.debugLineNum = 63;BA.debugLine="rs.Close";
Debug.ShouldStop(1073741824);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 64;BA.debugLine="cmbcategory.SetHtml(sb.ToString)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_cmbcategory" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 65;BA.debugLine="ws.Flush";
Debug.ShouldStop(1);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Flush");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e14.toString()); BA.debugLineNum = 68;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
pagepos.__c.runVoidMethod ("LogImpl","2524304",BA.ObjectToString(pagepos.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
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
public static RemoteObject  _load_customers(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_Customers (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,537);
if (RapidSub.canDelegate("load_customers")) { return __ref.runUserSub(false, "pagepos","load_customers", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _val = RemoteObject.createImmutable("");
 BA.debugLineNum = 537;BA.debugLine="Sub Load_Customers";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 538;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 540;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(134217728);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 541;BA.debugLine="sb.Initialize";
Debug.ShouldStop(268435456);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 542;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(536870912);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 543;BA.debugLine="rs = sql1.ExecQuery(\"select * from CustomersInfo";
Debug.ShouldStop(1073741824);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from CustomersInformation")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 545;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(1);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 546;BA.debugLine="Dim val As String = rs.GetInt(\"CustomerID\")";
Debug.ShouldStop(2);
_val = BA.NumberToString(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("CustomerID"))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 547;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
Debug.ShouldStop(4);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<option value='"))).runMethod(false,"Append",(Object)(_val)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("'>"))).runMethod(false,"Append",(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CustomerName"))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</option>")));
 BA.debugLineNum = 548;BA.debugLine="nombre_cliente = rs.GetInt(\"CustomerName\")";
Debug.ShouldStop(8);
__ref.setField ("_nombre_cliente" /*RemoteObject*/ ,BA.NumberToString(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("CustomerName")))));
 }
;
 BA.debugLineNum = 550;BA.debugLine="rs.Close";
Debug.ShouldStop(32);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 552;BA.debugLine="cmbcustomer.SetHtml(sb.ToString)";
Debug.ShouldStop(128);
__ref.getField(false,"_cmbcustomer" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 553;BA.debugLine="ws.Flush";
Debug.ShouldStop(256);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Flush");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e15.toString()); BA.debugLineNum = 557;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
pagepos.__c.runVoidMethod ("LogImpl","21376276",BA.ObjectToString(pagepos.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 559;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Load_PaymentTypes (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,618);
if (RapidSub.canDelegate("load_paymenttypes")) { return __ref.runUserSub(false, "pagepos","load_paymenttypes", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _val = RemoteObject.createImmutable("");
 BA.debugLineNum = 618;BA.debugLine="Sub Load_PaymentTypes";
Debug.ShouldStop(512);
 BA.debugLineNum = 620;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 621;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(4096);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 622;BA.debugLine="sb.Initialize";
Debug.ShouldStop(8192);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 623;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(16384);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 624;BA.debugLine="rs = sql1.ExecQuery(\"select * from PaymentTypesI";
Debug.ShouldStop(32768);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from PaymentTypesInfo")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 626;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(131072);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 627;BA.debugLine="Dim val As String = rs.GetInt(\"PaymenttypeID\")";
Debug.ShouldStop(262144);
_val = BA.NumberToString(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("PaymenttypeID"))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 628;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
Debug.ShouldStop(524288);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<option value='"))).runMethod(false,"Append",(Object)(_val)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("'>"))).runMethod(false,"Append",(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("PaymentDesc"))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</option>")));
 }
;
 BA.debugLineNum = 630;BA.debugLine="rs.Close";
Debug.ShouldStop(2097152);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 631;BA.debugLine="cmbcopaymenttype.SetHtml(sb.ToString)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_cmbcopaymenttype" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 632;BA.debugLine="ws.Flush";
Debug.ShouldStop(8388608);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Flush");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e14.toString()); BA.debugLineNum = 635;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
pagepos.__c.runVoidMethod ("LogImpl","21572881",BA.ObjectToString(pagepos.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 638;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Load_Products (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("load_products")) { return __ref.runUserSub(false, "pagepos","load_products", __ref);}
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 71;BA.debugLine="Sub Load_Products";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 73;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(256);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 74;BA.debugLine="rs = sql1.ExecQuery($\"SELECT        ProductsInfo";
Debug.ShouldStop(512);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT        ProductsInformation.ProductID, ProductsInformation.ProductName, ProductsInformation.ProductPrice, ProductsInformation.ProductImage, ProductsInformation.CatID, ProductsInformation.CostPrice, \n"),RemoteObject.createImmutable("                         ProductsInformation.ProductBarcode, ProductsInformation.ProductTax, CatInfo.CatDesc\n"),RemoteObject.createImmutable("FROM            ProductsInformation LEFT OUTER JOIN\n"),RemoteObject.createImmutable("                         CatInfo ON ProductsInformation.CatID = CatInfo.CatID")))));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 79;BA.debugLine="Dim str As String";
Debug.ShouldStop(16384);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 80;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(32768);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 83;BA.debugLine="str =str & $\"<div class=\"card o-hidden bd-highl";
Debug.ShouldStop(262144);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable("<div class=\"card o-hidden bd-highlight m-1\">\n"),RemoteObject.createImmutable("                                   <a href='javascript:void(0);' onclick=\"sellproduct("),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ProductID")))))),RemoteObject.createImmutable(")\" > <div class=\"list-thumb d-flex\"><img alt=\"\" src=\""),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductImage")))))),RemoteObject.createImmutable("\"></div></a>\n"),RemoteObject.createImmutable("                                    <div class=\"flex-grow-1 d-bock\">\n"),RemoteObject.createImmutable("                                       <div class=\"card-body align-self-center d-flex flex-column justify-content-between align-items-lg-center\">\n"),RemoteObject.createImmutable("                                          <div class=\"w-40 w-sm-100 item-title\">"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductName")))))),RemoteObject.createImmutable("</div>\n"),RemoteObject.createImmutable("                                          <p class=\"text-muted text-small w-15 w-sm-100 mb-2\">"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductBarcode")))))),RemoteObject.createImmutable("</p>\n"),RemoteObject.createImmutable("                                          <span class=\"badge badge-primary w-15 w-sm-100 mb-2\">"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((pagepos.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductPrice"))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(pagepos.__c.getField(true,"False")))))),RemoteObject.createImmutable(" L</span> \n"),RemoteObject.createImmutable("                                          \n"),RemoteObject.createImmutable("                                       </div>\n"),RemoteObject.createImmutable("                                    </div>\n"),RemoteObject.createImmutable("                                 </div>"))));Debug.locals.put("str", _str);
 BA.debugLineNum = 95;BA.debugLine="divproducts.SetHtml(str)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_divproducts" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_str));
 BA.debugLineNum = 97;BA.debugLine="ws.Flush";
Debug.ShouldStop(1);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Flush");
 }
;
 BA.debugLineNum = 101;BA.debugLine="rs.Close";
Debug.ShouldStop(16);
_rs.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 105;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
pagepos.__c.runVoidMethod ("LogImpl","2589858",BA.ObjectToString(pagepos.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_tblsoldproducts(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_tblSoldProducts (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("load_tblsoldproducts")) { return __ref.runUserSub(false, "pagepos","load_tblsoldproducts", __ref);}
RemoteObject _dbltotaltax = RemoteObject.createImmutable(0);
RemoteObject _dblgrandtotal = RemoteObject.createImmutable(0);
RemoteObject _str = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _cls = RemoteObject.declareNull("b4j.example.clstblsoldproducts");
RemoteObject _tempdbltax = RemoteObject.createImmutable(0);
RemoteObject _intcount = RemoteObject.createImmutable(0);
 BA.debugLineNum = 145;BA.debugLine="Sub Load_tblSoldProducts";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 148;BA.debugLine="Dim dblTotalTax As Double = 0";
Debug.ShouldStop(524288);
_dbltotaltax = BA.numberCast(double.class, 0);Debug.locals.put("dblTotalTax", _dbltotaltax);Debug.locals.put("dblTotalTax", _dbltotaltax);
 BA.debugLineNum = 149;BA.debugLine="Dim dblgrandTotal As Double = 0";
Debug.ShouldStop(1048576);
_dblgrandtotal = BA.numberCast(double.class, 0);Debug.locals.put("dblgrandTotal", _dblgrandtotal);Debug.locals.put("dblgrandTotal", _dblgrandtotal);
 BA.debugLineNum = 151;BA.debugLine="Dim str As String = $\"  <table class=\"table tabl";
Debug.ShouldStop(4194304);
_str = (RemoteObject.concat(RemoteObject.createImmutable("  <table class=\"table table-striped\">\n"),RemoteObject.createImmutable("                                                <thead>\n"),RemoteObject.createImmutable("                                                   <tr>\n"),RemoteObject.createImmutable("                                                      <th scope=\"col\">Producto</th>\n"),RemoteObject.createImmutable("                                                      <th scope=\"col\">Precio</th>\n"),RemoteObject.createImmutable("                                                      <th scope=\"col\" class=\"text-center\">Cantidad</th>\n"),RemoteObject.createImmutable("                                                      <th scope=\"col\" class=\"text-center\">Subtotal</th>\n"),RemoteObject.createImmutable("                                                      <th scope=\"col\" class=\"text-center\"><i class=\"fa fa-trash\"></i></th>\n"),RemoteObject.createImmutable("                                                   </tr>\n"),RemoteObject.createImmutable("                                                </thead>  <tbody>")));Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 161;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
Debug.ShouldStop(1);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 163;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProducts";
Debug.ShouldStop(4);
_cls = (__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("cls", _cls);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 164;BA.debugLine="str = str & $\"<tr><td>${cls.PName}</td> 			<td>";
Debug.ShouldStop(8);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable("<tr><td>"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cls.getField(true,"_pname" /*RemoteObject*/ )))),RemoteObject.createImmutable("</td>\n"),RemoteObject.createImmutable("			<td>"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cls.getField(true,"_psellprice" /*RemoteObject*/ )))),RemoteObject.createImmutable("</td>\n"),RemoteObject.createImmutable("			<td >	\n"),RemoteObject.createImmutable("				<div class=\"quantity\">\n"),RemoteObject.createImmutable("					<div role=\"group\" class=\"input-group\">\n"),RemoteObject.createImmutable("						<!---->\n"),RemoteObject.createImmutable("						<div class=\"input-group-prepend\"><a  href='javascript:void(0);' onclick=\"minusqty("),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cls.getField(true,"_pid" /*RemoteObject*/ )))),RemoteObject.createImmutable(")\"><span class=\"btn btn-primary btn-sm\">-</span></a></div>\n"),RemoteObject.createImmutable("						<input class=\"form-control\" id=\"txtqty"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cls.getField(true,"_pid" /*RemoteObject*/ )))),RemoteObject.createImmutable("\" value=\""),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cls.getField(true,"_pqty" /*RemoteObject*/ )))),RemoteObject.createImmutable("\" disabled>\n"),RemoteObject.createImmutable("						<div class=\"input-group-append\"><a  href='javascript:void(0);' onclick=\"addqty("),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cls.getField(true,"_pid" /*RemoteObject*/ )))),RemoteObject.createImmutable(")\"><span class=\"btn btn-primary btn-sm\">+</span></a></div>\n"),RemoteObject.createImmutable("						<!---->\n"),RemoteObject.createImmutable("					</div>\n"),RemoteObject.createImmutable("				</div>\n"),RemoteObject.createImmutable("			\n"),RemoteObject.createImmutable("			</td>\n"),RemoteObject.createImmutable("			\n"),RemoteObject.createImmutable("			<td class=\"text-center\" >"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cls.getField(true,"_psubtotal" /*RemoteObject*/ )))),RemoteObject.createImmutable("</td>\n"),RemoteObject.createImmutable("			<td><a href='javascript:void(0);' onclick=\"deleteproduct("),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cls.getField(true,"_pid" /*RemoteObject*/ )))),RemoteObject.createImmutable(")\" title=\"Delete\"><i class=\"fa fa-times text-25 text-danger\"></i></a></td></tr>"))));Debug.locals.put("str", _str);
 BA.debugLineNum = 182;BA.debugLine="Dim tempdbltax As Double = 0";
Debug.ShouldStop(2097152);
_tempdbltax = BA.numberCast(double.class, 0);Debug.locals.put("tempdbltax", _tempdbltax);Debug.locals.put("tempdbltax", _tempdbltax);
 BA.debugLineNum = 183;BA.debugLine="If cls.PTax > 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_cls.getField(true,"_ptax" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 184;BA.debugLine="dblTotalTax = dblTotalTax + ((cls.PSellPrice *";
Debug.ShouldStop(8388608);
_dbltotaltax = RemoteObject.solve(new RemoteObject[] {_dbltotaltax,(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_psellprice" /*RemoteObject*/ ),_cls.getField(true,"_pqty" /*RemoteObject*/ )}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_ptax" /*RemoteObject*/ ),RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0))}, "+",1, 0);Debug.locals.put("dblTotalTax", _dbltotaltax);
 BA.debugLineNum = 185;BA.debugLine="tempdbltax = ((cls.PSellPrice * cls.PQty) * (c";
Debug.ShouldStop(16777216);
_tempdbltax = (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_psellprice" /*RemoteObject*/ ),_cls.getField(true,"_pqty" /*RemoteObject*/ )}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_ptax" /*RemoteObject*/ ),RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0));Debug.locals.put("tempdbltax", _tempdbltax);
 };
 BA.debugLineNum = 187;BA.debugLine="dblgrandTotal = dblgrandTotal + ((cls.PSellPric";
Debug.ShouldStop(67108864);
_dblgrandtotal = RemoteObject.solve(new RemoteObject[] {_dblgrandtotal,(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_psellprice" /*RemoteObject*/ ),_cls.getField(true,"_pqty" /*RemoteObject*/ )}, "*",0, 0)),_tempdbltax}, "+",1, 0))}, "+",1, 0);Debug.locals.put("dblgrandTotal", _dblgrandtotal);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 191;BA.debugLine="str = str & $\"  </tbody></table>\"$";
Debug.ShouldStop(1073741824);
_str = RemoteObject.concat(_str,(RemoteObject.createImmutable("  </tbody></table>")));Debug.locals.put("str", _str);
 BA.debugLineNum = 192;BA.debugLine="tblsoldproducts.SetHtml(str)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_tblsoldproducts" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_str));
 BA.debugLineNum = 194;BA.debugLine="ws.Flush";
Debug.ShouldStop(2);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Flush");
 BA.debugLineNum = 196;BA.debugLine="dblgrandTotal = dblgrandTotal - dbldiscount";
Debug.ShouldStop(8);
_dblgrandtotal = RemoteObject.solve(new RemoteObject[] {_dblgrandtotal,__ref.getField(true,"_dbldiscount" /*RemoteObject*/ )}, "-",1, 0);Debug.locals.put("dblgrandTotal", _dblgrandtotal);
 BA.debugLineNum = 198;BA.debugLine="lblgrandtotal.SetHtml($\"<span> Total : ${NumberF";
Debug.ShouldStop(32);
__ref.getField(false,"_lblgrandtotal" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)((RemoteObject.concat(RemoteObject.createImmutable("<span> Total : "),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((pagepos.__c.runMethod(true,"NumberFormat2",(Object)(_dblgrandtotal),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False")))))),RemoteObject.createImmutable("L </span>")))));
 BA.debugLineNum = 199;BA.debugLine="txttax.SetVal(NumberFormat2(dblTotalTax,1,3,0,Fa";
Debug.ShouldStop(64);
__ref.getField(false,"_txttax" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((pagepos.__c.runMethod(true,"NumberFormat2",(Object)(_dbltotaltax),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False"))))));
 BA.debugLineNum = 200;BA.debugLine="ws.Flush";
Debug.ShouldStop(128);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Flush");
 BA.debugLineNum = 203;BA.debugLine="Dim intcount As Int = 0";
Debug.ShouldStop(1024);
_intcount = BA.numberCast(int.class, 0);Debug.locals.put("intcount", _intcount);Debug.locals.put("intcount", _intcount);
 BA.debugLineNum = 204;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
Debug.ShouldStop(2048);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23) ;_i = ((int)(0 + _i + step23))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 205;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProducts";
Debug.ShouldStop(4096);
_cls = (__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("cls", _cls);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 206;BA.debugLine="intcount = intcount + cls.PQty";
Debug.ShouldStop(8192);
_intcount = RemoteObject.solve(new RemoteObject[] {_intcount,_cls.getField(true,"_pqty" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("intcount", _intcount);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 208;BA.debugLine="lblcototalproducts.SetHtml(intcount)";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblcototalproducts" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(BA.NumberToString(_intcount)));
 BA.debugLineNum = 212;BA.debugLine="lblcototaltax.SetHtml(NumberFormat2(dblTotalTax,";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblcototaltax" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(pagepos.__c.runMethod(true,"NumberFormat2",(Object)(_dbltotaltax),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False"))),RemoteObject.createImmutable(" L"))));
 BA.debugLineNum = 213;BA.debugLine="lblcototalshipping.SetHtml(NumberFormat2(dblship";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblcototalshipping" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(pagepos.__c.runMethod(true,"NumberFormat2",(Object)(__ref.getField(true,"_dblshipping" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False"))),RemoteObject.createImmutable(" L"))));
 BA.debugLineNum = 214;BA.debugLine="lblcograndtotal.SetHtml(NumberFormat2(dblgrandTo";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblcograndtotal" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(pagepos.__c.runMethod(true,"NumberFormat2",(Object)(_dblgrandtotal),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False"))),RemoteObject.createImmutable(" L"))));
 BA.debugLineNum = 216;BA.debugLine="lblcototaldiscount.SetHtml(NumberFormat2(dbldisc";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lblcototaldiscount" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(pagepos.__c.runMethod(true,"NumberFormat2",(Object)(__ref.getField(true,"_dbldiscount" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False"))),RemoteObject.createImmutable(" L"))));
 BA.debugLineNum = 218;BA.debugLine="GlobaldblGrandTotal = NumberFormat2(dblgrandTota";
Debug.ShouldStop(33554432);
__ref.setField ("_globaldblgrandtotal" /*RemoteObject*/ ,BA.numberCast(double.class, pagepos.__c.runMethod(true,"NumberFormat2",(Object)(_dblgrandtotal),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False")))));
 BA.debugLineNum = 219;BA.debugLine="GlobaldblTotaldiscount = NumberFormat2(dbldiscou";
Debug.ShouldStop(67108864);
__ref.setField ("_globaldbltotaldiscount" /*RemoteObject*/ ,BA.numberCast(double.class, pagepos.__c.runMethod(true,"NumberFormat2",(Object)(__ref.getField(true,"_dbldiscount" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False")))));
 BA.debugLineNum = 220;BA.debugLine="GlobaldblTotalTax = NumberFormat2(dblTotalTax,1,";
Debug.ShouldStop(134217728);
__ref.setField ("_globaldbltotaltax" /*RemoteObject*/ ,BA.numberCast(double.class, pagepos.__c.runMethod(true,"NumberFormat2",(Object)(_dbltotaltax),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False")))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e36) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e36.toString()); BA.debugLineNum = 224;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
pagepos.__c.runVoidMethod ("LogImpl","2720975",BA.ObjectToString(pagepos.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _minus_qty_tblproducts(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Minus_Qty_tblProducts (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,247);
if (RapidSub.canDelegate("minus_qty_tblproducts")) { return __ref.runUserSub(false, "pagepos","minus_qty_tblproducts", __ref, _params);}
int _i = 0;
RemoteObject _cls = RemoteObject.declareNull("b4j.example.clstblsoldproducts");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 247;BA.debugLine="Private Sub Minus_Qty_tblProducts (Params As Map)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 248;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 249;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
Debug.ShouldStop(16777216);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 250;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProducts";
Debug.ShouldStop(33554432);
_cls = (__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("cls", _cls);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 251;BA.debugLine="If cls.PID = Params.Get(\"val\") Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_cls.getField(true,"_pid" /*RemoteObject*/ ),BA.numberCast(double.class, _params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))))) { 
 BA.debugLineNum = 252;BA.debugLine="If cls.PQty > 1 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_cls.getField(true,"_pqty" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 253;BA.debugLine="cls.PQty = cls.PQty - 1";
Debug.ShouldStop(268435456);
_cls.setField ("_pqty" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_pqty" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 254;BA.debugLine="cls.PSubTotal = cls.PSellPrice * cls.PQty";
Debug.ShouldStop(536870912);
_cls.setField ("_psubtotal" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_psellprice" /*RemoteObject*/ ),_cls.getField(true,"_pqty" /*RemoteObject*/ )}, "*",0, 0));
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 260;BA.debugLine="Load_tblSoldProducts";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.pagepos.class, "_load_tblsoldproducts" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e13.toString()); BA.debugLineNum = 264;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
pagepos.__c.runVoidMethod ("LogImpl","2851985",BA.ObjectToString(pagepos.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reset_tbl(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Reset_Tbl (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,276);
if (RapidSub.canDelegate("reset_tbl")) { return __ref.runUserSub(false, "pagepos","reset_tbl", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 276;BA.debugLine="Sub Reset_Tbl";
Debug.ShouldStop(524288);
 BA.debugLineNum = 277;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 278;BA.debugLine="dbldiscount = 0";
Debug.ShouldStop(2097152);
__ref.setField ("_dbldiscount" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 280;BA.debugLine="lblcototalproducts.SetHtml(\"0\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lblcototalproducts" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.createImmutable("0")));
 BA.debugLineNum = 281;BA.debugLine="lblcototaltax.SetHtml(0 & \" L\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblcototaltax" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(RemoteObject.createImmutable(0),RemoteObject.createImmutable(" L"))));
 BA.debugLineNum = 282;BA.debugLine="lblcototalshipping.SetHtml(\"0 L\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblcototalshipping" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.createImmutable("0 L")));
 BA.debugLineNum = 283;BA.debugLine="lblcograndtotal.SetHtml(0 & \" L\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblcograndtotal" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(RemoteObject.createImmutable(0),RemoteObject.createImmutable(" L"))));
 BA.debugLineNum = 284;BA.debugLine="lblcototaldiscount.SetHtml(0 & \" L\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblcototaldiscount" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(RemoteObject.createImmutable(0),RemoteObject.createImmutable(" L"))));
 BA.debugLineNum = 286;BA.debugLine="GlobaldblGrandTotal = 0";
Debug.ShouldStop(536870912);
__ref.setField ("_globaldblgrandtotal" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 287;BA.debugLine="GlobaldblTotaldiscount = 0";
Debug.ShouldStop(1073741824);
__ref.setField ("_globaldbltotaldiscount" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 288;BA.debugLine="GlobaldblTotalTax = 0";
Debug.ShouldStop(-2147483648);
__ref.setField ("_globaldbltotaltax" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 290;BA.debugLine="txtcopaidamount.SetVal(\"0\")";
Debug.ShouldStop(2);
__ref.getField(false,"_txtcopaidamount" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 291;BA.debugLine="txtconotes.SetVal(\"0\")";
Debug.ShouldStop(4);
__ref.getField(false,"_txtconotes" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 293;BA.debugLine="dblshipping = 0";
Debug.ShouldStop(16);
__ref.setField ("_dblshipping" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 295;BA.debugLine="Dim str As String = $\"  <table class=\"table tabl";
Debug.ShouldStop(64);
_str = (RemoteObject.concat(RemoteObject.createImmutable("  <table class=\"table table-striped\">\n"),RemoteObject.createImmutable("                                                <thead>\n"),RemoteObject.createImmutable("                                                   <tr>\n"),RemoteObject.createImmutable("                                                      <th scope=\"col\">Producto</th>\n"),RemoteObject.createImmutable("                                                      <th scope=\"col\">Precio</th>\n"),RemoteObject.createImmutable("                                                      <th scope=\"col\" class=\"text-center\">Cantidad</th>\n"),RemoteObject.createImmutable("                                                      <th scope=\"col\" class=\"text-center\">Subtotal</th>\n"),RemoteObject.createImmutable("                                                      <th scope=\"col\" class=\"text-center\"><i class=\"fa fa-trash\"></i></th>\n"),RemoteObject.createImmutable("                                                   </tr>\n"),RemoteObject.createImmutable("                                                </thead>  <tbody><tbody><tr><td colspan=\"5\">Sin información disponible</td></tr> </tbody></table>")));Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 305;BA.debugLine="tblsoldproducts.SetHtml(str)";
Debug.ShouldStop(65536);
__ref.getField(false,"_tblsoldproducts" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_str));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e17.toString()); BA.debugLineNum = 308;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
pagepos.__c.runVoidMethod ("LogImpl","2983072",BA.ObjectToString(pagepos.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 310;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _search_products(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Search_Products (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,472);
if (RapidSub.canDelegate("search_products")) { return __ref.runUserSub(false, "pagepos","search_products", __ref, _params);}
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 472;BA.debugLine="Private Sub Search_Products (Params As Map)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 473;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 474;BA.debugLine="divproducts.SetHtml(\"\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_divproducts" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 475;BA.debugLine="ws.Flush";
Debug.ShouldStop(67108864);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Flush");
 BA.debugLineNum = 478;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(536870912);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 479;BA.debugLine="rs = sql1.ExecQuery($\"SELECT        ProductsInfo";
Debug.ShouldStop(1073741824);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT        ProductsInformation.ProductID, ProductsInformation.ProductName, ProductsInformation.ProductPrice, ProductsInformation.ProductImage, ProductsInformation.CatID, ProductsInformation.CostPrice, \n"),RemoteObject.createImmutable("                         ProductsInformation.ProductBarcode, ProductsInformation.ProductTax, CatInfo.CatDesc\n"),RemoteObject.createImmutable("FROM            ProductsInformation LEFT OUTER JOIN\n"),RemoteObject.createImmutable("                         CatInfo ON ProductsInformation.CatID = CatInfo.CatID where ProductsInformation.ProductName like '%"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val")))))),RemoteObject.createImmutable("%' or ProductsInformation.ProductBarcode like '%"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val")))))),RemoteObject.createImmutable("%' ")))));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 484;BA.debugLine="Dim str As String";
Debug.ShouldStop(8);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 485;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(16);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 488;BA.debugLine="str =str & $\"<div class=\"card o-hidden bd-highl";
Debug.ShouldStop(128);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable("<div class=\"card o-hidden bd-highlight m-1\">\n"),RemoteObject.createImmutable("                                   <a href='javascript:void(0);' onclick=\"sellproduct("),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ProductID")))))),RemoteObject.createImmutable(")\" > <div class=\"list-thumb d-flex\"><img alt=\"\" src=\""),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductImage")))))),RemoteObject.createImmutable("\"></div></a>\n"),RemoteObject.createImmutable("                                    <div class=\"flex-grow-1 d-bock\">\n"),RemoteObject.createImmutable("                                       <div class=\"card-body align-self-center d-flex flex-column justify-content-between align-items-lg-center\">\n"),RemoteObject.createImmutable("                                          <div class=\"w-40 w-sm-100 item-title\">"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductName")))))),RemoteObject.createImmutable("</div>\n"),RemoteObject.createImmutable("                                          <p class=\"text-muted text-small w-15 w-sm-100 mb-2\">"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductBarcode")))))),RemoteObject.createImmutable("</p>\n"),RemoteObject.createImmutable("                                          <span class=\"badge badge-primary w-15 w-sm-100 mb-2\">"),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((pagepos.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductPrice"))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(pagepos.__c.getField(true,"False")))))),RemoteObject.createImmutable(" L</span> \n"),RemoteObject.createImmutable("                                          \n"),RemoteObject.createImmutable("                                       </div>\n"),RemoteObject.createImmutable("                                    </div>\n"),RemoteObject.createImmutable("                                 </div>"))));Debug.locals.put("str", _str);
 BA.debugLineNum = 500;BA.debugLine="divproducts.SetHtml(str)";
Debug.ShouldStop(524288);
__ref.getField(false,"_divproducts" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_str));
 BA.debugLineNum = 502;BA.debugLine="ws.Flush";
Debug.ShouldStop(2097152);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Flush");
 }
;
 BA.debugLineNum = 506;BA.debugLine="rs.Close";
Debug.ShouldStop(33554432);
_rs.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e14.toString()); BA.debugLineNum = 510;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
pagepos.__c.runVoidMethod ("LogImpl","21245222",BA.ObjectToString(pagepos.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 512;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sell_product(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Sell_Product (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("sell_product")) { return __ref.runUserSub(false, "pagepos","sell_product", __ref, _params);}
RemoteObject _isfound = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _cls = RemoteObject.declareNull("b4j.example.clstblsoldproducts");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 108;BA.debugLine="Private Sub Sell_Product (Params As Map)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 111;BA.debugLine="Dim isFound As Int = 0";
Debug.ShouldStop(16384);
_isfound = BA.numberCast(int.class, 0);Debug.locals.put("isFound", _isfound);Debug.locals.put("isFound", _isfound);
 BA.debugLineNum = 112;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
Debug.ShouldStop(32768);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 113;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProducts";
Debug.ShouldStop(65536);
_cls = (__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("cls", _cls);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 114;BA.debugLine="If cls.PID = Params.Get(\"val\") Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_cls.getField(true,"_pid" /*RemoteObject*/ ),BA.numberCast(double.class, _params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))))) { 
 BA.debugLineNum = 115;BA.debugLine="isFound = 1";
Debug.ShouldStop(262144);
_isfound = BA.numberCast(int.class, 1);Debug.locals.put("isFound", _isfound);
 BA.debugLineNum = 116;BA.debugLine="cls.PQty = cls.PQty + 1";
Debug.ShouldStop(524288);
_cls.setField ("_pqty" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_pqty" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 117;BA.debugLine="cls.PSubTotal = cls.PSellPrice * cls.PQty";
Debug.ShouldStop(1048576);
_cls.setField ("_psubtotal" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_psellprice" /*RemoteObject*/ ),_cls.getField(true,"_pqty" /*RemoteObject*/ )}, "*",0, 0));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 123;BA.debugLine="If isFound = 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_isfound,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 125;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(268435456);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 126;BA.debugLine="rs = sql1.ExecQuery(\"select * from ProductsInfo";
Debug.ShouldStop(536870912);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from ProductsInformation where ProductID="),_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val")))))));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 127;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(1073741824);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 128;BA.debugLine="Dim cls As ClstblSoldProducts";
Debug.ShouldStop(-2147483648);
_cls = RemoteObject.createNew ("b4j.example.clstblsoldproducts");Debug.locals.put("cls", _cls);
 BA.debugLineNum = 129;BA.debugLine="cls.Initialize";
Debug.ShouldStop(1);
_cls.runClassMethod (b4j.example.clstblsoldproducts.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 130;BA.debugLine="cls.Setup(rs.GetInt(\"ProductID\"),rs.GetString(";
Debug.ShouldStop(2);
_cls.runClassMethod (b4j.example.clstblsoldproducts.class, "_setup" /*RemoteObject*/ ,(Object)(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ProductID")))),(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductName")))),(Object)(_rs.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("ProductPrice")))),(Object)(_rs.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("CostPrice")))),(Object)(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ProductTax")))),(Object)(BA.numberCast(int.class, 1)),(Object)(_rs.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("ProductPrice")))));
 BA.debugLineNum = 132;BA.debugLine="lstSoldProducts.Add(cls)";
Debug.ShouldStop(8);
__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cls)));
 }
;
 BA.debugLineNum = 135;BA.debugLine="rs.Close";
Debug.ShouldStop(64);
_rs.runVoidMethod ("Close");
 };
 BA.debugLineNum = 139;BA.debugLine="Load_tblSoldProducts";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.pagepos.class, "_load_tblsoldproducts" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e24) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e24.toString()); BA.debugLineNum = 142;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
pagepos.__c.runVoidMethod ("LogImpl","2655394",BA.ObjectToString(pagepos.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _shipping_change(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("shipping_Change (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,369);
if (RapidSub.canDelegate("shipping_change")) { return __ref.runUserSub(false, "pagepos","shipping_change", __ref, _params);}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _dbltotaltax = RemoteObject.createImmutable(0);
RemoteObject _dblgrandtotal = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _cls = RemoteObject.declareNull("b4j.example.clstblsoldproducts");
RemoteObject _tempdbltax = RemoteObject.createImmutable(0);
RemoteObject _intcount = RemoteObject.createImmutable(0);
Debug.locals.put("Params", _params);
 BA.debugLineNum = 369;BA.debugLine="Private Sub shipping_Change (Params As Map)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 371;BA.debugLine="Dim str As String = Params.Get(\"val\")";
Debug.ShouldStop(262144);
_str = BA.ObjectToString(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val")))));Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 372;BA.debugLine="If str.Trim.Length > 0 And IsNumber(str.Trim) The";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_str.runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",pagepos.__c.runMethod(true,"IsNumber",(Object)(_str.runMethod(true,"trim"))))) { 
 BA.debugLineNum = 373;BA.debugLine="dblshipping = Params.Get(\"val\")";
Debug.ShouldStop(1048576);
__ref.setField ("_dblshipping" /*RemoteObject*/ ,BA.numberCast(double.class, _params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))));
 }else {
 BA.debugLineNum = 376;BA.debugLine="dblshipping = 0";
Debug.ShouldStop(8388608);
__ref.setField ("_dblshipping" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 };
 BA.debugLineNum = 382;BA.debugLine="Dim dblTotalTax As Double = 0";
Debug.ShouldStop(536870912);
_dbltotaltax = BA.numberCast(double.class, 0);Debug.locals.put("dblTotalTax", _dbltotaltax);Debug.locals.put("dblTotalTax", _dbltotaltax);
 BA.debugLineNum = 383;BA.debugLine="Dim dblgrandTotal As Double = 0";
Debug.ShouldStop(1073741824);
_dblgrandtotal = BA.numberCast(double.class, 0);Debug.locals.put("dblgrandTotal", _dblgrandtotal);Debug.locals.put("dblgrandTotal", _dblgrandtotal);
 BA.debugLineNum = 385;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
Debug.ShouldStop(1);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 386;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProduct";
Debug.ShouldStop(2);
_cls = (__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("cls", _cls);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 388;BA.debugLine="Dim tempdbltax As Double = 0";
Debug.ShouldStop(8);
_tempdbltax = BA.numberCast(double.class, 0);Debug.locals.put("tempdbltax", _tempdbltax);Debug.locals.put("tempdbltax", _tempdbltax);
 BA.debugLineNum = 389;BA.debugLine="If cls.PTax > 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_cls.getField(true,"_ptax" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 390;BA.debugLine="dblTotalTax = dblTotalTax + ((cls.PSellPrice";
Debug.ShouldStop(32);
_dbltotaltax = RemoteObject.solve(new RemoteObject[] {_dbltotaltax,(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_psellprice" /*RemoteObject*/ ),_cls.getField(true,"_pqty" /*RemoteObject*/ )}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_ptax" /*RemoteObject*/ ),RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0))}, "+",1, 0);Debug.locals.put("dblTotalTax", _dbltotaltax);
 BA.debugLineNum = 391;BA.debugLine="tempdbltax = ((cls.PSellPrice * cls.PQty) * (";
Debug.ShouldStop(64);
_tempdbltax = (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_psellprice" /*RemoteObject*/ ),_cls.getField(true,"_pqty" /*RemoteObject*/ )}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_ptax" /*RemoteObject*/ ),RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0));Debug.locals.put("tempdbltax", _tempdbltax);
 };
 BA.debugLineNum = 393;BA.debugLine="dblgrandTotal = dblgrandTotal + ((cls.PSellPri";
Debug.ShouldStop(256);
_dblgrandtotal = RemoteObject.solve(new RemoteObject[] {_dblgrandtotal,(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_cls.getField(true,"_psellprice" /*RemoteObject*/ ),_cls.getField(true,"_pqty" /*RemoteObject*/ )}, "*",0, 0)),_tempdbltax}, "+",1, 0))}, "+",1, 0);Debug.locals.put("dblgrandTotal", _dblgrandtotal);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 397;BA.debugLine="dblgrandTotal = dblgrandTotal - dbldiscount";
Debug.ShouldStop(4096);
_dblgrandtotal = RemoteObject.solve(new RemoteObject[] {_dblgrandtotal,__ref.getField(true,"_dbldiscount" /*RemoteObject*/ )}, "-",1, 0);Debug.locals.put("dblgrandTotal", _dblgrandtotal);
 BA.debugLineNum = 399;BA.debugLine="dblgrandTotal = dblgrandTotal + dblshipping";
Debug.ShouldStop(16384);
_dblgrandtotal = RemoteObject.solve(new RemoteObject[] {_dblgrandtotal,__ref.getField(true,"_dblshipping" /*RemoteObject*/ )}, "+",1, 0);Debug.locals.put("dblgrandTotal", _dblgrandtotal);
 BA.debugLineNum = 402;BA.debugLine="lblgrandtotal.SetHtml($\"<span>Total : ${NumberF";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblgrandtotal" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)((RemoteObject.concat(RemoteObject.createImmutable("<span>Total : "),pagepos.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((pagepos.__c.runMethod(true,"NumberFormat2",(Object)(_dblgrandtotal),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False")))))),RemoteObject.createImmutable("L </span>")))));
 BA.debugLineNum = 403;BA.debugLine="txttax.SetVal(NumberFormat2(dblTotalTax,1,3,0,F";
Debug.ShouldStop(262144);
__ref.getField(false,"_txttax" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((pagepos.__c.runMethod(true,"NumberFormat2",(Object)(_dbltotaltax),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False"))))));
 BA.debugLineNum = 404;BA.debugLine="ws.Flush";
Debug.ShouldStop(524288);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Flush");
 BA.debugLineNum = 408;BA.debugLine="Dim intcount As Int = 0";
Debug.ShouldStop(8388608);
_intcount = BA.numberCast(int.class, 0);Debug.locals.put("intcount", _intcount);Debug.locals.put("intcount", _intcount);
 BA.debugLineNum = 409;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
Debug.ShouldStop(16777216);
{
final int step24 = 1;
final int limit24 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24) ;_i = ((int)(0 + _i + step24))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 410;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProduc";
Debug.ShouldStop(33554432);
_cls = (__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("cls", _cls);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 411;BA.debugLine="intcount = intcount + cls.PQty";
Debug.ShouldStop(67108864);
_intcount = RemoteObject.solve(new RemoteObject[] {_intcount,_cls.getField(true,"_pqty" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("intcount", _intcount);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 413;BA.debugLine="lblcototalproducts.SetHtml(intcount)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblcototalproducts" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(BA.NumberToString(_intcount)));
 BA.debugLineNum = 416;BA.debugLine="lblcototaltax.SetHtml(NumberFormat2(dblTotalTa";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblcototaltax" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(pagepos.__c.runMethod(true,"NumberFormat2",(Object)(_dbltotaltax),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False"))),RemoteObject.createImmutable(" L"))));
 BA.debugLineNum = 417;BA.debugLine="lblcototalshipping.SetHtml(NumberFormat2(dblsh";
Debug.ShouldStop(1);
__ref.getField(false,"_lblcototalshipping" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(pagepos.__c.runMethod(true,"NumberFormat2",(Object)(__ref.getField(true,"_dblshipping" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False"))),RemoteObject.createImmutable(" L"))));
 BA.debugLineNum = 418;BA.debugLine="lblcograndtotal.SetHtml(NumberFormat2(dblgrand";
Debug.ShouldStop(2);
__ref.getField(false,"_lblcograndtotal" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(pagepos.__c.runMethod(true,"NumberFormat2",(Object)(_dblgrandtotal),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False"))),RemoteObject.createImmutable(" L"))));
 BA.debugLineNum = 421;BA.debugLine="lblcototaldiscount.SetHtml(NumberFormat2(dbldi";
Debug.ShouldStop(16);
__ref.getField(false,"_lblcototaldiscount" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(pagepos.__c.runMethod(true,"NumberFormat2",(Object)(__ref.getField(true,"_dbldiscount" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False"))),RemoteObject.createImmutable(" L"))));
 BA.debugLineNum = 424;BA.debugLine="GlobaldblGrandTotal = NumberFormat2(dblgrandTota";
Debug.ShouldStop(128);
__ref.setField ("_globaldblgrandtotal" /*RemoteObject*/ ,BA.numberCast(double.class, pagepos.__c.runMethod(true,"NumberFormat2",(Object)(_dblgrandtotal),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False")))));
 BA.debugLineNum = 425;BA.debugLine="GlobaldblTotaldiscount = NumberFormat2(dbldiscou";
Debug.ShouldStop(256);
__ref.setField ("_globaldbltotaldiscount" /*RemoteObject*/ ,BA.numberCast(double.class, pagepos.__c.runMethod(true,"NumberFormat2",(Object)(__ref.getField(true,"_dbldiscount" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False")))));
 BA.debugLineNum = 426;BA.debugLine="GlobaldblTotalTax = NumberFormat2(dblTotalTax,1,";
Debug.ShouldStop(512);
__ref.setField ("_globaldbltotaltax" /*RemoteObject*/ ,BA.numberCast(double.class, pagepos.__c.runMethod(true,"NumberFormat2",(Object)(_dbltotaltax),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(pagepos.__c.getField(true,"False")))));
 BA.debugLineNum = 428;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("WebSocket_Connected (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "pagepos","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 28;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(268435456);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 30;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(536870912);
__ref.setField ("_sql1" /*RemoteObject*/ ,pagepos._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 31;BA.debugLine="lstSoldProducts.Initialize";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lstsoldproducts" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 32;BA.debugLine="Reset_Tbl";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.pagepos.class, "_reset_tbl" /*RemoteObject*/ );
 BA.debugLineNum = 34;BA.debugLine="GlobaldblGrandTotal = 0";
Debug.ShouldStop(2);
__ref.setField ("_globaldblgrandtotal" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 35;BA.debugLine="GlobaldblTotaldiscount = 0";
Debug.ShouldStop(4);
__ref.setField ("_globaldbltotaldiscount" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 36;BA.debugLine="GlobaldblTotalTax = 0";
Debug.ShouldStop(8);
__ref.setField ("_globaldbltotaltax" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 37;BA.debugLine="dbldiscount = 0";
Debug.ShouldStop(16);
__ref.setField ("_dbldiscount" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 39;BA.debugLine="Load_Categories";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.pagepos.class, "_load_categories" /*RemoteObject*/ );
 BA.debugLineNum = 40;BA.debugLine="Load_Products";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.pagepos.class, "_load_products" /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="Load_Customers";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.pagepos.class, "_load_customers" /*RemoteObject*/ );
 BA.debugLineNum = 42;BA.debugLine="Load_PaymentTypes";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.pagepos.class, "_load_paymenttypes" /*RemoteObject*/ );
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("WebSocket_Disconnected (pagepos) ","pagepos",1,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "pagepos","websocket_disconnected", __ref);}
 BA.debugLineNum = 46;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="If sql1.IsInitialized Then";
Debug.ShouldStop(16384);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 48;BA.debugLine="sql1.Close";
Debug.ShouldStop(32768);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}