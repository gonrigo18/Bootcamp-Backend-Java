create database laboratorio;
use laboratorio;

create table facturas  (letra char,numero int,clientid int, articuloid int, fecha date, monto float);

alter table facturas add primary key (letra,numero);

create  table articulos (articuloid int, nombre varchar(50), precio double, stock int);

alter table articulos add primary key (articuloid);

create table clientes (clienteid int, nombre varchar (50), apellido varchar (50), cuit varchar(50), direccion varchar(50), comentarios varchar(50));

insert into facturas values ('A',1,1,1,'2021-06-24',1000);
insert into facturas (letra,numero,clientid,articuloid,fecha,monto) values ('B', 2 , 2 , 2, '2021-06-24', 2000);
insert into facturas values ('C',3,3,3,'2021-06-24',3000);
insert into facturas (letra,numero,clientid,articuloid,fecha,monto) values ('D', 4 , 4 , 4, '2021-06-24', 4000);
insert into facturas values ('E',5,5,5,'2021-06-24',5000);

insert into clientes values (1,'carlos','lopez','123456789','avenida siempre viva 94', 'digitalers');
insert into clientes values (2,'jose','perez','123456789','avenida siempre viva 95', 'digitalers');
insert into clientes values (3,'martin','pescador','123456789','avenida siempre viva 96', 'digitalers');
insert into clientes values (4,'armando','rolon','123456789','avenida siempre viva 97', 'digitalers');
insert into clientes values (5,'leonardo','turtle','123456789','avenida siempre viva 98', 'digitalers');

insert into articulos value (1, 'iron man 1', 1000, 10);
insert into articulos value (2, 'iron man 2', 2000, 11);
insert into articulos value (3, 'iron man 3', 3000, 12);
insert into articulos value (4, 'iron man 4', 4000, 13);
insert into articulos value (5, 'iron man 5', 5000, 14);

select * from clientes;
select * from articulos;
select * from facturas;