
package tp6_colecciones_y_sistema.de.stock.ejercicio1;

public class TP6_Colecciones_y_SistemaDeStock {

    public static void main(String[] args) {
        
        Inventario in1 = new Inventario();
        AgregarProductos(in1);
        
        in1.actualizarStock("1", 10);
        in1.actualizarStock("6", 10);
        in1.obtenerTotalStock();
        in1.obtenerProductoConMayorStock();
        
        in1.mostrarCategoriasDisponibles();
        
        //in1.ListarProductos();
        //in1.ListarpId("65");
        //in1.ListarpCategoria(CategoriaProducto.ROPA);
        //in1.ListarpPrecio(600.0, 900.0); 
    }
    
    
    
    
    
    
    private static void AgregarProductos(Inventario i) {
        Producto p1 = new Producto("1", "Zapatillas", 500.0, 5, CategoriaProducto.ROPA);
        Producto p2 = new Producto("2", "Botas", 800.0, 2, CategoriaProducto.ROPA);
        Producto p3 = new Producto("3", "Papas Fritas", 200.0, 10, CategoriaProducto.ALIMENTOS);
        Producto p4 = new Producto("4", "Celular", 1000.0, 1, CategoriaProducto.ELECTRONICA);
        Producto p5 = new Producto("5", "Silla", 750.0, 2, CategoriaProducto.HOGAR);
        
        i.agregarProducto(p1);
        i.agregarProducto(p2);
        i.agregarProducto(p3);
        i.agregarProducto(p4);
        i.agregarProducto(p5);
        
        
        
        
    }

}
