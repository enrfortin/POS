package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class dashboard extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.dashboard", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.dashboard.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.WebSocket _ws = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divuserstrans = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divtopcustomers = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblusernamemain = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divmenu = null;
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lbltotalsales = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lbltotaltax = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lbltotalexpenses = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lbltotalreturns = null;
public float _dbltotalinv = 0f;
public float _dbltotalreturninv = 0f;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divtopsellingproducts = null;
public b4j.example.main _main = null;
public String  _class_globals(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="Private divuserstrans,divtopcustomers As JQueryEl";
_divuserstrans = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_divtopcustomers = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="Private lbltotalsales,lbltotaltax,lbltotalexpense";
_lbltotalsales = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_lbltotaltax = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_lbltotalexpenses = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_lbltotalreturns = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="Dim dblTotalInv,dblTotalReturnInv As Float";
_dbltotalinv = 0f;
_dbltotalreturninv = 0f;
RDebugUtils.currentLine=3604489;
 //BA.debugLineNum = 3604489;BA.debugLine="Private divtopsellingproducts As JQueryElement";
_divtopsellingproducts = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=3604491;
 //BA.debugLineNum = 3604491;BA.debugLine="End Sub";
return "";
}
public String  _create_top_dashboard(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "create_top_dashboard", false))
	 {return ((String) Debug.delegate(ba, "create_top_dashboard", null));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
float _ftotal = 0f;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub Create_Top_Dashboard";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="Try";
try {RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="rs = sql1.ExecQuery(\"select ifnull(sum(InvTotal)";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select ifnull(sum(InvTotal),0) as InvTotal from SalesInvoiceH");
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="Dim fTotal As Float = rs.GetString(\"InvTotal\")";
_ftotal = (float)(Double.parseDouble(_rs.GetString("InvTotal")));
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="lbltotalsales.SetHtml(NumberFormat(fTotal,0,3)";
__ref._lbltotalsales /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(__c.NumberFormat(_ftotal,(int) (0),(int) (3))+" L");
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="dblTotalInv = fTotal";
__ref._dbltotalinv /*float*/  = _ftotal;
 }
;
RDebugUtils.currentLine=3866634;
 //BA.debugLineNum = 3866634;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=3866636;
 //BA.debugLineNum = 3866636;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=3866637;
 //BA.debugLineNum = 3866637;BA.debugLine="rs = sql1.ExecQuery(\"select ifnull(sum(InvTotalT";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select ifnull(sum(InvTotalTax),0) as InvTotalTax from SalesInvoiceH");
RDebugUtils.currentLine=3866638;
 //BA.debugLineNum = 3866638;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=3866639;
 //BA.debugLineNum = 3866639;BA.debugLine="Dim fTotal As Float = rs.GetString(\"InvTotalTax";
_ftotal = (float)(Double.parseDouble(_rs.GetString("InvTotalTax")));
RDebugUtils.currentLine=3866640;
 //BA.debugLineNum = 3866640;BA.debugLine="lbltotaltax.SetHtml(NumberFormat(fTotal,0,3) &";
__ref._lbltotaltax /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(__c.NumberFormat(_ftotal,(int) (0),(int) (3))+" L");
 }
;
RDebugUtils.currentLine=3866642;
 //BA.debugLineNum = 3866642;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=3866645;
 //BA.debugLineNum = 3866645;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=3866646;
 //BA.debugLineNum = 3866646;BA.debugLine="rs = sql1.ExecQuery(\"select ifnull(sum(ExpensesA";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select ifnull(sum(ExpensesAmt),0) as ExpensesAmt from ExpensesInfo");
RDebugUtils.currentLine=3866647;
 //BA.debugLineNum = 3866647;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=3866648;
 //BA.debugLineNum = 3866648;BA.debugLine="Dim fTotal As Float = rs.GetString(\"ExpensesAmt";
_ftotal = (float)(Double.parseDouble(_rs.GetString("ExpensesAmt")));
RDebugUtils.currentLine=3866649;
 //BA.debugLineNum = 3866649;BA.debugLine="lbltotalexpenses.SetHtml(NumberFormat(fTotal,0,";
__ref._lbltotalexpenses /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(__c.NumberFormat(_ftotal,(int) (0),(int) (3))+" L");
 }
;
RDebugUtils.currentLine=3866651;
 //BA.debugLineNum = 3866651;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=3866653;
 //BA.debugLineNum = 3866653;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=3866654;
 //BA.debugLineNum = 3866654;BA.debugLine="rs=sql1.ExecQuery(\"select ifnull(sum(InvTotal),0";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select ifnull(sum(InvTotal),0) as totalreturns from ReturnSalesInvoiceH");
RDebugUtils.currentLine=3866655;
 //BA.debugLineNum = 3866655;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=3866656;
 //BA.debugLineNum = 3866656;BA.debugLine="Dim fTotal As Float = rs.GetString(\"totalretur";
_ftotal = (float)(Double.parseDouble(_rs.GetString("totalreturns")));
RDebugUtils.currentLine=3866657;
 //BA.debugLineNum = 3866657;BA.debugLine="lbltotalreturns.SetHtml(NumberFormat(fTotal,0,";
__ref._lbltotalreturns /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(__c.NumberFormat(_ftotal,(int) (0),(int) (3))+" L");
RDebugUtils.currentLine=3866658;
 //BA.debugLineNum = 3866658;BA.debugLine="dblTotalReturnInv = fTotal";
__ref._dbltotalreturninv /*float*/  = _ftotal;
 }
;
RDebugUtils.currentLine=3866661;
 //BA.debugLineNum = 3866661;BA.debugLine="rs.Close";
_rs.Close();
 } 
       catch (Exception e33) {
			ba.setLastException(e33);RDebugUtils.currentLine=3866664;
 //BA.debugLineNum = 3866664;BA.debugLine="Log(LastException)";
__c.LogImpl("23866664",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=3866666;
 //BA.debugLineNum = 3866666;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.dashboard __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="End Sub";
return "";
}
public String  _load_topsellingproducts(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "load_topsellingproducts", false))
	 {return ((String) Debug.delegate(ba, "load_topsellingproducts", null));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _str = "";
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub Load_TopSellingProducts";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Try";
try {RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="rs = sql1.ExecQuery($\"SELECT        SUM(IFNULL(P";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT        SUM(IFNULL(PurchaseInvoiceD.ProductQty, 0)) AS ProductQty, SUM(IFNULL(PurchaseInvoiceD.ProductQty, 0) * IFNULL(PurchaseInvoiceD.ProductSellPrice, 0)) AS GrandTotal, \n"+"                         ProductsInformation.ProductName\n"+"FROM            PurchaseInvoiceD LEFT OUTER JOIN\n"+"                         ProductsInformation ON PurchaseInvoiceD.ProductID = ProductsInformation.ProductID\n"+"GROUP BY ProductsInformation.ProductName\n"+"order by ProductQty desc"));
RDebugUtils.currentLine=3997707;
 //BA.debugLineNum = 3997707;BA.debugLine="Dim str As String = \"\"";
_str = "";
RDebugUtils.currentLine=3997708;
 //BA.debugLineNum = 3997708;BA.debugLine="str = $\" <table id=\"vgt-table\" class=\"order-tabl";
_str = (" <table id=\"vgt-table\" class=\"order-table vgt-table \">\n"+"                     <colgroup>\n"+"                        <col id=\"col-0\">\n"+"                        <col id=\"col-1\">\n"+"                        <col id=\"col-2\">\n"+"                     </colgroup>\n"+"                     <thead>\n"+"                        <tr>\n"+"                           <!----> <!----> \n"+"                           <th scope=\"col\" aria-sort=\"descending\" aria-controls=\"col-0\" class=\"vgt-left-align text-left\" style=\"min-width: auto; width: auto;\">\n"+"                              <span>Producto</span> <!---->\n"+"                           </th>\n"+"                           <th scope=\"col\" aria-sort=\"descending\" aria-controls=\"col-1\" class=\"vgt-left-align text-left\" style=\"min-width: auto; width: auto;\">\n"+"                              <span>Cantidad</span> <!---->\n"+"                           </th>\n"+"                           <th scope=\"col\" aria-sort=\"descending\" aria-controls=\"col-2\" class=\"vgt-left-align text-left\" style=\"min-width: auto; width: auto;\">\n"+"                              <span>Total</span> <!---->\n"+"                           </th>\n"+"                        </tr>\n"+"                        <!---->\n"+"                     </thead>\n"+"                     <tbody>");
RDebugUtils.currentLine=3997731;
 //BA.debugLineNum = 3997731;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=3997732;
 //BA.debugLineNum = 3997732;BA.debugLine="str = str & $\" <!---->";
_str = _str+(" <!----> \n"+"                        <tr class=\" text-left\">\n"+"                           <!----> <!----> \n"+"                           <td class=\"vgt-left-align text-left\"><span>\n"+"                              "+__c.SmartStringFormatter("",(Object)(_rs.GetString("ProductName")))+"\n"+"                              </span>\n"+"                           </td>\n"+"                           <td class=\"vgt-left-align text-left\">\n"+"                              <div><span> "+__c.SmartStringFormatter("",(Object)(_rs.GetString("ProductQty")))+" pc</span></div>\n"+"                           </td>\n"+"                           <td class=\"vgt-left-align text-left\">\n"+"                              <div><span> "+__c.SmartStringFormatter("",(Object)(_rs.GetString("GrandTotal")))+" L</span></div>\n"+"                           </td>\n"+"                        </tr>");
 }
;
RDebugUtils.currentLine=3997747;
 //BA.debugLineNum = 3997747;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=3997749;
 //BA.debugLineNum = 3997749;BA.debugLine="str = str & $\"                        </tbody>";
_str = _str+("  \n"+"                     </tbody>\n"+"                     <!---->\n"+"                  </table>");
RDebugUtils.currentLine=3997753;
 //BA.debugLineNum = 3997753;BA.debugLine="divtopsellingproducts.SetHtml(str)";
__ref._divtopsellingproducts /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=3997756;
 //BA.debugLineNum = 3997756;BA.debugLine="Log(LastException)";
__c.LogImpl("23997756",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=3997758;
 //BA.debugLineNum = 3997758;BA.debugLine="End Sub";
return "";
}
public String  _load_userstranshistory(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "load_userstranshistory", false))
	 {return ((String) Debug.delegate(ba, "load_userstranshistory", null));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _str = "";
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub Load_UsersTransHistory";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Try";
try {RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="rs = sql1.ExecQuery(\"SELECT UsersLogs.UserLogID,";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT UsersLogs.UserLogID, UsersLogs.UserID, UsersLogs.ActivityDesc, UsersLogs.ActivityDatetime, UsersInformation.UserFullName "+" FROM            UsersLogs LEFT OUTER JOIN "+" UsersInformation ON UsersLogs.UserID = UsersInformation.UserID order by UsersLogs.UserLogID desc limit 5");
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="Dim str As String = \"\"";
_str = "";
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="str = str & $\"<tr>";
_str = _str+("<tr>\n"+"                      \n"+"                      <td>\n"+"                        <a href=\"#\" class=\"tx-inverse tx-14 tx-medium d-block\">"+__c.SmartStringFormatter("",(Object)(_rs.GetString("UserFullName")))+"</a>\n"+"                        <span class=\"tx-11 d-block\">TRANSID: "+__c.SmartStringFormatter("",(Object)(_rs.GetString("UserLogID")))+"</span>\n"+"                      </td>\n"+"                      <td class=\"tx-12\">\n"+"                        <span class=\"square-8 bg-success mg-r-5 rounded-circle\"></span> "+__c.SmartStringFormatter("",(Object)(_rs.GetString("ActivityDesc")))+"\n"+"                      </td>\n"+"                      <td>"+__c.SmartStringFormatter("",(Object)(_rs.GetString("ActivityDatetime")))+"</td>\n"+"                    </tr>");
 }
;
RDebugUtils.currentLine=3932181;
 //BA.debugLineNum = 3932181;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=3932183;
 //BA.debugLineNum = 3932183;BA.debugLine="divuserstrans.SetHtml(str)";
__ref._divuserstrans /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=3932186;
 //BA.debugLineNum = 3932186;BA.debugLine="Log(LastException)";
__c.LogImpl("23932186",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=3932188;
 //BA.debugLineNum = 3932188;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.dashboard __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="Create_Top_Dashboard";
__ref._create_top_dashboard /*String*/ (null);
RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="Load_TopSellingProducts";
__ref._load_topsellingproducts /*String*/ (null);
RDebugUtils.currentLine=3735562;
 //BA.debugLineNum = 3735562;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="End Sub";
return "";
}
}