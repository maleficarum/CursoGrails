package com.synergyj.store

class StoreController {
	
	def shoppingCartService
	def mailService
	def springSecurityService
  
  def beforeInterceptor = {
    // Podemos usar interceptores beforeInterceptor, afterInterceptor
    log.debug "Controller ${shoppingCartService}"

    if(!session.shoppingCart) {
      session.shoppingCart = new ShoppingCart(shoppingCartStatus:ShoppingCartStatus.SHOPPING)	
	}
	if(!session.items) {
		session.items = []
	}
  }

  def index(){
    def products = Product.list()
    def categories = Category.list()

	Product.withSession { session ->

	}
	
	Product.withTransaction { status ->
//		status.setRollbackOnly()
	}
	
	Product.withCriteria {
		join "detalles"
	}

    [products:products,categories:categories]
  }

	def checkoutFlow = {
		showItems {
			on('payment').to "pay"
			on('putInfoToPay').to "putInfoToPay"
		}
		pay {
			println "Pagando"
			render(view:"pay")
		}
		putInfoToPay {
			
		}
	}
  
  def reviewItem = {
    // Obtener el id y buscar el articulo
    log.debug "Params ${params}"
    redirect(controller:"product",action:"show",id:params.id)
  }
  
  def addItem(){
    // Buscar el objeto y ponerlo en el carrito
	
    def product = Product.get(params.id)
println product
	def item = new ItemToPurchase(product:product, quantity:params.int('quantity'))
	session.items << item
//    log.debug request.dump()
//    log.debug response.dump()
//    log.debug session.dump()
//    log.debug servletContext.dump()
//    log.debug flash.dump()

//    render view:"added",model:[product:product]
		render template:"/shoppingCart/myCart", model:[product:product]
  }

	def sendOrder() {
	mailService.sendMail {
		to "oscar@angellore.com.mx"
		subject "Curso"
		body "Prueba"
	}
}

def addComment() {
	def p = Product.get(params.id)
	p.addComment(p, params.comment)
		render template:"/shoppingCart/myCart"
}

}