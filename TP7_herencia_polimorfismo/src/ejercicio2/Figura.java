
package ejercicio2;

/**
Clase abstracta: Figura con método calcularArea() y atributo nombre
 */
public abstract class Figura {
    private String nombre;

    
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    public abstract void calcularArea();
}
