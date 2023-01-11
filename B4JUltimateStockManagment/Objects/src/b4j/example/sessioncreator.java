package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class sessioncreator extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.sessioncreator", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.sessioncreator.class).invoke(this, new Object[] {null});
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
public b4j.example.main _main = null;
public String  _class_globals(b4j.example.sessioncreator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sessioncreator";
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="End Sub";
return "";
}
public boolean  _filter(b4j.example.sessioncreator __ref,anywheresoftware.b4j.object.JServlet.ServletRequestWrapper _req,anywheresoftware.b4j.object.JServlet.ServletResponseWrapper _resp) throws Exception{
__ref = this;
RDebugUtils.currentModule="sessioncreator";
if (Debug.shouldDelegate(ba, "filter", false))
	 {return ((Boolean) Debug.delegate(ba, "filter", new Object[] {_req,_resp}));}
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Public Sub Filter(req As ServletRequest, resp As S";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="req.GetSession 'a new session will be created if";
_req.GetSession();
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=20316163;
 //BA.debugLineNum = 20316163;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.sessioncreator __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="sessioncreator";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="End Sub";
return "";
}
}