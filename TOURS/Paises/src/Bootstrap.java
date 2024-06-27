
/*
 * Clase que sirve para construir elementos en bootstrap
 */

public class Bootstrap {


    // funcion para crear enlaces del navbar
    public static String getEnlace(String url, String texto){
        String enlace = """
                <li class="nav-item">
                    <a class="nav-link" href="%s">%s</a>
                    </li>
                """.formatted(url,texto);
                return enlace;
    }

}
