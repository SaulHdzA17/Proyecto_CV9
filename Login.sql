create database login;
use login;

create table Usuario(
id int auto_increment primary key not null,
ingresoUsuario nvarchar(50),
ingresoPassword nvarchar(50)
);

select * from Usuario;

insert into Usuario(ingresoUsuario, ingresoPassword) values('admin','12345');

