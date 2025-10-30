
package ejercicio4;


public class Perro extends Animal{

    public Perro(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("GUAU GUAU");
    }
}
