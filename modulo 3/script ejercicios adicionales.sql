-- EJERCICIO PORTAFOLIO N1--
CREATE TABLE Clientes(

	id serial primary key,
	nombre varchar(50) not null,
	Apellido varchar(50) not null,
	Edad int not null
	
);

insert into Clientes (nombre,Apellido,Edad) VALUES('matias','Vejar',27);
insert into Clientes (nombre,Apellido,Edad) VALUES('Fernando','Gonzalez',48);
insert into Clientes (nombre,Apellido,Edad) VALUES('Catalina','Llanquileo',35);

--5--
SELECT * FROM Clientes WHERE edad > 25;

-- EJERCICIO PORTAFOLIO N2 --

CREATE TABLE Productos(

	id_producto serial primary key,
	Nombre varchar(50) not null,
	Categoria varchar(50) not null,
	Precio int not null
	
);
insert into Productos (Nombre,Categoria,Precio) VALUES('Mouse razer','tecnologia',15700);
insert into Productos (Nombre,Categoria,Precio) VALUES('Mueble gamer','decoracion y hogar',25000);
insert into Productos (Nombre,Categoria,Precio) VALUES('Pelota de futbol','Deportes',7000);
insert into Productos (Nombre,Categoria,Precio) VALUES('Notebook gamer Acer','tecnologia',850000);

select * from Productos
select * from Productos where Precio > 50000
select * from Productos where id_producto = 1

select  count(id_producto) as cantidad_productos from Productos;
select avg(Precio) as precio_promedio from  Productos

--EJERCICIO PORTAFOLIO N3 --

CREATE TABLE Empleados(

	ID_Empleado serial primary key,
	Nombre varchar(50) not null,
	Apellido varchar(50) not null,
	Salario int not null
	
);
 insert into Empleados (Nombre,Apellido,Salario) VALUES('matias','Vejar',580000);
 insert into Empleados (Nombre,Apellido,Salario) VALUES('Jason','Johnson',800000);
 insert into Empleados (Nombre,Apellido,Salario) VALUES('nicolas','masu',1200000);
 
 update empleados set Salario = 780000 where ID_Empleado = 1
 
 delete from Empleados where ID_Empleado = 2
 
  insert into Empleados (Nombre,Apellido,Salario) VALUES('Julio','Vejar',750000);
 
 alter table Empleados add ID_departamento int
 
 alter table Empleados add constraint llave_fo foreign key ( ID_departamento )references departamentos(ID_departamento) 
 
 
 
 -- EJERCICIOS PORTAFOLIO N4 --
 
 create table Clientes_4 (
 
	 ID_cliente int primary key,
	 nombre varchar(50) not null,
	 apellido varchar(50) not null,
	 ID_ciudad int 
	 foreign key (ID_ciudad) references ciudades(ID_ciudad)
 );
 
 create table ciudades(
 
	 ID_ciudad serial primary key,
	 nombre_ciudad varchar(50) not null
 
 );
 
 ALTER TABLE Clientes_4 add column Email varchar(50) not null
 
 ALTER TABLE Clientes_4 modify Email varchar(50)
 
 DROP TABLE IF EXISTS Empleados
 
 truncate table Ventas;
 
 -- EJERCICIO PORTAFOLIO numero 5 --
 
 --entidades: libros, autores, prestamos_libros, empleados, categoria_libros, compras_libros--
 
 create table libros(
 
	 id_libro serial primary key,
	 titulo varchar(50) not null,
	 id_autor int not null
	 foreign key (id_autor) references autores(id_autor),
	 id_prestamo int 
	 foreign key (id_prestamo) references prestamos_libros(id_prestamo),
	 categoria_libro varchar(50) not null
	 foreign key (categoria_libro) references categoria_libros(id_categoria)
 
 )
 
 create table autores(
 
	 id_autor serial primary key,
	 nombre_autor varchar(50) not null,
	 apellido_autor varchar(50) not null,
	 nacionalidad varchar(50) not null,
	 
 
 )
 
 create table prestamos(
 
	 id_prestamo serial primary key,
	 fecha_prestamo date not null,
	 fecha_termino date not null,
	 
	 id_libro int not null
	 foreign key (id_libro) references libros(id_libro),
	 autor_libro int not null
	 foreign key (autor_libro) references autores(id_autor),
	 
 
 )
 
 
 

