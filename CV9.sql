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

