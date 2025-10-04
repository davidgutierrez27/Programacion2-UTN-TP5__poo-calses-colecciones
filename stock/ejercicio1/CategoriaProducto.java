
package tp6_colecciones_y_sistema.de.stock.ejercicio1;

public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),  
    ELECTRONICA("Dispositivos electrónicos"),  
    ROPA("Prendas de vestir"),     
    HOGAR("Artículos para el hogar");     
    private final String descripcion; 
    
    private CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getDescripcion() {         
        return descripcion;  
    }
    
}
