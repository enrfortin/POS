
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class expensesinformation {
    public static RemoteObject myClass;
	public expensesinformation() {
	}
    public static PCBA staticBA = new PCBA(null, expensesinformation.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ws = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket");
public static RemoteObject _divlist = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _lblusernamemain = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _divmenu = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"divlist",_ref.getField(false, "_divlist"),"divMenu",_ref.getField(false, "_divmenu"),"lblusernamemain",_ref.getField(false, "_lblusernamemain"),"sql1",_ref.getField(false, "_sql1"),"ws",_ref.getField(false, "_ws")};
}
}