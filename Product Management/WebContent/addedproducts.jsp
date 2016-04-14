<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th colspan=3> A new product is added to the database</th>
<tr>
<td><%=request.getAttribute("pname") %></td>
<td><%=request.getAttribute("pprice") %></td>
<td><%=request.getAttribute("pqty") %></td>
</tr>
</table>
</body>
</html>