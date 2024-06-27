import classes.Leccion2;

public class App {
    public static void main(String[] args) throws Exception {

        int[] numeros = {4,7,0,-2,10,103};
         int [] numOrdenado = Leccion2.pares_impares2(numeros);
        for(int i = 0 ; i < numOrdenado.length; i++){
            System.out.println("numero " + i + ": " + numOrdenado[i]);
        }
    }
}
