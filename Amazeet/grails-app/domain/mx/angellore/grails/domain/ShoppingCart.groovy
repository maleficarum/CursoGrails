package mx.angellore.grails.domain

import mx.angellore.grails.utils.ShoppingCartStatus

class ShoppingCart {

	Date dateCreated
	Date lastUpdated
	ShoppingCartStatus status = ShoppingCartStatus.SHOPPING
	
	static hasMany = [items:ItemToPurchase]

    static constraints = {
		status(nullable:false)
    }

	static mapping = {
		table 'carrito_compra'
	}
}
