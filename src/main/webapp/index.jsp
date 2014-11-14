<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Home page</title>
</head>
<body>
<h1>Home page</h1>
<p>
Welcome to "Reporting application".<br/>
<i>${message}</i><br/>
<a href="${pageContext.request.contextPath}/costElementlist.html">View all Cost Element Reports</a><br/>
<a href="${pageContext.request.contextPath}/vmList.html">View all Vm Details Reports</a><br/>
</p>
</body>
</html>