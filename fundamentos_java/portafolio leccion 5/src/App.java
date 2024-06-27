import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();

        System.out.println("Bienvenido a la biblioteca ");
        while (true) {

            System.out.println("""
                    
                    Elija entre una de las opciones:
                    1)Agregar nuevo libro
                    2) Prestar un libro
                    3) Devolver un libro
                    4) Mostrar libro
                    0) Salir
                    """);

            int opcion;
            try {
                opcion = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar una de las opciones (ingresar 1 o 2 o 3 o 4 o 0) ");
                continue;
            }
            if (opcion == 0) {
                break;
            }
            switch (opcion) {
                case 1:
                /** agregar LIBRO */
                    System.out.println("Ingrese el titulo del libro");
                    String titulo = in.nextLine();
                    System.out.println("Ingrese el autor del libro");
                    String autor = in.nextLine();
                    System.out.println("Ingrese el ISBN del libro");
                    String isbn = in.nextLine();
                    biblioteca.agregar(titulo, autor, isbn);

                    break;

                case 2:
                /** PRESTAR */
                System.out.println("Ingrese el titulo del libro que desea que le presten");
                    String tituloPrestamo = in.nextLine();
                    if(!tituloPrestamo.isEmpty()){
                        biblioteca.prestar(tituloPrestamo);

                    }else{
                        System.out.println("Debe ingresar un titulo");
                    }
                
                    break;

                case 3:

                // aca va el devolver

                System.out.println("Ingrese el titulo del libro que desea devolver");
                    String tituloDevolver = in.nextLine();

                    if(!tituloDevolver.isEmpty()){
                        biblioteca.devolver(tituloDevolver);

                    }else{
                        System.out.println("Debe ingresar un titulo");
                    }

                
                    break;

                    case 4:

                    biblioteca.mostrar();
                    break;

                    case 0:
                    return;
                default:
                    break;
            }

        }
    }
}
