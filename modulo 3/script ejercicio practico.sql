--1.- a quien le debo mas dinero y cuanto--
SELECT nombre,le_debo FROM  finanzas_personales  ORDER BY le_debo DESC LIMIT 1


--2.-quien(es) le debe mas dinero a ud. y cuanto--
SELECT nombre,me_debe FROM  finanzas_personales  ORDER BY me_debe DESC

--3.- cuanto dinero debe en total--
SELECT SUM(le_debo) FROM finanzas_personales
--4.- cuanto dinero debe en promedio--
SELECT AVG(le_debo) FROM finanzas_personales

--5.-suponiendo que no puede pagar mas de una cuota al mes ¿cuantos meses demoraria en salda su cuenta?--
SELECT SUM(cuotas_pagar) as cuotas_totales FROM finanzas_personales
SELECT SUM(cuotas_pagar)/12 as "Años", SUM(cuotas_pagar)%12 as "meses" from finanzas_personales

--6.--
--a--
SELECT sum(le_debo*cuotas_pagar) - sum(me_debe*cuotas_cobrar)    FROM finanzas_personales 
--b--
SELECT (sum(le_debo) - sum(me_debe))/sum(cuotas_pagar) as "cuota mensual" from finanzas_personales

SELECT * from finanzas_personales

--pregunta 7. problemas financieros de pareja--

insert into finanzas_personales values ('pareja',0,0,50000,1)

--señora del almacen--
update finanzas_personales set cuotas_pagar=13 
where nombre = 'almacen esquina'
--pregunta 10 --
select sum(le_debo / cuotas_pagar)
from finanzas_personales where cuotas_pagar <> 0