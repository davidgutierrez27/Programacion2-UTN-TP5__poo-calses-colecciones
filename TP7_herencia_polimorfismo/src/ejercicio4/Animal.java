
package ejercicio4;

/**
Clase: Animal con método hacerSonido() y describirAnimal() 
 */
public abstract class Animal {
    private String nombre;
    private int edad;
    private double peso;

    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
   
    public void describirAnimal(){
        System.out.println(nombre+" tiene "+edad+" años y pesa "+peso);
    }
    
    public abstract void hacerSonido();
    
    public void listar(){
        describirAnimal();
        hacerSonido();
        System.out.println("");
    }
    
}
