
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clstempproducts {
    public static RemoteObject myClass;
	public clstempproducts() {
	}
    public static PCBA staticBA = new PCBA(null, clstempproducts.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _productid = RemoteObject.createImmutable(0);
public static RemoteObject _productname = RemoteObject.createImmutable("");
public static RemoteObject _taxid = RemoteObject.createImmutable(0);
public static RemoteObject _unitprice = RemoteObject.createImmutable(0);
public static RemoteObject _qty = RemoteObject.createImmutable(0);
public static RemoteObject _discount = RemoteObject.createImmutable(0);
public static RemoteObject _productcostprice = RemoteObject.createImmutable(0);
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Discount",_ref.getField(false, "_discount"),"ProductCostPrice",_ref.getField(false, "_productcostprice"),"ProductID",_ref.getField(false, "_productid"),"ProductName",_ref.getField(false, "_productname"),"Qty",_ref.getField(false, "_qty"),"sql1",_ref.getField(false, "_sql1"),"TaxID",_ref.getField(false, "_taxid"),"UnitPrice",_ref.getField(false, "_unitprice")};
}
}