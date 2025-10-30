
package ejercicio4;

import java.util.ArrayList;

/**
4.	Animales y comportamiento sobrescrito  
●	Clase: Animal con método hacerSonido() y describirAnimal()  
●	Subclases: Perro, Gato, Vaca sobrescriben hacerSonido() con @Override  
●	Tarea: Crear lista de animales y mostrar sus sonidos con polimorfismo  

 */
public class NewMain {
    public static void main(String[] args) {
       ArrayList animales1 = new ArrayList();
       
       Animal perro1 = new Perro("Toni", 3, 7.5);
       Animal perro2 = new Perro("Roki", 5, 10);
       Animal gato1 = new Gato("Mia", 2, 3.2);
       Animal gato2 = new Gato("Michi", 1, 2);
       Animal vaca = new Vaca("Vaquera", 12, 120);
       
       perro1.listar();
       perro2.listar();
       gato1.listar();
       gato2.listar();
       vaca.listar();
    }
}
