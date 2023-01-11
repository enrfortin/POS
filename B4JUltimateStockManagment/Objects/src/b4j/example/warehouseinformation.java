package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class warehouseinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.warehouseinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.warehouseinformation.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public b4j.example.main _main = null;
public String  _class_globals(b4j.example.warehouseinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="warehouseinformation";
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="Private divlist As JQueryElement";
_divlist = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table(b4j.example.warehouseinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="warehouseinformation";
if (Debug.shouldDelegate(ba, "delete_button_table", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Private Sub Delete_button_table(params As Map)";
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="sql1.ExecNonQuery(\"delete from WarehouseInfo wher";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from WarehouseInfo where WarehouseID="+BA.ObjectToString(_params.Get((Object)("val"))));
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=5832711;
 //BA.debugLineNum = 5832711;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.reload(true)",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=5832713;
 //BA.debugLineNum = 5832713;BA.debugLine="End Sub";
return "";
}
public String  _edit_button_table(b4j.example.warehouseinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="warehouseinformation";
if (Debug.shouldDelegate(ba, "edit_button_table", false))
	 {return ((String) Debug.delegate(ba, "edit_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Private Sub Edit_button_table(params As Map)";
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="ws.Session.SetAttribute(\"CatID\",params.Get(\"val\")";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("CatID",_params.Get((Object)("val")));
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="ws.Eval(\"document.location.replace('AddWarehouseI";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('AddWarehouseInfo.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=5767174;
 //BA.debugLineNum = 5767174;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.warehouseinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="warehouseinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="End Sub";
return "";
}
public String  _load_data(b4j.example.warehouseinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="warehouseinformation";
if (Debug.shouldDelegate(ba, "load_data", false))
	 {return ((String) Debug.delegate(ba, "load_data", null));}
String _str = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cursor = null;
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub Load_Data";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Try";
try {RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Name</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=5701647;
 //BA.debugLineNum = 5701647;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=5701648;
 //BA.debugLineNum = 5701648;BA.debugLine="Cursor = sql1.ExecQuery(\"select * from Warehouse";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from WarehouseInfo");
RDebugUtils.currentLine=5701650;
 //BA.debugLineNum = 5701650;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=5701652;
 //BA.debugLineNum = 5701652;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=5701653;
 //BA.debugLineNum = 5701653;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"Warehouse";
_str = _str+"<td>"+_cursor.GetString("WarehouseID")+"</td>";
RDebugUtils.currentLine=5701654;
 //BA.debugLineNum = 5701654;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"Warehouse";
_str = _str+"<td>"+_cursor.GetString("WarehouseDesc")+"</td>";
RDebugUtils.currentLine=5701656;
 //BA.debugLineNum = 5701656;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("WarehouseID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "+" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("WarehouseID"))+")\"></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=5701662;
 //BA.debugLineNum = 5701662;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=5701664;
 //BA.debugLineNum = 5701664;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
RDebugUtils.currentLine=5701666;
 //BA.debugLineNum = 5701666;BA.debugLine="divlist.SetHtml(str)";
__ref._divlist /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=5701670;
 //BA.debugLineNum = 5701670;BA.debugLine="Log(LastException)";
__c.LogImpl("25701670",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=5701672;
 //BA.debugLineNum = 5701672;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.warehouseinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="warehouseinformation";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Try";
try {RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"          responsive: true,\n"+"          language: {\n"+"            searchPlaceholder: 'Search...',\n"+"            sSearch: '',\n"+"            lengthMenu: '_MENU_ items/page',\n"+"          }\n"+"        });\n"+"\n"+"      \n"+"        // Select2\n"+"        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"+"\n"+"      });");
RDebugUtils.currentLine=5898262;
 //BA.debugLineNum = 5898262;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=5898265;
 //BA.debugLineNum = 5898265;BA.debugLine="Log(LastException)";
__c.LogImpl("25898265",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=5898267;
 //BA.debugLineNum = 5898267;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.warehouseinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="warehouseinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="ws.Session.SetAttribute(\"CatID\",0)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("CatID",(Object)(0));
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=5570568;
 //BA.debugLineNum = 5570568;BA.debugLine="Load_Data";
__ref._load_data /*String*/ (null);
RDebugUtils.currentLine=5570570;
 //BA.debugLineNum = 5570570;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
RDebugUtils.currentLine=5570572;
 //BA.debugLineNum = 5570572;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.warehouseinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="warehouseinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="End Sub";
return "";
}
}