package classes;

public class Leccion2 {

    static private boolean esPar(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    static public int [] pares_impares(int [] nums){
        // Este metodo debe dejar los numeros pares al inicio, y los numeros impares al final
        //[4,7,0,-2,10,103] => [4,0, -2 , 10 , 7, 103]
        // BONUS: hagalo sin crear un arreglo nuevo

        if(nums.length <= 1){
            return nums;
        }
        for(int i = 0 ; i < nums.length -1 ; i++){

            int actual = nums[i];
            int sgte = nums[i + 1];
            // si el actual es impar y el siguiente es par entonces los damos vuelta
            if (esPar(actual) && esPar(sgte)) {
                nums[i] = sgte;
                
                
            }

        }
        return  nums;

    }
    static public int [] pares_impares2(int [] nums){


        if(nums.length <= 1){
            return nums;
        }


        int [] ordenados = new int[nums.length];

        // agregamoss los numeros pares
        int pos = 0;
        for(int num : nums){

            if (esPar(num)) {
                ordenados[pos] = num;
                pos++;
                
            }

        }

        for(int num : nums){

            if (!esPar(num)) {
                ordenados[pos] = num;
                pos++;
                
            }

        }
        return ordenados;
    }


}
