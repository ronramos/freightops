<%@taglib uri="/struts-tags" prefix="s"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu Page</title>
</head>
<body>
	<table cellpadding="2" cellspacing="2">
		<tr><td>
		<br><br><br> 
		<a href="<s:url action="bookingLink"/>">Booking</a><br>
		<a href="<s:url action="operationsLink"/>">Operations</a><br> 
		<a href="<s:url action="documentationsLink"/>">Documentations</a><br>
		<a href="<s:url action="reportsLink"/>">Reports</a><br> 
		<a href="<s:url action="carrierLink"/>">Carrier</a><br> 
		<a href="<s:url action="customerLink"/>">Customer</a><br> 
		<a href="<s:url action="adminLink"/>">Admin</a>
		<br><br><br><br>
		</td></tr>
	</table>
</body>
</html>


