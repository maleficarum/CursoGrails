<div id="cartDiv">
<h2><g:message code="shoppingCart.yours"/></h2>
<g:if test="${session.shoppingCart}">
	<g:link action="checkout" controller="store">
		Checkout
	</g:link>
	<g:if test="product">
		<p>Nuevo producto ${product?.name}</p>	
	</g:if>

	<ul>
		<g:each in="${session.items}" var="item">
    		<li><p>${item?.product?.sku} : <i>${item?.quantity}</i></p></li>
  		</g:each>
	</ul>
</g:if>
<g:else>
  <p>Aún no has agregado ningún producto al carrito</p>
</g:else>
</div>
<script language="javascript">

</script>