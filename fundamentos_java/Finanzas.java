import java.util.Scanner;

public class Finanzas {
    //crear una nueva clase llamada finanzas
    // le pregunte al usuario cuanto desea ganar
    // le responda el monto bruto
    // debe tener una funcion llamada calcularBruto
    // EXTRA: pregunte si la boleta exenta
    public static int   calcularBruto(int liquido){
        double retencion = 0.1375;

        int montoBruto = (int) (liquido / (1 - retencion));
        return  montoBruto;
    }


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de finanzas.");
        System.out.println("Ingrese el monto que desea ganar");
        int monto = in.nextInt();
        int montoBruto = calcularBruto(monto);
        Scanner in2 = new Scanner(System.in);
        System.out.println("¿Es boleta exenta? responda SI o NO");
        String respuesta = in2.nextLine().trim();
        if(respuesta.equalsIgnoreCase("si")){

            System.out.println("El monto bruto de lo que desea ganar con boleta exenta es: " + monto);

        }else if(respuesta.equalsIgnoreCase("no")){
            System.out.println("El monto bruto de lo que desea ganar es: " + montoBruto);

        }else{
            System.out.println("Debe poner una opcion de las descritas");
        }
       

        
        in.close();
        in2.close();
    }
}
