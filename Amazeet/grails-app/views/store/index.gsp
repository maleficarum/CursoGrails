<!doctype html>
<html>
<head>
  <meta name="layout" content="earthlingtwo">
  <title>Store</title>	
	<script>
		var hideItem = function(data, event, id) {
			$('#added-' + id).fadeOut(1500);
			return false;
		}
	</script>
</head>
<body>

	<g:render template="/springsocial/twitter/menu" plugin="spring-social-twitter" />
	<div id="enviado">
		<g:remoteLink action="sendOrder" controller="store" update="enviado">
			Confirmar mail
		</g:remoteLink>
	</div>

  <h2>Nuestros productos</h2>

  <g:each in="${products}" var="product">  
  <div class="post" id="added-${product.id}">
    <h2 class="title"><a href="#">${product.name}</a></h2>
    <p class="meta">$ ${product.price}</p>
    <div class="entry">
      <p>
        <store:showProduct id="${product.id}" size="small"/>
        ${product.description}<br/>
        <i>${product.technicalDetails}</i>
      </p>

		<g:formRemote name="addItem-${product.id}" url="[action:'addItem']" action="addItem" update="myShoppingCart" onSuccess="hideItem(data, event, ${product.id});">
			<g:hiddenField name="id" value="${product.id}" />
			Cantidad : <g:textField name="quantity" value="1" /><br />
			<input type="submit" name="submit" value="<g:message code='shopping.submit.add' />" />
		</g:formRemote>
		
		<sec:ifNotLoggedIn>
			<g:link controller='login' action='auth'>Login</g:link>
		</sec:ifNotLoggedIn>
		<sec:ifLoggedIn>
			<g:formRemote name="comment-${product.id}" url="[action:'addComment']" onSuccess="alert('Gracias')">
				<g:hiddenField name="id" value="${product.id}" />		
				Comentar : <g:textField name="comment" />
				<input type="submit" value="Enviar" />
			</g:formRemote>
		</sec:ifLoggedIn>

      <p class="links"><a href="#" class="more">Read More</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#" class="comments">Comments (33)</a></p>
    </div>
  </div>
  <div style="clear: both;">&nbsp;</div>
  </g:each>

</body>
</html>