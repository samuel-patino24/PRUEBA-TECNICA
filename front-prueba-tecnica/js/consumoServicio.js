export async function consumirAPI(datosDelFormulario){
    //url del back 
    let url="http://localhost:8080/formulariogco"

    let peticion={
        method:"POST",
        headers:{"Content-Type":"application/json"},
        body:datosDelFormulario 
    }

    let respuesta=await fetch(url,peticion)
    return await respuesta.json()
}