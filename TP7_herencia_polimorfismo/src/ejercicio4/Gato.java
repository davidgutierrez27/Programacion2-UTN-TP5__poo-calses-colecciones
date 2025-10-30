
package ejercicio4;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Gato extends Animal{

    public Gato(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("MIAU MIAU");
    }
}
