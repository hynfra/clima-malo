Algoritmo primer_matriz
	Definir matriz Como Caracter
	Dimension matriz[4,4];
	matriz[0,0] <- "wenaa choro";
	matriz[0,1] <- "holo";
	matriz[0,2] <- "uy";
	matriz[0,3] <- "mmmm nadaa";
	
	matriz[1,0] <- "howdy";
	matriz[1,1] <- "hello";
	matriz[1,2] <- "whats up";
	matriz[1,3] <- "hi";
	
	matriz[2,0] <- "konichiwa";
	matriz[2,1] <- "konbanwa";
	matriz[2,2] <- "ohayoh";
	matriz[2,3] <- "mata me";
	
	matriz[3,0] <- "wie geth es dir heute";
	matriz[3,1] <- "hallo wwie fülst du dich";
	matriz[3,2] <- "guten abend";
	matriz[3,3] <- "aufiedersen";
	
	Para i <- 0 Hasta 3 Con Paso 1 Hacer
		Para j<- 0 Hasta 3 Con Paso 1 Hacer
			Escribir matriz[i,j]
		Fin Para
	Fin Para
FinAlgoritmo
