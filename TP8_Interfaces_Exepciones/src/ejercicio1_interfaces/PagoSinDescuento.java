
package ejercicio1_interfaces;

/**
4.	Ampliar con interfaces Pago y PagoConDescuento para distintos medios de pago (TarjetaCredito, PayPal), con métodos procesarPago(double) y aplicarDescuento(double). 
 */
public interface PagoSinDescuento {
    default void procesarPago(double monto){
        double montoFinal = monto;
        System.out.println("💳 Pago procesado por $" + montoFinal);
    }
}
