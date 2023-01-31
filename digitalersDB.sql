create database digitalers;
use digitalers;

# Crea la tabla articulos
create table articulos (
articuloid int unique not null auto_increment,
nombre varchar (10) unique not null,
precio varchar(50)  not null,
stock int
);

# Muestra la tabla articulos
select * 
from articulos;

# Muestra el detalle de las celdas
describe articulos; 

# Agrega una columna
alter table articulos add column precio_final int;

# Eliminar columna de una tabla
alter table articulos drop column precio_final;

# Renombrar una tabla
alter table articulos rename articulos2;
alter table articulos2 rename articulos;

# Insertar registros
insert into articulos values (1,'iron man 1', 1000, 10);
insert into articulos values (2,'iron man 2', 1000, 10);
insert into articulos values (3,'iron man 3', 1000, 10);
insert into articulos values (4,'iron man 4', 1000, 10);

# FUNCIONES SQL
select concat(articuloid, ' - ', nombre) from articulos;

# Alias 
select articuloid as ID 
from articulos; 

select concat(articuloid, ' - ', nombre) as descripcion 
from articulos;

select concat_ws('|', nombre,precio,articuloid) as descripcion 
from articulos;

# UPPER
select  UPPER(nombre) 
from articulos;

# LOWER
select  LOWER(nombre) 
from articulos;

# LEFT
select left (nombre,1) as inicial 
from articulos;

# RIGHT
select right (nombre,3) as final 
from articulos;

# JUNTAR FUNCIONES
select concat(left(nombre,1), right(nombre,3)) as inicialyfinal 
from articulos;

# Limitar la cantidad de registros que obtengo en una consulta
select * 
from articulos 
limit 2;

# OFFSET
select * 
from articulos 
limit 2 
offset 2;

# Calculos
select precio * 1.1 
from articulos;

select  sum(precio) total 
from articulos;

# Ordenamiento de datos por un solo campo
select * 
from articulos 
order by articuloid desc;

select * 
from articulos 
order by articuloid asc;

select * 
from articulos 
order by precio asc;

select * 
from articulos 
order by precio desc;

select * 
from articulos 
order by precio asc, stock desc;

# Actualizar un articulo 
update articulos 
set precio = 1800 
where articuloid = 1;
select * 
from articulos;

# Consulta sin tabla
select 10 + 2;

# Fecha actual
select curdate() as fecha;
select current_timestamp() as fecha;

# Fecha que viene de java en string
select date('2023-01-26') as fecha;

# Sumar fechas
select curdate() +31;

# Saber el año/mes/dia/hora/minutos/segundos de fecha actual
select year (curdate()) as anio;
select month (curdate()) as mes;
select day (curdate()) as dia;
select hour (current_time()) as hora;
select hour (current_timestamp()) as hora;
select minute(current_time()) as minutos;
select second(current_time()) as segundos;

# Date -> yyyy-mm-dd
# DateTime -> yyyy-mm-dd hh-mm-ss


# Saber el año/mes/dia/hora de cualquier fecha
select year (date('2021-01-26')) as anio;
select month (date('2021-01-26')) as mes;
select day (date('2021-01-26')) as dia;

# Encontrar un valor entre 2 valores
select * 
from articulos;

select * 
from articulos 
where precio between 100 and 3000;

select * 
from articulos 
where precio >= 100 and precio <= 3000;

# Relacionales 
select * 
from articulos 
where stock = 10;

# Distintos
select * 
from articulos 
where stock > 9;

# Agregar columna
alter table articulos add column fecha date;

# Eliminar columna
alter table articulos drop column fecha;

# Quiero registros con fecha de creacion  diferente a null y precio mayor a 800
select * 
from articulos 
where fecha is not null 
and precio > 800;

# Agregar datos
insert into articulos values (5, 'raqueta', 1899, 12, '2023-01-25');
insert into articulos values (6, 'libro', 1899, 12, curdate());
insert into articulos values (7, upper('Spiderman'),1899, 12, curdate());

# Obtener los articulos  con fecha entre  ayer y hoy, que tengan precio > 500, que tengan stock > 2, y ordenar los registros por fecha y precio
select * 
from articulos 
where fecha between date('2023-01-24') and date ('2023-01-26') 
and precio > 500 
and stock > 2 
order by fecha asc, precio asc;

select articulo_id, stock 
from articulos 
where fecha between date('2023-01-24') and date ('2023-01-26') 
and precio > 500 
and stock > 2 
order by fecha asc, precio asc;

select articulo_id, stock, precio, round(precio * 1.1) as precio_10 
from articulos 
where fecha between date('2023-01-24') and date ('2023-01-26') 
and precio > 500 
and stock > 2 
order by fecha asc, precio asc;

# Case  (if)
# si precio < 800 = barato, 
# 800 < precio < 1000 = valor medio,
# caro
select nombre, precio,
(case
	when precio < 800 then 'Barato'
	when precio between 800 and 1000 then 'Medio'
	else 'Caro'
end) as categoria 
from articulos
where precio < 1001
and precio between 1000 and 3000
order by precio asc;

# IN
select *
from articulos
where articulo_id = 2 or articulo_id = 3 or articulo_id = 4;

select *
from articulos
where articulo_id >= 2 and articulo_id <= 4;

select *,
(case
	when articulo_id = 1 then 'Heladera'
    when articulo_id = 2 then 'Zapato'
    else 'Es otra cosa'
end) as tipo
from articulos
where articulo_id in (7,8,9,10)
and fecha is not null
order by precio asc;

insert into articulos values (8, 'Patin', 1344, 2, curdate());

select *
from articulos;

# Listar todos los articulos incluyendo una columna denominada precio con iva 
select *, (precio * 1.21) as precio_iva
from articulos;

# Listar todos los articulos incluyendo una columna denominada  "cantidad de cuotas"
# y otra "valor de cuota", la cantidad es fija  y es 3, el valor de cuota corresponde a 1/3 del monto con un 5% de interes

select *, 3 as cant_cuotas, 
round(((1/3*precio)*1.05)) as valor_cuota, 
round((((1/3*precio)*1.05))*3) as total_a_pagar
from articulos;

create table socios (
id int primary key auto_increment unique);

create table orden (
id int primary key auto_increment unique,
precio float not null,
fecha_creacion date not null,
socios_id int not null
);

alter table orden add constraint fk_orden_socios foreign key (socios_id) references socios(id);

insert into orden (precio,fecha_creacion,socios_id) values (800,curdate(),1);

# JOIN

select *
from orden o
join socios s
on o.socios_id = s.id;

select o.id, o.precio, o.fecha_creacion,
s.nombre, s.apellido
from orden o
join socios s
on o.socios_id = s.id;


#  Count + order by

select * from articulos;
select * from clients;
select * from socios;

select count(*) from articulos
where articulo_id = 1;

update articulos
set stock = 15
where articulo_id > 3 and articulo_id < 8;

# Podemos usar check 
alter table articulos add constraint precio_mayor_0 check (precio>0);

#max
select max(articulo_id) from articulos;

#min
select min(articulo_id) from articulos;


select (categorias_id) from articulos A
inner join categorias C
on C.id = A.categorias_id
group by a.categorias_id;

# having 
select count(categorias_id) as cantidad, c.descripcion as categoria
from articulos A
inner join categorias C
on C.id = A.categorias_id
group by a.categorias_id
having count(categorias_id) > 2;

# Sumar precios
select sum(precio) as precio_total, c.descripcion as categoria
from articulos A
inner join categorias C
on C.id = A.categorias_id
group by a.categorias_id;





