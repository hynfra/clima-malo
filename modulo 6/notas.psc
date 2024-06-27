Algoritmo notas
	definir nombre Como Caracter
	definir n1,n2,n3,n4,n5, promedio Como Real
	Escribir "ingrese el nombre del alumno"
	Leer nombre
	Escribir "ingrese la primera nota"
	leer n1
	escribir "ingrese la segunda nota"
	leer n2
	escribir "ingrese la tercera nota"
	leer n3
	escribir "ingrese la cuarta nota"
	leer n4
	escribir "ingrese la quinta nota"
	leer n5
	Si n1 =! Real y n2 =! Real y n3 =! Real y n4 =! Real y n5 =! Real Entonces
		Escribir "Debe ingresar un numero valido"
	SiNo
		Si n1 > 7.0 o n1 < 1.0 o n2 > 7.0 o n2 < 1.0 o n3 > 7.0 o n3 < 1.0  o n4 > 7.0 o n4 < 1.0 o n5 > 7.0 o n5 < 1.0    Entonces
			escribir "Debe ingresar una nota valida"
		SiNo
			promedio = (n1 + n2 + n3 + n4 + n5) / 5
			Si promedio > 7.0 y promedio < 1.0 Entonces
				Si promedio > 4.0 Entonces
					Escribir " el alumno " nombre " ha sido aprobado"
				SiNo
					Si promedio > 3.0 Entonces
						Escribir  " el alumno " nombre " ha quedado pendiente"
					SiNo
						Escribir  " el alumno " nombre " ha reprobado"
					Fin Si
				Fin Si
			SiNo
				Escribir "debe poner notas válidas"
			Fin Si
		Fin Si
		
		
	Fin Si
	
	
FinAlgoritmo
