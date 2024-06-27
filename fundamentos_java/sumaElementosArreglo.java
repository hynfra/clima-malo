import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class sumaElementosArreglo {
    public static void main(String[] args) {
        int [] arreglo = {20,5,4,68,9}; // ejemplo de arreglo
        // se llama a la funcion sumaArreglos

        String [] arregloStr = {"42","hola","4","Liam", "Jose"};

        System.out.println("El penultimo el elemento del array es: " + penultimo(arregloStr));
        System.out.println("El segundo numero mas alto del array es: " + segundoElementoMasAlto(arreglo));
        System.out.println("El elemento que se encuentra en el 3 es: " + n_ultimo(arregloStr, 3));
        duplicado(arregloStr);

        /* 
        int suma = sumaElementos(arreglo);
        int multi = multiplicacionElementos(arreglo);

        System.out.println("La suma de elementos es: " + suma);
        System.out.println("La multiplicación de elementos es: " + multi);

        */
    }
    public static int sumaElementos(int[] arr){
        int suma = 0;
        for(int i = 0; i < arr.length;i++){
            suma += arr[i];
        }
        return suma;
    }
    public static int multiplicacionElementos(int[] arr){
        int multi = 1;
        for(int i = 0; i < arr.length;i++){
            multi *= arr[i];
        }
        return multi;
    }
    //penultimo(String [] arr): Devuelve el penúltimo elemento del array. Dado ["42","hola","4",”Liam”, "Jose"] 
    //devuelve “Liam”. Si el array es muy pequeño, devuelve null.
    public static String penultimo(String[] arr){
        String penultimo = "";
        if(arr.length <= 1){
            return null;
        }
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length -2 ){
                penultimo = arr[i];
            }
        }
        return penultimo;
    }
    
    /*
     * segundo: Devuelve el segundo elemento más grande de un array. Dado [42,1,4,3.14,7], devuelve 7. 
     *  Si el array es muy pequeño, devuelve null.
     */
    public static int segundoElementoMasAlto(int[] numeros){
        int segundoElementoMasAlto = 0;
        if(numeros.length <= 0){
            return 0;
        }

       Arrays.sort(numeros);

       for(int i = 0 ; i < numeros.length; i++){

        segundoElementoMasAlto = numeros[numeros.length -2];
       }
       return segundoElementoMasAlto;

        
        
    }

     /*
      * n_ultimo(String [] arr, int pos): Devuelve el elemento “N” último. Dado
       (["hola", "hello", "hallo", "Bonjour"],2], devuelve "hello". Si el array es muy pequeño, 
       devuelve null. 
      */

      public static String n_ultimo(String [] arr, int pos){
        int largo_arr = arr.length;
        return arr[largo_arr - pos - 1];
        

      }
      /*
       * Doble Problema Par: Crea una función que cambie un array dado duplicando cada uno de sus elementos
       *  y manteniendo el orden original. Convierte [ "Ulysses", "Pedro"]  
       *  a    ["Ulysses", "Ulysses", "Pedro", "Pedro"]. 
       */
      public static void duplicado(String[] arr){

        String [] nuevo = new String[arr.length *2];
       
        
        for(int i = 0; i < arr.length; i++){
            nuevo[i *2] = arr[i];
            nuevo[i * 2 + 1] = arr[i];

        
        }
        for(int i = 0; i < nuevo.length; i++){
            System.out.println("El duplicado es: " + nuevo[i]);
        }

        

      }
}
