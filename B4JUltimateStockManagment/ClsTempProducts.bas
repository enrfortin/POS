B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.95
@EndOfDesignText@
Sub Class_Globals
	Dim ProductID As Int
	Dim ProductName As String
	Dim TaxID As Int
	Dim UnitPrice As Double
	Dim Qty As Int
	Dim Discount As Double
	Dim ProductCostPrice As Double
	Private sql1 As SQL
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub
Public Sub SetValues(tempProductID As Int,tempTaxID As Int,tempUnitPrice As Float,tempQty As Int,tempDiscount As Float)
	
	ProductID = tempProductID
	TaxID = tempTaxID
	UnitPrice = tempUnitPrice
	Qty = tempQty
	Discount = tempDiscount
	ProductCostPrice = Get_ProductCostPrice(tempProductID)
	ProductName = Get_ProductName(tempProductID)
	
End Sub
Private Sub Get_ProductName(tempProductID) As String
	Try
		sql1 = Main.pool.GetConnection
		
		Dim tempName As String= ""
		Dim rs As ResultSet
		rs = sql1.ExecQuery("select ProductName from ProductsInformation where ProductID="&tempProductID)
		Do While rs.NextRow
			tempName = rs.GetString("ProductName")
		Loop
		rs.Close
		
		If sql1.IsInitialized Then
			sql1.Close
		End If
		
		Return tempName
	Catch
		Log(LastException)
	End Try
End Sub
Private Sub Get_ProductCostPrice(tempProductID) As Double
	Try
		sql1 = Main.pool.GetConnection
		
		Dim tempName As Double = 0
		Dim rs As ResultSet
		rs = sql1.ExecQuery("select CostPrice from ProductsInformation where ProductID="&tempProductID)
		Do While rs.NextRow
			tempName = rs.GetString("CostPrice")
		Loop
		rs.Close
		
		If sql1.IsInitialized Then
			sql1.Close
		End If
		
		Return tempName
	Catch
		Log(LastException)
	End Try
End Sub