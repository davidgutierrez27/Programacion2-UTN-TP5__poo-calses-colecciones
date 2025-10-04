
package tp6_colecciones_y_sistema.de.stock.ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 Clase Universidad Atributos: 
•	String nombre 
•	List<Profesor> profesores 
•	List<Curso> cursos 
Métodos requeridos: 
•	agregarProfesor(Profesor p) 
•	agregarCurso(Curso c) 
•	asignarProfesorACurso(String codigoCurso, String idProfesor) → Usa setProfesor del curso. 
•	listarProfesores() / listarCursos() 
•	buscarProfesorPorId(String id) 
•	buscarCursoPorCodigo(String codigo) 
•	eliminarCurso(String codigo) → Debe romper la relación con su profesor si la hubiera. 
•	eliminarProfesor(String id) → Antes de remover, dejar null los cursos que dictaba. 

 */
public class Universidad {
    private String nombre;
    private ArrayList <Profesor> profesores;
    private ArrayList <Materia> materias;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.materias = new ArrayList<>();
    }
    
    
// AGREGAR CURSO / PROGESOR
    public void agregarProfesor(Profesor p){
        profesores.add(p);
    }
    public void agregarMateria(Materia m){
        materias.add(m);
    }
    
    
    
// MOSTRAR MATERIAS / PROFESORES
    public void mostrarProfesores(){
        System.out.println("================== LISTA DE PROFESORES ==================");
        for (Profesor profAMostrar : profesores) {
            profAMostrar.mostrarInfo();
        }
        System.out.println("==========================================================");
    }
    public void mostrarMaterias(){
        System.out.println("=================== LISTA DE MATERIAS ===================");
        for (Materia matAMostrar : materias) {
            matAMostrar.mostrarInfo();
        }
        System.out.println("==========================================================");
    }
    
// MOSTRAR PROFESOR POR ID    
    public void buscarProfesorPorId(String id){
        boolean bandera = false;
        for (Profesor profesor1 : profesores) {
            if (profesor1.getId().equalsIgnoreCase(id)) {
                System.out.println("PROFESOR QUE CORRESPODE AL ID; "+id+" ES");
                profesor1.mostrarInfo();
                bandera = true;
            }
        }
        if (!bandera){
            System.out.println("PROFESOR ID; "+id+" NO ENCONTRADO");     
        }
    }
    
    
// MOSTRAR MATERIA    
    public void buscarMateriaPorCodigo(String codigo){
        boolean bandera = false;
        for (Materia mat : materias) {
            if (mat.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("MATERIA QUE CORRESPODE AL CODIGO; "+codigo+" ES");
                mat.mostrarInfo();
                bandera = true;
            }
        }
        if (!bandera){
            System.out.println("MATERIA QUE CORRESPODE AL CODIGO; "+codigo+" NO ENCONTRADO");     
        }
    }
    
    
    
// ASIGNAR PROFESOR A MATERIA    
    public void asignarProfesorAMateria(String codigoCurso, String idProfesor){
        for (Materia materia : materias) {
            if (materia.getCodigo().equalsIgnoreCase(codigoCurso)) {
                for (Profesor profesor1 : profesores) {
                    if (profesor1.getId().equalsIgnoreCase(idProfesor)) {
                        materia.setProfesor(profesor1);
                    }
                }
            }
        }
        for (Profesor prof : profesores) {
            if (prof.getId().equalsIgnoreCase(idProfesor)) {
                for (Materia materia : materias) {
                    if (materia.getCodigo().equalsIgnoreCase(codigoCurso)) {
                        prof.agregarMateria(materia);
                    }
                }
            }
        }
    }
    

// ELIMINAR MATERIA
    public void eliminarMateria(String codigo){
        Materia encontrada = null;
        for (Materia m : materias) {
            if (m.getCodigo().equalsIgnoreCase(codigo)) {
                encontrada = m;
                break;
            }
        }
        if (encontrada != null) {
            encontrada.setProfesor(null); // rompe relación
            materias.remove(encontrada);
            System.out.println("Materia con código " + codigo + " eliminada.");
        } else {
            System.out.println("MATERIA COD; " + codigo + " NO ENCONTRADA");
        }
    }

    
    // ELIMINAR PROFESOR
    public void eliminarProfesor(String id) {
        Iterator<Profesor> it = profesores.iterator();
        while (it.hasNext()) {
            Profesor p = it.next();
            if (p != null && p.getId() != null && p.getId().equalsIgnoreCase(id)) {
                // Desasignar TODAS las materias
                if (p.getMaterias() != null) {
                    for (Materia m : p.getMaterias()) {
                        if (m != null) {
                            m.setProfesor(null);
                        }
                    }
                    // Vaciar la lista de materias
                    p.getMaterias().clear();
                }

                // Eliminar al profesor de la colección
                it.remove();
                System.out.println("Profesor con id " + id + " eliminado y desasignado de sus materias.");
                return;
            }
        }
        System.out.println("PROFESOR ID " + id + " NO ENCONTRADO");
    }
    


    // Cantidad de materias por profesor
    public void reporteCantidadMateriasPorProfesor(){
        System.out.println("=== REPORTE DE CANTIDAD DE MATERIAS POR PROFESOR ===");
        for (Profesor prof : profesores) {
            System.out.println("Profesor: " + prof.getNombre() + " - Cantidad de materias: " + prof.getMaterias().size());
        }
        System.out.println("=====================================================");
    }
    
}
