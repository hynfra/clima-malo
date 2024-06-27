import java.util.ArrayList;
import java.util.Scanner;

public class Leccion3 {

    

    public static void main(String[] args) {
        ArrayList <String> nombres = new ArrayList<String>();
    ArrayList <Integer> edades = new ArrayList<Integer>();
    ArrayList <Double> notas = new ArrayList<Double>();

    Scanner in = new Scanner(System.in);
        
        while (true) {

            System.out.println("Ingrese el nombre, o 0 para terminar");
            String nombre = in.nextLine();
           
            if(nombre.equals("0")){
                continue;
            }

            System.out.println("Ingrese la edad del estudiante");
            String edad_str = in.nextLine();
            int edad = 0;
            try {
                edad = Integer.parseInt(edad_str);
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un valor númerico");
                continue;
            }
            
           

            System.out.println("Ingrese la nota obtenida");
            String nota_str = in.nextLine();
            double nota = 0;
            try {
                nota = Double.parseDouble(nota_str);
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un valor númerico");
                continue;
            }

            nombres.add(nombre);
            edades.add(edad);
            notas.add(nota);
            
        }
    }

}
