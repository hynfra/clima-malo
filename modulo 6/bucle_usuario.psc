Algoritmo bucle_usuario
	// escribir un programa que el usuario escriba el inicio, el fin y el tamaño del paso
	// el programa debe imprimir los numeros desde el inicio hasta el fin 
	// Extra: el programa debe estar preparado para el que el inicio sea mayor al FinAlgoritmo
	// inicio 4, fin 15 , paso 3
	Escribir "escriba el numero por el cual va a iniciar el bucle"
	leer inicio
	Escribir "escriba el numero por el cual va a finalizar el bucle"
	leer final
	Escribir "escriba de cuanto en cuanto avanzara el bucle"
	Leer  i
	
	
	Si inicio > final Entonces
		 i = i * -1
	FinSi
	
		Para pos<-inicio Hasta final Con Paso i Hacer
			Escribir "el bucle va en el ..." pos
		Fin Para
	
	
	
	
	
	
FinAlgoritmo
