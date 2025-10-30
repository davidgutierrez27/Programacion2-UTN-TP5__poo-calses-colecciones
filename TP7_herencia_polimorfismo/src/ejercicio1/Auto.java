
package ejercicio1;

/**
 Auto con atributo adicional cantidadPuertas, sobrescribe mostrarInfo()  
●	Tarea: Instanciar un auto y mostrar su información completa.
 */
public class Auto extends Vehiculo{
    private int cantidadPuertas;

    
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    
    public void mostrarInfo(){
            super.mostrarInfo();
            System.out.println("Cantidad de puertas de Auto " + cantidadPuertas);
    }
}
