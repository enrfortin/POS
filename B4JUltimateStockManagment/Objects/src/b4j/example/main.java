package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends Object{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4a.StandardBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) throws Exception{
        try {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            ba.raiseEvent(null, "appstart", (Object)args);
        } catch (Throwable t) {
			BA.printException(t, true);
		
        } finally {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program terminated (StartMessageLoop was not called).");
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.object.ServerWrapper _srvr = null;
public static anywheresoftware.b4j.object.ConnectionPool _pool = null;
public static String  _appstart(String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_args}));}
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Args() As String)";
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="pool.Initialize(\"com.mysql.cj.jdbc.Driver\",\"jdbc:";
_pool.Initialize("com.mysql.cj.jdbc.Driver","jdbc:mysql://localhost/B4JStockPOS?characterEncoding=utf8","root","");
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="srvr.Initialize(\"srvr\")";
_srvr.Initialize(ba,"srvr");
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="srvr.Port = 17178";
_srvr.setPort((int) (17178));
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="srvr.StaticFilesFolder = File.Combine(File.DirApp";
_srvr.setStaticFilesFolder(anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"www"));
RDebugUtils.currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="srvr.AddWebSocket(\"/PagePOS\", \"PagePOS\")";
_srvr.AddWebSocket("/PagePOS","PagePOS");
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="srvr.AddWebSocket(\"/CurrenciesInformation\", \"Curr";
_srvr.AddWebSocket("/CurrenciesInformation","CurrenciesInformation");
RDebugUtils.currentLine=65546;
 //BA.debugLineNum = 65546;BA.debugLine="srvr.AddWebSocket(\"/AddCurrenciesInformation\", \"A";
_srvr.AddWebSocket("/AddCurrenciesInformation","AddCurrenciesInformation");
RDebugUtils.currentLine=65548;
 //BA.debugLineNum = 65548;BA.debugLine="srvr.AddWebSocket(\"/CustomersInformation\", \"Custo";
_srvr.AddWebSocket("/CustomersInformation","CustomersInformation");
RDebugUtils.currentLine=65549;
 //BA.debugLineNum = 65549;BA.debugLine="srvr.AddWebSocket(\"/AddCustomersInformation\", \"Ad";
_srvr.AddWebSocket("/AddCustomersInformation","AddCustomersInformation");
RDebugUtils.currentLine=65551;
 //BA.debugLineNum = 65551;BA.debugLine="srvr.AddWebSocket(\"/SupplierInformation\", \"Suppli";
_srvr.AddWebSocket("/SupplierInformation","SupplierInformation");
RDebugUtils.currentLine=65552;
 //BA.debugLineNum = 65552;BA.debugLine="srvr.AddWebSocket(\"/AddSupplierInformation\", \"Add";
_srvr.AddWebSocket("/AddSupplierInformation","AddSupplierInformation");
RDebugUtils.currentLine=65555;
 //BA.debugLineNum = 65555;BA.debugLine="srvr.AddWebSocket(\"/ProductsInformation\", \"Produc";
_srvr.AddWebSocket("/ProductsInformation","ProductsInformation");
RDebugUtils.currentLine=65556;
 //BA.debugLineNum = 65556;BA.debugLine="srvr.AddWebSocket(\"/AddProductsInformation\", \"Add";
_srvr.AddWebSocket("/AddProductsInformation","AddProductsInformation");
RDebugUtils.currentLine=65558;
 //BA.debugLineNum = 65558;BA.debugLine="srvr.AddWebSocket(\"/UsersInformation\", \"UsersInfo";
_srvr.AddWebSocket("/UsersInformation","UsersInformation");
RDebugUtils.currentLine=65559;
 //BA.debugLineNum = 65559;BA.debugLine="srvr.AddWebSocket(\"/AddUsersInformation\", \"AddUse";
_srvr.AddWebSocket("/AddUsersInformation","AddUsersInformation");
RDebugUtils.currentLine=65561;
 //BA.debugLineNum = 65561;BA.debugLine="srvr.AddWebSocket(\"/CatsInformation\", \"CatsInform";
_srvr.AddWebSocket("/CatsInformation","CatsInformation");
RDebugUtils.currentLine=65562;
 //BA.debugLineNum = 65562;BA.debugLine="srvr.AddWebSocket(\"/AddCatInfo\", \"AddCatInfo\")";
_srvr.AddWebSocket("/AddCatInfo","AddCatInfo");
RDebugUtils.currentLine=65565;
 //BA.debugLineNum = 65565;BA.debugLine="srvr.AddWebSocket(\"/WarehouseInformation\", \"Wareh";
_srvr.AddWebSocket("/WarehouseInformation","WarehouseInformation");
RDebugUtils.currentLine=65566;
 //BA.debugLineNum = 65566;BA.debugLine="srvr.AddWebSocket(\"/AddWarehouseInfo\", \"AddWareho";
_srvr.AddWebSocket("/AddWarehouseInfo","AddWarehouseInfo");
RDebugUtils.currentLine=65569;
 //BA.debugLineNum = 65569;BA.debugLine="srvr.AddWebSocket(\"/SalesInformation\", \"SalesInfo";
_srvr.AddWebSocket("/SalesInformation","SalesInformation");
RDebugUtils.currentLine=65570;
 //BA.debugLineNum = 65570;BA.debugLine="srvr.AddWebSocket(\"/AddSalesInfo\", \"AddSalesInfo\"";
_srvr.AddWebSocket("/AddSalesInfo","AddSalesInfo");
RDebugUtils.currentLine=65573;
 //BA.debugLineNum = 65573;BA.debugLine="srvr.AddWebSocket(\"/TransferInformation\", \"Transf";
_srvr.AddWebSocket("/TransferInformation","TransferInformation");
RDebugUtils.currentLine=65574;
 //BA.debugLineNum = 65574;BA.debugLine="srvr.AddWebSocket(\"/AddTransferInfo\", \"AddTransfe";
_srvr.AddWebSocket("/AddTransferInfo","AddTransferInfo");
RDebugUtils.currentLine=65577;
 //BA.debugLineNum = 65577;BA.debugLine="srvr.AddWebSocket(\"/PurchaseInformation\", \"Purcha";
_srvr.AddWebSocket("/PurchaseInformation","PurchaseInformation");
RDebugUtils.currentLine=65578;
 //BA.debugLineNum = 65578;BA.debugLine="srvr.AddWebSocket(\"/AddPurchaseInfo\", \"AddPurchas";
_srvr.AddWebSocket("/AddPurchaseInfo","AddPurchaseInfo");
RDebugUtils.currentLine=65581;
 //BA.debugLineNum = 65581;BA.debugLine="srvr.AddWebSocket(\"/ReturnPurchaseInformation\", \"";
_srvr.AddWebSocket("/ReturnPurchaseInformation","ReturnPurchaseInformation");
RDebugUtils.currentLine=65582;
 //BA.debugLineNum = 65582;BA.debugLine="srvr.AddWebSocket(\"/AddReturnPurchaseInfo\", \"AddR";
_srvr.AddWebSocket("/AddReturnPurchaseInfo","AddReturnPurchaseInfo");
RDebugUtils.currentLine=65585;
 //BA.debugLineNum = 65585;BA.debugLine="srvr.AddWebSocket(\"/AdjusmentInformation\", \"Adjus";
_srvr.AddWebSocket("/AdjusmentInformation","AdjusmentInformation");
RDebugUtils.currentLine=65586;
 //BA.debugLineNum = 65586;BA.debugLine="srvr.AddWebSocket(\"/AddAdjustInfo\", \"AddAdjustInf";
_srvr.AddWebSocket("/AddAdjustInfo","AddAdjustInfo");
RDebugUtils.currentLine=65588;
 //BA.debugLineNum = 65588;BA.debugLine="srvr.AddWebSocket(\"/ExpensesInformation\", \"Expens";
_srvr.AddWebSocket("/ExpensesInformation","ExpensesInformation");
RDebugUtils.currentLine=65589;
 //BA.debugLineNum = 65589;BA.debugLine="srvr.AddWebSocket(\"/AddExpensesInfo\", \"AddExpense";
_srvr.AddWebSocket("/AddExpensesInfo","AddExpensesInfo");
RDebugUtils.currentLine=65591;
 //BA.debugLineNum = 65591;BA.debugLine="srvr.AddWebSocket(\"/CreateBarcode\", \"CreateBarcod";
_srvr.AddWebSocket("/CreateBarcode","CreateBarcode");
RDebugUtils.currentLine=65593;
 //BA.debugLineNum = 65593;BA.debugLine="srvr.AddWebSocket(\"/Login\", \"Login\")";
_srvr.AddWebSocket("/Login","Login");
RDebugUtils.currentLine=65595;
 //BA.debugLineNum = 65595;BA.debugLine="srvr.AddWebSocket(\"/Dashboard\", \"Dashboard\")";
_srvr.AddWebSocket("/Dashboard","Dashboard");
RDebugUtils.currentLine=65597;
 //BA.debugLineNum = 65597;BA.debugLine="srvr.AddFilter(\"/b4j_ws.js\", \"SessionCreator\", Fa";
_srvr.AddFilter("/b4j_ws.js","SessionCreator",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65599;
 //BA.debugLineNum = 65599;BA.debugLine="srvr.Start";
_srvr.Start();
RDebugUtils.currentLine=65600;
 //BA.debugLineNum = 65600;BA.debugLine="StartMessageLoop";
anywheresoftware.b4a.keywords.Common.StartMessageLoop(ba);
RDebugUtils.currentLine=65605;
 //BA.debugLineNum = 65605;BA.debugLine="End Sub";
return "";
}
public static String  _insert_userslogs(anywheresoftware.b4j.object.WebSocket _ws,String _activitydesc) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "insert_userslogs", false))
	 {return ((String) Debug.delegate(ba, "insert_userslogs", new Object[] {_ws,_activitydesc}));}
String _activitydatetime = "";
anywheresoftware.b4j.objects.SQL _sql1 = null;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Public Sub Insert_UsersLogs(ws As WebSocket,Activi";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Try";
try {RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Dim ActivityDatetime As String";
_activitydatetime = "";
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="ActivityDatetime = DateTime.Date(DateTime.Now) &";
_activitydatetime = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow())+" "+anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="Dim sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="sql1 = pool.GetConnection";
_sql1 = _pool.GetConnection();
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="sql1.BeginTransaction";
_sql1.BeginTransaction();
RDebugUtils.currentLine=196617;
 //BA.debugLineNum = 196617;BA.debugLine="sql1.ExecNonQuery2(\"insert into UsersLogs (UserI";
_sql1.ExecNonQuery2("insert into UsersLogs (UserID,ActivityDesc,ActivityDatetime) values (?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_ws.getSession().GetAttribute("UserID"),(Object)(_activitydesc),(Object)(_activitydatetime)}));
RDebugUtils.currentLine=196619;
 //BA.debugLineNum = 196619;BA.debugLine="sql1.TransactionSuccessful";
_sql1.TransactionSuccessful();
RDebugUtils.currentLine=196621;
 //BA.debugLineNum = 196621;BA.debugLine="sql1.Close";
_sql1.Close();
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=196624;
 //BA.debugLineNum = 196624;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("2196624",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
RDebugUtils.currentLine=196626;
 //BA.debugLineNum = 196626;BA.debugLine="End Sub";
return "";
}
public static String  _validateusers(anywheresoftware.b4j.object.WebSocket _ws,anywheresoftware.b4j.object.WebSocket.JQueryElement _lblusernamemain,anywheresoftware.b4j.object.WebSocket.JQueryElement _divmenu) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "validateusers", false))
	 {return ((String) Debug.delegate(ba, "validateusers", new Object[] {_ws,_lblusernamemain,_divmenu}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="public Sub ValidateUsers(ws As WebSocket,lbluserna";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Try";
try {RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="If ws.Session.GetAttribute(\"UserID\") = Null Or 0";
if (_ws.getSession().GetAttribute("UserID")== null || 0==(double)(BA.ObjectToNumber(_ws.getSession().GetAttribute("UserID")))) { 
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="ws.Eval(\"document.location.replace('login.html";
_ws.Eval("document.location.replace('login.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
 }else {
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="lblusernamemain.SetHtml(ws.Session.GetAttribute";
_lblusernamemain.SetHtml(BA.ObjectToString(_ws.getSession().GetAttribute("UserFullName")));
 };
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("2131082",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="End Sub";
return "";
}
}