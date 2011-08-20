package mx.angellore.grails.domain

class Category {
	
	String name
	String description
	Date dateCreated
	Date lastUpdated
	
	static hasMany = [products:Product]
	static belongsTo = mx.angellore.grails.domain.Product

    static constraints = {
    }

	static mapping = {
		table 'categorias'
	}
}
