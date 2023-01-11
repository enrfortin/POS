
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class addreturnsalesinfo {
    public static RemoteObject myClass;
	public addreturnsalesinfo() {
	}
    public static PCBA staticBA = new PCBA(null, addreturnsalesinfo.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ws = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket");
public static RemoteObject _txtinvdate = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _cmbcustomer = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _cmbuser = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtinvnote = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _cmbproduct = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txttax = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtunitprice = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtqty = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtdiscount = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _btnaddproduct = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _btnsave = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _btncancel = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _divproducts = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _cmbpaymenttype = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _tempproductstable = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _templistcmbcustomer = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _templistpaymenttype = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lblusernamemain = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _divmenu = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"btnaddproduct",_ref.getField(false, "_btnaddproduct"),"btncancel",_ref.getField(false, "_btncancel"),"btnsave",_ref.getField(false, "_btnsave"),"cmbcustomer",_ref.getField(false, "_cmbcustomer"),"cmbpaymenttype",_ref.getField(false, "_cmbpaymenttype"),"cmbproduct",_ref.getField(false, "_cmbproduct"),"cmbuser",_ref.getField(false, "_cmbuser"),"divMenu",_ref.getField(false, "_divmenu"),"divproducts",_ref.getField(false, "_divproducts"),"lblusernamemain",_ref.getField(false, "_lblusernamemain"),"sql1",_ref.getField(false, "_sql1"),"templistcmbcustomer",_ref.getField(false, "_templistcmbcustomer"),"templistpaymenttype",_ref.getField(false, "_templistpaymenttype"),"TempProductsTable",_ref.getField(false, "_tempproductstable"),"txtdiscount",_ref.getField(false, "_txtdiscount"),"txtinvdate",_ref.getField(false, "_txtinvdate"),"txtinvnote",_ref.getField(false, "_txtinvnote"),"txtqty",_ref.getField(false, "_txtqty"),"txttax",_ref.getField(false, "_txttax"),"txtunitprice",_ref.getField(false, "_txtunitprice"),"ws",_ref.getField(false, "_ws")};
}
}