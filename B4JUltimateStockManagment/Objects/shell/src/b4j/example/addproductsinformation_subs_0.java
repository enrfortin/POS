package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class addproductsinformation_subs_0 {


public static RemoteObject  _btncancel_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btncancel_Click (addproductsinformation) ","addproductsinformation",3,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("btncancel_click")) { return __ref.runUserSub(false, "addproductsinformation","btncancel_click", __ref, _params);}
Debug.locals.put("Params", _params);
 BA.debugLineNum = 118;BA.debugLine="Sub btncancel_Click (Params As Map)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="ws.Eval(\"document.location.replace('ProductsInfo";
Debug.ShouldStop(4194304);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('ProductsInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addproductsinformation.__c.getField(false,"Null")));
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsave_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btnsave_Click (addproductsinformation) ","addproductsinformation",3,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("btnsave_click")) { return __ref.runUserSub(false, "addproductsinformation","btnsave_click", __ref, _params);}
RemoteObject _productid = RemoteObject.createImmutable(0);
RemoteObject _payloadstr = RemoteObject.createImmutable("");
RemoteObject _commapos = RemoteObject.createImmutable(0);
Debug.locals.put("Params", _params);
 BA.debugLineNum = 51;BA.debugLine="Sub btnsave_Click (Params As Map)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 54;BA.debugLine="If txtname.GetVal.Value = \"\" Or txtunitprice.Get";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable((""))) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtunitprice" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable((""))) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtcostprice" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 55;BA.debugLine="Return";
Debug.ShouldStop(4194304);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 58;BA.debugLine="Dim ProductID As Int = ws.Session.GetAttribute(\"";
Debug.ShouldStop(33554432);
_productid = BA.numberCast(int.class, __ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("ProductID"))));Debug.locals.put("ProductID", _productid);Debug.locals.put("ProductID", _productid);
 BA.debugLineNum = 59;BA.debugLine="If ProductID > 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_productid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 61;BA.debugLine="Dim PayLoadStr As String =txtimagen.GetVal.Valu";
Debug.ShouldStop(268435456);
_payloadstr = BA.ObjectToString(__ref.getField(false,"_txtimagen" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"));Debug.locals.put("PayLoadStr", _payloadstr);Debug.locals.put("PayLoadStr", _payloadstr);
 BA.debugLineNum = 62;BA.debugLine="Dim commapos As Int =PayLoadStr.IndexOf(\"\\\")";
Debug.ShouldStop(536870912);
_commapos = _payloadstr.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("\\")));Debug.locals.put("commapos", _commapos);Debug.locals.put("commapos", _commapos);
 BA.debugLineNum = 68;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(8);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 69;BA.debugLine="sql1.ExecNonQuery2($\"UPDATE ProductsInformatio";
Debug.ShouldStop(16);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("UPDATE ProductsInformation\n"),RemoteObject.createImmutable("   SET ProductName = ?\n"),RemoteObject.createImmutable("      ,ProductPrice = ?\n"),RemoteObject.createImmutable("      ,ProductImage = ?\n"),RemoteObject.createImmutable("      ,CatID = ?\n"),RemoteObject.createImmutable("      ,CostPrice = ?\n"),RemoteObject.createImmutable("      ,ProductBarcode = ?\n"),RemoteObject.createImmutable("      ,ProductTax = ? where ProductID=?")))),(Object)(addproductsinformation.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {8},new Object[] {__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtunitprice" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(RemoteObject.concat(RemoteObject.createImmutable("images/products/"),_payloadstr.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_commapos,RemoteObject.createImmutable(10)}, "+",1, 1))))),__ref.getField(false,"_cmbcat" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtcostprice" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtbarcode" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txttax" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(_productid)})))));
 BA.debugLineNum = 77;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(4096);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 }else {
 BA.debugLineNum = 81;BA.debugLine="Dim PayLoadStr As String =txtimagen.GetVal.Valu";
Debug.ShouldStop(65536);
_payloadstr = BA.ObjectToString(__ref.getField(false,"_txtimagen" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"));Debug.locals.put("PayLoadStr", _payloadstr);Debug.locals.put("PayLoadStr", _payloadstr);
 BA.debugLineNum = 82;BA.debugLine="Dim commapos As Int =PayLoadStr.IndexOf(\"\\\")";
Debug.ShouldStop(131072);
_commapos = _payloadstr.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("\\")));Debug.locals.put("commapos", _commapos);Debug.locals.put("commapos", _commapos);
 BA.debugLineNum = 86;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 87;BA.debugLine="sql1.ExecNonQuery2($\"INSERT INTO ProductsInfor";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO ProductsInformation\n"),RemoteObject.createImmutable("		           (ProductName\n"),RemoteObject.createImmutable("		           ,ProductPrice\n"),RemoteObject.createImmutable("		           ,ProductImage\n"),RemoteObject.createImmutable("		           ,CatID\n"),RemoteObject.createImmutable("		           ,CostPrice\n"),RemoteObject.createImmutable("		           ,ProductBarcode\n"),RemoteObject.createImmutable("		           ,ProductTax)\n"),RemoteObject.createImmutable("		     VALUES\n"),RemoteObject.createImmutable("		           (?\n"),RemoteObject.createImmutable("		           ,?\n"),RemoteObject.createImmutable("		           ,?\n"),RemoteObject.createImmutable("		           ,?\n"),RemoteObject.createImmutable("		           ,?\n"),RemoteObject.createImmutable("		           ,?\n"),RemoteObject.createImmutable("		           ,? )")))),(Object)(addproductsinformation.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtunitprice" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),(RemoteObject.concat(RemoteObject.createImmutable("images/products/"),_payloadstr.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_commapos,RemoteObject.createImmutable(10)}, "+",1, 1))))),__ref.getField(false,"_cmbcat" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtcostprice" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txtbarcode" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"),__ref.getField(false,"_txttax" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue")})))));
 BA.debugLineNum = 104;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(128);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 };
 BA.debugLineNum = 108;BA.debugLine="Main.Insert_UsersLogs(ws,\"Products Information\")";
Debug.ShouldStop(2048);
addproductsinformation._main.runVoidMethod ("_insert_userslogs" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("Products Information")));
 BA.debugLineNum = 110;BA.debugLine="ws.Eval(\"document.location.replace('ProductsInfo";
Debug.ShouldStop(8192);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("document.location.replace('ProductsInformation.html')")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), addproductsinformation.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e22) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e22.toString()); BA.debugLineNum = 114;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
addproductsinformation.__c.runVoidMethod ("LogImpl","22752575",BA.ObjectToString(addproductsinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
addproductsinformation._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",addproductsinformation._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private txtname,cmbcat,txtbarcode,txtunitprice,tx";
addproductsinformation._txtname = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtname",addproductsinformation._txtname);
addproductsinformation._cmbcat = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_cmbcat",addproductsinformation._cmbcat);
addproductsinformation._txtbarcode = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtbarcode",addproductsinformation._txtbarcode);
addproductsinformation._txtunitprice = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtunitprice",addproductsinformation._txtunitprice);
addproductsinformation._txtcostprice = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtcostprice",addproductsinformation._txtcostprice);
addproductsinformation._txttax = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txttax",addproductsinformation._txttax);
addproductsinformation._txtimagen = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtimagen",addproductsinformation._txtimagen);
 //BA.debugLineNum = 5;BA.debugLine="Private lblusernamemain As JQueryElement";
addproductsinformation._lblusernamemain = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_lblusernamemain",addproductsinformation._lblusernamemain);
 //BA.debugLineNum = 6;BA.debugLine="Private divMenu As JQueryElement";
addproductsinformation._divmenu = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_divmenu",addproductsinformation._divmenu);
 //BA.debugLineNum = 7;BA.debugLine="Private sql1 As SQL";
addproductsinformation._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",addproductsinformation._sql1);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (addproductsinformation) ","addproductsinformation",3,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "addproductsinformation","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1024);
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_cats(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_Cats (addproductsinformation) ","addproductsinformation",3,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("load_cats")) { return __ref.runUserSub(false, "addproductsinformation","load_cats", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _val = RemoteObject.createImmutable("");
 BA.debugLineNum = 29;BA.debugLine="Sub Load_Cats";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Log(txtimagen.GetText.Value)";
Debug.ShouldStop(536870912);
addproductsinformation.__c.runVoidMethod ("LogImpl","22686977",BA.ObjectToString(__ref.getField(false,"_txtimagen" /*RemoteObject*/ ).runMethod(false,"GetText").runMethod(false,"getValue")),0);
 BA.debugLineNum = 31;BA.debugLine="Log(txtimagen.GetVal.Value)";
Debug.ShouldStop(1073741824);
addproductsinformation.__c.runVoidMethod ("LogImpl","22686978",BA.ObjectToString(__ref.getField(false,"_txtimagen" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue")),0);
 BA.debugLineNum = 34;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 35;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(4);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 36;BA.debugLine="sb.Initialize";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 37;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(16);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 38;BA.debugLine="rs = sql1.ExecQuery(\"select * from CatInfo\")";
Debug.ShouldStop(32);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from CatInfo")));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 39;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(64);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 40;BA.debugLine="Dim val As String = rs.GetInt(\"CatID\")";
Debug.ShouldStop(128);
_val = BA.NumberToString(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("CatID"))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 41;BA.debugLine="sb.Append(\"<option value='\").Append(val).Append";
Debug.ShouldStop(256);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<option value='"))).runMethod(false,"Append",(Object)(_val)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("'>"))).runMethod(false,"Append",(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CatDesc"))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</option>")));
 }
;
 BA.debugLineNum = 43;BA.debugLine="rs.Close";
Debug.ShouldStop(1024);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 44;BA.debugLine="cmbcat.SetHtml(sb.ToString)";
Debug.ShouldStop(2048);
__ref.getField(false,"_cmbcat" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(_sb.runMethod(true,"ToString")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e15.toString()); BA.debugLineNum = 47;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
addproductsinformation.__c.runVoidMethod ("LogImpl","22686994",BA.ObjectToString(addproductsinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_data_byid(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Load_Data_ByID (addproductsinformation) ","addproductsinformation",3,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("load_data_byid")) { return __ref.runUserSub(false, "addproductsinformation","load_data_byid", __ref);}
RemoteObject _productid = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _strid = RemoteObject.createImmutable("");
 BA.debugLineNum = 128;BA.debugLine="Sub Load_Data_ByID";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 131;BA.debugLine="Dim ProductID As Int = ws.Session.GetAttribute(\"";
Debug.ShouldStop(4);
_productid = BA.numberCast(int.class, __ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("ProductID"))));Debug.locals.put("ProductID", _productid);Debug.locals.put("ProductID", _productid);
 BA.debugLineNum = 132;BA.debugLine="If ProductID > 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_productid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 134;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(32);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 135;BA.debugLine="rs = sql1.ExecQuery(\"select * from  ProductsInf";
Debug.ShouldStop(64);
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from  ProductsInformation where ProductID="),_productid)));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 136;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(128);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 138;BA.debugLine="txtname.SetVal(rs.GetString(\"ProductName\"))";
Debug.ShouldStop(512);
__ref.getField(false,"_txtname" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductName"))))));
 BA.debugLineNum = 140;BA.debugLine="Dim strID As String = cmbcat.id";
Debug.ShouldStop(2048);
_strid = __ref.getField(false,"_cmbcat" /*RemoteObject*/ ).runMethod(true,"getId");Debug.locals.put("strID", _strid);Debug.locals.put("strID", _strid);
 BA.debugLineNum = 141;BA.debugLine="strID = strID.Replace(\"#\",\"\")";
Debug.ShouldStop(4096);
_strid = _strid.runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strID", _strid);
 BA.debugLineNum = 142;BA.debugLine="ws.RunFunction(\"setSelectedRow\", Array As Obje";
Debug.ShouldStop(8192);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("RunFunction",(Object)(BA.ObjectToString("setSelectedRow")),(Object)(addproductsinformation.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_strid),(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("CatID"))))})))));
 BA.debugLineNum = 144;BA.debugLine="txtbarcode.SetVal(rs.GetString(\"ProductBarcode";
Debug.ShouldStop(32768);
__ref.getField(false,"_txtbarcode" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductBarcode"))))));
 BA.debugLineNum = 145;BA.debugLine="txtunitprice.SetVal(rs.GetString(\"ProductPrice";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtunitprice" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductPrice"))))));
 BA.debugLineNum = 146;BA.debugLine="txtcostprice.SetVal(rs.GetString(\"CostPrice\"))";
Debug.ShouldStop(131072);
__ref.getField(false,"_txtcostprice" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CostPrice"))))));
 BA.debugLineNum = 147;BA.debugLine="txttax.SetVal(rs.GetString(\"ProductTax\"))";
Debug.ShouldStop(262144);
__ref.getField(false,"_txttax" /*RemoteObject*/ ).runVoidMethod ("SetVal",(Object)((_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ProductTax"))))));
 }
;
 BA.debugLineNum = 150;BA.debugLine="rs.Close";
Debug.ShouldStop(2097152);
_rs.runVoidMethod ("Close");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e19) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e19.toString()); BA.debugLineNum = 156;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
addproductsinformation.__c.runVoidMethod ("LogImpl","22949148",BA.ObjectToString(addproductsinformation.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("WebSocket_Connected (addproductsinformation) ","addproductsinformation",3,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "addproductsinformation","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 15;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(32768);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 17;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
Debug.ShouldStop(65536);
addproductsinformation._main.runVoidMethod ("_validateusers" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ws" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblusernamemain" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_divmenu" /*RemoteObject*/ )));
 BA.debugLineNum = 18;BA.debugLine="ws.Session.SetAttribute(\"ProductID\",0)";
Debug.ShouldStop(131072);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("ProductID")),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 19;BA.debugLine="sql1 = Main.pool.GetConnection";
Debug.ShouldStop(262144);
__ref.setField ("_sql1" /*RemoteObject*/ ,addproductsinformation._main._pool /*RemoteObject*/ .runMethod(false,"GetConnection"));
 BA.debugLineNum = 21;BA.debugLine="Load_Cats";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.addproductsinformation.class, "_load_cats" /*RemoteObject*/ );
 BA.debugLineNum = 23;BA.debugLine="Load_Data_ByID";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.addproductsinformation.class, "_load_data_byid" /*RemoteObject*/ );
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("WebSocket_Disconnected (addproductsinformation) ","addproductsinformation",3,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "addproductsinformation","websocket_disconnected", __ref);}
 BA.debugLineNum = 122;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="If sql1.IsInitialized Then";
Debug.ShouldStop(67108864);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 124;BA.debugLine="sql1.Close";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}