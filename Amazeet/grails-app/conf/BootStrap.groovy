import com.synergyj.store.*

class BootStrap {

  def init = { servletContext ->
    environments {
      production {
        
      }
      development {
	
//		if(!User.count()) {
			def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
			def userRole = new Role(authority: 'ROLE_USER').save(flush: true)
			
			def testUser = new User(username: 'mortal', enabled: true, password: 'password')
			testUser.save(flush: true)

			def testAdmin = new User(username: 'immortal', enabled: true, password: 'password')
			testAdmin.save(flush: true)

			UserRole.create testUser, userRole, true			
			UserRole.create testAdmin, adminRole, true				
//		}
	
	
        if(!Category.count){
          def c1 = new Category(
            name:"Moda",
            description:"Ropa para desarrolladores de software, que viven y disfrutan de su trabajo"
          ).save()
          def c2 = new Category(
            name:"Accesorios",
            description:"Llevanos contigo a cualquier parte que vayas, siempre estaremos apoyándote"
          ).save()
          def c3 = new Category(
            name:"Libros",
            description:"Lleva el conocimiento contigo con nuestros libros recomendados"
          ).save()
          
          if(!Product.count()){
            def p1 = new Product(
              name:"T-shirt GrailsMX 2011",
              description:"Playera edición 2011 de la comunidad de grails.org.mx",
              technicalDetails:"Disponible en tallas CH, M, X y XL. Impresión impregnado en tela.",
              sku:"GRAILSMX2011",
              price:220.00,
              photo:new File("images/playera_grails.jpg").bytes
            ).save()
            def p2 = new Product(
              name:"T-shirt Artesanos de Software 2011",
              description:"Playera edición 2011 de la comunidad de Artesanos de Software",
              technicalDetails:"Disponible en tallas CH, M, X y XL. Impresión impregnado en tela.",
              sku:"ARTESANOS2011",
              price:220.00,
              photo:new File("images/playera_artesanos.jpg").bytes
            ).save()
            def p3 = new Product(
              name:"Libro: Camel in Action",
              description:"Apache Camel es un framework que te permite desarrollar EIP",
              technicalDetails:"Claus Ibsen - Jonathan Anstey, Revisión: Gregor Hohpe and James Strachan. Diciembre, 2010 | 552 pags. ISBN: 9781935182368",
              sku:"CAMEL2010",
              price:750.00,
              photo:new File("images/libro_camel.jpg").bytes
            ).save()
            def p4 = new Product(
              name:"Libro: Groovy in Action",
              description:"Groovy es un lenguajes dinámico para la JVM",
              technicalDetails:"Dierk Koenig with Andrew Glover, Paul King, Guillaume Laforge y Jon Skeet. Enero, 2007 | 696 pags. ISBN: 1-932394-84-2",
              sku:"GROOVY2010",
              price:750.00,
              photo:new File("images/libro_camel.jpg").bytes
            ).save()
            def p5 = new Product(
              name:"Cuadernillo: SynergyJ en tu entrenamiento",
              description:"Cuadernillo de trabajo",
              technicalDetails:"25 páginas, pasta de colores con logos de comunidades y empresa",
              sku:"NOTEBOOK2010",
              price:100.00,
              photo:new File("images/cuaderno_synergyj.jpg").bytes
            ).save()
            def p6 = new Product(
              name:"Memoria: SynergyJ.com",
              description:"Lleva todos tus archivos contigo, resguarda los laboratoros de tus clases",
              technicalDetails:"Memoria Kingston de 8GB",
              sku:"MEMORY2010",
              price:150.00,
              photo:new File("images/memoria_synergyj1.jpg").bytes
            ).save()
            def p7 = new Product(
              name:"Memoria: SynergyJ.com",
              description:"Lleva todos tus archivos contigo, resguarda los laboratoros de tus clases",
              technicalDetails:"Memoria Kingston de 8GB",
              sku:"MEMORY2011",
              price:150.00,
              photo:new File("images/memoria_synergyj2.jpg").bytes
            ).save()
            def p8 = new Product(
              name:"Memoria: SynergyJ.com",
              description:"Lleva todos tus archivos contigo, resguarda los laboratoros de tus clases",
              technicalDetails:"Memoria Kingston de 8GB",
              sku:"MEMORY2012",
              price:150.00,
              photo:new File("images/memoria_synergyj3.jpg").bytes
            ).save()
            def p9 = new Product(
              name:"T-shirt No-hacker",
              description:"Playera edición 2011 de filosofía anti-hacker",
              technicalDetails:"Disponible en tallas CH, M, X y XL. Impresión vinilo en tela.",
              sku:"NOHACKER2011",
              price:220.00,
              photo:new File("images/playera_nohacker.jpg").bytes
            ).save()
            def p10 = new Product(
              name:"Pin GrailsMX",
              description:"Pin de la comunidad GrailsMX 2011",
              technicalDetails:"Lleva contigo un detalle distinguido y elegante, se parte de la comunidad de una forma discreta pero elegante",
              sku:"PINGRAILSMX2011",
              price:30.00,
              photo:new File("images/pin_grailsmx.jpg").bytes
            ).save()
            def p11 = new Product(
              name:"Pin SpringHispano",
              description:"Pin de la comunidad SpringHispano 2011",
              technicalDetails:"Lleva contigo un detalle distinguido y elegante, se parte de la comunidad de una forma discreta pero elegante",
              sku:"PINSH2011",
              price:30.00,
              photo:new File("images/pin_sh.jpg").bytes
            ).save()
          }
        }
      }
    }
  }
  def destroy = {
  }
}
