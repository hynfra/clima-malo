
--pregunta 1--
SELECT * FROM bandas
join discos on discos.nombre_banda=bandas.nombre
where anio_disco >2000 and bandas.pais not in ('Alemania')


--pregunta 2--
SELECT * FROM discos
join bandas on bandas.nombre=discos.nombre_banda
where bandas.pais = 'UK' and bandas.nombre like ('%s') order by anio_disco desc limit 1

-- pregunta 3 --
SELECT * FROM bandas
join discos on discos.nombre_banda=bandas.nombre
where nombre like ('%k%') and anio_disco > 1999 and pais in('Alemania');

-- pregunta 4 --
SELECT nombre, count(anio_disco) as numero_discos FROM discos
join bandas on bandas.nombre=discos.nombre_banda group by nombre 

--pregunta 5 --
SELECT nombre, anio_disco FROM discos
join bandas on bandas.nombre=discos.nombre_banda order by anio_disco

--pregunta 6 --
SELECT nombre,nombre_disco  FROM bandas
join discos on discos.nombre_banda=bandas.nombre
where nombre_disco like('A%')
--pregunta 7 --
SELECT nombre,nombre_disco  FROM bandas
join discos on discos.nombre_banda=bandas.nombre
where nombre_disco like ('% %')

--pregunta 8 --
SELECT nombre, count(anio_disco) as numero_discos FROM discos
join bandas on bandas.nombre=discos.nombre_banda where nombre_disco like ('% %') group by nombre 

insert into bandas (nombre, pais) values ('Las Olas','Shile')

update bandas set pais='Chile'
where pais ='Shile'

SELECT * FROM discos