package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class clstempproducts extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.clstempproducts", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.clstempproducts.class).invoke(this, new Object[] {null});
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
public int _productid = 0;
public String _productname = "";
public int _taxid = 0;
public double _unitprice = 0;
public int _qty = 0;
public double _discount = 0;
public double _productcostprice = 0;
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public b4j.example.main _main = null;
public String  _initialize(b4j.example.clstempproducts __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clstempproducts";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="End Sub";
return "";
}
public String  _setvalues(b4j.example.clstempproducts __ref,int _tempproductid,int _temptaxid,float _tempunitprice,int _tempqty,float _tempdiscount) throws Exception{
__ref = this;
RDebugUtils.currentModule="clstempproducts";
if (Debug.shouldDelegate(ba, "setvalues", false))
	 {return ((String) Debug.delegate(ba, "setvalues", new Object[] {_tempproductid,_temptaxid,_tempunitprice,_tempqty,_tempdiscount}));}
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Public Sub SetValues(tempProductID As Int,tempTaxI";
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="ProductID = tempProductID";
__ref._productid /*int*/  = _tempproductid;
RDebugUtils.currentLine=15925251;
 //BA.debugLineNum = 15925251;BA.debugLine="TaxID = tempTaxID";
__ref._taxid /*int*/  = _temptaxid;
RDebugUtils.currentLine=15925252;
 //BA.debugLineNum = 15925252;BA.debugLine="UnitPrice = tempUnitPrice";
__ref._unitprice /*double*/  = _tempunitprice;
RDebugUtils.currentLine=15925253;
 //BA.debugLineNum = 15925253;BA.debugLine="Qty = tempQty";
__ref._qty /*int*/  = _tempqty;
RDebugUtils.currentLine=15925254;
 //BA.debugLineNum = 15925254;BA.debugLine="Discount = tempDiscount";
__ref._discount /*double*/  = _tempdiscount;
RDebugUtils.currentLine=15925255;
 //BA.debugLineNum = 15925255;BA.debugLine="ProductCostPrice = Get_ProductCostPrice(tempProdu";
__ref._productcostprice /*double*/  = __ref._get_productcostprice /*double*/ (null,BA.NumberToString(_tempproductid));
RDebugUtils.currentLine=15925256;
 //BA.debugLineNum = 15925256;BA.debugLine="ProductName = Get_ProductName(tempProductID)";
__ref._productname /*String*/  = __ref._get_productname /*String*/ (null,BA.NumberToString(_tempproductid));
RDebugUtils.currentLine=15925258;
 //BA.debugLineNum = 15925258;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.clstempproducts __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clstempproducts";
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="Dim ProductID As Int";
_productid = 0;
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="Dim ProductName As String";
_productname = "";
RDebugUtils.currentLine=15794179;
 //BA.debugLineNum = 15794179;BA.debugLine="Dim TaxID As Int";
_taxid = 0;
RDebugUtils.currentLine=15794180;
 //BA.debugLineNum = 15794180;BA.debugLine="Dim UnitPrice As Double";
_unitprice = 0;
RDebugUtils.currentLine=15794181;
 //BA.debugLineNum = 15794181;BA.debugLine="Dim Qty As Int";
_qty = 0;
RDebugUtils.currentLine=15794182;
 //BA.debugLineNum = 15794182;BA.debugLine="Dim Discount As Double";
_discount = 0;
RDebugUtils.currentLine=15794183;
 //BA.debugLineNum = 15794183;BA.debugLine="Dim ProductCostPrice As Double";
_productcostprice = 0;
RDebugUtils.currentLine=15794184;
 //BA.debugLineNum = 15794184;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=15794186;
 //BA.debugLineNum = 15794186;BA.debugLine="End Sub";
return "";
}
public double  _get_productcostprice(b4j.example.clstempproducts __ref,String _tempproductid) throws Exception{
__ref = this;
RDebugUtils.currentModule="clstempproducts";
if (Debug.shouldDelegate(ba, "get_productcostprice", false))
	 {return ((Double) Debug.delegate(ba, "get_productcostprice", new Object[] {_tempproductid}));}
double _tempname = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Private Sub Get_ProductCostPrice(tempProductID) As";
RDebugUtils.currentLine=16056321;
 //BA.debugLineNum = 16056321;BA.debugLine="Try";
try {RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=16056324;
 //BA.debugLineNum = 16056324;BA.debugLine="Dim tempName As Double = 0";
_tempname = 0;
RDebugUtils.currentLine=16056325;
 //BA.debugLineNum = 16056325;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=16056326;
 //BA.debugLineNum = 16056326;BA.debugLine="rs = sql1.ExecQuery(\"select CostPrice from Produ";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select CostPrice from ProductsInformation where ProductID="+_tempproductid);
RDebugUtils.currentLine=16056327;
 //BA.debugLineNum = 16056327;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=16056328;
 //BA.debugLineNum = 16056328;BA.debugLine="tempName = rs.GetString(\"CostPrice\")";
_tempname = (double)(Double.parseDouble(_rs.GetString("CostPrice")));
 }
;
RDebugUtils.currentLine=16056330;
 //BA.debugLineNum = 16056330;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=16056332;
 //BA.debugLineNum = 16056332;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=16056333;
 //BA.debugLineNum = 16056333;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=16056336;
 //BA.debugLineNum = 16056336;BA.debugLine="Return tempName";
if (true) return _tempname;
 } 
       catch (Exception e15) {
			ba.setLastException(e15);RDebugUtils.currentLine=16056338;
 //BA.debugLineNum = 16056338;BA.debugLine="Log(LastException)";
__c.LogImpl("216056338",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=16056340;
 //BA.debugLineNum = 16056340;BA.debugLine="End Sub";
return 0;
}
public String  _get_productname(b4j.example.clstempproducts __ref,String _tempproductid) throws Exception{
__ref = this;
RDebugUtils.currentModule="clstempproducts";
if (Debug.shouldDelegate(ba, "get_productname", false))
	 {return ((String) Debug.delegate(ba, "get_productname", new Object[] {_tempproductid}));}
String _tempname = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Private Sub Get_ProductName(tempProductID) As Stri";
RDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="Try";
try {RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=15990788;
 //BA.debugLineNum = 15990788;BA.debugLine="Dim tempName As String= \"\"";
_tempname = "";
RDebugUtils.currentLine=15990789;
 //BA.debugLineNum = 15990789;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=15990790;
 //BA.debugLineNum = 15990790;BA.debugLine="rs = sql1.ExecQuery(\"select ProductName from Pro";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select ProductName from ProductsInformation where ProductID="+_tempproductid);
RDebugUtils.currentLine=15990791;
 //BA.debugLineNum = 15990791;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=15990792;
 //BA.debugLineNum = 15990792;BA.debugLine="tempName = rs.GetString(\"ProductName\")";
_tempname = _rs.GetString("ProductName");
 }
;
RDebugUtils.currentLine=15990794;
 //BA.debugLineNum = 15990794;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=15990796;
 //BA.debugLineNum = 15990796;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=15990797;
 //BA.debugLineNum = 15990797;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=15990800;
 //BA.debugLineNum = 15990800;BA.debugLine="Return tempName";
if (true) return _tempname;
 } 
       catch (Exception e15) {
			ba.setLastException(e15);RDebugUtils.currentLine=15990802;
 //BA.debugLineNum = 15990802;BA.debugLine="Log(LastException)";
__c.LogImpl("215990802",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=15990804;
 //BA.debugLineNum = 15990804;BA.debugLine="End Sub";
return "";
}
}