import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        IOperaciones iop;
        System.out.println("Bienvenido al centro de cálculo");
        while (true) {
            

            String pregunta = "Ingrese una de las siguientes opciones: \n1. Calculadora normal. \n2 Calculadora en segundos. \n3 Calculadora en radianes";

            System.out.println(pregunta);

            String respuesta = in.nextLine();
            if (respuesta.equals("1")) {
                System.out.println("Calculadora normal");

                iop = new Calculadora();
                
            }else if (respuesta.equals("2")) {

                System.out.println("Calculadora en segundos");

                iop = new CalcReloj();
            }else if (respuesta.equals("3")) {
                System.out.println("Calculadora de Radianes");

                iop = new CalcRadianes();
            }else{
                break;
            }

            
            calcular( iop);



        }
        System.out.println("Nos vemos!");
    }

    static private void calcular(IOperaciones iop){
        System.out.println("Ingrese la operacion a realizar: \n1: Suma. \n2 : Resta. \n3: Multiplicacion \n4: División ");
            String operacion = in.nextLine();
            System.out.println("Ingrese el primer numero");
            double primerNum = Double.parseDouble(in.nextLine());
            System.out.println("Ingrese el segundo numero");
            double segundoNum = Double.parseDouble(in.nextLine());
            if (operacion.equals("1")) {
                System.out.println(iop.sumar(primerNum, segundoNum));
                
            }else if (operacion.equals("2")) {

                System.out.println(iop.restar(primerNum, segundoNum));
            }else if (operacion.equals("3")) {
                System.out.println(iop.multiplicar(primerNum, segundoNum));
            }else{
                System.out.println(iop.dividir(primerNum, segundoNum));
            }
    }
}
