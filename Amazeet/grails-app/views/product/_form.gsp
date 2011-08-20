<%@ page import="mx.angellore.grails.domain.Product" %>



<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="product.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="50" required="" value="${productInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'description', 'error')} required">
	<label for="description">
		<g:message code="product.description.label" default="Description" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="description" maxlength="200" required="" value="${productInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'technicalDetails', 'error')} required">
	<label for="technicalDetails">
		<g:message code="product.technicalDetails.label" default="Technical Details" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="technicalDetails" maxlength="200" required="" value="${productInstance?.technicalDetails}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'sku', 'error')} required">
	<label for="sku">
		<g:message code="product.sku.label" default="Sku" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="sku" maxlength="20" required="" value="${productInstance?.sku}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'price', 'error')} required">
	<label for="price">
		<g:message code="product.price.label" default="Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="price" required="" value="${fieldValue(bean: productInstance, field: 'price')}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'categories', 'error')} ">
	<label for="categories">
		<g:message code="product.categories.label" default="Categories" />
		
	</label>
	<g:select name="categories" from="${mx.angellore.grails.domain.Category.list()}" multiple="multiple" optionKey="id" size="5" value="${productInstance?.categories*.id}" class="many-to-many"/>
</div>

