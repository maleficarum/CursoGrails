package amazeet

class DemoTagLib {

	def print = { attrs, body ->
		def size = attrs.size
		
		if(size) {
			out << body() + " - " + size
		}
	}

}
