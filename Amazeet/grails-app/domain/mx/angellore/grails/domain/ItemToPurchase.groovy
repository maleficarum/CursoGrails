package mx.angellore.grails.domain

class ItemToPurchase {
	
	Integer quantity
	Date dateCreated
	Date lastUpdated
	
	static belongsTo = [shoppingCart:ShoppingCart]

    static constraints = {
    }

	static mapping = {
		table 'items_compras'
	}
}
