create table handroll(

	id serial primary key,
	proteina varchar(50) not null,
	precio int not null default 1000,
	stock int,
	ingredientes varchar(255)
	


);
insert into handroll(proteina,precio,stock,ingredientes) values ('kamikama',3000,5000,'nori, sesamo, palta arroz');
insert into handroll(proteina,precio,stock,ingredientes) values ('salmon',3500,5000,'nori, sesamo, palta arroz');

select id,proteina,precio from handroll;
--Tarea: agrega las tablas "ordenes" y "personas"
create table ordenes(

	id serial primary key,
	nombre_producto varchar(50) not null,
	precio_total int not null,
	fecha_pedido Date,
	id_local int
	


);

create table personas(

	id serial primary key,
	nombre varchar(50) not null,
	rut varchar(20) not null,
	apellido varchar(50) not null
	
	


);
alter table personas add column correo varchar(50) not null;