package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class addreturnsalesinfo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.addreturnsalesinfo", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.addreturnsalesinfo.class).invoke(this, new Object[] {null});
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
public String  _btnaddproduct_click(b4j.example.addreturnsalesinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnsalesinfo";
if (Debug.shouldDelegate(ba, "btnaddproduct_click", false))
	 {return ((String) Debug.delegate(ba, "btnaddproduct_click", new Object[] {_params}));}
b4j.example.clstempproducts _classtempprod = null;
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Sub btnaddproduct_Click (Params As Map)";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="Try";
try {RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="If cmbproduct.GetVal.Value = \"0\" Or txtunitprice";
if ((__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("0")) || (__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtqty /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtdiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10289158;
 //BA.debugLineNum = 10289158;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=10289159;
 //BA.debugLineNum = 10289159;BA.debugLine="ClassTempProd.Initialize";
_classtempprod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=10289160;
 //BA.debugLineNum = 10289160;BA.debugLine="ClassTempProd.SetValues(cmbproduct.GetVal.Value,";
_classtempprod._setvalues /*String*/ (null,(int)(BA.ObjectToNumber(__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(int)(BA.ObjectToNumber(__ref._txttax /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(float)(BA.ObjectToNumber(__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(int)(BA.ObjectToNumber(__ref._txtqty /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(float)(BA.ObjectToNumber(__ref._txtdiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())));
RDebugUtils.currentLine=10289162;
 //BA.debugLineNum = 10289162;BA.debugLine="TempProductsTable.Add(ClassTempProd)";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_classtempprod));
RDebugUtils.currentLine=10289163;
 //BA.debugLineNum = 10289163;BA.debugLine="Load_AddedProducts_Temp";
__ref._load_addedproducts_temp /*String*/ (null);
RDebugUtils.currentLine=10289165;
 //BA.debugLineNum = 10289165;BA.debugLine="txtunitprice.SetVal(\"0\")";
__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("0"));
RDebugUtils.currentLine=10289166;
 //BA.debugLineNum = 10289166;BA.debugLine="txtqty.SetVal(\"0\")";
__ref._txtqty /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("0"));
RDebugUtils.currentLine=10289167;
 //BA.debugLineNum = 10289167;BA.debugLine="txtdiscount.SetVal(\"0\")";
__ref._txtdiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("0"));
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=10289170;
 //BA.debugLineNum = 10289170;BA.debugLine="Log(LastException)";
__c.LogImpl("210289170",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=10289172;
 //BA.debugLineNum = 10289172;BA.debugLine="End Sub";
return "";
}
public String  _load_addedproducts_temp(b4j.example.addreturnsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnsalesinfo";
if (Debug.shouldDelegate(ba, "load_addedproducts_temp", false))
	 {return ((String) Debug.delegate(ba, "load_addedproducts_temp", null));}
String _str = "";
int _i = 0;
b4j.example.clstempproducts _classtempprod = null;
float _taxperc = 0f;
float _totalamount = 0f;
float _temptotalamount = 0f;
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Sub Load_AddedProducts_Temp";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="Try";
try {RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Product Name</th>\n"+"									                  <th class=\"wd-20p\">Unit Price</th>\n"+"									                  <th class=\"wd-10p\">Quantity</th>\n"+"									                  <th class=\"wd-15p\">Total</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=10420242;
 //BA.debugLineNum = 10420242;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=10420244;
 //BA.debugLineNum = 10420244;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=10420245;
 //BA.debugLineNum = 10420245;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=10420247;
 //BA.debugLineNum = 10420247;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=10420248;
 //BA.debugLineNum = 10420248;BA.debugLine="str = str & \"<td>\"& ClassTempProd.ProductID &\"<";
_str = _str+"<td>"+BA.NumberToString(_classtempprod._productid /*int*/ )+"</td>";
RDebugUtils.currentLine=10420249;
 //BA.debugLineNum = 10420249;BA.debugLine="str = str & \"<td>\"& ClassTempProd.ProductName &";
_str = _str+"<td>"+_classtempprod._productname /*String*/ +"</td>";
RDebugUtils.currentLine=10420250;
 //BA.debugLineNum = 10420250;BA.debugLine="str = str & \"<td>\"& ClassTempProd.UnitPrice &\"<";
_str = _str+"<td>"+BA.NumberToString(_classtempprod._unitprice /*double*/ )+"</td>";
RDebugUtils.currentLine=10420251;
 //BA.debugLineNum = 10420251;BA.debugLine="str = str & \"<td>\"& ClassTempProd.Qty &\"</td>\"";
_str = _str+"<td>"+BA.NumberToString(_classtempprod._qty /*int*/ )+"</td>";
RDebugUtils.currentLine=10420253;
 //BA.debugLineNum = 10420253;BA.debugLine="Dim taxPerc As Float = 0";
_taxperc = (float) (0);
RDebugUtils.currentLine=10420254;
 //BA.debugLineNum = 10420254;BA.debugLine="taxPerc = ClassTempProd.TaxID";
_taxperc = (float) (_classtempprod._taxid /*int*/ );
RDebugUtils.currentLine=10420256;
 //BA.debugLineNum = 10420256;BA.debugLine="Dim TotalAmount As Float =  ((ClassTempProd.Uni";
_totalamount = (float) (((_classtempprod._unitprice /*double*/ *_classtempprod._qty /*int*/ )-_classtempprod._discount /*double*/ ));
RDebugUtils.currentLine=10420257;
 //BA.debugLineNum = 10420257;BA.debugLine="Dim TempTotalAmount As Float = 0";
_temptotalamount = (float) (0);
RDebugUtils.currentLine=10420258;
 //BA.debugLineNum = 10420258;BA.debugLine="If taxPerc > 0 Then";
if (_taxperc>0) { 
RDebugUtils.currentLine=10420259;
 //BA.debugLineNum = 10420259;BA.debugLine="TempTotalAmount = TotalAmount";
_temptotalamount = _totalamount;
RDebugUtils.currentLine=10420260;
 //BA.debugLineNum = 10420260;BA.debugLine="TempTotalAmount = TempTotalAmount * (taxPerc /";
_temptotalamount = (float) (_temptotalamount*(_taxperc/(double)100));
 };
RDebugUtils.currentLine=10420263;
 //BA.debugLineNum = 10420263;BA.debugLine="str = str & \"<td>\"& NumberFormat((TotalAmount +";
_str = _str+"<td>"+__c.NumberFormat((_totalamount+_temptotalamount),(int) (0),(int) (4))+"</td>";
RDebugUtils.currentLine=10420265;
 //BA.debugLineNum = 10420265;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"deleteproductTbl("+BA.NumberToString(_i)+")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "+" </td> </tr>";
 }
};
RDebugUtils.currentLine=10420271;
 //BA.debugLineNum = 10420271;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
RDebugUtils.currentLine=10420273;
 //BA.debugLineNum = 10420273;BA.debugLine="divproducts.SetHtml(str)";
__ref._divproducts /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
RDebugUtils.currentLine=10420275;
 //BA.debugLineNum = 10420275;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
 } 
       catch (Exception e27) {
			ba.setLastException(e27);RDebugUtils.currentLine=10420278;
 //BA.debugLineNum = 10420278;BA.debugLine="Log(LastException)";
__c.LogImpl("210420278",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=10420280;
 //BA.debugLineNum = 10420280;BA.debugLine="End Sub";
return "";
}
public String  _btncancel_click(b4j.example.addreturnsalesinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnsalesinfo";
if (Debug.shouldDelegate(ba, "btncancel_click", false))
	 {return ((String) Debug.delegate(ba, "btncancel_click", new Object[] {_params}));}
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Sub btncancel_Click (Params As Map)";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="ws.Eval(\"document.location.replace('SalesInforma";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('SalesInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="End Sub";
return "";
}
public String  _btnsave_click(b4j.example.addreturnsalesinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnsalesinfo";
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
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Sub btnsave_Click (Params As Map)";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="Try";
try {RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="Dim LastSavedID As Int = 0";
_lastsavedid = (int) (0);
RDebugUtils.currentLine=10551302;
 //BA.debugLineNum = 10551302;BA.debugLine="If txtinvdate.GetVal.Value = \"\"  Then";
if ((__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=10551303;
 //BA.debugLineNum = 10551303;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10551306;
 //BA.debugLineNum = 10551306;BA.debugLine="Dim InvoiceID As Int = 0";
_invoiceid = (int) (0);
RDebugUtils.currentLine=10551307;
 //BA.debugLineNum = 10551307;BA.debugLine="If ws.Session.GetAttribute(\"InvoiceID\") = Null T";
if (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")== null) { 
 }else {
RDebugUtils.currentLine=10551310;
 //BA.debugLineNum = 10551310;BA.debugLine="InvoiceID = ws.Session.GetAttribute(\"InvoiceID\"";
_invoiceid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")));
RDebugUtils.currentLine=10551311;
 //BA.debugLineNum = 10551311;BA.debugLine="LastSavedID = InvoiceID";
_lastsavedid = _invoiceid;
 };
RDebugUtils.currentLine=10551314;
 //BA.debugLineNum = 10551314;BA.debugLine="Dim dblinvtotal,dblinvtotaltax,dblinvtotaldisco";
_dblinvtotal = 0;
_dblinvtotaltax = 0;
_dblinvtotaldiscount = 0;
RDebugUtils.currentLine=10551316;
 //BA.debugLineNum = 10551316;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=10551318;
 //BA.debugLineNum = 10551318;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=10551319;
 //BA.debugLineNum = 10551319;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=10551321;
 //BA.debugLineNum = 10551321;BA.debugLine="dblinvtotal = ClassTempProd.Qty * ClassTempPr";
_dblinvtotal = _classtempprod._qty /*int*/ *_classtempprod._unitprice /*double*/ ;
RDebugUtils.currentLine=10551322;
 //BA.debugLineNum = 10551322;BA.debugLine="dblinvtotaltax = dblinvtotal * (ClassTempProd";
_dblinvtotaltax = _dblinvtotal*(_classtempprod._taxid /*int*/ /(double)100);
RDebugUtils.currentLine=10551323;
 //BA.debugLineNum = 10551323;BA.debugLine="dblinvtotaldiscount = ClassTempProd.Discount";
_dblinvtotaldiscount = _classtempprod._discount /*double*/ ;
 }
};
RDebugUtils.currentLine=10551326;
 //BA.debugLineNum = 10551326;BA.debugLine="dblinvtotal = dblinvtotal + dblinvtotaltax";
_dblinvtotal = _dblinvtotal+_dblinvtotaltax;
RDebugUtils.currentLine=10551327;
 //BA.debugLineNum = 10551327;BA.debugLine="dblinvtotal = dblinvtotal - dblinvtotaldiscoun";
_dblinvtotal = _dblinvtotal-_dblinvtotaldiscount;
RDebugUtils.currentLine=10551329;
 //BA.debugLineNum = 10551329;BA.debugLine="If InvoiceID > 0 Then";
if (_invoiceid>0) { 
RDebugUtils.currentLine=10551334;
 //BA.debugLineNum = 10551334;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=10551335;
 //BA.debugLineNum = 10551335;BA.debugLine="sql1.ExecNonQuery2($\"UPDATE SalesInvoiceH";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("UPDATE SalesInvoiceH\n"+"				   SET InvDT = ?\n"+"				      ,InvTotal = ?\n"+"				      ,UserID = ?\n"+"				      ,InvTotalTax = ?\n"+"				      ,InvTotalDiscount = ?\n"+"				      ,InvTotalShipping = ?\n"+"				      ,PaidAmount = ?\n"+"				      ,StrNotes] = ?\n"+"				      ,PaymenttypeID = ?\n"+"				      ,CustomerID = ?\n"+"				 WHERE SalesInvoiceHID=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_dblinvtotal),__ref._cmbuser /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_dblinvtotaltax),(Object)(_dblinvtotaldiscount),(Object)(0),(Object)(0),__ref._txtinvnote /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._cmbpaymenttype /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._cmbcustomer /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_invoiceid)}));
RDebugUtils.currentLine=10551348;
 //BA.debugLineNum = 10551348;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=10551350;
 //BA.debugLineNum = 10551350;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=10551351;
 //BA.debugLineNum = 10551351;BA.debugLine="sql1.ExecNonQuery2(\"delete from SalesInvoiceD";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("delete from SalesInvoiceD where SalesInvoiceHID=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_invoiceid)}));
RDebugUtils.currentLine=10551352;
 //BA.debugLineNum = 10551352;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=10551354;
 //BA.debugLineNum = 10551354;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step29 = 1;
final int limit29 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit29 ;_i = _i + step29 ) {
RDebugUtils.currentLine=10551356;
 //BA.debugLineNum = 10551356;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=10551357;
 //BA.debugLineNum = 10551357;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=10551359;
 //BA.debugLineNum = 10551359;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=10551360;
 //BA.debugLineNum = 10551360;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO SalesInvoice";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO SalesInvoiceD\n"+"			           (SalesInvoiceHID\n"+"			           ,ProductID\n"+"			           ,ProductSellPrice\n"+"			           ,ProductCostPrice\n"+"			           ,TaxPerc\n"+"			           ,ProductQty)\n"+"			     VALUES\n"+"			           (?\n"+"			           ,?\n"+"			           ,?\n"+"			           ,?\n"+"			           ,?\n"+"			           ,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_invoiceid),(Object)(_classtempprod._productid /*int*/ ),(Object)(_classtempprod._unitprice /*double*/ ),(Object)(_classtempprod._productcostprice /*double*/ ),(Object)(_classtempprod._taxid /*int*/ ),(Object)(_classtempprod._qty /*int*/ )}));
RDebugUtils.currentLine=10551374;
 //BA.debugLineNum = 10551374;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }
};
 }else {
RDebugUtils.currentLine=10551383;
 //BA.debugLineNum = 10551383;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=10551384;
 //BA.debugLineNum = 10551384;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO SalesInvoice";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO SalesInvoiceH\n"+"				           (InvDT\n"+"				           ,InvTotal\n"+"				           ,UserID\n"+"				           ,InvTotalTax\n"+"				           ,InvTotalDiscount\n"+"				           ,InvTotalShipping\n"+"				           ,PaidAmount\n"+"				           ,StrNotes\n"+"				           ,PaymenttypeID\n"+"				           ,CustomerID)\n"+"				     VALUES\n"+"				           (?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_dblinvtotal),__ref._cmbuser /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_dblinvtotaltax),(Object)(_dblinvtotaldiscount),(Object)(0),(Object)(0),__ref._txtinvnote /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._cmbpaymenttype /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._cmbcustomer /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()}));
RDebugUtils.currentLine=10551407;
 //BA.debugLineNum = 10551407;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=10551409;
 //BA.debugLineNum = 10551409;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=10551410;
 //BA.debugLineNum = 10551410;BA.debugLine="rs = sql1.ExecQuery(\"select SalesInvoiceHID f";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select SalesInvoiceHID from SalesInvoiceH order by SalesInvoiceHID desc limit 1");
RDebugUtils.currentLine=10551411;
 //BA.debugLineNum = 10551411;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=10551412;
 //BA.debugLineNum = 10551412;BA.debugLine="LastSavedID = rs.GetInt(\"SalesInvoiceHID\")";
_lastsavedid = _rs.GetInt("SalesInvoiceHID");
 }
;
RDebugUtils.currentLine=10551414;
 //BA.debugLineNum = 10551414;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=10551416;
 //BA.debugLineNum = 10551416;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step46 = 1;
final int limit46 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit46 ;_i = _i + step46 ) {
RDebugUtils.currentLine=10551417;
 //BA.debugLineNum = 10551417;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=10551418;
 //BA.debugLineNum = 10551418;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=10551420;
 //BA.debugLineNum = 10551420;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=10551421;
 //BA.debugLineNum = 10551421;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO SalesInvoi";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO SalesInvoiceD\n"+"					           (SalesInvoiceHID\n"+"					           ,ProductID\n"+"					           ,ProductSellPrice\n"+"					           ,ProductCostPrice\n"+"					           ,TaxPerc\n"+"					           ,ProductQty)\n"+"					     VALUES\n"+"					           (?\n"+"					           ,?\n"+"					           ,?\n"+"					           ,?\n"+"					           ,?\n"+"					           ,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_lastsavedid),(Object)(_classtempprod._productid /*int*/ ),(Object)(_classtempprod._unitprice /*double*/ ),(Object)(_classtempprod._productcostprice /*double*/ ),(Object)(_classtempprod._taxid /*int*/ ),(Object)(_classtempprod._qty /*int*/ )}));
RDebugUtils.currentLine=10551435;
 //BA.debugLineNum = 10551435;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }
};
 };
RDebugUtils.currentLine=10551442;
 //BA.debugLineNum = 10551442;BA.debugLine="Main.Insert_UsersLogs(ws,\"Invoice Information\")";
_main._insert_userslogs /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,"Invoice Information");
RDebugUtils.currentLine=10551445;
 //BA.debugLineNum = 10551445;BA.debugLine="ws.Eval(\"document.location.replace('SalesInforma";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('SalesInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e57) {
			ba.setLastException(e57);RDebugUtils.currentLine=10551448;
 //BA.debugLineNum = 10551448;BA.debugLine="Log(LastException)";
__c.LogImpl("210551448",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=10551450;
 //BA.debugLineNum = 10551450;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.addreturnsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnsalesinfo";
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="Private txtinvdate,cmbcustomer,cmbuser,txtinvnote";
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
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="Private TempProductsTable As List";
_tempproductstable = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9764871;
 //BA.debugLineNum = 9764871;BA.debugLine="Private templistcmbcustomer As List";
_templistcmbcustomer = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="Private templistpaymenttype As List";
_templistpaymenttype = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9764873;
 //BA.debugLineNum = 9764873;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=9764874;
 //BA.debugLineNum = 9764874;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=9764875;
 //BA.debugLineNum = 9764875;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=9764877;
 //BA.debugLineNum = 9764877;BA.debugLine="End Sub";
return "";
}
public String  _cmbproduct_change(b4j.example.addreturnsalesinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnsalesinfo";
if (Debug.shouldDelegate(ba, "cmbproduct_change", false))
	 {return ((String) Debug.delegate(ba, "cmbproduct_change", new Object[] {_params}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Sub cmbproduct_Change (Params As Map)";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Try";
try {RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="rs = sql1.ExecQuery(\"select ProductPrice from Pr";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select ProductPrice from ProductsInformation where ProductID="+BA.ObjectToString(__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()));
RDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=10354693;
 //BA.debugLineNum = 10354693;BA.debugLine="txtunitprice.SetVal(rs.GetString(\"ProductPrice\"";
__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("ProductPrice")));
 }
;
RDebugUtils.currentLine=10354695;
 //BA.debugLineNum = 10354695;BA.debugLine="rs.Close";
_rs.Close();
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=10354698;
 //BA.debugLineNum = 10354698;BA.debugLine="Log(LastException)";
__c.LogImpl("210354698",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=10354700;
 //BA.debugLineNum = 10354700;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table_products(b4j.example.addreturnsalesinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnsalesinfo";
if (Debug.shouldDelegate(ba, "delete_button_table_products", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table_products", new Object[] {_params}));}
int _index = 0;
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Private Sub Delete_button_table_Products(params As";
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="Dim index As Int = params.Get(\"val\")";
_index = (int)(BA.ObjectToNumber(_params.Get((Object)("val"))));
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="TempProductsTable.RemoveAt(index)";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="Load_AddedProducts_Temp";
__ref._load_addedproducts_temp /*String*/ (null);
RDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.addreturnsalesinfo __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="addreturnsalesinfo";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.addreturnsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnsalesinfo";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="Try";
try {RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"  bLengthChange: false,\n"+"  searching: false,\n"+"  responsive: true\n"+"});\n"+"\n"+"      });");
RDebugUtils.currentLine=10747919;
 //BA.debugLineNum = 10747919;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=10747922;
 //BA.debugLineNum = 10747922;BA.debugLine="Log(LastException)";
__c.LogImpl("210747922",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=10747924;
 //BA.debugLineNum = 10747924;BA.debugLine="End Sub";
return "";
}
public String  _load_customer(b4j.example.addreturnsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnsalesinfo";
if (Debug.shouldDelegate(ba, "load_customer", false))
	 {return ((String) Debug.delegate(ba, "load_customer", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Sub Load_Customer";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="Try";
try {RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=10027013;
 //BA.debugLineNum = 10027013;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=10027014;
 //BA.debugLineNum = 10027014;BA.debugLine="rs = sql1.ExecQuery(\"select * from CustomersInfo";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from CustomersInformation");
RDebugUtils.currentLine=10027015;
 //BA.debugLineNum = 10027015;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=10027016;
 //BA.debugLineNum = 10027016;BA.debugLine="Dim val As String = rs.GetInt(\"CustomerID\")";
_val = BA.NumberToString(_rs.GetInt("CustomerID"));
RDebugUtils.currentLine=10027017;
 //BA.debugLineNum = 10027017;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("CustomerName")).Append("</option>");
RDebugUtils.currentLine=10027019;
 //BA.debugLineNum = 10027019;BA.debugLine="templistcmbcustomer.Add(rs.GetInt(\"CustomerID\")";
__ref._templistcmbcustomer /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rs.GetInt("CustomerID")));
 }
;
RDebugUtils.currentLine=10027022;
 //BA.debugLineNum = 10027022;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=10027023;
 //BA.debugLineNum = 10027023;BA.debugLine="cmbcustomer.SetHtml(sb.ToString)";
__ref._cmbcustomer /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=10027026;
 //BA.debugLineNum = 10027026;BA.debugLine="Log(LastException)";
__c.LogImpl("210027026",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=10027028;
 //BA.debugLineNum = 10027028;BA.debugLine="End Sub";
return "";
}
public String  _load_data_byid(b4j.example.addreturnsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnsalesinfo";
if (Debug.shouldDelegate(ba, "load_data_byid", false))
	 {return ((String) Debug.delegate(ba, "load_data_byid", null));}
int _invoiceid = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _strid = "";
b4j.example.clstempproducts _classtempprod = null;
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Sub Load_Data_ByID";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="Try";
try {RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="Dim InvoiceID As Int = 0";
_invoiceid = (int) (0);
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="If ws.Session.GetAttribute(\"InvoiceID\") = Null T";
if (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")== null) { 
 }else {
RDebugUtils.currentLine=10682375;
 //BA.debugLineNum = 10682375;BA.debugLine="InvoiceID = ws.Session.GetAttribute(\"InvoiceID\"";
_invoiceid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")));
 };
RDebugUtils.currentLine=10682378;
 //BA.debugLineNum = 10682378;BA.debugLine="If InvoiceID > 0 Then";
if (_invoiceid>0) { 
RDebugUtils.currentLine=10682380;
 //BA.debugLineNum = 10682380;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=10682381;
 //BA.debugLineNum = 10682381;BA.debugLine="rs = sql1.ExecQuery(\"select * from SalesInvoice";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from SalesInvoiceH where SalesInvoiceHID="+BA.NumberToString(_invoiceid));
RDebugUtils.currentLine=10682382;
 //BA.debugLineNum = 10682382;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=10682384;
 //BA.debugLineNum = 10682384;BA.debugLine="txtinvdate.SetVal(rs.GetString(\"InvDT\"))";
__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("InvDT")));
RDebugUtils.currentLine=10682385;
 //BA.debugLineNum = 10682385;BA.debugLine="txtinvnote.SetVal(rs.GetString(\"StrNotes\"))";
__ref._txtinvnote /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("StrNotes")));
RDebugUtils.currentLine=10682387;
 //BA.debugLineNum = 10682387;BA.debugLine="Dim strID As String = cmbcustomer.id";
_strid = __ref._cmbcustomer /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .getId();
RDebugUtils.currentLine=10682388;
 //BA.debugLineNum = 10682388;BA.debugLine="strID = strID.Replace(\"#\",\"\")";
_strid = _strid.replace("#","");
RDebugUtils.currentLine=10682389;
 //BA.debugLineNum = 10682389;BA.debugLine="ws.RunFunction(\"setSelectedRow\", Array As Obje";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .RunFunction("setSelectedRow",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_strid),(Object)(_rs.GetInt("CustomerID"))}));
RDebugUtils.currentLine=10682392;
 //BA.debugLineNum = 10682392;BA.debugLine="Dim strID As String = cmbpaymenttype.id";
_strid = __ref._cmbpaymenttype /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .getId();
RDebugUtils.currentLine=10682393;
 //BA.debugLineNum = 10682393;BA.debugLine="strID = strID.Replace(\"#\",\"\")";
_strid = _strid.replace("#","");
RDebugUtils.currentLine=10682394;
 //BA.debugLineNum = 10682394;BA.debugLine="ws.RunFunction(\"setSelectedRow\", Array As Obje";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .RunFunction("setSelectedRow",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_strid),(Object)(_rs.GetInt("PaymenttypeID"))}));
RDebugUtils.currentLine=10682396;
 //BA.debugLineNum = 10682396;BA.debugLine="Dim strID As String = cmbuser.id";
_strid = __ref._cmbuser /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .getId();
RDebugUtils.currentLine=10682397;
 //BA.debugLineNum = 10682397;BA.debugLine="strID = strID.Replace(\"#\",\"\")";
_strid = _strid.replace("#","");
RDebugUtils.currentLine=10682398;
 //BA.debugLineNum = 10682398;BA.debugLine="ws.RunFunction(\"setSelectedRow\", Array As Obje";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .RunFunction("setSelectedRow",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_strid),(Object)(_rs.GetInt("UserID"))}));
 }
;
RDebugUtils.currentLine=10682402;
 //BA.debugLineNum = 10682402;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=10682405;
 //BA.debugLineNum = 10682405;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=10682406;
 //BA.debugLineNum = 10682406;BA.debugLine="rs = sql1.ExecQuery(\"select * from SalesInvoice";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from SalesInvoiceD where SalesInvoiceHID="+BA.NumberToString(_invoiceid));
RDebugUtils.currentLine=10682407;
 //BA.debugLineNum = 10682407;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=10682409;
 //BA.debugLineNum = 10682409;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=10682410;
 //BA.debugLineNum = 10682410;BA.debugLine="ClassTempProd.Initialize";
_classtempprod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=10682411;
 //BA.debugLineNum = 10682411;BA.debugLine="ClassTempProd.SetValues(rs.GetInt(\"ProductID\")";
_classtempprod._setvalues /*String*/ (null,_rs.GetInt("ProductID"),_rs.GetInt("TaxPerc"),(float)(Double.parseDouble(_rs.GetString("ProductSellPrice"))),_rs.GetInt("ProductCostPrice"),(float) (0));
RDebugUtils.currentLine=10682413;
 //BA.debugLineNum = 10682413;BA.debugLine="TempProductsTable.Add(ClassTempProd)";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_classtempprod));
RDebugUtils.currentLine=10682414;
 //BA.debugLineNum = 10682414;BA.debugLine="Load_AddedProducts_Temp";
__ref._load_addedproducts_temp /*String*/ (null);
 }
;
RDebugUtils.currentLine=10682417;
 //BA.debugLineNum = 10682417;BA.debugLine="rs.Close";
_rs.Close();
 };
 } 
       catch (Exception e36) {
			ba.setLastException(e36);RDebugUtils.currentLine=10682423;
 //BA.debugLineNum = 10682423;BA.debugLine="Log(LastException)";
__c.LogImpl("210682423",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=10682425;
 //BA.debugLineNum = 10682425;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls2(b4j.example.addreturnsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnsalesinfo";
if (Debug.shouldDelegate(ba, "load_datatable_controls2", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls2", null));}
String _str = "";
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Sub Load_Datatable_Controls2";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="Try";
try {RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable2').DataTable({\n"+"  bLengthChange: false,\n"+"  searching: false,\n"+"  responsive: true\n"+"});\n"+"      });");
RDebugUtils.currentLine=10813454;
 //BA.debugLineNum = 10813454;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=10813457;
 //BA.debugLineNum = 10813457;BA.debugLine="Log(LastException)";
__c.LogImpl("210813457",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=10813459;
 //BA.debugLineNum = 10813459;BA.debugLine="End Sub";
return "";
}
public String  _load_paymenttypes(b4j.example.addreturnsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnsalesinfo";
if (Debug.shouldDelegate(ba, "load_paymenttypes", false))
	 {return ((String) Debug.delegate(ba, "load_paymenttypes", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Sub Load_PaymentTypes";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="Try";
try {RDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10092548;
 //BA.debugLineNum = 10092548;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=10092549;
 //BA.debugLineNum = 10092549;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=10092550;
 //BA.debugLineNum = 10092550;BA.debugLine="rs = sql1.ExecQuery(\"select * from PaymentTypesI";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from PaymentTypesInfo");
RDebugUtils.currentLine=10092551;
 //BA.debugLineNum = 10092551;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=10092552;
 //BA.debugLineNum = 10092552;BA.debugLine="Dim val As String = rs.GetInt(\"PaymenttypeID\")";
_val = BA.NumberToString(_rs.GetInt("PaymenttypeID"));
RDebugUtils.currentLine=10092553;
 //BA.debugLineNum = 10092553;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("PaymentDesc")).Append("</option>");
RDebugUtils.currentLine=10092555;
 //BA.debugLineNum = 10092555;BA.debugLine="templistpaymenttype.Add(rs.GetInt(\"PaymenttypeI";
__ref._templistpaymenttype /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rs.GetInt("PaymenttypeID")));
 }
;
RDebugUtils.currentLine=10092558;
 //BA.debugLineNum = 10092558;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=10092559;
 //BA.debugLineNum = 10092559;BA.debugLine="cmbpaymenttype.SetHtml(sb.ToString)";
__ref._cmbpaymenttype /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=10092562;
 //BA.debugLineNum = 10092562;BA.debugLine="Log(LastException)";
__c.LogImpl("210092562",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=10092564;
 //BA.debugLineNum = 10092564;BA.debugLine="End Sub";
return "";
}
public String  _load_products(b4j.example.addreturnsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnsalesinfo";
if (Debug.shouldDelegate(ba, "load_products", false))
	 {return ((String) Debug.delegate(ba, "load_products", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Sub Load_Products";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Try";
try {RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="rs = sql1.ExecQuery(\"select * from ProductsInfor";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from ProductsInformation");
RDebugUtils.currentLine=10223623;
 //BA.debugLineNum = 10223623;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=10223624;
 //BA.debugLineNum = 10223624;BA.debugLine="Dim val As String = rs.GetInt(\"ProductID\")";
_val = BA.NumberToString(_rs.GetInt("ProductID"));
RDebugUtils.currentLine=10223625;
 //BA.debugLineNum = 10223625;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("ProductName")).Append("</option>");
 }
;
RDebugUtils.currentLine=10223627;
 //BA.debugLineNum = 10223627;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=10223628;
 //BA.debugLineNum = 10223628;BA.debugLine="cmbproduct.SetHtml(sb.ToString)";
__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=10223631;
 //BA.debugLineNum = 10223631;BA.debugLine="Log(LastException)";
__c.LogImpl("210223631",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=10223633;
 //BA.debugLineNum = 10223633;BA.debugLine="End Sub";
return "";
}
public String  _load_usersinformation(b4j.example.addreturnsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnsalesinfo";
if (Debug.shouldDelegate(ba, "load_usersinformation", false))
	 {return ((String) Debug.delegate(ba, "load_usersinformation", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Sub Load_UsersInformation";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Try";
try {RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=10158085;
 //BA.debugLineNum = 10158085;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=10158086;
 //BA.debugLineNum = 10158086;BA.debugLine="rs = sql1.ExecQuery(\"select * from UsersInformat";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from UsersInformation");
RDebugUtils.currentLine=10158087;
 //BA.debugLineNum = 10158087;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=10158088;
 //BA.debugLineNum = 10158088;BA.debugLine="Dim val As String = rs.GetInt(\"UserID\")";
_val = BA.NumberToString(_rs.GetInt("UserID"));
RDebugUtils.currentLine=10158089;
 //BA.debugLineNum = 10158089;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("UserFullName")).Append("</option>");
 }
;
RDebugUtils.currentLine=10158092;
 //BA.debugLineNum = 10158092;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=10158093;
 //BA.debugLineNum = 10158093;BA.debugLine="cmbuser.SetHtml(sb.ToString)";
__ref._cmbuser /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=10158096;
 //BA.debugLineNum = 10158096;BA.debugLine="Log(LastException)";
__c.LogImpl("210158096",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=10158098;
 //BA.debugLineNum = 10158098;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.addreturnsalesinfo __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnsalesinfo";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="TempProductsTable.Initialize";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="templistcmbcustomer.Initialize";
__ref._templistcmbcustomer /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="templistpaymenttype.Initialize";
__ref._templistpaymenttype /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=9895943;
 //BA.debugLineNum = 9895943;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=9895945;
 //BA.debugLineNum = 9895945;BA.debugLine="Load_Customer";
__ref._load_customer /*String*/ (null);
RDebugUtils.currentLine=9895947;
 //BA.debugLineNum = 9895947;BA.debugLine="Load_Products";
__ref._load_products /*String*/ (null);
RDebugUtils.currentLine=9895949;
 //BA.debugLineNum = 9895949;BA.debugLine="Load_PaymentTypes";
__ref._load_paymenttypes /*String*/ (null);
RDebugUtils.currentLine=9895951;
 //BA.debugLineNum = 9895951;BA.debugLine="Load_UsersInformation";
__ref._load_usersinformation /*String*/ (null);
RDebugUtils.currentLine=9895952;
 //BA.debugLineNum = 9895952;BA.debugLine="Load_Data_ByID";
__ref._load_data_byid /*String*/ (null);
RDebugUtils.currentLine=9895955;
 //BA.debugLineNum = 9895955;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.addreturnsalesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addreturnsalesinfo";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="End Sub";
return "";
}
}