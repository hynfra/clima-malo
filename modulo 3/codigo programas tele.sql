create table tv_shows(

	id serial primary key,
	nombre varchar(50) not null,
	audiencia char(2) not null default 'PG',
	genero varchar (50) not null default 'indefinido',
	num_capitulos int


);

create table canales(

	id serial primary key,
	nombre varchar(50) not null,
	frecuencia_nacional int,
	canal_cable int

);

create table personajes(

	id serial primary key,
	nombre varchar(50) not null,
	estatura float,
	especie varchar(50) not null default 'no conocida',
	tv_show_id int not null,
	foreign key (tv_show_id) references tv_shows(id)
	on delete cascade
);

-- en caso de relaciones muchos a muchos, se crea una nueva tabla --
create table shows_canales(

	tv_show_id int not null,
	canal_id int not null,
	foreign key (tv_show_id) references tv_shows(id)
	on delete cascade,
	foreign key (canal_id) references canales(id)
	on delete cascade,
	primary key (tv_show_id,canal_id)
);