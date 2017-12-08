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
--------Tabla de Raza_Gato
Create table Raza_Gato(
    raza varchar (25) not null
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
    
--------Tabla de Raza_Perro
Create table Raza_Perro(
    raza varchar (25) not null
);
 
/****** Object:  Table Ave    Script Date: 21/09/2017 09:46:44 a. m. ******/
CREATE TABLE Ave(
	idAve int not null auto_increment,
	precio  decimal (6, 2)  NULL,
	descripcion varchar(45) NOT NULL,
    tamaño varchar(25) not null,
    color varchar (25) not null)
    especie varchar (25) NOT NULL,
	primary key(idAve);
--------Tabla de Especie_Ave

Create table Especie_Ave(
    especie varchar (25) not null
);

/****** Object:  Table Accesorio    ******/
create table Accesorio(
     idAccesorio int not null auto_increment,
     precio decimal(6, 2) not null,
     descripcion varchar(45) not null,
     tipo varchar (25) not null,
     material varchar(25) not null,
	primary key(idAccesorio));
--------Tabla de Marca_Accesorios
Create table Marca_Accesorio(
    marca varchar (25) not null
);

/****** Object:  Table Alimento    Script Date: 21/09/2017 09:46:44 a. m. ******/
CREATE TABLE Alimento(
	 idAlimento int not null auto_increment,
     precio decimal(6, 2) not null,
     descripcion varchar(45) not null,
     marca varchar (25) not null,
     fechaCad date not null,
	primary key(idAlimento));
 
--------Tabla de Marca_Alimento
Create table Marca_Alimento(
    marca varchar (25) not null
);

 
 
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


/******************************Datos de tabla Raza_Gato*******************************/
insert into Raza_Gato Values ('Scottish Foldv');
insert into Raza_Gato Values ('Sagrado de Birmania');
insert into Raza_Gato Values ('Persa');
insert into Raza_Gato Values ('Chartreux');
insert into Raza_Gato Values ('Ragdoll');

---https://www.petdarling.com/articulos/razas-de-gatos/


/******************************Datos de tabla Raza_Perro*******************************/
insert into Raza_Perro Values ('HUSKY SIBERIANO');
insert into Raza_Perro Values ('Golden retriever');
insert into Raza_Perro Values ('PASTOR ALEMAN');
insert into Raza_Perro Values ('POMERANIA');
insert into Raza_Perro Values ('Beagl');



/******************************Datos de tabla Especie_Ave*******************************/
insert into Especie_Ave Values ('periquito');
insert into Especie_Ave Values ('verderón europeo');
insert into Especie_Ave Values ('cotorra argentina');
insert into Especie_Ave Values ('cacatúa');
insert into Especie_Ave Values ('Canario');

---https://www.petdarling.com/articulos/razas-de-perros/

/******************************Datos de tabla Marca_Aliemento*******************************/
-----gato
insert into Marca_Alimento Values ('Whiskas');
insert into Marca_Alimento Values ('Perfect Fit');
insert into Marca_Alimento Values ('Gourmet Gold');

---https://www.buzzfeed.com/victorstepanov/lo-hizo-porque-el-quiso-nadie-le-obligo?utm_term=.ay94Lym9x#.wbR915Zyl

---perro
insert into Marca_Alimento Values ('Pedigree');
insert into Marca_Alimento Values ('Eukanuba');
insert into Marca_Alimento Values ('Dog Chow');

---https://www.neostuff.net/cuales-son-los-mejores-alimentos-para-perros/

---ave
insert into Marca_Alimento Values ('REDKITE');
insert into Marca_Alimento Values ('MAZURI');
insert into Marca_Alimento Values ('TRILL');

---https://petsy.mx/aves/alimento-ave

/******************************Datos de tabla Marca_Asesorio*******************************/
---gato
insert into Marca_Accesorio Values ('Catshion');
insert into Marca_Accesorio Values ('Genia');
insert into Marca_Accesorio Values ('Fatcat');

---perro
insert into Marca_Accesorio Values ('Forpets');
insert into Marca_Accesorio Values ('All For Paws');
insert into Marca_Accesorio Values ('Doggles');

---ave
insert into Marca_Accesorio Values ('Hagen');
insert into Marca_Accesorio Values ('Redkite');
insert into Marca_Accesorio Values ('Trill');
