
package tp6_colecciones_y_sistema.de.stock.ejercicio2;

/**
 Clase Libro 
Atributos: 
•	isbn (String) → Identificador único del libro. 
•	titulo (String) → Título del libro. 
•	anioPublicacion (int) → Año de publicación. 
•	autor (Autor) → Autor del libro. 
Métodos: 
•	mostrarInfo() → Muestra título, ISBN, año y autor. 

 */
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    
    
    
    
    
    /*public void mostrarInfo() {
        System.out.println("Libro; " + "isbn=" + isbn + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + ", autor=" + autor);
    }*/

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + ", autor=" + autor + '}';
    }
    
    
    
    
}
