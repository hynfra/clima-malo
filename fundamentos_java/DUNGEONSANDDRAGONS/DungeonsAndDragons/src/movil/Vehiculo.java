public class Vehiculo {
    private int motor;
    private String marca,modelo;
    private boolean autom;
    protected float rendimiento;

    private boolean tieneAcoplado;
    public Vehiculo(int motor, String marca, String modelo, boolean autom, float rendimiento) {
        this.motor = motor;
        this.marca = marca;
        this.modelo = modelo;
        this.autom = autom;
        this.rendimiento = rendimiento;
        this.tieneAcoplado = false;
    }
    public Vehiculo(int motor, String marca, String modelo, float rendimiento) {
        this.motor = motor;
        this.marca = marca;
        this.modelo = modelo;
        this.rendimiento = rendimiento;
    }

    public String getVehiculo(){
        return "marca: " +  this.marca + " modelo: " + this.modelo;

    }

    

    

    public float getConsumo(int kms){
        return kms / this.rendimiento;
    }

    public void fijarAcoplado(int kms, boolean tieneAcoplado){

        if (tieneAcoplado) {
            
        }
    }

    
    

}
