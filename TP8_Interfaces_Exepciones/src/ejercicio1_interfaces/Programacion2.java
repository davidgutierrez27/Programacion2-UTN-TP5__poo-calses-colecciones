
package ejercicio1_interfaces;

import java.util.ArrayList;

public class Programacion2 {

    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("David");

        // Crear pedido y asociarlo al cliente
        Pedido pedido = new Pedido(cliente);

        // Agregar productos
        pedido.agregarProducto(new Producto("Mouse inalámbrico", 4500));
        pedido.agregarProducto(new Producto("Teclado mecánico", 12000));
        pedido.agregarProducto(new Producto("Auriculares", 8000));

        // Calcular total del pedido
        double total = pedido.calcularTotal();
        System.out.println("🧾 Total del pedido: $" + total);

        // Crear pago (por ejemplo con tarjeta, con descuento)
        Pago pago = new Pago(MedioPago.TARJETA_CREDITO);
        Pago pago2 = new Pago(); // sin descuentp

        // Procesar el pago
        pago.procesarPago(total);

        // Cambiar estado del pedido (cliente será notificado)
        pedido.cambiarEstado("En preparación");
        pedido.cambiarEstado("En camino");
        pedido.cambiarEstado("Entregado");
    }

}
