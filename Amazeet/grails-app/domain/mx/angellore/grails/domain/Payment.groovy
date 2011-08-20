package mx.angellore.grails.domain

import mx.angellore.grails.utils.PaymentStatus

class Payment {
	
	BigDecimal amount
	BigDecimal commission
	String transactionId = UUID.randomUUID().toString().replaceAll('-','').substring(0,20)
	String description
	PaymentStatus paymentStatus

	static belongsTo = [order:Order]

    static constraints = {
    }

	static mapping = {
		table 'pagos'
	}
}
