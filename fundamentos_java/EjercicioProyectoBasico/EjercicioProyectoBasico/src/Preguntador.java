import java.util.Scanner;
/**
 * Clase que pregunta
 */
public class Preguntador {
    
    /**
     * 
     * @return devuelve la frase
     */
    public static String preguntador(){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el nombre de usuario");
        String nombreU = in.nextLine();
        System.out.println("Ingrese el apellido del usuario");
        String apellidoU = in.nextLine();
        System.out.println("Ingrese la edad del usuario");
         int edad =  in.nextInt();

         String frase = """
            "Saludos %s %s, con la edad de: %s. Bienvenido a mi aplicacion Java
                 """.formatted(nombreU,apellidoU,edad);

                 in.close();
                 return frase;
    }
}
