<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- XXX: https://dzone.com/tutorials/java/spring/spring-form-tags-1.html -->
<!-- XXX: https://stackoverflow.com/questions/16971565/using-springeval-display-property-value-in-jsp -->
<!-- XXX: https://stackoverflow.com/questions/4442400/error-page-how-to-print-stack-trace-in-jsp -->
<html>
<head>
<title>errores</title>
</head>
<body>

	<h1>My Error Page</h1>
	<table>
		<tr>
			<td>Date</td>
			<td>${timestamp}</td>
		</tr>
		<tr>
			<td>Error</td>
			<td>${error}</td>
		</tr>
		<tr>
			<td>Status</td>
			<td>${status}</td>
		</tr>
		<tr>
			<td>Message</td>
			<td>${message}</td>
		</tr>
		<tr>
			<td>Exception</td>
			<td>${exception?exception:"nada"}</td>
		</tr>
		<tr>
			<td>Trace</td>
			<td><pre>${trace}</pre></td>
		</tr>
		<tr>
			<td>Camino</td>
			<td>${path}</td>
		</tr>
	</table>
</body>
</body>
</html>