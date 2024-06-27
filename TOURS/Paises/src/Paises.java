import java.util.Scanner;
import java.util.ArrayList;

public class Paises {

    public static void presupuesto(){
        ArrayList <String []> paises = new ArrayList<String []>();
        Scanner in = new Scanner(System.in);

        int presupuestoTotal=0;

        while(true){
            System.out.println("Ingrese un pais, para finalizar escriba '0' ");
            String nombre_pais = in.nextLine(); 
                if (nombre_pais.equals ("0")){
                    break;
                }
            System.out.println("Ingrese el presupuesto con el que cuenta");
            String presupuesto_pais = in.nextLine();
            String[] nuevo_pais = {nombre_pais, presupuesto_pais};
            paises.add(nuevo_pais);  
            int pres_pais_int = Integer.parseInt(presupuesto_pais);
            presupuestoTotal += pres_pais_int;    
            
        }

        for (String[] pais : paises) {
            String frase = "En " +pais[0] + " vamos a gastar $" + pais[1];
            System.out.println(frase);
            
          }
          System.out.println("El presupuesto total es:" + presupuestoTotal);
          }
    


    public static void tourList(){
        ArrayList <String> paises = new ArrayList<String>();
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("Ingrese un pais, para finalizar escriba '0' ");
            String nuevo_pais = in.nextLine(); 
            if (nuevo_pais.equals ("0")){
                break;
            }
            paises.add(nuevo_pais);
                
        }
        for (String pais : paises) {
            System.out.println("Usted visitó " + pais);
          }
    }


  public static void main(String[] args) {
    presupuesto();
  }
    
  
}
