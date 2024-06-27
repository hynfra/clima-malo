package clases;

public class Cliente {

    private String rut,nombre;
    private int edad;
    private char sexo;
    private Celular celular;
    public Cliente(String rut, String nombre, int edad, char sexo, Celular celular) throws Exception {
        if (edad < 18) {
            throw new Exception("El cliente debe ser mayor de edad");
            
        }
        if (rut.length() < 9) {
            throw new Exception("No es un rut válido");
            
        }
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.celular = celular;
    }
    public String toString(){
        String respuesta = "%s: (rut: %s) num: %s".formatted(
            this.nombre,
             this.rut, 
             this.celular.getNumero() );
        return respuesta;
    }
    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public Celular getCelular() {
        return celular;
    }
    public void setCelular(Celular celular) {
        this.celular = celular;
    }
    public void modificarCelular(String nuevoNum){
        this.celular.setNumero(nuevoNum);
    }
    

    
}
