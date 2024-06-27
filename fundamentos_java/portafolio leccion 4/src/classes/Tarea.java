package classes;

import java.util.ArrayList;

public class Tarea {

    private String nombre,descripcion,estado;
   

    public Tarea(String nombre, String descripcion, String estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    public Tarea(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = "Pendiente";
    }

    public Tarea() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public static String estadoTarea(int opcion) {

        try {
            switch (opcion) {
                case 1:
                    return "pendiente";
    
                case 2:
                    return "en progreso";
    
                case 3:
                    return "Completada";
    
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar un numero de las opciones (1, 2 o 3)");
            
        }
        return null;
    }
    



}
