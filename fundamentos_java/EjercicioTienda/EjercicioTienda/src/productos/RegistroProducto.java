package productos;
import java.util.ArrayList;

public class RegistroProducto {

    private ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    public void agregarProducto(Producto p){

        if(p != null){
            listaProductos.add(p);
        }
        

    }

    public Producto buscarProducto(String codProducto){
        if(listaProductos.size() > 0){
            for (Producto producto : listaProductos) {
                if(producto.getCod().equalsIgnoreCase(codProducto)){
                    return producto;
                }
            }
            return null;
        }else{
            return null;
        }
    }

    public void mostrarProductos(){
        for (Producto producto : listaProductos) {

            System.out.println(producto.imprimir());
            
        }
    }

    public void eliminarProducto( String codProducto){
        if (listaProductos.size() > 0) {
            for (Producto producto : listaProductos) {
                if (producto.getCod().equalsIgnoreCase(codProducto)) {
                    listaProductos.remove(producto);
                    return;
                }
            }
        }
    }
}
