B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.95
@EndOfDesignText@
Sub Class_Globals
	Dim PID As Int
	Dim PName As String
	Dim PSellPrice As Double
	Dim PCostPrice As Double
	Dim PTax As Double
	Dim PQty As Int
	Dim PSubTotal As Double
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub
Public Sub Setup(tempPID As Int,tempPName As String,tempPSellPrice As Double,tempCostPrice As Double,tempTax As Int,tempQty As Int,tempSubTotal As Double)
	PID = tempPID
	PName = tempPName
	PSellPrice = tempPSellPrice
	PCostPrice = tempCostPrice
	PTax = tempTax
	PQty = tempQty
	PSubTotal = tempSubTotal
End Sub