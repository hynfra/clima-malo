import java.util.Scanner;

public class Promedio {

    public static float volumenCilindro( int radio, int altura){
        // PI por ERRE CUADRADO  por ALTURA
        int areaBase = (int) ((radio*radio)*Math.PI);
       return areaBase * altura; 
    }
    public static void main(String[] args) {
        int nota1,nota2,nota3,nota4;
        nota1 = 2;
        nota2 = 6;
        nota3 = 4;
        nota4 = 7;

        double promedio = (nota1 +nota2 +nota3 +nota4) / 4;

        String mensaje = "El promedio de las 4 notas es " + promedio;
        promedio = promedio + 5;

        promedio+=5;
        promedio++;
        System.out.println(mensaje);

        //boolean x = !((3 > 4) && ((-8 < 0) || (5 > 2+2)));

        // || es un o
        // && es un y
        // ! es la negacion a una expresion
        // creamos un scanner para leer los datos del usuario
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el radio del cilindro");
        int radio = in.nextInt();
        System.out.println("Ingrese la altura del cilindro");
        int altura = in.nextInt();

       float volumenCilindro= volumenCilindro(radio, altura);
       System.out.println("El volumen del cilindro es: " + volumenCilindro);
       in.close();
    }
}
