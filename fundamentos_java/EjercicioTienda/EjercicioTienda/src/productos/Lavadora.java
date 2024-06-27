package productos;
public class Lavadora extends Electrodomestico {


   

    private String carga;

    

    

    public Lavadora(String cod, int precioBase, int stock, String marca, String carga) throws Exception {
        super(cod, precioBase, stock, marca);
        if(carga.equalsIgnoreCase("a") || carga.equalsIgnoreCase("c")){
            this.carga = carga;
            
        }else{
            throw new Exception("La carga debe ser desde acostado (poner a) o costado (poner c)");
        }
    }


    public String getCarga() {
        return carga;
    }


    public void setCarga(String carga) {
        this.carga = carga;
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

    @Override
    public double calcularTotal(int cantidad, String horario) throws Exception {
        if (validarStock(cantidad)) {
            double precio = (cantidad*getPrecioBase())*iva - this.calcularDescuento(horario);

            return precio;
            
        }else{
            throw new Exception("No hay lavadoras");
        }
    }

    @Override
    public String imprimir() {
        return """
            El codigo de la lavadora es %s, precio: %s, marca: %s, carga: %s
            """.formatted(this.getCod(), this.getPrecioBase(), this.getMarca(), this.getMarca());
    }


    
}
