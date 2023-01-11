package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class addtransferinfo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.addtransferinfo", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.addtransferinfo.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.WebSocket.JQueryElement _cmbfromwarehouse = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _cmbtowarehouse = null;
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
public anywheresoftware.b4a.objects.collections.List _templistpaymenttype = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblusernamemain = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divmenu = null;
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public b4j.example.main _main = null;
public String  _btnaddproduct_click(b4j.example.addtransferinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addtransferinfo";
if (Debug.shouldDelegate(ba, "btnaddproduct_click", false))
	 {return ((String) Debug.delegate(ba, "btnaddproduct_click", new Object[] {_params}));}
b4j.example.clstempproducts _classtempprod = null;
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Sub btnaddproduct_Click (Params As Map)";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="Try";
try {RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="If cmbproduct.GetVal.Value = \"0\" Or txtunitprice";
if ((__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("0")) || (__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtqty /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtdiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=12845062;
 //BA.debugLineNum = 12845062;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=12845063;
 //BA.debugLineNum = 12845063;BA.debugLine="ClassTempProd.Initialize";
_classtempprod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=12845064;
 //BA.debugLineNum = 12845064;BA.debugLine="ClassTempProd.SetValues(cmbproduct.GetVal.Value,";
_classtempprod._setvalues /*String*/ (null,(int)(BA.ObjectToNumber(__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(int)(BA.ObjectToNumber(__ref._txttax /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(float)(BA.ObjectToNumber(__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(int)(BA.ObjectToNumber(__ref._txtqty /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(float)(BA.ObjectToNumber(__ref._txtdiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())));
RDebugUtils.currentLine=12845066;
 //BA.debugLineNum = 12845066;BA.debugLine="TempProductsTable.Add(ClassTempProd)";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_classtempprod));
RDebugUtils.currentLine=12845067;
 //BA.debugLineNum = 12845067;BA.debugLine="Load_AddedProducts_Temp";
__ref._load_addedproducts_temp /*String*/ (null);
RDebugUtils.currentLine=12845069;
 //BA.debugLineNum = 12845069;BA.debugLine="txtunitprice.SetVal(\"0\")";
__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("0"));
RDebugUtils.currentLine=12845070;
 //BA.debugLineNum = 12845070;BA.debugLine="txtqty.SetVal(\"0\")";
__ref._txtqty /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("0"));
RDebugUtils.currentLine=12845071;
 //BA.debugLineNum = 12845071;BA.debugLine="txtdiscount.SetVal(\"0\")";
__ref._txtdiscount /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("0"));
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=12845074;
 //BA.debugLineNum = 12845074;BA.debugLine="Log(LastException)";
__c.LogImpl("212845074",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=12845076;
 //BA.debugLineNum = 12845076;BA.debugLine="End Sub";
return "";
}
public String  _load_addedproducts_temp(b4j.example.addtransferinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addtransferinfo";
if (Debug.shouldDelegate(ba, "load_addedproducts_temp", false))
	 {return ((String) Debug.delegate(ba, "load_addedproducts_temp", null));}
String _str = "";
int _i = 0;
b4j.example.clstempproducts _classtempprod = null;
float _taxperc = 0f;
float _totalamount = 0f;
float _temptotalamount = 0f;
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Sub Load_AddedProducts_Temp";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="Try";
try {RDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Product Name</th>\n"+"									                  <th class=\"wd-20p\">Unit Price</th>\n"+"									                  <th class=\"wd-10p\">Quantity</th>\n"+"									                  <th class=\"wd-15p\">Total</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=12976146;
 //BA.debugLineNum = 12976146;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=12976148;
 //BA.debugLineNum = 12976148;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=12976149;
 //BA.debugLineNum = 12976149;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=12976151;
 //BA.debugLineNum = 12976151;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=12976152;
 //BA.debugLineNum = 12976152;BA.debugLine="str = str & \"<td>\"& ClassTempProd.ProductID &\"<";
_str = _str+"<td>"+BA.NumberToString(_classtempprod._productid /*int*/ )+"</td>";
RDebugUtils.currentLine=12976153;
 //BA.debugLineNum = 12976153;BA.debugLine="str = str & \"<td>\"& ClassTempProd.ProductName &";
_str = _str+"<td>"+_classtempprod._productname /*String*/ +"</td>";
RDebugUtils.currentLine=12976154;
 //BA.debugLineNum = 12976154;BA.debugLine="str = str & \"<td>\"& ClassTempProd.UnitPrice &\"<";
_str = _str+"<td>"+BA.NumberToString(_classtempprod._unitprice /*double*/ )+"</td>";
RDebugUtils.currentLine=12976155;
 //BA.debugLineNum = 12976155;BA.debugLine="str = str & \"<td>\"& ClassTempProd.Qty &\"</td>\"";
_str = _str+"<td>"+BA.NumberToString(_classtempprod._qty /*int*/ )+"</td>";
RDebugUtils.currentLine=12976157;
 //BA.debugLineNum = 12976157;BA.debugLine="Dim taxPerc As Float = 0";
_taxperc = (float) (0);
RDebugUtils.currentLine=12976158;
 //BA.debugLineNum = 12976158;BA.debugLine="taxPerc = ClassTempProd.TaxID";
_taxperc = (float) (_classtempprod._taxid /*int*/ );
RDebugUtils.currentLine=12976160;
 //BA.debugLineNum = 12976160;BA.debugLine="Dim TotalAmount As Float =  ((ClassTempProd.Uni";
_totalamount = (float) (((_classtempprod._unitprice /*double*/ *_classtempprod._qty /*int*/ )-_classtempprod._discount /*double*/ ));
RDebugUtils.currentLine=12976161;
 //BA.debugLineNum = 12976161;BA.debugLine="Dim TempTotalAmount As Float = 0";
_temptotalamount = (float) (0);
RDebugUtils.currentLine=12976162;
 //BA.debugLineNum = 12976162;BA.debugLine="If taxPerc > 0 Then";
if (_taxperc>0) { 
RDebugUtils.currentLine=12976163;
 //BA.debugLineNum = 12976163;BA.debugLine="TempTotalAmount = TotalAmount";
_temptotalamount = _totalamount;
RDebugUtils.currentLine=12976164;
 //BA.debugLineNum = 12976164;BA.debugLine="TempTotalAmount = TempTotalAmount * (taxPerc /";
_temptotalamount = (float) (_temptotalamount*(_taxperc/(double)100));
 };
RDebugUtils.currentLine=12976167;
 //BA.debugLineNum = 12976167;BA.debugLine="str = str & \"<td>\"& NumberFormat((TotalAmount +";
_str = _str+"<td>"+__c.NumberFormat((_totalamount+_temptotalamount),(int) (0),(int) (4))+"</td>";
RDebugUtils.currentLine=12976169;
 //BA.debugLineNum = 12976169;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"deleteproductTbl("+BA.NumberToString(_i)+")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "+" </td> </tr>";
 }
};
RDebugUtils.currentLine=12976175;
 //BA.debugLineNum = 12976175;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
RDebugUtils.currentLine=12976177;
 //BA.debugLineNum = 12976177;BA.debugLine="divproducts.SetHtml(str)";
__ref._divproducts /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
RDebugUtils.currentLine=12976179;
 //BA.debugLineNum = 12976179;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
 } 
       catch (Exception e27) {
			ba.setLastException(e27);RDebugUtils.currentLine=12976182;
 //BA.debugLineNum = 12976182;BA.debugLine="Log(LastException)";
__c.LogImpl("212976182",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=12976184;
 //BA.debugLineNum = 12976184;BA.debugLine="End Sub";
return "";
}
public String  _btncancel_click(b4j.example.addtransferinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addtransferinfo";
if (Debug.shouldDelegate(ba, "btncancel_click", false))
	 {return ((String) Debug.delegate(ba, "btncancel_click", new Object[] {_params}));}
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Sub btncancel_Click (Params As Map)";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="ws.Eval(\"document.location.replace('TransferInfo";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('TransferInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="End Sub";
return "";
}
public String  _btnsave_click(b4j.example.addtransferinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addtransferinfo";
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
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Sub btnsave_Click (Params As Map)";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="Try";
try {RDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="Dim LastSavedID As Int = 0";
_lastsavedid = (int) (0);
RDebugUtils.currentLine=13107206;
 //BA.debugLineNum = 13107206;BA.debugLine="If txtinvdate.GetVal.Value = \"\"  Then";
if ((__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=13107207;
 //BA.debugLineNum = 13107207;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=13107210;
 //BA.debugLineNum = 13107210;BA.debugLine="Dim InvoiceID As Int = 0";
_invoiceid = (int) (0);
RDebugUtils.currentLine=13107211;
 //BA.debugLineNum = 13107211;BA.debugLine="If ws.Session.GetAttribute(\"InvoiceID\") = Null T";
if (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")== null) { 
 }else {
RDebugUtils.currentLine=13107214;
 //BA.debugLineNum = 13107214;BA.debugLine="InvoiceID = ws.Session.GetAttribute(\"InvoiceID\"";
_invoiceid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")));
RDebugUtils.currentLine=13107215;
 //BA.debugLineNum = 13107215;BA.debugLine="LastSavedID = InvoiceID";
_lastsavedid = _invoiceid;
 };
RDebugUtils.currentLine=13107218;
 //BA.debugLineNum = 13107218;BA.debugLine="Dim dblinvtotal,dblinvtotaltax,dblinvtotaldisco";
_dblinvtotal = 0;
_dblinvtotaltax = 0;
_dblinvtotaldiscount = 0;
RDebugUtils.currentLine=13107220;
 //BA.debugLineNum = 13107220;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=13107222;
 //BA.debugLineNum = 13107222;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=13107223;
 //BA.debugLineNum = 13107223;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=13107225;
 //BA.debugLineNum = 13107225;BA.debugLine="dblinvtotal = ClassTempProd.Qty * ClassTempPr";
_dblinvtotal = _classtempprod._qty /*int*/ *_classtempprod._unitprice /*double*/ ;
RDebugUtils.currentLine=13107226;
 //BA.debugLineNum = 13107226;BA.debugLine="dblinvtotaltax = dblinvtotal * (ClassTempProd";
_dblinvtotaltax = _dblinvtotal*(_classtempprod._taxid /*int*/ /(double)100);
RDebugUtils.currentLine=13107227;
 //BA.debugLineNum = 13107227;BA.debugLine="dblinvtotaldiscount = ClassTempProd.Discount";
_dblinvtotaldiscount = _classtempprod._discount /*double*/ ;
 }
};
RDebugUtils.currentLine=13107230;
 //BA.debugLineNum = 13107230;BA.debugLine="dblinvtotal = dblinvtotal + dblinvtotaltax";
_dblinvtotal = _dblinvtotal+_dblinvtotaltax;
RDebugUtils.currentLine=13107231;
 //BA.debugLineNum = 13107231;BA.debugLine="dblinvtotal = dblinvtotal - dblinvtotaldiscoun";
_dblinvtotal = _dblinvtotal-_dblinvtotaldiscount;
RDebugUtils.currentLine=13107233;
 //BA.debugLineNum = 13107233;BA.debugLine="If InvoiceID > 0 Then";
if (_invoiceid>0) { 
RDebugUtils.currentLine=13107238;
 //BA.debugLineNum = 13107238;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=13107239;
 //BA.debugLineNum = 13107239;BA.debugLine="sql1.ExecNonQuery2($\"UPDATE TransferH 				   S";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("UPDATE TransferH\n"+"				   SET InvDT = ?\n"+"				      ,InvTotal = ?\n"+"				      ,FromWarehouseID = ?\n"+"				      ,InvTotalTax = ?\n"+"				      ,InvTotalDiscount = ?\n"+"				      ,InvTotalShipping = ?\n"+"				      ,PaidAmount = ?\n"+"				      ,StrNotes = ?\n"+"				      ,PaymenttypeID = ?\n"+"				      ,ToWarehouseID = ?\n"+"				 WHERE TransferHID=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_dblinvtotal),__ref._cmbfromwarehouse /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_dblinvtotaltax),(Object)(_dblinvtotaldiscount),(Object)(0),(Object)(0),__ref._txtinvnote /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(0),__ref._cmbtowarehouse /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_invoiceid)}));
RDebugUtils.currentLine=13107252;
 //BA.debugLineNum = 13107252;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=13107254;
 //BA.debugLineNum = 13107254;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=13107255;
 //BA.debugLineNum = 13107255;BA.debugLine="sql1.ExecNonQuery2(\"delete from TransferD wher";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("delete from TransferD where TransferHID=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_invoiceid)}));
RDebugUtils.currentLine=13107256;
 //BA.debugLineNum = 13107256;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=13107258;
 //BA.debugLineNum = 13107258;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step29 = 1;
final int limit29 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit29 ;_i = _i + step29 ) {
RDebugUtils.currentLine=13107260;
 //BA.debugLineNum = 13107260;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=13107261;
 //BA.debugLineNum = 13107261;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=13107263;
 //BA.debugLineNum = 13107263;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=13107264;
 //BA.debugLineNum = 13107264;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO TransferD";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO TransferD\n"+"			           (TransferHID\n"+"			           ,ProductID\n"+"			           ,ProductSellPrice\n"+"			           ,ProductCostPrice\n"+"			           ,TaxPerc\n"+"			           ,ProductQty)\n"+"			     VALUES\n"+"			           (?\n"+"			           ,?\n"+"			           ,?\n"+"			           ,?\n"+"			           ,?\n"+"			           ,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_invoiceid),(Object)(_classtempprod._productid /*int*/ ),(Object)(_classtempprod._unitprice /*double*/ ),(Object)(_classtempprod._productcostprice /*double*/ ),(Object)(_classtempprod._taxid /*int*/ ),(Object)(_classtempprod._qty /*int*/ )}));
RDebugUtils.currentLine=13107278;
 //BA.debugLineNum = 13107278;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }
};
 }else {
RDebugUtils.currentLine=13107287;
 //BA.debugLineNum = 13107287;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=13107288;
 //BA.debugLineNum = 13107288;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO TransferH";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO TransferH\n"+"				           (InvDT\n"+"				           ,InvTotal\n"+"				           ,FromWarehouseID\n"+"				           ,InvTotalTax\n"+"				           ,InvTotalDiscount\n"+"				           ,InvTotalShipping\n"+"				           ,PaidAmount\n"+"				           ,StrNotes\n"+"				           ,PaymenttypeID\n"+"				           ,ToWarehouseID)\n"+"				     VALUES\n"+"				           (?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?\n"+"				           ,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_dblinvtotal),__ref._cmbfromwarehouse /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_dblinvtotaltax),(Object)(_dblinvtotaldiscount),(Object)(0),(Object)(0),__ref._txtinvnote /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(0),__ref._cmbtowarehouse /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()}));
RDebugUtils.currentLine=13107312;
 //BA.debugLineNum = 13107312;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=13107314;
 //BA.debugLineNum = 13107314;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=13107315;
 //BA.debugLineNum = 13107315;BA.debugLine="rs = sql1.ExecQuery(\"select TransferHID from";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select TransferHID from TransferH order by TransferHID desc limit 1");
RDebugUtils.currentLine=13107316;
 //BA.debugLineNum = 13107316;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=13107317;
 //BA.debugLineNum = 13107317;BA.debugLine="LastSavedID = rs.GetInt(\"TransferHID\")";
_lastsavedid = _rs.GetInt("TransferHID");
 }
;
RDebugUtils.currentLine=13107319;
 //BA.debugLineNum = 13107319;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=13107321;
 //BA.debugLineNum = 13107321;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step46 = 1;
final int limit46 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit46 ;_i = _i + step46 ) {
RDebugUtils.currentLine=13107322;
 //BA.debugLineNum = 13107322;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=13107323;
 //BA.debugLineNum = 13107323;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=13107325;
 //BA.debugLineNum = 13107325;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=13107326;
 //BA.debugLineNum = 13107326;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO TransferD";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO TransferD\n"+"					           (TransferHID\n"+"					           ,ProductID\n"+"					           ,ProductSellPrice\n"+"					           ,ProductCostPrice\n"+"					           ,TaxPerc\n"+"					           ,ProductQty)\n"+"					     VALUES\n"+"					           (?\n"+"					           ,?\n"+"					           ,?\n"+"					           ,?\n"+"					           ,?\n"+"					           ,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_invoiceid),(Object)(_classtempprod._productid /*int*/ ),(Object)(_classtempprod._unitprice /*double*/ ),(Object)(_classtempprod._productcostprice /*double*/ ),(Object)(_classtempprod._taxid /*int*/ ),(Object)(_classtempprod._qty /*int*/ )}));
RDebugUtils.currentLine=13107340;
 //BA.debugLineNum = 13107340;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }
};
 };
RDebugUtils.currentLine=13107347;
 //BA.debugLineNum = 13107347;BA.debugLine="Main.Insert_UsersLogs(ws,\"Invoice Information\")";
_main._insert_userslogs /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,"Invoice Information");
RDebugUtils.currentLine=13107350;
 //BA.debugLineNum = 13107350;BA.debugLine="ws.Eval(\"document.location.replace('TransferInfo";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('TransferInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e57) {
			ba.setLastException(e57);RDebugUtils.currentLine=13107353;
 //BA.debugLineNum = 13107353;BA.debugLine="Log(LastException)";
__c.LogImpl("213107353",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=13107355;
 //BA.debugLineNum = 13107355;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.addtransferinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addtransferinfo";
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=12451843;
 //BA.debugLineNum = 12451843;BA.debugLine="Private txtinvdate,cmbfromwarehouse,cmbtowarehous";
_txtinvdate = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_cmbfromwarehouse = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_cmbtowarehouse = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
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
RDebugUtils.currentLine=12451845;
 //BA.debugLineNum = 12451845;BA.debugLine="Private TempProductsTable As List";
_tempproductstable = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12451847;
 //BA.debugLineNum = 12451847;BA.debugLine="Private templistpaymenttype As List";
_templistpaymenttype = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12451848;
 //BA.debugLineNum = 12451848;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=12451849;
 //BA.debugLineNum = 12451849;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=12451850;
 //BA.debugLineNum = 12451850;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=12451852;
 //BA.debugLineNum = 12451852;BA.debugLine="End Sub";
return "";
}
public String  _cmbproduct_change(b4j.example.addtransferinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addtransferinfo";
if (Debug.shouldDelegate(ba, "cmbproduct_change", false))
	 {return ((String) Debug.delegate(ba, "cmbproduct_change", new Object[] {_params}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Sub cmbproduct_Change (Params As Map)";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="Try";
try {RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=12910595;
 //BA.debugLineNum = 12910595;BA.debugLine="rs = sql1.ExecQuery(\"select ProductPrice from Pr";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select ProductPrice from ProductsInformation where ProductID="+BA.ObjectToString(__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()));
RDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=12910597;
 //BA.debugLineNum = 12910597;BA.debugLine="txtunitprice.SetVal(rs.GetString(\"ProductPrice\"";
__ref._txtunitprice /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("ProductPrice")));
 }
;
RDebugUtils.currentLine=12910599;
 //BA.debugLineNum = 12910599;BA.debugLine="rs.Close";
_rs.Close();
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=12910602;
 //BA.debugLineNum = 12910602;BA.debugLine="Log(LastException)";
__c.LogImpl("212910602",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=12910604;
 //BA.debugLineNum = 12910604;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table_products(b4j.example.addtransferinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addtransferinfo";
if (Debug.shouldDelegate(ba, "delete_button_table_products", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table_products", new Object[] {_params}));}
int _index = 0;
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Private Sub Delete_button_table_Products(params As";
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="Dim index As Int = params.Get(\"val\")";
_index = (int)(BA.ObjectToNumber(_params.Get((Object)("val"))));
RDebugUtils.currentLine=13041668;
 //BA.debugLineNum = 13041668;BA.debugLine="TempProductsTable.RemoveAt(index)";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=13041669;
 //BA.debugLineNum = 13041669;BA.debugLine="Load_AddedProducts_Temp";
__ref._load_addedproducts_temp /*String*/ (null);
RDebugUtils.currentLine=13041671;
 //BA.debugLineNum = 13041671;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.addtransferinfo __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="addtransferinfo";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.addtransferinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addtransferinfo";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Try";
try {RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"  bLengthChange: false,\n"+"  searching: false,\n"+"  responsive: true\n"+"});\n"+"\n"+"      });");
RDebugUtils.currentLine=13303823;
 //BA.debugLineNum = 13303823;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=13303826;
 //BA.debugLineNum = 13303826;BA.debugLine="Log(LastException)";
__c.LogImpl("213303826",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=13303828;
 //BA.debugLineNum = 13303828;BA.debugLine="End Sub";
return "";
}
public String  _load_data_byid(b4j.example.addtransferinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addtransferinfo";
if (Debug.shouldDelegate(ba, "load_data_byid", false))
	 {return ((String) Debug.delegate(ba, "load_data_byid", null));}
int _invoiceid = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _strid = "";
b4j.example.clstempproducts _classtempprod = null;
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Sub Load_Data_ByID";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Try";
try {RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="Dim InvoiceID As Int = 0";
_invoiceid = (int) (0);
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="If ws.Session.GetAttribute(\"InvoiceID\") = Null T";
if (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")== null) { 
 }else {
RDebugUtils.currentLine=13238279;
 //BA.debugLineNum = 13238279;BA.debugLine="InvoiceID = ws.Session.GetAttribute(\"InvoiceID\"";
_invoiceid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")));
 };
RDebugUtils.currentLine=13238282;
 //BA.debugLineNum = 13238282;BA.debugLine="If InvoiceID > 0 Then";
if (_invoiceid>0) { 
RDebugUtils.currentLine=13238284;
 //BA.debugLineNum = 13238284;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=13238285;
 //BA.debugLineNum = 13238285;BA.debugLine="rs = sql1.ExecQuery(\"select * from TransferH wh";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from TransferH where TransferHID="+BA.NumberToString(_invoiceid));
RDebugUtils.currentLine=13238286;
 //BA.debugLineNum = 13238286;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=13238288;
 //BA.debugLineNum = 13238288;BA.debugLine="txtinvdate.SetVal(rs.GetString(\"InvDT\"))";
__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("InvDT")));
RDebugUtils.currentLine=13238289;
 //BA.debugLineNum = 13238289;BA.debugLine="txtinvnote.SetVal(rs.GetString(\"StrNotes\"))";
__ref._txtinvnote /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("StrNotes")));
RDebugUtils.currentLine=13238291;
 //BA.debugLineNum = 13238291;BA.debugLine="Dim strID As String = cmbfromwarehouse.id";
_strid = __ref._cmbfromwarehouse /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .getId();
RDebugUtils.currentLine=13238292;
 //BA.debugLineNum = 13238292;BA.debugLine="strID = strID.Replace(\"#\",\"\")";
_strid = _strid.replace("#","");
RDebugUtils.currentLine=13238293;
 //BA.debugLineNum = 13238293;BA.debugLine="ws.RunFunction(\"setSelectedRow\", Array As Obje";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .RunFunction("setSelectedRow",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_strid),(Object)(_rs.GetInt("FromWarehouseID"))}));
RDebugUtils.currentLine=13238296;
 //BA.debugLineNum = 13238296;BA.debugLine="Dim strID As String = cmbtowarehouse.id";
_strid = __ref._cmbtowarehouse /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .getId();
RDebugUtils.currentLine=13238297;
 //BA.debugLineNum = 13238297;BA.debugLine="strID = strID.Replace(\"#\",\"\")";
_strid = _strid.replace("#","");
RDebugUtils.currentLine=13238298;
 //BA.debugLineNum = 13238298;BA.debugLine="ws.RunFunction(\"setSelectedRow\", Array As Obje";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .RunFunction("setSelectedRow",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_strid),(Object)(_rs.GetInt("ToWarehouseID"))}));
 }
;
RDebugUtils.currentLine=13238301;
 //BA.debugLineNum = 13238301;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=13238304;
 //BA.debugLineNum = 13238304;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=13238305;
 //BA.debugLineNum = 13238305;BA.debugLine="rs = sql1.ExecQuery(\"select * from TransferD wh";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from TransferD where TransferHID="+BA.NumberToString(_invoiceid));
RDebugUtils.currentLine=13238306;
 //BA.debugLineNum = 13238306;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=13238308;
 //BA.debugLineNum = 13238308;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=13238309;
 //BA.debugLineNum = 13238309;BA.debugLine="ClassTempProd.Initialize";
_classtempprod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=13238310;
 //BA.debugLineNum = 13238310;BA.debugLine="ClassTempProd.SetValues(rs.GetInt(\"ProductID\")";
_classtempprod._setvalues /*String*/ (null,_rs.GetInt("ProductID"),_rs.GetInt("TaxPerc"),(float)(Double.parseDouble(_rs.GetString("ProductSellPrice"))),_rs.GetInt("ProductQty"),(float) (0));
RDebugUtils.currentLine=13238312;
 //BA.debugLineNum = 13238312;BA.debugLine="TempProductsTable.Add(ClassTempProd)";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_classtempprod));
RDebugUtils.currentLine=13238313;
 //BA.debugLineNum = 13238313;BA.debugLine="Load_AddedProducts_Temp";
__ref._load_addedproducts_temp /*String*/ (null);
 }
;
RDebugUtils.currentLine=13238316;
 //BA.debugLineNum = 13238316;BA.debugLine="rs.Close";
_rs.Close();
 };
 } 
       catch (Exception e33) {
			ba.setLastException(e33);RDebugUtils.currentLine=13238322;
 //BA.debugLineNum = 13238322;BA.debugLine="Log(LastException)";
__c.LogImpl("213238322",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=13238324;
 //BA.debugLineNum = 13238324;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls2(b4j.example.addtransferinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addtransferinfo";
if (Debug.shouldDelegate(ba, "load_datatable_controls2", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls2", null));}
String _str = "";
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Sub Load_Datatable_Controls2";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="Try";
try {RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable2').DataTable({\n"+"  bLengthChange: false,\n"+"  searching: false,\n"+"  responsive: true\n"+"});\n"+"      });");
RDebugUtils.currentLine=13369358;
 //BA.debugLineNum = 13369358;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=13369361;
 //BA.debugLineNum = 13369361;BA.debugLine="Log(LastException)";
__c.LogImpl("213369361",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=13369363;
 //BA.debugLineNum = 13369363;BA.debugLine="End Sub";
return "";
}
public String  _load_products(b4j.example.addtransferinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addtransferinfo";
if (Debug.shouldDelegate(ba, "load_products", false))
	 {return ((String) Debug.delegate(ba, "load_products", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Sub Load_Products";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="Try";
try {RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12779524;
 //BA.debugLineNum = 12779524;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12779525;
 //BA.debugLineNum = 12779525;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=12779526;
 //BA.debugLineNum = 12779526;BA.debugLine="rs = sql1.ExecQuery(\"select * from ProductsInfor";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from ProductsInformation");
RDebugUtils.currentLine=12779527;
 //BA.debugLineNum = 12779527;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=12779528;
 //BA.debugLineNum = 12779528;BA.debugLine="Dim val As String = rs.GetInt(\"ProductID\")";
_val = BA.NumberToString(_rs.GetInt("ProductID"));
RDebugUtils.currentLine=12779529;
 //BA.debugLineNum = 12779529;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("ProductName")).Append("</option>");
 }
;
RDebugUtils.currentLine=12779531;
 //BA.debugLineNum = 12779531;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=12779532;
 //BA.debugLineNum = 12779532;BA.debugLine="cmbproduct.SetHtml(sb.ToString)";
__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=12779535;
 //BA.debugLineNum = 12779535;BA.debugLine="Log(LastException)";
__c.LogImpl("212779535",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=12779537;
 //BA.debugLineNum = 12779537;BA.debugLine="End Sub";
return "";
}
public String  _load_warehouses(b4j.example.addtransferinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addtransferinfo";
if (Debug.shouldDelegate(ba, "load_warehouses", false))
	 {return ((String) Debug.delegate(ba, "load_warehouses", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Sub Load_Warehouses";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="Try";
try {RDebugUtils.currentLine=12713987;
 //BA.debugLineNum = 12713987;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12713989;
 //BA.debugLineNum = 12713989;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=12713990;
 //BA.debugLineNum = 12713990;BA.debugLine="rs = sql1.ExecQuery(\"select * from WarehouseInfo";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from WarehouseInfo");
RDebugUtils.currentLine=12713991;
 //BA.debugLineNum = 12713991;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=12713992;
 //BA.debugLineNum = 12713992;BA.debugLine="Dim val As String = rs.GetInt(\"WarehouseID\")";
_val = BA.NumberToString(_rs.GetInt("WarehouseID"));
RDebugUtils.currentLine=12713993;
 //BA.debugLineNum = 12713993;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("WarehouseDesc")).Append("</option>");
 }
;
RDebugUtils.currentLine=12713996;
 //BA.debugLineNum = 12713996;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=12713997;
 //BA.debugLineNum = 12713997;BA.debugLine="cmbfromwarehouse.SetHtml(sb.ToString)";
__ref._cmbfromwarehouse /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
RDebugUtils.currentLine=12713998;
 //BA.debugLineNum = 12713998;BA.debugLine="cmbtowarehouse.SetHtml(sb.ToString)";
__ref._cmbtowarehouse /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=12714001;
 //BA.debugLineNum = 12714001;BA.debugLine="Log(LastException)";
__c.LogImpl("212714001",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=12714003;
 //BA.debugLineNum = 12714003;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.addtransferinfo __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="addtransferinfo";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="TempProductsTable.Initialize";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=12582917;
 //BA.debugLineNum = 12582917;BA.debugLine="templistpaymenttype.Initialize";
__ref._templistpaymenttype /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=12582918;
 //BA.debugLineNum = 12582918;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=12582920;
 //BA.debugLineNum = 12582920;BA.debugLine="Load_Warehouses";
__ref._load_warehouses /*String*/ (null);
RDebugUtils.currentLine=12582922;
 //BA.debugLineNum = 12582922;BA.debugLine="Load_Products";
__ref._load_products /*String*/ (null);
RDebugUtils.currentLine=12582925;
 //BA.debugLineNum = 12582925;BA.debugLine="Load_Data_ByID";
__ref._load_data_byid /*String*/ (null);
RDebugUtils.currentLine=12582928;
 //BA.debugLineNum = 12582928;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.addtransferinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addtransferinfo";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=12648452;
 //BA.debugLineNum = 12648452;BA.debugLine="End Sub";
return "";
}
}