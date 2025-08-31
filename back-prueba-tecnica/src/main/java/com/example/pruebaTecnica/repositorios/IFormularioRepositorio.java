package com.example.pruebaTecnica.repositorios;

import com.example.pruebaTecnica.formulario.CamposFormulario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFormularioRepositorio extends JpaRepository<CamposFormulario,Integer> {
}
