
package tp6_colecciones_y_sistema.de.stock.ejercicio3;

import java.util.ArrayList;

/**
 Clase Profesor 
Atributos: 
•	id (String) → Identificador único. 
•	nombre (String) → Nombre completo. 
•	especialidad (String) → Área principal. 
•	List<Curso> cursos → Cursos que dicta. 
Métodos sugeridos: 
•	agregarCurso(Curso c) → Agrega el curso a su lista si no está y sincroniza el lado del curso. 
•	eliminarCurso(Curso c) → Quita el curso y sincroniza el lado del curso (dejar profesor en null si corresponde). 
•	listarCursos() → Muestra códigos y nombres. 
•	mostrarInfo() → Imprime datos del profesor y cantidad de cursos. 

 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList <Materia> materias;
    
    
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.materias = new ArrayList<>();
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    
    
    public String getId() {
        return id;
    }
    
    
    
    public ArrayList<Materia> getMaterias() {
        return materias;
    }
   
    void agregarMateria(Materia m) {
        if (m == null) return;
        if (materias.contains(m)) {
        } else {
            materias.add(m);
        }
    }
    
    public void eliminarMateria(Materia m) {
        materias.remove(m);
    }
    
    
// MOSTRAR MATERIAS
    public void mostrarMaterias(){
        System.out.println("LISTA DE MATERIAS");
        for (Materia materiaAMostrar : materias) {
            materiaAMostrar.mostrarInfo();
        }
        System.out.println("");
    }
    
// MOSTRAR INFO    
    public void mostrarInfo() {
        System.out.println("Profe id: " + id);
        System.out.println("Profe nombre: " + nombre);
        System.out.println("Profe especialidad: " + especialidad);
        if (materias != null) {
            System.out.println("Sus materias; ");
            for (Materia materia : materias) {
                materia.mostrarInfoResumen();
            }
        }else {
            System.out.println("NO TIENE MATERIA ASIGNADAS");
        }
        System.out.println(" ");
    }
    
    public void mostrarInfoResumen() {
        System.out.println("       Profe nombre: " + nombre);
        
    }
    
}
