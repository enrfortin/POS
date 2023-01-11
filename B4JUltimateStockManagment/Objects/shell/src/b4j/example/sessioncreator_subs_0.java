package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class sessioncreator_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _filter(RemoteObject __ref,RemoteObject _req,RemoteObject _resp) throws Exception{
try {
		Debug.PushSubsStack("Filter (sessioncreator) ","sessioncreator",32,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("filter")) { return __ref.runUserSub(false, "sessioncreator","filter", __ref, _req, _resp);}
Debug.locals.put("req", _req);
Debug.locals.put("resp", _resp);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Filter(req As ServletRequest, resp As S";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="req.GetSession 'a new session will be created if";
Debug.ShouldStop(2048);
_req.runVoidMethod ("GetSession");
 BA.debugLineNum = 13;BA.debugLine="Return True";
Debug.ShouldStop(4096);
Debug.CheckDeviceExceptions();if (true) return sessioncreator.__c.getField(true,"True");
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (sessioncreator) ","sessioncreator",32,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "sessioncreator","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32);
 BA.debugLineNum = 8;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}