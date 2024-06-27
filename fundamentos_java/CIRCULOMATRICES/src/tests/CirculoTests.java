package tests;

import static org.junit.Assert.assertTrue;

import org.junit.*;

import classes.Circulo;

public class CirculoTests {

    @Test
    public void testCirculo0(){
        Circulo c = new Circulo(0);

        assertTrue(c.getPerimetro() == 0);

    }
    @Test
    public void testCirculo0_2() {
      Circulo c = new Circulo(0);
      assertTrue(c.getArea() == 0);
    }
  
    @Test
    public void testPerimetro() {
      Circulo c = new Circulo(5);
      System.out.println(c.getPerimetro());
      assertTrue(c.getPerimetro() == 31.4);
    }


}
