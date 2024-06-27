package tests;

import static org.junit.Assert.assertTrue;

import org.junit.*;


import classes.Matriz;

public class MatrizTests {

    Matriz m1;
    Matriz m2;

    @Before
     public void iniciar(){
        int[][] valores = {
            {4,5,7},
            {7,21,4},
            {5,9,10}
        };
        m1 = new Matriz(valores);
    }

    @Test
    public void testMatrizx3() throws Exception{
        
        int valorEsperado = 1155;
        assertTrue(m1.multiplicarDiagonales() == valorEsperado);
    }

    @Test
    public void testMatrizx4() throws Exception{
        int valorEsperado = 320;
        assertTrue(m1.multiplicarDiagonales() == valorEsperado);
    }

}
