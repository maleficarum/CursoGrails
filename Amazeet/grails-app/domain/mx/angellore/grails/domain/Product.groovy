package mx.angellore.grails.domain

class Product {

	String name
	String description
	String technicalDetails
	String sku
	BigDecimal price
	Date dateCreated
	Date lastUpdated

	static hasMany = [categories:Category]
	
	static constraints = {
		name(nullable:false, blank:false, size:1..50)
		description(nullable:false, blank:false, size:1..200)		
		technicalDetails(nullable:false, blank:false, size:1..200)				
		sku(nullable:false, blank:false, size:1..20, unique:true)		
		price(nullable:false, validator:{value, domain->
			if(value?.compareTo(BigDecimal.ZERO) <= 0) {
				"error.invalid.price"
			}
		})
	}
	
	static mapping = {
		table 'productos'
	}	
}
