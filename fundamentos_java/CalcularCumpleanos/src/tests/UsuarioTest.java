package tests;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import classes.Edades;

public class UsuarioTest {

    @Test
    public void testGetEdadActual() throws Exception {
      assertEquals(Edades.getEdadActual(1, 1, 1990), 34);
      assertEquals(Edades.getEdadActual(11, 8, 2000), 23);
      assertEquals(Edades.getEdadActual(18, 4, 2024), 0);
    }
  
    @Test
    public void testNoNacido() {
      try {
        Edades.getEdadActual(18, 9, 2024);
      } catch (Exception exc) {
        assertEquals(exc.getMessage(), "Esa persona no ha nacido");
      }
    }

    @Test
    public void testGetDecada() {
      try {
        Edades.getDecadas(18, 9, 2024);
      } catch (Exception exc) {
        assertEquals(exc.getMessage(), "Esa persona no ha nacido");
      }
    }
    @Test
  public void testDecadas() throws Exception {
    assertEquals(Edades.getDecadas(24, 4, 2000), 2);
    assertEquals(Edades.getDecadas(11, 2, 1960), 6);
    assertEquals(Edades.getDecadas(18, 4, 2024), 0);
    assertEquals(Edades.getDecadas(25, 12, 0), 202);
  }



}
