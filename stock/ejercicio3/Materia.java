
package tp6_colecciones_y_sistema.de.stock.ejercicio3;

import java.util.ArrayList;

/**
 Clase Curso 
Atributos: 
•	codigo (String) → Código único. 
•	nombre (String) → Nombre del curso. 
•	profesor (Profesor) → Profesor responsable. 
Métodos sugeridos: 
•	setProfesor(Profesor p) → Asigna/cambia el profesor sincronizando ambos lados: o 	Si tenía profesor previo, quitarse de su lista. 
•	mostrarInfo() → Muestra código, nombre y nombre del profesor (si tiene). 

 */
public class Materia {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Materia(String codigo, String nombre, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
    }
    public Materia(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

     public void setProfesor(Profesor profesor) {
        if (this.profesor == profesor) return; // return corta
        
        Profesor viejo = this.profesor;
        this.profesor = profesor;

        // quitar de la lista del profesor viejo (sin volver a llamar setProfesor)
        if (viejo != null) {
            viejo.eliminarMateria(this);
        }
        // agregar a la lista del nuevo profesor 
        if (profesor != null) {
            profesor.agregarMateria(this);
        }
    }
     
     

    public String getCodigo() {
        return codigo;
    }
    
 
    public void eliminaProfesor(){
        if (profesor != null) {
            profesor.eliminarMateria(this);
            System.out.println("Eliminado incluso su profesor");
        }else {
            System.out.println("No tenia prof asignado");     
        }
    }
    


    
    public void mostrarInfo() {
        System.out.println("Esta materia es: " + nombre);
        System.out.println("Con codigo; "+codigo);
        if (profesor != null) {
            System.out.println("Su profesor; ");
            profesor.mostrarInfoResumen();
        }else {
            System.out.println("NO TIENE FROFESOR ASIGNADO");
        }
        System.out.println(" ");
    }
    
    public void mostrarInfoResumen() {
        System.out.println("        materia: " + nombre);
    }
}
