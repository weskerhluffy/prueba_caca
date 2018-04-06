<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Getting Started: Serving Web Content</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<form action="tinta_codigos" method="post">
		<ul>
			<li>Telefono ${usuario.telefono}</li>
			<li>Tarjeta ${usuario.tarjeta}</li>
			<li>Codigo ${nume}</li>
		</ul>
		<label for="codigos">Codigossss</label> <input name="codigos"
			type="text" /> <label for="boto">Dale</label> <input name="boto"
			type="submit" /> <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />

	</form>
</body>
</html>