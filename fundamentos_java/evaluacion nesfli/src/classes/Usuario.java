package classes;

import java.util.ArrayList;

public class Usuario {

    private String nombre;
    public ArrayList<Plan> planes;
    
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.planes = new ArrayList<Plan>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addPlan(Plan p){


        

        if(p != null){
            planes.add(p);
        }
    }
    public void addPlan(String nombre, int precio) throws Exception{

        Plan p = new Plan(nombre, precio);

        planes.add(p);
    }

    public int calcularTotal(){
        int total = 0;
        if(this.planes.size() > 0){
            for (Plan plan : planes) {
                total += plan.getPrecio();
            }
        }

        return total;
    }

    public void mostrarDetalle(){
        int plan2pant = 0;
        int plan5pant = 0;
        int planIlim = 0;
        for (Plan plan : planes) {
            if (plan.getNombre().equals("2 pantallas HD")) {
                plan2pant ++;
                
            }else if (plan.getNombre().equals("5 pantallas full HD")) {
                plan5pant ++;
                
            }else if (plan.getNombre().equals("Ilimitado full HD")) {
                planIlim ++;
                
            }

            
        }
        System.out.println("usted tiene "+plan2pant + "del plan 2 pantallas HD");
        System.out.println("usted tiene "+plan5pant + "del plan 5 pantallas full HD");
        System.out.println("usted tiene "+planIlim + "del plan Ilimitado full HD");
    }

    
    

}
