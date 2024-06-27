import java.util.Scanner;

public class CasoPractico {

    static private double calcular_nota_final (double n1, double n2, double n3, double examen){
        double notaFinal = ((n1 + n2 + n3 ) / 3  ) * 0.6 + (examen * 0.4);
        return notaFinal;
    }

    static public void mostrarMenu(){

        Scanner in = new Scanner(System.in);
        String nombre = "";
        String apellido = "";
        String rut = "";
        int edad = 0;
        double notaFinal = 1.0;

        while (true) {
            
            String opciones = """
                    Elige una opcion: 
                    1.- ingrese datos personales
                    2.- elegir curso
                    3.- Ingresar notas
                    4.- imprimir resultados
                    5.- salir
                    """;
                    System.out.println(opciones);
                    String opcion = in.nextLine();


        }
    }

}
