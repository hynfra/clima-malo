package clases;
import java.util.ArrayList;

public class Compania {

    private String nombre;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private int cantClientes = 0;
    private int cantMaxima;
    public Compania(String nombre, int cantMaxima) {
        this.nombre = nombre;
        this.cantMaxima = cantMaxima;
    }

    public void agregarClientes(Cliente c){
        clientes.add(c);
        this.cantClientes++;
    }

    private Cliente buscarCliente(String rut){
        for (Cliente cliente : clientes) {
            if (rut.equals(cliente.getRut())) {
                return cliente;
                
            }
        }
        return null;
    }
    public void modificarCliente(String rutCliente, String nuevoNum){
        Cliente buscado = buscarCliente(rutCliente);
        buscado.modificarCelular(nuevoNum);
    }
    
}
