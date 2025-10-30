
package ejercicio3;

/**
●	Subclases: EmpleadoPlanta
 */
public class EmpleadoPlanta extends Empleado{
    private double salarioBase;
    private int antiguedadAnios;

    // incremento por año (p. ej., 0.5% del salarioBase por año)
    private static final double INCREMENTO_POR_ANIO = 0.005;

    public EmpleadoPlanta(String nombre, String id, String puesto, double salarioBase, int antiguedadAnios) {
        super(nombre, id, puesto);
        this.salarioBase = salarioBase;
        this.antiguedadAnios = antiguedadAnios;
    }

    
    @Override
    public void calcularSueldo() {
        if (salarioBase <= 0 || antiguedadAnios < 0) {
            System.out.println("Empleado invalido");
        }
        double incremento = salarioBase * antiguedadAnios * INCREMENTO_POR_ANIO;
        System.out.println("Empleado Planta; "+super.getNombre()+" "+super.getPuesto());
        System.out.println("Sueldo es de; "+(salarioBase + incremento));
        System.out.println("");
    }

    
    @Override
    public String toString() {
        return "EmpleadoPlanta{" + "salarioBase=" + salarioBase + ", antiguedadAnios=" + antiguedadAnios + '}';
    }
}
