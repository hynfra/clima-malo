create table departamentos(

	numero int primary key,
	nombre varchar(15) unique,
	rut_gerente varchar(12),
	ger_f_inic date

);

create table empleados(
	
	rut varchar(12) primary key,
	nombre varchar(15) not null,
	pr_apellido varchar(15) not null,
	se_apellido varchar(15) not null,
	f_nac date not null,
	direccion varchar(30) not null,
	sexo char(10) not null,
	sueldo int not null,
	rut_supervisor varchar(12),
	departamento_num int not null,
	foreign key (departamento_num) references departamentos(numero),
    foreign key (rut_supervisor) references empleados(rut)

);

alter table departamentos add constraint llave_fo foreign key (rut_gerente) references empleados(rut);

create table proyectos(

	nombre varchar(15) unique,
	numero serial primary key,
	ubicacion varchar(15),
	departamento_num int not null,
	foreign key (departamento_num) references departamentos(numero)
	on delete restrict
);

create table trabaja_en(
	
	emp_rut varchar(12) not null,
	proy_num int not null,
	horas int not null,
	foreign key (emp_rut) references empleados(rut)
	on delete cascade,
	foreign key (proy_num) references proyectos(numero)
	on delete cascade,

	primary key (emp_rut,proy_num)


);

create table ubicaciones_depto(
	
	
	numero int not null,
	ubicacion varchar(15) not null,
	foreign key (numero) references departamentos(numero),
	primary key (numero,ubicacion)
	
);

create table carga_fam(

	emp_rut varchar(12) not null,
	nombre_carga varchar(15) not null,
	sexo char(1) not null,
	fecha_nac date not null,
	parentesco varchar(8) not null,
	foreign key (emp_rut) references empleados(rut),
	primary key (emp_rut,nombre_carga)


);

--pregunta 1 -- 
select nombre,pr_apellido,sr_apellido from empleados 
 JOIN departamentos on departamentos.rut_gerente = empleados.rut



