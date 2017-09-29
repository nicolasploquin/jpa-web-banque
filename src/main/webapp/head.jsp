<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="fr">
<head>
	<c:set var="appUrl" value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" 
			scope="application" />
	<base href="${appUrl}" /> 
	<meta charset="UTF-8" />
	<title>Formation Application Web Java EE - ENI Service</title>
	<link rel="stylesheet" href="css/banque.css" />
	<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
</head>
<body>
	<h1>Ma Banque en ligne avec JPA</h1>


	