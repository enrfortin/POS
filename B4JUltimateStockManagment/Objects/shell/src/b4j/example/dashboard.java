
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class dashboard {
    public static RemoteObject myClass;
	public dashboard() {
	}
    public static PCBA staticBA = new PCBA(null, dashboard.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ws = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket");
public static RemoteObject _divuserstrans = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _divtopcustomers = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _lblusernamemain = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _divmenu = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
public static RemoteObject _lbltotalsales = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _lbltotaltax = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _lbltotalexpenses = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _lbltotalreturns = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _dbltotalinv = RemoteObject.createImmutable(0f);
public static RemoteObject _dbltotalreturninv = RemoteObject.createImmutable(0f);
public static RemoteObject _divtopsellingproducts = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"dblTotalInv",_ref.getField(false, "_dbltotalinv"),"dblTotalReturnInv",_ref.getField(false, "_dbltotalreturninv"),"divMenu",_ref.getField(false, "_divmenu"),"divtopcustomers",_ref.getField(false, "_divtopcustomers"),"divtopsellingproducts",_ref.getField(false, "_divtopsellingproducts"),"divuserstrans",_ref.getField(false, "_divuserstrans"),"lbltotalexpenses",_ref.getField(false, "_lbltotalexpenses"),"lbltotalreturns",_ref.getField(false, "_lbltotalreturns"),"lbltotalsales",_ref.getField(false, "_lbltotalsales"),"lbltotaltax",_ref.getField(false, "_lbltotaltax"),"lblusernamemain",_ref.getField(false, "_lblusernamemain"),"sql1",_ref.getField(false, "_sql1"),"ws",_ref.getField(false, "_ws")};
}
}