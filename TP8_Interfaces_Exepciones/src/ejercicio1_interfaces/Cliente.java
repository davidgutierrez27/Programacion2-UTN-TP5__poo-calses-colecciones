
package ejercicio1_interfaces;

public class Cliente implements Notificable {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("📩 Notificación para " + nombre + ": " + mensaje);
    }
}

