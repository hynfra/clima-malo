package productos;
public class App {
    public static void main(String[] args) throws Exception {
        
        Lavadora lavadora = new Lavadora("2345", 150000, 10, "Mademsa","f");
        Pantalon pantalon = new Pantalon("1", 5000, 10, "jeans", "m");
        Refrigerador refrigerador = new Refrigerador("78", 60000, 10, "Dell", 14);

        //System.out.println(" lavadora: " + lavadora.imprimir() + "\n pantalon: " + pantalon.imprimir() + "\n refrigerador: " + refrigerador.imprimir());

        RegistroProducto registros = new RegistroProducto();

        registros.agregarProducto(pantalon);
        registros.agregarProducto(lavadora);
        registros.agregarProducto(refrigerador);
       
        registros.eliminarProducto("1");
       registros.mostrarProductos();

    }
}
