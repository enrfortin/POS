package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class transferinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.transferinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.transferinformation.class).invoke(this, new Object[] {null});
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
public String  _checkismobilebrowser(b4j.example.transferinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="transferinformation";
if (Debug.shouldDelegate(ba, "checkismobilebrowser", false))
	 {return ((String) Debug.delegate(ba, "checkismobilebrowser", null));}
String _str = "";
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Sub CheckIsMobileBrowser";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="Try";
try {RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="str = $\"	 if(/Android|webOS|iPhone|iPad|iPod|Bla";
_str = ("	\n"+"if(/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)){\n"+"	 \n"+"	document.getElementById(\"divismobiledev\").innerHTML = \"1\";\n"+"	\n"+"}else{\n"+"	 document.getElementById(\"divismobiledev\").innerHTML = \"0\";\n"+"}\n"+"		");
RDebugUtils.currentLine=21561357;
 //BA.debugLineNum = 21561357;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=21561359;
 //BA.debugLineNum = 21561359;BA.debugLine="IntIsMobileDev = divismobiledev.GetHtml.Value";
__ref._intismobiledev /*int*/  = (int)(BA.ObjectToNumber(__ref._divismobiledev /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetHtml().getValue()));
RDebugUtils.currentLine=21561360;
 //BA.debugLineNum = 21561360;BA.debugLine="Log(IntIsMobileDev)";
__c.LogImpl("221561360",BA.NumberToString(__ref._intismobiledev /*int*/ ),0);
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=21561362;
 //BA.debugLineNum = 21561362;BA.debugLine="Log(LastException)";
__c.LogImpl("221561362",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=21561364;
 //BA.debugLineNum = 21561364;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.transferinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="transferinformation";
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="Private divlist As JQueryElement";
_divlist = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=20971523;
 //BA.debugLineNum = 20971523;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=20971524;
 //BA.debugLineNum = 20971524;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=20971527;
 //BA.debugLineNum = 20971527;BA.debugLine="Private IntIsMobileDev As Int";
_intismobiledev = 0;
RDebugUtils.currentLine=20971528;
 //BA.debugLineNum = 20971528;BA.debugLine="Private divismobiledev As JQueryElement";
_divismobiledev = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=20971529;
 //BA.debugLineNum = 20971529;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=20971531;
 //BA.debugLineNum = 20971531;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table(b4j.example.transferinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="transferinformation";
if (Debug.shouldDelegate(ba, "delete_button_table", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Private Sub Delete_button_table(params As Map)";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("221364737",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=21364739;
 //BA.debugLineNum = 21364739;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=21364741;
 //BA.debugLineNum = 21364741;BA.debugLine="sql1.ExecNonQuery(\"delete from InvoiceH where Inv";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from InvoiceH where InvoiceID="+BA.ObjectToString(_params.Get((Object)("val"))));
RDebugUtils.currentLine=21364742;
 //BA.debugLineNum = 21364742;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=21364744;
 //BA.debugLineNum = 21364744;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.reload(true)",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=21364746;
 //BA.debugLineNum = 21364746;BA.debugLine="End Sub";
return "";
}
public String  _edit_button_table(b4j.example.transferinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="transferinformation";
if (Debug.shouldDelegate(ba, "edit_button_table", false))
	 {return ((String) Debug.delegate(ba, "edit_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Private Sub Edit_button_table(params As Map)";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("221299201",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="ws.Session.SetAttribute(\"InvoiceID\",params.Get(\"v";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("InvoiceID",_params.Get((Object)("val")));
RDebugUtils.currentLine=21299205;
 //BA.debugLineNum = 21299205;BA.debugLine="ws.Eval(\"document.location.replace('AddTransferIn";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('AddTransferInfo.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=21299207;
 //BA.debugLineNum = 21299207;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.transferinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="transferinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="End Sub";
return "";
}
public String  _load_data(b4j.example.transferinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="transferinformation";
if (Debug.shouldDelegate(ba, "load_data", false))
	 {return ((String) Debug.delegate(ba, "load_data", null));}
String _str = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cursor = null;
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Sub Load_Data";
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="Try";
try {RDebugUtils.currentLine=21233667;
 //BA.debugLineNum = 21233667;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=21233669;
 //BA.debugLineNum = 21233669;BA.debugLine="If IntIsMobileDev = 0 Then";
if (__ref._intismobiledev /*int*/ ==0) { 
RDebugUtils.currentLine=21233671;
 //BA.debugLineNum = 21233671;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Date</th>\n"+"									                  <th class=\"wd-10p\">From Warehouse</th>\n"+"									                  <th class=\"wd-10p\">To Warehouse</th>\n"+"									                  <th class=\"wd-15p\">Total Invoice</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=21233684;
 //BA.debugLineNum = 21233684;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=21233685;
 //BA.debugLineNum = 21233685;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        Transfer";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT        TransferH.TransferHID, TransferH.InvDT, TransferH.InvTotal, TransferH.FromWarehouseID, TransferH.InvTotalTax, TransferH.InvTotalDiscount, TransferH.InvTotalShipping, TransferH.PaidAmount, \n"+"                         TransferH.StrNotes, TransferH.PaymenttypeID, TransferH.ToWarehouseID, WarehouseInfo_1.WarehouseDesc as ToWarehouseDesc, WarehouseInfo.WarehouseDesc as FromWarehouseDesc\n"+"FROM            TransferH LEFT OUTER JOIN\n"+"                         WarehouseInfo AS WarehouseInfo_1 ON TransferH.ToWarehouseID = WarehouseInfo_1.WarehouseID LEFT OUTER JOIN\n"+"                         WarehouseInfo ON TransferH.FromWarehouseID = WarehouseInfo.WarehouseID"));
RDebugUtils.currentLine=21233691;
 //BA.debugLineNum = 21233691;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=21233693;
 //BA.debugLineNum = 21233693;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=21233694;
 //BA.debugLineNum = 21233694;BA.debugLine="str = str & \"<td>\"& Cursor.GetInt(\"TransferHID\"";
_str = _str+"<td>"+BA.NumberToString(_cursor.GetInt("TransferHID"))+"</td>";
RDebugUtils.currentLine=21233695;
 //BA.debugLineNum = 21233695;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"InvDT\") &";
_str = _str+"<td>"+_cursor.GetString("InvDT")+"</td>";
RDebugUtils.currentLine=21233696;
 //BA.debugLineNum = 21233696;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"ToWarehou";
_str = _str+"<td>"+_cursor.GetString("ToWarehouseDesc")+"</td>";
RDebugUtils.currentLine=21233697;
 //BA.debugLineNum = 21233697;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"FromWareh";
_str = _str+"<td>"+_cursor.GetString("FromWarehouseDesc")+"</td>";
RDebugUtils.currentLine=21233698;
 //BA.debugLineNum = 21233698;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"InvTotal\"";
_str = _str+"<td>"+_cursor.GetString("InvTotal")+"</td>";
RDebugUtils.currentLine=21233700;
 //BA.debugLineNum = 21233700;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("TransferHID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "+" <a href='javascript:void(0);' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("TransferHID"))+")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=21233706;
 //BA.debugLineNum = 21233706;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=21233708;
 //BA.debugLineNum = 21233708;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
 }else {
RDebugUtils.currentLine=21233712;
 //BA.debugLineNum = 21233712;BA.debugLine="str = $\" <table id='datatable1' class='table d";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=21233721;
 //BA.debugLineNum = 21233721;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=21233722;
 //BA.debugLineNum = 21233722;BA.debugLine="Cursor = sql1.ExecQuery($\"SELECT        Transf";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("SELECT        TransferH.TransferHID, TransferH.InvDT, TransferH.InvTotal, TransferH.FromWarehouseID, TransferH.InvTotalTax, TransferH.InvTotalDiscount, TransferH.InvTotalShipping, TransferH.PaidAmount, \n"+"                         TransferH.StrNotes, TransferH.PaymenttypeID, TransferH.ToWarehouseID, WarehouseInfo_1.WarehouseDesc as ToWarehouseDesc, WarehouseInfo.WarehouseDesc as FromWarehouseDesc\n"+"FROM            TransferH LEFT OUTER JOIN\n"+"                         WarehouseInfo AS WarehouseInfo_1 ON TransferH.ToWarehouseID = WarehouseInfo_1.WarehouseID LEFT OUTER JOIN\n"+"                         WarehouseInfo ON TransferH.FromWarehouseID = WarehouseInfo.WarehouseID"));
RDebugUtils.currentLine=21233728;
 //BA.debugLineNum = 21233728;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=21233730;
 //BA.debugLineNum = 21233730;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=21233731;
 //BA.debugLineNum = 21233731;BA.debugLine="str = str & \"<td>\"& Cursor.GetInt(\"TransferHI";
_str = _str+"<td>"+BA.NumberToString(_cursor.GetInt("TransferHID"))+"</td>";
RDebugUtils.currentLine=21233733;
 //BA.debugLineNum = 21233733;BA.debugLine="str = str & \"  <td style=' vertical-align: mi";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("TransferHID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "+" <a href='javascript:void(0);' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("TransferHID"))+")\" class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' ></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=21233739;
 //BA.debugLineNum = 21233739;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=21233741;
 //BA.debugLineNum = 21233741;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
 };
RDebugUtils.currentLine=21233747;
 //BA.debugLineNum = 21233747;BA.debugLine="divlist.SetHtml(str)";
__ref._divlist /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
 } 
       catch (Exception e32) {
			ba.setLastException(e32);RDebugUtils.currentLine=21233751;
 //BA.debugLineNum = 21233751;BA.debugLine="Log(LastException)";
__c.LogImpl("221233751",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=21233753;
 //BA.debugLineNum = 21233753;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.transferinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="transferinformation";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="Try";
try {RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"          responsive: true,\n"+"          language: {\n"+"            searchPlaceholder: 'Search...',\n"+"            sSearch: '',\n"+"            lengthMenu: '_MENU_ items/page',\n"+"          }\n"+"        });\n"+"\n"+"      \n"+"        // Select2\n"+"        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"+"\n"+"      });");
RDebugUtils.currentLine=21495830;
 //BA.debugLineNum = 21495830;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=21495833;
 //BA.debugLineNum = 21495833;BA.debugLine="Log(LastException)";
__c.LogImpl("221495833",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=21495835;
 //BA.debugLineNum = 21495835;BA.debugLine="End Sub";
return "";
}
public String  _print_table_data(b4j.example.transferinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="transferinformation";
if (Debug.shouldDelegate(ba, "print_table_data", false))
	 {return ((String) Debug.delegate(ba, "print_table_data", new Object[] {_params}));}
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Private Sub Print_Table_Data(params As Map)";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("221430273",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=21430275;
 //BA.debugLineNum = 21430275;BA.debugLine="ws.Session.SetAttribute(\"TempRID\",params.Get(\"val";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("TempRID",_params.Get((Object)("val")));
RDebugUtils.currentLine=21430277;
 //BA.debugLineNum = 21430277;BA.debugLine="ws.Eval(\"window.open('PrintInvoiceReport.html', '";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("window.open('PrintInvoiceReport.html', '_blank')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=21430279;
 //BA.debugLineNum = 21430279;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.transferinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="transferinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=21102596;
 //BA.debugLineNum = 21102596;BA.debugLine="ws.Session.SetAttribute(\"InvoiceID\",0)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("InvoiceID",(Object)(0));
RDebugUtils.currentLine=21102597;
 //BA.debugLineNum = 21102597;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=21102599;
 //BA.debugLineNum = 21102599;BA.debugLine="CheckIsMobileBrowser";
__ref._checkismobilebrowser /*String*/ (null);
RDebugUtils.currentLine=21102601;
 //BA.debugLineNum = 21102601;BA.debugLine="Load_Data";
__ref._load_data /*String*/ (null);
RDebugUtils.currentLine=21102602;
 //BA.debugLineNum = 21102602;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
RDebugUtils.currentLine=21102603;
 //BA.debugLineNum = 21102603;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.transferinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="transferinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=21168132;
 //BA.debugLineNum = 21168132;BA.debugLine="End Sub";
return "";
}
}