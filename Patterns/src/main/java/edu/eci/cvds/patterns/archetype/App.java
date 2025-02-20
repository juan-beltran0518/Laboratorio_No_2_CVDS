package edu.eci.cvds.patterns.archetype;

import java.util.Scanner;
import edu.eci.cvds.patterns.shapes.ShapeMain;

/**
 * Clase principal que ejecuta la aplicación.
 */
public class App {
    /**
     * Método principal que inicia la ejecución del programa.
     * Si se proporcionan argumentos en la línea de comandos, los pasa a `ShapeMain`.
     * Si no hay argumentos, solicita al usuario ingresar uno manualmente.
     *
     * @param args Argumentos proporcionados en la ejecución del programa.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (args.length > 0) {
            ShapeMain.main(args);
        } else {
            System.out.println("No se proporcionaron argumentos.");
            System.out.print("Ingrese un argumento: ");
            String userInput = scanner.nextLine(); 
            ShapeMain.main(new String[]{userInput});
        }

        scanner.close(); 
    }
}
