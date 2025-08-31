package com.example.pruebaTecnica.controladores;

import com.example.pruebaTecnica.formulario.CamposFormulario;
import com.example.pruebaTecnica.servicios.FormuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/formulariogco")
public class FormularioControlador {

    @Autowired
    FormuarioServicio servicio;

    @PostMapping
    public ResponseEntity<?>responderAlGuardar(@RequestBody CamposFormulario datosAlFront){

        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.guardarFormulario(datosAlFront));
        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

}
