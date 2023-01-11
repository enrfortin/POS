package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class catsinformation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.catsinformation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.catsinformation.class).invoke(this, new Object[] {null});
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
public String  _class_globals(b4j.example.catsinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="catsinformation";
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="Private divlist As JQueryElement";
_divlist = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=15073285;
 //BA.debugLineNum = 15073285;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=15073287;
 //BA.debugLineNum = 15073287;BA.debugLine="End Sub";
return "";
}
public String  _delete_button_table(b4j.example.catsinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="catsinformation";
if (Debug.shouldDelegate(ba, "delete_button_table", false))
	 {return ((String) Debug.delegate(ba, "delete_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Private Sub Delete_button_table(params As Map)";
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=15466500;
 //BA.debugLineNum = 15466500;BA.debugLine="sql1.ExecNonQuery(\"delete from CatInfo where CatI";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from CatInfo where CatID="+BA.ObjectToString(_params.Get((Object)("val"))));
RDebugUtils.currentLine=15466501;
 //BA.debugLineNum = 15466501;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=15466503;
 //BA.debugLineNum = 15466503;BA.debugLine="ws.Eval(\"document.location.reload(true)\",Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.reload(true)",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=15466505;
 //BA.debugLineNum = 15466505;BA.debugLine="End Sub";
return "";
}
public String  _edit_button_table(b4j.example.catsinformation __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="catsinformation";
if (Debug.shouldDelegate(ba, "edit_button_table", false))
	 {return ((String) Debug.delegate(ba, "edit_button_table", new Object[] {_params}));}
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Private Sub Edit_button_table(params As Map)";
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="ws.Session.SetAttribute(\"CatID\",params.Get(\"val\")";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("CatID",_params.Get((Object)("val")));
RDebugUtils.currentLine=15400964;
 //BA.debugLineNum = 15400964;BA.debugLine="ws.Eval(\"document.location.replace('AddCatInfo.ht";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('AddCatInfo.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=15400966;
 //BA.debugLineNum = 15400966;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.catsinformation __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="catsinformation";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="End Sub";
return "";
}
public String  _load_data(b4j.example.catsinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="catsinformation";
if (Debug.shouldDelegate(ba, "load_data", false))
	 {return ((String) Debug.delegate(ba, "load_data", null));}
String _str = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cursor = null;
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Sub Load_Data";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="Try";
try {RDebugUtils.currentLine=15335427;
 //BA.debugLineNum = 15335427;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="str = $\" <table id='datatable1' class='table di";
_str = (" <table id='datatable1' class='table display responsive nowrap'>\n"+"		                                    <thead class=\"thead-dark\">\n"+"		                                        <tr>\n"+"		                                              <th class=\"wd-15p\">ID</th>\n"+"									                  <th class=\"wd-15p\">Name</th>\n"+"													  <th class=\"wd-25p\">Action</th>\n"+"		                                        </tr>\n"+"		                                    </thead>\n"+"		                                    <tbody> ");
RDebugUtils.currentLine=15335439;
 //BA.debugLineNum = 15335439;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=15335440;
 //BA.debugLineNum = 15335440;BA.debugLine="Cursor = sql1.ExecQuery(\"select * from CatInfo\")";
_cursor = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from CatInfo");
RDebugUtils.currentLine=15335442;
 //BA.debugLineNum = 15335442;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=15335444;
 //BA.debugLineNum = 15335444;BA.debugLine="str = str & \"  <tr> \"";
_str = _str+"  <tr> ";
RDebugUtils.currentLine=15335445;
 //BA.debugLineNum = 15335445;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"CatID\") &";
_str = _str+"<td>"+_cursor.GetString("CatID")+"</td>";
RDebugUtils.currentLine=15335446;
 //BA.debugLineNum = 15335446;BA.debugLine="str = str & \"<td>\"& Cursor.GetString(\"CatDesc\")";
_str = _str+"<td>"+_cursor.GetString("CatDesc")+"</td>";
RDebugUtils.currentLine=15335448;
 //BA.debugLineNum = 15335448;BA.debugLine="str = str & \"  <td style=' vertical-align: midd";
_str = _str+"  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> "+" <a href='javascript:void(0);' onclick=\"editTbl("+BA.NumberToString(_cursor.GetInt("CatID"))+")\" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> "+" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=\"deleteTbl("+BA.NumberToString(_cursor.GetInt("CatID"))+")\"></i></div></a> "+" </td> </tr>";
 }
;
RDebugUtils.currentLine=15335454;
 //BA.debugLineNum = 15335454;BA.debugLine="Cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=15335456;
 //BA.debugLineNum = 15335456;BA.debugLine="str= str & \" </tbody> </table>\"";
_str = _str+" </tbody> </table>";
RDebugUtils.currentLine=15335458;
 //BA.debugLineNum = 15335458;BA.debugLine="divlist.SetHtml(str)";
__ref._divlist /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(_str);
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=15335462;
 //BA.debugLineNum = 15335462;BA.debugLine="Log(LastException)";
__c.LogImpl("215335462",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=15335464;
 //BA.debugLineNum = 15335464;BA.debugLine="End Sub";
return "";
}
public String  _load_datatable_controls(b4j.example.catsinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="catsinformation";
if (Debug.shouldDelegate(ba, "load_datatable_controls", false))
	 {return ((String) Debug.delegate(ba, "load_datatable_controls", null));}
String _str = "";
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Sub Load_Datatable_Controls";
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="Try";
try {RDebugUtils.currentLine=15532035;
 //BA.debugLineNum = 15532035;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="str = $\" $(function(){         'use strict';";
_str = (" $(function(){\n"+"        'use strict';\n"+"\n"+"        $('#datatable1').DataTable({\n"+"          responsive: true,\n"+"          language: {\n"+"            searchPlaceholder: 'Search...',\n"+"            sSearch: '',\n"+"            lengthMenu: '_MENU_ items/page',\n"+"          }\n"+"        });\n"+"\n"+"      \n"+"        // Select2\n"+"        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });\n"+"\n"+"      });");
RDebugUtils.currentLine=15532054;
 //BA.debugLineNum = 15532054;BA.debugLine="ws.Eval(str,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(_str,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=15532057;
 //BA.debugLineNum = 15532057;BA.debugLine="Log(LastException)";
__c.LogImpl("215532057",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=15532059;
 //BA.debugLineNum = 15532059;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.catsinformation __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="catsinformation";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="ws.Session.SetAttribute(\"CatID\",0)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().SetAttribute("CatID",(Object)(0));
RDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=15204360;
 //BA.debugLineNum = 15204360;BA.debugLine="Load_Data";
__ref._load_data /*String*/ (null);
RDebugUtils.currentLine=15204362;
 //BA.debugLineNum = 15204362;BA.debugLine="Load_Datatable_Controls";
__ref._load_datatable_controls /*String*/ (null);
RDebugUtils.currentLine=15204364;
 //BA.debugLineNum = 15204364;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.catsinformation __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="catsinformation";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="End Sub";
return "";
}
}