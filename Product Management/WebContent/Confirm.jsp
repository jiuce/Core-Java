<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirmation</title>
</head>
<body>
<%if(request.getAttribute("srcpage").equals("update")){%>
<%=request.getAttribute("updatestatus")%>
<%}%>
<%if(request.getAttribute("srcpage").equals("add")){%>
	<p>Product added to the database.</p>
	<table border="1">
	<tr><th>Product Name</th><th>Price</th><th>Quantity</th>
	<tr><td><%=request.getAttribute("pname")%></td>
	<td><%=request.getAttribute("pprice")%></td>
	<td><%=request.getAttribute("pqty")%></td>
	</tr>
	</table>
	
<% }%>

</body>
</html>