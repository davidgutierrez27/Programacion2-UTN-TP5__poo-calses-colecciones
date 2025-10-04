
package tp6_colecciones_y_sistema.de.stock.ejercicio2;

public class NewMain {

    public static void main(String[] args) {
    Autor autor1 = new Autor("502", "Basil", "German");
    Biblioteca b1 = new Biblioteca("Alejandria");
    agregarLibros(b1, autor1);
    
    //b1.listarLibros();
    
    //b1.buscarLibroPorIsbn("123");
    //b1.filtrarLibrosPorAnio(1800);
    //b1.buscarLibroPorIsbn("13");
    
    //b1.eliminarLibro("126");
    //b1.eliminarLibro("13");
    
    //b1.listarLibros();
    
    //b1.obtenerCantidadLibros();
    b1.mostrarAutoresDisponibles();
    }
    
    private static void agregarLibros(Biblioteca bi, Autor autor) {
        bi.agregarLibro("123", "Dorian Gray",1800, autor);
        bi.agregarLibro("124", "Gray",1800, autor);
        bi.agregarLibro("125", "Doamian",1200, autor);
        bi.agregarLibro("126", "El chocas",1900, autor);
    }
}

