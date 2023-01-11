package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class addsalesinfo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.addsalesinfo", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.addsalesinfo.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtinvdate = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _cmbcustomer = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _cmbuser = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtinvnote = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _cmbproduct = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txttax = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtunitprice = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtqty = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtdiscount = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _btnaddproduct = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _btnsave = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _btncancel = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divproducts = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _cmbpaymenttype = null;
public anywheresoftware.b4a.objects.collections.List _tempproductstable = null;
public anywheresoftware.b4a.objects.collections.List _templistcmbcustomer = null;
public anywheresoftware.b4a.objects.collections.List _templistpaymenttype = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblusernamemain = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divmenu = null;
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public b4j.example.main _main = null;
public String  _btnaddproduct_click(b4j.example.addsalesinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsalesinfo";
if (Debug.shouldDelegate(ba, "btnaddproduct_click", false))
	 {return ((String) Debug.delegate(ba, "btnaddproduct_click", new Object[] {_params}));}
b4j.example.clstempproducts _classtempprod = null;
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Sub btnaddproduct_Click (Params As Map)";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="Try";
try {RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="If cmbproduct.GetVal.Value = \"0\" Or txtunitprice";
if ((__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("0")) || (__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtqty /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtdiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=11403271;
 //BA.debugLineNum = 11403271;BA.debugLine="ClassTempProd.Initialize";
_classtempprod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=11403272;
 //BA.debugLineNum = 11403272;BA.debugLine="ClassTempProd.SetValues(cmbproduct.GetVal.Value,";
_classtempprod._setvalues /*String*/ (null,(int)(BA.ObjectToNumber(__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(int)(BA.ObjectToNumber(__ref._txttax /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(float)(BA.ObjectToNumber(__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(int)(BA.ObjectToNumber(__ref._txtqty /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(float)(BA.ObjectToNumber(__ref._txtdiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())));
RDebugUtils.currentLine=11403274;
 //BA.debugLineNum = 11403274;BA.debugLine="TempProductsTable.Add(ClassTempProd)";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_classtempprod));
RDebugUtils.currentLine=11403275;
 //BA.debugLineNum = 11403275;BA.debugLine="Load_AddedProducts_Temp";
__ref._load_addedproducts_temp /*String*/ (null);
RDebugUtils.currentLine=11403277;
 //BA.debugLineNum = 11403277;BA.debugLine="txtunitprice.SetVal(\"0\")";
__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("0"));
RDebugUtils.currentLine=11403278;
 //BA.debugLineNum = 11403278;BA.debugLine="txtqty.SetVal(\"0\")";
__ref._txtqty /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("0"));
RDebugUtils.currentLine=11403279;
 //BA.debugLineNum = 11403279;BA.debugLine="txtdiscount.SetVal(\"0\")";
__ref._txtdiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("0"));
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=11403282;
 //BA.debugLineNum = 11403282;BA.debugLine="Log(LastException)";
__c.LogImpl("211403282",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=11403284;
 //BA.debugLineNum = 11403284;BA.debugLine="End Sub";
return "";
}
public String  _load_addedproducts_temp(b4j.example.addsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsalesinfo";
if (Debug.shouldDelegate(ba, "load_addedproducts_temp", false))
	 {return ((String) Debug.delegate(ba, "load_addedproducts_temp", null));}
String _str = "";
int _i = 0;
b4j.example.clstempproducts _classtempprod = null;
float _taxperc = 0f;
float _totalamount = 0f;
float _temptotalamount = 0f;
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Sub Load_AddedProducts_Temp";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="Try";
try {RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Product Name</th>\n"+"									                  <th class=\"wd-20p\">Unit Price</th>\n"+"									                  <th class=\"wd-10p\">Quantity</th>\n"+"									                  <th class=\"wd-15p\">Total</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=11534354;
 //BA.debugLineNum = 11534354;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=11534356;
 //BA.debugLineNum = 11534356;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=11534357;
 //BA.debugLineNum = 11534357;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=11534359;
 //BA.debugLineNum = 11534359;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=11534360;
 //BA.debugLineNum = 11534360;BA.debugLine="str = str & \"<td>\"& ClassTempProd.ProductID &\"<";
_str = _str+"<td>"+BA.NumberToString(_classtempprod._productid /*int*/ )+"</td>";
RDebugUtils.currentLine=11534361;
 //BA.debugLineNum = 11534361;BA.debugLine="str = str & \"<td>\"& ClassTempProd.ProductName &";
_str = _str+"<td>"+_classtempprod._productname /*String*/ +"</td>";
RDebugUtils.currentLine=11534362;
 //BA.debugLineNum = 11534362;BA.debugLine="str = str & \"<td>\"& ClassTempProd.UnitPrice &\"<";
_str = _str+"<td>"+BA.NumberToString(_classtempprod._unitprice /*double*/ )+"</td>";
RDebugUtils.currentLine=11534363;
 //BA.debugLineNum = 11534363;BA.debugLine="str = str & \"<td>\"& ClassTempProd.Qty &\"</td>\"";
_str = _str+"<td>"+BA.NumberToString(_classtempprod._qty /*int*/ )+"</td>";
RDebugUtils.currentLine=11534365;
 //BA.debugLineNum = 11534365;BA.debugLine="Dim taxPerc As Float = 0";
_taxperc = (float) (0);
RDebugUtils.currentLine=11534366;
 //BA.debugLineNum = 11534366;BA.debugLine="taxPerc = ClassTempProd.TaxID";
_taxperc = (float) (_classtempprod._taxid /*int*/ );
RDebugUtils.currentLine=11534368;
 //BA.debugLineNum = 11534368;BA.debugLine="Dim TotalAmount As Float =  ((ClassTempProd.Uni";
_totalamount = (float) (((_classtempprod._unitprice /*double*/ *_classtempprod._qty /*int*/ )-_classtempprod._discount /*double*/ ));
RDebugUtils.currentLine=11534369;
 //BA.debugLineNum = 11534369;BA.debugLine="Dim TempTotalAmount As Float = 0";
_temptotalamount = (float) (0);
RDebugUtils.currentLine=11534370;
 //BA.debugLineNum = 11534370;BA.debugLine="If taxPerc > 0 Then";
if (_taxperc>0) { 
RDebugUtils.currentLine=11534371;
 //BA.debugLineNum = 11534371;BA.debugLine="TempTotalAmount = TotalAmount";
_temptotalamount = _totalamount;
RDebugUtils.currentLine=11534372;
 //BA.debugLineNum = 11534372;BA.debugLine="TempTotalAmount = TempTotalAmount * (taxPerc /";
_temptotalamount = (float) (_temptotalamount*(_taxperc/(double)100));
 };
RDebugUtils.currentLine=11534375;
 //BA.debugLineNum = 11534375;BA.debugLine="str = str & \"<td>\"& NumberFormat((TotalAmount +";
_str = _str+"<td>"+__c.NumberFormat((_totalamount+_temptotalamount),(int) (0),(int) (4))+"</td>";
RDebugUtils.currentLine=11534377;
 //BA.debugLineNum = 11534377;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"deleteproductTbl("+BA.NumberToString(_i)+")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "+" </td> </tr>";
 }
};
RDebugUtils.currentLine=11534383;
 //BA.debugLineNum = 11534383;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
RDebugUtils.currentLine=11534385;
 //BA.debugLineNum = 11534385;BA.debugLine="divproducts.SetHtml(str)";
__ref._divproducts /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
RDebugUtils.currentLine=11534387;
 //BA.debugLineNum = 11534387;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
 } 
       catch (Exception e27) {
			ba.setLastException(e27);RDebugUtils.currentLine=11534390;
 //BA.debugLineNum = 11534390;BA.debugLine="Log(LastException)";
__c.LogImpl("211534390",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=11534392;
 //BA.debugLineNum = 11534392;BA.debugLine="End Sub";
return "";
}
public String  _btncancel_click(b4j.example.addsalesinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsalesinfo";
if (Debug.shouldDelegate(ba, "btncancel_click", false))
	 {return ((String) Debug.delegate(ba, "btncancel_click", new Object[] {_params}));}
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Sub btncancel_Click (Params As Map)";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="ws.Eval(\"document.location.replace('SalesInforma";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('SalesInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="End Sub";
return "";
}
public String  _btnsave_click(b4j.example.addsalesinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsalesinfo";
if (Debug.shouldDelegate(ba, "btnsave_click", false))
	 {return ((String) Debug.delegate(ba, "btnsave_click", new Object[] {_params}));}
int _lastsavedid = 0;
int _invoiceid = 0;
double _dblinvtotal = 0;
double _dblinvtotaltax = 0;
double _dblinvtotaldiscount = 0;
int _i = 0;
b4j.example.clstempproducts _classtempprod = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Sub btnsave_Click (Params As Map)";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="Try";
try {RDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="Dim LastSavedID As Int = 0";
_lastsavedid = (int) (0);
RDebugUtils.currentLine=11665414;
 //BA.debugLineNum = 11665414;BA.debugLine="If txtinvdate.GetVal.Value = \"\"  Then";
if ((__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=11665415;
 //BA.debugLineNum = 11665415;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11665418;
 //BA.debugLineNum = 11665418;BA.debugLine="Dim InvoiceID As Int = 0";
_invoiceid = (int) (0);
RDebugUtils.currentLine=11665419;
 //BA.debugLineNum = 11665419;BA.debugLine="If ws.Session.GetAttribute(\"InvoiceID\") = Null T";
if (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")== null) { 
 }else {
RDebugUtils.currentLine=11665422;
 //BA.debugLineNum = 11665422;BA.debugLine="InvoiceID = ws.Session.GetAttribute(\"InvoiceID\"";
_invoiceid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")));
RDebugUtils.currentLine=11665423;
 //BA.debugLineNum = 11665423;BA.debugLine="LastSavedID = InvoiceID";
_lastsavedid = _invoiceid;
 };
RDebugUtils.currentLine=11665426;
 //BA.debugLineNum = 11665426;BA.debugLine="Dim dblinvtotal,dblinvtotaltax,dblinvtotaldisco";
_dblinvtotal = 0;
_dblinvtotaltax = 0;
_dblinvtotaldiscount = 0;
RDebugUtils.currentLine=11665428;
 //BA.debugLineNum = 11665428;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=11665430;
 //BA.debugLineNum = 11665430;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=11665431;
 //BA.debugLineNum = 11665431;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=11665433;
 //BA.debugLineNum = 11665433;BA.debugLine="dblinvtotal = ClassTempProd.Qty * ClassTempPr";
_dblinvtotal = _classtempprod._qty /*int*/ *_classtempprod._unitprice /*double*/ ;
RDebugUtils.currentLine=11665434;
 //BA.debugLineNum = 11665434;BA.debugLine="dblinvtotaltax = dblinvtotal * (ClassTempProd";
_dblinvtotaltax = _dblinvtotal*(_classtempprod._taxid /*int*/ /(double)100);
RDebugUtils.currentLine=11665435;
 //BA.debugLineNum = 11665435;BA.debugLine="dblinvtotaldiscount = ClassTempProd.Discount";
_dblinvtotaldiscount = _classtempprod._discount /*double*/ ;
 }
};
RDebugUtils.currentLine=11665438;
 //BA.debugLineNum = 11665438;BA.debugLine="dblinvtotal = dblinvtotal + dblinvtotaltax";
_dblinvtotal = _dblinvtotal+_dblinvtotaltax;
RDebugUtils.currentLine=11665439;
 //BA.debugLineNum = 11665439;BA.debugLine="dblinvtotal = dblinvtotal - dblinvtotaldiscoun";
_dblinvtotal = _dblinvtotal-_dblinvtotaldiscount;
RDebugUtils.currentLine=11665441;
 //BA.debugLineNum = 11665441;BA.debugLine="If InvoiceID > 0 Then";
if (_invoiceid>0) { 
RDebugUtils.currentLine=11665446;
 //BA.debugLineNum = 11665446;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=11665447;
 //BA.debugLineNum = 11665447;BA.debugLine="sql1.ExecNonQuery2($\"UPDATE SalesInvoiceH";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("UPDATE SalesInvoiceH\n"+"				   SET InvDT = ?\n"+"				      ,InvTotal = ?\n"+"				      ,UserID = ?\n"+"				      ,InvTotalTax = ?\n"+"				      ,InvTotalDiscount = ?\n"+"				      ,InvTotalShipping = ?\n"+"				      ,PaidAmount = ?\n"+"				      ,StrNotes = ?\n"+"				      ,PaymenttypeID = ?\n"+"				      ,CustomerID = ?\n"+"				 WHERE SalesInvoiceHID=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_dblinvtotal),__ref._cmbuser /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_dblinvtotaltax),(Object)(_dblinvtotaldiscount),(Object)(0),(Object)(0),__ref._txtinvnote /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._cmbpaymenttype /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._cmbcustomer /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_invoiceid)}));
RDebugUtils.currentLine=11665460;
 //BA.debugLineNum = 11665460;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=11665462;
 //BA.debugLineNum = 11665462;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=11665463;
 //BA.debugLineNum = 11665463;BA.debugLine="sql1.ExecNonQuery2(\"delete from SalesInvoiceD";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("delete from SalesInvoiceD where SalesInvoiceHID=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_invoiceid)}));
RDebugUtils.currentLine=11665464;
 //BA.debugLineNum = 11665464;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=11665466;
 //BA.debugLineNum = 11665466;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step29 = 1;
final int limit29 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit29 ;_i = _i + step29 ) {
RDebugUtils.currentLine=11665468;
 //BA.debugLineNum = 11665468;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=11665469;
 //BA.debugLineNum = 11665469;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=11665471;
 //BA.debugLineNum = 11665471;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=11665472;
 //BA.debugLineNum = 11665472;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO SalesInvoice";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO SalesInvoiceD\n"+"			           (SalesInvoiceHID\n"+"			           ,ProductID\n"+"			           ,ProductSellPrice\n"+"			           ,ProductCostPrice\n"+"			           ,TaxPerc\n"+"			           ,ProductQty)\n"+"			     VALUES\n"+"			           (?\n"+"			           ,?\n"+"			           ,?\n"+"			           ,?\n"+"			           ,?\n"+"			           ,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_invoiceid),(Object)(_classtempprod._productid /*int*/ ),(Object)(_classtempprod._unitprice /*double*/ ),(Object)(_classtempprod._productcostprice /*double*/ ),(Object)(_classtempprod._taxid /*int*/ ),(Object)(_classtempprod._qty /*int*/ )}));
RDebugUtils.currentLine=11665486;
 //BA.debugLineNum = 11665486;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }
};
 }else {
RDebugUtils.currentLine=11665495;
 //BA.debugLineNum = 11665495;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=11665496;
 //BA.debugLineNum = 11665496;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO SalesInvoice";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO SalesInvoiceH\n"+"				           (InvDT\n"+"				           ,InvTotal\n"+"				           ,UserID\n"+"				           ,InvTotalTax\n"+"				           ,InvTotalDiscount\n"+"				           ,InvTotalShipping\n"+"				           ,PaidAmount\n"+"				           ,StrNotes\n"+"				           ,PaymenttypeID\n"+"				           ,CustomerID)\n"+"				     VALUES\n"+"				           (?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_dblinvtotal),__ref._cmbuser /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_dblinvtotaltax),(Object)(_dblinvtotaldiscount),(Object)(0),(Object)(0),__ref._txtinvnote /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._cmbpaymenttype /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._cmbcustomer /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()}));
RDebugUtils.currentLine=11665519;
 //BA.debugLineNum = 11665519;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=11665521;
 //BA.debugLineNum = 11665521;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=11665522;
 //BA.debugLineNum = 11665522;BA.debugLine="rs = sql1.ExecQuery(\"select SalesInvoiceHID f";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select SalesInvoiceHID from SalesInvoiceH order by SalesInvoiceHID desc limit 1");
RDebugUtils.currentLine=11665523;
 //BA.debugLineNum = 11665523;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=11665524;
 //BA.debugLineNum = 11665524;BA.debugLine="LastSavedID = rs.GetInt(\"SalesInvoiceHID\")";
_lastsavedid = _rs.GetInt("SalesInvoiceHID");
 }
;
RDebugUtils.currentLine=11665526;
 //BA.debugLineNum = 11665526;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=11665528;
 //BA.debugLineNum = 11665528;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step46 = 1;
final int limit46 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit46 ;_i = _i + step46 ) {
RDebugUtils.currentLine=11665529;
 //BA.debugLineNum = 11665529;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=11665530;
 //BA.debugLineNum = 11665530;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=11665532;
 //BA.debugLineNum = 11665532;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=11665533;
 //BA.debugLineNum = 11665533;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO SalesInvoi";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO SalesInvoiceD\n"+"					           (SalesInvoiceHID\n"+"					           ,ProductID\n"+"					           ,ProductSellPrice\n"+"					           ,ProductCostPrice\n"+"					           ,TaxPerc\n"+"					           ,ProductQty)\n"+"					     VALUES\n"+"					           (?\n"+"					           ,?\n"+"					           ,?\n"+"					           ,?\n"+"					           ,?\n"+"					           ,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_lastsavedid),(Object)(_classtempprod._productid /*int*/ ),(Object)(_classtempprod._unitprice /*double*/ ),(Object)(_classtempprod._productcostprice /*double*/ ),(Object)(_classtempprod._taxid /*int*/ ),(Object)(_classtempprod._qty /*int*/ )}));
RDebugUtils.currentLine=11665547;
 //BA.debugLineNum = 11665547;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }
};
 };
RDebugUtils.currentLine=11665554;
 //BA.debugLineNum = 11665554;BA.debugLine="Main.Insert_UsersLogs(ws,\"Invoice Information\")";
_main._insert_userslogs /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,"Invoice Information");
RDebugUtils.currentLine=11665557;
 //BA.debugLineNum = 11665557;BA.debugLine="ws.Eval(\"document.location.replace('SalesInforma";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('SalesInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e57) {
			ba.setLastException(e57);RDebugUtils.currentLine=11665560;
 //BA.debugLineNum = 11665560;BA.debugLine="Log(LastException)";
__c.LogImpl("211665560",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=11665562;
 //BA.debugLineNum = 11665562;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.addsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsalesinfo";
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="Private txtinvdate,cmbcustomer,cmbuser,txtinvnote";
_txtinvdate = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_cmbcustomer = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_cmbuser = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtinvnote = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_cmbproduct = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txttax = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtunitprice = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtqty = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtdiscount = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_btnaddproduct = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_btnsave = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_btncancel = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_divproducts = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_cmbpaymenttype = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="Private TempProductsTable As List";
_tempproductstable = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10878983;
 //BA.debugLineNum = 10878983;BA.debugLine="Private templistcmbcustomer As List";
_templistcmbcustomer = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10878984;
 //BA.debugLineNum = 10878984;BA.debugLine="Private templistpaymenttype As List";
_templistpaymenttype = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10878985;
 //BA.debugLineNum = 10878985;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=10878986;
 //BA.debugLineNum = 10878986;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=10878987;
 //BA.debugLineNum = 10878987;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=10878989;
 //BA.debugLineNum = 10878989;BA.debugLine="End Sub";
return "";
}
public String  _cmbproduct_change(b4j.example.addsalesinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsalesinfo";
if (Debug.shouldDelegate(ba, "cmbproduct_change", false))
	 {return ((String) Debug.delegate(ba, "cmbproduct_change", new Object[] {_params}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Sub cmbproduct_Change (Params As Map)";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="Try";
try {RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="rs = sql1.ExecQuery(\"select ProductPrice from Pr";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select ProductPrice from ProductsInformation where ProductID="+BA.ObjectToString(__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()));
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="txtunitprice.SetVal(rs.GetString(\"ProductPrice\"";
__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("ProductPrice")));
 }
;
RDebugUtils.currentLine=11468807;
 //BA.debugLineNum = 11468807;BA.debugLine="rs.Close";
_rs.Close();
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=11468810;
 //BA.debugLineNum = 11468810;BA.debugLine="Log(LastException)";
__c.LogImpl("211468810",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=11468812;
 //BA.debugLineNum = 11468812;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table_products(b4j.example.addsalesinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsalesinfo";
if (Debug.shouldDelegate(ba, "delete_button_table_products", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table_products", new Object[] {_params}));}
int _index = 0;
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Private Sub Delete_button_table_Products(params As";
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="Dim index As Int = params.Get(\"val\")";
_index = (int)(BA.ObjectToNumber(_params.Get((Object)("val"))));
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="TempProductsTable.RemoveAt(index)";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=11599877;
 //BA.debugLineNum = 11599877;BA.debugLine="Load_AddedProducts_Temp";
__ref._load_addedproducts_temp /*String*/ (null);
RDebugUtils.currentLine=11599879;
 //BA.debugLineNum = 11599879;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.addsalesinfo __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="addsalesinfo";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.addsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsalesinfo";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="Try";
try {RDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"  bLengthChange: false,\n"+"  searching: false,\n"+"  responsive: true\n"+"});\n"+"\n"+"      });");
RDebugUtils.currentLine=11862031;
 //BA.debugLineNum = 11862031;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=11862034;
 //BA.debugLineNum = 11862034;BA.debugLine="Log(LastException)";
__c.LogImpl("211862034",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=11862036;
 //BA.debugLineNum = 11862036;BA.debugLine="End Sub";
return "";
}
public String  _load_customer(b4j.example.addsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsalesinfo";
if (Debug.shouldDelegate(ba, "load_customer", false))
	 {return ((String) Debug.delegate(ba, "load_customer", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Sub Load_Customer";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="Try";
try {RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="rs = sql1.ExecQuery(\"select * from CustomersInfo";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from CustomersInformation");
RDebugUtils.currentLine=11141127;
 //BA.debugLineNum = 11141127;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=11141128;
 //BA.debugLineNum = 11141128;BA.debugLine="Dim val As String = rs.GetInt(\"CustomerID\")";
_val = BA.NumberToString(_rs.GetInt("CustomerID"));
RDebugUtils.currentLine=11141129;
 //BA.debugLineNum = 11141129;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("CustomerName")).Append("</option>");
RDebugUtils.currentLine=11141131;
 //BA.debugLineNum = 11141131;BA.debugLine="templistcmbcustomer.Add(rs.GetInt(\"CustomerID\")";
__ref._templistcmbcustomer /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rs.GetInt("CustomerID")));
 }
;
RDebugUtils.currentLine=11141134;
 //BA.debugLineNum = 11141134;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=11141135;
 //BA.debugLineNum = 11141135;BA.debugLine="cmbcustomer.SetHtml(sb.ToString)";
__ref._cmbcustomer /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=11141138;
 //BA.debugLineNum = 11141138;BA.debugLine="Log(LastException)";
__c.LogImpl("211141138",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=11141140;
 //BA.debugLineNum = 11141140;BA.debugLine="End Sub";
return "";
}
public String  _load_data_byid(b4j.example.addsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsalesinfo";
if (Debug.shouldDelegate(ba, "load_data_byid", false))
	 {return ((String) Debug.delegate(ba, "load_data_byid", null));}
int _invoiceid = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _strid = "";
b4j.example.clstempproducts _classtempprod = null;
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Sub Load_Data_ByID";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Try";
try {RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="Dim InvoiceID As Int = 0";
_invoiceid = (int) (0);
RDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="If ws.Session.GetAttribute(\"InvoiceID\") = Null T";
if (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")== null) { 
 }else {
RDebugUtils.currentLine=11796487;
 //BA.debugLineNum = 11796487;BA.debugLine="InvoiceID = ws.Session.GetAttribute(\"InvoiceID\"";
_invoiceid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")));
 };
RDebugUtils.currentLine=11796490;
 //BA.debugLineNum = 11796490;BA.debugLine="If InvoiceID > 0 Then";
if (_invoiceid>0) { 
RDebugUtils.currentLine=11796492;
 //BA.debugLineNum = 11796492;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=11796493;
 //BA.debugLineNum = 11796493;BA.debugLine="rs = sql1.ExecQuery(\"select * from SalesInvoice";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from SalesInvoiceH where SalesInvoiceHID="+BA.NumberToString(_invoiceid));
RDebugUtils.currentLine=11796494;
 //BA.debugLineNum = 11796494;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=11796496;
 //BA.debugLineNum = 11796496;BA.debugLine="txtinvdate.SetVal(rs.GetString(\"InvDT\"))";
__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("InvDT")));
RDebugUtils.currentLine=11796497;
 //BA.debugLineNum = 11796497;BA.debugLine="txtinvnote.SetVal(rs.GetString(\"StrNotes\"))";
__ref._txtinvnote /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("StrNotes")));
RDebugUtils.currentLine=11796499;
 //BA.debugLineNum = 11796499;BA.debugLine="Dim strID As String = cmbcustomer.id";
_strid = __ref._cmbcustomer /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .getId();
RDebugUtils.currentLine=11796500;
 //BA.debugLineNum = 11796500;BA.debugLine="strID = strID.Replace(\"#\",\"\")";
_strid = _strid.replace("#","");
RDebugUtils.currentLine=11796501;
 //BA.debugLineNum = 11796501;BA.debugLine="ws.RunFunction(\"setSelectedRow\", Array As Obje";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .RunFunction("setSelectedRow",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_strid),(Object)(_rs.GetInt("CustomerID"))}));
RDebugUtils.currentLine=11796504;
 //BA.debugLineNum = 11796504;BA.debugLine="Dim strID As String = cmbpaymenttype.id";
_strid = __ref._cmbpaymenttype /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .getId();
RDebugUtils.currentLine=11796505;
 //BA.debugLineNum = 11796505;BA.debugLine="strID = strID.Replace(\"#\",\"\")";
_strid = _strid.replace("#","");
RDebugUtils.currentLine=11796506;
 //BA.debugLineNum = 11796506;BA.debugLine="ws.RunFunction(\"setSelectedRow\", Array As Obje";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .RunFunction("setSelectedRow",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_strid),(Object)(_rs.GetInt("PaymenttypeID"))}));
RDebugUtils.currentLine=11796508;
 //BA.debugLineNum = 11796508;BA.debugLine="Dim strID As String = cmbuser.id";
_strid = __ref._cmbuser /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .getId();
RDebugUtils.currentLine=11796509;
 //BA.debugLineNum = 11796509;BA.debugLine="strID = strID.Replace(\"#\",\"\")";
_strid = _strid.replace("#","");
RDebugUtils.currentLine=11796510;
 //BA.debugLineNum = 11796510;BA.debugLine="ws.RunFunction(\"setSelectedRow\", Array As Obje";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .RunFunction("setSelectedRow",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_strid),(Object)(_rs.GetInt("UserID"))}));
 }
;
RDebugUtils.currentLine=11796514;
 //BA.debugLineNum = 11796514;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=11796517;
 //BA.debugLineNum = 11796517;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=11796518;
 //BA.debugLineNum = 11796518;BA.debugLine="rs = sql1.ExecQuery(\"select * from SalesInvoice";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from SalesInvoiceD where SalesInvoiceHID="+BA.NumberToString(_invoiceid));
RDebugUtils.currentLine=11796519;
 //BA.debugLineNum = 11796519;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=11796521;
 //BA.debugLineNum = 11796521;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=11796522;
 //BA.debugLineNum = 11796522;BA.debugLine="ClassTempProd.Initialize";
_classtempprod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=11796523;
 //BA.debugLineNum = 11796523;BA.debugLine="ClassTempProd.SetValues(rs.GetInt(\"ProductID\")";
_classtempprod._setvalues /*String*/ (null,_rs.GetInt("ProductID"),_rs.GetInt("TaxPerc"),(float)(Double.parseDouble(_rs.GetString("ProductSellPrice"))),_rs.GetInt("ProductQty"),(float) (0));
RDebugUtils.currentLine=11796525;
 //BA.debugLineNum = 11796525;BA.debugLine="TempProductsTable.Add(ClassTempProd)";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_classtempprod));
RDebugUtils.currentLine=11796526;
 //BA.debugLineNum = 11796526;BA.debugLine="Load_AddedProducts_Temp";
__ref._load_addedproducts_temp /*String*/ (null);
 }
;
RDebugUtils.currentLine=11796529;
 //BA.debugLineNum = 11796529;BA.debugLine="rs.Close";
_rs.Close();
 };
 } 
       catch (Exception e36) {
			ba.setLastException(e36);RDebugUtils.currentLine=11796535;
 //BA.debugLineNum = 11796535;BA.debugLine="Log(LastException)";
__c.LogImpl("211796535",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=11796537;
 //BA.debugLineNum = 11796537;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls2(b4j.example.addsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsalesinfo";
if (Debug.shouldDelegate(ba, "load_datatable_controls2", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls2", null));}
String _str = "";
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Sub Load_Datatable_Controls2";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="Try";
try {RDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable2').DataTable({\n"+"  bLengthChange: false,\n"+"  searching: false,\n"+"  responsive: true\n"+"});\n"+"      });");
RDebugUtils.currentLine=11927566;
 //BA.debugLineNum = 11927566;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=11927569;
 //BA.debugLineNum = 11927569;BA.debugLine="Log(LastException)";
__c.LogImpl("211927569",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=11927571;
 //BA.debugLineNum = 11927571;BA.debugLine="End Sub";
return "";
}
public String  _load_paymenttypes(b4j.example.addsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsalesinfo";
if (Debug.shouldDelegate(ba, "load_paymenttypes", false))
	 {return ((String) Debug.delegate(ba, "load_paymenttypes", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Sub Load_PaymentTypes";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="Try";
try {RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="rs = sql1.ExecQuery(\"select * from PaymentTypesI";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from PaymentTypesInfo");
RDebugUtils.currentLine=11206663;
 //BA.debugLineNum = 11206663;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=11206664;
 //BA.debugLineNum = 11206664;BA.debugLine="Dim val As String = rs.GetInt(\"PaymenttypeID\")";
_val = BA.NumberToString(_rs.GetInt("PaymenttypeID"));
RDebugUtils.currentLine=11206665;
 //BA.debugLineNum = 11206665;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("PaymentDesc")).Append("</option>");
RDebugUtils.currentLine=11206667;
 //BA.debugLineNum = 11206667;BA.debugLine="templistpaymenttype.Add(rs.GetInt(\"PaymenttypeI";
__ref._templistpaymenttype /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rs.GetInt("PaymenttypeID")));
 }
;
RDebugUtils.currentLine=11206670;
 //BA.debugLineNum = 11206670;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=11206671;
 //BA.debugLineNum = 11206671;BA.debugLine="cmbpaymenttype.SetHtml(sb.ToString)";
__ref._cmbpaymenttype /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=11206674;
 //BA.debugLineNum = 11206674;BA.debugLine="Log(LastException)";
__c.LogImpl("211206674",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=11206676;
 //BA.debugLineNum = 11206676;BA.debugLine="End Sub";
return "";
}
public String  _load_products(b4j.example.addsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsalesinfo";
if (Debug.shouldDelegate(ba, "load_products", false))
	 {return ((String) Debug.delegate(ba, "load_products", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Sub Load_Products";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="Try";
try {RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=11337734;
 //BA.debugLineNum = 11337734;BA.debugLine="rs = sql1.ExecQuery(\"select * from ProductsInfor";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from ProductsInformation");
RDebugUtils.currentLine=11337735;
 //BA.debugLineNum = 11337735;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=11337736;
 //BA.debugLineNum = 11337736;BA.debugLine="Dim val As String = rs.GetInt(\"ProductID\")";
_val = BA.NumberToString(_rs.GetInt("ProductID"));
RDebugUtils.currentLine=11337737;
 //BA.debugLineNum = 11337737;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("ProductName")).Append("</option>");
 }
;
RDebugUtils.currentLine=11337739;
 //BA.debugLineNum = 11337739;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=11337740;
 //BA.debugLineNum = 11337740;BA.debugLine="cmbproduct.SetHtml(sb.ToString)";
__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=11337743;
 //BA.debugLineNum = 11337743;BA.debugLine="Log(LastException)";
__c.LogImpl("211337743",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=11337745;
 //BA.debugLineNum = 11337745;BA.debugLine="End Sub";
return "";
}
public String  _load_usersinformation(b4j.example.addsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsalesinfo";
if (Debug.shouldDelegate(ba, "load_usersinformation", false))
	 {return ((String) Debug.delegate(ba, "load_usersinformation", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Sub Load_UsersInformation";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Try";
try {RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="rs = sql1.ExecQuery(\"select * from UsersInformat";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from UsersInformation");
RDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=11272200;
 //BA.debugLineNum = 11272200;BA.debugLine="Dim val As String = rs.GetInt(\"UserID\")";
_val = BA.NumberToString(_rs.GetInt("UserID"));
RDebugUtils.currentLine=11272201;
 //BA.debugLineNum = 11272201;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("UserFullName")).Append("</option>");
 }
;
RDebugUtils.currentLine=11272204;
 //BA.debugLineNum = 11272204;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=11272205;
 //BA.debugLineNum = 11272205;BA.debugLine="cmbuser.SetHtml(sb.ToString)";
__ref._cmbuser /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=11272208;
 //BA.debugLineNum = 11272208;BA.debugLine="Log(LastException)";
__c.LogImpl("211272208",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=11272210;
 //BA.debugLineNum = 11272210;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.addsalesinfo __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsalesinfo";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="TempProductsTable.Initialize";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="templistcmbcustomer.Initialize";
__ref._templistcmbcustomer /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=11010054;
 //BA.debugLineNum = 11010054;BA.debugLine="templistpaymenttype.Initialize";
__ref._templistpaymenttype /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=11010055;
 //BA.debugLineNum = 11010055;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=11010057;
 //BA.debugLineNum = 11010057;BA.debugLine="Load_Customer";
__ref._load_customer /*String*/ (null);
RDebugUtils.currentLine=11010059;
 //BA.debugLineNum = 11010059;BA.debugLine="Load_Products";
__ref._load_products /*String*/ (null);
RDebugUtils.currentLine=11010061;
 //BA.debugLineNum = 11010061;BA.debugLine="Load_PaymentTypes";
__ref._load_paymenttypes /*String*/ (null);
RDebugUtils.currentLine=11010063;
 //BA.debugLineNum = 11010063;BA.debugLine="Load_UsersInformation";
__ref._load_usersinformation /*String*/ (null);
RDebugUtils.currentLine=11010064;
 //BA.debugLineNum = 11010064;BA.debugLine="Load_Data_ByID";
__ref._load_data_byid /*String*/ (null);
RDebugUtils.currentLine=11010067;
 //BA.debugLineNum = 11010067;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.addsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addsalesinfo";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="End Sub";
return "";
}
}