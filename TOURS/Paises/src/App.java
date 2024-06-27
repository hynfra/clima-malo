public class App {
    /**
     * Este es el punto de entrada de mi programa
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //Paises.presupuesto();
        String enlace = Bootstrap.getEnlace("http://github.com/mbensan", "Visita mi github");
        System.out.println(enlace);
    }
}
