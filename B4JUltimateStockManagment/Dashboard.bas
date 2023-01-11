B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.95
@EndOfDesignText@
'WebSocket class
Sub Class_Globals
	Private ws As WebSocket
	Private divuserstrans,divtopcustomers As JQueryElement
	Private lblusernamemain As JQueryElement
	Private divMenu As JQueryElement
	Private sql1 As SQL
	
	Private lbltotalsales,lbltotaltax,lbltotalexpenses,lbltotalreturns As JQueryElement
		Dim dblTotalInv,dblTotalReturnInv As Float
	Private divtopsellingproducts As JQueryElement
	
End Sub

Public Sub Initialize
	
End Sub

Private Sub WebSocket_Connected (WebSocket1 As WebSocket)
	ws = WebSocket1
	Main.ValidateUsers(ws,lblusernamemain,divMenu)
	
	sql1 = Main.pool.GetConnection
	
	
	Create_Top_Dashboard
'	Load_UsersTransHistory
	Load_TopSellingProducts
End Sub

Private Sub WebSocket_Disconnected
	If sql1.IsInitialized Then
		sql1.Close
	End If
End Sub
Sub Create_Top_Dashboard
	Try
		
		Dim rs As ResultSet
		rs = sql1.ExecQuery("select ifnull(sum(InvTotal),0) as InvTotal from SalesInvoiceH")
		Do While rs.NextRow
			Dim fTotal As Float = rs.GetString("InvTotal")
			lbltotalsales.SetHtml(NumberFormat(fTotal,0,3) & " L")
			dblTotalInv = fTotal
		Loop
		rs.Close
		
			Dim rs As ResultSet
		rs = sql1.ExecQuery("select ifnull(sum(InvTotalTax),0) as InvTotalTax from SalesInvoiceH")
		Do While rs.NextRow
			Dim fTotal As Float = rs.GetString("InvTotalTax")
			lbltotaltax.SetHtml(NumberFormat(fTotal,0,3) & " L")
		Loop
		rs.Close
		
		
		Dim rs As ResultSet
		rs = sql1.ExecQuery("select ifnull(sum(ExpensesAmt),0) as ExpensesAmt from ExpensesInfo")
		Do While rs.NextRow
			Dim fTotal As Float = rs.GetString("ExpensesAmt")
			lbltotalexpenses.SetHtml(NumberFormat(fTotal,0,3) & " L")
		Loop
		rs.Close
		
		Dim rs As ResultSet
		rs=sql1.ExecQuery("select ifnull(sum(InvTotal),0) as totalreturns from ReturnSalesInvoiceH")
		Do While rs.NextRow
				Dim fTotal As Float = rs.GetString("totalreturns")
				lbltotalreturns.SetHtml(NumberFormat(fTotal,0,3) & " L")
			dblTotalReturnInv = fTotal
				
		Loop
		rs.Close
		
	Catch
		Log(LastException)
	End Try
End Sub

Sub Load_UsersTransHistory
	Try
		
		Dim rs As ResultSet
		rs = sql1.ExecQuery("SELECT UsersLogs.UserLogID, UsersLogs.UserID, UsersLogs.ActivityDesc, UsersLogs.ActivityDatetime, UsersInformation.UserFullName " _
					&" FROM            UsersLogs LEFT OUTER JOIN " _
                         &" UsersInformation ON UsersLogs.UserID = UsersInformation.UserID order by UsersLogs.UserLogID desc limit 5")
		Dim str As String = ""
		Do While rs.NextRow
			str = str & $"<tr>
                      
                      <td>
                        <a href="#" class="tx-inverse tx-14 tx-medium d-block">${rs.GetString("UserFullName")}</a>
                        <span class="tx-11 d-block">TRANSID: ${rs.GetString("UserLogID")}</span>
                      </td>
                      <td class="tx-12">
                        <span class="square-8 bg-success mg-r-5 rounded-circle"></span> ${rs.GetString("ActivityDesc")}
                      </td>
                      <td>${rs.GetString("ActivityDatetime")}</td>
                    </tr>"$
		Loop
		rs.Close
		
		divuserstrans.SetHtml(str)
		
	Catch
		Log(LastException)
	End Try
End Sub
 
 
Sub Load_TopSellingProducts
	Try
		
		Dim rs As ResultSet
		rs = sql1.ExecQuery($"SELECT        SUM(IFNULL(PurchaseInvoiceD.ProductQty, 0)) AS ProductQty, SUM(IFNULL(PurchaseInvoiceD.ProductQty, 0) * IFNULL(PurchaseInvoiceD.ProductSellPrice, 0)) AS GrandTotal, 
                         ProductsInformation.ProductName
FROM            PurchaseInvoiceD LEFT OUTER JOIN
                         ProductsInformation ON PurchaseInvoiceD.ProductID = ProductsInformation.ProductID
GROUP BY ProductsInformation.ProductName
order by ProductQty desc"$)

		Dim str As String = ""
		str = $" <table id="vgt-table" class="order-table vgt-table ">
                     <colgroup>
                        <col id="col-0">
                        <col id="col-1">
                        <col id="col-2">
                     </colgroup>
                     <thead>
                        <tr>
                           <!----> <!----> 
                           <th scope="col" aria-sort="descending" aria-controls="col-0" class="vgt-left-align text-left" style="min-width: auto; width: auto;">
                              <span>Producto</span> <!---->
                           </th>
                           <th scope="col" aria-sort="descending" aria-controls="col-1" class="vgt-left-align text-left" style="min-width: auto; width: auto;">
                              <span>Cantidad</span> <!---->
                           </th>
                           <th scope="col" aria-sort="descending" aria-controls="col-2" class="vgt-left-align text-left" style="min-width: auto; width: auto;">
                              <span>Total</span> <!---->
                           </th>
                        </tr>
                        <!---->
                     </thead>
                     <tbody>"$
                 
		Do While rs.NextRow
			str = str & $" <!----> 
                        <tr class=" text-left">
                           <!----> <!----> 
                           <td class="vgt-left-align text-left"><span>
                              ${rs.GetString("ProductName")}
                              </span>
                           </td>
                           <td class="vgt-left-align text-left">
                              <div><span> ${rs.GetString("ProductQty")} pc</span></div>
                           </td>
                           <td class="vgt-left-align text-left">
                              <div><span> ${rs.GetString("GrandTotal")} L</span></div>
                           </td>
                        </tr>"$
		Loop
		rs.Close
		
		str = str & $"  
                     </tbody>
                     <!---->
                  </table>"$
		divtopsellingproducts.SetHtml(str)
		
	Catch
		Log(LastException)
	End Try
End Sub
 
 