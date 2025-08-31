CREATE DATABASE REGISTRO_GCO;


USE REGISTRO_GCO



CREATE TABLE TIPO_DOCUMENTO (
    IdTipoDocumento INT PRIMARY KEY IDENTITY(1,1),
    NombreTipo NVARCHAR(20) NOT NULL
)


CREATE TABLE PAIS (
    IdPais INT PRIMARY KEY IDENTITY(1,1),
    NombrePais VARCHAR(20) NOT NULL
)


CREATE TABLE DEPARTAMENTO (
    IdDepartamento INT PRIMARY KEY IDENTITY(1,1),
    NombreDepartamento VARCHAR(50) NOT NULL,
    IdPais INT FOREIGN KEY REFERENCES PAIS(IdPais)
)


CREATE TABLE CIUDAD (
    IdCiudad INT PRIMARY KEY IDENTITY(1,1),
    NombreCiudad VARCHAR(25) NOT NULL,
    IdDepartamento INT FOREIGN KEY REFERENCES DEPARTAMENTO(IdDepartamento)
)


CREATE TABLE CLIENTE (
    IdCliente INT PRIMARY KEY IDENTITY(1,1),
    Nombre VARCHAR(50) NOT NULL,
    Apellido VARCHAR(50) NOT NULL,
    IdTipoDocumento INT FOREIGN KEY REFERENCES TIPO_DOCUMENTO(IdTipoDocumento),
    NumeroDocumento VARCHAR(30) NOT NULL,
    Direccion VARCHAR(100),
    Telefono VARCHAR(30),
    Email VARCHAR(50),
    IdCiudad INT FOREIGN KEY REFERENCES CIUDAD(IdCiudad)
)


SELECT * FROM CLIENTE



INSERT INTO PAIS (NombrePais) VALUES
('Colombia'),
('Perú'),
('Panamá'),
('Costa Rica'),
('Venezuela');


INSERT INTO DEPARTAMENTO (NombreDepartamento, IdPais) VALUES
('Antioquia', 1),
('Cundinamarca', 1),
('Valle del Cauca', 1);


INSERT INTO DEPARTAMENTO (NombreDepartamento, IdPais) VALUES
('Lima', 2),
('Cusco', 2),
('Arequipa', 2);


INSERT INTO DEPARTAMENTO (NombreDepartamento, IdPais) VALUES
('Panamá', 3),
('Colón', 3),
('Chiriquí', 3);


INSERT INTO DEPARTAMENTO (NombreDepartamento, IdPais) VALUES
('San José', 4),
('Alajuela', 4),
('Cartago', 4);


INSERT INTO DEPARTAMENTO (NombreDepartamento, IdPais) VALUES
('Distrito Capital', 5),
('Zulia', 5),
('Lara', 5);


INSERT INTO CIUDAD (NombreCiudad, IdDepartamento) VALUES
('Medellín', 1),       
('Bogotá', 2),         
('Cali', 3);           


INSERT INTO CIUDAD (NombreCiudad, IdDepartamento) VALUES
('Lima', 4),           
('Cusco', 5),          
('Arequipa', 6);       


INSERT INTO CIUDAD (NombreCiudad, IdDepartamento) VALUES
('Ciudad de Panamá', 7),   
('Colón', 8),               
('David', 9);               


INSERT INTO CIUDAD (NombreCiudad, IdDepartamento) VALUES
('San José', 10),     
('Alajuela', 11),      
('Cartago', 12);       


INSERT INTO CIUDAD (NombreCiudad, IdDepartamento) VALUES
('Caracas', 13),       
('Maracaibo', 14),     
('Barquisimeto', 15); 


SELECT * FROM CIUDAD