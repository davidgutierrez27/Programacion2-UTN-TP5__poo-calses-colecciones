
package ejercicio3;

/**
●	Clase abstracta: Empleado con método calcularSueldo()  
* 
* Atributos
String nombre: nombre 
String id: código o ID del empleado 
String puesto: título o rol general.
* 
Métodos
abstract double calcularSueldo(): obliga a las subclases a definir la lógica de cálculo específica.
 */
public abstract class Empleado {
    private String nombre;
    private String id;
    private String puesto;

    public Empleado(String nombre, String id, String puesto) {
        this.nombre = nombre;
        this.id = id;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }
    
    
    
    public abstract void calcularSueldo();
}
