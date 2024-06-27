public class TVShow {
    String nombre;
    private int temporadas;
    private int capitulos;
    private int edadMinima;

    public TVShow(String nombre, int temporadas, int capitulos, int edadMinima) {
        this.nombre = nombre;
        this.temporadas = temporadas;
        this.capitulos = capitulos;
        this.edadMinima = edadMinima;
    }

    public String getClasificacion() {

        switch (edadMinima) {
            case 0:
                return "La clasificación del show es: TE";

            case 6:

                return "La clasificación del show es: F";
            case 13:

                return "La clasificación del show es: PG13";
            case 18:

                return "La clasificación del show es: A";

            default:
                return "Debe ingresar una edad valida";

        }


    }

}
