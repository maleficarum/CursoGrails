package mx.angellore.grails.domain

class Product {

	String name
	String description
	String technicalDetails
	String sku
	BigDecimal price
	Date dateCreated
	Date lastUpdated
	
     static constraints = {
    }
}
