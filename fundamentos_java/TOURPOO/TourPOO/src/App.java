import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Destino miami = new Destino("Miami", 7, 5000);
        Destino can = new Destino("Canada", 10, 7000);
       
        //preguntar al usuario y crear 3 destinos distintos
        //Ir agregando los destinos a un array de largo 3 (con un for)
        // BONUS: preguntar al usuario, al unicio, cuantos destinos desea agregar
        Scanner in = new Scanner(System.in);
        System.out.println("¿Cuantos destinos desea agregar?");
        int cantidadDestinos = Integer.parseInt(in.nextLine());
        Destino [] destinos = new Destino[cantidadDestinos];
        for(int i  = 0 ; i < cantidadDestinos; i++){
            
            destinos[i] = destino(in);

        }
        for(int i = 0; i < cantidadDestinos; i++){
            System.out.println("Los destino ingresados son " + destinos[i].nombre+ " el gasto diario es: " + destinos[i].getGastoDiario());
        }
        in.close();

    }

    private static Destino destino ( Scanner in){
        System.out.println("Ingrese el destino del viaje");
            String nombreDestino = in.nextLine();
            System.out.println("Ingrese la cantidad de dias");
            int num_dias = convertirNumero(in.nextLine());
            if(num_dias == 0){
                System.out.println("Debe ingresar un numero válido");
            }
            System.out.println("Ingrese el presupuesto");
            float presupuesto = Float.parseFloat(in.nextLine());
            Destino d = new Destino(nombreDestino, num_dias, presupuesto);
            return d;

    }

    private static int convertirNumero (String numero){

        int numeroConvertido = 0;
        try {
             numeroConvertido = Integer.parseInt(numero);
            
        } catch (NumberFormatException e) {
            
            
            return 0;
        }
        return numeroConvertido;
        
    }
}
