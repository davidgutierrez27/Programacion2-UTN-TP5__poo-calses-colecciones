
package tp6_colecciones_y_sistema.de.stock.ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 Clase Inventario  
Atributo:  
●	ArrayList<Producto> productos
* 
* Métodos requeridos:  
●	agregarProducto(Producto p)  
●	listarProductos()  
●	buscarProductoPorId(String id) 
●	filtrarPorCategoria(CategoriaProducto categoria)  
●	filtrarProductosPorPrecio(double min, double max)  
●	eliminarProducto(String id)
●	actualizarStock(String id, int nuevaCantidad)
●	obtenerTotalStock()  
●	obtenerProductoConMayorStock()  
●	mostrarCategoriasDisponibles()  
  

 */
public class Inventario {
    private final ArrayList <Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    
    //●	actualizarStock(String id, int nuevaCantidad) 
    public void actualizarStock(String id, int nuevaCantidad) {
        boolean encontrado = false;
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
             String nombreProducto = producto.actualizarStock(id, nuevaCantidad);
                System.out.println("actualizarStock; Cantidad de " + nombreProducto + ": se actualizo a "+nuevaCantidad + " CON EXITO");
                encontrado = true;
            }
        }
        if (!encontrado) {
        System.out.println("actualizarStock; NO se logró encontrar producto con este ID: " + id);
        }
    }
    
    //Obtener total de Stock (cantidad)
    public void obtenerTotalStock(){
        int cantidadTotal = 0;
        for (Producto producto : productos) {
            cantidadTotal += producto.getCantidad();
        }
        System.out.println("TotalStock: "+cantidadTotal);
    }
    
    //Obtener total de MAYOR Stock (cantidad)
    public void obtenerProductoConMayorStock(){
        int maxCantidad = Integer.MIN_VALUE;
        for (Producto producto : productos) {
            if (producto.getCantidad() > maxCantidad) {
                maxCantidad = producto.getCantidad();
            }
        }
        System.out.println("ProductoConMayorStock: " + maxCantidad);
    }
    
    //Mostrar categorias disponibles
    public void mostrarCategoriasDisponibles(){
        for (Producto producto : productos) {
            Producto.imprimirCategorias();
        }
    }
    
    
    
    
    //lista todos los productos de una
    public void ListarProductos(){
        for (Producto productos : productos) {
            System.out.println(productos);  //aca se utiliza tostring 
        }
    }
    
    //lista por id pero muestra desde aca, sino abria que mandar a main y ahi guardar en una variable y sacarla por consola
    public void ListarpId(String id){
        ArrayList <Producto> pEncontrado = new ArrayList<>();
        for (Producto productos : productos) {
            if  (productos.getId() == id ){
                pEncontrado.add(productos);
            }
        }//saco a consola de esta manera porque se supone que id hay uno solo por producto
        System.out.println(pEncontrado);
    }
    
    public void ListarpCategoria(CategoriaProducto cat){
        ArrayList <Producto> pEncontrado = new ArrayList<>();
        for (Producto productos : productos) {
            if  (productos.getCategoria() == cat ){
                pEncontrado.add(productos);
            }
        } //for porque puede haber muchos
        for (Producto producto : pEncontrado) {
            System.out.println(producto);
        }
        
    }
    
    public void ListarpPrecio(double min, double max){
        ArrayList <Producto> pEncontrado = new ArrayList<>();
        for (Producto productos : productos) {
            if  (productos.getPrecio() >= min && productos.getPrecio() <= max){
                pEncontrado.add(productos);
            }
        } //asi porque puede haber muchos
        for (Producto producto : pEncontrado) {
            System.out.println(producto);
        }
        
    }
    
    public void eliminarProducto(String id){
        ArrayList <Producto> pEncontrado = new ArrayList<>();
        for (Producto producto : productos) {
            if  (producto.getId().equals(id)){
                pEncontrado.clear();
            }
        }//asi porque se supone que id hay uno solo por producto
        System.out.println(pEncontrado + "Eliminado con exito");
    }
    
    
}
