create database login;
use login;

create table Usuario(
id int auto_increment primary key not null,
ingresoUsuario nvarchar(50),
ingresoPassword nvarchar(50)
);

select * from Usuario;

insert into Usuario(ingresoUsuario, ingresoPassword) values('admin','12345');
insert into Usuario(ingresoUsuario, ingresoPassword) values('admin2','6789');

select * from Usuario where Usuario.ingresoUsuario='admin' and Usuario.ingresoPassword='12345';
