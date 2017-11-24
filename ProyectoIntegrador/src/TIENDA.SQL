CREATE DATABASE Tienda;
USE Tienda;

/****** Object:  Table Gato    Script Date: 21/09/2017 09:46:44 a. m. ******/
CREATE TABLE Gato (
    idGato INT NOT NULL AUTO_INCREMENT,
    precio DECIMAL(6, 2) NOT NULL,
	descripcion VARCHAR(45) NOT NULL,
	tamaño VARCHAR(25) NOT NULL,
	color varchar (25) not null,
    raza VARCHAR(25) NOT NULL,
	PRIMARY KEY(idGato)
);
 /****** Object:  Table Perro    Script Date: 21/09/2017 09:46:44 a. m. ******/
CREATE TABLE Perro(
	idPerro int not null auto_increment,
    precio  decimal (6, 2)  NULL,
    descripcion varchar(45) NOT NULL,
	tamaño varchar (25) not null,
	color varchar (25) NOT NULL,
    raza varchar (25) not null,
	primary key(idPerro));
 
/****** Object:  Table Ave    Script Date: 21/09/2017 09:46:44 a. m. ******/
CREATE TABLE Ave(
	idAve int not null auto_increment,
	precio  decimal (6, 2)  NULL,
	descripcion varchar(45) NOT NULL,
    tamaño varchar(25) not null,
    color varchar (25) not null)
    especie varchar (25) NOT NULL,
	primary key(idAve);
/****** Object:  Table Accesorio    ******/
create table Accesorio(
     idAccesorio int not null auto_increment,
     precio decimal(6, 2) not null,
     descripcion varchar(45) not null,
     tipo varchar (25) not null,
     material varchar(25) not null,
	primary key(idAccesorio));
/****** Object:  Table Alimento    Script Date: 21/09/2017 09:46:44 a. m. ******/
CREATE TABLE Alimento(
	 idAlimento int not null auto_increment,
     precio decimal(6, 2) not null,
     descripcion varchar(45) not null,
     marca varchar (25) not null,
     fechaCad date not null,
	primary key(idAlimento));
 

 
 
								/****** PK   Primary Key   ******/
 
 /*******************************************************************************/
 
 -- ALTER TABLE  Gato ADD 
-- CONSTRAINT PK_Gato PRIMARY KEY ( idGato ASC);

/********************************************************** ********************/ 
-- ALTER TABLE Perro ADD  
--	CONSTRAINT PK_Perro PRIMARY KEY (	idPerro ASC );
/*******************************************************************************/
 
-- ALTER TABLE Ave ADD 
--	CONSTRAINT PK_Ave PRIMARY KEY (	idAve ASC);
/*******************************************************************************/
 
-- ALTER TABLE Alimento ADD 
--	CONSTRAINT PK_Alimento PRIMARY KEY ( idAlimento ASC);
/*******************************************************************************/
 
-- ALTER TABLE Asesorio ADD
-- CONSTRAINT PK_Asesorio PRIMARY KEY (	idAsesorio ASC);
/*******************************************************************************/

/**Datos de tabla Gato***id***precio******raza*********tamamo******descripcion********/
-- INSERT INTO Gato Values('01',	''	,	'10/10/98'	,	'' 	,	'4771233550')


/******************************Datos de tabla Perro*******************************/

/******************************Datos de tabla Ave*******************************/

/******************************Datos de tabla Aliemento*******************************/

/******************************Datos de tabla Asesorio*******************************/
