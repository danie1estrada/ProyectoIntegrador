CREATE DATABASE Tienda;

USE Tienda;

/****** Object:  Table Gato    Script Date: 21/09/2017 09:46:44 a. m. ******/
CREATE TABLE Gato (
    idGato INT NOT NULL,
    precio DECIMAL(2) NULL,
    raza NCHAR(25) NOT NULL,
	tamaño NCHAR(25) NOT NULL,
	descripcion NCHAR(45) NOT NULL,
    color nchar (25) not null
);
 /****** Object:  Table Perro    Script Date: 21/09/2017 09:46:44 a. m. ******/
CREATE TABLE Perro(
	idPerro int not null,
    precio  decimal (2)  NULL,
	raza nchar (25) NOT NULL,
	tamaño nchar (25) not null,
    descripcion nchar(45) NOT NULL,
    color nchar (25) not null);
 
/****** Object:  Table Ave    Script Date: 21/09/2017 09:46:44 a. m. ******/
CREATE TABLE Ave(
	idAve int not null,
	precio  decimal (2)  NULL,
    especie nchar (25) NOT NULL,
    tamaño nchar(25) not null,
	descripcion nchar(45) NOT NULL,
    color nchar (25) not null);
/****** Object:  Table Asesorio    ******/
create table Accesorio(
     idAccesorio int not null,
     precio decimal(2) not null,
     descripcion nchar(45) not null,
     tipo nchar (25) not null,
     material nchar(25) not null);
/****** Object:  Table Alimento    Script Date: 21/09/2017 09:46:44 a. m. ******/
CREATE TABLE Alimento(
	 idAlimento int not null,
     precio decimal(2) not null,
     descripcion nchar(45) not null,
     marca nchar (25) not null,
     fechaCad date not null);
 

 
 
								/****** PK   Primary Key   ******/
 
 /*******************************************************************************/
 
 ALTER TABLE  Gato ADD 
CONSTRAINT PK_Gato PRIMARY KEY ( idGato ASC);

/********************************************************** ********************/ 
ALTER TABLE Perro ADD  
	CONSTRAINT PK_Perro PRIMARY KEY (	idPerro ASC );
/*******************************************************************************/
 
ALTER TABLE Ave ADD 
	CONSTRAINT PK_Ave PRIMARY KEY (	idAve ASC);
/*******************************************************************************/
 
ALTER TABLE Alimento ADD 
	CONSTRAINT PK_Alimento PRIMARY KEY ( idAlimento ASC);
/*******************************************************************************/
 
ALTER TABLE Asesorio ADD
 CONSTRAINT PK_Asesorio PRIMARY KEY (	idAsesorio ASC);
/*******************************************************************************/

/**Datos de tabla Gato***id***precio******raza*********tamamo******descripcion********/
INSERT INTO Gato Values('01',	''	,	'10/10/98'	,	'' 	,	'4771233550')


/******************************Datos de tabla Perro*******************************/

/******************************Datos de tabla Ave*******************************/

/******************************Datos de tabla Aliemento*******************************/

/******************************Datos de tabla Asesorio*******************************/
