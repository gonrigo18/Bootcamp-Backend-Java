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
select * from articulos;

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
select articuloid as ID from articulos; 
select concat(articuloid, ' - ', nombre) as descripcion from articulos;
select concat_ws('|', nombre,precio,articuloid) as descripcion from articulos;

# UPPER
select  UPPER(nombre) from articulos;

# LOWER
select  LOWER(nombre) from articulos;

# LEFT
select left (nombre,1) as inicial from articulos;

# RIGHT
select right (nombre,3) as final from articulos;

# JUNTAR FUNCIONES
select concat(left(nombre,1), right(nombre,3)) as inicialyfinal from articulos;

# Limitar la cantidad de registros que obtengo en una consulta
select * from articulos limit 2;

# OFFSET
select * from articulos limit 2 offset 2;

# Calculos
select precio * 1.1 from articulos;
select  sum(precio) total from articulos;

# Ordenamiento de datos por un solo campo
select * from articulos order by articuloid desc;
select * from articulos order by articuloid asc;

select * from articulos order by precio asc;
select * from articulos order by precio desc;

select * from articulos order by precio asc, stock desc;

# Actualizar un articulo 
update articulos set precio = 1800 where articuloid = 1;
select * from articulos;

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
select * from articulos;
select * from articulos where precio between 100 and 3000;
select * from articulos where precio >= 100 and precio <= 3000;





