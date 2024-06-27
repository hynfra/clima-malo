
import java.util.Scanner;

/**
 * clase que recibe alumno notas y promedio
 */
public class Curso {
// static hace que la variable sea global para toda la clase
// la diferencia de static con public que static lo hace global para solo la clase mientras que public lo hace global para todas las clases
    static int opcion = -1;
    static String alumno = "";
    static Double notasParciales = 0.0;
    static Double notaFinal = 0.0;
    static Double aprueba = 0.0;
    static String curso = "";

    /**
     * metodo principal
     */
    public static void preguntaInicial() {
        Scanner in = new Scanner(System.in);

        while (opcion != 0) {
            System.out.println("""
                    Ingrese una de las opciones
                    1) Ingresar datos generales
                    2) Curso
                    3) Notas del alumno
                    4) Imprimir los resultados
                    5) salir

                    """);
            opcion = Integer.parseInt(in.nextLine());

            switch (opcion) {
                case 1:

                    System.out.println("Ingrese el rut del alumno");
                    String rut = in.nextLine();
                    System.out.println("Ingrese el nombre del alumno");
                    String nombre = in.nextLine();
                    System.out.println("Ingrese el apellido del alumno");
                    String apellido = in.nextLine();
                    System.out.println("Ingrese la edad del alumno");
                    int edad = Integer.parseInt(in.nextLine());

                    alumno = datosGenerales(rut, nombre, apellido, edad);
                    System.out.println(alumno);
                    break;

                case 2:

                    curso = cursos(in);

                    break;
                case 3:
                    Double[] notas = notasAlumno(in);
                    notasParciales = notas[0];
                    notaFinal = notas[1];

                    System.out.println("El promedio de notas parciales es: " + notasParciales +
                            " Y el promedio final es: " + notaFinal);

                    break;
                case 4:
                    imprimirResultados(alumno, curso, notasParciales, notaFinal, aprueba);

                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Debe elegir una de las opciones mencionadas");
                    break;
            }

        }

    }

    /**
     * 
     * @param rut
     * @param nombre
     * @param apellido
     * @param edad
     * @return
     * @throws NumberFormatException
     */
    private static String datosGenerales(String rut, String nombre, String apellido, int edad)
            throws NumberFormatException {
        if (edad < 18 || edad > 100) {
            return "edadNoValida";
        }

        String nombreCompleto = "El rut del alumno es " + rut + " con nombre " + nombre;

        return nombreCompleto;

    }

    /**
     * 
     * @param in
     * @return
     */
    private static String cursos(Scanner in) {

        System.out.println("Elija una de las opciones");
        System.out.println("1)fisica \n 2) Biologia \n 3)programación \n");
        String curso = in.nextLine().trim().toLowerCase();
        if (curso.equals("fisica") || curso.equals("biologia") || curso.equals("programacion")) {
            System.out.println("ingrese la sala del curso");
            String sala = in.nextLine();
            System.out.println("Ingrese la capacidad de la sala ");
            int capacidad = Integer.parseInt(in.nextLine());
            if (capacidad < 0 || capacidad > 35) {
                System.out.println("la capacidad debe ser entre 0 y 35");
                return "1";
            } else {
                System.out.println("Ingrese el nombre del profesor");
                String nombreProfe = in.nextLine();
                return "el curso de " + curso + " de la sala " + sala + " con el profesor " + nombreProfe;

            }

        } else {
            System.out.println("Debe escribir una de las opciones");
            return "0";
        }

    }

    /**
     * 
     * @param in
     * @return
     */
    private static Double[] notasAlumno(Scanner in) {
        Double[] notas = new Double[3];
        Double[] notasFinales = new Double[3];
        boolean aprueba = true;
        Double notas_parciales = 0.0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota " + i + " del alumno");
            Double nota = Double.parseDouble(in.nextLine());
            if (nota < 1 || nota > 7) {
                System.out.println("Debe ingresar una nota entre 1 y 7");
                if (i != 0) {
                    i -= 1;
                }

            } else {

                notas[i] = nota;
                if (notas[i] <= 2) {
                    aprueba = false;
                }
                notas_parciales += notas[i];

            }
        }
        System.out.println("Ingrese la nota del examen");
        float notaExamen = Float.parseFloat(in.nextLine());
        notasFinales[0] = notas_parciales / notas.length;

        Double promedioFinal = notasFinales[0] * 0.6 + (notaExamen * 0.4);
        if (promedioFinal <= 4) {
            aprueba = false;
        }

        notasFinales[1] = promedioFinal;
        if (aprueba) {
            notasFinales[2] = 1.0;
        }

        return notasFinales;

    }

    private static void imprimirResultados(String alumno, String curso, Double notasParciales, Double notaFinal,
            Double aprueba) {

        if (alumno.isEmpty()) {
            System.out.println("Debe llenar el campo del alumno");
        } else {
            if (curso.isEmpty() || curso.equals("0") || curso.equals("1")) {
                System.out.println("Debe llenar el curso");
            } else {
                if (notasParciales == 0.0 || notaFinal == 0.0) {
                    System.out.println("Debe ingresar las notas");
                } else {

                    if (aprueba == 1.0) {
                        System.out.println(alumno + " teniendo  la nota parcial " + notasParciales
                                + " y la nota final de " + notaFinal + "APRUEBA " + curso);
                    } else {
                        System.out.println(alumno + " con la nota parcial " + notasParciales + " y la nota final de "
                                + notaFinal + " NO APRUEBA " + curso);
                    }

                }
            }
        }

    }

}
