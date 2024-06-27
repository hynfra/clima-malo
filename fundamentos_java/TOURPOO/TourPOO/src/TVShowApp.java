import java.util.Scanner;

public class TVShowApp {
    public static void main(String[] args) throws Exception{

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Show");
        String nombreShow = in.nextLine();
        System.out.println("Ingrese las temporadas");
        int temporadas = Integer.parseInt(in.nextLine());
        System.out.println("cantidad de capitulos: ");
        int capitulos = Integer.parseInt(in.nextLine());
        System.out.println("Ingrese la edad mínima");
        int edadMinima = Integer.parseInt(in.nextLine());
        TVShow tvShow = new TVShow(nombreShow, temporadas, capitulos, edadMinima);
        System.out.println(tvShow.getClasificacion());
        in.close();

    }

}
