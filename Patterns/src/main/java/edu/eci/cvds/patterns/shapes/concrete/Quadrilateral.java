package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * Representa un cuadrilátero, una figura geométrica de cuatro lados.
 */
public class Quadrilateral implements Shape {
    /**
     * Retorna el número de lados del cuadrilátero.
     *
     * @return Número de lados del cuadrilátero (4).
     */
    public int getNumberOfEdges() {
        return 4;
    }
}
