Algoritmo promedio_alumno
	
	definir nombre_alumn Como Caracter
	Definir prom Como Real
	Definir n1,n2,n3,n4,n5 Como Real
	prom<-0.0;
	cant_notas<-1;
	Escribir " ingrese un nombre";
	Leer nombre_alumn
	Mientras cant_notas <= 5 Hacer
		Escribir "ingrese la nota: " cant_notas;
		Leer nueva_nota
		Si nueva_nota < 1.0 o nueva_nota > 7.0 Entonces
			prom = prom + nueva_nota
			cant_notas  =  cant_notas + 1
		SiNo
			Escribir "debe ingresar una nota valida entre 1.0 y 7.0"
		Fin Si
		
	Fin Mientras
	prom<- prom / 5
	Si prom < 3.0 Entonces
		Escribir "Reprobado"
	SiNo
		Si prom < 4.0 Entonces
			Escribir "pendiente"
		SiNo
			Escribir "aprobado"
		Fin Si
	Fin Si
	
	
FinAlgoritmo
