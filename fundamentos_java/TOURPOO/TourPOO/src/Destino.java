public class Destino {

    String nombre;
   private int num_dias;
    private float presupuesto;
    boolean necesitaVisa;
    public Destino(String nombre, int num_dias, float presupuesto) {
        this.nombre = nombre;
        this.num_dias = num_dias;
        this.presupuesto = presupuesto;
        necesitaVisa = false;
    }
    public double getGastoDiario(){
        double getGastoDiario = presupuesto / num_dias;
        return getGastoDiario;
    }
    

}
