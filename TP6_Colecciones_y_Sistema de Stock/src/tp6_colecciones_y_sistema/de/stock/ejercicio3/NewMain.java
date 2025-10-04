package tp6_colecciones_y_sistema.de.stock.ejercicio3;

public class NewMain {
    public static void main(String[] args) {
        Universidad uni1 = new Universidad("UTN");

        // 1 y 2: crear y agregar
        Profesor profe1 = new Profesor("37554054", "Maxi", "materias tecnicas");
        Profesor profe2 = new Profesor("39594046", "Pablo", "materias tecnicas");
        Profesor profe3 = new Profesor("40200047", "Jose", "Idiomas");

        Materia mat1 = new Materia("pro1", "Programacion 1");
        Materia mat2 = new Materia("pro2", "Programacion 2");
        Materia mat3 = new Materia("ing", "Ingles");
        Materia mat4 = new Materia("mat", "Matematica");
        Materia mat5 = new Materia("bd1", "Base de datos 1", profe2);

        uni1.agregarProfesor(profe1);
        uni1.agregarProfesor(profe2);
        uni1.agregarProfesor(profe3);

        uni1.agregarMateria(mat1);
        uni1.agregarMateria(mat2);
        uni1.agregarMateria(mat3);
        uni1.agregarMateria(mat4);
        uni1.agregarMateria(mat5);

        // 3: asignar profesores
        uni1.asignarProfesorAMateria("pro1", "37554054");
        uni1.asignarProfesorAMateria("pro2", "37554054");
        uni1.asignarProfesorAMateria("ing", "40200047");
        uni1.asignarProfesorAMateria("mat", "39594046");

        // 4: listar
        System.out.println("***************** Listado inicial *****************");
        uni1.mostrarMaterias();
        uni1.mostrarProfesores();
        /*
        // 5: cambiar profesor de un curso
        System.out.println("* Cambio de profesor en Programacion 1");
        uni1.asignarProfesorAMateria("pro1", "39594046");
        uni1.mostrarMaterias();
        uni1.mostrarProfesores();
        
        // 6: remover curso
        System.out.println("* Eliminar Matematica");
        uni1.eliminarMateria("mat");
        uni1.mostrarMaterias();
        uni1.buscarProfesorPorId("39594046");
        */
        // 7: remover profesor
        System.out.println("* Eliminar profesor Maxi");
        uni1.eliminarProfesor("37554054");
        uni1.mostrarMaterias();
        //uni1.mostrarProfesores();
        
/*
        // 8: reporte
        System.out.println("\n--- Reporte de cursos por profesor ---");
        uni1.reporteCantidadMateriasPorProfesor();*/
    }
}

