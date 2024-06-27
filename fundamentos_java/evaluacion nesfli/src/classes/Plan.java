package classes;

public class Plan {

    private String nombre;
    private int precio;
    
    public Plan(String nombre, int precio) throws Exception {
        if (nombre.length() < 10) {
            throw new Exception("El largo del nombre no debe ser menor que 10");
        }
        if(precio < 1 || precio > 20000){
            throw new Exception("El precio debe ser positivo y no superar los $20000");
        }
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    

}
