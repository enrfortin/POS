package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class addadjustinfo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.addadjustinfo", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.addadjustinfo.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.WebSocket.JQueryElement _cmbwarehouse = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtinvnote = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _cmbproduct = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtqty = null;
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
public String  _btnaddproduct_click(b4j.example.addadjustinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addadjustinfo";
if (Debug.shouldDelegate(ba, "btnaddproduct_click", false))
	 {return ((String) Debug.delegate(ba, "btnaddproduct_click", new Object[] {_params}));}
b4j.example.clstempproducts _classtempprod = null;
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub btnaddproduct_Click (Params As Map)";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Try";
try {RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="If cmbproduct.GetVal.Value = \"0\" Or txtqty.GetVa";
if ((__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("0")) || (__ref._txtqty /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=4456455;
 //BA.debugLineNum = 4456455;BA.debugLine="ClassTempProd.Initialize";
_classtempprod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="ClassTempProd.SetValues(cmbproduct.GetVal.Value,";
_classtempprod._setvalues /*String*/ (null,(int)(BA.ObjectToNumber(__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(int) (0),(float) (0),(int)(BA.ObjectToNumber(__ref._txtqty /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue())),(float) (0));
RDebugUtils.currentLine=4456458;
 //BA.debugLineNum = 4456458;BA.debugLine="TempProductsTable.Add(ClassTempProd)";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_classtempprod));
RDebugUtils.currentLine=4456459;
 //BA.debugLineNum = 4456459;BA.debugLine="Load_AddedProducts_Temp";
__ref._load_addedproducts_temp /*String*/ (null);
RDebugUtils.currentLine=4456461;
 //BA.debugLineNum = 4456461;BA.debugLine="txtqty.SetVal(\"1\")";
__ref._txtqty /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)("1"));
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=4456464;
 //BA.debugLineNum = 4456464;BA.debugLine="Log(LastException)";
__c.LogImpl("24456464",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=4456466;
 //BA.debugLineNum = 4456466;BA.debugLine="End Sub";
return "";
}
public String  _load_addedproducts_temp(b4j.example.addadjustinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addadjustinfo";
if (Debug.shouldDelegate(ba, "load_addedproducts_temp", false))
	 {return ((String) Debug.delegate(ba, "load_addedproducts_temp", null));}
String _str = "";
int _i = 0;
b4j.example.clstempproducts _classtempprod = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub Load_AddedProducts_Temp";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Try";
try {RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Product Name</th>\n"+"									                  <th class=\"wd-10p\">Quantity</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=4522000;
 //BA.debugLineNum = 4522000;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=4522002;
 //BA.debugLineNum = 4522002;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=4522003;
 //BA.debugLineNum = 4522003;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=4522005;
 //BA.debugLineNum = 4522005;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=4522006;
 //BA.debugLineNum = 4522006;BA.debugLine="str = str & \"<td>\"& ClassTempProd.ProductID &\"<";
_str = _str+"<td>"+BA.NumberToString(_classtempprod._productid /*int*/ )+"</td>";
RDebugUtils.currentLine=4522007;
 //BA.debugLineNum = 4522007;BA.debugLine="str = str & \"<td>\"& ClassTempProd.ProductName &";
_str = _str+"<td>"+_classtempprod._productname /*String*/ +"</td>";
RDebugUtils.currentLine=4522008;
 //BA.debugLineNum = 4522008;BA.debugLine="str = str & \"<td>\"& ClassTempProd.Qty &\"</td>\"";
_str = _str+"<td>"+BA.NumberToString(_classtempprod._qty /*int*/ )+"</td>";
RDebugUtils.currentLine=4522011;
 //BA.debugLineNum = 4522011;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"deleteproductTbl("+BA.NumberToString(_i)+")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "+" </td> </tr>";
 }
};
RDebugUtils.currentLine=4522017;
 //BA.debugLineNum = 4522017;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
RDebugUtils.currentLine=4522019;
 //BA.debugLineNum = 4522019;BA.debugLine="divproducts.SetHtml(str)";
__ref._divproducts /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
RDebugUtils.currentLine=4522021;
 //BA.debugLineNum = 4522021;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=4522024;
 //BA.debugLineNum = 4522024;BA.debugLine="Log(LastException)";
__c.LogImpl("24522024",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=4522026;
 //BA.debugLineNum = 4522026;BA.debugLine="End Sub";
return "";
}
public String  _btncancel_click(b4j.example.addadjustinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addadjustinfo";
if (Debug.shouldDelegate(ba, "btncancel_click", false))
	 {return ((String) Debug.delegate(ba, "btncancel_click", new Object[] {_params}));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub btncancel_Click (Params As Map)";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="ws.Eval(\"document.location.replace('AdjustmentIn";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('AdjustmentInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="End Sub";
return "";
}
public String  _btnsave_click(b4j.example.addadjustinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addadjustinfo";
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
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub btnsave_Click (Params As Map)";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Try";
try {RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="Dim LastSavedID As Int = 0";
_lastsavedid = (int) (0);
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="If txtinvdate.GetVal.Value = \"\"  Then";
if ((__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="Dim InvoiceID As Int = 0";
_invoiceid = (int) (0);
RDebugUtils.currentLine=4653067;
 //BA.debugLineNum = 4653067;BA.debugLine="If ws.Session.GetAttribute(\"InvoiceID\") = Null T";
if (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")== null) { 
 }else {
RDebugUtils.currentLine=4653070;
 //BA.debugLineNum = 4653070;BA.debugLine="InvoiceID = ws.Session.GetAttribute(\"InvoiceID\"";
_invoiceid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")));
RDebugUtils.currentLine=4653071;
 //BA.debugLineNum = 4653071;BA.debugLine="LastSavedID = InvoiceID";
_lastsavedid = _invoiceid;
 };
RDebugUtils.currentLine=4653074;
 //BA.debugLineNum = 4653074;BA.debugLine="Dim dblinvtotal,dblinvtotaltax,dblinvtotaldisco";
_dblinvtotal = 0;
_dblinvtotaltax = 0;
_dblinvtotaldiscount = 0;
RDebugUtils.currentLine=4653076;
 //BA.debugLineNum = 4653076;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=4653078;
 //BA.debugLineNum = 4653078;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=4653079;
 //BA.debugLineNum = 4653079;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=4653081;
 //BA.debugLineNum = 4653081;BA.debugLine="dblinvtotal = ClassTempProd.Qty * ClassTempPr";
_dblinvtotal = _classtempprod._qty /*int*/ *_classtempprod._unitprice /*double*/ ;
RDebugUtils.currentLine=4653082;
 //BA.debugLineNum = 4653082;BA.debugLine="dblinvtotaltax = dblinvtotal * (ClassTempProd";
_dblinvtotaltax = _dblinvtotal*(_classtempprod._taxid /*int*/ /(double)100);
RDebugUtils.currentLine=4653083;
 //BA.debugLineNum = 4653083;BA.debugLine="dblinvtotaldiscount = ClassTempProd.Discount";
_dblinvtotaldiscount = _classtempprod._discount /*double*/ ;
 }
};
RDebugUtils.currentLine=4653086;
 //BA.debugLineNum = 4653086;BA.debugLine="dblinvtotal = dblinvtotal + dblinvtotaltax";
_dblinvtotal = _dblinvtotal+_dblinvtotaltax;
RDebugUtils.currentLine=4653087;
 //BA.debugLineNum = 4653087;BA.debugLine="dblinvtotal = dblinvtotal - dblinvtotaldiscoun";
_dblinvtotal = _dblinvtotal-_dblinvtotaldiscount;
RDebugUtils.currentLine=4653089;
 //BA.debugLineNum = 4653089;BA.debugLine="If InvoiceID > 0 Then";
if (_invoiceid>0) { 
RDebugUtils.currentLine=4653094;
 //BA.debugLineNum = 4653094;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=4653095;
 //BA.debugLineNum = 4653095;BA.debugLine="sql1.ExecNonQuery2($\"UPDATE InWarehouseH";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("UPDATE InWarehouseH\n"+"				   SET WarehouseID = ?\n"+"				      ,InWarehouseDate = ?\n"+"				      ,InWarehouseNotes = ?\n"+"				 WHERE InWarehouseHID=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._cmbwarehouse /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtinvnote /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_invoiceid)}));
RDebugUtils.currentLine=4653100;
 //BA.debugLineNum = 4653100;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=4653102;
 //BA.debugLineNum = 4653102;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=4653103;
 //BA.debugLineNum = 4653103;BA.debugLine="sql1.ExecNonQuery2(\"delete from InWarehouseD w";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("delete from InWarehouseD where InWarehouseHID=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_invoiceid)}));
RDebugUtils.currentLine=4653104;
 //BA.debugLineNum = 4653104;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=4653106;
 //BA.debugLineNum = 4653106;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step29 = 1;
final int limit29 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit29 ;_i = _i + step29 ) {
RDebugUtils.currentLine=4653108;
 //BA.debugLineNum = 4653108;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=4653109;
 //BA.debugLineNum = 4653109;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=4653111;
 //BA.debugLineNum = 4653111;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=4653112;
 //BA.debugLineNum = 4653112;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO InWarehouseD";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO InWarehouseD\n"+"			           (InWarehouseHID\n"+"			           ,ProductID\n"+"			           ,InQty)\n"+"			     VALUES\n"+"			           (?\n"+"			           ,?\n"+"			           ,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_invoiceid),(Object)(_classtempprod._productid /*int*/ ),(Object)(_classtempprod._qty /*int*/ )}));
RDebugUtils.currentLine=4653120;
 //BA.debugLineNum = 4653120;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }
};
 }else {
RDebugUtils.currentLine=4653129;
 //BA.debugLineNum = 4653129;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=4653130;
 //BA.debugLineNum = 4653130;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO InWarehouseH";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO InWarehouseH\n"+"				           (WarehouseID\n"+"				           ,InWarehouseDate\n"+"				           ,InWarehouseNotes)\n"+"				     VALUES\n"+"				           (?\n"+"				           ,?\n"+"				           ,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._cmbwarehouse /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtinvnote /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()}));
RDebugUtils.currentLine=4653138;
 //BA.debugLineNum = 4653138;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=4653140;
 //BA.debugLineNum = 4653140;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=4653141;
 //BA.debugLineNum = 4653141;BA.debugLine="rs = sql1.ExecQuery(\"select InWarehouseHID fr";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select InWarehouseHID from InWarehouseH order by InWarehouseHID desc limit 1");
RDebugUtils.currentLine=4653142;
 //BA.debugLineNum = 4653142;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=4653143;
 //BA.debugLineNum = 4653143;BA.debugLine="LastSavedID = rs.GetInt(\"InWarehouseHID\")";
_lastsavedid = _rs.GetInt("InWarehouseHID");
 }
;
RDebugUtils.currentLine=4653145;
 //BA.debugLineNum = 4653145;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=4653147;
 //BA.debugLineNum = 4653147;BA.debugLine="For i = 0 To TempProductsTable.Size -1";
{
final int step46 = 1;
final int limit46 = (int) (__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit46 ;_i = _i + step46 ) {
RDebugUtils.currentLine=4653148;
 //BA.debugLineNum = 4653148;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=4653149;
 //BA.debugLineNum = 4653149;BA.debugLine="ClassTempProd = TempProductsTable.Get(i)";
_classtempprod = (b4j.example.clstempproducts)(__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=4653151;
 //BA.debugLineNum = 4653151;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=4653152;
 //BA.debugLineNum = 4653152;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO InWarehous";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("INSERT INTO InWarehouseD\n"+"					           (InWarehouseHID\n"+"					           ,ProductID\n"+"					           ,InQty)\n"+"					     VALUES\n"+"					           (?\n"+"					           ,?\n"+"					           ,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_lastsavedid),(Object)(_classtempprod._productid /*int*/ ),(Object)(_classtempprod._qty /*int*/ )}));
RDebugUtils.currentLine=4653160;
 //BA.debugLineNum = 4653160;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }
};
 };
RDebugUtils.currentLine=4653167;
 //BA.debugLineNum = 4653167;BA.debugLine="Main.Insert_UsersLogs(ws,\"Invoice Information\")";
_main._insert_userslogs /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,"Invoice Information");
RDebugUtils.currentLine=4653170;
 //BA.debugLineNum = 4653170;BA.debugLine="ws.Eval(\"document.location.replace('AdjustmentIn";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('AdjustmentInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e57) {
			ba.setLastException(e57);RDebugUtils.currentLine=4653173;
 //BA.debugLineNum = 4653173;BA.debugLine="Log(LastException)";
__c.LogImpl("24653173",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=4653175;
 //BA.debugLineNum = 4653175;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.addadjustinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addadjustinfo";
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="Private txtinvdate,cmbwarehouse,txtinvnote,cmbpro";
_txtinvdate = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_cmbwarehouse = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtinvnote = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_cmbproduct = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtqty = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_btnaddproduct = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_btnsave = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_btncancel = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_divproducts = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="Private TempProductsTable As List";
_tempproductstable = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="Private templistcmbcustomer As List";
_templistcmbcustomer = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="Private templistpaymenttype As List";
_templistpaymenttype = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=4063242;
 //BA.debugLineNum = 4063242;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=4063243;
 //BA.debugLineNum = 4063243;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=4063245;
 //BA.debugLineNum = 4063245;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table_products(b4j.example.addadjustinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addadjustinfo";
if (Debug.shouldDelegate(ba, "delete_button_table_products", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table_products", new Object[] {_params}));}
int _index = 0;
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Private Sub Delete_button_table_Products(params As";
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="Dim index As Int = params.Get(\"val\")";
_index = (int)(BA.ObjectToNumber(_params.Get((Object)("val"))));
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="TempProductsTable.RemoveAt(index)";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="Load_AddedProducts_Temp";
__ref._load_addedproducts_temp /*String*/ (null);
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.addadjustinfo __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="addadjustinfo";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.addadjustinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addadjustinfo";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Try";
try {RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"  bLengthChange: false,\n"+"  searching: false,\n"+"  responsive: true\n"+"});\n"+"\n"+"      });");
RDebugUtils.currentLine=4849679;
 //BA.debugLineNum = 4849679;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=4849682;
 //BA.debugLineNum = 4849682;BA.debugLine="Log(LastException)";
__c.LogImpl("24849682",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=4849684;
 //BA.debugLineNum = 4849684;BA.debugLine="End Sub";
return "";
}
public String  _load_data_byid(b4j.example.addadjustinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addadjustinfo";
if (Debug.shouldDelegate(ba, "load_data_byid", false))
	 {return ((String) Debug.delegate(ba, "load_data_byid", null));}
int _invoiceid = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _strid = "";
b4j.example.clstempproducts _classtempprod = null;
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub Load_Data_ByID";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Try";
try {RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="Dim InvoiceID As Int = 0";
_invoiceid = (int) (0);
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="If ws.Session.GetAttribute(\"InvoiceID\") = Null T";
if (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")== null) { 
 }else {
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="InvoiceID = ws.Session.GetAttribute(\"InvoiceID\"";
_invoiceid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("InvoiceID")));
 };
RDebugUtils.currentLine=4784138;
 //BA.debugLineNum = 4784138;BA.debugLine="If InvoiceID > 0 Then";
if (_invoiceid>0) { 
RDebugUtils.currentLine=4784140;
 //BA.debugLineNum = 4784140;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="rs = sql1.ExecQuery(\"select * from InWarehouseH";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from InWarehouseH where InWarehouseHID="+BA.NumberToString(_invoiceid));
RDebugUtils.currentLine=4784142;
 //BA.debugLineNum = 4784142;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=4784144;
 //BA.debugLineNum = 4784144;BA.debugLine="txtinvdate.SetVal(rs.GetString(\"InWarehouseDat";
__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("InWarehouseDate")));
RDebugUtils.currentLine=4784145;
 //BA.debugLineNum = 4784145;BA.debugLine="txtinvnote.SetVal(rs.GetString(\"InWarehouseNot";
__ref._txtinvnote /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("InWarehouseNotes")));
RDebugUtils.currentLine=4784147;
 //BA.debugLineNum = 4784147;BA.debugLine="Dim strID As String = cmbwarehouse.id";
_strid = __ref._cmbwarehouse /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .getId();
RDebugUtils.currentLine=4784148;
 //BA.debugLineNum = 4784148;BA.debugLine="strID = strID.Replace(\"#\",\"\")";
_strid = _strid.replace("#","");
RDebugUtils.currentLine=4784149;
 //BA.debugLineNum = 4784149;BA.debugLine="ws.RunFunction(\"setSelectedRow\", Array As Obje";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .RunFunction("setSelectedRow",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_strid),(Object)(_rs.GetInt("WarehouseID"))}));
 }
;
RDebugUtils.currentLine=4784152;
 //BA.debugLineNum = 4784152;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=4784155;
 //BA.debugLineNum = 4784155;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=4784156;
 //BA.debugLineNum = 4784156;BA.debugLine="rs = sql1.ExecQuery(\"select * from InWarehouseD";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from InWarehouseD where InWarehouseHID="+BA.NumberToString(_invoiceid));
RDebugUtils.currentLine=4784157;
 //BA.debugLineNum = 4784157;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=4784159;
 //BA.debugLineNum = 4784159;BA.debugLine="Dim ClassTempProd As ClsTempProducts";
_classtempprod = new b4j.example.clstempproducts();
RDebugUtils.currentLine=4784160;
 //BA.debugLineNum = 4784160;BA.debugLine="ClassTempProd.Initialize";
_classtempprod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=4784161;
 //BA.debugLineNum = 4784161;BA.debugLine="ClassTempProd.SetValues(rs.GetInt(\"ProductID\")";
_classtempprod._setvalues /*String*/ (null,_rs.GetInt("ProductID"),(int) (0),(float) (0),_rs.GetInt("InQty"),(float) (0));
RDebugUtils.currentLine=4784163;
 //BA.debugLineNum = 4784163;BA.debugLine="TempProductsTable.Add(ClassTempProd)";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_classtempprod));
RDebugUtils.currentLine=4784164;
 //BA.debugLineNum = 4784164;BA.debugLine="Load_AddedProducts_Temp";
__ref._load_addedproducts_temp /*String*/ (null);
 }
;
RDebugUtils.currentLine=4784167;
 //BA.debugLineNum = 4784167;BA.debugLine="rs.Close";
_rs.Close();
 };
 } 
       catch (Exception e30) {
			ba.setLastException(e30);RDebugUtils.currentLine=4784173;
 //BA.debugLineNum = 4784173;BA.debugLine="Log(LastException)";
__c.LogImpl("24784173",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=4784175;
 //BA.debugLineNum = 4784175;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls2(b4j.example.addadjustinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addadjustinfo";
if (Debug.shouldDelegate(ba, "load_datatable_controls2", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls2", null));}
String _str = "";
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub Load_Datatable_Controls2";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Try";
try {RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable2').DataTable({\n"+"  bLengthChange: false,\n"+"  searching: false,\n"+"  responsive: true\n"+"});\n"+"      });");
RDebugUtils.currentLine=4915214;
 //BA.debugLineNum = 4915214;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=4915217;
 //BA.debugLineNum = 4915217;BA.debugLine="Log(LastException)";
__c.LogImpl("24915217",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=4915219;
 //BA.debugLineNum = 4915219;BA.debugLine="End Sub";
return "";
}
public String  _load_products(b4j.example.addadjustinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addadjustinfo";
if (Debug.shouldDelegate(ba, "load_products", false))
	 {return ((String) Debug.delegate(ba, "load_products", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub Load_Products";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Try";
try {RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="rs = sql1.ExecQuery(\"select * from ProductsInfor";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from ProductsInformation");
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="Dim val As String = rs.GetInt(\"ProductID\")";
_val = BA.NumberToString(_rs.GetInt("ProductID"));
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("ProductName")).Append("</option>");
 }
;
RDebugUtils.currentLine=4390923;
 //BA.debugLineNum = 4390923;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=4390924;
 //BA.debugLineNum = 4390924;BA.debugLine="cmbproduct.SetHtml(sb.ToString)";
__ref._cmbproduct /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=4390927;
 //BA.debugLineNum = 4390927;BA.debugLine="Log(LastException)";
__c.LogImpl("24390927",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=4390929;
 //BA.debugLineNum = 4390929;BA.debugLine="End Sub";
return "";
}
public String  _load_warehouseinformation(b4j.example.addadjustinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addadjustinfo";
if (Debug.shouldDelegate(ba, "load_warehouseinformation", false))
	 {return ((String) Debug.delegate(ba, "load_warehouseinformation", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _val = "";
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub Load_WarehouseInformation";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Try";
try {RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="rs = sql1.ExecQuery(\"select * from WarehouseInfo";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from WarehouseInfo");
RDebugUtils.currentLine=4325383;
 //BA.debugLineNum = 4325383;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="Dim val As String = rs.GetInt(\"WarehouseID\")";
_val = BA.NumberToString(_rs.GetInt("WarehouseID"));
RDebugUtils.currentLine=4325385;
 //BA.debugLineNum = 4325385;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
_sb.Append("<option value='").Append(_val).Append("'>").Append(_rs.GetString("WarehouseDesc")).Append("</option>");
 }
;
RDebugUtils.currentLine=4325388;
 //BA.debugLineNum = 4325388;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=4325389;
 //BA.debugLineNum = 4325389;BA.debugLine="cmbwarehouse.SetHtml(sb.ToString)";
__ref._cmbwarehouse /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_sb.ToString());
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=4325392;
 //BA.debugLineNum = 4325392;BA.debugLine="Log(LastException)";
__c.LogImpl("24325392",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=4325394;
 //BA.debugLineNum = 4325394;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.addadjustinfo __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="addadjustinfo";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="TempProductsTable.Initialize";
__ref._tempproductstable /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="templistcmbcustomer.Initialize";
__ref._templistcmbcustomer /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="templistpaymenttype.Initialize";
__ref._templistpaymenttype /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="Load_Products";
__ref._load_products /*String*/ (null);
RDebugUtils.currentLine=4194315;
 //BA.debugLineNum = 4194315;BA.debugLine="Load_WarehouseInformation";
__ref._load_warehouseinformation /*String*/ (null);
RDebugUtils.currentLine=4194316;
 //BA.debugLineNum = 4194316;BA.debugLine="Load_Data_ByID";
__ref._load_data_byid /*String*/ (null);
RDebugUtils.currentLine=4194318;
 //BA.debugLineNum = 4194318;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.addadjustinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addadjustinfo";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="End Sub";
return "";
}
}