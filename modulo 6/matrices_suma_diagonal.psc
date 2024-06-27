Algoritmo matrices_suma_diagonal
	Definir matriz Como entero
	Definir d1,d2 Como entero
	Dimension matriz[4,4];
	
	Para i <- 0 Hasta 3 Con Paso 1 Hacer
		Para j<- 0 Hasta 3 Con Paso 1 Hacer
			Escribir "ingrese el valor de  la matriz" 
			Leer valorUsuario
			matriz[i,j] <- valorUsuario
		Fin Para
	Fin Para
	
	
	d1<- matriz[0,0] + matriz[1,1] + matriz[2,2] + matriz[3,3]
	
	d2<- matriz[0,3] + matriz[1,2] + matriz[2,1] + matriz[3,0]
	Para i <- 0 Hasta 3 Con Paso 1 Hacer
		Para j<- 0 Hasta 3 Con Paso 1 Hacer
			Escribir "los valores ingresados en la matriz son: " matriz[i,j]
			
		Fin Para
	Fin Para
	
	Escribir "la diagonal 1 tiene como suma el valor: "  d1
	Escribir "la diagonal 2 tiene como suma el valor: "  d2
	total <- d1 + d2
	Escribir  "el total de las diagonales es: " total
	// establecer las diagonales en caso de que no se sepa el largo de la matriz
	d3 <- 0
	d4 <- 0 
	Para i <- 0 Hasta 3 Con Paso 1 Hacer
		d3 = d3 + matriz[i,i]
		d4 = d4 + matriz[i,3-i]
	Fin Para
	total2 <- d3 + d4
	Escribir total2
	
FinAlgoritmo
