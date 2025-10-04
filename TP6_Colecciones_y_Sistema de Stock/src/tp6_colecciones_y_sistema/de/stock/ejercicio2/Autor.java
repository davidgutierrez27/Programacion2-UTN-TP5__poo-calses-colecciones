
package tp6_colecciones_y_sistema.de.stock.ejercicio2;

public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;
    

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }

    
    
}
