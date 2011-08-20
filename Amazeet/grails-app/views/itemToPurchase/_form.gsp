<%@ page import="mx.angellore.grails.domain.ItemToPurchase" %>



<div class="fieldcontain ${hasErrors(bean: itemToPurchaseInstance, field: 'quantity', 'error')} required">
	<label for="quantity">
		<g:message code="itemToPurchase.quantity.label" default="Quantity" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="quantity" required="" value="${fieldValue(bean: itemToPurchaseInstance, field: 'quantity')}"/>
</div>

