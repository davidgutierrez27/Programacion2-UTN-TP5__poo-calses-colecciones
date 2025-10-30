
package ejercicio3;

/**
●	Subclases: EmpleadoTemporal 
 */
public class EmpleadoTemporal extends Empleado{
    private double tarifaHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, String id, String puesto, double tarifaHora, int horasTrabajadas) {
        super(nombre, id, puesto);
        this.tarifaHora = tarifaHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void calcularSueldo() {
        if (tarifaHora <= 0 || horasTrabajadas < 0) {
            System.out.println("Empleado invalido");
        }
        System.out.println("Empleado Temporal; "+super.getNombre()+" "+super.getPuesto());
        System.out.println("Sueldo es de; "+(tarifaHora * horasTrabajadas));
        System.out.println("");
    }

    @Override
    public String toString() {
        return "EmpleadoTemporal{" + "tarifaHora=" + tarifaHora + ", horasTrabajadas=" + horasTrabajadas + '}';
    }

    
}
