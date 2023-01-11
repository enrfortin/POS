package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class clstblsoldproducts extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.clstblsoldproducts", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.clstblsoldproducts.class).invoke(this, new Object[] {null});
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
public int _pid = 0;
public String _pname = "";
public double _psellprice = 0;
public double _pcostprice = 0;
public double _ptax = 0;
public int _pqty = 0;
public double _psubtotal = 0;
public b4j.example.main _main = null;
public String  _initialize(b4j.example.clstblsoldproducts __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clstblsoldproducts";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="End Sub";
return "";
}
public String  _setup(b4j.example.clstblsoldproducts __ref,int _temppid,String _temppname,double _temppsellprice,double _tempcostprice,int _temptax,int _tempqty,double _tempsubtotal) throws Exception{
__ref = this;
RDebugUtils.currentModule="clstblsoldproducts";
if (Debug.shouldDelegate(ba, "setup", false))
	 {return ((String) Debug.delegate(ba, "setup", new Object[] {_temppid,_temppname,_temppsellprice,_tempcostprice,_temptax,_tempqty,_tempsubtotal}));}
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Public Sub Setup(tempPID As Int,tempPName As Strin";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="PID = tempPID";
__ref._pid /*int*/  = _temppid;
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="PName = tempPName";
__ref._pname /*String*/  = _temppname;
RDebugUtils.currentLine=15728643;
 //BA.debugLineNum = 15728643;BA.debugLine="PSellPrice = tempPSellPrice";
__ref._psellprice /*double*/  = _temppsellprice;
RDebugUtils.currentLine=15728644;
 //BA.debugLineNum = 15728644;BA.debugLine="PCostPrice = tempCostPrice";
__ref._pcostprice /*double*/  = _tempcostprice;
RDebugUtils.currentLine=15728645;
 //BA.debugLineNum = 15728645;BA.debugLine="PTax = tempTax";
__ref._ptax /*double*/  = _temptax;
RDebugUtils.currentLine=15728646;
 //BA.debugLineNum = 15728646;BA.debugLine="PQty = tempQty";
__ref._pqty /*int*/  = _tempqty;
RDebugUtils.currentLine=15728647;
 //BA.debugLineNum = 15728647;BA.debugLine="PSubTotal = tempSubTotal";
__ref._psubtotal /*double*/  = _tempsubtotal;
RDebugUtils.currentLine=15728648;
 //BA.debugLineNum = 15728648;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.clstblsoldproducts __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clstblsoldproducts";
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="Dim PID As Int";
_pid = 0;
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="Dim PName As String";
_pname = "";
RDebugUtils.currentLine=15597571;
 //BA.debugLineNum = 15597571;BA.debugLine="Dim PSellPrice As Double";
_psellprice = 0;
RDebugUtils.currentLine=15597572;
 //BA.debugLineNum = 15597572;BA.debugLine="Dim PCostPrice As Double";
_pcostprice = 0;
RDebugUtils.currentLine=15597573;
 //BA.debugLineNum = 15597573;BA.debugLine="Dim PTax As Double";
_ptax = 0;
RDebugUtils.currentLine=15597574;
 //BA.debugLineNum = 15597574;BA.debugLine="Dim PQty As Int";
_pqty = 0;
RDebugUtils.currentLine=15597575;
 //BA.debugLineNum = 15597575;BA.debugLine="Dim PSubTotal As Double";
_psubtotal = 0;
RDebugUtils.currentLine=15597577;
 //BA.debugLineNum = 15597577;BA.debugLine="End Sub";
return "";
}
}