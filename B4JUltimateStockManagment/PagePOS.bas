B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.95
@EndOfDesignText@
'WebSocket class
Sub Class_Globals
	Private ws As WebSocket
	Private sql1 As SQL
	Private cmbcategory,divproducts As JQueryElement
	Private tblsoldproducts,lblgrandtotal,txttax,txtsearchproducts,txtdiscount As JQueryElement
	Private lstSoldProducts As List
	Private dbldiscount,dblshipping As Double
	Private cmbcustomer As JQueryElement
	Private cmbcopaymenttype As JQueryElement
	
	
	Private txtcustname,txtcustemail,txtcustphone,txtcustcountry,txtcustcity,txtcustaddress,txtcustrtn As JQueryElement
	
	Private lblcototalproducts,lblcototaltax,lblcototaldiscount,lblcototalshipping,lblcograndtotal As JQueryElement
	
	Private nombre_cliente As String
	Private GlobaldblGrandTotal,GlobaldblTotaldiscount,GlobaldblTotalTax As Double
	
	Private txtcopaidamount,txtconotes,divinvprint As JQueryElement
End Sub


Public Sub Initialize
	
End Sub

Private Sub WebSocket_Connected (WebSocket1 As WebSocket)
	ws = WebSocket1
	sql1 = Main.pool.GetConnection
	lstSoldProducts.Initialize
	Reset_Tbl
	
	GlobaldblGrandTotal = 0
	GlobaldblTotaldiscount = 0
	GlobaldblTotalTax = 0
	dbldiscount = 0
	
	Load_Categories
	Load_Products
	Load_Customers
	Load_PaymentTypes
	
End Sub

Private Sub WebSocket_Disconnected
	If sql1.IsInitialized Then
		sql1.Close
	End If
End Sub

Sub Load_Categories
	Try
		Dim sb As StringBuilder
		sb.Initialize
		Dim rs As ResultSet
		rs = sql1.ExecQuery("select * from CatInfo")
		
		Do While rs.NextRow
			Dim val As String = rs.GetInt("CatID")
			sb.Append("<option value='").Append(val).Append("'>").Append(rs.GetString("CatDesc")).Append("</option>")
		Loop
		rs.Close
		cmbcategory.SetHtml(sb.ToString)
		ws.Flush
		
	Catch
		Log(LastException)
	End Try
End Sub
Sub Load_Products
	Try
		Dim rs As ResultSet
		rs = sql1.ExecQuery($"SELECT        ProductsInformation.ProductID, ProductsInformation.ProductName, ProductsInformation.ProductPrice, ProductsInformation.ProductImage, ProductsInformation.CatID, ProductsInformation.CostPrice, 
                         ProductsInformation.ProductBarcode, ProductsInformation.ProductTax, CatInfo.CatDesc
FROM            ProductsInformation LEFT OUTER JOIN
                         CatInfo ON ProductsInformation.CatID = CatInfo.CatID"$)
			
		Dim str As String
		Do While rs.NextRow
			
			
			str =str & $"<div class="card o-hidden bd-highlight m-1">
                                   <a href='javascript:void(0);' onclick="sellproduct(${rs.GetInt("ProductID")})" > <div class="list-thumb d-flex"><img alt="" src="${rs.GetString("ProductImage")}"></div></a>
                                    <div class="flex-grow-1 d-bock">
                                       <div class="card-body align-self-center d-flex flex-column justify-content-between align-items-lg-center">
                                          <div class="w-40 w-sm-100 item-title">${rs.GetString("ProductName")}</div>
                                          <p class="text-muted text-small w-15 w-sm-100 mb-2">${rs.GetString("ProductBarcode")}</p>
                                          <span class="badge badge-primary w-15 w-sm-100 mb-2">${NumberFormat2(rs.GetString("ProductPrice"),1,2,2,False)} L</span> 
                                          
                                       </div>
                                    </div>
                                 </div>"$
								 
			divproducts.SetHtml(str)
			
			ws.Flush
			
		Loop
		
		rs.Close
		
		
	Catch
		Log(LastException)
	End Try
End Sub
Private Sub Sell_Product (Params As Map)
	Try
		
		Dim isFound As Int = 0
		For i = 0 To lstSoldProducts.Size -1
			Dim cls As ClstblSoldProducts = lstSoldProducts.Get(i)
			If cls.PID = Params.Get("val") Then
				isFound = 1
				cls.PQty = cls.PQty + 1
				cls.PSubTotal = cls.PSellPrice * cls.PQty
				
				
			End If
		Next
		
		If isFound = 0 Then
			
			Dim rs As ResultSet
			rs = sql1.ExecQuery("select * from ProductsInformation where ProductID="&Params.Get("val"))
			Do While rs.NextRow
				Dim cls As ClstblSoldProducts
				cls.Initialize
				cls.Setup(rs.GetInt("ProductID"),rs.GetString("ProductName"),rs.GetDouble("ProductPrice"),rs.GetDouble("CostPrice"),rs.GetInt("ProductTax"),1,rs.GetDouble("ProductPrice"))
				
				lstSoldProducts.Add(cls)
				
			Loop
			rs.Close
		
		End If
		
		Load_tblSoldProducts
		
	Catch
		Log(LastException)
	End Try
End Sub
Sub Load_tblSoldProducts
	Try
		
		Dim dblTotalTax As Double = 0
		Dim dblgrandTotal As Double = 0
		
		Dim str As String = $"  <table class="table table-striped">
                                                <thead>
                                                   <tr>
                                                      <th scope="col">Producto</th>
                                                      <th scope="col">Precio</th>
                                                      <th scope="col" class="text-center">Cantidad</th>
                                                      <th scope="col" class="text-center">Subtotal</th>
                                                      <th scope="col" class="text-center"><i class="fa fa-trash"></i></th>
                                                   </tr>
                                                </thead>  <tbody>"$
		For i = 0 To lstSoldProducts.Size -1
			
			Dim cls As ClstblSoldProducts = lstSoldProducts.Get(i)
			str = str & $"<tr><td>${cls.PName}</td>
			<td>${cls.PSellPrice}</td>
			<td >	
				<div class="quantity">
					<div role="group" class="input-group">
						<!---->
						<div class="input-group-prepend"><a  href='javascript:void(0);' onclick="minusqty(${cls.PID})"><span class="btn btn-primary btn-sm">-</span></a></div>
						<input class="form-control" id="txtqty${cls.PID}" value="${cls.PQty}" disabled>
						<div class="input-group-append"><a  href='javascript:void(0);' onclick="addqty(${cls.PID})"><span class="btn btn-primary btn-sm">+</span></a></div>
						<!---->
					</div>
				</div>
			
			</td>
			
			<td class="text-center" >${cls.PSubTotal}</td>
			<td><a href='javascript:void(0);' onclick="deleteproduct(${cls.PID})" title="Delete"><i class="fa fa-times text-25 text-danger"></i></a></td></tr>"$
			
			Dim tempdbltax As Double = 0
			If cls.PTax > 0 Then
				dblTotalTax = dblTotalTax + ((cls.PSellPrice * cls.PQty) * (cls.PTax / 100))
				tempdbltax = ((cls.PSellPrice * cls.PQty) * (cls.PTax / 100))
			End If
			dblgrandTotal = dblgrandTotal + ((cls.PSellPrice * cls.PQty) + tempdbltax)
			
		Next
		
		str = str & $"  </tbody></table>"$
			tblsoldproducts.SetHtml(str)
		
		ws.Flush
		
		dblgrandTotal = dblgrandTotal - dbldiscount
		
		lblgrandtotal.SetHtml($"<span> Total : ${NumberFormat2(dblgrandTotal,1,3,0,False)}L </span>"$)
		txttax.SetVal(NumberFormat2(dblTotalTax,1,3,0,False))
		ws.Flush
		
		
		Dim intcount As Int = 0
		For i = 0 To lstSoldProducts.Size -1
			Dim cls As ClstblSoldProducts = lstSoldProducts.Get(i)
			intcount = intcount + cls.PQty
		Next
		lblcototalproducts.SetHtml(intcount)
		
		
		
		lblcototaltax.SetHtml(NumberFormat2(dblTotalTax,1,3,0,False) & " L")
		lblcototalshipping.SetHtml(NumberFormat2(dblshipping,1,3,0,False) & " L")
		lblcograndtotal.SetHtml(NumberFormat2(dblgrandTotal,1,3,0,False) & " L")
		
		lblcototaldiscount.SetHtml(NumberFormat2(dbldiscount,1,3,0,False) & " L")
		
		GlobaldblGrandTotal = NumberFormat2(dblgrandTotal,1,3,0,False)
		GlobaldblTotaldiscount = NumberFormat2(dbldiscount,1,3,0,False)
		GlobaldblTotalTax = NumberFormat2(dblTotalTax,1,3,0,False)
		
		
	Catch
		Log(LastException)
	End Try
End Sub

Private Sub Add_Qty_tblProducts (Params As Map)
	Try
		For i = 0 To lstSoldProducts.Size -1
			Dim cls As ClstblSoldProducts = lstSoldProducts.Get(i)
			If cls.PID = Params.Get("val") Then
				cls.PQty = cls.PQty + 1
				cls.PSubTotal = cls.PSellPrice * cls.PQty
				
			End If
		Next
		
		Load_tblSoldProducts
		
		
	Catch
		Log(LastException)
	End Try
End Sub

Private Sub Minus_Qty_tblProducts (Params As Map)
	Try
		For i = 0 To lstSoldProducts.Size -1
			Dim cls As ClstblSoldProducts = lstSoldProducts.Get(i)
			If cls.PID = Params.Get("val") Then
				If cls.PQty > 1 Then
					cls.PQty = cls.PQty - 1
				cls.PSubTotal = cls.PSellPrice * cls.PQty
					
				End If
			End If
		Next
		
		Load_tblSoldProducts
		
		
	Catch
		Log(LastException)
	End Try
End Sub

Sub btnresettbl_Click (Params As Map)
	Try
		lstSoldProducts.Clear
		Reset_Tbl
	Catch
		Log(LastException)
	End Try
End Sub
Sub Reset_Tbl
	Try
		dbldiscount = 0
		
		lblcototalproducts.SetHtml("0")
		lblcototaltax.SetHtml(0 & " L")
		lblcototalshipping.SetHtml("0 L")
		lblcograndtotal.SetHtml(0 & " L")
		lblcototaldiscount.SetHtml(0 & " L")
		
		GlobaldblGrandTotal = 0
		GlobaldblTotaldiscount = 0
		GlobaldblTotalTax = 0
		
		txtcopaidamount.SetVal("0")
		txtconotes.SetVal("0")
		
		dblshipping = 0
		
		Dim str As String = $"  <table class="table table-striped">
                                                <thead>
                                                   <tr>
                                                      <th scope="col">Producto</th>
                                                      <th scope="col">Precio</th>
                                                      <th scope="col" class="text-center">Cantidad</th>
                                                      <th scope="col" class="text-center">Subtotal</th>
                                                      <th scope="col" class="text-center"><i class="fa fa-trash"></i></th>
                                                   </tr>
                                                </thead>  <tbody><tbody><tr><td colspan="5">Sin información disponible</td></tr> </tbody></table>"$
			tblsoldproducts.SetHtml(str)
			
	Catch
		Log(LastException)
	End Try
End Sub

Private Sub discount_Change (Params As Map)
	
	Dim str As String = Params.Get("val")
	If str.Trim.Length > 0 And IsNumber(str.Trim) Then
		dbldiscount = Params.Get("val")
		
	Else
		dbldiscount = 0
		
	End If
	
		Dim dblTotalTax As Double = 0
		Dim dblgrandTotal As Double = 0
		
			For i = 0 To lstSoldProducts.Size -1
				Dim cls As ClstblSoldProducts = lstSoldProducts.Get(i)
				 
				Dim tempdbltax As Double = 0
				If cls.PTax > 0 Then
					dblTotalTax = dblTotalTax + ((cls.PSellPrice * cls.PQty) * (cls.PTax / 100))
					tempdbltax = ((cls.PSellPrice * cls.PQty) * (cls.PTax / 100))
				End If
				dblgrandTotal = dblgrandTotal + ((cls.PSellPrice * cls.PQty) + tempdbltax)
				
			Next
			
			dblgrandTotal = dblgrandTotal - dbldiscount
			dblgrandTotal = dblgrandTotal + dblshipping
			
			lblgrandtotal.SetHtml($"<span>Total : ${NumberFormat2(dblgrandTotal,1,3,0,False)}L </span>"$)
			txttax.SetVal(NumberFormat2(dblTotalTax,1,3,0,False))
			ws.Flush
			
				
				Dim intcount As Int = 0
				For i = 0 To lstSoldProducts.Size -1
					Dim cls As ClstblSoldProducts = lstSoldProducts.Get(i)
					intcount = intcount + cls.PQty
				Next
				lblcototalproducts.SetHtml(intcount)
				
				
				lblcototaltax.SetHtml(NumberFormat2(dblTotalTax,1,3,0,False) & " L")
				lblcototalshipping.SetHtml(NumberFormat2(dblshipping,1,3,0,False) & " L")
				lblcograndtotal.SetHtml(NumberFormat2(dblgrandTotal,1,3,0,False) & " L")
		
		
				lblcototaldiscount.SetHtml(NumberFormat2(dbldiscount,1,3,0,False) & " L")
		
		
		GlobaldblGrandTotal = NumberFormat2(dblgrandTotal,1,3,0,False)
		GlobaldblTotaldiscount = NumberFormat2(dbldiscount,1,3,0,False)
		GlobaldblTotalTax = NumberFormat2(dblTotalTax,1,3,0,False)
		
End Sub


Private Sub shipping_Change (Params As Map)
	
	Dim str As String = Params.Get("val")
	If str.Trim.Length > 0 And IsNumber(str.Trim) Then
		dblshipping = Params.Get("val")
	 
	Else
		dblshipping = 0
		
	End If
	
	
	
		Dim dblTotalTax As Double = 0
		Dim dblgrandTotal As Double = 0
		
			For i = 0 To lstSoldProducts.Size -1
				Dim cls As ClstblSoldProducts = lstSoldProducts.Get(i)
				 
				Dim tempdbltax As Double = 0
				If cls.PTax > 0 Then
					dblTotalTax = dblTotalTax + ((cls.PSellPrice * cls.PQty) * (cls.PTax / 100))
					tempdbltax = ((cls.PSellPrice * cls.PQty) * (cls.PTax / 100))
				End If
				dblgrandTotal = dblgrandTotal + ((cls.PSellPrice * cls.PQty) + tempdbltax)
				
			Next
			
			dblgrandTotal = dblgrandTotal - dbldiscount
			
			dblgrandTotal = dblgrandTotal + dblshipping
	
			
			lblgrandtotal.SetHtml($"<span>Total : ${NumberFormat2(dblgrandTotal,1,3,0,False)}L </span>"$)
			txttax.SetVal(NumberFormat2(dblTotalTax,1,3,0,False))
			ws.Flush
			
				
				
				Dim intcount As Int = 0
				For i = 0 To lstSoldProducts.Size -1
					Dim cls As ClstblSoldProducts = lstSoldProducts.Get(i)
					intcount = intcount + cls.PQty
				Next
				lblcototalproducts.SetHtml(intcount)
				
				
				lblcototaltax.SetHtml(NumberFormat2(dblTotalTax,1,3,0,False) & " L")
				lblcototalshipping.SetHtml(NumberFormat2(dblshipping,1,3,0,False) & " L")
				lblcograndtotal.SetHtml(NumberFormat2(dblgrandTotal,1,3,0,False) & " L")
		
		
				lblcototaldiscount.SetHtml(NumberFormat2(dbldiscount,1,3,0,False) & " L")
		

		GlobaldblGrandTotal = NumberFormat2(dblgrandTotal,1,3,0,False)
		GlobaldblTotaldiscount = NumberFormat2(dbldiscount,1,3,0,False)
		GlobaldblTotalTax = NumberFormat2(dblTotalTax,1,3,0,False)
		
End Sub

Sub cmbcategory_Change (Params As Map)
	Try
		txtsearchproducts.SetVal("0")
		divproducts.SetHtml("")
		ws.Flush
		
		
	Dim rs As ResultSet
		rs = sql1.ExecQuery($"SELECT        ProductsInformation.ProductID, ProductsInformation.ProductName, ProductsInformation.ProductPrice, ProductsInformation.ProductImage, ProductsInformation.CatID, ProductsInformation.CostPrice, 
                         ProductsInformation.ProductBarcode, ProductsInformation.ProductTax, CatInfo.CatDesc
FROM            ProductsInformation LEFT OUTER JOIN
                         CatInfo ON ProductsInformation.CatID = CatInfo.CatID where ProductsInformation.CatID=${cmbcategory.GetVal.Value} "$)
			
		Dim str As String
		Do While rs.NextRow
			
			
			str =str & $"<div class="card o-hidden bd-highlight m-1">
                                   <a href='javascript:void(0);' onclick="sellproduct(${rs.GetInt("ProductID")})" > <div class="list-thumb d-flex"><img alt="" src="${rs.GetString("ProductImage")}"></div></a>
                                    <div class="flex-grow-1 d-bock">
                                       <div class="card-body align-self-center d-flex flex-column justify-content-between align-items-lg-center">
                                          <div class="w-40 w-sm-100 item-title">${rs.GetString("ProductName")}</div>
                                          <p class="text-muted text-small w-15 w-sm-100 mb-2">${rs.GetString("ProductBarcode")}</p>
                                          <span class="badge badge-primary w-15 w-sm-100 mb-2">${NumberFormat2(rs.GetString("ProductPrice"),1,2,2,False)} L</span> 
                                          
                                       </div>
                                    </div>
                                 </div>"$
								 
			divproducts.SetHtml(str)
			
			ws.Flush
			
		Loop
		
		rs.Close
		
	Catch
		Log(LastException)
	End Try
End Sub

Private Sub Search_Products (Params As Map)
	Try
		divproducts.SetHtml("")
		ws.Flush
		
		
	Dim rs As ResultSet
		rs = sql1.ExecQuery($"SELECT        ProductsInformation.ProductID, ProductsInformation.ProductName, ProductsInformation.ProductPrice, ProductsInformation.ProductImage, ProductsInformation.CatID, ProductsInformation.CostPrice, 
                         ProductsInformation.ProductBarcode, ProductsInformation.ProductTax, CatInfo.CatDesc
FROM            ProductsInformation LEFT OUTER JOIN
                         CatInfo ON ProductsInformation.CatID = CatInfo.CatID where ProductsInformation.ProductName like '%${Params.Get("val")}%' or ProductsInformation.ProductBarcode like '%${Params.Get("val")}%' "$)
			
		Dim str As String
		Do While rs.NextRow
			
			
			str =str & $"<div class="card o-hidden bd-highlight m-1">
                                   <a href='javascript:void(0);' onclick="sellproduct(${rs.GetInt("ProductID")})" > <div class="list-thumb d-flex"><img alt="" src="${rs.GetString("ProductImage")}"></div></a>
                                    <div class="flex-grow-1 d-bock">
                                       <div class="card-body align-self-center d-flex flex-column justify-content-between align-items-lg-center">
                                          <div class="w-40 w-sm-100 item-title">${rs.GetString("ProductName")}</div>
                                          <p class="text-muted text-small w-15 w-sm-100 mb-2">${rs.GetString("ProductBarcode")}</p>
                                          <span class="badge badge-primary w-15 w-sm-100 mb-2">${NumberFormat2(rs.GetString("ProductPrice"),1,2,2,False)} L</span> 
                                          
                                       </div>
                                    </div>
                                 </div>"$
								 
			divproducts.SetHtml(str)
			
			ws.Flush
			
		Loop
		
		rs.Close
		
		
	Catch
		Log(LastException)
	End Try
End Sub


Private Sub Delete_Product (Params As Map)
	Try
		Dim IsFound As Int = -1
		
		For i = 0 To lstSoldProducts.Size -1
			Dim cls As ClstblSoldProducts = lstSoldProducts.Get(i)
			If cls.PID = Params.Get("val") Then
				IsFound = i
			End If
		Next
		If IsFound > - 1 Then
			txtdiscount.SetVal("0")
			lstSoldProducts.RemoveAt(IsFound)
			
			Load_tblSoldProducts
		End If
		
	Catch
		Log(LastException)
	End Try
End Sub

Sub Load_Customers
	Try
		
		Dim sb As StringBuilder
		sb.Initialize
		Dim rs As ResultSet
		rs = sql1.ExecQuery("select * from CustomersInformation")
		
		Do While rs.NextRow
			Dim val As String = rs.GetInt("CustomerID")
			sb.Append("<option value='").Append(val).Append("'>").Append(rs.GetString("CustomerName")).Append("</option>")
			nombre_cliente = rs.GetInt("CustomerName")
		Loop
		rs.Close
		
		cmbcustomer.SetHtml(sb.ToString)
		ws.Flush
		
		
	Catch
		Log(LastException)
	End Try
End Sub



Private Sub Add_NewCustomer (Params As Map)
	Try
		Dim str As String
		str = $"INSERT INTO CustomersInformation
           (CustomerName
           ,CustEmail
           ,CustPhone
           ,CustCountry
           ,CustCity
           ,CustAddress
		   ,RTN)
     VALUES
           (?
           ,?
           ,?
           ,?
           ,?
           ,?
		   ,?)"$
		   
		sql1.BeginTransaction
		sql1.ExecNonQuery2(str,Array As Object(txtcustname.GetVal.Value,txtcustemail.GetVal.Value,txtcustphone.GetVal.Value,txtcustcountry.GetVal.Value,txtcustcity.GetVal.Value,txtcustaddress.GetVal.Value,txtcustrtn.GetVal.Value))
		sql1.TransactionSuccessful
		
		Load_Customers
		
		txtcustname.SetVal("")
		txtcustemail.SetVal("")
		txtcustphone.SetVal("")
		txtcustcountry.SetVal("")
		txtcustcity.SetVal("")
		txtcustaddress.SetVal("")
		txtcustrtn.SetVal("")
		
	Catch
		Log(LastException)
	End Try
End Sub
Private Sub Clear_CustomersInputs (Params As Map)
	Try
		
		txtcustname.SetVal("")
		txtcustemail.SetVal("")
		txtcustphone.SetVal("")
		txtcustcountry.SetVal("")
		txtcustcity.SetVal("")
		txtcustaddress.SetVal("")
		txtcustrtn.SetVal("")
		ws.Flush
		
	Catch
		Log(LastException)
	End Try
End Sub

Sub Load_PaymentTypes
 
	Try
		Dim sb As StringBuilder
		sb.Initialize
		Dim rs As ResultSet
		rs = sql1.ExecQuery("select * from PaymentTypesInfo")
		
		Do While rs.NextRow
			Dim val As String = rs.GetInt("PaymenttypeID")
			sb.Append("<option value='").Append(val).Append("'>").Append(rs.GetString("PaymentDesc")).Append("</option>")
		Loop
		rs.Close
		cmbcopaymenttype.SetHtml(sb.ToString)
		ws.Flush
		
	Catch
		Log(LastException)
	End Try
	 
End Sub


Private Sub Add_Invoice (Params As Map)
	Try
		
		If GlobaldblGrandTotal = 0 Or GlobaldblGrandTotal < 0 Then
			Return
		End If
		
		Dim str As String
		str = $"INSERT INTO SalesInvoiceH
           (InvTotal
           ,UserID
           ,InvTotalTax
           ,InvTotalDiscount
           ,InvTotalShipping,PaidAmount,StrNotes,PaymenttypeID,CustomerID)
     VALUES
           (?
           ,?
           ,?
           ,?
           ,?,?,?,?,?)"$
		
		sql1.BeginTransaction
		sql1.ExecNonQuery2(str,Array As Object(GlobaldblGrandTotal,1,GlobaldblTotalTax,GlobaldblTotaldiscount,dblshipping,txtcopaidamount.GetVal.Value,txtconotes.GetVal.Value,cmbcopaymenttype.GetVal.Value,cmbcustomer.GetVal.Value))
		sql1.TransactionSuccessful
	
		Dim LastInsertedID As Int
		LastInsertedID = sql1.ExecQuerySingleResult("select * from SalesInvoiceH order by SalesInvoiceHID desc limit 1")
		
		
		For i = 0 To lstSoldProducts.Size -1
				Dim cls As ClstblSoldProducts = lstSoldProducts.Get(i)
			
				Dim str As String
				str = $"INSERT INTO SalesInvoiceD
			           (SalesInvoiceHID
			           ,ProductID
			           ,ProductSellPrice
			           ,ProductCostPrice
			           ,TaxPerc
			           ,ProductQty)
			     VALUES
			           (?
			           ,?
			           ,?
			           ,?
			           ,?
			           ,?)"$
				
				sql1.BeginTransaction
				sql1.ExecNonQuery2(str,Array As Object(LastInsertedID,cls.PID,cls.PSellPrice,cls.PCostPrice,cls.PTax,cls.PQty))
				sql1.TransactionSuccessful
		
		Next
		
		Create_invoice_ToPrint
		
		
		
		Reset_Tbl
		
	Catch
		Log(LastException)
	End Try
End Sub

Sub Create_invoice_ToPrint
	Try
		Dim fecha As String =  DateTime.Date(DateTime.Now) &" "&DateTime.Time(DateTime.Now)
		DateTime.DateFormat = "dd/MM/yyyy HH:mm:ss"
		
		Dim str As String
		str = $"<div>
					<div id="invoice-POS">
						<left>
						<h6 class="text-right">"$ &fecha& $"</h6>
						</left>
						<center id="top">
							<div class="logo"><img src="images/logo-default.png"></div>
							<div class="info">
								<h2>Soluciones Informáticas Fortin</h2></div>
						</center>
						<div class="info">
						<center>
							<h6>RTN : 01011992010754</h6>
							<h6>Dirección : 2da avenida comayaguaela entre 8va y 9na calle edificio CAE</h6>
							<h6>Email : admin@sifhn.com</h6>
							<h6>Telefono : (504) 9878-0884</h6>
							<h6>C.A.I	:  85D968-151D08-A64097-7C6028-7DA36C-FD</h6>
							<h6>Rango autorizado del 000-001-01-00001401 al 000-001-01-00001500</h6>
							<h6>fecha limite de emisión: 26/02/2023</h6>
							<h6>Cliente : "$& nombre_cliente &$"</h6>
							<h6>RTN	: 01010101010</h6></div>
							</center>
						<table class="mt-3 ml-2 table-md">
							<thead>
								<tr>
									<th scope="col">Producto</th>
									<th scope="col">Cantidad</th>
									<th scope="col">Subtotal</th>
								</tr>
							</thead>
							<tbody> "$
								
								
					
					For i = 0 To lstSoldProducts.Size -1
						Dim cls As ClstblSoldProducts = lstSoldProducts.Get(i)
						str = str & $"<tr>
									<td>${cls.PName}</td>
									<td>${cls.PQty}</td>
									<td>${(cls.PSellPrice * cls.PQty)} L</td>
								</tr>"$	
						
						
					Next
								
					 str = str & $"
								 <tr>
									<th></th>
									<th>ISV</th>
									<td>${GlobaldblTotalTax} L</td>
								</tr>
								<tr>
									<th></th>
									<th>Descuentos</th>
									<td>${GlobaldblTotaldiscount} L</td>
								</tr>
								<tr>
									<th></th>
									<th>Envio</th>
									<td>${dblshipping} L</td>
								</tr>
								
							</tbody>
						</table>
						
						<table id="total" class="mt-2 ml-2">
							<tbody>
								<tr>
									<th class="p-1 w-75">Total</th>
									<th class="p-1 w-25">${GlobaldblGrandTotal} L</th>
								</tr>
							</tbody>
						</table>
						<div id="legalcopy" class="ml-2">
							<p class="legal"><strong>Factura #000-001-01-00001500</strong></p>
							<p class="legal"><strong>La factura es beneficio de todos ¡Exijala!</strong></p>
							
						</div>
					</div>
				</div>"$
		
		
		
		divinvprint.SetHtml(str)
		
		
		Dim str As String
		str = $"
		
		var modal = document.getElementById("myModal3");
		
		 modal.style.display = "block";"$
	  
		ws.Eval(str,Null)
		
	Catch
		Log(LastException)
	End Try
End Sub



Sub btnclosemodal3_Click (Params As Map)
	Try
		
		Dim str As String
		str = $"
		
		var modal9 = document.getElementById("myModal3");
		
		 modal9.style.display = "none";"$
	  
		ws.Eval(str,Null)
		
	Catch
		Log(LastException)
	End Try
End Sub