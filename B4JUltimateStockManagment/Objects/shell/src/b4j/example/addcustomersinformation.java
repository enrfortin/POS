
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class addcustomersinformation {
    public static RemoteObject myClass;
	public addcustomersinformation() {
	}
    public static PCBA staticBA = new PCBA(null, addcustomersinformation.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ws = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket");
public static RemoteObject _txtname = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtaddress = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtcity = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtcountry = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtphone = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtemail = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _btnsave = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _btncancel = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _lblusernamemain = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _divmenu = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"btncancel",_ref.getField(false, "_btncancel"),"btnsave",_ref.getField(false, "_btnsave"),"divMenu",_ref.getField(false, "_divmenu"),"lblusernamemain",_ref.getField(false, "_lblusernamemain"),"sql1",_ref.getField(false, "_sql1"),"txtaddress",_ref.getField(false, "_txtaddress"),"txtcity",_ref.getField(false, "_txtcity"),"txtcountry",_ref.getField(false, "_txtcountry"),"txtemail",_ref.getField(false, "_txtemail"),"txtname",_ref.getField(false, "_txtname"),"txtphone",_ref.getField(false, "_txtphone"),"ws",_ref.getField(false, "_ws")};
}
}