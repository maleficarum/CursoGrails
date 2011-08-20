
<%@ page import="mx.angellore.grails.domain.ItemToPurchase" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'itemToPurchase.label', default: 'ItemToPurchase')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-itemToPurchase" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-itemToPurchase" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="dateCreated" title="${message(code: 'itemToPurchase.dateCreated.label', default: 'Date Created')}" />
					
						<g:sortableColumn property="lastUpdated" title="${message(code: 'itemToPurchase.lastUpdated.label', default: 'Last Updated')}" />
					
						<g:sortableColumn property="quantity" title="${message(code: 'itemToPurchase.quantity.label', default: 'Quantity')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${itemToPurchaseInstanceList}" status="i" var="itemToPurchaseInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${itemToPurchaseInstance.id}">${fieldValue(bean: itemToPurchaseInstance, field: "dateCreated")}</g:link></td>
					
						<td><g:formatDate date="${itemToPurchaseInstance.lastUpdated}" /></td>
					
						<td>${fieldValue(bean: itemToPurchaseInstance, field: "quantity")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${itemToPurchaseInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
