import java.util.ArrayList;
import java.util.Scanner;

import classes.Plan;
import classes.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        contratarConsola();



        
        

       

    }
    public static void contratarConsola() throws Exception{
        ArrayList <Plan> planesDisponibles = new ArrayList<Plan>();
        planesDisponibles.add(new Plan("2 pantallas HD", 6000));
        planesDisponibles.add(new Plan("5 pantallas full HD", 8500));
        planesDisponibles.add(new Plan("Ilimitado full HD", 12000));
        Scanner in = new Scanner(System.in);
        Usuario user = new Usuario("Nuevo usuario");
        while(true){
            System.out.println("""
                Elija una opcion (o 0 para salir): \n1. Plan 2 pantallas HD $6000 
                \n2. Plan 5 pantallas full HD $8500 \n3 Plan ilimitado $12000
                    """);
                    String opcion = in.nextLine();
                    if (opcion.equals("1")) {
                        user.addPlan(planesDisponibles.get(0));
                        
                    }else if(opcion.equals("2")){
                        user.addPlan(planesDisponibles.get(1));
                    }else if (opcion.equals("3")) {
                        user.addPlan(planesDisponibles.get(2));
                        
                    }else if (opcion.equals("0")){
                        break;
                    }else{
                        System.out.println("Opcion ingresada no valida");
                    }
        }
        System.out.println("El total de sus cuentas es: $" + user.calcularTotal());
        user.mostrarDetalle();
        /* 
        System.out.println("Ingrese su nombre");
        String nombre = in.nextLine();
        Usuario u = new Usuario(nombre);
        System.out.println("Ingrese el nombre del plan 1");
        String nombrePlan1 = in.nextLine();
        System.out.println("Ingrese el precio del plan 1 (Debe ser menor a 20000)");
        int precioPlan1 = Integer.parseInt(in.nextLine());
        
        Plan plan1 = new Plan(nombrePlan1, precioPlan1);
        u.planes.add(plan1);

        System.out.println("Ingrese el nombre del plan 2");
        String nombrePlan2 = in.nextLine();
        System.out.println("Ingrese el precio del plan 2 (Debe ser menor a 20000)");
        int precioPlan2 = Integer.parseInt(in.nextLine()); 

        Plan plan2 = new Plan(nombrePlan2  , precioPlan2);
        u.planes.add(plan2);


        System.out.println("Ingrese el nombre del plan 3");
        String nombrePlan3 = in.nextLine();
        System.out.println("Ingrese el precio del plan 3 (Debe ser menor a 20000)");
        int precioPlan3 = Integer.parseInt(in.nextLine()); 

        Plan plan3 = new Plan(nombrePlan3, precioPlan3);

        u.planes.add(plan3);
        */
    }

}
