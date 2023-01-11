package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dashboard_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
dashboard._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",dashboard._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private divuserstrans,divtopcustomers As JQueryEl";
dashboard._divuserstrans = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divuserstrans",dashboard._divuserstrans);
dashboard._divtopcustomers = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divtopcustomers",dashboard._divtopcustomers);
 //BA.debugLineNum = 5;BA.debugLine="Private lblusernamemain As JQueryElement";
dashboard._lblusernamemain = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblusernamemain",dashboard._lblusernamemain);
 //BA.debugLineNum = 6;BA.debugLine="Private divMenu As JQueryElement";
dashboard._divmenu = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divmenu",dashboard._divmenu);
 //BA.debugLineNum = 7;BA.debugLine="Private sql1 As SQL";
dashboard._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",dashboard._sql1);
 //BA.debugLineNum = 9;BA.debugLine="Private lbltotalsales,lbltotaltax,lbltotalexpense";
dashboard._lbltotalsales = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lbltotalsales",dashboard._lbltotalsales);
dashboard._lbltotaltax = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lbltotaltax",dashboard._lbltotaltax);
dashboard._lbltotalexpenses = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lbltotalexpenses",dashboard._lbltotalexpenses);
dashboard._lbltotalreturns = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lbltotalreturns",dashboard._lbltotalreturns);
 //BA.debugLineNum = 10;BA.debugLine="Dim dblTotalInv,dblTotalReturnInv As Float";
dashboard._dbltotalinv = RemoteObject.createImmutable(0f);__ref.setField("_dbltotalinv",dashboard._dbltotalinv);
dashboard._dbltotalreturninv = RemoteObject.createImmutable(0f);__ref.setField("_dbltotalreturninv",dashboard._dbltotalreturninv);
 //BA.debugLineNum = 11;BA.debugLine="Private divtopsellingproducts As JQueryElement";
dashboard._divtopsellingproducts = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divtopsellingproducts",dashboard._divtopsellingproducts);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create_top_dashboard(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Create_Top_Dashboard (dashboard) ","dashboard",5,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("create_top_dashboard")) { return __ref.runUserSub(false, "dashboard","create_top_dashboard", __ref);}
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _ftotal = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 36;BA.debugLine="Sub Create_Top_Dashboard";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 39;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(64);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 40;BA.debugLine="rs = sql1.ExecQuery(\"select ifnull(sum(InvTotal)";
Debug.ShouldStop(128);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select ifnull(sum(InvTotal),0) as InvTotal from SalesInvoiceH")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 41;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(256);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 42;BA.debugLine="Dim fTotal As Float = rs.GetString(\"InvTotal\")";
Debug.ShouldStop(512);
_ftotal = BA.numberCast(float.class, _rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("InvTotal"))));Debug.locals.put("fTotal", _ftotal);Debug.locals.put("fTotal", _ftotal);
 BA.debugLineNum = 43;BA.debugLine="lbltotalsales.SetHtml(NumberFormat(fTotal,0,3)";
Debug.ShouldStop(1024);
__ref.getField(false,"_lbltotalsales" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(dashboard.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _ftotal)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" L"))));
 BA.debugLineNum = 44;BA.debugLine="dblTotalInv = fTotal";
Debug.ShouldStop(2048);
__ref.setField ("_dbltotalinv" /*RemoteObject*/ ,_ftotal);
 }
;
 BA.debugLineNum = 46;BA.debugLine="rs.Close";
Debug.ShouldStop(8192);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 48;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(32768);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 49;BA.debugLine="rs = sql1.ExecQuery(\"select ifnull(sum(InvTotalT";
Debug.ShouldStop(65536);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select ifnull(sum(InvTotalTax),0) as InvTotalTax from SalesInvoiceH")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 50;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(131072);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 51;BA.debugLine="Dim fTotal As Float = rs.GetString(\"InvTotalTax";
Debug.ShouldStop(262144);
_ftotal = BA.numberCast(float.class, _rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("InvTotalTax"))));Debug.locals.put("fTotal", _ftotal);Debug.locals.put("fTotal", _ftotal);
 BA.debugLineNum = 52;BA.debugLine="lbltotaltax.SetHtml(NumberFormat(fTotal,0,3) &";
Debug.ShouldStop(524288);
__ref.getField(false,"_lbltotaltax" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(dashboard.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _ftotal)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" L"))));
 }
;
 BA.debugLineNum = 54;BA.debugLine="rs.Close";
Debug.ShouldStop(2097152);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 57;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(16777216);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 58;BA.debugLine="rs = sql1.ExecQuery(\"select ifnull(sum(ExpensesA";
Debug.ShouldStop(33554432);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select ifnull(sum(ExpensesAmt),0) as ExpensesAmt from ExpensesInfo")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 59;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(67108864);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 60;BA.debugLine="Dim fTotal As Float = rs.GetString(\"ExpensesAmt";
Debug.ShouldStop(134217728);
_ftotal = BA.numberCast(float.class, _rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ExpensesAmt"))));Debug.locals.put("fTotal", _ftotal);Debug.locals.put("fTotal", _ftotal);
 BA.debugLineNum = 61;BA.debugLine="lbltotalexpenses.SetHtml(NumberFormat(fTotal,0,";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lbltotalexpenses" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(dashboard.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _ftotal)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" L"))));
 }
;
 BA.debugLineNum = 63;BA.debugLine="rs.Close";
Debug.ShouldStop(1073741824);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 65;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(1);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 66;BA.debugLine="rs=sql1.ExecQuery(\"select ifnull(sum(InvTotal),0";
Debug.ShouldStop(2);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select ifnull(sum(InvTotal),0) as totalreturns from ReturnSalesInvoiceH")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 67;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(4);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 68;BA.debugLine="Dim fTotal As Float = rs.GetString(\"totalretur";
Debug.ShouldStop(8);
_ftotal = BA.numberCast(float.class, _rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("totalreturns"))));Debug.locals.put("fTotal", _ftotal);Debug.locals.put("fTotal", _ftotal);
 BA.debugLineNum = 69;BA.debugLine="lbltotalreturns.SetHtml(NumberFormat(fTotal,0,";
Debug.ShouldStop(16);
__ref.getField(false,"_lbltotalreturns" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(dashboard.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _ftotal)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" L"))));
 BA.debugLineNum = 70;BA.debugLine="dblTotalReturnInv = fTotal";
Debug.ShouldStop(32);
__ref.setField ("_dbltotalreturninv" /*RemoteObject*/ ,_ftotal);
 }
;
 BA.debugLineNum = 73;BA.debugLine="rs.Close";
Debug.ShouldStop(256);
_rs.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e33) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e33.toString()); BA.debugLineNum = 76;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
dashboard.__c.runVoidMethod ("LogImpl","23866664",BA.ObjectToString(dashboard.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (dashboard) ","dashboard",5,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "dashboard","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16384);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_topsellingproducts(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_TopSellingProducts (dashboard) ","dashboard",5,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("load_topsellingproducts")) { return __ref.runUserSub(false, "dashboard","load_topsellingproducts", __ref);}
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 111;BA.debugLine="Sub Load_TopSellingProducts";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 114;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(131072);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 115;BA.debugLine="rs = sql1.ExecQuery($\"SELECT        SUM(IFNULL(P";
Debug.ShouldStop(262144);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT        SUM(IFNULL(PurchaseInvoiceD.ProductQty, 0)) AS ProductQty, SUM(IFNULL(PurchaseInvoiceD.ProductQty, 0) * IFNULL(PurchaseInvoiceD.ProductSellPrice, 0)) AS GrandTotal, \n"),RemoteObject.createImmutable("                         ProductsInformation.ProductName\n"),RemoteObject.createImmutable("FROM            PurchaseInvoiceD LEFT OUTER JOIN\n"),RemoteObject.createImmutable("                         ProductsInformation ON PurchaseInvoiceD.ProductID = ProductsInformation.ProductID\n"),RemoteObject.createImmutable("GROUP BY ProductsInformation.ProductName\n"),RemoteObject.createImmutable("order by ProductQty desc")))));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 122;BA.debugLine="Dim str As String = \"\"";
Debug.ShouldStop(33554432);
_str = BA.ObjectToString("");Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 123;BA.debugLine="str = $\" <table id=\"vgt-table\" class=\"order-tabl";
Debug.ShouldStop(67108864);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" <table id=\"vgt-table\" class=\"order-table vgt-table \">\n"),RemoteObject.createImmutable("                     <colgroup>\n"),RemoteObject.createImmutable("                        <col id=\"col-0\">\n"),RemoteObject.createImmutable("                        <col id=\"col-1\">\n"),RemoteObject.createImmutable("                        <col id=\"col-2\">\n"),RemoteObject.createImmutable("                     </colgroup>\n"),RemoteObject.createImmutable("                     <thead>\n"),RemoteObject.createImmutable("                        <tr>\n"),RemoteObject.createImmutable("                           <!----> <!----> \n"),RemoteObject.createImmutable("                           <th scope=\"col\" aria-sort=\"descending\" aria-controls=\"col-0\" class=\"vgt-left-align text-left\" style=\"min-width: auto; width: auto;\">\n"),RemoteObject.createImmutable("                              <span>Producto</span> <!---->\n"),RemoteObject.createImmutable("                           </th>\n"),RemoteObject.createImmutable("                           <th scope=\"col\" aria-sort=\"descending\" aria-controls=\"col-1\" class=\"vgt-left-align text-left\" style=\"min-width: auto; width: auto;\">\n"),RemoteObject.createImmutable("                              <span>Cantidad</span> <!---->\n"),RemoteObject.createImmutable("                           </th>\n"),RemoteObject.createImmutable("                           <th scope=\"col\" aria-sort=\"descending\" aria-controls=\"col-2\" class=\"vgt-left-align text-left\" style=\"min-width: auto; width: auto;\">\n"),RemoteObject.createImmutable("                              <span>Total</span> <!---->\n"),RemoteObject.createImmutable("                           </th>\n"),RemoteObject.createImmutable("                        </tr>\n"),RemoteObject.createImmutable("                        <!---->\n"),RemoteObject.createImmutable("                     </thead>\n"),RemoteObject.createImmutable("                     <tbody>")));Debug.locals.put("str", _str);
 BA.debugLineNum = 146;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(131072);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 147;BA.debugLine="str = str & $\" <!---->";
Debug.ShouldStop(262144);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" <!----> \n"),RemoteObject.createImmutable("                        <tr class=\" text-left\">\n"),RemoteObject.createImmutable("                           <!----> <!----> \n"),RemoteObject.createImmutable("                           <td class=\"vgt-left-align text-left\"><span>\n"),RemoteObject.createImmutable("                              "),dashboard.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductName")))))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("                              </span>\n"),RemoteObject.createImmutable("                           </td>\n"),RemoteObject.createImmutable("                           <td class=\"vgt-left-align text-left\">\n"),RemoteObject.createImmutable("                              <div><span> "),dashboard.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductQty")))))),RemoteObject.createImmutable(" pc</span></div>\n"),RemoteObject.createImmutable("                           </td>\n"),RemoteObject.createImmutable("                           <td class=\"vgt-left-align text-left\">\n"),RemoteObject.createImmutable("                              <div><span> "),dashboard.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("GrandTotal")))))),RemoteObject.createImmutable(" L</span></div>\n"),RemoteObject.createImmutable("                           </td>\n"),RemoteObject.createImmutable("                        </tr>"))));Debug.locals.put("str", _str);
 }
;
 BA.debugLineNum = 162;BA.debugLine="rs.Close";
Debug.ShouldStop(2);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 164;BA.debugLine="str = str & $\"                        </tbody>";
Debug.ShouldStop(8);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable("  \n"),RemoteObject.createImmutable("                     </tbody>\n"),RemoteObject.createImmutable("                     <!---->\n"),RemoteObject.createImmutable("                  </table>"))));Debug.locals.put("str", _str);
 BA.debugLineNum = 168;BA.debugLine="divtopsellingproducts.SetHtml(str)";
Debug.ShouldStop(128);
__ref.getField(false,"_divtopsellingproducts" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_str));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e13.toString()); BA.debugLineNum = 171;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
dashboard.__c.runVoidMethod ("LogImpl","23997756",BA.ObjectToString(dashboard.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_userstranshistory(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_UsersTransHistory (dashboard) ","dashboard",5,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("load_userstranshistory")) { return __ref.runUserSub(false, "dashboard","load_userstranshistory", __ref);}
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 80;BA.debugLine="Sub Load_UsersTransHistory";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 83;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(262144);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 84;BA.debugLine="rs = sql1.ExecQuery(\"SELECT UsersLogs.UserLogID,";
Debug.ShouldStop(524288);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT UsersLogs.UserLogID, UsersLogs.UserID, UsersLogs.ActivityDesc, UsersLogs.ActivityDatetime, UsersInformation.UserFullName "),RemoteObject.createImmutable(" FROM            UsersLogs LEFT OUTER JOIN "),RemoteObject.createImmutable(" UsersInformation ON UsersLogs.UserID = UsersInformation.UserID order by UsersLogs.UserLogID desc limit 5"))));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 87;BA.debugLine="Dim str As String = \"\"";
Debug.ShouldStop(4194304);
_str = BA.ObjectToString("");Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 88;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(8388608);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 89;BA.debugLine="str = str & $\"<tr>";
Debug.ShouldStop(16777216);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable("<tr>\n"),RemoteObject.createImmutable("                      \n"),RemoteObject.createImmutable("                      <td>\n"),RemoteObject.createImmutable("                        <a href=\"#\" class=\"tx-inverse tx-14 tx-medium d-block\">"),dashboard.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("UserFullName")))))),RemoteObject.createImmutable("</a>\n"),RemoteObject.createImmutable("                        <span class=\"tx-11 d-block\">TRANSID: "),dashboard.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("UserLogID")))))),RemoteObject.createImmutable("</span>\n"),RemoteObject.createImmutable("                      </td>\n"),RemoteObject.createImmutable("                      <td class=\"tx-12\">\n"),RemoteObject.createImmutable("                        <span class=\"square-8 bg-success mg-r-5 rounded-circle\"></span> "),dashboard.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ActivityDesc")))))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("                      </td>\n"),RemoteObject.createImmutable("                      <td>"),dashboard.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ActivityDatetime")))))),RemoteObject.createImmutable("</td>\n"),RemoteObject.createImmutable("                    </tr>"))));Debug.locals.put("str", _str);
 }
;
 BA.debugLineNum = 101;BA.debugLine="rs.Close";
Debug.ShouldStop(16);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 103;BA.debugLine="divuserstrans.SetHtml(str)";
Debug.ShouldStop(64);
__ref.getField(false,"_divuserstrans" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_str));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 106;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
dashboard.__c.runVoidMethod ("LogImpl","23932186",BA.ObjectToString(dashboard.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 108;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("WebSocket_Connected (dashboard) ","dashboard",5,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "dashboard","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 19;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(524288);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 21;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
Debug.ShouldStop(1048576);
dashboard._main.runVoidMethod ("_validateusers" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblusernamemain" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_divmenu" /*RemoteObject*/ )));
 BA.debugLineNum = 23;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(4194304);
__ref.setField ("_sql1" /*RemoteObject*/ ,dashboard._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 26;BA.debugLine="Create_Top_Dashboard";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.dashboard.class, "_create_top_dashboard" /*RemoteObject*/ );
 BA.debugLineNum = 28;BA.debugLine="Load_TopSellingProducts";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.dashboard.class, "_load_topsellingproducts" /*RemoteObject*/ );
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("WebSocket_Disconnected (dashboard) ","dashboard",5,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "dashboard","websocket_disconnected", __ref);}
 BA.debugLineNum = 31;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="If sql1.IsInitialized Then";
Debug.ShouldStop(-2147483648);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 33;BA.debugLine="sql1.Close";
Debug.ShouldStop(1);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
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
}