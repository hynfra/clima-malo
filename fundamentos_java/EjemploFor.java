public class EjemploFor {

    public static void fliflop (){

        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){

                System.out.println("FlipFlop");
            }else{
                if (i % 3 == 0) {
                    System.out.println("Flip");
                }else{
                    if (i % 5 == 0) {
                        System.out.println("Flop");
                    }else{
                        System.out.println("Numero... " +  i);
                    }
                }
            }
        }
    }


    public static void fliflop (int inicio, int fin){
        if (inicio > fin) {
            inicio = inicio * (-1);
        }

        for(int i = inicio; i <= fin; i++){
            if(i % 3 == 0 && i % 5 == 0){

                System.out.println("FlipFlop");
            }else{
                if (i % 3 == 0) {
                    System.out.println("Flip");
                }else{
                    if (i % 5 == 0) {
                        System.out.println("Flop");
                    }else{
                        System.out.println("Numero... " +  i);
                    }
                }
            }
        }

    }
    
    public static void elefantes(){
        int i = 1;
        while(i <= 10){
            System.out.println(i + " elefantes se balanceaban sobre una tela...");
            i++;
        }
        System.out.println("Se acabaron los elefantes " + i);
    }
    public static void elefantesFor(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i + " eleFORtes se balanceaban sobre una tela...");
        }
    }


    public static void main(String[] args) {
        fliflop(100,200);
    }
}
