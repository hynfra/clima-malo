Algoritmo programa_para_saludar
	
	Definir opcion, num, doble como entero;
	
	
	Escribir "opcion 1 - doble de un numero";
	Escribir "Opcion 2 - longitud de un texto";
	Escribir "Opcion 3 - Suma de dos numeros enteros"
	Escribir "ingrese una opcion"
	Leer opcion;
	Segun opcion Hacer
		1:
			Escribir "ingrese un numero"
			Leer num
			doble = num * 2
			Escribir "El doble de su numero es", doble
		2:
			Escribir "Escriba un texto"
			leer texto
			Escribir  "la longitud de su texto es " Longitud(texto)
		3:
			Escribir "ingrese un numero"
			Leer num
			Escribir "ingrese un segundo numero"
			Leer num2
			
			Escribir "el resultado de la suma los numeros es: " num + num2
		De Otro Modo:
			Escribir "debe escoger una de las opciones"
	Fin Segun
	
FinAlgoritmo
