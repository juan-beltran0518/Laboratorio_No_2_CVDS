package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * Representa un hexágono, una figura geométrica de seis lados.
 */
public class Hexagon implements Shape {
    /**
     * Retorna el número de lados del hexágono.
     *
     * @return Número de lados del hexágono (6).
     */
    public int getNumberOfEdges() {
        return 6;
    }
}
