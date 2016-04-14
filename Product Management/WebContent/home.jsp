<%@ page language="java" contentType="text/html"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html">
<meta name="Description" content="This is my product management project using html5, JDBC, CSS">
<meta charset="UTF-8">

<title>Home</title>
<style>
#header{
background-color:#220044;                             
text-align:center;
padding:5px;
color:white;
}	

table{
background-color:#eeeeee;
}

tr{
height:30px}

a{text-decoration:none};

a.hover:hover{
background-color:#220040;
color:yellow;
}

a:visited{
color:#220022;
}
</style>
</head>
<body>
<div id=header>
<h1>Product Management</h1>
</div> 


<table style="width:100%">
<tr>
<td><a class= hover href="addproduct.html" name="add">Add new Product</a></td>
<td><a class= hover href="http://localhost:8080/Test1/ViewAllServlet">View All</a></td>
<td><a class= hover href="updatePrice.html">Update price</a></td>
<td><a class= hover href="http://localhost:8080/Test1/CheckBufferServlet">Check buffer status</a></td>
<td><a class= hover href="http://localhost:8080/Test1/OrderServlet">Order new Stock</a></td>
</tr>
</table>
<%=request.getAttribute("welcome") %>
</body>
</html>