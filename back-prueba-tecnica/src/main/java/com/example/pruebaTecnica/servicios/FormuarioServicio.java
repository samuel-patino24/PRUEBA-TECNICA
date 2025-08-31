package com.example.pruebaTecnica.servicios;

import com.example.pruebaTecnica.formulario.CamposFormulario;
import com.example.pruebaTecnica.repositorios.IFormularioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormuarioServicio {

    @Autowired
    IFormularioRepositorio repositorio;


    public boolean guardarFormulario(CamposFormulario datosFormulario) throws Exception {
        try {
            repositorio.save(datosFormulario);
            return true;
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

}