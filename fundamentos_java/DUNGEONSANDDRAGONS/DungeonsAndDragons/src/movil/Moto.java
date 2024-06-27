public class Moto extends Vehiculo {

    private boolean tieneAcoplado;
    public Moto(int motor, String marca, String modelo, float rendimiento, boolean autom){
        super(motor, marca, modelo, rendimiento);
        this.tieneAcoplado = false;
    }

    public boolean isTieneAcoplado() {
        return tieneAcoplado;
    }
    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }

    public float getConsumo (int kms){
        if (this.tieneAcoplado) {

            float consumo =  (float)((kms / this.rendimiento) * 0.7);
            return consumo;
            
        }else{
            return kms / this.rendimiento;
        }
    }

    

}
