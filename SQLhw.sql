-- #1
SELECT * 
	FROM northwind.customers
	;

-- #2
SELECT DISTINCT Country 
	FROM northwind.customers
	;

-- #3
SELECT * 
	FROM northwind.customers 
	WHERE CustomerID 
	LIKE 'BL%'
	;

-- #4
SELECT * 
	FROM northwind.orders 
	LIMIT 100
	;

-- #5
SELECT * 
	FROM northwind.customers 
	WHERE PostalCode = '1010'|| PostalCode = '3012'|| PostalCode = '12209'|| PostalCode = '05023'
	;

-- #6
SELECT * 
	FROM northwind.orders 
	WHERE ShipRegion 
	IS NOT NULL
	;

-- #7
SELECT * 
	FROM northwind.customers 
	ORDER BY country
	; 

SELECT * 
	FROM northwind.customers 
	ORDER BY city
	;

-- #8
INSERT INTO northwind.customers(
    CustomerID,CompanyName,ContactName,ContactTitle,Address,City,Region,PostalCode,Country,Phone,Fax,Image,ImageThumbnail)
	VALUES('ALBBW', 'Alberta Boswell','Cedric Boswell','Software Engineer', '3421 Pablo Ave.','Detroit',NULL, '48025','US','313-450-1232', '030-213-2123',NULL,NULL)
	;

-- #9
UPDATE northwind.orders
	SET ShipRegion ='EuroZone'
	WHERE ShipCountry ='France'
	;

-- #10
DELETE FROM northwind.`order details`
	WHERE Quantity ='1'
	;

-- #11
SELECT min(Quantity)
	FROM northwind.`order details`
    ;
    
SELECT max(Quantity)
	FROM northwind.`order details`
    ;
    
SELECT avg(Quantity)
	FROM northwind.`order details`
    ;

-- #12
SELECT min(Quantity)
	FROM northwind.`order details`
    GROUP BY OrderID
    ;
    
SELECT max(Quantity)
	FROM northwind.`order details`
    GROUP BY OrderID
    ;
    
SELECT avg(Quantity)
	FROM northwind.`order details`
    GROUP BY OrderID
    ;

-- #13
SELECT * 
	FROM northwind.orders 
	WHERE OrderID = '10290'
	;

-- #14
SELECT * 
	FROM northwind.customers
    INNER JOIN orders ON
    customers.CustomerID = orders.CustomerID
    ;

SELECT *
	FROM northwind.orders
    LEFT JOIN customers 
    ON customers.CustomerID = orders.CustomerID
    ;

SELECT *
	FROM northwind.orders
    RIGHT JOIN customers 
    ON customers.CustomerID = orders.CustomerID
    ;

-- #15
SELECT employees.EmployeeID,employees.City, orders.ShipCity, orders.ShipCountry
	FROM northwind.orders
    JOIN employees 
    ON employees.EmployeeID = orders.EmployeeID
    WHERE City = 'London'
    ;

-- #16
SELECT c.Discontinued, b.ProductID, a.ShipName
	FROM northwind.orders a
	INNER JOIN `order details` b 
	ON a.OrderID = b.OrderID
    INNER JOIN products c
	ON b.ProductID = c.ProductID
    WHERE c.Discontinued = '1'
    ;

-- #17
SELECT employees.FirstName
	FROM northwind.employees
    WHERE employees.ReportsTo IS NULL
    ;

-- #18
SELECT employees.FirstName
	FROM northwind.employees
    WHERE employees.ReportsTo = 2
    ;
