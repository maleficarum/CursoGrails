package com.synergyj.store

import org.springframework.dao.DataIntegrityViolationException
import grails.plugins.springsecurity.Secured

@Secured(['ROLE_ADMIN'])
class CategoryController {
  
  static scaffold = Category

	@Secured(['ROLE_USER'])
	def libre() {
		log.info "Orale"
	}
  
}
