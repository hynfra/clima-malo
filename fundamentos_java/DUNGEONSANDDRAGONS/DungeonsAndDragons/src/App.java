import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Moto m = new Moto(150, "suzuki", "GSX", 14, false);
        Ambulancia a = new Ambulancia(150, "kia", "ambulancia", 15, false);
        Vehiculo v = new Vehiculo(150, "Nissan", "v16", 14);
        Vehiculo [] vehiculos = {m,a,v};

        for (Vehiculo ve : vehiculos) {

            System.out.println(" %s".formatted(ve.getVehiculo()));
            
        }

        

        
       

        
        
    }
}
