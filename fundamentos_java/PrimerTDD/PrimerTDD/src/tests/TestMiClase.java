package tests;

import static org.junit.Assert.assertTrue;

import org.junit.*;

import clases.MiClase;



public class TestMiClase {

    @Test
    public void testNumeroMayor(){
      MiClase  mc = new MiClase();
        int resultado = mc.numeroMayor(3, 2, 1);

        assertTrue(resultado == 3); // lo que  espero que el resultado haga

    }

    // si el segundo numero es mayor
    @Test
    public void testNumeroMayor2(){
      MiClase  mc = new MiClase();
        int resultado = mc.numeroMayor(10, 15, 8);

        assertTrue(resultado == 15); // lo que  espero que el resultado haga

    }

    // si el tercer numero es mayor
    @Test
    public void testNumeroMayor3(){
      MiClase  mc = new MiClase();
        int resultado = mc.numeroMayor(10, 15, 20);

        assertTrue(resultado == 20); // lo que  espero que el resultado haga

    }

}
