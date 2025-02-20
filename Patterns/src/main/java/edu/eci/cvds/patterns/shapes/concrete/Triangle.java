package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * Representa un triángulo, una figura geométrica de tres lados.
 */
public class Triangle implements Shape {
    /**
     * Retorna el número de lados del triángulo.
     *
     * @return Número de lados del triángulo (3).
     */
    public int getNumberOfEdges() {
        return 3;
    }
}
