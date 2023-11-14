create database fillgaps;

use fillgaps;

-- Personal

create table Personal (
	ID int auto_increment not null,
    Nombre varchar(20) not null,
    CURP varchar(18) not null,
    RFC varchar(13) not null,
    FechaContratacion date not null,
    edad int not null,
    ID_Rol int not null,
    ID_Reporte int not null,
    ID_Item int not null
);

-- Llave primaria
ALTER TABLE Personal
ADD CONSTRAINT pk_Personal PRIMARY KEY (ID);

-- Llaves foráneas
ALTER TABLE Personal
ADD CONSTRAINT fk_Personal_Rol
FOREIGN KEY (ID Rol)
REFERENCES Rol(ID);

ALTER TABLE Personal
ADD CONSTRAINT fk_Personal_Reportes
FOREIGN KEY (ID Reporte)
REFERENCES Reportes(ID);

ALTER TABLE Personal
ADD CONSTRAINT fk_Personal_Item 
FOREIGN KEY (ID Item)
REFERENCES Item(ID);

-- Rol
	
create table Rol (
	ID int auto_increment not null,
    Rol varchar(20) not null
);

-- Llave primaria 

ALTER TABLE Rol
ADD CONSTRAINT pk_Rol PRIMARY KEY (ID);

-- Reportes
	
create table Reportes (
	ID int auto_increment not null,
    Descripcion varchar(30) not null,
    Fecha_Inicio date not null,
    Fecha_Fin date not null,
    Estado varchar(30) not null,
    ID_Item int not null
);

-- Llave primaria
ALTER TABLE Reportes
ADD CONSTRAINT pk_Reportes ADD PRIMARY KEY (ID);

-- Llave foránea
ALTER TABLE Reportes
ADD CONSTRAINT fk_Reportes_Item
FOREIGN KEY (ID item)
REFERENCES Item(ID);

-- Item
create table Item (
	ID int auto_increment not null,
    Nombre varchar(20) not null,
    Descripcion varchar(20) not null,
    ID_Prestamo int not null,
    ID_Personal int not null,
    Campo varchar(20)
);

-- Llave primaria
ALTER TABLE Item
ADD CONSTRAINT pk_Item PRIMARY KEY (ID);

-- Llave foránea
ALTER TABLE Item
ADD CONSTRAINT fk_Item_Personal
FOREIGN KEY (ID_Personal)
REFERENCES Personal(ID);

-- Director

create table Director (
    Nombre varchar(20) not null,
    telefono int(10) not null, 
    Correo varchar(20) not null,
    Usuario varchar(20) not null,
    contraseña varchar(20) not null,
    campo varchar(20) not null
);

-- Llave primaria
ALTER TABLE Director
	ADD CONSTRAINT pk_Director PRIMARY KEY (Nombre);

	
-- Prestamo
create table Prestamo (
	ID int auto_increment not null,
	InicioPrestamo date not null,
	FinPrestamo date not null,
	Motivo varchar(20) not null,
	ID_item int not null,
	ID_Personal int not null
);

-- Llave Primaria
ALTER TABLE Prestamo
	ADD CONSTRAINT pk_Prestamo PRIMARY KEY (ID);

-- Llave foránea
ALTER TABLE Prestamo
	ADD CONSTRAINT fk_Prestamo_Item,
	FOREIGN KEY (ID item),
	REFERENCES Item(ID);

ALTER TABLE Prestamo
	ADD CONSTRAINT fk_Prestamo_Personal,
	FOREIGN KEY (ID Personal),
	REFERENCES Personal(ID);
	

/*
alter table Personal
add primary key (ID);

alter table Rol
add primary key (ID);
*/
desc Rol;

-- Tabla para los usuarios del Login
create table usuariosLogin (
	ID int auto_increment primary key not null,
    ingresoUsuario varchar(20) not null,
    ingresoContrasenia varchar(20) not null
)

select * from usuariosLogin;

insert into usuariosLogin(ingresoUsuario,ingresoContrasenia) values('admin','contra2023');