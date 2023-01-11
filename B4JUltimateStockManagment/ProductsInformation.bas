B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.95
@EndOfDesignText@
'WebSocket class
Sub Class_Globals
	Private ws As WebSocket
	Private divlist As JQueryElement
	Private lblusernamemain As JQueryElement
	Private divMenu As JQueryElement
	
	'--- check If mobile device
	Private IntIsMobileDev As Int
	Private divismobiledev As JQueryElement
	Private sql1 As SQL
	
End Sub

Public Sub Initialize
	
End Sub

Private Sub WebSocket_Connected (WebSocket1 As WebSocket)
	ws = WebSocket1
	Main.ValidateUsers(ws,lblusernamemain,divMenu)
	ws.Session.SetAttribute("ProductID",0)
	sql1 = Main.pool.GetConnection
	
	CheckIsMobileBrowser
	
	Load_Data
	Load_Datatable_Controls
End Sub

Private Sub WebSocket_Disconnected
	If sql1.IsInitialized Then
		sql1.Close
	End If
End Sub
Sub Load_Data
	Try
		
			Dim str As String
			If IntIsMobileDev = 0 Then
				
				
			str = $" <table id='datatable1' class='table display responsive nowrap'>
		                                    <thead class="thead-dark">
		                                        <tr>
		                                              <th class="wd-15p">ID</th>
									                  <th class="wd-15p">Producto</th>
									                  <th class="wd-20p">Precio de Costo</th>
									                  <th class="wd-15p">Pricio de Venta</th>
									                  <th class="wd-25p">Categoria</th>
									                  <th class="wd-25p">Cantidad</th>
													  <th class="wd-25p">Accion</th>
		                                        </tr>
		                                    </thead>
		                                    <tbody> "$
			
			
		Dim Cursor As ResultSet
		Cursor = sql1.ExecQuery($"SELECT        ProductsInformation.ProductID, ProductsInformation.ProductName, ProductsInformation.ProductPrice, ProductsInformation.ProductImage, ProductsInformation.CatID, ProductsInformation.CostPrice, 
                         ProductsInformation.ProductBarcode, ProductsInformation.ProductTax, CatInfo.CatDesc
FROM            ProductsInformation LEFT OUTER JOIN
                         CatInfo ON ProductsInformation.CatID = CatInfo.CatID"$)
		
		Do While Cursor.NextRow
			
			str = str & "  <tr> "
			str = str & "<td>"& Cursor.GetString("ProductID") &"</td>"
			str = str & "<td>"& Cursor.GetString("ProductName") &"</td>"
			str = str & "<td>"& Cursor.GetString("CostPrice") &"</td>"
			str = str & "<td>"& Cursor.GetString("ProductPrice") &"</td>"
			str = str & "<td>"& Cursor.GetString("CatDesc") &"</td>"
			str = str & "<td>"& Load_AvlQty(Cursor.GetString("ProductID")) &"</td>"
			
			str = str & "  <td style=' vertical-align: middle !important; white-space: nowrap !important; '> " _
			&" <a href='javascript:void(0);' onclick=""editTbl("& Cursor.GetInt("ProductID") &")"" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> " _
			&" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=""deleteTbl("& Cursor.GetInt("ProductID") &")""></i></div></a> " _
			&" </td> </tr>"
			
		Loop
		Cursor.Close
		
		str= str & " </tbody> </table>"
	
			Else
					
					str = $" <table id='datatable1' class='table display responsive nowrap'>
		                                    <thead class="thead-dark">
		                                        <tr>
		                                              <th class="wd-15p">ID</th>
									                  <th class="wd-15p">Producto</th>
													  <th class="wd-25p">Accion</th>
		                                        </tr>
		                                    </thead>
		                                    <tbody> "$
			
			
		Dim Cursor As ResultSet
		Cursor = sql1.ExecQuery("SELECT        ProductsInformation.ProductID, ProductsInformation.ProductName, ProductsInformation.CostPrice, ProductsInformation.UnitPrice, ProductsInformation.TypeID, ProductsInformation.MeasureID,  " _
                   &"       ProductTypes.TypeDesc, UnitofMeasureInformation.UoMDesc " _
				&" FROM            ProductsInformation LEFT OUTER JOIN " _
                         &" UnitofMeasureInformation ON ProductsInformation.MeasureID = UnitofMeasureInformation.UnitOfMeasureID LEFT OUTER JOIN " _
                         &" ProductTypes ON ProductsInformation.TypeID = ProductTypes.ProductTypeID")
		
		Do While Cursor.NextRow
			
			str = str & "  <tr> "
			str = str & "<td>"& Cursor.GetString("ProductID") &"</td>"
			str = str & "<td>"& Cursor.GetString("ProductName") &"</td>"
			
			str = str & "  <td style=' vertical-align: middle !important; white-space: nowrap !important;display:block !important; '> " _
			&" <a href='javascript:void(0);' onclick=""editTbl("& Cursor.GetInt("ProductID") &")"" class='btn btn-primary btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-pencil' ></i></div></a> " _
			&" <a href='javascript:void(0);' class='btn btn-danger btn-icon mg-r-5 mg-b-10'><div><i class='fa fa-trash' onclick=""deleteTbl("& Cursor.GetInt("ProductID") &")""></i></div></a> " _
			&" </td> </tr>"
			
		Loop
		Cursor.Close
		
		str= str & " </tbody> </table>"
					
					
			End If
			
		divlist.SetHtml(str)
		
		
	Catch
		Log(LastException)
	End Try
End Sub

Sub Load_AvlQty(ProductID As Int) As Int
	Try
		Dim avlqty As Int = 0
		
		Dim rs As ResultSet
		rs = sql1.ExecQuery2($"select ifnull(sum(ProductQty),0) as totalqty from PurchaseInvoiceD where ProductID=?"$, Array As Object(ProductID))
		Do While rs.NextRow
			avlqty = avlqty + rs.GetInt("totalqty")
		Loop
		rs.Close
		
		Dim rs As ResultSet
		rs = sql1.ExecQuery2($"select ifnull(sum(ProductQty),0) as totalqty from SalesInvoiceD where ProductID=?"$, Array As Object(ProductID))
		Do While rs.NextRow
			avlqty = avlqty - rs.GetInt("totalqty")
		Loop
		rs.Close
		
		Dim rs As ResultSet
		rs = sql1.ExecQuery2($"select ifnull(sum(ProductQty),0) as totalqty from ReturnSalesInvoiceD where ProductID=?"$, Array As Object(ProductID))
		Do While rs.NextRow
			avlqty = avlqty + rs.GetInt("totalqty")
		Loop
		rs.Close
		
		Dim rs As ResultSet
		rs = sql1.ExecQuery2($"select ifnull(sum(ProductQty),0) as totalqty from ReturnPurchaseInvoiceD where ProductID=?"$, Array As Object(ProductID))
		Do While rs.NextRow
			avlqty = avlqty - rs.GetInt("totalqty")
		Loop
		rs.Close
		
		
		Return avlqty
	Catch
		Log(LastException)
	End Try
End Sub

Private Sub Edit_button_table(params As Map)
	Log(params.Get("val"))
		
	ws.Session.SetAttribute("ProductID",params.Get("val"))
	
	ws.Eval("document.location.replace('AddProductsInfo.html')",Null)
		
End Sub

Private Sub Delete_button_table(params As Map)
	Log(params.Get("val"))
		
	sql1.BeginTransaction
	
	sql1.ExecNonQuery("delete from ProductsInformation where ProductID="&params.Get("val"))
	sql1.TransactionSuccessful	
 
	ws.Eval("document.location.reload(true)",Null)
	
End Sub

Sub Load_Datatable_Controls
	Try
		
		Dim str As String
		str = $" $(function(){
        'use strict';

        $('#datatable1').DataTable({
          responsive: true,
          language: {
            searchPlaceholder: 'Search...',
            sSearch: '',
            lengthMenu: '_MENU_ items/page',
          }
        });

      
        // Select2
        $('.dataTables_length select').select2({ minimumResultsForSearch: Infinity });

      });"$
	  
		ws.Eval(str,Null)
	  
	Catch
		Log(LastException)
	End Try
End Sub


Sub CheckIsMobileBrowser
	Try
		Dim str As String
		str = $"	
if(/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)){
	 
	document.getElementById("divismobiledev").innerHTML = "1";
	
}else{
	 document.getElementById("divismobiledev").innerHTML = "0";
}
		"$
		
		ws.Eval(str,Null)

		IntIsMobileDev = divismobiledev.GetHtml.Value
		Log(IntIsMobileDev)
	Catch
		Log(LastException)
	End Try
End Sub

