Funcion FizzBuzz ( inicio, final )
	definir paso Como Entero
	Si inicio > final Entonces
		inicio = inicio *(-1)
	Fin Si
	Para i<-inicio Hasta final Con Paso 1  Hacer
		
		Si i % 3 = 0 y i % 5 = 0 Entonces
			Escribir "FizzBuzz"
		SiNo 
			Si i % 3 = 0 Entonces
				Escribir "fizz"
			SiNo
				Si i % 5 = 0 Entonces
					Escribir "buzz"
				SiNo
					Escribir "numero... " i
				Fin Si
			Fin Si
			
			
		Fin Si
		
	Fin Para
	
	
Fin Funcion

// 1.- crear la funcion FizzBuzz, que imprima los numeros del 1 al 100
// 2.- los multiplos de 3 se reemplazan por "Fizz" y los de 5 por "buzz"
//3.- los multiplos de 3 y 5 a la vez se reemplazan por "FizzBuzz"



Algoritmo funciones
	 FizzBuzz(100,1)
	
	
	
FinAlgoritmo
