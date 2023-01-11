package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class customersinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.customersinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.customersinformation.class).invoke(this, new Object[] {null});
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
public String  _checkismobilebrowser(b4j.example.customersinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customersinformation";
if (Debug.shouldDelegate(ba, "checkismobilebrowser", false))
	 {return ((String) Debug.delegate(ba, "checkismobilebrowser", null));}
String _str = "";
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub CheckIsMobileBrowser";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Try";
try {RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="str = $\"	 if(/Android|webOS|iPhone|iPad|iPod|Bla";
_str = ("	\n"+"if(/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)){\n"+"	 \n"+"	document.getElementById(\"divismobiledev\").innerHTML = \"1\";\n"+"	\n"+"}else{\n"+"	 document.getElementById(\"divismobiledev\").innerHTML = \"0\";\n"+"}\n"+"		");
RDebugUtils.currentLine=3538957;
 //BA.debugLineNum = 3538957;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=3538959;
 //BA.debugLineNum = 3538959;BA.debugLine="IntIsMobileDev = divismobiledev.GetHtml.Value";
__ref._intismobiledev /*int*/  = (int)(BA.ObjectToNumber(__ref._divismobiledev /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetHtml().getValue()));
RDebugUtils.currentLine=3538960;
 //BA.debugLineNum = 3538960;BA.debugLine="Log(IntIsMobileDev)";
__c.LogImpl("23538960",BA.NumberToString(__ref._intismobiledev /*int*/ ),0);
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=3538962;
 //BA.debugLineNum = 3538962;BA.debugLine="Log(LastException)";
__c.LogImpl("23538962",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=3538964;
 //BA.debugLineNum = 3538964;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.customersinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customersinformation";
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Private divlist As JQueryElement";
_divlist = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="Private IntIsMobileDev As Int";
_intismobiledev = 0;
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="Private divismobiledev As JQueryElement";
_divismobiledev = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table(b4j.example.customersinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="customersinformation";
if (Debug.shouldDelegate(ba, "delete_button_table", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub Delete_button_table(params As Map)";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("23407873",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="sql1.ExecNonQuery(\"delete from CustomersInformati";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from CustomersInformation where CustomerID="+BA.ObjectToString(_params.Get((Object)("val"))));
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.reload(true)",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=3407882;
 //BA.debugLineNum = 3407882;BA.debugLine="End Sub";
return "";
}
public String  _edit_button_table(b4j.example.customersinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="customersinformation";
if (Debug.shouldDelegate(ba, "edit_button_table", false))
	 {return ((String) Debug.delegate(ba, "edit_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub Edit_button_table(params As Map)";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Log(params.Get(\"val\"))";
__c.LogImpl("23342337",BA.ObjectToString(_params.Get((Object)("val"))),0);
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="ws.Session.SetAttribute(\"CustomerID\",params.Get(\"";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("CustomerID",_params.Get((Object)("val")));
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="ws.Eval(\"document.location.replace('AddCustomerIn";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('AddCustomerInfo.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.customersinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="customersinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="End Sub";
return "";
}
public String  _load_data(b4j.example.customersinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customersinformation";
if (Debug.shouldDelegate(ba, "load_data", false))
	 {return ((String) Debug.delegate(ba, "load_data", null));}
String _str = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cursor = null;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub Load_Data";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Try";
try {RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="If IntIsMobileDev = 0 Then";
if (__ref._intismobiledev /*int*/ ==0) { 
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Customer Name</th>\n"+"									                  <th class=\"wd-20p\">Email</th>\n"+"									                  <th class=\"wd-15p\">Phone</th>\n"+"									                  <th class=\"wd-10p\">Country</th>\n"+"									                  <th class=\"wd-25p\">City</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=3276820;
 //BA.debugLineNum = 3276820;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=3276821;
 //BA.debugLineNum = 3276821;BA.debugLine="Cursor = sql1.ExecQuery(\"select * from Customers";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from CustomersInformation");
RDebugUtils.currentLine=3276823;
 //BA.debugLineNum = 3276823;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=3276825;
 //BA.debugLineNum = 3276825;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=3276826;
 //BA.debugLineNum = 3276826;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"CustomerI";
_str = _str+"<td>"+_cursor.GetString("CustomerID")+"</td>";
RDebugUtils.currentLine=3276827;
 //BA.debugLineNum = 3276827;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"CustomerN";
_str = _str+"<td>"+_cursor.GetString("CustomerName")+"</td>";
RDebugUtils.currentLine=3276828;
 //BA.debugLineNum = 3276828;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"CustEmail";
_str = _str+"<td>"+_cursor.GetString("CustEmail")+"</td>";
RDebugUtils.currentLine=3276829;
 //BA.debugLineNum = 3276829;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"CustPhone";
_str = _str+"<td>"+_cursor.GetString("CustPhone")+"</td>";
RDebugUtils.currentLine=3276830;
 //BA.debugLineNum = 3276830;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"CustCount";
_str = _str+"<td>"+_cursor.GetString("CustCountry")+"</td>";
RDebugUtils.currentLine=3276831;
 //BA.debugLineNum = 3276831;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"CustCity\"";
_str = _str+"<td>"+_cursor.GetString("CustCity")+"</td>";
RDebugUtils.currentLine=3276833;
 //BA.debugLineNum = 3276833;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("CustomerID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil'></i></div></a> "+" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("CustomerID"))+")\"></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=3276839;
 //BA.debugLineNum = 3276839;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=3276841;
 //BA.debugLineNum = 3276841;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
 }else {
RDebugUtils.currentLine=3276847;
 //BA.debugLineNum = 3276847;BA.debugLine="str = $\" <table id='datatable1' class='table d";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"			                                    <thead class=\"thead-dark\">\n"+"			                                        <tr>\n"+"			                                              <th class=\"wd-15p\">ID</th>\n"+"										                  <th class=\"wd-15p\">Customer Name</th>\n"+"														  <th class=\"wd-25p\">Action</th>\n"+"			                                        </tr>\n"+"			                                    </thead>\n"+"			                                    <tbody> ");
RDebugUtils.currentLine=3276857;
 //BA.debugLineNum = 3276857;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=3276858;
 //BA.debugLineNum = 3276858;BA.debugLine="Cursor = sql1.ExecQuery(\"select * from Customer";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from CustomersInformation");
RDebugUtils.currentLine=3276860;
 //BA.debugLineNum = 3276860;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=3276862;
 //BA.debugLineNum = 3276862;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=3276863;
 //BA.debugLineNum = 3276863;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"Customer";
_str = _str+"<td>"+_cursor.GetString("CustomerID")+"</td>";
RDebugUtils.currentLine=3276864;
 //BA.debugLineNum = 3276864;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"Customer";
_str = _str+"<td>"+_cursor.GetString("CustomerName")+"</td>";
RDebugUtils.currentLine=3276866;
 //BA.debugLineNum = 3276866;BA.debugLine="str = str & \"  <td style=' vertical-align: mid";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("CustomerID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil'></i></div></a> "+" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("CustomerID"))+")\"></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=3276872;
 //BA.debugLineNum = 3276872;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=3276874;
 //BA.debugLineNum = 3276874;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
 };
RDebugUtils.currentLine=3276881;
 //BA.debugLineNum = 3276881;BA.debugLine="divlist.SetHtml(str)";
__ref._divlist /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
 } 
       catch (Exception e34) {
			ba.setLastException(e34);RDebugUtils.currentLine=3276884;
 //BA.debugLineNum = 3276884;BA.debugLine="Log(LastException)";
__c.LogImpl("23276884",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=3276886;
 //BA.debugLineNum = 3276886;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.customersinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customersinformation";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Try";
try {RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"          responsive: true,\n"+"          language: {\n"+"            searchPlaceholder: 'Search...',\n"+"            sSearch: '',\n"+"            lengthMenu: '_MENU_ items/page',\n"+"          }\n"+"        });\n"+"\n"+"      \n"+"        // Select2\n"+"        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"+"\n"+"      });");
RDebugUtils.currentLine=3473430;
 //BA.debugLineNum = 3473430;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=3473433;
 //BA.debugLineNum = 3473433;BA.debugLine="Log(LastException)";
__c.LogImpl("23473433",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=3473435;
 //BA.debugLineNum = 3473435;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.customersinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="customersinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="ws.Session.SetAttribute(\"CustomerID\",0)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("CustomerID",(Object)(0));
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="CheckIsMobileBrowser";
__ref._checkismobilebrowser /*String*/ (null);
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="Load_Data";
__ref._load_data /*String*/ (null);
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.customersinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customersinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="End Sub";
return "";
}
}