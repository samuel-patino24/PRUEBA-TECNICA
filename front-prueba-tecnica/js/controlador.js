import { consumirAPI } from "./consumoServicio.js";
// import { hayErroresFormulario } from "./validaciones.js";

//id de los elementos del formulario

let identificacion=document.getElementById("identificacion")
let numeroIdentificacion=document.getElementById("numeroIdentificacion")
let nombres=document.getElementById("nombres")
let apellidos=document.getElementById("apellidos")
let fechaNacimiento=document.getElementById("fechaNacimiento")
let direccion=document.getElementById("direccion")
let ciudad=document.getElementById("ciudad")
let departamento=document.getElementById("departamento")
let pais=document.getElementById("pais")
let marcaAfiliacion=document.getElementById("marcaAfiliacion")
let botonFormulario=document.getElementById("boton")

botonFormulario.addEventListener("click",function(evento){
    evento.preventDefault()

// objeto que se envia al back
    let datosQueVoyAEnviarAlBack={
        "identificacion":identificacion.value,
        "numeroIdentificacion":numeroIdentificacion.value,
        "nombres":nombres.value,
        "apellidos":apellidos.value,
        "fechaNacimiento":fechaNacimiento.value,
        "direccion":direccion.value,
        "ciudad":ciudad.value,
        "departamento":departamento.value,
        "pais":pais.value,
        "marcaAfiliacion":marcaAfiliacion.value
    }
    let datosListosParaViajar=JSON.stringify(datosQueVoyAEnviarAlBack)

//mensaje de exito

    consumirAPI(datosListosParaViajar)
    .then(function(respuesta){

        Swal.fire({
        title: "Buen Trabajo!",
        text: "te has registrado con exito",
        icon: "success"
        }); 
    })
})