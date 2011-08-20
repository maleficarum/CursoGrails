package amazeet

class DemoTagLib {
	
	static namespace = "m"

	def print = { attrs, body ->
		def size = attrs.size
		
		if(size) {
			out << body() + " - " + size
		}
	}

}
