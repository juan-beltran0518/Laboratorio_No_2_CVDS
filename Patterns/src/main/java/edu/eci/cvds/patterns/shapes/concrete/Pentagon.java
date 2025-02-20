package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * Representa un pentágono, una figura geométrica de cinco lados.
 */
public class Pentagon implements Shape {
    /**
     * Retorna el número de lados del pentágono.
     *
     * @return Número de lados del pentágono (5).
     */
    public int getNumberOfEdges() {
        return 5;
    }
}
