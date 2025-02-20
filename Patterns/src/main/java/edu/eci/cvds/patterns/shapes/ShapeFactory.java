package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

/**
 * Fábrica para la creación de formas geométricas regulares.
 */
public class ShapeFactory {
    /**
     * Crea una instancia de una forma geométrica basada en el tipo especificado.
     *
     * @param type Tipo de forma geométrica a crear.
     * @return Una instancia de {@link Shape}, o {@code null} si el tipo no es válido.
     */
    public static Shape create(RegularShapeType type) {
        switch (type) {
            case Triangle:
                Triangle t = new Triangle();
                return t;

            case Quadrilateral:
                Quadrilateral q = new Quadrilateral();
                return q;

            case Pentagon:
                Pentagon p = new Pentagon();
                return p;

            case Hexagon:
                Hexagon h = new Hexagon();
                return h;

            default:
                break;
        }
        return null;
    }
}
