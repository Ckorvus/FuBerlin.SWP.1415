package geometry;

public interface Rectangle extends ConvexPolygon {

	/**
	 * Rectangle Interface
	 * 
	 * Due the simple shape of a rectangle implementations of Rectangle could
	 * provide extra fast ways of computation.
	 * 
	 */
	
	APRectangle toAPRectangle() throws IllegalPolygonException;
	

}
