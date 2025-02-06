package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;
public class ShapeFactory{

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
