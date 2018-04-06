<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Getting Started: Serving Web Content</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<form action="manda_codigo" method="post">
		<label for="tel">Telefono</label> <input id="tel" name="tel"
			type="text" /> <label for="tarj">Tarjeta</label> <input id="tarj"
			name="tarj" type="text" /> <label for="boto">Dale</label> <input
			type="submit" id="boto" /> <input type="hidden"
			name="${_csrf.parameterName}" value="${_csrf.token}" />

	</form>
</body>
</html>