package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,17);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _args);}
Debug.locals.put("Args", _args);
 BA.debugLineNum = 17;BA.debugLine="Sub AppStart (Args() As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 19;BA.debugLine="pool.Initialize(\"com.mysql.cj.jdbc.Driver\",\"jdbc:";
Debug.ShouldStop(262144);
main._pool.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("com.mysql.cj.jdbc.Driver")),(Object)(BA.ObjectToString("jdbc:mysql://localhost/B4JStockPOS?characterEncoding=utf8")),(Object)(BA.ObjectToString("root")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 21;BA.debugLine="srvr.Initialize(\"srvr\")";
Debug.ShouldStop(1048576);
main._srvr.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("srvr")));
 BA.debugLineNum = 22;BA.debugLine="srvr.Port = 17178";
Debug.ShouldStop(2097152);
main._srvr.runMethod(true,"setPort",BA.numberCast(int.class, 17178));
 BA.debugLineNum = 23;BA.debugLine="srvr.StaticFilesFolder = File.Combine(File.DirApp";
Debug.ShouldStop(4194304);
main._srvr.runMethod(true,"setStaticFilesFolder",main.__c.getField(false,"File").runMethod(true,"Combine",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("www"))));
 BA.debugLineNum = 24;BA.debugLine="srvr.AddWebSocket(\"/PagePOS\", \"PagePOS\")";
Debug.ShouldStop(8388608);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/PagePOS")),(Object)(RemoteObject.createImmutable("PagePOS")));
 BA.debugLineNum = 26;BA.debugLine="srvr.AddWebSocket(\"/CurrenciesInformation\", \"Curr";
Debug.ShouldStop(33554432);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/CurrenciesInformation")),(Object)(RemoteObject.createImmutable("CurrenciesInformation")));
 BA.debugLineNum = 27;BA.debugLine="srvr.AddWebSocket(\"/AddCurrenciesInformation\", \"A";
Debug.ShouldStop(67108864);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/AddCurrenciesInformation")),(Object)(RemoteObject.createImmutable("AddCurrenciesInformation")));
 BA.debugLineNum = 29;BA.debugLine="srvr.AddWebSocket(\"/CustomersInformation\", \"Custo";
Debug.ShouldStop(268435456);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/CustomersInformation")),(Object)(RemoteObject.createImmutable("CustomersInformation")));
 BA.debugLineNum = 30;BA.debugLine="srvr.AddWebSocket(\"/AddCustomersInformation\", \"Ad";
Debug.ShouldStop(536870912);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/AddCustomersInformation")),(Object)(RemoteObject.createImmutable("AddCustomersInformation")));
 BA.debugLineNum = 32;BA.debugLine="srvr.AddWebSocket(\"/SupplierInformation\", \"Suppli";
Debug.ShouldStop(-2147483648);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/SupplierInformation")),(Object)(RemoteObject.createImmutable("SupplierInformation")));
 BA.debugLineNum = 33;BA.debugLine="srvr.AddWebSocket(\"/AddSupplierInformation\", \"Add";
Debug.ShouldStop(1);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/AddSupplierInformation")),(Object)(RemoteObject.createImmutable("AddSupplierInformation")));
 BA.debugLineNum = 36;BA.debugLine="srvr.AddWebSocket(\"/ProductsInformation\", \"Produc";
Debug.ShouldStop(8);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/ProductsInformation")),(Object)(RemoteObject.createImmutable("ProductsInformation")));
 BA.debugLineNum = 37;BA.debugLine="srvr.AddWebSocket(\"/AddProductsInformation\", \"Add";
Debug.ShouldStop(16);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/AddProductsInformation")),(Object)(RemoteObject.createImmutable("AddProductsInformation")));
 BA.debugLineNum = 39;BA.debugLine="srvr.AddWebSocket(\"/UsersInformation\", \"UsersInfo";
Debug.ShouldStop(64);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/UsersInformation")),(Object)(RemoteObject.createImmutable("UsersInformation")));
 BA.debugLineNum = 40;BA.debugLine="srvr.AddWebSocket(\"/AddUsersInformation\", \"AddUse";
Debug.ShouldStop(128);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/AddUsersInformation")),(Object)(RemoteObject.createImmutable("AddUsersInformation")));
 BA.debugLineNum = 42;BA.debugLine="srvr.AddWebSocket(\"/CatsInformation\", \"CatsInform";
Debug.ShouldStop(512);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/CatsInformation")),(Object)(RemoteObject.createImmutable("CatsInformation")));
 BA.debugLineNum = 43;BA.debugLine="srvr.AddWebSocket(\"/AddCatInfo\", \"AddCatInfo\")";
Debug.ShouldStop(1024);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/AddCatInfo")),(Object)(RemoteObject.createImmutable("AddCatInfo")));
 BA.debugLineNum = 46;BA.debugLine="srvr.AddWebSocket(\"/WarehouseInformation\", \"Wareh";
Debug.ShouldStop(8192);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/WarehouseInformation")),(Object)(RemoteObject.createImmutable("WarehouseInformation")));
 BA.debugLineNum = 47;BA.debugLine="srvr.AddWebSocket(\"/AddWarehouseInfo\", \"AddWareho";
Debug.ShouldStop(16384);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/AddWarehouseInfo")),(Object)(RemoteObject.createImmutable("AddWarehouseInfo")));
 BA.debugLineNum = 50;BA.debugLine="srvr.AddWebSocket(\"/SalesInformation\", \"SalesInfo";
Debug.ShouldStop(131072);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/SalesInformation")),(Object)(RemoteObject.createImmutable("SalesInformation")));
 BA.debugLineNum = 51;BA.debugLine="srvr.AddWebSocket(\"/AddSalesInfo\", \"AddSalesInfo\"";
Debug.ShouldStop(262144);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/AddSalesInfo")),(Object)(RemoteObject.createImmutable("AddSalesInfo")));
 BA.debugLineNum = 54;BA.debugLine="srvr.AddWebSocket(\"/TransferInformation\", \"Transf";
Debug.ShouldStop(2097152);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/TransferInformation")),(Object)(RemoteObject.createImmutable("TransferInformation")));
 BA.debugLineNum = 55;BA.debugLine="srvr.AddWebSocket(\"/AddTransferInfo\", \"AddTransfe";
Debug.ShouldStop(4194304);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/AddTransferInfo")),(Object)(RemoteObject.createImmutable("AddTransferInfo")));
 BA.debugLineNum = 58;BA.debugLine="srvr.AddWebSocket(\"/PurchaseInformation\", \"Purcha";
Debug.ShouldStop(33554432);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/PurchaseInformation")),(Object)(RemoteObject.createImmutable("PurchaseInformation")));
 BA.debugLineNum = 59;BA.debugLine="srvr.AddWebSocket(\"/AddPurchaseInfo\", \"AddPurchas";
Debug.ShouldStop(67108864);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/AddPurchaseInfo")),(Object)(RemoteObject.createImmutable("AddPurchaseInfo")));
 BA.debugLineNum = 62;BA.debugLine="srvr.AddWebSocket(\"/ReturnPurchaseInformation\", \"";
Debug.ShouldStop(536870912);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/ReturnPurchaseInformation")),(Object)(RemoteObject.createImmutable("ReturnPurchaseInformation")));
 BA.debugLineNum = 63;BA.debugLine="srvr.AddWebSocket(\"/AddReturnPurchaseInfo\", \"AddR";
Debug.ShouldStop(1073741824);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/AddReturnPurchaseInfo")),(Object)(RemoteObject.createImmutable("AddReturnPurchaseInfo")));
 BA.debugLineNum = 66;BA.debugLine="srvr.AddWebSocket(\"/AdjusmentInformation\", \"Adjus";
Debug.ShouldStop(2);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/AdjusmentInformation")),(Object)(RemoteObject.createImmutable("AdjusmentInformation")));
 BA.debugLineNum = 67;BA.debugLine="srvr.AddWebSocket(\"/AddAdjustInfo\", \"AddAdjustInf";
Debug.ShouldStop(4);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/AddAdjustInfo")),(Object)(RemoteObject.createImmutable("AddAdjustInfo")));
 BA.debugLineNum = 69;BA.debugLine="srvr.AddWebSocket(\"/ExpensesInformation\", \"Expens";
Debug.ShouldStop(16);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/ExpensesInformation")),(Object)(RemoteObject.createImmutable("ExpensesInformation")));
 BA.debugLineNum = 70;BA.debugLine="srvr.AddWebSocket(\"/AddExpensesInfo\", \"AddExpense";
Debug.ShouldStop(32);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/AddExpensesInfo")),(Object)(RemoteObject.createImmutable("AddExpensesInfo")));
 BA.debugLineNum = 72;BA.debugLine="srvr.AddWebSocket(\"/CreateBarcode\", \"CreateBarcod";
Debug.ShouldStop(128);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/CreateBarcode")),(Object)(RemoteObject.createImmutable("CreateBarcode")));
 BA.debugLineNum = 74;BA.debugLine="srvr.AddWebSocket(\"/Login\", \"Login\")";
Debug.ShouldStop(512);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/Login")),(Object)(RemoteObject.createImmutable("Login")));
 BA.debugLineNum = 76;BA.debugLine="srvr.AddWebSocket(\"/Dashboard\", \"Dashboard\")";
Debug.ShouldStop(2048);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/Dashboard")),(Object)(RemoteObject.createImmutable("Dashboard")));
 BA.debugLineNum = 78;BA.debugLine="srvr.AddFilter(\"/b4j_ws.js\", \"SessionCreator\", Fa";
Debug.ShouldStop(8192);
main._srvr.runVoidMethod ("AddFilter",(Object)(BA.ObjectToString("/b4j_ws.js")),(Object)(BA.ObjectToString("SessionCreator")),(Object)(main.__c.getField(true,"False")));
 BA.debugLineNum = 80;BA.debugLine="srvr.Start";
Debug.ShouldStop(32768);
main._srvr.runVoidMethod ("Start");
 BA.debugLineNum = 81;BA.debugLine="StartMessageLoop";
Debug.ShouldStop(65536);
main.__c.runVoidMethod ("StartMessageLoop",main.ba);
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insert_userslogs(RemoteObject _ws,RemoteObject _activitydesc) throws Exception{
try {
		Debug.PushSubsStack("Insert_UsersLogs (main) ","main",0,main.ba,main.mostCurrent,102);
if (RapidSub.canDelegate("insert_userslogs")) { return b4j.example.main.remoteMe.runUserSub(false, "main","insert_userslogs", _ws, _activitydesc);}
RemoteObject _activitydatetime = RemoteObject.createImmutable("");
RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
Debug.locals.put("ws", _ws);
Debug.locals.put("ActivityDesc", _activitydesc);
 BA.debugLineNum = 102;BA.debugLine="Public Sub Insert_UsersLogs(ws As WebSocket,Activi";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 104;BA.debugLine="Dim ActivityDatetime As String";
Debug.ShouldStop(128);
_activitydatetime = RemoteObject.createImmutable("");Debug.locals.put("ActivityDatetime", _activitydatetime);
 BA.debugLineNum = 105;BA.debugLine="ActivityDatetime = DateTime.Date(DateTime.Now) &";
Debug.ShouldStop(256);
_activitydatetime = RemoteObject.concat(main.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow"))),RemoteObject.createImmutable(" "),main.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow"))));Debug.locals.put("ActivityDatetime", _activitydatetime);
 BA.debugLineNum = 107;BA.debugLine="Dim sql1 As SQL";
Debug.ShouldStop(1024);
_sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");Debug.locals.put("sql1", _sql1);
 BA.debugLineNum = 108;BA.debugLine="sql1 = pool.GetConnection";
Debug.ShouldStop(2048);
_sql1 = main._pool.runMethod(false,"GetConnection");Debug.locals.put("sql1", _sql1);
 BA.debugLineNum = 110;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(8192);
_sql1.runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 111;BA.debugLine="sql1.ExecNonQuery2(\"insert into UsersLogs (UserI";
Debug.ShouldStop(16384);
_sql1.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("insert into UsersLogs (UserID,ActivityDesc,ActivityDatetime) values (?,?,?)")),(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {_ws.runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("UserID"))),(_activitydesc),(_activitydatetime)})))));
 BA.debugLineNum = 113;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(65536);
_sql1.runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 115;BA.debugLine="sql1.Close";
Debug.ShouldStop(262144);
_sql1.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e11.toString()); BA.debugLineNum = 118;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
main.__c.runVoidMethod ("LogImpl","2196624",BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba)),0);
 };
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
pagepos.myClass = BA.getDeviceClass ("b4j.example.pagepos");
productsinformation.myClass = BA.getDeviceClass ("b4j.example.productsinformation");
addproductsinformation.myClass = BA.getDeviceClass ("b4j.example.addproductsinformation");
customersinformation.myClass = BA.getDeviceClass ("b4j.example.customersinformation");
dashboard.myClass = BA.getDeviceClass ("b4j.example.dashboard");
addadjustinfo.myClass = BA.getDeviceClass ("b4j.example.addadjustinfo");
login.myClass = BA.getDeviceClass ("b4j.example.login");
warehouseinformation.myClass = BA.getDeviceClass ("b4j.example.warehouseinformation");
addcatinfo.myClass = BA.getDeviceClass ("b4j.example.addcatinfo");
addcurrenciesinformation.myClass = BA.getDeviceClass ("b4j.example.addcurrenciesinformation");
addcustomersinformation.myClass = BA.getDeviceClass ("b4j.example.addcustomersinformation");
addexpensesinfo.myClass = BA.getDeviceClass ("b4j.example.addexpensesinfo");
addpurchaseinfo.myClass = BA.getDeviceClass ("b4j.example.addpurchaseinfo");
addreturnpurchaseinfo.myClass = BA.getDeviceClass ("b4j.example.addreturnpurchaseinfo");
addreturnsalesinfo.myClass = BA.getDeviceClass ("b4j.example.addreturnsalesinfo");
addsalesinfo.myClass = BA.getDeviceClass ("b4j.example.addsalesinfo");
addsupplierinformation.myClass = BA.getDeviceClass ("b4j.example.addsupplierinformation");
addtransferinfo.myClass = BA.getDeviceClass ("b4j.example.addtransferinfo");
addusersinformation.myClass = BA.getDeviceClass ("b4j.example.addusersinformation");
addwarehouseinfo.myClass = BA.getDeviceClass ("b4j.example.addwarehouseinfo");
adjusmentinformation.myClass = BA.getDeviceClass ("b4j.example.adjusmentinformation");
catsinformation.myClass = BA.getDeviceClass ("b4j.example.catsinformation");
clstblsoldproducts.myClass = BA.getDeviceClass ("b4j.example.clstblsoldproducts");
clstempproducts.myClass = BA.getDeviceClass ("b4j.example.clstempproducts");
createbarcode.myClass = BA.getDeviceClass ("b4j.example.createbarcode");
currenciesinformation.myClass = BA.getDeviceClass ("b4j.example.currenciesinformation");
expensesinformation.myClass = BA.getDeviceClass ("b4j.example.expensesinformation");
purchaseinformation.myClass = BA.getDeviceClass ("b4j.example.purchaseinformation");
returnpurchaseinformation.myClass = BA.getDeviceClass ("b4j.example.returnpurchaseinformation");
returnsalesinformation.myClass = BA.getDeviceClass ("b4j.example.returnsalesinformation");
salesinformation.myClass = BA.getDeviceClass ("b4j.example.salesinformation");
sessioncreator.myClass = BA.getDeviceClass ("b4j.example.sessioncreator");
supplierinformation.myClass = BA.getDeviceClass ("b4j.example.supplierinformation");
transferinformation.myClass = BA.getDeviceClass ("b4j.example.transferinformation");
usersinformation.myClass = BA.getDeviceClass ("b4j.example.usersinformation");
userslogsinformation.myClass = BA.getDeviceClass ("b4j.example.userslogsinformation");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private srvr As Server";
main._srvr = RemoteObject.createNew ("anywheresoftware.b4j.object.ServerWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Public pool As ConnectionPool";
main._pool = RemoteObject.createNew ("anywheresoftware.b4j.object.ConnectionPool");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _validateusers(RemoteObject _ws,RemoteObject _lblusernamemain,RemoteObject _divmenu) throws Exception{
try {
		Debug.PushSubsStack("ValidateUsers (main) ","main",0,main.ba,main.mostCurrent,88);
if (RapidSub.canDelegate("validateusers")) { return b4j.example.main.remoteMe.runUserSub(false, "main","validateusers", _ws, _lblusernamemain, _divmenu);}
Debug.locals.put("ws", _ws);
Debug.locals.put("lblusernamemain", _lblusernamemain);
Debug.locals.put("divMenu", _divmenu);
 BA.debugLineNum = 88;BA.debugLine="public Sub ValidateUsers(ws As WebSocket,lbluserna";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 90;BA.debugLine="If ws.Session.GetAttribute(\"UserID\") = Null Or 0";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("n",_ws.runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("UserID")))) || RemoteObject.solveBoolean("=",RemoteObject.createImmutable(0),BA.numberCast(double.class, _ws.runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("UserID")))))) { 
 BA.debugLineNum = 92;BA.debugLine="ws.Eval(\"document.location.replace('login.html";
Debug.ShouldStop(134217728);
_ws.runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('login.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), main.__c.getField(false,"Null")));
 }else {
 BA.debugLineNum = 94;BA.debugLine="lblusernamemain.SetHtml(ws.Session.GetAttribute";
Debug.ShouldStop(536870912);
_lblusernamemain.runVoidMethod ("SetHtml",(Object)(BA.ObjectToString(_ws.runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("UserFullName"))))));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e8.toString()); BA.debugLineNum = 98;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
main.__c.runVoidMethod ("LogImpl","2131082",BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba)),0);
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
}