package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class productsinformation_subs_0 {


public static RemoteObject  _checkismobilebrowser(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckIsMobileBrowser (productsinformation) ","productsinformation",2,__ref.getField(false, "ba"),__ref,221);
if (RapidSub.canDelegate("checkismobilebrowser")) { return __ref.runUserSub(false, "productsinformation","checkismobilebrowser", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 221;BA.debugLine="Sub CheckIsMobileBrowser";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 222;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 223;BA.debugLine="Dim str As String";
Debug.ShouldStop(1073741824);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 224;BA.debugLine="str = $\"	 if(/Android|webOS|iPhone|iPad|iPod|Bla";
Debug.ShouldStop(-2147483648);
_str = (RemoteObject.concat(RemoteObject.createImmutable("	\n"),RemoteObject.createImmutable("if(/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)){\n"),RemoteObject.createImmutable("	 \n"),RemoteObject.createImmutable("	document.getElementById(\"divismobiledev\").innerHTML = \"1\";\n"),RemoteObject.createImmutable("	\n"),RemoteObject.createImmutable("}else{\n"),RemoteObject.createImmutable("	 document.getElementById(\"divismobiledev\").innerHTML = \"0\";\n"),RemoteObject.createImmutable("}\n"),RemoteObject.createImmutable("		")));Debug.locals.put("str", _str);
 BA.debugLineNum = 234;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(512);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), productsinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 236;BA.debugLine="IntIsMobileDev = divismobiledev.GetHtml.Value";
Debug.ShouldStop(2048);
__ref.setField ("_intismobiledev" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_divismobiledev" /*RemoteObject*/ ).runMethod(false,"GetHtml").runMethod(false,"getValue")));
 BA.debugLineNum = 237;BA.debugLine="Log(IntIsMobileDev)";
Debug.ShouldStop(4096);
productsinformation.__c.runVoidMethod ("LogImpl","22424848",BA.NumberToString(__ref.getField(true,"_intismobiledev" /*RemoteObject*/ )),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 239;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
productsinformation.__c.runVoidMethod ("LogImpl","22424850",BA.ObjectToString(productsinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
productsinformation._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",productsinformation._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private divlist As JQueryElement";
productsinformation._divlist = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divlist",productsinformation._divlist);
 //BA.debugLineNum = 5;BA.debugLine="Private lblusernamemain As JQueryElement";
productsinformation._lblusernamemain = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblusernamemain",productsinformation._lblusernamemain);
 //BA.debugLineNum = 6;BA.debugLine="Private divMenu As JQueryElement";
productsinformation._divmenu = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divmenu",productsinformation._divmenu);
 //BA.debugLineNum = 9;BA.debugLine="Private IntIsMobileDev As Int";
productsinformation._intismobiledev = RemoteObject.createImmutable(0);__ref.setField("_intismobiledev",productsinformation._intismobiledev);
 //BA.debugLineNum = 10;BA.debugLine="Private divismobiledev As JQueryElement";
productsinformation._divismobiledev = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divismobiledev",productsinformation._divismobiledev);
 //BA.debugLineNum = 11;BA.debugLine="Private sql1 As SQL";
productsinformation._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",productsinformation._sql1);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _delete_button_table(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Delete_button_table (productsinformation) ","productsinformation",2,__ref.getField(false, "ba"),__ref,179);
if (RapidSub.canDelegate("delete_button_table")) { return __ref.runUserSub(false, "productsinformation","delete_button_table", __ref, _params);}
Debug.locals.put("params", _params);
 BA.debugLineNum = 179;BA.debugLine="Private Sub Delete_button_table(params As Map)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 180;BA.debugLine="Log(params.Get(\"val\"))";
Debug.ShouldStop(524288);
productsinformation.__c.runVoidMethod ("LogImpl","22293761",BA.ObjectToString(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))),0);
 BA.debugLineNum = 182;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 184;BA.debugLine="sql1.ExecNonQuery(\"delete from ProductsInformatio";
Debug.ShouldStop(8388608);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("delete from ProductsInformation where ProductID="),_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val")))))));
 BA.debugLineNum = 185;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 187;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.reload(true)")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), productsinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edit_button_table(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Edit_button_table (productsinformation) ","productsinformation",2,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("edit_button_table")) { return __ref.runUserSub(false, "productsinformation","edit_button_table", __ref, _params);}
Debug.locals.put("params", _params);
 BA.debugLineNum = 170;BA.debugLine="Private Sub Edit_button_table(params As Map)";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="Log(params.Get(\"val\"))";
Debug.ShouldStop(1024);
productsinformation.__c.runVoidMethod ("LogImpl","22228225",BA.ObjectToString(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))),0);
 BA.debugLineNum = 173;BA.debugLine="ws.Session.SetAttribute(\"ProductID\",params.Get(\"v";
Debug.ShouldStop(4096);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("ProductID")),(Object)(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val"))))));
 BA.debugLineNum = 175;BA.debugLine="ws.Eval(\"document.location.replace('AddProductsIn";
Debug.ShouldStop(16384);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('AddProductsInfo.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), productsinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (productsinformation) ","productsinformation",2,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "productsinformation","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16384);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_avlqty(RemoteObject __ref,RemoteObject _productid) throws Exception{
try {
		Debug.PushSubsStack("Load_AvlQty (productsinformation) ","productsinformation",2,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("load_avlqty")) { return __ref.runUserSub(false, "productsinformation","load_avlqty", __ref, _productid);}
RemoteObject _avlqty = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
Debug.locals.put("ProductID", _productid);
 BA.debugLineNum = 131;BA.debugLine="Sub Load_AvlQty(ProductID As Int) As Int";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 133;BA.debugLine="Dim avlqty As Int = 0";
Debug.ShouldStop(16);
_avlqty = BA.numberCast(int.class, 0);Debug.locals.put("avlqty", _avlqty);Debug.locals.put("avlqty", _avlqty);
 BA.debugLineNum = 135;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(64);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 136;BA.debugLine="rs = sql1.ExecQuery2($\"select ifnull(sum(Product";
Debug.ShouldStop(128);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)((RemoteObject.createImmutable("select ifnull(sum(ProductQty),0) as totalqty from PurchaseInvoiceD where ProductID=?"))),(Object)(productsinformation.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_productid)})))));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 137;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(256);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 138;BA.debugLine="avlqty = avlqty + rs.GetInt(\"totalqty\")";
Debug.ShouldStop(512);
_avlqty = RemoteObject.solve(new RemoteObject[] {_avlqty,_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("totalqty")))}, "+",1, 1);Debug.locals.put("avlqty", _avlqty);
 }
;
 BA.debugLineNum = 140;BA.debugLine="rs.Close";
Debug.ShouldStop(2048);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 142;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(8192);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 143;BA.debugLine="rs = sql1.ExecQuery2($\"select ifnull(sum(Product";
Debug.ShouldStop(16384);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)((RemoteObject.createImmutable("select ifnull(sum(ProductQty),0) as totalqty from SalesInvoiceD where ProductID=?"))),(Object)(productsinformation.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_productid)})))));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 144;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(32768);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 145;BA.debugLine="avlqty = avlqty - rs.GetInt(\"totalqty\")";
Debug.ShouldStop(65536);
_avlqty = RemoteObject.solve(new RemoteObject[] {_avlqty,_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("totalqty")))}, "-",1, 1);Debug.locals.put("avlqty", _avlqty);
 }
;
 BA.debugLineNum = 147;BA.debugLine="rs.Close";
Debug.ShouldStop(262144);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 149;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(1048576);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 150;BA.debugLine="rs = sql1.ExecQuery2($\"select ifnull(sum(Product";
Debug.ShouldStop(2097152);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)((RemoteObject.createImmutable("select ifnull(sum(ProductQty),0) as totalqty from ReturnSalesInvoiceD where ProductID=?"))),(Object)(productsinformation.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_productid)})))));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 151;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(4194304);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 152;BA.debugLine="avlqty = avlqty + rs.GetInt(\"totalqty\")";
Debug.ShouldStop(8388608);
_avlqty = RemoteObject.solve(new RemoteObject[] {_avlqty,_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("totalqty")))}, "+",1, 1);Debug.locals.put("avlqty", _avlqty);
 }
;
 BA.debugLineNum = 154;BA.debugLine="rs.Close";
Debug.ShouldStop(33554432);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 156;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(134217728);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 157;BA.debugLine="rs = sql1.ExecQuery2($\"select ifnull(sum(Product";
Debug.ShouldStop(268435456);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)((RemoteObject.createImmutable("select ifnull(sum(ProductQty),0) as totalqty from ReturnPurchaseInvoiceD where ProductID=?"))),(Object)(productsinformation.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_productid)})))));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 158;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(536870912);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 159;BA.debugLine="avlqty = avlqty - rs.GetInt(\"totalqty\")";
Debug.ShouldStop(1073741824);
_avlqty = RemoteObject.solve(new RemoteObject[] {_avlqty,_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("totalqty")))}, "-",1, 1);Debug.locals.put("avlqty", _avlqty);
 }
;
 BA.debugLineNum = 161;BA.debugLine="rs.Close";
Debug.ShouldStop(1);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 164;BA.debugLine="Return avlqty";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return _avlqty;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e29) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e29.toString()); BA.debugLineNum = 166;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
productsinformation.__c.runVoidMethod ("LogImpl","22162723",BA.ObjectToString(productsinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_data(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_Data (productsinformation) ","productsinformation",2,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("load_data")) { return __ref.runUserSub(false, "productsinformation","load_data", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
 BA.debugLineNum = 36;BA.debugLine="Sub Load_Data";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 39;BA.debugLine="Dim str As String";
Debug.ShouldStop(64);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 40;BA.debugLine="If IntIsMobileDev = 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_intismobiledev" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 43;BA.debugLine="str = $\" <table id='datatable1' class='table di";
Debug.ShouldStop(1024);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" <table id='datatable1' class='table display responsive nowrap'>\n"),RemoteObject.createImmutable("		                                    <thead class=\"thead-dark\">\n"),RemoteObject.createImmutable("		                                        <tr>\n"),RemoteObject.createImmutable("		                                              <th class=\"wd-15p\">ID</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">Producto</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-20p\">Precio de Costo</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">Pricio de Venta</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-25p\">Categoria</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-25p\">Cantidad</th>\n"),RemoteObject.createImmutable("													  <th class=\"wd-25p\">Accion</th>\n"),RemoteObject.createImmutable("		                                        </tr>\n"),RemoteObject.createImmutable("		                                    </thead>\n"),RemoteObject.createImmutable("		                                    <tbody> ")));Debug.locals.put("str", _str);
 BA.debugLineNum = 58;BA.debugLine="Dim Cursor As ResultSet";
Debug.ShouldStop(33554432);
_cursor = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 59;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        Products";
Debug.ShouldStop(67108864);
_cursor = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT        ProductsInformation.ProductID, ProductsInformation.ProductName, ProductsInformation.ProductPrice, ProductsInformation.ProductImage, ProductsInformation.CatID, ProductsInformation.CostPrice, \n"),RemoteObject.createImmutable("                         ProductsInformation.ProductBarcode, ProductsInformation.ProductTax, CatInfo.CatDesc\n"),RemoteObject.createImmutable("FROM            ProductsInformation LEFT OUTER JOIN\n"),RemoteObject.createImmutable("                         CatInfo ON ProductsInformation.CatID = CatInfo.CatID")))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 64;BA.debugLine="Do While Cursor.NextRow";
Debug.ShouldStop(-2147483648);
while (_cursor.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 66;BA.debugLine="str = str & \"  <tr> \"";
Debug.ShouldStop(2);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <tr> "));Debug.locals.put("str", _str);
 BA.debugLineNum = 67;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ProductID";
Debug.ShouldStop(4);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductID"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 68;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ProductNa";
Debug.ShouldStop(8);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductName"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 69;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"CostPrice";
Debug.ShouldStop(16);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CostPrice"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 70;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ProductPr";
Debug.ShouldStop(32);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductPrice"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 71;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"CatDesc\")";
Debug.ShouldStop(64);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CatDesc"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 72;BA.debugLine="str = str & \"<td>\"& Load_AvlQty(Cursor.GetStrin";
Debug.ShouldStop(128);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),__ref.runClassMethod (b4j.example.productsinformation.class, "_load_avlqty" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductID")))))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 74;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
Debug.ShouldStop(512);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"editTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ProductID"))),RemoteObject.createImmutable(")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=\"deleteTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ProductID"))),RemoteObject.createImmutable(")\"></i></div></a> "),RemoteObject.createImmutable(" </td> </tr>"));Debug.locals.put("str", _str);
 }
;
 BA.debugLineNum = 80;BA.debugLine="Cursor.Close";
Debug.ShouldStop(32768);
_cursor.runVoidMethod ("Close");
 BA.debugLineNum = 82;BA.debugLine="str= str & \" </tbody> </table>\"";
Debug.ShouldStop(131072);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" </tbody> </table>"));Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 86;BA.debugLine="str = $\" <table id='datatable1' class='table";
Debug.ShouldStop(2097152);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" <table id='datatable1' class='table display responsive nowrap'>\n"),RemoteObject.createImmutable("		                                    <thead class=\"thead-dark\">\n"),RemoteObject.createImmutable("		                                        <tr>\n"),RemoteObject.createImmutable("		                                              <th class=\"wd-15p\">ID</th>\n"),RemoteObject.createImmutable("									                  <th class=\"wd-15p\">Producto</th>\n"),RemoteObject.createImmutable("													  <th class=\"wd-25p\">Accion</th>\n"),RemoteObject.createImmutable("		                                        </tr>\n"),RemoteObject.createImmutable("		                                    </thead>\n"),RemoteObject.createImmutable("		                                    <tbody> ")));Debug.locals.put("str", _str);
 BA.debugLineNum = 97;BA.debugLine="Dim Cursor As ResultSet";
Debug.ShouldStop(1);
_cursor = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 98;BA.debugLine="Cursor = sql1.ExecQuery(\"SELECT        ProductsI";
Debug.ShouldStop(2);
_cursor = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT        ProductsInformation.ProductID, ProductsInformation.ProductName, ProductsInformation.CostPrice, ProductsInformation.UnitPrice, ProductsInformation.TypeID, ProductsInformation.MeasureID,  "),RemoteObject.createImmutable("       ProductTypes.TypeDesc, UnitofMeasureInformation.UoMDesc "),RemoteObject.createImmutable(" FROM            ProductsInformation LEFT OUTER JOIN "),RemoteObject.createImmutable(" UnitofMeasureInformation ON ProductsInformation.MeasureID = UnitofMeasureInformation.UnitOfMeasureID LEFT OUTER JOIN "),RemoteObject.createImmutable(" ProductTypes ON ProductsInformation.TypeID = ProductTypes.ProductTypeID"))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 104;BA.debugLine="Do While Cursor.NextRow";
Debug.ShouldStop(128);
while (_cursor.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 106;BA.debugLine="str = str & \"  <tr> \"";
Debug.ShouldStop(512);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <tr> "));Debug.locals.put("str", _str);
 BA.debugLineNum = 107;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ProductID";
Debug.ShouldStop(1024);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductID"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 108;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ProductNa";
Debug.ShouldStop(2048);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("<td>"),_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductName"))),RemoteObject.createImmutable("</td>"));Debug.locals.put("str", _str);
 BA.debugLineNum = 110;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
Debug.ShouldStop(8192);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("  <td style=' vertical-align: middle !important; white-space: nowrap !important;display:block !important; '> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' onclick=\"editTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ProductID"))),RemoteObject.createImmutable(")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "),RemoteObject.createImmutable(" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=\"deleteTbl("),_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ProductID"))),RemoteObject.createImmutable(")\"></i></div></a> "),RemoteObject.createImmutable(" </td> </tr>"));Debug.locals.put("str", _str);
 }
;
 BA.debugLineNum = 116;BA.debugLine="Cursor.Close";
Debug.ShouldStop(524288);
_cursor.runVoidMethod ("Close");
 BA.debugLineNum = 118;BA.debugLine="str= str & \" </tbody> </table>\"";
Debug.ShouldStop(2097152);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" </tbody> </table>"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 123;BA.debugLine="divlist.SetHtml(str)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_divlist" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_str));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e34) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e34.toString()); BA.debugLineNum = 127;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
productsinformation.__c.runVoidMethod ("LogImpl","22097243",BA.ObjectToString(productsinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_datatable_controls(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_Datatable_Controls (productsinformation) ","productsinformation",2,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("load_datatable_controls")) { return __ref.runUserSub(false, "productsinformation","load_datatable_controls", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 191;BA.debugLine="Sub Load_Datatable_Controls";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 194;BA.debugLine="Dim str As String";
Debug.ShouldStop(2);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 195;BA.debugLine="str = $\" $(function(){         'use strict';";
Debug.ShouldStop(4);
_str = (RemoteObject.concat(RemoteObject.createImmutable(" $(function(){\n"),RemoteObject.createImmutable("        'use strict';\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("        $('#datatable1').DataTable({\n"),RemoteObject.createImmutable("          responsive: true,\n"),RemoteObject.createImmutable("          language: {\n"),RemoteObject.createImmutable("            searchPlaceholder: 'Search...',\n"),RemoteObject.createImmutable("            sSearch: '',\n"),RemoteObject.createImmutable("            lengthMenu: '_MENU_ items/page',\n"),RemoteObject.createImmutable("          }\n"),RemoteObject.createImmutable("        });\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("      \n"),RemoteObject.createImmutable("        // Select2\n"),RemoteObject.createImmutable("        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("      });")));Debug.locals.put("str", _str);
 BA.debugLineNum = 213;BA.debugLine="ws.Eval(str,Null)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(_str),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), productsinformation.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 216;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
productsinformation.__c.runVoidMethod ("LogImpl","22359321",BA.ObjectToString(productsinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _websocket_connected(RemoteObject __ref,RemoteObject _websocket1) throws Exception{
try {
		Debug.PushSubsStack("WebSocket_Connected (productsinformation) ","productsinformation",2,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "productsinformation","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 19;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(524288);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 21;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
Debug.ShouldStop(1048576);
productsinformation._main.runVoidMethod ("_validateusers" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblusernamemain" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_divmenu" /*RemoteObject*/ )));
 BA.debugLineNum = 22;BA.debugLine="ws.Session.SetAttribute(\"ProductID\",0)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("ProductID")),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 23;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(4194304);
__ref.setField ("_sql1" /*RemoteObject*/ ,productsinformation._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 25;BA.debugLine="CheckIsMobileBrowser";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.productsinformation.class, "_checkismobilebrowser" /*RemoteObject*/ );
 BA.debugLineNum = 27;BA.debugLine="Load_Data";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.productsinformation.class, "_load_data" /*RemoteObject*/ );
 BA.debugLineNum = 28;BA.debugLine="Load_Datatable_Controls";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.productsinformation.class, "_load_datatable_controls" /*RemoteObject*/ );
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _websocket_disconnected(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("WebSocket_Disconnected (productsinformation) ","productsinformation",2,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "productsinformation","websocket_disconnected", __ref);}
 BA.debugLineNum = 31;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="If sql1.IsInitialized Then";
Debug.ShouldStop(-2147483648);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 33;BA.debugLine="sql1.Close";
Debug.ShouldStop(1);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}