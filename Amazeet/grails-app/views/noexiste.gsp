<!doctype html>
<html>
<head>
  <meta name="layout" content="earthlingtwo">
  <title>Store</title>	
	<script>
		var hideItem = function(data, event, id) {
			$('#added-' + id).fadeOut(1500);
			return false;
		}
	</script>
</head>
<body>

<h1>La pagina que solicitaste no existe.</h1>

<g:link controller="store" action="index">
	ver productos
</g:link>

</body>
</html>