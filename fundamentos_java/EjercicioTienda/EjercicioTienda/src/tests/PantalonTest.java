package tests;

import productos.Pantalon;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class PantalonTest {

    @Test
    public void testPrecioTotal() throws Exception{
        
            Pantalon p = new Pantalon("123", 5000, 10, "cotele", "m");
            int precioTotal = (int)p.calcularTotal(1, "diurno");
            int precio = 949;
            assertEquals(precioTotal, precio);
       
    }

}
