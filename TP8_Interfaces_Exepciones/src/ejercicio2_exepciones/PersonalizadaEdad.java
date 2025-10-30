
package ejercicio2_exepciones;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class PersonalizadaEdad {
    
    // Excepción personalizada
    static class EdadInvalidaException extends Exception {
        public EdadInvalidaException(String mensaje) {
            super(mensaje);
        }
    }

    // Método que valida la edad
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad fuera de rango: " + edad);
        }
        System.out.println("Edad válida: " + edad);
    }

    // Programa principal
    public static void main(String[] args) {
        try {
            validarEdad(25);   // válida
            validarEdad(-5);   // lanza excepción
            validarEdad(130);  // lanza excepción
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

