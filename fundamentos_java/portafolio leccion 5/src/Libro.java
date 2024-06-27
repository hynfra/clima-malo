public class Libro {

    private String titulo, autor, ISBN;
    private boolean disponible;
    
    public Libro(String titulo, String autor, String iSBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = iSBN;
        this.disponible = true;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public String toString(){
        return "titulo: "+ this.titulo + "\n" + " autor: " + this.autor + "\n"
        + " ISBN: " + this.ISBN;
    }
    

}
