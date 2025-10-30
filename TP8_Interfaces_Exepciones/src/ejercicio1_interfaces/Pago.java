
package ejercicio1_interfaces;

/**
4.	Ampliar con interfaces Pago y PagoConDescuento para distintos medios de pago (TarjetaCredito, PayPal), con métodos procesarPago(double) y aplicarDescuento(double). 
 */

public class Pago implements PagoSinDescuento, PagoConDescuento{
    private boolean aplicarDescuento;
    private MedioPago medioPago;

    public Pago(MedioPago medioPago) {
        this.medioPago = medioPago;
        this.aplicarDescuento = true;
    }
    
    public Pago() {
    }

    @Override
    public double aplicarDescuento(double monto) {
        if (!aplicarDescuento) return monto;

        switch (medioPago) {
            case TARJETA_CREDITO:
                return monto * 0.88; // 12% de descuento
            case PAYPAL:
                return monto * 0.92; // 8% de descuento
            default:
                return monto;
        }
    }

    @Override
    public void procesarPago(double monto) {
        double montoFinal = aplicarDescuento(monto);
        System.out.println("💳 Pago procesado por $" + montoFinal + 
            (aplicarDescuento ? " (descuento aplicado con " + medioPago + ")" : ""));
        }
    

}
