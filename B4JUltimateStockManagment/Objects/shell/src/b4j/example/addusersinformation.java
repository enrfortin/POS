
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class addusersinformation {
    public static RemoteObject myClass;
	public addusersinformation() {
	}
    public static PCBA staticBA = new PCBA(null, addusersinformation.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ws = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket");
public static RemoteObject _txtname = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtuseremail = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtuserpassword = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _btnsave = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _btncancel = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _lblusernamemain = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _divmenu = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"btncancel",_ref.getField(false, "_btncancel"),"btnsave",_ref.getField(false, "_btnsave"),"divMenu",_ref.getField(false, "_divmenu"),"lblusernamemain",_ref.getField(false, "_lblusernamemain"),"sql1",_ref.getField(false, "_sql1"),"txtname",_ref.getField(false, "_txtname"),"txtuseremail",_ref.getField(false, "_txtuseremail"),"txtuserpassword",_ref.getField(false, "_txtuserpassword"),"ws",_ref.getField(false, "_ws")};
}
}