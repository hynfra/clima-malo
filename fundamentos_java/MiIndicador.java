import java.util.Scanner;

public class MiIndicador {
    /*
     * el programa pide la cantidad de pesos
     * preguntar que desea hacer. Escriba 1, 2 o 3
     * de pesos a dolar
     * de pesos a UFs
     * de pesos a Euros
     * El programa responde con la unidad solicitada
     * requisitos: usar otras funciones ademas del 'main'
     */

    public static double convertirPesos(int pesos, int opcion) {
        double precio_dolar = 980.19;
        double precio_uf = 36856.50;
        double precio_euro = 1062.54;
        switch (opcion) {
            case 1:
                double dolares = pesos / precio_dolar;
                return dolares;

            case 2:
                double ufs = pesos / precio_uf;
                return ufs;
            case 3:

                double euros = pesos / precio_euro;
                return euros;

            default:
                return 0;

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion = -1;
        int pesosIngresados = 0;
        while (opcion != 0) {
            System.out.println("Bienvenido al convertidor de pesos ");
            System.out.println("Ingrese la cantidad de pesos a convertir");
            pesosIngresados = in.nextInt();
            
            System.out.println("Ingrese una de las opciones: ");
            System.out.println("opcion 1.- Convertir de  pesos a dolares");
            System.out.println("opcion 2.- Convertir de  pesos a UFs");
            System.out.println("opcion 3.- Convertir de  pesos a euros");
            System.out.println("opcion 0.- Salir del programa");
            opcion = in.nextInt();
            

            double pesoConvertido = convertirPesos(pesosIngresados, opcion);

            switch (opcion) {
                case 0:
                System.out.println("Saliendo del programa...");
                break;
                case 1:
                    System.out.println("la cantidad: " + pesosIngresados + " pesos a dolares es: $" + pesoConvertido);
                    break;

                case 2:
                    System.out.println("la cantidad: " + pesosIngresados + " pesos a UFs es: " + pesoConvertido);

                    break;
                case 3:
                    System.out.println("la cantidad: " + pesosIngresados + " pesos a euros es: " + pesoConvertido);

                    break;

                default:
                    System.out.println("Debe ingresar una de las opciones mencionadas");
                    break;
            }

        }
        in.close();

    }

}
