import java.util.Scanner;

public class Paises {
    public static void main(String[] args) {
        tour();
    }

    private static void tour() {
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese el número de países");

        String num_paises_string = in.nextLine();
        int num_paises = Integer.parseInt(num_paises_string);

        String [] paises = new String[num_paises];

        for(int i = 0; i < num_paises; i++){
            String nuevo_pais = in.nextLine();
            paises[i] = nuevo_pais;
        }

        for(int i = 0; i < paises.length;i++){
            System.out.println("usted visitó " + paises);
        }

    }
}
