<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Usuario</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">

<script defer="defer" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.5.3/js/bootstrapValidator.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</head>

<body style="background-color: #7fb0b8;">
<section class="vh-100" style="background-color: #7fb0b8;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col col-xl-10">
        <div class="card" style="border-radius: 1rem;">
          <div class="row g-0">
            <div class="col-md-6 col-lg-5 d-none d-md-block">
              <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/img1.webp"
                alt="login form" class="img-fluid" style="border-radius: 1rem 0 0 1rem;" />
            </div>
            <div class="col-md-6 col-lg-7 d-flex align-items-center">
              <div class="card-body p-4 p-lg-5 text-black">
                <form>

                  <h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Registrar Tipo de Cambio</h5>

                  <div class="form-outline mb-4">
                    <input type="text" class="form-control form-control-lg" id="txtValorDolar"/>
                    <label class="form-label" for="form2Example17">Tipo de Cambio del dia de Hoy</label>
                  </div>
					
					<div class="form-row">
            
               <button class="btn btn-dark" type="button" onclick="grabar();">Registrar</button>
               <button type="button" class="btn btn-info" onclick="limpiar();" style="color:white;">Limpiar</button>
               <button type="button" class="btn btn-danger" onclick="location.href='http://localhost:8080/TC_Dolar/home/index'" style="color:white;">Regresar</button>
            
            </div>                  
                  <a href="#!" class="small text-muted">Terminos de uso</a>
                  <a href="#!" class="small text-muted">Politicas de privacidad</a>
                </form>

              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
<script type="text/javascript">
function limpiar(){
	$("#txtValorDolar").val('');
 }

function grabar(){ 
	var DC_TIPCAMB = $("#txtValorDolar").val();
    
    if(DC_TIPCAMB != "" && DC_TIPCAMB!=null){
    	if(DC_TIPCAMB.match("^[1-9]{1}\.[1-9]{2}|[1-9][0-9]\.[0-9]{2}|[0]{1,2}\.[5-9][0-9]|[0-9][1-9]\.[0-9]{2}$")){
    		 $.ajax({
    		        type: 'POST',
    		          url: "registraTipoDeCambio",
    		          data: {"DC_TIPCAMB":DC_TIPCAMB},
    		          success: function(data){
    		        	  if(data == "REGISTRO EXITOSO"){
    		        		  alertaSuccesPersonalizada(data);
    		        		  limpiar();
    		          	  }
    		          	  else{
    		          		alertaErrorPersonalizada(data);
    		          	  }
    		          },
    		          error: function(){
    		        	  alertaErrorPersonalizada("ERROR");
    		          }
    		          }); 
    	}
    
       else{
    	alertaErrorPersonalizada("Formato del tipo de cambio no valido");
    }
    }else{
    	alertaInfoPersonalizada("Ingrese el tipo de cambio");
    }
}

function alertaInfoPersonalizada(mensaje){
	Swal.fire({
  	  position: 'center',
  	  icon: 'info',
  	  title: mensaje,
  	  showConfirmButton: false,
  	  timer: 1500
  	})
}

function alertaSuccesPersonalizada(mensaje){
	Swal.fire({
  	  position: 'center',
  	  icon: 'success',
  	  title: mensaje,
  	  showConfirmButton: false,
  	  timer: 1500
  	})
}

function alertaErrorPersonalizada(mensaje){
	Swal.fire({
  	  position: 'center',
  	  icon: 'error',
  	  title: mensaje,
  	  showConfirmButton: false,
  	  timer: 1500
  	})
}

</script>
</body>
</html>