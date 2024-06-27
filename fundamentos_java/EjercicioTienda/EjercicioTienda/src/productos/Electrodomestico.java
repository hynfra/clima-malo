package productos;
public abstract class Electrodomestico extends Producto implements IPedidoDescontable{

    private String marca;



    public Electrodomestico(String cod, int precioBase, int stock, String marca) throws Exception {
        super(cod, precioBase, stock);
        if(marca.length() <= 2){
            throw new Exception("La marca debe tener mas de 2 o mas caracteres");
        }
        this.marca = marca;
    }



    public String getMarca() {
        return marca;
    }



    public void setMarca(String marca) {
        this.marca = marca;
    }

    

    

}
