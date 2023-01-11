package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class addreturnpurchaseinfo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.addreturnpurchaseinfo", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.addreturnpurchaseinfo.class).invoke(this, new Object[] {null});
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
public String  _btnaddproduct_click(b4j.example.addreturnpurchaseinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnpurchaseinfo";
if (Debug.shouldDelegate(ba, "btnaddproduct_click", false))
	 {return ((String) Debug.delegate(ba, "btnaddproduct_click", new Object[] {_params}));}
b4j.example.clstempproducts _classtempprod = null;
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Sub btnaddproduct_Click (Params As Map)";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Try";
try {RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="If cmbproduct.GetVal.Value = \"0\" Or txtunitprice";
if ((__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("0")) || (__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtqty /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtdiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=9175046;
 //BA.debugLineNum = 9175046;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=9175047;
 //BA.debugLineNum = 9175047;BA.debugLine="ClassTempProd.Initialize";
_classtempprod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=9175048;
 //BA.debugLineNum = 9175048;BA.debugLine="ClassTempProd.SetValues(cmbproduct.GetVal.Value,";
_classtempprod._setvalues /*String*/ (null,(int)(BA.ObjectToNumber(__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(int)(BA.ObjectToNumber(__ref._txttax /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(float)(BA.ObjectToNumber(__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(int)(BA.ObjectToNumber(__ref._txtqty /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(float)(BA.ObjectToNumber(__ref._txtdiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())));
RDebugUtils.currentLine=9175050;
 //BA.debugLineNum = 9175050;BA.debugLine="TempProductsTable.Add(ClassTempProd)";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_classtempprod));
RDebugUtils.currentLine=9175051;
 //BA.debugLineNum = 9175051;BA.debugLine="Load_AddedProducts_Temp";
__ref._load_addedproducts_temp /*String*/ (null);
RDebugUtils.currentLine=9175053;
 //BA.debugLineNum = 9175053;BA.debugLine="txtunitprice.SetVal(\"0\")";
__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("0"));
RDebugUtils.currentLine=9175054;
 //BA.debugLineNum = 9175054;BA.debugLine="txtqty.SetVal(\"0\")";
__ref._txtqty /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("0"));
RDebugUtils.currentLine=9175055;
 //BA.debugLineNum = 9175055;BA.debugLine="txtdiscount.SetVal(\"0\")";
__ref._txtdiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("0"));
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=9175058;
 //BA.debugLineNum = 9175058;BA.debugLine="Log(LastException)";
__c.LogImpl("29175058",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=9175060;
 //BA.debugLineNum = 9175060;BA.debugLine="End Sub";
return "";
}
public String  _load_addedproducts_temp(b4j.example.addreturnpurchaseinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnpurchaseinfo";
if (Debug.shouldDelegate(ba, "load_addedproducts_temp", false))
	 {return ((String) Debug.delegate(ba, "load_addedproducts_temp", null));}
String _str = "";
int _i = 0;
b4j.example.clstempproducts _classtempprod = null;
float _taxperc = 0f;
float _totalamount = 0f;
float _temptotalamount = 0f;
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Sub Load_AddedProducts_Temp";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Try";
try {RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Product Name</th>\n"+"									                  <th class=\"wd-20p\">Unit Price</th>\n"+"									                  <th class=\"wd-10p\">Quantity</th>\n"+"									                  <th class=\"wd-15p\">Total</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=9306130;
 //BA.debugLineNum = 9306130;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=9306132;
 //BA.debugLineNum = 9306132;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=9306133;
 //BA.debugLineNum = 9306133;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=9306135;
 //BA.debugLineNum = 9306135;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=9306136;
 //BA.debugLineNum = 9306136;BA.debugLine="str = str & \"<td>\"& ClassTempProd.ProductID &\"<";
_str = _str+"<td>"+BA.NumberToString(_classtempprod._productid /*int*/ )+"</td>";
RDebugUtils.currentLine=9306137;
 //BA.debugLineNum = 9306137;BA.debugLine="str = str & \"<td>\"& ClassTempProd.ProductName &";
_str = _str+"<td>"+_classtempprod._productname /*String*/ +"</td>";
RDebugUtils.currentLine=9306138;
 //BA.debugLineNum = 9306138;BA.debugLine="str = str & \"<td>\"& ClassTempProd.UnitPrice &\"<";
_str = _str+"<td>"+BA.NumberToString(_classtempprod._unitprice /*double*/ )+"</td>";
RDebugUtils.currentLine=9306139;
 //BA.debugLineNum = 9306139;BA.debugLine="str = str & \"<td>\"& ClassTempProd.Qty &\"</td>\"";
_str = _str+"<td>"+BA.NumberToString(_classtempprod._qty /*int*/ )+"</td>";
RDebugUtils.currentLine=9306141;
 //BA.debugLineNum = 9306141;BA.debugLine="Dim taxPerc As Float = 0";
_taxperc = (float) (0);
RDebugUtils.currentLine=9306142;
 //BA.debugLineNum = 9306142;BA.debugLine="taxPerc = ClassTempProd.TaxID";
_taxperc = (float) (_classtempprod._taxid /*int*/ );
RDebugUtils.currentLine=9306144;
 //BA.debugLineNum = 9306144;BA.debugLine="Dim TotalAmount As Float =  ((ClassTempProd.Uni";
_totalamount = (float) (((_classtempprod._unitprice /*double*/ *_classtempprod._qty /*int*/ )-_classtempprod._discount /*double*/ ));
RDebugUtils.currentLine=9306145;
 //BA.debugLineNum = 9306145;BA.debugLine="Dim TempTotalAmount As Float = 0";
_temptotalamount = (float) (0);
RDebugUtils.currentLine=9306146;
 //BA.debugLineNum = 9306146;BA.debugLine="If taxPerc > 0 Then";
if (_taxperc>0) { 
RDebugUtils.currentLine=9306147;
 //BA.debugLineNum = 9306147;BA.debugLine="TempTotalAmount = TotalAmount";
_temptotalamount = _totalamount;
RDebugUtils.currentLine=9306148;
 //BA.debugLineNum = 9306148;BA.debugLine="TempTotalAmount = TempTotalAmount * (taxPerc /";
_temptotalamount = (float) (_temptotalamount*(_taxperc/(double)100));
 };
RDebugUtils.currentLine=9306151;
 //BA.debugLineNum = 9306151;BA.debugLine="str = str & \"<td>\"& NumberFormat((TotalAmount +";
_str = _str+"<td>"+__c.NumberFormat((_totalamount+_temptotalamount),(int) (0),(int) (4))+"</td>";
RDebugUtils.currentLine=9306153;
 //BA.debugLineNum = 9306153;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"deleteproductTbl("+BA.NumberToString(_i)+")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "+" </td> </tr>";
 }
};
RDebugUtils.currentLine=9306159;
 //BA.debugLineNum = 9306159;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
RDebugUtils.currentLine=9306161;
 //BA.debugLineNum = 9306161;BA.debugLine="divproducts.SetHtml(str)";
__ref._divproducts /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
RDebugUtils.currentLine=9306163;
 //BA.debugLineNum = 9306163;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
 } 
       catch (Exception e27) {
			ba.setLastException(e27);RDebugUtils.currentLine=9306166;
 //BA.debugLineNum = 9306166;BA.debugLine="Log(LastException)";
__c.LogImpl("29306166",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=9306168;
 //BA.debugLineNum = 9306168;BA.debugLine="End Sub";
return "";
}
public String  _btncancel_click(b4j.example.addreturnpurchaseinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnpurchaseinfo";
if (Debug.shouldDelegate(ba, "btncancel_click", false))
	 {return ((String) Debug.delegate(ba, "btncancel_click", new Object[] {_params}));}
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Sub btncancel_Click (Params As Map)";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="ws.Eval(\"document.location.replace('PurchaseInfo";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('PurchaseInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="End Sub";
return "";
}
public String  _btnsave_click(b4j.example.addreturnpurchaseinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnpurchaseinfo";
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
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Sub btnsave_Click (Params As Map)";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="Try";
try {RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="Dim LastSavedID As Int = 0";
_lastsavedid = (int) (0);
RDebugUtils.currentLine=9437189;
 //BA.debugLineNum = 9437189;BA.debugLine="If txtinvdate.GetVal.Value = \"\"  Then";
if ((__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=9437190;
 //BA.debugLineNum = 9437190;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=9437193;
 //BA.debugLineNum = 9437193;BA.debugLine="Dim InvoiceID As Int = 0";
_invoiceid = (int) (0);
RDebugUtils.currentLine=9437194;
 //BA.debugLineNum = 9437194;BA.debugLine="If ws.Session.GetAttribute(\"InvoiceID\") = Null T";
if (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")== null) { 
 }else {
RDebugUtils.currentLine=9437197;
 //BA.debugLineNum = 9437197;BA.debugLine="InvoiceID = ws.Session.GetAttribute(\"InvoiceID\"";
_invoiceid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")));
RDebugUtils.currentLine=9437198;
 //BA.debugLineNum = 9437198;BA.debugLine="LastSavedID = InvoiceID";
_lastsavedid = _invoiceid;
 };
RDebugUtils.currentLine=9437201;
 //BA.debugLineNum = 9437201;BA.debugLine="Dim dblinvtotal,dblinvtotaltax,dblinvtotaldisco";
_dblinvtotal = 0;
_dblinvtotaltax = 0;
_dblinvtotaldiscount = 0;
RDebugUtils.currentLine=9437203;
 //BA.debugLineNum = 9437203;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=9437205;
 //BA.debugLineNum = 9437205;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=9437206;
 //BA.debugLineNum = 9437206;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=9437208;
 //BA.debugLineNum = 9437208;BA.debugLine="dblinvtotal = ClassTempProd.Qty * ClassTempPr";
_dblinvtotal = _classtempprod._qty /*int*/ *_classtempprod._unitprice /*double*/ ;
RDebugUtils.currentLine=9437209;
 //BA.debugLineNum = 9437209;BA.debugLine="dblinvtotaltax = dblinvtotal * (ClassTempProd";
_dblinvtotaltax = _dblinvtotal*(_classtempprod._taxid /*int*/ /(double)100);
RDebugUtils.currentLine=9437210;
 //BA.debugLineNum = 9437210;BA.debugLine="dblinvtotaldiscount = ClassTempProd.Discount";
_dblinvtotaldiscount = _classtempprod._discount /*double*/ ;
 }
};
RDebugUtils.currentLine=9437214;
 //BA.debugLineNum = 9437214;BA.debugLine="dblinvtotal = dblinvtotal + dblinvtotaltax";
_dblinvtotal = _dblinvtotal+_dblinvtotaltax;
RDebugUtils.currentLine=9437215;
 //BA.debugLineNum = 9437215;BA.debugLine="dblinvtotal = dblinvtotal - dblinvtotaldiscoun";
_dblinvtotal = _dblinvtotal-_dblinvtotaldiscount;
RDebugUtils.currentLine=9437217;
 //BA.debugLineNum = 9437217;BA.debugLine="If InvoiceID > 0 Then";
if (_invoiceid>0) { 
RDebugUtils.currentLine=9437219;
 //BA.debugLineNum = 9437219;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=9437220;
 //BA.debugLineNum = 9437220;BA.debugLine="sql1.ExecNonQuery2($\"UPDATE ReturnPurchaseInvo";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("UPDATE ReturnPurchaseInvoiceH\n"+"				   SET InvDT = ?\n"+"				      ,InvTotal = ?\n"+"				      ,InvTotalTax = ?\n"+"				      ,InvTotalDiscount = ?\n"+"				      ,InvTotalShipping = ?\n"+"				      ,PaidAmount = ?\n"+"				      ,StrNotes = ?\n"+"				      ,SupplierID = ?\n"+"				 WHERE ReturnPurchaseInvoiceHID=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_dblinvtotal),(Object)(_dblinvtotaltax),(Object)(_dblinvtotaldiscount),(Object)(0),(Object)(0),__ref._txtinvnote /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._cmbsupplier /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_invoiceid)}));
RDebugUtils.currentLine=9437231;
 //BA.debugLineNum = 9437231;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=9437233;
 //BA.debugLineNum = 9437233;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=9437234;
 //BA.debugLineNum = 9437234;BA.debugLine="sql1.ExecNonQuery2(\"delete from ReturnPurchase";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("delete from ReturnPurchaseInvoiceD where ReturnPurchaseInvoiceHID=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_invoiceid)}));
RDebugUtils.currentLine=9437235;
 //BA.debugLineNum = 9437235;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=9437237;
 //BA.debugLineNum = 9437237;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step29 = 1;
final int limit29 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit29 ;_i = _i + step29 ) {
RDebugUtils.currentLine=9437239;
 //BA.debugLineNum = 9437239;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=9437240;
 //BA.debugLineNum = 9437240;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=9437242;
 //BA.debugLineNum = 9437242;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=9437243;
 //BA.debugLineNum = 9437243;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO ReturnPurcha";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO ReturnPurchaseInvoiceD\n"+"			           (ReturnPurchaseInvoiceHID]\n"+"			           ,ProductID\n"+"			           ,ProductSellPrice\n"+"			           ,ProductCostPrice\n"+"			           ,TaxPerc\n"+"			           ,ProductQty)\n"+"			     VALUES\n"+"			           (?\n"+"			           ,?\n"+"			           ,?\n"+"			           ,?\n"+"			           ,?\n"+"			           ,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_invoiceid),(Object)(_classtempprod._productid /*int*/ ),(Object)(_classtempprod._unitprice /*double*/ ),(Object)(_classtempprod._productcostprice /*double*/ ),(Object)(_classtempprod._taxid /*int*/ ),(Object)(_classtempprod._qty /*int*/ )}));
RDebugUtils.currentLine=9437257;
 //BA.debugLineNum = 9437257;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }
};
 }else {
RDebugUtils.currentLine=9437264;
 //BA.debugLineNum = 9437264;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=9437265;
 //BA.debugLineNum = 9437265;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO ReturnPurcha";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO ReturnPurchaseInvoiceH\n"+"				           (InvDT\n"+"				           ,InvTotal\n"+"				           ,InvTotalTax\n"+"				           ,InvTotalDiscount\n"+"				           ,InvTotalShipping\n"+"				           ,PaidAmount\n"+"				           ,StrNotes\n"+"				           ,SupplierID)\n"+"				     VALUES\n"+"				           (?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_dblinvtotal),(Object)(_dblinvtotaltax),(Object)(_dblinvtotaldiscount),(Object)(0),(Object)(0),__ref._txtinvnote /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._cmbsupplier /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()}));
RDebugUtils.currentLine=9437284;
 //BA.debugLineNum = 9437284;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=9437286;
 //BA.debugLineNum = 9437286;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=9437287;
 //BA.debugLineNum = 9437287;BA.debugLine="rs = sql1.ExecQuery(\"select ReturnPurchaseInv";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select ReturnPurchaseInvoiceHID from ReturnPurchaseInvoiceH order by ReturnPurchaseInvoiceHID desc limit 1");
RDebugUtils.currentLine=9437288;
 //BA.debugLineNum = 9437288;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=9437289;
 //BA.debugLineNum = 9437289;BA.debugLine="LastSavedID = rs.GetInt(\"ReturnPurchaseInvoi";
_lastsavedid = _rs.GetInt("ReturnPurchaseInvoiceHID");
 }
;
RDebugUtils.currentLine=9437291;
 //BA.debugLineNum = 9437291;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=9437293;
 //BA.debugLineNum = 9437293;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step46 = 1;
final int limit46 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit46 ;_i = _i + step46 ) {
RDebugUtils.currentLine=9437294;
 //BA.debugLineNum = 9437294;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=9437295;
 //BA.debugLineNum = 9437295;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=9437297;
 //BA.debugLineNum = 9437297;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=9437298;
 //BA.debugLineNum = 9437298;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO ReturnPurc";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO ReturnPurchaseInvoiceD\n"+"					           (ReturnPurchaseInvoiceHID]\n"+"					           ,ProductID\n"+"					           ,ProductSellPrice\n"+"					           ,ProductCostPrice\n"+"					           ,TaxPerc\n"+"					           ,ProductQty)\n"+"					     VALUES\n"+"					           (?\n"+"					           ,?\n"+"					           ,?\n"+"					           ,?\n"+"					           ,?\n"+"					           ,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_lastsavedid),(Object)(_classtempprod._productid /*int*/ ),(Object)(_classtempprod._unitprice /*double*/ ),(Object)(_classtempprod._productcostprice /*double*/ ),(Object)(_classtempprod._taxid /*int*/ ),(Object)(_classtempprod._qty /*int*/ )}));
RDebugUtils.currentLine=9437312;
 //BA.debugLineNum = 9437312;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }
};
 };
RDebugUtils.currentLine=9437318;
 //BA.debugLineNum = 9437318;BA.debugLine="Main.Insert_UsersLogs(ws,\"Invoice Information\")";
_main._insert_userslogs /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,"Invoice Information");
RDebugUtils.currentLine=9437321;
 //BA.debugLineNum = 9437321;BA.debugLine="ws.Eval(\"document.location.replace('PurchaseInfo";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('PurchaseInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e57) {
			ba.setLastException(e57);RDebugUtils.currentLine=9437324;
 //BA.debugLineNum = 9437324;BA.debugLine="Log(LastException)";
__c.LogImpl("29437324",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=9437326;
 //BA.debugLineNum = 9437326;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.addreturnpurchaseinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnpurchaseinfo";
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="Private txtinvdate,cmbsupplier,txtinvnote,cmbprod";
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
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="Private TempProductsTable As List";
_tempproductstable = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8781831;
 //BA.debugLineNum = 8781831;BA.debugLine="Private templistcmbcustomer As List";
_templistcmbcustomer = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="Private templistpaymenttype As List";
_templistpaymenttype = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8781833;
 //BA.debugLineNum = 8781833;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=8781834;
 //BA.debugLineNum = 8781834;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=8781835;
 //BA.debugLineNum = 8781835;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=8781837;
 //BA.debugLineNum = 8781837;BA.debugLine="End Sub";
return "";
}
public String  _cmbproduct_change(b4j.example.addreturnpurchaseinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnpurchaseinfo";
if (Debug.shouldDelegate(ba, "cmbproduct_change", false))
	 {return ((String) Debug.delegate(ba, "cmbproduct_change", new Object[] {_params}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Sub cmbproduct_Change (Params As Map)";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="Try";
try {RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="rs = sql1.ExecQuery(\"select ProductPrice from Pr";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select ProductPrice from ProductsInformation where ProductID="+BA.ObjectToString(__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()));
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="txtunitprice.SetVal(rs.GetString(\"ProductPrice\"";
__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("ProductPrice")));
 }
;
RDebugUtils.currentLine=9240583;
 //BA.debugLineNum = 9240583;BA.debugLine="rs.Close";
_rs.Close();
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=9240586;
 //BA.debugLineNum = 9240586;BA.debugLine="Log(LastException)";
__c.LogImpl("29240586",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=9240588;
 //BA.debugLineNum = 9240588;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table_products(b4j.example.addreturnpurchaseinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnpurchaseinfo";
if (Debug.shouldDelegate(ba, "delete_button_table_products", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table_products", new Object[] {_params}));}
int _index = 0;
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Private Sub Delete_button_table_Products(params As";
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="Dim index As Int = params.Get(\"val\")";
_index = (int)(BA.ObjectToNumber(_params.Get((Object)("val"))));
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="TempProductsTable.RemoveAt(index)";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=9371653;
 //BA.debugLineNum = 9371653;BA.debugLine="Load_AddedProducts_Temp";
__ref._load_addedproducts_temp /*String*/ (null);
RDebugUtils.currentLine=9371655;
 //BA.debugLineNum = 9371655;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.addreturnpurchaseinfo __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="addreturnpurchaseinfo";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.addreturnpurchaseinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnpurchaseinfo";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Try";
try {RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"  bLengthChange: false,\n"+"  searching: false,\n"+"  responsive: true\n"+"});\n"+"\n"+"      });");
RDebugUtils.currentLine=9633807;
 //BA.debugLineNum = 9633807;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=9633810;
 //BA.debugLineNum = 9633810;BA.debugLine="Log(LastException)";
__c.LogImpl("29633810",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=9633812;
 //BA.debugLineNum = 9633812;BA.debugLine="End Sub";
return "";
}
public String  _load_customer(b4j.example.addreturnpurchaseinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnpurchaseinfo";
if (Debug.shouldDelegate(ba, "load_customer", false))
	 {return ((String) Debug.delegate(ba, "load_customer", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Sub Load_Customer";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Try";
try {RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="rs = sql1.ExecQuery(\"select * from SuppliersInfo";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from SuppliersInfo");
RDebugUtils.currentLine=9043975;
 //BA.debugLineNum = 9043975;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=9043976;
 //BA.debugLineNum = 9043976;BA.debugLine="Dim val As String = rs.GetInt(\"SupplierID\")";
_val = BA.NumberToString(_rs.GetInt("SupplierID"));
RDebugUtils.currentLine=9043977;
 //BA.debugLineNum = 9043977;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("SupplierName")).Append("</option>");
RDebugUtils.currentLine=9043979;
 //BA.debugLineNum = 9043979;BA.debugLine="templistcmbcustomer.Add(rs.GetInt(\"SupplierID\")";
__ref._templistcmbcustomer /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rs.GetInt("SupplierID")));
 }
;
RDebugUtils.currentLine=9043982;
 //BA.debugLineNum = 9043982;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=9043983;
 //BA.debugLineNum = 9043983;BA.debugLine="cmbsupplier.SetHtml(sb.ToString)";
__ref._cmbsupplier /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=9043986;
 //BA.debugLineNum = 9043986;BA.debugLine="Log(LastException)";
__c.LogImpl("29043986",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=9043988;
 //BA.debugLineNum = 9043988;BA.debugLine="End Sub";
return "";
}
public String  _load_data_byid(b4j.example.addreturnpurchaseinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnpurchaseinfo";
if (Debug.shouldDelegate(ba, "load_data_byid", false))
	 {return ((String) Debug.delegate(ba, "load_data_byid", null));}
int _invoiceid = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _strid = "";
b4j.example.clstempproducts _classtempprod = null;
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Sub Load_Data_ByID";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="Try";
try {RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="Dim InvoiceID As Int = 0";
_invoiceid = (int) (0);
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="If ws.Session.GetAttribute(\"InvoiceID\") = Null T";
if (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")== null) { 
 }else {
RDebugUtils.currentLine=9568263;
 //BA.debugLineNum = 9568263;BA.debugLine="InvoiceID = ws.Session.GetAttribute(\"InvoiceID\"";
_invoiceid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")));
 };
RDebugUtils.currentLine=9568266;
 //BA.debugLineNum = 9568266;BA.debugLine="If InvoiceID > 0 Then";
if (_invoiceid>0) { 
RDebugUtils.currentLine=9568268;
 //BA.debugLineNum = 9568268;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=9568269;
 //BA.debugLineNum = 9568269;BA.debugLine="rs = sql1.ExecQuery(\"select * from ReturnPurcha";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from ReturnPurchaseInvoiceH where ReturnPurchaseInvoiceHID="+BA.NumberToString(_invoiceid));
RDebugUtils.currentLine=9568270;
 //BA.debugLineNum = 9568270;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=9568272;
 //BA.debugLineNum = 9568272;BA.debugLine="txtinvdate.SetVal(rs.GetString(\"InvDT\"))";
__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("InvDT")));
RDebugUtils.currentLine=9568273;
 //BA.debugLineNum = 9568273;BA.debugLine="txtinvnote.SetVal(rs.GetString(\"StrNotes\"))";
__ref._txtinvnote /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("StrNotes")));
RDebugUtils.currentLine=9568275;
 //BA.debugLineNum = 9568275;BA.debugLine="Dim strID As String = cmbsupplier.id";
_strid = __ref._cmbsupplier /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .getId();
RDebugUtils.currentLine=9568276;
 //BA.debugLineNum = 9568276;BA.debugLine="strID = strID.Replace(\"#\",\"\")";
_strid = _strid.replace("#","");
RDebugUtils.currentLine=9568277;
 //BA.debugLineNum = 9568277;BA.debugLine="ws.RunFunction(\"setSelectedRow\", Array As Obje";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .RunFunction("setSelectedRow",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_strid),(Object)(_rs.GetInt("SupplierID"))}));
 }
;
RDebugUtils.currentLine=9568280;
 //BA.debugLineNum = 9568280;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=9568283;
 //BA.debugLineNum = 9568283;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=9568284;
 //BA.debugLineNum = 9568284;BA.debugLine="rs = sql1.ExecQuery(\"select * from ReturnPurcha";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from ReturnPurchaseInvoiceD where ReturnPurchaseInvoiceHID="+BA.NumberToString(_invoiceid));
RDebugUtils.currentLine=9568285;
 //BA.debugLineNum = 9568285;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=9568287;
 //BA.debugLineNum = 9568287;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=9568288;
 //BA.debugLineNum = 9568288;BA.debugLine="ClassTempProd.Initialize";
_classtempprod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=9568289;
 //BA.debugLineNum = 9568289;BA.debugLine="ClassTempProd.SetValues(rs.GetInt(\"ProductID\")";
_classtempprod._setvalues /*String*/ (null,_rs.GetInt("ProductID"),_rs.GetInt("TaxPerc"),(float)(Double.parseDouble(_rs.GetString("ProductSellPrice"))),_rs.GetInt("ProductQty"),(float) (0));
RDebugUtils.currentLine=9568291;
 //BA.debugLineNum = 9568291;BA.debugLine="TempProductsTable.Add(ClassTempProd)";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_classtempprod));
RDebugUtils.currentLine=9568292;
 //BA.debugLineNum = 9568292;BA.debugLine="Load_AddedProducts_Temp";
__ref._load_addedproducts_temp /*String*/ (null);
 }
;
RDebugUtils.currentLine=9568295;
 //BA.debugLineNum = 9568295;BA.debugLine="rs.Close";
_rs.Close();
 };
 } 
       catch (Exception e30) {
			ba.setLastException(e30);RDebugUtils.currentLine=9568300;
 //BA.debugLineNum = 9568300;BA.debugLine="Log(LastException)";
__c.LogImpl("29568300",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=9568302;
 //BA.debugLineNum = 9568302;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls2(b4j.example.addreturnpurchaseinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnpurchaseinfo";
if (Debug.shouldDelegate(ba, "load_datatable_controls2", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls2", null));}
String _str = "";
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Sub Load_Datatable_Controls2";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Try";
try {RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable2').DataTable({\n"+"  bLengthChange: false,\n"+"  searching: false,\n"+"  responsive: true\n"+"});\n"+"      });");
RDebugUtils.currentLine=9699342;
 //BA.debugLineNum = 9699342;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=9699345;
 //BA.debugLineNum = 9699345;BA.debugLine="Log(LastException)";
__c.LogImpl("29699345",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=9699347;
 //BA.debugLineNum = 9699347;BA.debugLine="End Sub";
return "";
}
public String  _load_products(b4j.example.addreturnpurchaseinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnpurchaseinfo";
if (Debug.shouldDelegate(ba, "load_products", false))
	 {return ((String) Debug.delegate(ba, "load_products", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Sub Load_Products";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="Try";
try {RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="rs = sql1.ExecQuery(\"select * from ProductsInfor";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from ProductsInformation");
RDebugUtils.currentLine=9109511;
 //BA.debugLineNum = 9109511;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=9109512;
 //BA.debugLineNum = 9109512;BA.debugLine="Dim val As String = rs.GetInt(\"ProductID\")";
_val = BA.NumberToString(_rs.GetInt("ProductID"));
RDebugUtils.currentLine=9109513;
 //BA.debugLineNum = 9109513;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("ProductName")).Append("</option>");
 }
;
RDebugUtils.currentLine=9109515;
 //BA.debugLineNum = 9109515;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=9109516;
 //BA.debugLineNum = 9109516;BA.debugLine="cmbproduct.SetHtml(sb.ToString)";
__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=9109519;
 //BA.debugLineNum = 9109519;BA.debugLine="Log(LastException)";
__c.LogImpl("29109519",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=9109521;
 //BA.debugLineNum = 9109521;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.addreturnpurchaseinfo __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnpurchaseinfo";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="TempProductsTable.Initialize";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="templistcmbcustomer.Initialize";
__ref._templistcmbcustomer /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=8912902;
 //BA.debugLineNum = 8912902;BA.debugLine="templistpaymenttype.Initialize";
__ref._templistpaymenttype /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=8912903;
 //BA.debugLineNum = 8912903;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=8912905;
 //BA.debugLineNum = 8912905;BA.debugLine="Load_Customer";
__ref._load_customer /*String*/ (null);
RDebugUtils.currentLine=8912907;
 //BA.debugLineNum = 8912907;BA.debugLine="Load_Products";
__ref._load_products /*String*/ (null);
RDebugUtils.currentLine=8912910;
 //BA.debugLineNum = 8912910;BA.debugLine="Load_Data_ByID";
__ref._load_data_byid /*String*/ (null);
RDebugUtils.currentLine=8912913;
 //BA.debugLineNum = 8912913;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.addreturnpurchaseinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnpurchaseinfo";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="End Sub";
return "";
}
}