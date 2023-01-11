
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clstblsoldproducts {
    public static RemoteObject myClass;
	public clstblsoldproducts() {
	}
    public static PCBA staticBA = new PCBA(null, clstblsoldproducts.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _pid = RemoteObject.createImmutable(0);
public static RemoteObject _pname = RemoteObject.createImmutable("");
public static RemoteObject _psellprice = RemoteObject.createImmutable(0);
public static RemoteObject _pcostprice = RemoteObject.createImmutable(0);
public static RemoteObject _ptax = RemoteObject.createImmutable(0);
public static RemoteObject _pqty = RemoteObject.createImmutable(0);
public static RemoteObject _psubtotal = RemoteObject.createImmutable(0);
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"PCostPrice",_ref.getField(false, "_pcostprice"),"PID",_ref.getField(false, "_pid"),"PName",_ref.getField(false, "_pname"),"PQty",_ref.getField(false, "_pqty"),"PSellPrice",_ref.getField(false, "_psellprice"),"PSubTotal",_ref.getField(false, "_psubtotal"),"PTax",_ref.getField(false, "_ptax")};
}
}