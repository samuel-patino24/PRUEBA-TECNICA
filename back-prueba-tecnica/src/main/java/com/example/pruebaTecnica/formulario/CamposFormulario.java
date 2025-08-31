package com.example.pruebaTecnica.formulario;

import jakarta.persistence.*;


import java.time.LocalDate;

@Entity
@Table(name = "formulariogco")

public class CamposFormulario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String identificacion;
    private Integer numeroIdentificacion;
    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String ciudad;
    private String departamento;
    private String pais;
    private String marcaAfiliacion;

    public CamposFormulario() {
    }

    public CamposFormulario(Integer id, String identificacion, Integer numeroIdentificacion, String nombres, String apellidos, LocalDate fechaNacimiento, String direccion, String ciudad, String departamento, String pais, String marcaAfiliacion) {
        this.id = id;
        this.identificacion = identificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
        this.marcaAfiliacion = marcaAfiliacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Integer getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(Integer numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getMarcaAfiliacion() {
        return marcaAfiliacion;
    }

    public void setMarcaAfiliacion(String marcaAfiliacion) {
        this.marcaAfiliacion = marcaAfiliacion;
    }
}