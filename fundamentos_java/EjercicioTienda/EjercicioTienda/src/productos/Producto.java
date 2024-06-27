package productos;
public abstract class Producto {
    private String cod;
    private int precioBase,stock;
     static final double iva = 0.19;

    
    public Producto(String cod, int precioBase, int stock) throws Exception {
        this.cod = cod;
        if(precioBase >= 0){
            this.precioBase = precioBase;

        }else{
            throw new Exception("Precio ingresado no valido");
        }
        
        this.stock = stock;
       
    }
    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }
    public int getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    abstract public double calcularTotal(int cantidad, String horario) throws Exception;
    
    public boolean validarStock(int cantidad){


        if (cantidad <= this.getStock()) {
            return true;
        }

        return false;

    }

    public abstract String imprimir();
    
    

}
