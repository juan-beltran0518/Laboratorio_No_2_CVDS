package edu.eci.cvds.patterns.archetype;

import java.util.Scanner;
import edu.eci.cvds.patterns.shapes.ShapeMain;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        if (args.length > 0) {
            ShapeMain.main(args);
        } 
        
        else {
            System.out.println("No se proporcionaron argumentos.");
            System.out.print("Ingrese un argumento: ");
            String userInput = scanner.nextLine(); // Leer entrada del usuario

            // Ejecutar ShapeMain con el argumento ingresado
            ShapeMain.main(new String[]{userInput});
        }

        scanner.close(); // Cerrar el Scanner
    }
}
