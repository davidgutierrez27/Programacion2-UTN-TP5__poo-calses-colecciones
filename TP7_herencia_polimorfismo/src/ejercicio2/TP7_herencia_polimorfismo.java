
package ejercicio2;

import java.util.ArrayList;

/**
2.	Figuras geométricas y métodos abstractos  
●	Clase abstracta: Figura con método calcularArea() y atributo nombre  
●	Subclases: Círculo y Rectángulo implementan el cálculo del área  
●	Tarea: Crear un array de figuras y mostrar el área de cada una usando polimorfismo.  

 */
public class TP7_herencia_polimorfismo {

    public static void main(String[] args) {
        
        ArrayList fig = new ArrayList();
        Figura f1 = new Circulo(24, "Circulito");
        fig.add(f1);
        f1.calcularArea();
        
        System.out.println("//////////////////////");
        
        Figura f2 = new Rectangulo(10, 15, "Rectangulito");
        fig.add(f2);
        f2.calcularArea();
    }

}
