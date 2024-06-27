public class CalcReloj implements IOperaciones{

    int minutos = 0;

    @Override
    public double dividir(double numero1, double numero2) {
        double res = numero1 / numero2;
        int mins = (int) Math.floor(res / 60);
        this.minutos = mins;

        return res % 60;
    }

    @Override
    public double multiplicar(double numero1, double numero2) {
        double res = numero1 * numero2;
        int mins = (int) Math.floor(res / 60);
        this.minutos = mins;

        return res % 60;
    }

    @Override
    public double restar(double numero1, double numero2) {
        double res = numero1 - numero2;
        int mins = (int) Math.floor(res / 60);
        this.minutos = mins;

        return res % 60;
    }

    @Override
    public double sumar(double numero1, double numero2) {
        double res = numero1 + numero2;
        int mins = (int) Math.floor(res / 60);
        this.minutos = mins;

        return res % 60;
    }

}
