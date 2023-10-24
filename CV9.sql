create database fillgaps;

use fillgaps;

create table Personal (
	ID int not null,
    Nombre varchar(20) not null,
    CURP varchar(18) not null,
    RFC varchar(13) not null,
    FechaContratacion date not null,
    edad int not null,
    ID_Rol int not null,
    ID_Reporte int not null,
    ID_Item int not null
);

create table Rol (
	ID int not null,
    Rol varchar(20) not null
);

create table Reportes (
	Id int not null,
    Descripcion varchar(30) not null,
    Fecha_Inicio date not null,
    Fecha_Fin date not null,
    Estado varchar(30) not null,
    ID_Item int not null
);

create table Item (
	ID int not null,
    Nombre varchar(20) not null,
    Descripcion varchar(20) not null,
    ID_Prestamo int not null,
    ID_Personal int not null,
    Campo varchar(20)
);