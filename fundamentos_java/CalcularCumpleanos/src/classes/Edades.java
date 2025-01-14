package classes;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;

public class Edades {
   static LocalDate ahora = LocalDate.now();
    LocalDate tt = LocalDate.of(2001, 9, 11);
    long diffAños = YEARS.between(ahora, tt);
    
  

  public static int getEdadActual(int dia_actual, int mes_actual, int año_actual, int dia_nac, int mes_nac,
      int año_nac) {
    return -1;
  }

  public static long getEdadActual(int dia_nac, int mes_nac, int año_nac) throws Exception {
    LocalDate hoy = LocalDate.now();
    LocalDate fechaNac = LocalDate.of(año_nac, mes_nac, dia_nac);
    if (hoy.isBefore(fechaNac)) {
      throw new Exception("Esa persona no ha nacido");
    }
    long diferencia = YEARS.between(fechaNac, hoy);
    return diferencia;
  }

  public static long diasProxCumple( int dia_nac, int mes_nac,
      int año_nac) throws Exception {

        LocalDate hoy = LocalDate.now();

        LocalDate proxCumple;
        // chequeamos que ya estuvo de cumpleaños este año
        if (mes_nac < hoy.getMonthValue() || (mes_nac == hoy.getMonthValue() && dia_nac <= hoy.getDayOfMonth())) {
          proxCumple = LocalDate.of(hoy.getYear() + 1, mes_nac, dia_nac);
        } else {
          proxCumple = LocalDate.of(hoy.getYear(), mes_nac, dia_nac);
        }
        long numDias = DAYS.between(hoy, proxCumple);
        return numDias;
  }

  public static long getDecadas( int dia_nac, int mes_nac, int año_nac) throws Exception {
    long edad;
    try {
      edad = getEdadActual(dia_nac, mes_nac, año_nac);
    } catch (Exception e) {
      throw e;
    }
    return (long) Math.floor(edad);
  }

}
