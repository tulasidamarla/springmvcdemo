<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Report List page</title>

<script src="<c:url value="/static/js/jquery.min.js" />"></script>
<script src="<c:url value="/static/js/script.js" />"></script>

<link rel="stylesheet" type="text/css"
	href="<c:url value="/static/css/zebra.css"/>">
</head>
<body>
	<div align="center">
		<h1>Report page</h1>
	</div>

	<table id="vmDetailsTable" style="text-align: center;" border="1px"
		cellpadding="0" cellspacing="0" align="center">
		<thead class="head">
			<tr>
				<th width="100px">VM Name</th>
				<th width="100px">Blue Print</th>
				<th width="100px">Date Provisioned</th>
				<th width="100px">Date Decommissioned</th>
				<th width="100px">Owner</th>
				<th width="100px">Reporting Manager</th>
				<th width="100px">Cost Center</th>
				<th width="100px">Department</th>
				<th width="100px">BU</th>
				<th width="100px">Network</th>
				<th width="100px">Site</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="report" items="${vmList}">
				<tr>
					<td>${report.vMName}</td>
					<td>${report.bluePrint}</td>
					<td>${report.dateProvisioned}</td>
					<td>${report.dateDeComissioned}</td>
					<td>${report.owner}</td>
					<td>${report.reportingManager}</td>
					<td>${report.costCenter}</td>
					<td>${report.department}</td>
					<td>${report.bU}</td>
					<td>${report.network}</td>
					<td>${report.site}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br />
	<br />
	<br />
	<br />

	<div align="center">
		<a href="${pageContext.request.contextPath}/">Home page</a>
	</div>



</body>
</html>