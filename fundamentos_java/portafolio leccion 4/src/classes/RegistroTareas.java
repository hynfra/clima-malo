package classes;

import java.util.ArrayList;

public class RegistroTareas {

    private ArrayList<Tarea> listaTareas =  new ArrayList<Tarea>();

    public void agregarTarea(Tarea tarea){

        listaTareas.add(tarea);

    }

    public void mostrarTareas(){
        for (Tarea tarea : listaTareas) {
            System.out.println("Nombre tarea: "+tarea.getNombre() + " \n" + "Descripción tarea:" + tarea.getDescripcion() + "\n" + "estado: " + tarea.getEstado());
        }
    }
    public void cambiarEstadoTarea(String nombreTarea, int estado){

        if(listaTareas.size() > 0){

            if(!nombreTarea.isEmpty()){
                for (Tarea tarea : listaTareas) {
                    if(nombreTarea.equals(tarea.getNombre())){
                        System.out.println("El estado actual de la tarea es: " + tarea.getEstado());

                        if(Tarea.estadoTarea(estado) != null){
                            tarea.setEstado(Tarea.estadoTarea(estado));
                            System.out.println("Se ha cambiado el estado a " + tarea.getEstado());
                        }
                        

                    }
                }

            }else{
                System.out.println("El campo nombre esta vacio");
            }
            

        }else{
            System.out.println("No hay tareas registradas");
        }
        
    }
    

}
