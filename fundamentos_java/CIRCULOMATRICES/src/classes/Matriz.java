package classes;

public class Matriz {

    private int [][] valores;

    public Matriz(int [][] valores){
        this.valores = valores;
    }

    public Matriz(int dimension){

        this.valores = new int[dimension][dimension];

    }

    public Matriz (int filas, int n_columnas){

        this.valores = new int[filas][n_columnas];

    }

    public void add( int fila, int col, int valor){
        
        this.valores[fila][col] = valor;
    }

    public int multiplicarDiagonales() throws Exception{
        int diagonal1 = 0;
        int diagonal2 = 0;

        if(this.valores.length != this.valores[0].length){
            throw new Exception("La matriz debe ser cuadrada para multiplicar sus diagonales");
            
        }

        for(int i = 0 ; i < this.valores.length; i++){

            diagonal1 += this.valores[i][i];
            diagonal2 += this.valores[i][(this.valores.length -1)-i];
        }
        return diagonal1 * diagonal2;
    }

}
