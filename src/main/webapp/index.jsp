<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:import url="head.jsp" />

<h2>Rechercher</h2>
<form method="post" action="client">
	<input type="hidden" name="action" value="read-nom" />
	<label for="nom">Nom</label>
	<input type="text" id="nom" name="nom" placeholder="Nom" />
	<button type="submit" value="Client" name="type" >Client</button>
</form>

<p>
<a href="client?action=read-all">Liste des Clients</a>
<a href="client-form.jsp">Nouveau Client</a>
</p>


<c:if test="${not empty client}">
<h2>${client.prenom} ${client.nom} (${client.id})</h2>

<div class="liste comptes">
	<table>
		<tbody>
<c:forEach var="compte" items="${client.comptes}" >
			<tr>
				<td>${compte.numero}</td>
				<td><fmt:formatNumber value="${compte.solde}" type="currency" currencySymbol="€" /></td>
				<td><a href="rechercher?type=Compte&amp;numero=${compte.numero}">
					<img alt="détails" src="img/info_26.png">
				</a></td>
			</tr>
</c:forEach>
		</tbody>
	</table>
</div>

</c:if>

<c:if test="${not empty clients}">
<h2>Liste des Clients</h2>
<c:forEach var="client" items="${clients}">
<p>${client.prenom} ${client.nom}
<a href="client?action=read&amp;id=${client.id}">
	<img alt="détails" height="16" src="img/info_26.png">
</a>
</p>
</c:forEach>
</c:if>

<jsp:include page="/foot.html" />
