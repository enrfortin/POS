package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pagepos extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pagepos", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pagepos.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _cmbcategory = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divproducts = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _tblsoldproducts = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblgrandtotal = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txttax = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtsearchproducts = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtdiscount = null;
public anywheresoftware.b4a.objects.collections.List _lstsoldproducts = null;
public double _dbldiscount = 0;
public double _dblshipping = 0;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _cmbcustomer = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _cmbcopaymenttype = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtcustname = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtcustemail = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtcustphone = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtcustcountry = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtcustcity = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtcustaddress = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtcustrtn = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblcototalproducts = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblcototaltax = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblcototaldiscount = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblcototalshipping = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblcograndtotal = null;
public String _nombre_cliente = "";
public double _globaldblgrandtotal = 0;
public double _globaldbltotaldiscount = 0;
public double _globaldbltotaltax = 0;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtcopaidamount = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtconotes = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divinvprint = null;
public b4j.example.main _main = null;
public String  _add_invoice(b4j.example.pagepos __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "add_invoice", false))
	 {return ((String) Debug.delegate(ba, "add_invoice", new Object[] {_params}));}
String _str = "";
int _lastinsertedid = 0;
int _i = 0;
b4j.example.clstblsoldproducts _cls = null;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub Add_Invoice (Params As Map)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Try";
try {RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="If GlobaldblGrandTotal = 0 Or GlobaldblGrandTota";
if (__ref._globaldblgrandtotal /*double*/ ==0 || __ref._globaldblgrandtotal /*double*/ <0) { 
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="str = $\"INSERT INTO SalesInvoiceH            (In";
_str = ("INSERT INTO SalesInvoiceH\n"+"           (InvTotal\n"+"           ,UserID\n"+"           ,InvTotalTax\n"+"           ,InvTotalDiscount\n"+"           ,InvTotalShipping,PaidAmount,StrNotes,PaymenttypeID,CustomerID)\n"+"     VALUES\n"+"           (?\n"+"           ,?\n"+"           ,?\n"+"           ,?\n"+"           ,?,?,?,?,?)");
RDebugUtils.currentLine=1638421;
 //BA.debugLineNum = 1638421;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=1638422;
 //BA.debugLineNum = 1638422;BA.debugLine="sql1.ExecNonQuery2(str,Array As Object(Globaldbl";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(_str,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__ref._globaldblgrandtotal /*double*/ ),(Object)(1),(Object)(__ref._globaldbltotaltax /*double*/ ),(Object)(__ref._globaldbltotaldiscount /*double*/ ),(Object)(__ref._dblshipping /*double*/ ),__ref._txtcopaidamount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtconotes /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._cmbcopaymenttype /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._cmbcustomer /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()}));
RDebugUtils.currentLine=1638423;
 //BA.debugLineNum = 1638423;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=1638425;
 //BA.debugLineNum = 1638425;BA.debugLine="Dim LastInsertedID As Int";
_lastinsertedid = 0;
RDebugUtils.currentLine=1638426;
 //BA.debugLineNum = 1638426;BA.debugLine="LastInsertedID = sql1.ExecQuerySingleResult(\"sel";
_lastinsertedid = (int)(Double.parseDouble(__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult("select * from SalesInvoiceH order by SalesInvoiceHID desc limit 1")));
RDebugUtils.currentLine=1638429;
 //BA.debugLineNum = 1638429;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=1638430;
 //BA.debugLineNum = 1638430;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProduct";
_cls = (b4j.example.clstblsoldproducts)(__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=1638432;
 //BA.debugLineNum = 1638432;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=1638433;
 //BA.debugLineNum = 1638433;BA.debugLine="str = $\"INSERT INTO SalesInvoiceD";
_str = ("INSERT INTO SalesInvoiceD\n"+"			           (SalesInvoiceHID\n"+"			           ,ProductID\n"+"			           ,ProductSellPrice\n"+"			           ,ProductCostPrice\n"+"			           ,TaxPerc\n"+"			           ,ProductQty)\n"+"			     VALUES\n"+"			           (?\n"+"			           ,?\n"+"			           ,?\n"+"			           ,?\n"+"			           ,?\n"+"			           ,?)");
RDebugUtils.currentLine=1638448;
 //BA.debugLineNum = 1638448;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=1638449;
 //BA.debugLineNum = 1638449;BA.debugLine="sql1.ExecNonQuery2(str,Array As Object(LastIns";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(_str,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_lastinsertedid),(Object)(_cls._pid /*int*/ ),(Object)(_cls._psellprice /*double*/ ),(Object)(_cls._pcostprice /*double*/ ),(Object)(_cls._ptax /*double*/ ),(Object)(_cls._pqty /*int*/ )}));
RDebugUtils.currentLine=1638450;
 //BA.debugLineNum = 1638450;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }
};
RDebugUtils.currentLine=1638454;
 //BA.debugLineNum = 1638454;BA.debugLine="Create_invoice_ToPrint";
__ref._create_invoice_toprint /*String*/ (null);
RDebugUtils.currentLine=1638458;
 //BA.debugLineNum = 1638458;BA.debugLine="Reset_Tbl";
__ref._reset_tbl /*String*/ (null);
 } 
       catch (Exception e23) {
			ba.setLastException(e23);RDebugUtils.currentLine=1638461;
 //BA.debugLineNum = 1638461;BA.debugLine="Log(LastException)";
__c.LogImpl("21638461",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=1638463;
 //BA.debugLineNum = 1638463;BA.debugLine="End Sub";
return "";
}
public String  _create_invoice_toprint(b4j.example.pagepos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "create_invoice_toprint", false))
	 {return ((String) Debug.delegate(ba, "create_invoice_toprint", null));}
String _fecha = "";
String _str = "";
int _i = 0;
b4j.example.clstblsoldproducts _cls = null;
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub Create_invoice_ToPrint";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Try";
try {RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Dim fecha As String =  DateTime.Date(DateTime.No";
_fecha = __c.DateTime.Date(__c.DateTime.getNow())+" "+__c.DateTime.Time(__c.DateTime.getNow());
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy HH:mm:ss\"";
__c.DateTime.setDateFormat("dd/MM/yyyy HH:mm:ss");
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="str = $\"<div> 					<div id=\"invoice-POS\">";
_str = ("<div>\n"+"					<div id=\"invoice-POS\">\n"+"						<left>\n"+"						<h6 class=\"text-right\">")+_fecha+("</h6>\n"+"						</left>\n"+"						<center id=\"top\">\n"+"							<div class=\"logo\"><img src=\"images/logo-default.png\"></div>\n"+"							<div class=\"info\">\n"+"								<h2>Soluciones Informáticas Fortin</h2></div>\n"+"						</center>\n"+"						<div class=\"info\">\n"+"						<center>\n"+"							<h6>RTN : 01011992010754</h6>\n"+"							<h6>Dirección : 2da avenida comayaguaela entre 8va y 9na calle edificio CAE</h6>\n"+"							<h6>Email : admin@sifhn.com</h6>\n"+"							<h6>Telefono : (504) 9878-0884</h6>\n"+"							<h6>C.A.I	:  85D968-151D08-A64097-7C6028-7DA36C-FD</h6>\n"+"							<h6>Rango autorizado del 000-001-01-00001401 al 000-001-01-00001500</h6>\n"+"							<h6>fecha limite de emisión: 26/02/2023</h6>\n"+"							<h6>Cliente : ")+_fecha+("</h6>\n"+"							<h6>RTN	: 01010101010</h6></div>\n"+"							</center>\n"+"						<table class=\"mt-3 ml-2 table-md\">\n"+"							<thead>\n"+"								<tr>\n"+"									<th scope=\"col\">Producto</th>\n"+"									<th scope=\"col\">Cantidad</th>\n"+"									<th scope=\"col\">Subtotal</th>\n"+"								</tr>\n"+"							</thead>\n"+"							<tbody> ");
RDebugUtils.currentLine=1703976;
 //BA.debugLineNum = 1703976;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=1703977;
 //BA.debugLineNum = 1703977;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProdu";
_cls = (b4j.example.clstblsoldproducts)(__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=1703978;
 //BA.debugLineNum = 1703978;BA.debugLine="str = str & $\"<tr> 									<td>${cls.PName}";
_str = _str+("<tr>\n"+"									<td>"+__c.SmartStringFormatter("",(Object)(_cls._pname /*String*/ ))+"</td>\n"+"									<td>"+__c.SmartStringFormatter("",(Object)(_cls._pqty /*int*/ ))+"</td>\n"+"									<td>"+__c.SmartStringFormatter("",(Object)((_cls._psellprice /*double*/ *_cls._pqty /*int*/ )))+" L</td>\n"+"								</tr>");
 }
};
RDebugUtils.currentLine=1703987;
 //BA.debugLineNum = 1703987;BA.debugLine="str = str & $\" 								 <tr> 									<th></";
_str = _str+("\n"+"								 <tr>\n"+"									<th></th>\n"+"									<th>ISV</th>\n"+"									<td>"+__c.SmartStringFormatter("",(Object)(__ref._globaldbltotaltax /*double*/ ))+" L</td>\n"+"								</tr>\n"+"								<tr>\n"+"									<th></th>\n"+"									<th>Descuentos</th>\n"+"									<td>"+__c.SmartStringFormatter("",(Object)(__ref._globaldbltotaldiscount /*double*/ ))+" L</td>\n"+"								</tr>\n"+"								<tr>\n"+"									<th></th>\n"+"									<th>Envio</th>\n"+"									<td>"+__c.SmartStringFormatter("",(Object)(__ref._dblshipping /*double*/ ))+" L</td>\n"+"								</tr>\n"+"								\n"+"							</tbody>\n"+"						</table>\n"+"						\n"+"						<table id=\"total\" class=\"mt-2 ml-2\">\n"+"							<tbody>\n"+"								<tr>\n"+"									<th class=\"p-1 w-75\">Total</th>\n"+"									<th class=\"p-1 w-25\">"+__c.SmartStringFormatter("",(Object)(__ref._globaldblgrandtotal /*double*/ ))+" L</th>\n"+"								</tr>\n"+"							</tbody>\n"+"						</table>\n"+"						<div id=\"legalcopy\" class=\"ml-2\">\n"+"							<p class=\"legal\"><strong>Factura #000-001-01-00001500</strong></p>\n"+"							<p class=\"legal\"><strong>La factura es beneficio de todos ¡Exijala!</strong></p>\n"+"							\n"+"						</div>\n"+"					</div>\n"+"				</div>");
RDebugUtils.currentLine=1704025;
 //BA.debugLineNum = 1704025;BA.debugLine="divinvprint.SetHtml(str)";
__ref._divinvprint /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
RDebugUtils.currentLine=1704028;
 //BA.debugLineNum = 1704028;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=1704029;
 //BA.debugLineNum = 1704029;BA.debugLine="str = $\" 		 		var modal = document.getElementByI";
_str = ("\n"+"		\n"+"		var modal = document.getElementById(\"myModal3\");\n"+"		\n"+"		 modal.style.display = \"block\";");
RDebugUtils.currentLine=1704035;
 //BA.debugLineNum = 1704035;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=1704038;
 //BA.debugLineNum = 1704038;BA.debugLine="Log(LastException)";
__c.LogImpl("21704038",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=1704040;
 //BA.debugLineNum = 1704040;BA.debugLine="End Sub";
return "";
}
public String  _reset_tbl(b4j.example.pagepos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "reset_tbl", false))
	 {return ((String) Debug.delegate(ba, "reset_tbl", null));}
String _str = "";
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub Reset_Tbl";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Try";
try {RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="dbldiscount = 0";
__ref._dbldiscount /*double*/  = 0;
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="lblcototalproducts.SetHtml(\"0\")";
__ref._lblcototalproducts /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml("0");
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="lblcototaltax.SetHtml(0 & \" L\")";
__ref._lblcototaltax /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(BA.NumberToString(0)+" L");
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="lblcototalshipping.SetHtml(\"0 L\")";
__ref._lblcototalshipping /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml("0 L");
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="lblcograndtotal.SetHtml(0 & \" L\")";
__ref._lblcograndtotal /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(BA.NumberToString(0)+" L");
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="lblcototaldiscount.SetHtml(0 & \" L\")";
__ref._lblcototaldiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(BA.NumberToString(0)+" L");
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="GlobaldblGrandTotal = 0";
__ref._globaldblgrandtotal /*double*/  = 0;
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="GlobaldblTotaldiscount = 0";
__ref._globaldbltotaldiscount /*double*/  = 0;
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="GlobaldblTotalTax = 0";
__ref._globaldbltotaltax /*double*/  = 0;
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="txtcopaidamount.SetVal(\"0\")";
__ref._txtcopaidamount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("0"));
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="txtconotes.SetVal(\"0\")";
__ref._txtconotes /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("0"));
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="dblshipping = 0";
__ref._dblshipping /*double*/  = 0;
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="Dim str As String = $\"  <table class=\"table tabl";
_str = ("  <table class=\"table table-striped\">\n"+"                                                <thead>\n"+"                                                   <tr>\n"+"                                                      <th scope=\"col\">Producto</th>\n"+"                                                      <th scope=\"col\">Precio</th>\n"+"                                                      <th scope=\"col\" class=\"text-center\">Cantidad</th>\n"+"                                                      <th scope=\"col\" class=\"text-center\">Subtotal</th>\n"+"                                                      <th scope=\"col\" class=\"text-center\"><i class=\"fa fa-trash\"></i></th>\n"+"                                                   </tr>\n"+"                                                </thead>  <tbody><tbody><tr><td colspan=\"5\">Sin información disponible</td></tr> </tbody></table>");
RDebugUtils.currentLine=983069;
 //BA.debugLineNum = 983069;BA.debugLine="tblsoldproducts.SetHtml(str)";
__ref._tblsoldproducts /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=983072;
 //BA.debugLineNum = 983072;BA.debugLine="Log(LastException)";
__c.LogImpl("2983072",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=983074;
 //BA.debugLineNum = 983074;BA.debugLine="End Sub";
return "";
}
public String  _add_newcustomer(b4j.example.pagepos __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "add_newcustomer", false))
	 {return ((String) Debug.delegate(ba, "add_newcustomer", new Object[] {_params}));}
String _str = "";
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub Add_NewCustomer (Params As Map)";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Try";
try {RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="str = $\"INSERT INTO CustomersInformation";
_str = ("INSERT INTO CustomersInformation\n"+"           (CustomerName\n"+"           ,CustEmail\n"+"           ,CustPhone\n"+"           ,CustCountry\n"+"           ,CustCity\n"+"           ,CustAddress\n"+"		   ,RTN)\n"+"     VALUES\n"+"           (?\n"+"           ,?\n"+"           ,?\n"+"           ,?\n"+"           ,?\n"+"           ,?\n"+"		   ,?)");
RDebugUtils.currentLine=1441812;
 //BA.debugLineNum = 1441812;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=1441813;
 //BA.debugLineNum = 1441813;BA.debugLine="sql1.ExecNonQuery2(str,Array As Object(txtcustna";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(_str,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtcustname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtcustemail /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtcustphone /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtcustcountry /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtcustcity /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtcustaddress /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtcustrtn /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()}));
RDebugUtils.currentLine=1441814;
 //BA.debugLineNum = 1441814;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=1441816;
 //BA.debugLineNum = 1441816;BA.debugLine="Load_Customers";
__ref._load_customers /*String*/ (null);
RDebugUtils.currentLine=1441818;
 //BA.debugLineNum = 1441818;BA.debugLine="txtcustname.SetVal(\"\")";
__ref._txtcustname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(""));
RDebugUtils.currentLine=1441819;
 //BA.debugLineNum = 1441819;BA.debugLine="txtcustemail.SetVal(\"\")";
__ref._txtcustemail /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(""));
RDebugUtils.currentLine=1441820;
 //BA.debugLineNum = 1441820;BA.debugLine="txtcustphone.SetVal(\"\")";
__ref._txtcustphone /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(""));
RDebugUtils.currentLine=1441821;
 //BA.debugLineNum = 1441821;BA.debugLine="txtcustcountry.SetVal(\"\")";
__ref._txtcustcountry /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(""));
RDebugUtils.currentLine=1441822;
 //BA.debugLineNum = 1441822;BA.debugLine="txtcustcity.SetVal(\"\")";
__ref._txtcustcity /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(""));
RDebugUtils.currentLine=1441823;
 //BA.debugLineNum = 1441823;BA.debugLine="txtcustaddress.SetVal(\"\")";
__ref._txtcustaddress /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(""));
RDebugUtils.currentLine=1441824;
 //BA.debugLineNum = 1441824;BA.debugLine="txtcustrtn.SetVal(\"\")";
__ref._txtcustrtn /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(""));
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=1441827;
 //BA.debugLineNum = 1441827;BA.debugLine="Log(LastException)";
__c.LogImpl("21441827",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=1441829;
 //BA.debugLineNum = 1441829;BA.debugLine="End Sub";
return "";
}
public String  _load_customers(b4j.example.pagepos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "load_customers", false))
	 {return ((String) Debug.delegate(ba, "load_customers", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub Load_Customers";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Try";
try {RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="rs = sql1.ExecQuery(\"select * from CustomersInfo";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from CustomersInformation");
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="Dim val As String = rs.GetInt(\"CustomerID\")";
_val = BA.NumberToString(_rs.GetInt("CustomerID"));
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("CustomerName")).Append("</option>");
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="nombre_cliente = rs.GetInt(\"CustomerName\")";
__ref._nombre_cliente /*String*/  = BA.NumberToString(_rs.GetInt("CustomerName"));
 }
;
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=1376271;
 //BA.debugLineNum = 1376271;BA.debugLine="cmbcustomer.SetHtml(sb.ToString)";
__ref._cmbcustomer /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
RDebugUtils.currentLine=1376272;
 //BA.debugLineNum = 1376272;BA.debugLine="ws.Flush";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Flush();
 } 
       catch (Exception e15) {
			ba.setLastException(e15);RDebugUtils.currentLine=1376276;
 //BA.debugLineNum = 1376276;BA.debugLine="Log(LastException)";
__c.LogImpl("21376276",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=1376278;
 //BA.debugLineNum = 1376278;BA.debugLine="End Sub";
return "";
}
public String  _add_qty_tblproducts(b4j.example.pagepos __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "add_qty_tblproducts", false))
	 {return ((String) Debug.delegate(ba, "add_qty_tblproducts", new Object[] {_params}));}
int _i = 0;
b4j.example.clstblsoldproducts _cls = null;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub Add_Qty_tblProducts (Params As Map)";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Try";
try {RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProducts";
_cls = (b4j.example.clstblsoldproducts)(__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="If cls.PID = Params.Get(\"val\") Then";
if (_cls._pid /*int*/ ==(double)(BA.ObjectToNumber(_params.Get((Object)("val"))))) { 
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="cls.PQty = cls.PQty + 1";
_cls._pqty /*int*/  = (int) (_cls._pqty /*int*/ +1);
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="cls.PSubTotal = cls.PSellPrice * cls.PQty";
_cls._psubtotal /*double*/  = _cls._psellprice /*double*/ *_cls._pqty /*int*/ ;
 };
 }
};
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="Load_tblSoldProducts";
__ref._load_tblsoldproducts /*String*/ (null);
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=786447;
 //BA.debugLineNum = 786447;BA.debugLine="Log(LastException)";
__c.LogImpl("2786447",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="End Sub";
return "";
}
public String  _load_tblsoldproducts(b4j.example.pagepos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "load_tblsoldproducts", false))
	 {return ((String) Debug.delegate(ba, "load_tblsoldproducts", null));}
double _dbltotaltax = 0;
double _dblgrandtotal = 0;
String _str = "";
int _i = 0;
b4j.example.clstblsoldproducts _cls = null;
double _tempdbltax = 0;
int _intcount = 0;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub Load_tblSoldProducts";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Try";
try {RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Dim dblTotalTax As Double = 0";
_dbltotaltax = 0;
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Dim dblgrandTotal As Double = 0";
_dblgrandtotal = 0;
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="Dim str As String = $\"  <table class=\"table tabl";
_str = ("  <table class=\"table table-striped\">\n"+"                                                <thead>\n"+"                                                   <tr>\n"+"                                                      <th scope=\"col\">Producto</th>\n"+"                                                      <th scope=\"col\">Precio</th>\n"+"                                                      <th scope=\"col\" class=\"text-center\">Cantidad</th>\n"+"                                                      <th scope=\"col\" class=\"text-center\">Subtotal</th>\n"+"                                                      <th scope=\"col\" class=\"text-center\"><i class=\"fa fa-trash\"></i></th>\n"+"                                                   </tr>\n"+"                                                </thead>  <tbody>");
RDebugUtils.currentLine=720912;
 //BA.debugLineNum = 720912;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=720914;
 //BA.debugLineNum = 720914;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProducts";
_cls = (b4j.example.clstblsoldproducts)(__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=720915;
 //BA.debugLineNum = 720915;BA.debugLine="str = str & $\"<tr><td>${cls.PName}</td> 			<td>";
_str = _str+("<tr><td>"+__c.SmartStringFormatter("",(Object)(_cls._pname /*String*/ ))+"</td>\n"+"			<td>"+__c.SmartStringFormatter("",(Object)(_cls._psellprice /*double*/ ))+"</td>\n"+"			<td >	\n"+"				<div class=\"quantity\">\n"+"					<div role=\"group\" class=\"input-group\">\n"+"						<!---->\n"+"						<div class=\"input-group-prepend\"><a  href='javascript:void(0);' onclick=\"minusqty("+__c.SmartStringFormatter("",(Object)(_cls._pid /*int*/ ))+")\"><span class=\"btn btn-primary btn-sm\">-</span></a></div>\n"+"						<input class=\"form-control\" id=\"txtqty"+__c.SmartStringFormatter("",(Object)(_cls._pid /*int*/ ))+"\" value=\""+__c.SmartStringFormatter("",(Object)(_cls._pqty /*int*/ ))+"\" disabled>\n"+"						<div class=\"input-group-append\"><a  href='javascript:void(0);' onclick=\"addqty("+__c.SmartStringFormatter("",(Object)(_cls._pid /*int*/ ))+")\"><span class=\"btn btn-primary btn-sm\">+</span></a></div>\n"+"						<!---->\n"+"					</div>\n"+"				</div>\n"+"			\n"+"			</td>\n"+"			\n"+"			<td class=\"text-center\" >"+__c.SmartStringFormatter("",(Object)(_cls._psubtotal /*double*/ ))+"</td>\n"+"			<td><a href='javascript:void(0);' onclick=\"deleteproduct("+__c.SmartStringFormatter("",(Object)(_cls._pid /*int*/ ))+")\" title=\"Delete\"><i class=\"fa fa-times text-25 text-danger\"></i></a></td></tr>");
RDebugUtils.currentLine=720933;
 //BA.debugLineNum = 720933;BA.debugLine="Dim tempdbltax As Double = 0";
_tempdbltax = 0;
RDebugUtils.currentLine=720934;
 //BA.debugLineNum = 720934;BA.debugLine="If cls.PTax > 0 Then";
if (_cls._ptax /*double*/ >0) { 
RDebugUtils.currentLine=720935;
 //BA.debugLineNum = 720935;BA.debugLine="dblTotalTax = dblTotalTax + ((cls.PSellPrice *";
_dbltotaltax = _dbltotaltax+((_cls._psellprice /*double*/ *_cls._pqty /*int*/ )*(_cls._ptax /*double*/ /(double)100));
RDebugUtils.currentLine=720936;
 //BA.debugLineNum = 720936;BA.debugLine="tempdbltax = ((cls.PSellPrice * cls.PQty) * (c";
_tempdbltax = ((_cls._psellprice /*double*/ *_cls._pqty /*int*/ )*(_cls._ptax /*double*/ /(double)100));
 };
RDebugUtils.currentLine=720938;
 //BA.debugLineNum = 720938;BA.debugLine="dblgrandTotal = dblgrandTotal + ((cls.PSellPric";
_dblgrandtotal = _dblgrandtotal+((_cls._psellprice /*double*/ *_cls._pqty /*int*/ )+_tempdbltax);
 }
};
RDebugUtils.currentLine=720942;
 //BA.debugLineNum = 720942;BA.debugLine="str = str & $\"  </tbody></table>\"$";
_str = _str+("  </tbody></table>");
RDebugUtils.currentLine=720943;
 //BA.debugLineNum = 720943;BA.debugLine="tblsoldproducts.SetHtml(str)";
__ref._tblsoldproducts /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
RDebugUtils.currentLine=720945;
 //BA.debugLineNum = 720945;BA.debugLine="ws.Flush";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Flush();
RDebugUtils.currentLine=720947;
 //BA.debugLineNum = 720947;BA.debugLine="dblgrandTotal = dblgrandTotal - dbldiscount";
_dblgrandtotal = _dblgrandtotal-__ref._dbldiscount /*double*/ ;
RDebugUtils.currentLine=720949;
 //BA.debugLineNum = 720949;BA.debugLine="lblgrandtotal.SetHtml($\"<span> Total : ${NumberF";
__ref._lblgrandtotal /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(("<span> Total : "+__c.SmartStringFormatter("",(Object)(__c.NumberFormat2(_dblgrandtotal,(int) (1),(int) (3),(int) (0),__c.False)))+"L </span>"));
RDebugUtils.currentLine=720950;
 //BA.debugLineNum = 720950;BA.debugLine="txttax.SetVal(NumberFormat2(dblTotalTax,1,3,0,Fa";
__ref._txttax /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(__c.NumberFormat2(_dbltotaltax,(int) (1),(int) (3),(int) (0),__c.False)));
RDebugUtils.currentLine=720951;
 //BA.debugLineNum = 720951;BA.debugLine="ws.Flush";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Flush();
RDebugUtils.currentLine=720954;
 //BA.debugLineNum = 720954;BA.debugLine="Dim intcount As Int = 0";
_intcount = (int) (0);
RDebugUtils.currentLine=720955;
 //BA.debugLineNum = 720955;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
{
final int step23 = 1;
final int limit23 = (int) (__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=720956;
 //BA.debugLineNum = 720956;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProducts";
_cls = (b4j.example.clstblsoldproducts)(__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=720957;
 //BA.debugLineNum = 720957;BA.debugLine="intcount = intcount + cls.PQty";
_intcount = (int) (_intcount+_cls._pqty /*int*/ );
 }
};
RDebugUtils.currentLine=720959;
 //BA.debugLineNum = 720959;BA.debugLine="lblcototalproducts.SetHtml(intcount)";
__ref._lblcototalproducts /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(BA.NumberToString(_intcount));
RDebugUtils.currentLine=720963;
 //BA.debugLineNum = 720963;BA.debugLine="lblcototaltax.SetHtml(NumberFormat2(dblTotalTax,";
__ref._lblcototaltax /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(__c.NumberFormat2(_dbltotaltax,(int) (1),(int) (3),(int) (0),__c.False)+" L");
RDebugUtils.currentLine=720964;
 //BA.debugLineNum = 720964;BA.debugLine="lblcototalshipping.SetHtml(NumberFormat2(dblship";
__ref._lblcototalshipping /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(__c.NumberFormat2(__ref._dblshipping /*double*/ ,(int) (1),(int) (3),(int) (0),__c.False)+" L");
RDebugUtils.currentLine=720965;
 //BA.debugLineNum = 720965;BA.debugLine="lblcograndtotal.SetHtml(NumberFormat2(dblgrandTo";
__ref._lblcograndtotal /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(__c.NumberFormat2(_dblgrandtotal,(int) (1),(int) (3),(int) (0),__c.False)+" L");
RDebugUtils.currentLine=720967;
 //BA.debugLineNum = 720967;BA.debugLine="lblcototaldiscount.SetHtml(NumberFormat2(dbldisc";
__ref._lblcototaldiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(__c.NumberFormat2(__ref._dbldiscount /*double*/ ,(int) (1),(int) (3),(int) (0),__c.False)+" L");
RDebugUtils.currentLine=720969;
 //BA.debugLineNum = 720969;BA.debugLine="GlobaldblGrandTotal = NumberFormat2(dblgrandTota";
__ref._globaldblgrandtotal /*double*/  = (double)(Double.parseDouble(__c.NumberFormat2(_dblgrandtotal,(int) (1),(int) (3),(int) (0),__c.False)));
RDebugUtils.currentLine=720970;
 //BA.debugLineNum = 720970;BA.debugLine="GlobaldblTotaldiscount = NumberFormat2(dbldiscou";
__ref._globaldbltotaldiscount /*double*/  = (double)(Double.parseDouble(__c.NumberFormat2(__ref._dbldiscount /*double*/ ,(int) (1),(int) (3),(int) (0),__c.False)));
RDebugUtils.currentLine=720971;
 //BA.debugLineNum = 720971;BA.debugLine="GlobaldblTotalTax = NumberFormat2(dblTotalTax,1,";
__ref._globaldbltotaltax /*double*/  = (double)(Double.parseDouble(__c.NumberFormat2(_dbltotaltax,(int) (1),(int) (3),(int) (0),__c.False)));
 } 
       catch (Exception e36) {
			ba.setLastException(e36);RDebugUtils.currentLine=720975;
 //BA.debugLineNum = 720975;BA.debugLine="Log(LastException)";
__c.LogImpl("2720975",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=720977;
 //BA.debugLineNum = 720977;BA.debugLine="End Sub";
return "";
}
public String  _btnclosemodal3_click(b4j.example.pagepos __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "btnclosemodal3_click", false))
	 {return ((String) Debug.delegate(ba, "btnclosemodal3_click", new Object[] {_params}));}
String _str = "";
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub btnclosemodal3_Click (Params As Map)";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Try";
try {RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="str = $\" 		 		var modal9 = document.getElementBy";
_str = ("\n"+"		\n"+"		var modal9 = document.getElementById(\"myModal3\");\n"+"		\n"+"		 modal9.style.display = \"none\";");
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="Log(LastException)";
__c.LogImpl("21769485",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=1769487;
 //BA.debugLineNum = 1769487;BA.debugLine="End Sub";
return "";
}
public String  _btnresettbl_click(b4j.example.pagepos __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "btnresettbl_click", false))
	 {return ((String) Debug.delegate(ba, "btnresettbl_click", new Object[] {_params}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub btnresettbl_Click (Params As Map)";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Try";
try {RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="lstSoldProducts.Clear";
__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Reset_Tbl";
__ref._reset_tbl /*String*/ (null);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Log(LastException)";
__c.LogImpl("2917509",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.pagepos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="Private cmbcategory,divproducts As JQueryElement";
_cmbcategory = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_divproducts = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="Private tblsoldproducts,lblgrandtotal,txttax,txts";
_tblsoldproducts = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_lblgrandtotal = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txttax = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtsearchproducts = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtdiscount = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="Private lstSoldProducts As List";
_lstsoldproducts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="Private dbldiscount,dblshipping As Double";
_dbldiscount = 0;
_dblshipping = 0;
RDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="Private cmbcustomer As JQueryElement";
_cmbcustomer = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=262152;
 //BA.debugLineNum = 262152;BA.debugLine="Private cmbcopaymenttype As JQueryElement";
_cmbcopaymenttype = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=262155;
 //BA.debugLineNum = 262155;BA.debugLine="Private txtcustname,txtcustemail,txtcustphone,txt";
_txtcustname = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtcustemail = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtcustphone = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtcustcountry = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtcustcity = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtcustaddress = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtcustrtn = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=262157;
 //BA.debugLineNum = 262157;BA.debugLine="Private lblcototalproducts,lblcototaltax,lblcotot";
_lblcototalproducts = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_lblcototaltax = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_lblcototaldiscount = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_lblcototalshipping = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_lblcograndtotal = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=262159;
 //BA.debugLineNum = 262159;BA.debugLine="Private nombre_cliente As String";
_nombre_cliente = "";
RDebugUtils.currentLine=262160;
 //BA.debugLineNum = 262160;BA.debugLine="Private GlobaldblGrandTotal,GlobaldblTotaldiscoun";
_globaldblgrandtotal = 0;
_globaldbltotaldiscount = 0;
_globaldbltotaltax = 0;
RDebugUtils.currentLine=262162;
 //BA.debugLineNum = 262162;BA.debugLine="Private txtcopaidamount,txtconotes,divinvprint As";
_txtcopaidamount = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtconotes = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_divinvprint = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=262163;
 //BA.debugLineNum = 262163;BA.debugLine="End Sub";
return "";
}
public String  _clear_customersinputs(b4j.example.pagepos __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "clear_customersinputs", false))
	 {return ((String) Debug.delegate(ba, "clear_customersinputs", new Object[] {_params}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Private Sub Clear_CustomersInputs (Params As Map)";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Try";
try {RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="txtcustname.SetVal(\"\")";
__ref._txtcustname /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(""));
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="txtcustemail.SetVal(\"\")";
__ref._txtcustemail /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(""));
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="txtcustphone.SetVal(\"\")";
__ref._txtcustphone /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(""));
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="txtcustcountry.SetVal(\"\")";
__ref._txtcustcountry /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(""));
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="txtcustcity.SetVal(\"\")";
__ref._txtcustcity /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(""));
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="txtcustaddress.SetVal(\"\")";
__ref._txtcustaddress /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(""));
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="txtcustrtn.SetVal(\"\")";
__ref._txtcustrtn /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(""));
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="ws.Flush";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Flush();
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=1507341;
 //BA.debugLineNum = 1507341;BA.debugLine="Log(LastException)";
__c.LogImpl("21507341",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="End Sub";
return "";
}
public String  _cmbcategory_change(b4j.example.pagepos __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "cmbcategory_change", false))
	 {return ((String) Debug.delegate(ba, "cmbcategory_change", new Object[] {_params}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _str = "";
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub cmbcategory_Change (Params As Map)";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Try";
try {RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="txtsearchproducts.SetVal(\"0\")";
__ref._txtsearchproducts /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("0"));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="divproducts.SetHtml(\"\")";
__ref._divproducts /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml("");
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="ws.Flush";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Flush();
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="rs = sql1.ExecQuery($\"SELECT        ProductsInfo";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT        ProductsInformation.ProductID, ProductsInformation.ProductName, ProductsInformation.ProductPrice, ProductsInformation.ProductImage, ProductsInformation.CatID, ProductsInformation.CostPrice, \n"+"                         ProductsInformation.ProductBarcode, ProductsInformation.ProductTax, CatInfo.CatDesc\n"+"FROM            ProductsInformation LEFT OUTER JOIN\n"+"                         CatInfo ON ProductsInformation.CatID = CatInfo.CatID where ProductsInformation.CatID="+__c.SmartStringFormatter("",__ref._cmbcategory /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())+" "));
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=1179665;
 //BA.debugLineNum = 1179665;BA.debugLine="str =str & $\"<div class=\"card o-hidden bd-highl";
_str = _str+("<div class=\"card o-hidden bd-highlight m-1\">\n"+"                                   <a href='javascript:void(0);' onclick=\"sellproduct("+__c.SmartStringFormatter("",(Object)(_rs.GetInt("ProductID")))+")\" > <div class=\"list-thumb d-flex\"><img alt=\"\" src=\""+__c.SmartStringFormatter("",(Object)(_rs.GetString("ProductImage")))+"\"></div></a>\n"+"                                    <div class=\"flex-grow-1 d-bock\">\n"+"                                       <div class=\"card-body align-self-center d-flex flex-column justify-content-between align-items-lg-center\">\n"+"                                          <div class=\"w-40 w-sm-100 item-title\">"+__c.SmartStringFormatter("",(Object)(_rs.GetString("ProductName")))+"</div>\n"+"                                          <p class=\"text-muted text-small w-15 w-sm-100 mb-2\">"+__c.SmartStringFormatter("",(Object)(_rs.GetString("ProductBarcode")))+"</p>\n"+"                                          <span class=\"badge badge-primary w-15 w-sm-100 mb-2\">"+__c.SmartStringFormatter("",(Object)(__c.NumberFormat2((double)(Double.parseDouble(_rs.GetString("ProductPrice"))),(int) (1),(int) (2),(int) (2),__c.False)))+" L</span> \n"+"                                          \n"+"                                       </div>\n"+"                                    </div>\n"+"                                 </div>");
RDebugUtils.currentLine=1179677;
 //BA.debugLineNum = 1179677;BA.debugLine="divproducts.SetHtml(str)";
__ref._divproducts /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
RDebugUtils.currentLine=1179679;
 //BA.debugLineNum = 1179679;BA.debugLine="ws.Flush";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Flush();
 }
;
RDebugUtils.currentLine=1179683;
 //BA.debugLineNum = 1179683;BA.debugLine="rs.Close";
_rs.Close();
 } 
       catch (Exception e15) {
			ba.setLastException(e15);RDebugUtils.currentLine=1179686;
 //BA.debugLineNum = 1179686;BA.debugLine="Log(LastException)";
__c.LogImpl("21179686",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=1179688;
 //BA.debugLineNum = 1179688;BA.debugLine="End Sub";
return "";
}
public String  _delete_product(b4j.example.pagepos __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "delete_product", false))
	 {return ((String) Debug.delegate(ba, "delete_product", new Object[] {_params}));}
int _isfound = 0;
int _i = 0;
b4j.example.clstblsoldproducts _cls = null;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub Delete_Product (Params As Map)";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Try";
try {RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Dim IsFound As Int = -1";
_isfound = (int) (-1);
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProducts";
_cls = (b4j.example.clstblsoldproducts)(__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="If cls.PID = Params.Get(\"val\") Then";
if (_cls._pid /*int*/ ==(double)(BA.ObjectToNumber(_params.Get((Object)("val"))))) { 
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="IsFound = i";
_isfound = _i;
 };
 }
};
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="If IsFound > - 1 Then";
if (_isfound>-1) { 
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="txtdiscount.SetVal(\"0\")";
__ref._txtdiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("0"));
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="lstSoldProducts.RemoveAt(IsFound)";
__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_isfound);
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="Load_tblSoldProducts";
__ref._load_tblsoldproducts /*String*/ (null);
 };
 } 
       catch (Exception e15) {
			ba.setLastException(e15);RDebugUtils.currentLine=1310738;
 //BA.debugLineNum = 1310738;BA.debugLine="Log(LastException)";
__c.LogImpl("21310738",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=1310740;
 //BA.debugLineNum = 1310740;BA.debugLine="End Sub";
return "";
}
public String  _discount_change(b4j.example.pagepos __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "discount_change", false))
	 {return ((String) Debug.delegate(ba, "discount_change", new Object[] {_params}));}
String _str = "";
double _dbltotaltax = 0;
double _dblgrandtotal = 0;
int _i = 0;
b4j.example.clstblsoldproducts _cls = null;
double _tempdbltax = 0;
int _intcount = 0;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub discount_Change (Params As Map)";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Dim str As String = Params.Get(\"val\")";
_str = BA.ObjectToString(_params.Get((Object)("val")));
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="If str.Trim.Length > 0 And IsNumber(str.Trim) The";
if (_str.trim().length()>0 && __c.IsNumber(_str.trim())) { 
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="dbldiscount = Params.Get(\"val\")";
__ref._dbldiscount /*double*/  = (double)(BA.ObjectToNumber(_params.Get((Object)("val"))));
 }else {
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="dbldiscount = 0";
__ref._dbldiscount /*double*/  = 0;
 };
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="Dim dblTotalTax As Double = 0";
_dbltotaltax = 0;
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="Dim dblgrandTotal As Double = 0";
_dblgrandtotal = 0;
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProduct";
_cls = (b4j.example.clstblsoldproducts)(__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="Dim tempdbltax As Double = 0";
_tempdbltax = 0;
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="If cls.PTax > 0 Then";
if (_cls._ptax /*double*/ >0) { 
RDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="dblTotalTax = dblTotalTax + ((cls.PSellPrice";
_dbltotaltax = _dbltotaltax+((_cls._psellprice /*double*/ *_cls._pqty /*int*/ )*(_cls._ptax /*double*/ /(double)100));
RDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="tempdbltax = ((cls.PSellPrice * cls.PQty) * (";
_tempdbltax = ((_cls._psellprice /*double*/ *_cls._pqty /*int*/ )*(_cls._ptax /*double*/ /(double)100));
 };
RDebugUtils.currentLine=1048598;
 //BA.debugLineNum = 1048598;BA.debugLine="dblgrandTotal = dblgrandTotal + ((cls.PSellPri";
_dblgrandtotal = _dblgrandtotal+((_cls._psellprice /*double*/ *_cls._pqty /*int*/ )+_tempdbltax);
 }
};
RDebugUtils.currentLine=1048602;
 //BA.debugLineNum = 1048602;BA.debugLine="dblgrandTotal = dblgrandTotal - dbldiscount";
_dblgrandtotal = _dblgrandtotal-__ref._dbldiscount /*double*/ ;
RDebugUtils.currentLine=1048603;
 //BA.debugLineNum = 1048603;BA.debugLine="dblgrandTotal = dblgrandTotal + dblshipping";
_dblgrandtotal = _dblgrandtotal+__ref._dblshipping /*double*/ ;
RDebugUtils.currentLine=1048605;
 //BA.debugLineNum = 1048605;BA.debugLine="lblgrandtotal.SetHtml($\"<span>Total : ${NumberF";
__ref._lblgrandtotal /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(("<span>Total : "+__c.SmartStringFormatter("",(Object)(__c.NumberFormat2(_dblgrandtotal,(int) (1),(int) (3),(int) (0),__c.False)))+"L </span>"));
RDebugUtils.currentLine=1048606;
 //BA.debugLineNum = 1048606;BA.debugLine="txttax.SetVal(NumberFormat2(dblTotalTax,1,3,0,F";
__ref._txttax /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(__c.NumberFormat2(_dbltotaltax,(int) (1),(int) (3),(int) (0),__c.False)));
RDebugUtils.currentLine=1048607;
 //BA.debugLineNum = 1048607;BA.debugLine="ws.Flush";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Flush();
RDebugUtils.currentLine=1048610;
 //BA.debugLineNum = 1048610;BA.debugLine="Dim intcount As Int = 0";
_intcount = (int) (0);
RDebugUtils.currentLine=1048611;
 //BA.debugLineNum = 1048611;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
{
final int step24 = 1;
final int limit24 = (int) (__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=1048612;
 //BA.debugLineNum = 1048612;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProduc";
_cls = (b4j.example.clstblsoldproducts)(__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=1048613;
 //BA.debugLineNum = 1048613;BA.debugLine="intcount = intcount + cls.PQty";
_intcount = (int) (_intcount+_cls._pqty /*int*/ );
 }
};
RDebugUtils.currentLine=1048615;
 //BA.debugLineNum = 1048615;BA.debugLine="lblcototalproducts.SetHtml(intcount)";
__ref._lblcototalproducts /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(BA.NumberToString(_intcount));
RDebugUtils.currentLine=1048618;
 //BA.debugLineNum = 1048618;BA.debugLine="lblcototaltax.SetHtml(NumberFormat2(dblTotalTa";
__ref._lblcototaltax /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(__c.NumberFormat2(_dbltotaltax,(int) (1),(int) (3),(int) (0),__c.False)+" L");
RDebugUtils.currentLine=1048619;
 //BA.debugLineNum = 1048619;BA.debugLine="lblcototalshipping.SetHtml(NumberFormat2(dblsh";
__ref._lblcototalshipping /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(__c.NumberFormat2(__ref._dblshipping /*double*/ ,(int) (1),(int) (3),(int) (0),__c.False)+" L");
RDebugUtils.currentLine=1048620;
 //BA.debugLineNum = 1048620;BA.debugLine="lblcograndtotal.SetHtml(NumberFormat2(dblgrand";
__ref._lblcograndtotal /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(__c.NumberFormat2(_dblgrandtotal,(int) (1),(int) (3),(int) (0),__c.False)+" L");
RDebugUtils.currentLine=1048623;
 //BA.debugLineNum = 1048623;BA.debugLine="lblcototaldiscount.SetHtml(NumberFormat2(dbldi";
__ref._lblcototaldiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(__c.NumberFormat2(__ref._dbldiscount /*double*/ ,(int) (1),(int) (3),(int) (0),__c.False)+" L");
RDebugUtils.currentLine=1048626;
 //BA.debugLineNum = 1048626;BA.debugLine="GlobaldblGrandTotal = NumberFormat2(dblgrandTota";
__ref._globaldblgrandtotal /*double*/  = (double)(Double.parseDouble(__c.NumberFormat2(_dblgrandtotal,(int) (1),(int) (3),(int) (0),__c.False)));
RDebugUtils.currentLine=1048627;
 //BA.debugLineNum = 1048627;BA.debugLine="GlobaldblTotaldiscount = NumberFormat2(dbldiscou";
__ref._globaldbltotaldiscount /*double*/  = (double)(Double.parseDouble(__c.NumberFormat2(__ref._dbldiscount /*double*/ ,(int) (1),(int) (3),(int) (0),__c.False)));
RDebugUtils.currentLine=1048628;
 //BA.debugLineNum = 1048628;BA.debugLine="GlobaldblTotalTax = NumberFormat2(dblTotalTax,1,";
__ref._globaldbltotaltax /*double*/  = (double)(Double.parseDouble(__c.NumberFormat2(_dbltotaltax,(int) (1),(int) (3),(int) (0),__c.False)));
RDebugUtils.currentLine=1048630;
 //BA.debugLineNum = 1048630;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.pagepos __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="End Sub";
return "";
}
public String  _load_categories(b4j.example.pagepos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "load_categories", false))
	 {return ((String) Debug.delegate(ba, "load_categories", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Load_Categories";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Try";
try {RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="rs = sql1.ExecQuery(\"select * from CatInfo\")";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from CatInfo");
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="Dim val As String = rs.GetInt(\"CatID\")";
_val = BA.NumberToString(_rs.GetInt("CatID"));
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("CatDesc")).Append("</option>");
 }
;
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="cmbcategory.SetHtml(sb.ToString)";
__ref._cmbcategory /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="ws.Flush";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Flush();
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="Log(LastException)";
__c.LogImpl("2524304",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="End Sub";
return "";
}
public String  _load_paymenttypes(b4j.example.pagepos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "load_paymenttypes", false))
	 {return ((String) Debug.delegate(ba, "load_paymenttypes", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub Load_PaymentTypes";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Try";
try {RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="rs = sql1.ExecQuery(\"select * from PaymentTypesI";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from PaymentTypesInfo");
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="Dim val As String = rs.GetInt(\"PaymenttypeID\")";
_val = BA.NumberToString(_rs.GetInt("PaymenttypeID"));
RDebugUtils.currentLine=1572874;
 //BA.debugLineNum = 1572874;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("PaymentDesc")).Append("</option>");
 }
;
RDebugUtils.currentLine=1572876;
 //BA.debugLineNum = 1572876;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="cmbcopaymenttype.SetHtml(sb.ToString)";
__ref._cmbcopaymenttype /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
RDebugUtils.currentLine=1572878;
 //BA.debugLineNum = 1572878;BA.debugLine="ws.Flush";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Flush();
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=1572881;
 //BA.debugLineNum = 1572881;BA.debugLine="Log(LastException)";
__c.LogImpl("21572881",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=1572884;
 //BA.debugLineNum = 1572884;BA.debugLine="End Sub";
return "";
}
public String  _load_products(b4j.example.pagepos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "load_products", false))
	 {return ((String) Debug.delegate(ba, "load_products", null));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _str = "";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Load_Products";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Try";
try {RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="rs = sql1.ExecQuery($\"SELECT        ProductsInfo";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT        ProductsInformation.ProductID, ProductsInformation.ProductName, ProductsInformation.ProductPrice, ProductsInformation.ProductImage, ProductsInformation.CatID, ProductsInformation.CostPrice, \n"+"                         ProductsInformation.ProductBarcode, ProductsInformation.ProductTax, CatInfo.CatDesc\n"+"FROM            ProductsInformation LEFT OUTER JOIN\n"+"                         CatInfo ON ProductsInformation.CatID = CatInfo.CatID"));
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="str =str & $\"<div class=\"card o-hidden bd-highl";
_str = _str+("<div class=\"card o-hidden bd-highlight m-1\">\n"+"                                   <a href='javascript:void(0);' onclick=\"sellproduct("+__c.SmartStringFormatter("",(Object)(_rs.GetInt("ProductID")))+")\" > <div class=\"list-thumb d-flex\"><img alt=\"\" src=\""+__c.SmartStringFormatter("",(Object)(_rs.GetString("ProductImage")))+"\"></div></a>\n"+"                                    <div class=\"flex-grow-1 d-bock\">\n"+"                                       <div class=\"card-body align-self-center d-flex flex-column justify-content-between align-items-lg-center\">\n"+"                                          <div class=\"w-40 w-sm-100 item-title\">"+__c.SmartStringFormatter("",(Object)(_rs.GetString("ProductName")))+"</div>\n"+"                                          <p class=\"text-muted text-small w-15 w-sm-100 mb-2\">"+__c.SmartStringFormatter("",(Object)(_rs.GetString("ProductBarcode")))+"</p>\n"+"                                          <span class=\"badge badge-primary w-15 w-sm-100 mb-2\">"+__c.SmartStringFormatter("",(Object)(__c.NumberFormat2((double)(Double.parseDouble(_rs.GetString("ProductPrice"))),(int) (1),(int) (2),(int) (2),__c.False)))+" L</span> \n"+"                                          \n"+"                                       </div>\n"+"                                    </div>\n"+"                                 </div>");
RDebugUtils.currentLine=589848;
 //BA.debugLineNum = 589848;BA.debugLine="divproducts.SetHtml(str)";
__ref._divproducts /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
RDebugUtils.currentLine=589850;
 //BA.debugLineNum = 589850;BA.debugLine="ws.Flush";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Flush();
 }
;
RDebugUtils.currentLine=589854;
 //BA.debugLineNum = 589854;BA.debugLine="rs.Close";
_rs.Close();
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=589858;
 //BA.debugLineNum = 589858;BA.debugLine="Log(LastException)";
__c.LogImpl("2589858",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=589860;
 //BA.debugLineNum = 589860;BA.debugLine="End Sub";
return "";
}
public String  _minus_qty_tblproducts(b4j.example.pagepos __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "minus_qty_tblproducts", false))
	 {return ((String) Debug.delegate(ba, "minus_qty_tblproducts", new Object[] {_params}));}
int _i = 0;
b4j.example.clstblsoldproducts _cls = null;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub Minus_Qty_tblProducts (Params As Map)";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Try";
try {RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProducts";
_cls = (b4j.example.clstblsoldproducts)(__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="If cls.PID = Params.Get(\"val\") Then";
if (_cls._pid /*int*/ ==(double)(BA.ObjectToNumber(_params.Get((Object)("val"))))) { 
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="If cls.PQty > 1 Then";
if (_cls._pqty /*int*/ >1) { 
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="cls.PQty = cls.PQty - 1";
_cls._pqty /*int*/  = (int) (_cls._pqty /*int*/ -1);
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="cls.PSubTotal = cls.PSellPrice * cls.PQty";
_cls._psubtotal /*double*/  = _cls._psellprice /*double*/ *_cls._pqty /*int*/ ;
 };
 };
 }
};
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="Load_tblSoldProducts";
__ref._load_tblsoldproducts /*String*/ (null);
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=851985;
 //BA.debugLineNum = 851985;BA.debugLine="Log(LastException)";
__c.LogImpl("2851985",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=851987;
 //BA.debugLineNum = 851987;BA.debugLine="End Sub";
return "";
}
public String  _search_products(b4j.example.pagepos __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "search_products", false))
	 {return ((String) Debug.delegate(ba, "search_products", new Object[] {_params}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _str = "";
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub Search_Products (Params As Map)";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Try";
try {RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="divproducts.SetHtml(\"\")";
__ref._divproducts /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml("");
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="ws.Flush";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Flush();
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="rs = sql1.ExecQuery($\"SELECT        ProductsInfo";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT        ProductsInformation.ProductID, ProductsInformation.ProductName, ProductsInformation.ProductPrice, ProductsInformation.ProductImage, ProductsInformation.CatID, ProductsInformation.CostPrice, \n"+"                         ProductsInformation.ProductBarcode, ProductsInformation.ProductTax, CatInfo.CatDesc\n"+"FROM            ProductsInformation LEFT OUTER JOIN\n"+"                         CatInfo ON ProductsInformation.CatID = CatInfo.CatID where ProductsInformation.ProductName like '%"+__c.SmartStringFormatter("",_params.Get((Object)("val")))+"%' or ProductsInformation.ProductBarcode like '%"+__c.SmartStringFormatter("",_params.Get((Object)("val")))+"%' "));
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=1245200;
 //BA.debugLineNum = 1245200;BA.debugLine="str =str & $\"<div class=\"card o-hidden bd-highl";
_str = _str+("<div class=\"card o-hidden bd-highlight m-1\">\n"+"                                   <a href='javascript:void(0);' onclick=\"sellproduct("+__c.SmartStringFormatter("",(Object)(_rs.GetInt("ProductID")))+")\" > <div class=\"list-thumb d-flex\"><img alt=\"\" src=\""+__c.SmartStringFormatter("",(Object)(_rs.GetString("ProductImage")))+"\"></div></a>\n"+"                                    <div class=\"flex-grow-1 d-bock\">\n"+"                                       <div class=\"card-body align-self-center d-flex flex-column justify-content-between align-items-lg-center\">\n"+"                                          <div class=\"w-40 w-sm-100 item-title\">"+__c.SmartStringFormatter("",(Object)(_rs.GetString("ProductName")))+"</div>\n"+"                                          <p class=\"text-muted text-small w-15 w-sm-100 mb-2\">"+__c.SmartStringFormatter("",(Object)(_rs.GetString("ProductBarcode")))+"</p>\n"+"                                          <span class=\"badge badge-primary w-15 w-sm-100 mb-2\">"+__c.SmartStringFormatter("",(Object)(__c.NumberFormat2((double)(Double.parseDouble(_rs.GetString("ProductPrice"))),(int) (1),(int) (2),(int) (2),__c.False)))+" L</span> \n"+"                                          \n"+"                                       </div>\n"+"                                    </div>\n"+"                                 </div>");
RDebugUtils.currentLine=1245212;
 //BA.debugLineNum = 1245212;BA.debugLine="divproducts.SetHtml(str)";
__ref._divproducts /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
RDebugUtils.currentLine=1245214;
 //BA.debugLineNum = 1245214;BA.debugLine="ws.Flush";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Flush();
 }
;
RDebugUtils.currentLine=1245218;
 //BA.debugLineNum = 1245218;BA.debugLine="rs.Close";
_rs.Close();
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=1245222;
 //BA.debugLineNum = 1245222;BA.debugLine="Log(LastException)";
__c.LogImpl("21245222",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=1245224;
 //BA.debugLineNum = 1245224;BA.debugLine="End Sub";
return "";
}
public String  _sell_product(b4j.example.pagepos __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "sell_product", false))
	 {return ((String) Debug.delegate(ba, "sell_product", new Object[] {_params}));}
int _isfound = 0;
int _i = 0;
b4j.example.clstblsoldproducts _cls = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub Sell_Product (Params As Map)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Try";
try {RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="Dim isFound As Int = 0";
_isfound = (int) (0);
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProducts";
_cls = (b4j.example.clstblsoldproducts)(__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="If cls.PID = Params.Get(\"val\") Then";
if (_cls._pid /*int*/ ==(double)(BA.ObjectToNumber(_params.Get((Object)("val"))))) { 
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="isFound = 1";
_isfound = (int) (1);
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="cls.PQty = cls.PQty + 1";
_cls._pqty /*int*/  = (int) (_cls._pqty /*int*/ +1);
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="cls.PSubTotal = cls.PSellPrice * cls.PQty";
_cls._psubtotal /*double*/  = _cls._psellprice /*double*/ *_cls._pqty /*int*/ ;
 };
 }
};
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="If isFound = 0 Then";
if (_isfound==0) { 
RDebugUtils.currentLine=655377;
 //BA.debugLineNum = 655377;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=655378;
 //BA.debugLineNum = 655378;BA.debugLine="rs = sql1.ExecQuery(\"select * from ProductsInfo";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from ProductsInformation where ProductID="+BA.ObjectToString(_params.Get((Object)("val"))));
RDebugUtils.currentLine=655379;
 //BA.debugLineNum = 655379;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=655380;
 //BA.debugLineNum = 655380;BA.debugLine="Dim cls As ClstblSoldProducts";
_cls = new b4j.example.clstblsoldproducts();
RDebugUtils.currentLine=655381;
 //BA.debugLineNum = 655381;BA.debugLine="cls.Initialize";
_cls._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=655382;
 //BA.debugLineNum = 655382;BA.debugLine="cls.Setup(rs.GetInt(\"ProductID\"),rs.GetString(";
_cls._setup /*String*/ (null,_rs.GetInt("ProductID"),_rs.GetString("ProductName"),_rs.GetDouble("ProductPrice"),_rs.GetDouble("CostPrice"),_rs.GetInt("ProductTax"),(int) (1),_rs.GetDouble("ProductPrice"));
RDebugUtils.currentLine=655384;
 //BA.debugLineNum = 655384;BA.debugLine="lstSoldProducts.Add(cls)";
__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cls));
 }
;
RDebugUtils.currentLine=655387;
 //BA.debugLineNum = 655387;BA.debugLine="rs.Close";
_rs.Close();
 };
RDebugUtils.currentLine=655391;
 //BA.debugLineNum = 655391;BA.debugLine="Load_tblSoldProducts";
__ref._load_tblsoldproducts /*String*/ (null);
 } 
       catch (Exception e24) {
			ba.setLastException(e24);RDebugUtils.currentLine=655394;
 //BA.debugLineNum = 655394;BA.debugLine="Log(LastException)";
__c.LogImpl("2655394",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=655396;
 //BA.debugLineNum = 655396;BA.debugLine="End Sub";
return "";
}
public String  _shipping_change(b4j.example.pagepos __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "shipping_change", false))
	 {return ((String) Debug.delegate(ba, "shipping_change", new Object[] {_params}));}
String _str = "";
double _dbltotaltax = 0;
double _dblgrandtotal = 0;
int _i = 0;
b4j.example.clstblsoldproducts _cls = null;
double _tempdbltax = 0;
int _intcount = 0;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub shipping_Change (Params As Map)";
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Dim str As String = Params.Get(\"val\")";
_str = BA.ObjectToString(_params.Get((Object)("val")));
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="If str.Trim.Length > 0 And IsNumber(str.Trim) The";
if (_str.trim().length()>0 && __c.IsNumber(_str.trim())) { 
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="dblshipping = Params.Get(\"val\")";
__ref._dblshipping /*double*/  = (double)(BA.ObjectToNumber(_params.Get((Object)("val"))));
 }else {
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="dblshipping = 0";
__ref._dblshipping /*double*/  = 0;
 };
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="Dim dblTotalTax As Double = 0";
_dbltotaltax = 0;
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="Dim dblgrandTotal As Double = 0";
_dblgrandtotal = 0;
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=1114129;
 //BA.debugLineNum = 1114129;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProduct";
_cls = (b4j.example.clstblsoldproducts)(__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=1114131;
 //BA.debugLineNum = 1114131;BA.debugLine="Dim tempdbltax As Double = 0";
_tempdbltax = 0;
RDebugUtils.currentLine=1114132;
 //BA.debugLineNum = 1114132;BA.debugLine="If cls.PTax > 0 Then";
if (_cls._ptax /*double*/ >0) { 
RDebugUtils.currentLine=1114133;
 //BA.debugLineNum = 1114133;BA.debugLine="dblTotalTax = dblTotalTax + ((cls.PSellPrice";
_dbltotaltax = _dbltotaltax+((_cls._psellprice /*double*/ *_cls._pqty /*int*/ )*(_cls._ptax /*double*/ /(double)100));
RDebugUtils.currentLine=1114134;
 //BA.debugLineNum = 1114134;BA.debugLine="tempdbltax = ((cls.PSellPrice * cls.PQty) * (";
_tempdbltax = ((_cls._psellprice /*double*/ *_cls._pqty /*int*/ )*(_cls._ptax /*double*/ /(double)100));
 };
RDebugUtils.currentLine=1114136;
 //BA.debugLineNum = 1114136;BA.debugLine="dblgrandTotal = dblgrandTotal + ((cls.PSellPri";
_dblgrandtotal = _dblgrandtotal+((_cls._psellprice /*double*/ *_cls._pqty /*int*/ )+_tempdbltax);
 }
};
RDebugUtils.currentLine=1114140;
 //BA.debugLineNum = 1114140;BA.debugLine="dblgrandTotal = dblgrandTotal - dbldiscount";
_dblgrandtotal = _dblgrandtotal-__ref._dbldiscount /*double*/ ;
RDebugUtils.currentLine=1114142;
 //BA.debugLineNum = 1114142;BA.debugLine="dblgrandTotal = dblgrandTotal + dblshipping";
_dblgrandtotal = _dblgrandtotal+__ref._dblshipping /*double*/ ;
RDebugUtils.currentLine=1114145;
 //BA.debugLineNum = 1114145;BA.debugLine="lblgrandtotal.SetHtml($\"<span>Total : ${NumberF";
__ref._lblgrandtotal /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(("<span>Total : "+__c.SmartStringFormatter("",(Object)(__c.NumberFormat2(_dblgrandtotal,(int) (1),(int) (3),(int) (0),__c.False)))+"L </span>"));
RDebugUtils.currentLine=1114146;
 //BA.debugLineNum = 1114146;BA.debugLine="txttax.SetVal(NumberFormat2(dblTotalTax,1,3,0,F";
__ref._txttax /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(__c.NumberFormat2(_dbltotaltax,(int) (1),(int) (3),(int) (0),__c.False)));
RDebugUtils.currentLine=1114147;
 //BA.debugLineNum = 1114147;BA.debugLine="ws.Flush";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Flush();
RDebugUtils.currentLine=1114151;
 //BA.debugLineNum = 1114151;BA.debugLine="Dim intcount As Int = 0";
_intcount = (int) (0);
RDebugUtils.currentLine=1114152;
 //BA.debugLineNum = 1114152;BA.debugLine="For i = 0 To lstSoldProducts.Size -1";
{
final int step24 = 1;
final int limit24 = (int) (__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=1114153;
 //BA.debugLineNum = 1114153;BA.debugLine="Dim cls As ClstblSoldProducts = lstSoldProduc";
_cls = (b4j.example.clstblsoldproducts)(__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=1114154;
 //BA.debugLineNum = 1114154;BA.debugLine="intcount = intcount + cls.PQty";
_intcount = (int) (_intcount+_cls._pqty /*int*/ );
 }
};
RDebugUtils.currentLine=1114156;
 //BA.debugLineNum = 1114156;BA.debugLine="lblcototalproducts.SetHtml(intcount)";
__ref._lblcototalproducts /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(BA.NumberToString(_intcount));
RDebugUtils.currentLine=1114159;
 //BA.debugLineNum = 1114159;BA.debugLine="lblcototaltax.SetHtml(NumberFormat2(dblTotalTa";
__ref._lblcototaltax /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(__c.NumberFormat2(_dbltotaltax,(int) (1),(int) (3),(int) (0),__c.False)+" L");
RDebugUtils.currentLine=1114160;
 //BA.debugLineNum = 1114160;BA.debugLine="lblcototalshipping.SetHtml(NumberFormat2(dblsh";
__ref._lblcototalshipping /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(__c.NumberFormat2(__ref._dblshipping /*double*/ ,(int) (1),(int) (3),(int) (0),__c.False)+" L");
RDebugUtils.currentLine=1114161;
 //BA.debugLineNum = 1114161;BA.debugLine="lblcograndtotal.SetHtml(NumberFormat2(dblgrand";
__ref._lblcograndtotal /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(__c.NumberFormat2(_dblgrandtotal,(int) (1),(int) (3),(int) (0),__c.False)+" L");
RDebugUtils.currentLine=1114164;
 //BA.debugLineNum = 1114164;BA.debugLine="lblcototaldiscount.SetHtml(NumberFormat2(dbldi";
__ref._lblcototaldiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(__c.NumberFormat2(__ref._dbldiscount /*double*/ ,(int) (1),(int) (3),(int) (0),__c.False)+" L");
RDebugUtils.currentLine=1114167;
 //BA.debugLineNum = 1114167;BA.debugLine="GlobaldblGrandTotal = NumberFormat2(dblgrandTota";
__ref._globaldblgrandtotal /*double*/  = (double)(Double.parseDouble(__c.NumberFormat2(_dblgrandtotal,(int) (1),(int) (3),(int) (0),__c.False)));
RDebugUtils.currentLine=1114168;
 //BA.debugLineNum = 1114168;BA.debugLine="GlobaldblTotaldiscount = NumberFormat2(dbldiscou";
__ref._globaldbltotaldiscount /*double*/  = (double)(Double.parseDouble(__c.NumberFormat2(__ref._dbldiscount /*double*/ ,(int) (1),(int) (3),(int) (0),__c.False)));
RDebugUtils.currentLine=1114169;
 //BA.debugLineNum = 1114169;BA.debugLine="GlobaldblTotalTax = NumberFormat2(dblTotalTax,1,";
__ref._globaldbltotaltax /*double*/  = (double)(Double.parseDouble(__c.NumberFormat2(_dbltotaltax,(int) (1),(int) (3),(int) (0),__c.False)));
RDebugUtils.currentLine=1114171;
 //BA.debugLineNum = 1114171;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.pagepos __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="lstSoldProducts.Initialize";
__ref._lstsoldproducts /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="Reset_Tbl";
__ref._reset_tbl /*String*/ (null);
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="GlobaldblGrandTotal = 0";
__ref._globaldblgrandtotal /*double*/  = 0;
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="GlobaldblTotaldiscount = 0";
__ref._globaldbltotaldiscount /*double*/  = 0;
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="GlobaldblTotalTax = 0";
__ref._globaldbltotaltax /*double*/  = 0;
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="dbldiscount = 0";
__ref._dbldiscount /*double*/  = 0;
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="Load_Categories";
__ref._load_categories /*String*/ (null);
RDebugUtils.currentLine=393228;
 //BA.debugLineNum = 393228;BA.debugLine="Load_Products";
__ref._load_products /*String*/ (null);
RDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="Load_Customers";
__ref._load_customers /*String*/ (null);
RDebugUtils.currentLine=393230;
 //BA.debugLineNum = 393230;BA.debugLine="Load_PaymentTypes";
__ref._load_paymenttypes /*String*/ (null);
RDebugUtils.currentLine=393232;
 //BA.debugLineNum = 393232;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.pagepos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagepos";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="End Sub";
return "";
}
}