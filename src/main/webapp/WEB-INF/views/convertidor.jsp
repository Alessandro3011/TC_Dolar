<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="http://thymelesf.org">
<head>
<meta charset="ISO-8859-1">
<title>Convertidor  Sol a Dolar</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</head>
<body>


<div class="container" >
<br><br><br><h2>Precio del Dolar: 3.9</h2>
  <div class="abs-center">
  
   <form  name="convertidor">
  <div class="form-row align-items-center">
    <div class="col-auto">
      <br><label class="sr-only" for="inlineFormInput">Cuantos soles: </label>
      <input type="text" class="form-control mb-2" id="inlineFormInput" name="soles" placeholder="S/.">      
    </div>    
    <div class="col-auto">
      <button class="btn btn-primary mb-2" type="button" value="CONVERTIR" onclick="calcular();">Calcular</button>
    </div>    
    <div class="col-auto">
      <label class="sr-only" for="inlineFormInputGroup">Convertidos a Dolares son: </label>
      <div class="input-group mb-2">        
        <input type="text" class="form-control" id="inlineFormInputGroup" name="dolar" placeholder="$.">
      </div>
    </div>    
    
  </div>
</form>
  </div>
</div>


	<script type="text/javascript">
		function calcular(){
			var sol = (document.convertidor.soles.value)*1;
			
			if(sol == 0){alert("No ha llenado el espacio de soles ingrese un número por favor.")}
			else{
				var tot = sol / 3.9;
				tot = tot.toFixed(2);				
				document.convertidor.dolar.value =tot;
			}
		}
		
	</script>
</body>
</html>