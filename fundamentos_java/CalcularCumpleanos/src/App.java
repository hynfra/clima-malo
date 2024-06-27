
import java.util.InputMismatchException;
import java.util.Scanner;

import classes.*;

public class App {


    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Ingrese el año de nacimiento");
        int anio = Integer.parseInt(in.nextLine());
        System.out.println("Ingrese el mes de nacimiento");
        int mes = Integer.parseInt(in.nextLine());
        System.out.println("Ingrese el dia de nacimiento");
        int dia = Integer.parseInt(in.nextLine());
        System.out.println("Su edad actual es: " + Edades.getEdadActual(dia,mes,anio));
        System.out.println("Su proximo cumpleaños es en : " + Edades.diasProxCumple(dia,mes,anio));
        System.out.println("Usted tiene " + Edades.getDecadas(dia,mes,anio) + " Decadas");
        } catch (NumberFormatException e) {
            System.out.println("No sea imbecil, debe ser un numero"+ e.getMessage());
        }

        in.close();
        
    }
}
