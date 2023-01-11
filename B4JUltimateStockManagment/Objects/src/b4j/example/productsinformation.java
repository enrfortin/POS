package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class productsinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.productsinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.productsinformation.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divlist = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblusernamemain = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divmenu = null;
public int _intismobiledev = 0;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divismobiledev = null;
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public b4j.example.main _main = null;
public String  _checkismobilebrowser(b4j.example.productsinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="productsinformation";
if (Debug.shouldDelegate(ba, "checkismobilebrowser", false))
	 {return ((String) Debug.delegate(ba, "checkismobilebrowser", null));}
String _str = "";
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub CheckIsMobileBrowser";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Try";
try {RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="str = $\"	 if(/Android|webOS|iPhone|iPad|iPod|Bla";
_str = ("	\n"+"if(/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)){\n"+"	 \n"+"	document.getElementById(\"divismobiledev\").innerHTML = \"1\";\n"+"	\n"+"}else{\n"+"	 document.getElementById(\"divismobiledev\").innerHTML = \"0\";\n"+"}\n"+"		");
RDebugUtils.currentLine=2424845;
 //BA.debugLineNum = 2424845;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=2424847;
 //BA.debugLineNum = 2424847;BA.debugLine="IntIsMobileDev = divismobiledev.GetHtml.Value";
__ref._intismobiledev /*int*/  = (int)(BA.ObjectToNumber(__ref._divismobiledev /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetHtml().getValue()));
RDebugUtils.currentLine=2424848;
 //BA.debugLineNum = 2424848;BA.debugLine="Log(IntIsMobileDev)";
__c.LogImpl("22424848",BA.NumberToString(__ref._intismobiledev /*int*/ ),0);
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=2424850;
 //BA.debugLineNum = 2424850;BA.debugLine="Log(LastException)";
__c.LogImpl("22424850",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=2424852;
 //BA.debugLineNum = 2424852;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.productsinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="productsinformation";
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Private divlist As JQueryElement";
_divlist = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="Private IntIsMobileDev As Int";
_intismobiledev = 0;
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="Private divismobiledev As JQueryElement";
_divismobiledev = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table(b4j.example.productsinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="productsinformation";
if (Debug.shouldDelegate(ba, "delete_button_table", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Private Sub Delete_button_table(params As Map)";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("22293761",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="sql1.ExecNonQuery(\"delete from ProductsInformatio";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from ProductsInformation where ProductID="+BA.ObjectToString(_params.Get((Object)("val"))));
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.reload(true)",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="End Sub";
return "";
}
public String  _edit_button_table(b4j.example.productsinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="productsinformation";
if (Debug.shouldDelegate(ba, "edit_button_table", false))
	 {return ((String) Debug.delegate(ba, "edit_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub Edit_button_table(params As Map)";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("22228225",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="ws.Session.SetAttribute(\"ProductID\",params.Get(\"v";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("ProductID",_params.Get((Object)("val")));
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="ws.Eval(\"document.location.replace('AddProductsIn";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('AddProductsInfo.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.productsinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="productsinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
public int  _load_avlqty(b4j.example.productsinformation __ref,int _productid) throws Exception{
__ref = this;
RDebugUtils.currentModule="productsinformation";
if (Debug.shouldDelegate(ba, "load_avlqty", false))
	 {return ((Integer) Debug.delegate(ba, "load_avlqty", new Object[] {_productid}));}
int _avlqty = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub Load_AvlQty(ProductID As Int) As Int";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Try";
try {RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Dim avlqty As Int = 0";
_avlqty = (int) (0);
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="rs = sql1.ExecQuery2($\"select ifnull(sum(Product";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2(("select ifnull(sum(ProductQty),0) as totalqty from PurchaseInvoiceD where ProductID=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_productid)}));
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="avlqty = avlqty + rs.GetInt(\"totalqty\")";
_avlqty = (int) (_avlqty+_rs.GetInt("totalqty"));
 }
;
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="rs = sql1.ExecQuery2($\"select ifnull(sum(Product";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2(("select ifnull(sum(ProductQty),0) as totalqty from SalesInvoiceD where ProductID=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_productid)}));
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="avlqty = avlqty - rs.GetInt(\"totalqty\")";
_avlqty = (int) (_avlqty-_rs.GetInt("totalqty"));
 }
;
RDebugUtils.currentLine=2162704;
 //BA.debugLineNum = 2162704;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=2162706;
 //BA.debugLineNum = 2162706;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=2162707;
 //BA.debugLineNum = 2162707;BA.debugLine="rs = sql1.ExecQuery2($\"select ifnull(sum(Product";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2(("select ifnull(sum(ProductQty),0) as totalqty from ReturnSalesInvoiceD where ProductID=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_productid)}));
RDebugUtils.currentLine=2162708;
 //BA.debugLineNum = 2162708;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=2162709;
 //BA.debugLineNum = 2162709;BA.debugLine="avlqty = avlqty + rs.GetInt(\"totalqty\")";
_avlqty = (int) (_avlqty+_rs.GetInt("totalqty"));
 }
;
RDebugUtils.currentLine=2162711;
 //BA.debugLineNum = 2162711;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=2162713;
 //BA.debugLineNum = 2162713;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=2162714;
 //BA.debugLineNum = 2162714;BA.debugLine="rs = sql1.ExecQuery2($\"select ifnull(sum(Product";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2(("select ifnull(sum(ProductQty),0) as totalqty from ReturnPurchaseInvoiceD where ProductID=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_productid)}));
RDebugUtils.currentLine=2162715;
 //BA.debugLineNum = 2162715;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=2162716;
 //BA.debugLineNum = 2162716;BA.debugLine="avlqty = avlqty - rs.GetInt(\"totalqty\")";
_avlqty = (int) (_avlqty-_rs.GetInt("totalqty"));
 }
;
RDebugUtils.currentLine=2162718;
 //BA.debugLineNum = 2162718;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=2162721;
 //BA.debugLineNum = 2162721;BA.debugLine="Return avlqty";
if (true) return _avlqty;
 } 
       catch (Exception e29) {
			ba.setLastException(e29);RDebugUtils.currentLine=2162723;
 //BA.debugLineNum = 2162723;BA.debugLine="Log(LastException)";
__c.LogImpl("22162723",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=2162725;
 //BA.debugLineNum = 2162725;BA.debugLine="End Sub";
return 0;
}
public String  _load_data(b4j.example.productsinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="productsinformation";
if (Debug.shouldDelegate(ba, "load_data", false))
	 {return ((String) Debug.delegate(ba, "load_data", null));}
String _str = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cursor = null;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub Load_Data";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Try";
try {RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="If IntIsMobileDev = 0 Then";
if (__ref._intismobiledev /*int*/ ==0) { 
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Producto</th>\n"+"									                  <th class=\"wd-20p\">Precio de Costo</th>\n"+"									                  <th class=\"wd-15p\">Pricio de Venta</th>\n"+"									                  <th class=\"wd-25p\">Categoria</th>\n"+"									                  <th class=\"wd-25p\">Cantidad</th>\n"+"													  <th class=\"wd-25p\">Accion</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=2097174;
 //BA.debugLineNum = 2097174;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=2097175;
 //BA.debugLineNum = 2097175;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        Products";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT        ProductsInformation.ProductID, ProductsInformation.ProductName, ProductsInformation.ProductPrice, ProductsInformation.ProductImage, ProductsInformation.CatID, ProductsInformation.CostPrice, \n"+"                         ProductsInformation.ProductBarcode, ProductsInformation.ProductTax, CatInfo.CatDesc\n"+"FROM            ProductsInformation LEFT OUTER JOIN\n"+"                         CatInfo ON ProductsInformation.CatID = CatInfo.CatID"));
RDebugUtils.currentLine=2097180;
 //BA.debugLineNum = 2097180;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=2097182;
 //BA.debugLineNum = 2097182;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=2097183;
 //BA.debugLineNum = 2097183;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ProductID";
_str = _str+"<td>"+_cursor.GetString("ProductID")+"</td>";
RDebugUtils.currentLine=2097184;
 //BA.debugLineNum = 2097184;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ProductNa";
_str = _str+"<td>"+_cursor.GetString("ProductName")+"</td>";
RDebugUtils.currentLine=2097185;
 //BA.debugLineNum = 2097185;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"CostPrice";
_str = _str+"<td>"+_cursor.GetString("CostPrice")+"</td>";
RDebugUtils.currentLine=2097186;
 //BA.debugLineNum = 2097186;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ProductPr";
_str = _str+"<td>"+_cursor.GetString("ProductPrice")+"</td>";
RDebugUtils.currentLine=2097187;
 //BA.debugLineNum = 2097187;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"CatDesc\")";
_str = _str+"<td>"+_cursor.GetString("CatDesc")+"</td>";
RDebugUtils.currentLine=2097188;
 //BA.debugLineNum = 2097188;BA.debugLine="str = str & \"<td>\"& Load_AvlQty(Cursor.GetStrin";
_str = _str+"<td>"+BA.NumberToString(__ref._load_avlqty /*int*/ (null,(int)(Double.parseDouble(_cursor.GetString("ProductID")))))+"</td>";
RDebugUtils.currentLine=2097190;
 //BA.debugLineNum = 2097190;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("ProductID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "+" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("ProductID"))+")\"></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=2097196;
 //BA.debugLineNum = 2097196;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=2097198;
 //BA.debugLineNum = 2097198;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
 }else {
RDebugUtils.currentLine=2097202;
 //BA.debugLineNum = 2097202;BA.debugLine="str = $\" <table id='datatable1' class='table";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Producto</th>\n"+"													  <th class=\"wd-25p\">Accion</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=2097213;
 //BA.debugLineNum = 2097213;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=2097214;
 //BA.debugLineNum = 2097214;BA.debugLine="Cursor = sql1.ExecQuery(\"SELECT        ProductsI";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT        ProductsInformation.ProductID, ProductsInformation.ProductName, ProductsInformation.CostPrice, ProductsInformation.UnitPrice, ProductsInformation.TypeID, ProductsInformation.MeasureID,  "+"       ProductTypes.TypeDesc, UnitofMeasureInformation.UoMDesc "+" FROM            ProductsInformation LEFT OUTER JOIN "+" UnitofMeasureInformation ON ProductsInformation.MeasureID = UnitofMeasureInformation.UnitOfMeasureID LEFT OUTER JOIN "+" ProductTypes ON ProductsInformation.TypeID = ProductTypes.ProductTypeID");
RDebugUtils.currentLine=2097220;
 //BA.debugLineNum = 2097220;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=2097222;
 //BA.debugLineNum = 2097222;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=2097223;
 //BA.debugLineNum = 2097223;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ProductID";
_str = _str+"<td>"+_cursor.GetString("ProductID")+"</td>";
RDebugUtils.currentLine=2097224;
 //BA.debugLineNum = 2097224;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ProductNa";
_str = _str+"<td>"+_cursor.GetString("ProductName")+"</td>";
RDebugUtils.currentLine=2097226;
 //BA.debugLineNum = 2097226;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important;display:block !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("ProductID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "+" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("ProductID"))+")\"></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=2097232;
 //BA.debugLineNum = 2097232;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=2097234;
 //BA.debugLineNum = 2097234;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
 };
RDebugUtils.currentLine=2097239;
 //BA.debugLineNum = 2097239;BA.debugLine="divlist.SetHtml(str)";
__ref._divlist /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
 } 
       catch (Exception e34) {
			ba.setLastException(e34);RDebugUtils.currentLine=2097243;
 //BA.debugLineNum = 2097243;BA.debugLine="Log(LastException)";
__c.LogImpl("22097243",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=2097245;
 //BA.debugLineNum = 2097245;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.productsinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="productsinformation";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Try";
try {RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"          responsive: true,\n"+"          language: {\n"+"            searchPlaceholder: 'Search...',\n"+"            sSearch: '',\n"+"            lengthMenu: '_MENU_ items/page',\n"+"          }\n"+"        });\n"+"\n"+"      \n"+"        // Select2\n"+"        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"+"\n"+"      });");
RDebugUtils.currentLine=2359318;
 //BA.debugLineNum = 2359318;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=2359321;
 //BA.debugLineNum = 2359321;BA.debugLine="Log(LastException)";
__c.LogImpl("22359321",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=2359323;
 //BA.debugLineNum = 2359323;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.productsinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="productsinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="ws.Session.SetAttribute(\"ProductID\",0)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("ProductID",(Object)(0));
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="CheckIsMobileBrowser";
__ref._checkismobilebrowser /*String*/ (null);
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="Load_Data";
__ref._load_data /*String*/ (null);
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.productsinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="productsinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="End Sub";
return "";
}
}