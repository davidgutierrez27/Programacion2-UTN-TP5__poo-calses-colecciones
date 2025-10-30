
package ejercicio3;

import java.util.ArrayList;

/**
 3.	Empleados y polimorfismo  
●	Clase abstracta: Empleado con método calcularSueldo()  
●	Subclases: EmpleadoPlanta, EmpleadoTemporal  
●	Tarea: Crear lista de empleados, invocar calcularSueldo() polimórficamente, usar instanceof para clasificar  

 */
public class NewMain {

    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();
        
        Empleado emp1 = new EmpleadoPlanta("David", "027FA", "Dev Senior", 2000.0, 3);
        Empleado emp2 = new EmpleadoPlanta("Ale", "045FA", "Dev Senior", 2000.0, 2);
        Empleado emp3 = new EmpleadoPlanta("Maxi", "012FA", "Dev junior", 1500.0, 1);
        Empleado emp4 = new EmpleadoTemporal("Mati", "055FA", "QA", 50, 45);
        Empleado emp5 = new EmpleadoTemporal("Tomas", "016FA", "Diseñador", 45, 50);
       
        
        l1.add(emp1); 
        l1.add(emp2);
        l1.add(emp3);
        l1.add(emp4);
        l1.add(emp5);
        
        emp1.calcularSueldo();
        emp2.calcularSueldo();
        emp3.calcularSueldo();
        emp4.calcularSueldo();
        emp5.calcularSueldo();
    }
}
