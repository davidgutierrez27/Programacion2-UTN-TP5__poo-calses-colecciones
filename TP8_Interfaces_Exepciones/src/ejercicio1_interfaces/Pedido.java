
package ejercicio1_interfaces;

import java.util.ArrayList;

/**
3.	Clase Pedido: tiene una lista de productos, implementa Pagable y calcula el total del pedido.  
 */
public class Pedido implements Pagable {
    private ArrayList<Producto> productos = new ArrayList<>();
    private String estado;
    private Notificable cliente;

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }


    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("El pedido cambió su estado a: " + nuevoEstado);
    }
    
    @Override
    public double calcularTotal() {
        double totalPedido = 0;
        for (Producto producto : productos) {
            totalPedido += producto.calcularTotal();
        }
        return totalPedido;
    }
}
