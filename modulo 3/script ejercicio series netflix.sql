

select * from series_netflix;
--pregunta 1--
insert into series_netflix (nombre, temporadas, genero, anio_estreno) values ('Black Mirror', 5, 'Ciencia ficción', 2011);

insert into series_netflix (nombre, temporadas, genero, anio_estreno) values ('Arcane', 1, 'Ciencia ficción', 2019);
insert into series_netflix (nombre, temporadas, genero, anio_estreno) values ('doctor house', 8, 'Drama', 2001);

insert into series_netflix (nombre, temporadas, genero, anio_estreno) values ('Stranger things', 4, 'Drama', 2019);
insert into series_netflix (nombre, temporadas, genero, anio_estreno) values ('naruto', 8, 'Animacion', 1998);
insert into series_netflix (nombre, temporadas, genero, anio_estreno) values ('evangelion', 5, 'Animacion', 1995);
insert into series_netflix (nombre, temporadas, genero, anio_estreno) values ('the walking dead', 12, 'Drama', 2011);
insert into series_netflix (nombre, temporadas, genero, anio_estreno) values ('one piece live action', 1, 'Ciencia ficción', 2022);
insert into series_netflix (nombre, temporadas, genero, anio_estreno) values ('breaking bad', 5, 'drama', 2011);
insert into series_netflix (nombre, temporadas, genero, anio_estreno) values ('narcos', 3, 'Animacion', 2011);

-- pregunta 2 --
SELECT * FROM series_netflix where temporadas > 3 order by anio_estreno desc


-- pregunta 3 --
SELECT min(anio_estreno) FROM series_netflix  

--pregunta 4--
SELECT max(anio_estreno) FROM series_netflix 
--pregunta 5--

SELECT avg(anio_estreno) FROM series_netflix 
--pregunta 6--

SELECT round(avg(temporadas)) as "promedio temporadas" FROM series_netflix 

--pregunta 7--
SELECT * FROM series_netflix where temporadas in (1,2,4,5,7)
--pregunta 8 --
SELECT * FROM series_netflix where temporadas  not in (1,2,4,5,7)
--pregunta 9 --
DELETE * FROM series_netflix where anio_estreno > 2010
--pregunta 11 --
insert into series_netflix (nombre, temporadas, genero, anio_estreno) values ('Vinland saga', 2, 'Animacion', 2020)
--pregunta 12 --
SELECT * FROM series_netflix WHERE anio_estreno BETWEEN 2005 and 2020
--pregunta 13 --
SELECT * FROM series_netflix WHERE nombre LIKE 'B%e'
-- pregunta 14 -- 

SELECT * FROM series_netflix where (anio_estreno + temporadas) > 2010



