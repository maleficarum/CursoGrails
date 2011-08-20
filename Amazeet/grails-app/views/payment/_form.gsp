<%@ page import="mx.angellore.grails.domain.Payment" %>



<div class="fieldcontain ${hasErrors(bean: paymentInstance, field: 'amount', 'error')} required">
	<label for="amount">
		<g:message code="payment.amount.label" default="Amount" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="amount" required="" value="${fieldValue(bean: paymentInstance, field: 'amount')}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: paymentInstance, field: 'commission', 'error')} required">
	<label for="commission">
		<g:message code="payment.commission.label" default="Commission" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="commission" required="" value="${fieldValue(bean: paymentInstance, field: 'commission')}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: paymentInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="payment.description.label" default="Description" />
		
	</label>
	<g:textField name="description" value="${paymentInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: paymentInstance, field: 'transactionId', 'error')} ">
	<label for="transactionId">
		<g:message code="payment.transactionId.label" default="Transaction Id" />
		
	</label>
	<g:textField name="transactionId" value="${paymentInstance?.transactionId}"/>
</div>

