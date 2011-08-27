class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/addProductToCart/$id" {
			controller="store"
			action="addItem"
		}
		
		name addProduct2Cart:"/addProduct2Cart/$id" {
			controller="store"
			action="addItem"
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
