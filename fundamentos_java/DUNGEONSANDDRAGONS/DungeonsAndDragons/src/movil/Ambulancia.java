public class Ambulancia extends Vehiculo{

    public Ambulancia(int motor, String marca, String modelo, float rendimiento, boolean autom){
        super(motor, marca, modelo, rendimiento);
    }

    public void sonarSirena(){
        System.out.println("WIU WIU WIU");
        System.out.println("PAPU PAPU");
        System.out.println("UUUIII");
    }

}
