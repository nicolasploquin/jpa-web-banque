<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="fr">
<head>
	<meta charset="UTF-8" />
	<title>Formation Application Web Java EE - ENI Service</title>
	<link rel="stylesheet" href="css/banque.css" />
	<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
</head>
<body>
	<h1>Ma Banque en ligne avec JPA !</h1>
<h2>Création Client</h2>

<form method="post" action="client?action=create">
<label for="nom">Nom</label>
<input type="text" id="nom" name="nom" placeholder="Nom" />
<br/>
<label for="prenom">Prénom</label>
<input type="text" id="prenom" name="prenom" placeholder="Prénom" />
<br/>
<button type="submit" value="Creer" name="type">Créer</button>
</form>
</body>
</html>