create database fillgaps;

use fillgaps;

-- Personal

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

select * from Personal;

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
	ID int not null,
    Rol varchar(20) not null
);

-- Llave primaria 

ALTER TABLE Rol
ADD CONSTRAINT pk_Rol PRIMARY KEY (ID);

-- Reportes
	
create table Reportes (
	ID int not null,
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
FOREIGN KEY (ID Personal)
REFERENCES Personal(ID);

-- Director

create table Director (
    Nombre varchar not null,
    telefono int(10) not null, 
    Correo varchar not null,
    Usuario varchar not null,
    contraseña varchar not null,
    campo varchar not null
);

-- Llave primaria
ALTER TABLE Director
	ADD CONSTRAINT pk_Director PRIMARY KEY (Nombre);

	
-- Prestamo
create table Prestamo (
	ID int not null,
	InicioPrestamo date not null,
	FinPrestamo date not null,
	Motivo varchar (100) not null,
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






create table Usuario3(
id int auto_increment primary key not null,
ingresoUsr nvarchar(50),
ingresoPsw nvarchar(50),
tipoUsr nvarchar(50)
);
select * from Usuario3;
insert into Usuario3(ingresoUsr, ingresoPsw) values('admin','12345');
insert into Usuario3(ingresoUsr, ingresoPsw) values('admin2','6789');
insert into Usuario3(ingresoUsr, ingresoPsw, tipoUsr) values('Tania','1111','Admin');

select * from Usuario3 where Usuario3.ingresoUsr='admin' and Usuario3.ingresoPsw='12345';

/*Insertar ITEM*/
insert into Item(Nombre, Descripcion, ID_Prestamo, ID_Personal, Campo) values ('Escultura', 'Buen estado','1','1','Campo');
insert into Item(ID, Nombre, Descripcion, ID_Prestamo, ID_Personal, Campo) values ('2','Pintura', 'Buen estado','2','2','Campo');
insert into Item(Nombre, Descripcion, ID_Prestamo, ID_Personal, Campo) values ('Escultura', 'Buen estado','3','3','Campo');

/*Mostrar ITEM*/
select * from Item;

/*Actualizar ITEM*/
update Item set item.Nombre ='Escultura', item.Descripcion='Mal estado' where item.id='1';

/*Eliminar ITEM*/
DELETE FROM Item where item.id='2';

/*Insertar PERSONAL*/
insert into Personal(ID, Nombre, CURP, RFC, FechaContratacion, edad, ID_Rol, ID_Reporte, ID_Item) values ('1', 'Raul', 'RAUL2023', 'RAULRFC2023', '21-11-2023', '30', '1', '1', '1');

/*Mostrar PERSONAL*/
select * from Personal;

/*Insertar PRESTAMOS*/
insert into Prestamo(ID, InicioPrestamo, FinPrestamo, Motivo, ID_item, ID_Personal) values ('1','2023-11-10','2023-11-15','Restauracion', '1', '1');

/*Mostrar PRESTAMOS*/
select * from Prestamo;

/*Insertar REPORTES*/
insert into Reportes(ID, Descripcion, Fecha_Inicio,Fecha_Fin, Estado, ID_Item) values ('1','Item restaurado','2023-11-10','2023-11-15','Buen estado', '1');

/*Mostrar REPORTES*/
select * from Reportes;

create table Item2 (
	ID int auto_increment primary key not null,
    Nombre varchar(20) not null,
    Descripcion varchar(20) not null,
    Campo varchar(20) not null
);

insert into Item2(Nombre, Descripcion, Campo) values ('Pintura', 'Buen estado','Campo');
insert into Item2(Nombre, Descripcion, Campo) values ('Escultura', 'Buen estado','Campo');
select * from Item2;

create table Item3 (
	ID int auto_increment primary key not null,
    Nombre varchar(20) not null,
    Descripcion varchar(20) not null,
    Campo varchar(20) not null,
    ID_Prestamo int not null,
    ID_Personal int not null
);

insert into Item3(Nombre, Descripcion, Campo) values ('Pintura', 'Buen estado','Campo');
insert into Item3(Nombre, Descripcion, Campo) values ('Escultura', 'Buen estado','Campo');
select * from Item3;

select *from Personal where ID like '%2%' OR Nombre like '%Raul%';