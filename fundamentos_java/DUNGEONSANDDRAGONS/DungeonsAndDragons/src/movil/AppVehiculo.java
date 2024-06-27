public class AppVehiculo {
    public static void main(String[] args) throws Exception{
        Vehiculo vehiculo1 = new Vehiculo(1600, "Nissan", "V16", 15);
        Vehiculo vehiculo2 = new Vehiculo(1600, "kia", "morning",true, 12l);

        int kms = Integer.parseInt(Util.leer("Ingrese la distancia a recorrer (en kms)"));

        System.out.println("En un nissan v16 gastará un total de " + vehiculo1.getConsumo(kms) + " litros de combustible");
    }

}
