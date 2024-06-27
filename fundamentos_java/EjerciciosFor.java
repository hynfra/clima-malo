public class EjerciciosFor {
    /*
    sigma - Implementa una función sigma(num) que, dado un número, 
    devuelve la suma de todos los enteros positivos (incluyendo el número dado). Ej: sigma(3) = 6 (1+2+3);
     sigma(5) = 15 (1+2+3+4+5).
    */ 
    public static int sigma(int num){
        int sigma = 0;
        for(int i = 1 ; i <= num; i++){

            sigma += i;           
        }
        return sigma;
    }
    /*
     * factorial - Escribe una función factorial(num) que, dado un número, devuelva el producto 
     * (multiplicación) de todos los enteros positivos (incluyendo el número dado). 
     * Por ejemplo: factorial(3) = 6 (123); factorial(5) = 120 (12345).
     */
    public static int factorial (int num){
        int factorial = 1;
        for(int i = 1 ; i <= num; i++){

            factorial = factorial * i;
                      
        }
        return factorial;
    }

    /*
     * fibonacci - Crea una función para generar números de Fibonacci. En esta famosa secuencia matemática,
     *  cada número es la suma de las dos anteriores, partiendo con los valores 0 y 1. 
     * Tu función debería aceptar un argumento, un índice en la secuencia 
     * (donde 0 corresponde al valor inicial, 4 corresponden al valor cuatro más tarde, etc).
     *  Ejemplos: fibonacci(0) = 0 (dado), fibonacci(1) = 1 (dado), fibonacci(2) = 1 (fib(0)+fib(1), o 0+1),
     *  fibonacci(3) = 2 (fib(1) + fib(2)3, o 1+1), fibonacci(4) = 3 (1+2), fibonacci(5) = 5 (2+3), fibonacci(6) = 8 (3+5), fibonacci(7) = 13 (5+8). 
     * Haz esto primero sin usar recursión. Si no sabes qué es una recursión, 
     * no te preocupes puesto que vamos a introducir este concepto en la Parte 2 de esta actividad.
     */
    public static int fibonacci(int pos){
        
        if(pos == 1 || pos == 2){
            return 1;
        }
        /* 
        int anterior = 1;
        int anteanterior = 1;
        int num = 0;
        for(int i = 3 ; i <=pos; i++){
            num = anterior + anteanterior;
            anteanterior = anterior;
            anterior = num;
        }
        return num; //
        */

        return fibonacci(pos -1) + fibonacci(pos -2);
    }

    public static void main(String[] args) {
        
        System.out.println("La suma del ejercicio sigma es: " + sigma(5));
        System.out.println("La suma del ejercicio factorial es: " + factorial(3));
        System.out.println("La suma del ejercicio fibonacci es: " + fibonacci(5));

        String [] animes = new String[10];
        animes[0] = "Naruto";
        animes[1] = "pokemon";
        animes[2] = "evangelion";
        animes[3] = "dragon ball";
        animes[4] = "caballeros del zodiaco";
        animes[5] = "gundam";
        animes[6] = "remi";
        animes[7] = "hantaro";
        animes[8] = "diego y glot";
        animes[9] = "totoro";
        for(int i = 0; i < animes.length; i++){

            System.out.println(animes[i]);
        }

    }
}
