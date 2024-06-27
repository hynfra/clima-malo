import clases.*;

public class App {
    public static void main(String[] args) throws Exception {
       Servicio servicioBasico = new Servicio("qwert","celular");

       Celular celMio = new Celular("MOB", "celular", "930686922", "Samsung");

       Cliente cliente = new Cliente("19375303-0", "matias", 27, 'M', celMio);
       System.out.println(cliente);


    }
}
