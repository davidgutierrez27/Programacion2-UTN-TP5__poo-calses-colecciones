
package ejercicio1;

/**
1.	Vehículos y herencia básica  
●	Clase base: Vehículo con atributos marca, modelo y método mostrarInfo()  
●	Subclase: Auto con atributo adicional cantidadPuertas, sobrescribe mostrarInfo()  
●	Tarea: Instanciar un auto y mostrar su información completa.  

 */
public class TP7_herencia_polimorfismo {

    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo("Fiat", "106h"); //direcatamente desde vehiculo
        Vehiculo v2 = new Auto("Fiat", "106h", 4);  //Instanciamos auto a traves de vehiculo
        
        v1.mostrarInfo();
        System.out.println("////////////////");
        v2.mostrarInfo();
    }

}
