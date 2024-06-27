package clases;
public class Servicio {

    protected String cod,tipo;

    public Servicio(String cod, String tipo) {
        this.cod = cod;
        this.tipo = tipo;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

}
