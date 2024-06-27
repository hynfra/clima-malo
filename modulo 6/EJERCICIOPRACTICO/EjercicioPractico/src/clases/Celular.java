package clases;
public class Celular extends Servicio{
    private String numero,marca;

    public Celular(String cod, String tipo,String numero, String marca) {
        super(cod, tipo);
        this.numero = numero;
        this.marca = marca;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    

}
