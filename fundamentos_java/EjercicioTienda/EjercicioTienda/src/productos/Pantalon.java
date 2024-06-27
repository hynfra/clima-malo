package productos;
public class Pantalon extends Producto {

    private String tipo, sexo;

    public Pantalon(String cod, int precioBase, int stock, String tipo, String sexo) throws Exception {
        super(cod, precioBase, stock);
        
        if(tipo.equalsIgnoreCase("jeans") || tipo.equalsIgnoreCase("cotele")|| tipo.equalsIgnoreCase("tela")){

            this.tipo = tipo;
        }else{
            throw new Exception("Debe ser de 3 tipos: jeans, cotele o tela");
        }
        if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")){
            this.sexo = sexo;
        }else{
            throw new Exception("Debe elegir como sexo masculino(m) p femenino (f)");
        }
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public double calcularTotal(int cantidad, String horario) throws Exception {
        if (validarStock(cantidad)) {
            if (horario.equalsIgnoreCase("diurno")) {
                double precio = (cantidad * getPrecioBase()) * iva - 0.1;

                return precio;
            } else if (horario.equalsIgnoreCase("vespertino")) {
                double precio = (cantidad * getPrecioBase()) * iva - 0.5;

                return precio;
            } else {
                double precio = (cantidad * getPrecioBase()) * iva;

                return precio;
            }

        } else {
            throw new Exception("No hay pantalones");
        }

    }

    @Override
    public String imprimir() {

        return """
                El codigo del pantalon es %s, precio: %s, tipo: %s, sexo: %s
                """.formatted(this.getCod(), this.getPrecioBase(), this.getTipo(), this.getSexo());
    }

}
