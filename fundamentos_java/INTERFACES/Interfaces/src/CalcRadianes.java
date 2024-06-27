public class CalcRadianes implements IOperaciones {

    int ciclos = 0;

    final double radPorCiclo = 2 * 3.14;

    @Override
    public double sumar(double numero1, double numero2) {
        double res = numero1 + numero2;
        int ciclo = (int) Math.floor(res / radPorCiclo);
        this.ciclos = ciclo;

        return res % radPorCiclo;
    }

    @Override
    public double restar(double numero1, double numero2) {
        double res = numero1 - numero2;
        int ciclo = (int) Math.floor(res / radPorCiclo);
        this.ciclos = ciclo;

        return res % radPorCiclo;
    }

    @Override
    public double dividir(double numero1, double numero2) {
        double res = numero1 / numero2;
        int ciclo = (int) Math.floor(res / radPorCiclo);
        this.ciclos = ciclo;

        return res % radPorCiclo;
    }

    @Override
    public double multiplicar(double numero1, double numero2) {
        double res = numero1 * numero2;
        int ciclo = (int) Math.floor(res / radPorCiclo);
        this.ciclos = ciclo;

        return res % radPorCiclo;
    }

}
