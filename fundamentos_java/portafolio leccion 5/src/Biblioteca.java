import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros = new ArrayList<Libro>();
    public  int numLibros;
    public Biblioteca() {
    }
    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
        
    }

    public void agregar(String titulo, String autor, String isbn){

        if(titulo.isEmpty()){

            System.out.println("Debe llenar el campo titulo");
            return;

        }else if(autor.isEmpty()){
            System.out.println("Debe llenar el campo autor");
            return;
        }else if (isbn.isEmpty()){
            System.out.println("Debe llenar el campo isbn");
            return;
        }
        
        Libro libro = new Libro(titulo,autor,isbn);
        libros.add(libro);
        this.numLibros++;

    }

    public void prestar(String titulo){
        if (libros.size() > 0) {

            for (Libro libro : libros) {
                if(libro.getTitulo().equals(titulo)){
                    if(libro.isDisponible()){
                        System.out.println("Se presta el libro " + libro.getTitulo() + " del autor " + libro.getAutor());

                    libro.setDisponible(false);

                    }else{
                        System.out.println("El libro ingresado no se encuentra disponible");
                    }
                    

                }
            }
            
        }else{
            System.out.println("No hay libros registrados");
        }

    }

    public void devolver(String titulo){

        if (libros.size() > 0) {
            for (Libro libro : libros) {
                if(libro.getTitulo().equals(titulo)){
                    if(!libro.isDisponible()){
                        System.out.println("Se devuelve el libro " + libro.getTitulo() + " del autor " + libro.getAutor());

                    libro.setDisponible(true);

                    }else{
                        System.out.println("El libro ingresado no se ha prestado");
                    }
                    

                }
            }
            
        }



    }

    public void mostrar(){

        if (libros.size() > 0) {

            for (Libro libro : libros) {

                //System.out.println("titulo: "+ libro.getTitulo() + "\n" + " autor: " + libro.getAutor() + "\n"
               // + " ISBN: " + libro.getISBN());
               System.out.println(libro );
                
                
            }
            System.out.println(""+this.numLibros);
            
        }else{

            System.out.println("No hay libros registrados");
        }

    }

    
    

}
