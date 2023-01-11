package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class supplierinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.supplierinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.supplierinformation.class).invoke(this, new Object[] {null});
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
public String  _checkismobilebrowser(b4j.example.supplierinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="supplierinformation";
if (Debug.shouldDelegate(ba, "checkismobilebrowser", false))
	 {return ((String) Debug.delegate(ba, "checkismobilebrowser", null));}
String _str = "";
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Sub CheckIsMobileBrowser";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="Try";
try {RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=20905987;
 //BA.debugLineNum = 20905987;BA.debugLine="str = $\"	 if(/Android|webOS|iPhone|iPad|iPod|Bla";
_str = ("	\n"+"if(/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)){\n"+"	 \n"+"	document.getElementById(\"divismobiledev\").innerHTML = \"1\";\n"+"	\n"+"}else{\n"+"	 document.getElementById(\"divismobiledev\").innerHTML = \"0\";\n"+"}\n"+"		");
RDebugUtils.currentLine=20905997;
 //BA.debugLineNum = 20905997;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=20905999;
 //BA.debugLineNum = 20905999;BA.debugLine="IntIsMobileDev = divismobiledev.GetHtml.Value";
__ref._intismobiledev /*int*/  = (int)(BA.ObjectToNumber(__ref._divismobiledev /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetHtml().getValue()));
RDebugUtils.currentLine=20906000;
 //BA.debugLineNum = 20906000;BA.debugLine="Log(IntIsMobileDev)";
__c.LogImpl("220906000",BA.NumberToString(__ref._intismobiledev /*int*/ ),0);
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=20906002;
 //BA.debugLineNum = 20906002;BA.debugLine="Log(LastException)";
__c.LogImpl("220906002",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=20906004;
 //BA.debugLineNum = 20906004;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.supplierinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="supplierinformation";
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="Private divlist As JQueryElement";
_divlist = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=20381699;
 //BA.debugLineNum = 20381699;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=20381700;
 //BA.debugLineNum = 20381700;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=20381704;
 //BA.debugLineNum = 20381704;BA.debugLine="Private IntIsMobileDev As Int";
_intismobiledev = 0;
RDebugUtils.currentLine=20381705;
 //BA.debugLineNum = 20381705;BA.debugLine="Private divismobiledev As JQueryElement";
_divismobiledev = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=20381706;
 //BA.debugLineNum = 20381706;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=20381708;
 //BA.debugLineNum = 20381708;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table(b4j.example.supplierinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="supplierinformation";
if (Debug.shouldDelegate(ba, "delete_button_table", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Private Sub Delete_button_table(params As Map)";
RDebugUtils.currentLine=20774913;
 //BA.debugLineNum = 20774913;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("220774913",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=20774915;
 //BA.debugLineNum = 20774915;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=20774917;
 //BA.debugLineNum = 20774917;BA.debugLine="sql1.ExecNonQuery(\"delete from SuppliersInfo wher";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from SuppliersInfo where SupplierID="+BA.ObjectToString(_params.Get((Object)("val"))));
RDebugUtils.currentLine=20774918;
 //BA.debugLineNum = 20774918;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=20774920;
 //BA.debugLineNum = 20774920;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.reload(true)",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=20774922;
 //BA.debugLineNum = 20774922;BA.debugLine="End Sub";
return "";
}
public String  _edit_button_table(b4j.example.supplierinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="supplierinformation";
if (Debug.shouldDelegate(ba, "edit_button_table", false))
	 {return ((String) Debug.delegate(ba, "edit_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="Private Sub Edit_button_table(params As Map)";
RDebugUtils.currentLine=20709377;
 //BA.debugLineNum = 20709377;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("220709377",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=20709379;
 //BA.debugLineNum = 20709379;BA.debugLine="ws.Session.SetAttribute(\"CustomerID\",params.Get(\"";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("CustomerID",_params.Get((Object)("val")));
RDebugUtils.currentLine=20709381;
 //BA.debugLineNum = 20709381;BA.debugLine="ws.Eval(\"document.location.replace('AddSupplierIn";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('AddSupplierInfo.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=20709383;
 //BA.debugLineNum = 20709383;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.supplierinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="supplierinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="End Sub";
return "";
}
public String  _load_data(b4j.example.supplierinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="supplierinformation";
if (Debug.shouldDelegate(ba, "load_data", false))
	 {return ((String) Debug.delegate(ba, "load_data", null));}
String _str = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cursor = null;
RDebugUtils.currentLine=20643840;
 //BA.debugLineNum = 20643840;BA.debugLine="Sub Load_Data";
RDebugUtils.currentLine=20643841;
 //BA.debugLineNum = 20643841;BA.debugLine="Try";
try {RDebugUtils.currentLine=20643842;
 //BA.debugLineNum = 20643842;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=20643844;
 //BA.debugLineNum = 20643844;BA.debugLine="If IntIsMobileDev = 0 Then";
if (__ref._intismobiledev /*int*/ ==0) { 
RDebugUtils.currentLine=20643846;
 //BA.debugLineNum = 20643846;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Supplier Name</th>\n"+"									                  <th class=\"wd-20p\">Email</th>\n"+"									                  <th class=\"wd-15p\">Phone</th>\n"+"									                  <th class=\"wd-10p\">Country</th>\n"+"									                  <th class=\"wd-25p\">City</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=20643860;
 //BA.debugLineNum = 20643860;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=20643861;
 //BA.debugLineNum = 20643861;BA.debugLine="Cursor = sql1.ExecQuery(\"select * from Suppliers";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from SuppliersInfo");
RDebugUtils.currentLine=20643863;
 //BA.debugLineNum = 20643863;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=20643865;
 //BA.debugLineNum = 20643865;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=20643866;
 //BA.debugLineNum = 20643866;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"SupplierI";
_str = _str+"<td>"+_cursor.GetString("SupplierID")+"</td>";
RDebugUtils.currentLine=20643867;
 //BA.debugLineNum = 20643867;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"SupplierN";
_str = _str+"<td>"+_cursor.GetString("SupplierName")+"</td>";
RDebugUtils.currentLine=20643868;
 //BA.debugLineNum = 20643868;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"SupplierE";
_str = _str+"<td>"+_cursor.GetString("SupplierEmail")+"</td>";
RDebugUtils.currentLine=20643869;
 //BA.debugLineNum = 20643869;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"SupplierP";
_str = _str+"<td>"+_cursor.GetString("SupplierPhone")+"</td>";
RDebugUtils.currentLine=20643870;
 //BA.debugLineNum = 20643870;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"SupplierC";
_str = _str+"<td>"+_cursor.GetString("SupplierCountry")+"</td>";
RDebugUtils.currentLine=20643871;
 //BA.debugLineNum = 20643871;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"SupplierC";
_str = _str+"<td>"+_cursor.GetString("SupplierCity")+"</td>";
RDebugUtils.currentLine=20643873;
 //BA.debugLineNum = 20643873;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("SupplierID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil'></i></div></a> "+" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("SupplierID"))+")\"></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=20643879;
 //BA.debugLineNum = 20643879;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=20643881;
 //BA.debugLineNum = 20643881;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
 }else {
RDebugUtils.currentLine=20643887;
 //BA.debugLineNum = 20643887;BA.debugLine="str = $\" <table id='datatable1' class='table d";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"			                                    <thead class=\"thead-dark\">\n"+"			                                        <tr>\n"+"			                                              <th class=\"wd-15p\">ID</th>\n"+"										                  <th class=\"wd-15p\">Customer Name</th>\n"+"														  <th class=\"wd-25p\">Action</th>\n"+"			                                        </tr>\n"+"			                                    </thead>\n"+"			                                    <tbody> ");
RDebugUtils.currentLine=20643897;
 //BA.debugLineNum = 20643897;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=20643898;
 //BA.debugLineNum = 20643898;BA.debugLine="Cursor = sql1.ExecQuery(\"select * from Supplier";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from SuppliersInfo");
RDebugUtils.currentLine=20643900;
 //BA.debugLineNum = 20643900;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=20643902;
 //BA.debugLineNum = 20643902;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=20643903;
 //BA.debugLineNum = 20643903;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"Supplier";
_str = _str+"<td>"+_cursor.GetString("SupplierID")+"</td>";
RDebugUtils.currentLine=20643904;
 //BA.debugLineNum = 20643904;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"Supplier";
_str = _str+"<td>"+_cursor.GetString("SupplierName")+"</td>";
RDebugUtils.currentLine=20643906;
 //BA.debugLineNum = 20643906;BA.debugLine="str = str & \"  <td style=' vertical-align: mid";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("SupplierID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil'></i></div></a> "+" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("SupplierID"))+")\"></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=20643912;
 //BA.debugLineNum = 20643912;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=20643914;
 //BA.debugLineNum = 20643914;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
 };
RDebugUtils.currentLine=20643921;
 //BA.debugLineNum = 20643921;BA.debugLine="divlist.SetHtml(str)";
__ref._divlist /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
 } 
       catch (Exception e34) {
			ba.setLastException(e34);RDebugUtils.currentLine=20643924;
 //BA.debugLineNum = 20643924;BA.debugLine="Log(LastException)";
__c.LogImpl("220643924",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=20643926;
 //BA.debugLineNum = 20643926;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.supplierinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="supplierinformation";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="Try";
try {RDebugUtils.currentLine=20840451;
 //BA.debugLineNum = 20840451;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=20840452;
 //BA.debugLineNum = 20840452;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"          responsive: true,\n"+"          language: {\n"+"            searchPlaceholder: 'Search...',\n"+"            sSearch: '',\n"+"            lengthMenu: '_MENU_ items/page',\n"+"          }\n"+"        });\n"+"\n"+"      \n"+"        // Select2\n"+"        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"+"\n"+"      });");
RDebugUtils.currentLine=20840470;
 //BA.debugLineNum = 20840470;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=20840473;
 //BA.debugLineNum = 20840473;BA.debugLine="Log(LastException)";
__c.LogImpl("220840473",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=20840475;
 //BA.debugLineNum = 20840475;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.supplierinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="supplierinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=20512772;
 //BA.debugLineNum = 20512772;BA.debugLine="ws.Session.SetAttribute(\"CustomerID\",0)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("CustomerID",(Object)(0));
RDebugUtils.currentLine=20512773;
 //BA.debugLineNum = 20512773;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=20512775;
 //BA.debugLineNum = 20512775;BA.debugLine="CheckIsMobileBrowser";
__ref._checkismobilebrowser /*String*/ (null);
RDebugUtils.currentLine=20512778;
 //BA.debugLineNum = 20512778;BA.debugLine="Load_Data";
__ref._load_data /*String*/ (null);
RDebugUtils.currentLine=20512779;
 //BA.debugLineNum = 20512779;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
RDebugUtils.currentLine=20512780;
 //BA.debugLineNum = 20512780;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.supplierinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="supplierinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=20578308;
 //BA.debugLineNum = 20578308;BA.debugLine="End Sub";
return "";
}
}