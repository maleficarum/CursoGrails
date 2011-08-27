package com.synergyj.store

import org.grails.comments.*

class Product implements Commentable {
  
  String name
  String description
  String technicalDetails
  String sku
  BigDecimal price
  byte[] photo
  
  Date dateCreated
  Date lastUpdated

	//read-only : Para catalogos, cuadno no se deben alterar despues de crearlos
	//nonstrict-read-write: Si la aplicacion raramente modifica datos y los updates en transacciones no son un problema
	//read-write: Para usuarios de apps. Si la aplicacion requiere modiicar frecuentemente el modelo de dominio
	//transactional : Provee comportamiento totalmente transaccional sin oportunidad a dity-reads, pero se necesita un proveedor

	transient onLoad = {
		println 'cargando objetos'
	}

  static constraints = {
    name nullable:false,blank:false,size:3..50
    description nullable:false,blank:false,size:1..1000
    technicalDetails nullable:false,blank:false,size:1..1000
    sku nullable:false,blank:false,unique:true,size:5..15
    price blank:false
    photo nullable:true,maxSize:1024*1024*5
  }
}
