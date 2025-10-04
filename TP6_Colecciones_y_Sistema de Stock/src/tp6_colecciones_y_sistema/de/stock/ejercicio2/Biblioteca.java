
package tp6_colecciones_y_sistema.de.stock.ejercicio2;

import java.util.ArrayList;

/**
Clase Biblioteca Atributo: 
•	String nombre 
•	List<Libro> libros → Colección de libros de la biblioteca. 
Métodos requeridos: 
•	agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor) 
•	listarLibros() 
•	buscarLibroPorIsbn(String isbn) 
•	eliminarLibro(String isbn) 
•	obtenerCantidadLibros() 
•	filtrarLibrosPorAnio(int anio) 
•	mostrarAutoresDisponibles() 

 */
public class Biblioteca {
    private String nombre;
    private ArrayList <Libro> libro;
    
    
    //CONTRUCTORES
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libro = new ArrayList<>();
    }
    
    
    
    /* AGREGACION  construcción posterior
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor){
        Libro lib = new Libro();                   ACA SOLO SE CREA 
        lib.agregarLibro(isbn, titulo, anioPublicacion, autor);   ACA SE AGREGA
    }*/
    // COMPOSICION  construcción directa
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor){
        Libro lib = new Libro(isbn, titulo, anioPublicacion, autor);       //lib depende de bibliote
        libro.add(lib);
    }
    
    
    
//MOSTRAR TODOS    
    /*   //LISTAR metodo
    public void listarLibros(){
        System.out.println(" TODO LOS LIBROS");
        for (Libro libro1 : libro) {
            libro1.mostrarInfo();
        }¡
    }*/
       //LISTAR CON TOSTRING
    public void listarLibros(){
        for (Libro libro1 : libro) {
            System.out.println(libro1.toString());
        }
        System.out.println("");
    }
    
  
    
//BUSCAR POR ISBN    
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro1 : libro) {
            if (libro1.getIsbn().equals(isbn)) {
                System.out.println("ENCONTRADO: " + libro1);
                return libro1;  // ← Devuelve el libro encontrado
            }
        }
        System.out.println("NO ENCONTRADO: " + isbn);
        return null;
    }
    
    
// FILTRAR POR AÑOS   
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> librosEncontrados = new ArrayList<>();   //lista donde cargar los que encuentre

        //busco en cada vuelta lo que coincidan
        for (Libro libro1 : libro) {            
            if (libro1.getAnioPublicacion() == anio) {
                librosEncontrados.add(libro1);
            }
        }

        //recorremos la lista creaada o mostramos que no hay
        if (librosEncontrados.isEmpty()) {    
            System.out.println("NO SE ENCONTRARON LIBROS PUBLICADOS EN EL AÑO: " + anio);
        } else {
            System.out.println("LIBROS PUBLICADOS EN EL AÑO " + anio + ":");
            for (Libro lib : librosEncontrados) {
                System.out.println(lib);
            }
        }
        System.out.println("");
        return librosEncontrados;
    }    
    
    
//ELIMINAR LIBRO
    public void eliminarLibro(String isbn) {
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);  // ← Usamos el método anterior

        if (libroAEliminar != null) {
            libro.remove(libroAEliminar);  // ← Eliminamos de la lista original
            System.out.println("ELIMINADO: " + libroAEliminar);
        }
        else {
        System.out.println("NO SE PUDO ELIMINAR: Libro no encontrado con ISBN " + isbn);
        }
        System.out.println("");
    }
    
    
// CANTIDAD TOTAL
    public void obtenerCantidadLibros(){
            int total = libro.size();
            System.out.println("TOTAL DE LIBROS: "+total);
        }
    
// AUTORES DISPONIBLES DE LIBROS EXISTENTES 
    public void mostrarAutoresDisponibles(){
        System.out.println("AUTORES DISPONIBLES");
        for (Libro libro1 : libro) {
            System.out.println(libro1.getAutor());
        }
    }
    
    
}
