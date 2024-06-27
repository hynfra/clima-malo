Funcion   notas(promedio Por Referencia)
	definir notasTotales como entero
	Para i <- 1 Hasta 5 Con Paso 1 Hacer
		Escribir "Ingrese nota " i 
		Leer nota
		Si nota <= 3 Entonces
			Escribir "Debe poner una nota por sobre 3"
			i  = i - 1
		SiNo
			Si nota >= 6 Entonces
				Escribir "Debe poner una nota debajo de 6"
				i  = i - 1
			SiNo
				notasTotales = notasTotales + nota
			Fin Si
		Fin Si
		
	Fin Para
	promedio = notasTotales / 5
	
Fin Funcion

Funcion  nombreyApellido (nombre Por Referencia, apellido Por Referencia) 
	Escribir "Ingrese el nombre"
	Leer nombre
	Escribir "ingrese el apellido"
	Leer apellido
	
Fin Funcion

Funcion opcionElegida <- mostrarMenu
	Escribir "Ingrese una opción"
	Escribir "1.- nombre y apellido"
	Escribir "2.- Ingrese nota. Minimo 3 y máximo 6"
	Escribir "3.- mostrar los datos del alumno. Nombre, prom y estado de aprobación"
	Escribir "Cerrar la aplicación "
	
FinFuncion


Algoritmo ejercicio_practico_notas
	Definir promedio Como Entero
	definir nombre,apellido Como Caracter
	nombreyApellido(nombre, apellido)
	notas(promedio)
	
	Escribir "la opcion elegida es: " opcion_e
	Si promedio > 4 Entonces
		Escribir "El usuario " nombre " con apellido " apellido " ha aprobado con promedio " promedio
	SiNo
		Escribir "El usuario " nombre " con apellido " apellido " ha reprobado, con promedio " promedio
	Fin Si
	Escribir "Muchas gracias por usar la aplicación"
	
	
	
FinAlgoritmo
