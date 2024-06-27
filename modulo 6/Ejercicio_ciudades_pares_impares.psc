Algoritmo Ejercicio_ciudades_pares_impares
	//crear arreglo de 10 ciudades y preguntar al usuario si quiere recorrer la ciudades pares o impares
	// elige "p" para recorrer ciudades pares. "i" para recorrer ciudades impares
	Dimension vacaciones[10]
	vacaciones[0] = "Sao paulo"
	vacaciones[1] = "Ibiza"
	vacaciones[2] = "Houston"
	vacaciones[3] = "Venecia"
	vacaciones[4] = "Berlin"
	vacaciones[5] = "Santiago"
	vacaciones[6] = "Ottawa"
	vacaciones[7] = "Barcelona"
	vacaciones[8] = "Moscu"
	vacaciones[9] = "Tokyo"
	Escribir "Seleccione los paises que quiere recorrer. escriba P para ver las ciudades pares  o I para las ciudades pares "
	Leer pais
	i = 0
	Mientras i < 10 Hacer
		Si pais = "p" Entonces
			Si i % 2 = 0 Entonces
				Escribir "ha seleccionado los paises pares: " vacaciones[i]
			Fin Si
		SiNo
			Si pais = "i" Entonces
				Si i % 2 = 1 Entonces
					Escribir "ha seleccionado los paises impares: " vacaciones[i]
				Fin Si
			Fin Si
			
		Fin Si
		i = i +1
	Fin Mientras
FinAlgoritmo
