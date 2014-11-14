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
<link rel="stylesheet" type="text/css" href="<c:url value="/static/css/zebra.css"/>">

</head>
<body>
	<div align="center">
		<h1>Report page</h1>
	</div>
		<table id="costCenterTable" style="text-align: center;" border="1px"
			cellpadding="0" cellspacing="0">
			<thead class="head">
				<tr>
					<th width="150px">Cost Element</th>
					<th width="150px">VCpu</th>
					<th width="150px">VRAM</th>
					<th width="150px">VStorage</th>
					<th width="150px">Back Up Cost</th>
					<th width="150px">DR Cost</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="report" items="${reportsList}">
					<tr>
						<td>${report.costElement}</td>
						<td>${report.vCPU}</td>
						<td>${report.vRAM}</td>
						<td>${report.vStorage}</td>
						<td>${report.backUpCost}</td>
						<td>${report.dRCost}</td>
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