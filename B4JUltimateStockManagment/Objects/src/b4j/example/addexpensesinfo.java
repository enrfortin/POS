package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class addexpensesinfo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.addexpensesinfo", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.addexpensesinfo.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblusernamemain = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _divmenu = null;
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtinvdate = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtamt = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtnotes = null;
public b4j.example.main _main = null;
public String  _btncancel_click(b4j.example.addexpensesinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addexpensesinfo";
if (Debug.shouldDelegate(ba, "btncancel_click", false))
	 {return ((String) Debug.delegate(ba, "btncancel_click", new Object[] {_params}));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub btncancel_Click (Params As Map)";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="ws.Eval(\"document.location.replace('ExpensesInfo";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('ExpensesInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="End Sub";
return "";
}
public String  _btnsave_click(b4j.example.addexpensesinfo __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="addexpensesinfo";
if (Debug.shouldDelegate(ba, "btnsave_click", false))
	 {return ((String) Debug.delegate(ba, "btnsave_click", new Object[] {_params}));}
int _catid = 0;
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Sub btnsave_Click (Params As Map)";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="Try";
try {RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="If txtinvdate.GetVal.Value = \"\" Or txtamt.GetVal";
if ((__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)("")) || (__ref._txtamt /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()).equals((Object)(""))) { 
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7602183;
 //BA.debugLineNum = 7602183;BA.debugLine="Dim CatID As Int = ws.Session.GetAttribute(\"CatI";
_catid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("CatID")));
RDebugUtils.currentLine=7602184;
 //BA.debugLineNum = 7602184;BA.debugLine="If CatID > 0 Then";
if (_catid>0) { 
RDebugUtils.currentLine=7602185;
 //BA.debugLineNum = 7602185;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=7602186;
 //BA.debugLineNum = 7602186;BA.debugLine="sql1.ExecNonQuery2(\"Update ExpensesInfo set Ex";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("Update ExpensesInfo set ExpensesAmt=? , ExpensesDate=? , ExpensesNotes=?  where ExpensesID=? ",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtamt /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtnotes /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),(Object)(_catid)}));
RDebugUtils.currentLine=7602188;
 //BA.debugLineNum = 7602188;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 }else {
RDebugUtils.currentLine=7602191;
 //BA.debugLineNum = 7602191;BA.debugLine="sql1.BeginTransaction";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=7602192;
 //BA.debugLineNum = 7602192;BA.debugLine="sql1.ExecNonQuery2(\"insert into ExpensesInfo (";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("insert into ExpensesInfo (ExpensesAmt,ExpensesDate,ExpensesNotes) values (?,?,?) ",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._txtamt /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue(),__ref._txtnotes /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue()}));
RDebugUtils.currentLine=7602194;
 //BA.debugLineNum = 7602194;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 };
RDebugUtils.currentLine=7602198;
 //BA.debugLineNum = 7602198;BA.debugLine="Main.Insert_UsersLogs(ws,\"Expenses Information\")";
_main._insert_userslogs /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,"Expenses Information");
RDebugUtils.currentLine=7602200;
 //BA.debugLineNum = 7602200;BA.debugLine="ws.Eval(\"document.location.replace('ExpensesInfo";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("document.location.replace('ExpensesInformation.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=7602203;
 //BA.debugLineNum = 7602203;BA.debugLine="Log(LastException)";
__c.LogImpl("27602203",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=7602205;
 //BA.debugLineNum = 7602205;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.addexpensesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addexpensesinfo";
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="Private divMenu As JQueryElement";
_divmenu = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=7340038;
 //BA.debugLineNum = 7340038;BA.debugLine="Private txtinvdate,txtamt,txtnotes As JQueryEleme";
_txtinvdate = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtamt = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtnotes = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=7340041;
 //BA.debugLineNum = 7340041;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.addexpensesinfo __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="addexpensesinfo";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="End Sub";
return "";
}
public String  _load_data_byid(b4j.example.addexpensesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addexpensesinfo";
if (Debug.shouldDelegate(ba, "load_data_byid", false))
	 {return ((String) Debug.delegate(ba, "load_data_byid", null));}
int _catid = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub Load_Data_ByID";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Try";
try {RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="Dim CatID As Int = ws.Session.GetAttribute(\"CatI";
_catid = (int)(BA.ObjectToNumber(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSession().GetAttribute("CatID")));
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="If CatID > 0 Then";
if (_catid>0) { 
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=7733255;
 //BA.debugLineNum = 7733255;BA.debugLine="rs = sql1.ExecQuery(\"select * from  ExpensesInf";
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from  ExpensesInfo where ExpensesID="+BA.NumberToString(_catid));
RDebugUtils.currentLine=7733256;
 //BA.debugLineNum = 7733256;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=7733258;
 //BA.debugLineNum = 7733258;BA.debugLine="txtamt.SetVal(rs.GetString(\"ExpensesAmt\"))";
__ref._txtamt /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("ExpensesAmt")));
RDebugUtils.currentLine=7733259;
 //BA.debugLineNum = 7733259;BA.debugLine="txtinvdate.SetVal(rs.GetString(\"ExpensesDate\")";
__ref._txtinvdate /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("ExpensesDate")));
RDebugUtils.currentLine=7733260;
 //BA.debugLineNum = 7733260;BA.debugLine="txtnotes.SetVal(rs.GetString(\"ExpensesNotes\"))";
__ref._txtnotes /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetVal((Object)(_rs.GetString("ExpensesNotes")));
 }
;
RDebugUtils.currentLine=7733263;
 //BA.debugLineNum = 7733263;BA.debugLine="rs.Close";
_rs.Close();
 };
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=7733268;
 //BA.debugLineNum = 7733268;BA.debugLine="Log(LastException)";
__c.LogImpl("27733268",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=7733270;
 //BA.debugLineNum = 7733270;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.addexpensesinfo __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="addexpensesinfo";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="Main.ValidateUsers(ws,lblusernamemain,divMenu)";
_main._validateusers /*String*/ (__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ ,__ref._lblusernamemain /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ ,__ref._divmenu /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ );
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="sql1 = Main.pool.GetConnection";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/  = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="Load_Data_ByID";
__ref._load_data_byid /*String*/ (null);
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.addexpensesinfo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addexpensesinfo";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="If sql1.IsInitialized Then";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="End Sub";
return "";
}
}