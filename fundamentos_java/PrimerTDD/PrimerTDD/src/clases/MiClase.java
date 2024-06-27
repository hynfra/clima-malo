package clases;

public class MiClase {

    public int numeroMayor(int a, int b, int c){
        if(b > a){
            return b;
        }
        if(c > a || c > b){
            return c;
        }
        return a;
    }

}
