
package ejercicio2_exepciones;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {
    public static void main(String[] args) {
        try {
            File archivo = new File("datos.txt");
            Scanner lector = new Scanner(archivo);

            System.out.println("Contenido del archivo:");
            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }
            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no existe o no se puede leer.");
        }
    }
}

