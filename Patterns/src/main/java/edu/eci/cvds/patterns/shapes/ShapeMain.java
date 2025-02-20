package edu.eci.cvds.patterns.shapes;

/**
 * Clase principal que ejecuta el programa y permite la creación de formas geométricas.
 */
public class ShapeMain {
    /**
     * Punto de entrada del programa. Crea una forma basada en el argumento recibido.
     *
     * @param args Argumento de tipo {@link RegularShapeType}, indicando la forma a crear.
     */
    public static void main(String[] args) {
        if (args == null || args.length != 1) {
            System.err.println("Parameter of type RegularShapeType is required.");
            return;
        }
        try {
            // Convierte el argumento en un tipo RegularShapeType
            RegularShapeType type = RegularShapeType.valueOf(args[0]);

            // Crea la forma usando la fábrica
            Shape shape = ShapeFactory.create(type);

            // Muestra el resultado
            System.out.println(
                String.format(
                    "Successfully created a %s with %s sides.",
                    type,
                    shape.getNumberOfEdges()
                )
            );
        } catch (IllegalArgumentException ex) {
            System.err.println(
                "Parameter '" + args[0] + "' is not a valid RegularShapeType"
            );
        }
    }
}
