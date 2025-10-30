
package ejercicio1_interfaces;

/**
4.	Ampliar con interfaces Pago y PagoConDescuento para distintos medios de pago (TarjetaCredito, PayPal), con métodos procesarPago(double) y aplicarDescuento(double). 
 */
public interface PagoConDescuento extends PagoSinDescuento{
    
    public double aplicarDescuento(double monto);
}
