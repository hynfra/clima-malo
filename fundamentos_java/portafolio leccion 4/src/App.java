import java.util.Scanner;

import classes.RegistroTareas;
import classes.Tarea;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        RegistroTareas tareas = new RegistroTareas();

        while (true) {

            System.out.println("""
                    Bienvenido al registro de tareas \n
                    Elija entre una de las opciones:
                    1)Agregar nueva tarea
                    2) Mostrar las tareas
                    3)Cambiar el estado de la tarea
                    0) Salir
                    """);

            int opcion;
            try {
                opcion = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar una de las opciones (ingresar 1 o 2 o 3) numericas");
                continue;
            }
            if (opcion == 0) {
                break;
            }
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la tarea");
                    String nombreTarea = in.nextLine();
                    System.out.println("Ingrese una descripción para la tarea");
                    String descripcion = in.nextLine();
                    
                    Tarea tarea = new Tarea(nombreTarea, descripcion);
                    tareas.agregarTarea(tarea);

                    break;

                case 2:
                
                tareas.mostrarTareas();
                    break;

                case 3:

                System.out.println("Ingrese el nombre de la tarea a cambiar");
                String buscarTarea = in.nextLine();
                if (!buscarTarea.isEmpty()) {
                    System.out.println("""
                        Ingrese el nuevo estado de la tarea:
                        1) pendiente
                        2) en progreso
                        3) Completada
                        """);

                int estadoNuevo;
                try {
                    estadoNuevo = Integer.parseInt(in.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Debe ingresar una de las opciones (ingresar 1 o 2 o 3) numericas");
                    continue;
                }
                tareas.cambiarEstadoTarea(buscarTarea, estadoNuevo);
                }

                    break;

                default:
                    break;
            }

        }

    }

   
}
