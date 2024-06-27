DROP TABLE IF EXISTS actores;
CREATE TABLE actores(
	id_actor serial  primary key,
    nombre varchar(255) NOT NULL,
    protagonico boolean,
    sueldo integer
);

insert into actores (nombre,  protagonico, sueldo) values ('Paz Bascuñán',  true, 100);
insert into actores (nombre,  protagonico, sueldo) values ('Pablo Macaya',  true, 100);
insert into actores (nombre,  protagonico, sueldo) values ('Cristian Arriagada',  true, 95);
insert into actores (nombre,  protagonico, sueldo) values ('Josefina Montané',  true, 90);
insert into actores (nombre,  protagonico, sueldo) values ('Loreto Aravena',  true, 95);
insert into actores (nombre,  protagonico, sueldo) values ('Lorena Bosch',  true, 90);
insert into actores (nombre,  protagonico, sueldo) values ('Nicolás Poblete',  true, 85);
insert into actores (nombre,  protagonico, sueldo) values ('Héctor Morales',  true, 80);
insert into actores (nombre,  protagonico, sueldo) values ('Aranzazú Yankovic',  true, 80);
insert into actores (nombre,  protagonico, sueldo) values ('Luis Gnecco',  true, 95);
insert into actores (nombre,  protagonico, sueldo) values ('Catalina Guerra',  true, 90);
insert into actores (nombre,  protagonico, sueldo) values ('Solange Lackington',  true, 70);
insert into actores (nombre,  protagonico, sueldo) values ('Ignacio Garmendia',  true, 70);
insert into actores (nombre,  protagonico, sueldo) values ('Julio González',  true, 75);
insert into actores (nombre,  protagonico, sueldo) values ('Antonella Orsini',  true, 70);
insert into actores (nombre,  protagonico, sueldo) values ('Tamara Acosta',  false, 60);
insert into actores (nombre,  protagonico, sueldo) values ('Silvia Santelices',  false, 55);
insert into actores (nombre,  protagonico, sueldo) values ('Alejandro Trejo',  false, 55);
insert into actores (nombre,  protagonico, sueldo) values ('Grimanesa Jiménez',  false, 60);

DROP TABLE IF EXISTS teleseries;
CREATE TABLE teleseries
(
	id_teleserie serial primary key,
    nombre_teleserie varchar(255) NOT NULL,
     temporadas int
);
insert into teleseries (nombre_teleserie, temporadas) values ('soltera otra vez', 3);
insert into teleseries (nombre_teleserie, temporadas) values ('Papi Ricky', 3);

DROP TABLE IF EXISTS reparto_actores;
CREATE TABLE reparto_actores
(
    id_actor int NOT NULL,
    id_teleserie int not null,
   foreign key (id_actor) references actores(id_actor)
	on delete cascade,
	foreign key (id_teleserie) references teleseries(id_teleserie)
	on delete cascade,

	primary key (id_actor,id_teleserie)
);

select * from actores
join reparto_actores on actores.id_actor = reparto_actores.id_actor
join teleseries on teleseries.id_teleserie = reparto_actores.id_teleserie where protagonico = true