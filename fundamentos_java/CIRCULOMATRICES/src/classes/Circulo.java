package classes;

public class Circulo {

    private double radio;

    private static double pi = 3.14;
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getPerimetro() {
        double res = 2 * pi * this.radio;
        return Math.round(res * 100) / 100.0;
      }
    
      public double getArea() {
        return 0;
      }
    

}
