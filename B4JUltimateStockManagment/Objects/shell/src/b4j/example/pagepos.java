
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class pagepos {
    public static RemoteObject myClass;
	public pagepos() {
	}
    public static PCBA staticBA = new PCBA(null, pagepos.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ws = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
public static RemoteObject _cmbcategory = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _divproducts = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _tblsoldproducts = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _lblgrandtotal = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txttax = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtsearchproducts = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtdiscount = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _lstsoldproducts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _dbldiscount = RemoteObject.createImmutable(0);
public static RemoteObject _dblshipping = RemoteObject.createImmutable(0);
public static RemoteObject _cmbcustomer = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _cmbcopaymenttype = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtcustname = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtcustemail = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtcustphone = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtcustcountry = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtcustcity = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtcustaddress = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtcustrtn = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _lblcototalproducts = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _lblcototaltax = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _lblcototaldiscount = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _lblcototalshipping = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _lblcograndtotal = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _nombre_cliente = RemoteObject.createImmutable("");
public static RemoteObject _globaldblgrandtotal = RemoteObject.createImmutable(0);
public static RemoteObject _globaldbltotaldiscount = RemoteObject.createImmutable(0);
public static RemoteObject _globaldbltotaltax = RemoteObject.createImmutable(0);
public static RemoteObject _txtcopaidamount = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtconotes = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _divinvprint = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"cmbcategory",_ref.getField(false, "_cmbcategory"),"cmbcopaymenttype",_ref.getField(false, "_cmbcopaymenttype"),"cmbcustomer",_ref.getField(false, "_cmbcustomer"),"dbldiscount",_ref.getField(false, "_dbldiscount"),"dblshipping",_ref.getField(false, "_dblshipping"),"divinvprint",_ref.getField(false, "_divinvprint"),"divproducts",_ref.getField(false, "_divproducts"),"GlobaldblGrandTotal",_ref.getField(false, "_globaldblgrandtotal"),"GlobaldblTotaldiscount",_ref.getField(false, "_globaldbltotaldiscount"),"GlobaldblTotalTax",_ref.getField(false, "_globaldbltotaltax"),"lblcograndtotal",_ref.getField(false, "_lblcograndtotal"),"lblcototaldiscount",_ref.getField(false, "_lblcototaldiscount"),"lblcototalproducts",_ref.getField(false, "_lblcototalproducts"),"lblcototalshipping",_ref.getField(false, "_lblcototalshipping"),"lblcototaltax",_ref.getField(false, "_lblcototaltax"),"lblgrandtotal",_ref.getField(false, "_lblgrandtotal"),"lstSoldProducts",_ref.getField(false, "_lstsoldproducts"),"nombre_cliente",_ref.getField(false, "_nombre_cliente"),"sql1",_ref.getField(false, "_sql1"),"tblsoldproducts",_ref.getField(false, "_tblsoldproducts"),"txtconotes",_ref.getField(false, "_txtconotes"),"txtcopaidamount",_ref.getField(false, "_txtcopaidamount"),"txtcustaddress",_ref.getField(false, "_txtcustaddress"),"txtcustcity",_ref.getField(false, "_txtcustcity"),"txtcustcountry",_ref.getField(false, "_txtcustcountry"),"txtcustemail",_ref.getField(false, "_txtcustemail"),"txtcustname",_ref.getField(false, "_txtcustname"),"txtcustphone",_ref.getField(false, "_txtcustphone"),"txtcustrtn",_ref.getField(false, "_txtcustrtn"),"txtdiscount",_ref.getField(false, "_txtdiscount"),"txtsearchproducts",_ref.getField(false, "_txtsearchproducts"),"txttax",_ref.getField(false, "_txttax"),"ws",_ref.getField(false, "_ws")};
}
}