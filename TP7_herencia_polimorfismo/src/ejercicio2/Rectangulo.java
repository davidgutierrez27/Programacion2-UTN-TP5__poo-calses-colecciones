
package ejercicio2;

/**
Subclases: Círculo y Rectángulo implementan el cálculo del área
 */

public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea(){
        System.out.println("Area de " + super.getNombre() +" es; "+ (2 * base + 2 * altura));
    }
}