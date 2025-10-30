
package ejercicio2;

/**
Subclases: Círculo y Rectángulo implementan el cálculo del área
 */

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public void calcularArea(){
        System.out.println("Area de " + super.getNombre() +" es; "+ (2 * this.radio * Math.PI));
    }
}
