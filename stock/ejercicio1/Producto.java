
package tp6_colecciones_y_sistema.de.stock.ejercicio1;

public class Producto {
    private String id;
    private String nombre;
    private Double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, Double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }
    public CategoriaProducto getCategoria() {
        return categoria;
    }
    public Double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    

    
    public static void imprimirCategorias() {
        System.out.println("Categorías disponibles:");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("- " + categoria.name() + ": " + categoria.getDescripcion());
        }
    }
    
    
    public String actualizarStock(String id, int nuevaCantidad) {
        this.cantidad = nuevaCantidad;
        return nombre;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + '}';
    }
}
