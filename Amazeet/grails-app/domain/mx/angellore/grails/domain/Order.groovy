package mx.angellore.grails.domain

import mx.angellore.grails.utils.*

class Order {
	
	OrderStatus orderStatus
	ShoppingCartStatus shoppingCartStatus
	Date dateCreated
	Date lastUpdated
	
	static hasOne = [payment:Payment]		

    static constraints = {
		
    }

	static mapping = {
		table 'ordenes'
	}
}
