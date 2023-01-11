package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class addpurchaseinfo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.addpurchaseinfo", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.addpurchaseinfo.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.WebSocket.JQueryElement _cmbsupplier = null;
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
public anywheresoftware.b4a.objects.collections.List _tempproductstable = null;
public anywheresoftware.b4a.objects.collections.List _templistcmbcustomer = null;
public anywheresoftware.b4a.objects.collections.List _templistpaymenttype = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblusernamemain = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divmenu = null;
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public b4j.example.main _main = null;
public String  _btnaddproduct_click(b4j.example.addpurchaseinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addpurchaseinfo";
if (Debug.shouldDelegate(ba, "btnaddproduct_click", false))
	 {return ((String) Debug.delegate(ba, "btnaddproduct_click", new Object[] {_params}));}
b4j.example.clstempproducts _classtempprod = null;
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Sub btnaddproduct_Click (Params As Map)";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Try";
try {RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="If cmbproduct.GetVal.Value = \"0\" Or txtunitprice";
if ((__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("0")) || (__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtqty /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtdiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=8192006;
 //BA.debugLineNum = 8192006;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=8192007;
 //BA.debugLineNum = 8192007;BA.debugLine="ClassTempProd.Initialize";
_classtempprod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=8192008;
 //BA.debugLineNum = 8192008;BA.debugLine="ClassTempProd.SetValues(cmbproduct.GetVal.Value,";
_classtempprod._setvalues /*String*/ (null,(int)(BA.ObjectToNumber(__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(int)(BA.ObjectToNumber(__ref._txttax /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(float)(BA.ObjectToNumber(__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(int)(BA.ObjectToNumber(__ref._txtqty /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(float)(BA.ObjectToNumber(__ref._txtdiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())));
RDebugUtils.currentLine=8192010;
 //BA.debugLineNum = 8192010;BA.debugLine="TempProductsTable.Add(ClassTempProd)";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_classtempprod));
RDebugUtils.currentLine=8192011;
 //BA.debugLineNum = 8192011;BA.debugLine="Load_AddedProducts_Temp";
__ref._load_addedproducts_temp /*String*/ (null);
RDebugUtils.currentLine=8192013;
 //BA.debugLineNum = 8192013;BA.debugLine="txtunitprice.SetVal(\"0\")";
__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("0"));
RDebugUtils.currentLine=8192014;
 //BA.debugLineNum = 8192014;BA.debugLine="txtqty.SetVal(\"0\")";
__ref._txtqty /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("0"));
RDebugUtils.currentLine=8192015;
 //BA.debugLineNum = 8192015;BA.debugLine="txtdiscount.SetVal(\"0\")";
__ref._txtdiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("0"));
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=8192018;
 //BA.debugLineNum = 8192018;BA.debugLine="Log(LastException)";
__c.LogImpl("28192018",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=8192020;
 //BA.debugLineNum = 8192020;BA.debugLine="End Sub";
return "";
}
public String  _load_addedproducts_temp(b4j.example.addpurchaseinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addpurchaseinfo";
if (Debug.shouldDelegate(ba, "load_addedproducts_temp", false))
	 {return ((String) Debug.delegate(ba, "load_addedproducts_temp", null));}
String _str = "";
int _i = 0;
b4j.example.clstempproducts _classtempprod = null;
float _taxperc = 0f;
float _totalamount = 0f;
float _temptotalamount = 0f;
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Sub Load_AddedProducts_Temp";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="Try";
try {RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Product Name</th>\n"+"									                  <th class=\"wd-20p\">Unit Price</th>\n"+"									                  <th class=\"wd-10p\">Quantity</th>\n"+"									                  <th class=\"wd-15p\">Total</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=8323090;
 //BA.debugLineNum = 8323090;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=8323092;
 //BA.debugLineNum = 8323092;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=8323093;
 //BA.debugLineNum = 8323093;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=8323095;
 //BA.debugLineNum = 8323095;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=8323096;
 //BA.debugLineNum = 8323096;BA.debugLine="str = str & \"<td>\"& ClassTempProd.ProductID &\"<";
_str = _str+"<td>"+BA.NumberToString(_classtempprod._productid /*int*/ )+"</td>";
RDebugUtils.currentLine=8323097;
 //BA.debugLineNum = 8323097;BA.debugLine="str = str & \"<td>\"& ClassTempProd.ProductName &";
_str = _str+"<td>"+_classtempprod._productname /*String*/ +"</td>";
RDebugUtils.currentLine=8323098;
 //BA.debugLineNum = 8323098;BA.debugLine="str = str & \"<td>\"& ClassTempProd.UnitPrice &\"<";
_str = _str+"<td>"+BA.NumberToString(_classtempprod._unitprice /*double*/ )+"</td>";
RDebugUtils.currentLine=8323099;
 //BA.debugLineNum = 8323099;BA.debugLine="str = str & \"<td>\"& ClassTempProd.Qty &\"</td>\"";
_str = _str+"<td>"+BA.NumberToString(_classtempprod._qty /*int*/ )+"</td>";
RDebugUtils.currentLine=8323101;
 //BA.debugLineNum = 8323101;BA.debugLine="Dim taxPerc As Float = 0";
_taxperc = (float) (0);
RDebugUtils.currentLine=8323102;
 //BA.debugLineNum = 8323102;BA.debugLine="taxPerc = ClassTempProd.TaxID";
_taxperc = (float) (_classtempprod._taxid /*int*/ );
RDebugUtils.currentLine=8323104;
 //BA.debugLineNum = 8323104;BA.debugLine="Dim TotalAmount As Float =  ((ClassTempProd.Uni";
_totalamount = (float) (((_classtempprod._unitprice /*double*/ *_classtempprod._qty /*int*/ )-_classtempprod._discount /*double*/ ));
RDebugUtils.currentLine=8323105;
 //BA.debugLineNum = 8323105;BA.debugLine="Dim TempTotalAmount As Float = 0";
_temptotalamount = (float) (0);
RDebugUtils.currentLine=8323106;
 //BA.debugLineNum = 8323106;BA.debugLine="If taxPerc > 0 Then";
if (_taxperc>0) { 
RDebugUtils.currentLine=8323107;
 //BA.debugLineNum = 8323107;BA.debugLine="TempTotalAmount = TotalAmount";
_temptotalamount = _totalamount;
RDebugUtils.currentLine=8323108;
 //BA.debugLineNum = 8323108;BA.debugLine="TempTotalAmount = TempTotalAmount * (taxPerc /";
_temptotalamount = (float) (_temptotalamount*(_taxperc/(double)100));
 };
RDebugUtils.currentLine=8323111;
 //BA.debugLineNum = 8323111;BA.debugLine="str = str & \"<td>\"& NumberFormat((TotalAmount +";
_str = _str+"<td>"+__c.NumberFormat((_totalamount+_temptotalamount),(int) (0),(int) (4))+"</td>";
RDebugUtils.currentLine=8323113;
 //BA.debugLineNum = 8323113;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"deleteproductTbl("+BA.NumberToString(_i)+")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "+" </td> </tr>";
 }
};
RDebugUtils.currentLine=8323119;
 //BA.debugLineNum = 8323119;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
RDebugUtils.currentLine=8323121;
 //BA.debugLineNum = 8323121;BA.debugLine="divproducts.SetHtml(str)";
__ref._divproducts /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
RDebugUtils.currentLine=8323123;
 //BA.debugLineNum = 8323123;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
 } 
       catch (Exception e27) {
			ba.setLastException(e27);RDebugUtils.currentLine=8323126;
 //BA.debugLineNum = 8323126;BA.debugLine="Log(LastException)";
__c.LogImpl("28323126",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=8323128;
 //BA.debugLineNum = 8323128;BA.debugLine="End Sub";
return "";
}
public String  _btncancel_click(b4j.example.addpurchaseinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addpurchaseinfo";
if (Debug.shouldDelegate(ba, "btncancel_click", false))
	 {return ((String) Debug.delegate(ba, "btncancel_click", new Object[] {_params}));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Sub btncancel_Click (Params As Map)";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="ws.Eval(\"document.location.replace('PurchaseInfo";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('PurchaseInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="End Sub";
return "";
}
public String  _btnsave_click(b4j.example.addpurchaseinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addpurchaseinfo";
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
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub btnsave_Click (Params As Map)";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Try";
try {RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="Dim LastSavedID As Int = 0";
_lastsavedid = (int) (0);
RDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="If txtinvdate.GetVal.Value = \"\"  Then";
if ((__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=8454153;
 //BA.debugLineNum = 8454153;BA.debugLine="Dim InvoiceID As Int = 0";
_invoiceid = (int) (0);
RDebugUtils.currentLine=8454154;
 //BA.debugLineNum = 8454154;BA.debugLine="If ws.Session.GetAttribute(\"InvoiceID\") = Null T";
if (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")== null) { 
 }else {
RDebugUtils.currentLine=8454157;
 //BA.debugLineNum = 8454157;BA.debugLine="InvoiceID = ws.Session.GetAttribute(\"InvoiceID\"";
_invoiceid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")));
RDebugUtils.currentLine=8454158;
 //BA.debugLineNum = 8454158;BA.debugLine="LastSavedID = InvoiceID";
_lastsavedid = _invoiceid;
 };
RDebugUtils.currentLine=8454161;
 //BA.debugLineNum = 8454161;BA.debugLine="Dim dblinvtotal,dblinvtotaltax,dblinvtotaldisco";
_dblinvtotal = 0;
_dblinvtotaltax = 0;
_dblinvtotaldiscount = 0;
RDebugUtils.currentLine=8454163;
 //BA.debugLineNum = 8454163;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=8454165;
 //BA.debugLineNum = 8454165;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=8454166;
 //BA.debugLineNum = 8454166;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=8454168;
 //BA.debugLineNum = 8454168;BA.debugLine="dblinvtotal = ClassTempProd.Qty * ClassTempPr";
_dblinvtotal = _classtempprod._qty /*int*/ *_classtempprod._unitprice /*double*/ ;
RDebugUtils.currentLine=8454169;
 //BA.debugLineNum = 8454169;BA.debugLine="dblinvtotaltax = dblinvtotal * (ClassTempProd";
_dblinvtotaltax = _dblinvtotal*(_classtempprod._taxid /*int*/ /(double)100);
RDebugUtils.currentLine=8454170;
 //BA.debugLineNum = 8454170;BA.debugLine="dblinvtotaldiscount = ClassTempProd.Discount";
_dblinvtotaldiscount = _classtempprod._discount /*double*/ ;
 }
};
RDebugUtils.currentLine=8454174;
 //BA.debugLineNum = 8454174;BA.debugLine="dblinvtotal = dblinvtotal + dblinvtotaltax";
_dblinvtotal = _dblinvtotal+_dblinvtotaltax;
RDebugUtils.currentLine=8454175;
 //BA.debugLineNum = 8454175;BA.debugLine="dblinvtotal = dblinvtotal - dblinvtotaldiscoun";
_dblinvtotal = _dblinvtotal-_dblinvtotaldiscount;
RDebugUtils.currentLine=8454177;
 //BA.debugLineNum = 8454177;BA.debugLine="If InvoiceID > 0 Then";
if (_invoiceid>0) { 
RDebugUtils.currentLine=8454179;
 //BA.debugLineNum = 8454179;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=8454180;
 //BA.debugLineNum = 8454180;BA.debugLine="sql1.ExecNonQuery2($\"UPDATE PurchaseInvoiceH";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("UPDATE PurchaseInvoiceH\n"+"				   SET InvDT = ?\n"+"				      ,InvTotal = ?\n"+"				      ,InvTotalTax = ?\n"+"				      ,InvTotalDiscount = ?\n"+"				      ,InvTotalShipping = ?\n"+"				      ,PaidAmount = ?\n"+"				      ,StrNotes = ?\n"+"				      ,SupplierID = ?\n"+"				 WHERE PurchaseInvoiceHID=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_dblinvtotal),(Object)(_dblinvtotaltax),(Object)(_dblinvtotaldiscount),(Object)(0),(Object)(0),__ref._txtinvnote /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._cmbsupplier /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_invoiceid)}));
RDebugUtils.currentLine=8454191;
 //BA.debugLineNum = 8454191;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=8454193;
 //BA.debugLineNum = 8454193;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=8454194;
 //BA.debugLineNum = 8454194;BA.debugLine="sql1.ExecNonQuery2(\"delete from PurchaseInvoic";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("delete from PurchaseInvoiceD where PurchaseInvoiceHID=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_invoiceid)}));
RDebugUtils.currentLine=8454195;
 //BA.debugLineNum = 8454195;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=8454197;
 //BA.debugLineNum = 8454197;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step29 = 1;
final int limit29 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit29 ;_i = _i + step29 ) {
RDebugUtils.currentLine=8454199;
 //BA.debugLineNum = 8454199;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=8454200;
 //BA.debugLineNum = 8454200;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=8454202;
 //BA.debugLineNum = 8454202;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=8454203;
 //BA.debugLineNum = 8454203;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO PurchaseInvo";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO PurchaseInvoiceD\n"+"			           (PurchaseInvoiceHID\n"+"			           ,ProductID\n"+"			           ,ProductSellPrice\n"+"			           ,ProductCostPrice\n"+"			           ,TaxPerc\n"+"			           ,ProductQty)\n"+"			     VALUES\n"+"			           (?\n"+"			           ,?\n"+"			           ,?\n"+"			           ,?\n"+"			           ,?\n"+"			           ,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_invoiceid),(Object)(_classtempprod._productid /*int*/ ),(Object)(_classtempprod._unitprice /*double*/ ),(Object)(_classtempprod._productcostprice /*double*/ ),(Object)(_classtempprod._taxid /*int*/ ),(Object)(_classtempprod._qty /*int*/ )}));
RDebugUtils.currentLine=8454217;
 //BA.debugLineNum = 8454217;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }
};
 }else {
RDebugUtils.currentLine=8454224;
 //BA.debugLineNum = 8454224;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=8454225;
 //BA.debugLineNum = 8454225;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO PurchaseInvo";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO PurchaseInvoiceH\n"+"				           (InvDT\n"+"				           ,InvTotal\n"+"				           ,InvTotalTax\n"+"				           ,InvTotalDiscount\n"+"				           ,InvTotalShipping\n"+"				           ,PaidAmount\n"+"				           ,StrNotes\n"+"				           ,SupplierID)\n"+"				     VALUES\n"+"				           (?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_dblinvtotal),(Object)(_dblinvtotaltax),(Object)(_dblinvtotaldiscount),(Object)(0),(Object)(0),__ref._txtinvnote /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._cmbsupplier /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()}));
RDebugUtils.currentLine=8454244;
 //BA.debugLineNum = 8454244;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=8454246;
 //BA.debugLineNum = 8454246;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=8454247;
 //BA.debugLineNum = 8454247;BA.debugLine="rs = sql1.ExecQuery(\"select PurchaseInvoiceHI";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select PurchaseInvoiceHID from PurchaseInvoiceH order by PurchaseInvoiceHID desc limit 1");
RDebugUtils.currentLine=8454248;
 //BA.debugLineNum = 8454248;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=8454249;
 //BA.debugLineNum = 8454249;BA.debugLine="LastSavedID = rs.GetInt(\"PurchaseInvoiceHID\"";
_lastsavedid = _rs.GetInt("PurchaseInvoiceHID");
 }
;
RDebugUtils.currentLine=8454251;
 //BA.debugLineNum = 8454251;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=8454253;
 //BA.debugLineNum = 8454253;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step46 = 1;
final int limit46 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit46 ;_i = _i + step46 ) {
RDebugUtils.currentLine=8454254;
 //BA.debugLineNum = 8454254;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=8454255;
 //BA.debugLineNum = 8454255;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=8454257;
 //BA.debugLineNum = 8454257;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=8454258;
 //BA.debugLineNum = 8454258;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO PurchaseIn";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO PurchaseInvoiceD\n"+"					           (PurchaseInvoiceHID\n"+"					           ,ProductID\n"+"					           ,ProductSellPrice\n"+"					           ,ProductCostPrice\n"+"					           ,TaxPerc\n"+"					           ,ProductQty)\n"+"					     VALUES\n"+"					           (?\n"+"					           ,?\n"+"					           ,?\n"+"					           ,?\n"+"					           ,?\n"+"					           ,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_lastsavedid),(Object)(_classtempprod._productid /*int*/ ),(Object)(_classtempprod._unitprice /*double*/ ),(Object)(_classtempprod._productcostprice /*double*/ ),(Object)(_classtempprod._taxid /*int*/ ),(Object)(_classtempprod._qty /*int*/ )}));
RDebugUtils.currentLine=8454272;
 //BA.debugLineNum = 8454272;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }
};
 };
RDebugUtils.currentLine=8454278;
 //BA.debugLineNum = 8454278;BA.debugLine="Main.Insert_UsersLogs(ws,\"Invoice Information\")";
_main._insert_userslogs /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,"Invoice Information");
RDebugUtils.currentLine=8454281;
 //BA.debugLineNum = 8454281;BA.debugLine="ws.Eval(\"document.location.replace('PurchaseInfo";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('PurchaseInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e57) {
			ba.setLastException(e57);RDebugUtils.currentLine=8454284;
 //BA.debugLineNum = 8454284;BA.debugLine="Log(LastException)";
__c.LogImpl("28454284",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=8454286;
 //BA.debugLineNum = 8454286;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.addpurchaseinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addpurchaseinfo";
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="Private txtinvdate,cmbsupplier,txtinvnote,cmbprod";
_txtinvdate = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_cmbsupplier = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
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
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="Private TempProductsTable As List";
_tempproductstable = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7798791;
 //BA.debugLineNum = 7798791;BA.debugLine="Private templistcmbcustomer As List";
_templistcmbcustomer = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7798792;
 //BA.debugLineNum = 7798792;BA.debugLine="Private templistpaymenttype As List";
_templistpaymenttype = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7798793;
 //BA.debugLineNum = 7798793;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=7798794;
 //BA.debugLineNum = 7798794;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=7798795;
 //BA.debugLineNum = 7798795;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=7798797;
 //BA.debugLineNum = 7798797;BA.debugLine="End Sub";
return "";
}
public String  _cmbproduct_change(b4j.example.addpurchaseinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addpurchaseinfo";
if (Debug.shouldDelegate(ba, "cmbproduct_change", false))
	 {return ((String) Debug.delegate(ba, "cmbproduct_change", new Object[] {_params}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Sub cmbproduct_Change (Params As Map)";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Try";
try {RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="rs = sql1.ExecQuery(\"select ProductPrice from Pr";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select ProductPrice from ProductsInformation where ProductID="+BA.ObjectToString(__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()));
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="txtunitprice.SetVal(rs.GetString(\"ProductPrice\"";
__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("ProductPrice")));
 }
;
RDebugUtils.currentLine=8257543;
 //BA.debugLineNum = 8257543;BA.debugLine="rs.Close";
_rs.Close();
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=8257546;
 //BA.debugLineNum = 8257546;BA.debugLine="Log(LastException)";
__c.LogImpl("28257546",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=8257548;
 //BA.debugLineNum = 8257548;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table_products(b4j.example.addpurchaseinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addpurchaseinfo";
if (Debug.shouldDelegate(ba, "delete_button_table_products", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table_products", new Object[] {_params}));}
int _index = 0;
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Private Sub Delete_button_table_Products(params As";
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="Dim index As Int = params.Get(\"val\")";
_index = (int)(BA.ObjectToNumber(_params.Get((Object)("val"))));
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="TempProductsTable.RemoveAt(index)";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="Load_AddedProducts_Temp";
__ref._load_addedproducts_temp /*String*/ (null);
RDebugUtils.currentLine=8388615;
 //BA.debugLineNum = 8388615;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.addpurchaseinfo __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="addpurchaseinfo";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.addpurchaseinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addpurchaseinfo";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Try";
try {RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"  bLengthChange: false,\n"+"  searching: false,\n"+"  responsive: true\n"+"});\n"+"\n"+"      });");
RDebugUtils.currentLine=8650767;
 //BA.debugLineNum = 8650767;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=8650770;
 //BA.debugLineNum = 8650770;BA.debugLine="Log(LastException)";
__c.LogImpl("28650770",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=8650772;
 //BA.debugLineNum = 8650772;BA.debugLine="End Sub";
return "";
}
public String  _load_customer(b4j.example.addpurchaseinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addpurchaseinfo";
if (Debug.shouldDelegate(ba, "load_customer", false))
	 {return ((String) Debug.delegate(ba, "load_customer", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub Load_Customer";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Try";
try {RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=8060933;
 //BA.debugLineNum = 8060933;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=8060934;
 //BA.debugLineNum = 8060934;BA.debugLine="rs = sql1.ExecQuery(\"select * from SuppliersInfo";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from SuppliersInfo");
RDebugUtils.currentLine=8060935;
 //BA.debugLineNum = 8060935;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=8060936;
 //BA.debugLineNum = 8060936;BA.debugLine="Dim val As String = rs.GetInt(\"SupplierID\")";
_val = BA.NumberToString(_rs.GetInt("SupplierID"));
RDebugUtils.currentLine=8060937;
 //BA.debugLineNum = 8060937;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("SupplierName")).Append("</option>");
RDebugUtils.currentLine=8060939;
 //BA.debugLineNum = 8060939;BA.debugLine="templistcmbcustomer.Add(rs.GetInt(\"SupplierID\")";
__ref._templistcmbcustomer /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rs.GetInt("SupplierID")));
 }
;
RDebugUtils.currentLine=8060942;
 //BA.debugLineNum = 8060942;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=8060943;
 //BA.debugLineNum = 8060943;BA.debugLine="cmbsupplier.SetHtml(sb.ToString)";
__ref._cmbsupplier /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=8060946;
 //BA.debugLineNum = 8060946;BA.debugLine="Log(LastException)";
__c.LogImpl("28060946",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=8060948;
 //BA.debugLineNum = 8060948;BA.debugLine="End Sub";
return "";
}
public String  _load_data_byid(b4j.example.addpurchaseinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addpurchaseinfo";
if (Debug.shouldDelegate(ba, "load_data_byid", false))
	 {return ((String) Debug.delegate(ba, "load_data_byid", null));}
int _invoiceid = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _strid = "";
b4j.example.clstempproducts _classtempprod = null;
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Sub Load_Data_ByID";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="Try";
try {RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="Dim InvoiceID As Int = 0";
_invoiceid = (int) (0);
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="If ws.Session.GetAttribute(\"InvoiceID\") = Null T";
if (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")== null) { 
 }else {
RDebugUtils.currentLine=8585223;
 //BA.debugLineNum = 8585223;BA.debugLine="InvoiceID = ws.Session.GetAttribute(\"InvoiceID\"";
_invoiceid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")));
 };
RDebugUtils.currentLine=8585226;
 //BA.debugLineNum = 8585226;BA.debugLine="If InvoiceID > 0 Then";
if (_invoiceid>0) { 
RDebugUtils.currentLine=8585228;
 //BA.debugLineNum = 8585228;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=8585229;
 //BA.debugLineNum = 8585229;BA.debugLine="rs = sql1.ExecQuery(\"select * from PurchaseInvo";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from PurchaseInvoiceH where PurchaseInvoiceHID="+BA.NumberToString(_invoiceid));
RDebugUtils.currentLine=8585230;
 //BA.debugLineNum = 8585230;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=8585232;
 //BA.debugLineNum = 8585232;BA.debugLine="txtinvdate.SetVal(rs.GetString(\"InvDT\"))";
__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("InvDT")));
RDebugUtils.currentLine=8585233;
 //BA.debugLineNum = 8585233;BA.debugLine="txtinvnote.SetVal(rs.GetString(\"StrNotes\"))";
__ref._txtinvnote /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("StrNotes")));
RDebugUtils.currentLine=8585235;
 //BA.debugLineNum = 8585235;BA.debugLine="Dim strID As String = cmbsupplier.id";
_strid = __ref._cmbsupplier /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .getId();
RDebugUtils.currentLine=8585236;
 //BA.debugLineNum = 8585236;BA.debugLine="strID = strID.Replace(\"#\",\"\")";
_strid = _strid.replace("#","");
RDebugUtils.currentLine=8585237;
 //BA.debugLineNum = 8585237;BA.debugLine="ws.RunFunction(\"setSelectedRow\", Array As Obje";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .RunFunction("setSelectedRow",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_strid),(Object)(_rs.GetInt("SupplierID"))}));
 }
;
RDebugUtils.currentLine=8585240;
 //BA.debugLineNum = 8585240;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=8585243;
 //BA.debugLineNum = 8585243;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=8585244;
 //BA.debugLineNum = 8585244;BA.debugLine="rs = sql1.ExecQuery(\"select * from PurchaseInvo";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from PurchaseInvoiceD where PurchaseInvoiceHID="+BA.NumberToString(_invoiceid));
RDebugUtils.currentLine=8585245;
 //BA.debugLineNum = 8585245;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=8585247;
 //BA.debugLineNum = 8585247;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=8585248;
 //BA.debugLineNum = 8585248;BA.debugLine="ClassTempProd.Initialize";
_classtempprod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=8585249;
 //BA.debugLineNum = 8585249;BA.debugLine="ClassTempProd.SetValues(rs.GetInt(\"ProductID\")";
_classtempprod._setvalues /*String*/ (null,_rs.GetInt("ProductID"),_rs.GetInt("TaxPerc"),(float)(Double.parseDouble(_rs.GetString("ProductSellPrice"))),_rs.GetInt("ProductQty"),(float) (0));
RDebugUtils.currentLine=8585251;
 //BA.debugLineNum = 8585251;BA.debugLine="TempProductsTable.Add(ClassTempProd)";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_classtempprod));
RDebugUtils.currentLine=8585252;
 //BA.debugLineNum = 8585252;BA.debugLine="Load_AddedProducts_Temp";
__ref._load_addedproducts_temp /*String*/ (null);
 }
;
RDebugUtils.currentLine=8585255;
 //BA.debugLineNum = 8585255;BA.debugLine="rs.Close";
_rs.Close();
 };
 } 
       catch (Exception e30) {
			ba.setLastException(e30);RDebugUtils.currentLine=8585260;
 //BA.debugLineNum = 8585260;BA.debugLine="Log(LastException)";
__c.LogImpl("28585260",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=8585262;
 //BA.debugLineNum = 8585262;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls2(b4j.example.addpurchaseinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addpurchaseinfo";
if (Debug.shouldDelegate(ba, "load_datatable_controls2", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls2", null));}
String _str = "";
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Sub Load_Datatable_Controls2";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Try";
try {RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable2').DataTable({\n"+"  bLengthChange: false,\n"+"  searching: false,\n"+"  responsive: true\n"+"});\n"+"      });");
RDebugUtils.currentLine=8716302;
 //BA.debugLineNum = 8716302;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=8716305;
 //BA.debugLineNum = 8716305;BA.debugLine="Log(LastException)";
__c.LogImpl("28716305",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=8716307;
 //BA.debugLineNum = 8716307;BA.debugLine="End Sub";
return "";
}
public String  _load_products(b4j.example.addpurchaseinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addpurchaseinfo";
if (Debug.shouldDelegate(ba, "load_products", false))
	 {return ((String) Debug.delegate(ba, "load_products", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Sub Load_Products";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Try";
try {RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=8126470;
 //BA.debugLineNum = 8126470;BA.debugLine="rs = sql1.ExecQuery(\"select * from ProductsInfor";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from ProductsInformation");
RDebugUtils.currentLine=8126471;
 //BA.debugLineNum = 8126471;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=8126472;
 //BA.debugLineNum = 8126472;BA.debugLine="Dim val As String = rs.GetInt(\"ProductID\")";
_val = BA.NumberToString(_rs.GetInt("ProductID"));
RDebugUtils.currentLine=8126473;
 //BA.debugLineNum = 8126473;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("ProductName")).Append("</option>");
 }
;
RDebugUtils.currentLine=8126475;
 //BA.debugLineNum = 8126475;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=8126476;
 //BA.debugLineNum = 8126476;BA.debugLine="cmbproduct.SetHtml(sb.ToString)";
__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=8126479;
 //BA.debugLineNum = 8126479;BA.debugLine="Log(LastException)";
__c.LogImpl("28126479",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=8126481;
 //BA.debugLineNum = 8126481;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.addpurchaseinfo __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="addpurchaseinfo";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="TempProductsTable.Initialize";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="templistcmbcustomer.Initialize";
__ref._templistcmbcustomer /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="templistpaymenttype.Initialize";
__ref._templistpaymenttype /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=7929863;
 //BA.debugLineNum = 7929863;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=7929865;
 //BA.debugLineNum = 7929865;BA.debugLine="Load_Customer";
__ref._load_customer /*String*/ (null);
RDebugUtils.currentLine=7929867;
 //BA.debugLineNum = 7929867;BA.debugLine="Load_Products";
__ref._load_products /*String*/ (null);
RDebugUtils.currentLine=7929870;
 //BA.debugLineNum = 7929870;BA.debugLine="Load_Data_ByID";
__ref._load_data_byid /*String*/ (null);
RDebugUtils.currentLine=7929873;
 //BA.debugLineNum = 7929873;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.addpurchaseinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addpurchaseinfo";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="End Sub";
return "";
}
}