package productos;
public class Refrigerador extends Electrodomestico {

    private double pies;

    public Refrigerador(String cod, int precioBase, int stock, String marca, double pies) throws Exception {
        super(cod, precioBase, stock, marca);
        this.pies = pies;
    }

   

    public double getPies() {
        return pies;
    }

    public void setPies(double pies) {
        this.pies = pies;
    }

    @Override
    public double calcularTotal(int cantidad, String horario) throws Exception {
        if (validarStock(cantidad)) {
            double precio = (cantidad*getPrecioBase())*iva - this.calcularDescuento(horario);

            return precio;
            
        }else{
            throw new Exception("No hay Refrigeradores");
        }
        
    }

    @Override
    public String imprimir() {
        return """
            El codigo del refrigerador es %s, precio: %s, marca: %s, pies: %s
            """.formatted(this.getCod(), this.getPrecioBase(), this.getMarca(), this.getPies());
    }

    @Override
    public double calcularDescuento(String horario) {
        if(horario.equalsIgnoreCase("diurno")){
            return 0.18;
        }else if (horario.equalsIgnoreCase("vespertino")) {
            return 0.20;
        }else{
            return 0;
        }
    }
    

}
