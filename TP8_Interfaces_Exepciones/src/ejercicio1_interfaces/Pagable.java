
package ejercicio1_interfaces;

/**
1.	Crear una interfaz Pagable con el método calcularTotal().  
2.	Clase Producto: tiene nombre y precio, implementa Pagable.  
3.	Clase Pedido: tiene una lista de productos, implementa Pagable y calcula el total del pedido.  
4.	Ampliar con interfaces Pago y PagoConDescuento para distintos medios de pago (TarjetaCredito, PayPal), con métodos procesarPago(double) y aplicarDescuento(double).  
5.	Crear una interfaz Notificable para notificar cambios de estado. La clase Cliente implementa dicha interfaz y Pedido debe notificarlo al cambiar de estado.  

 */
public interface Pagable {
    public abstract double calcularTotal();
}
