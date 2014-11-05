package geometry;

/**
 * ConvexPolygon Interface
 * 
 * Provides additional methods for polygons. Implementations of this interface
 * may also provide more efficient ways of computation for some methods given in
 * Polygon.
 * 
 * -> Must fulfill isConvex() to prevent 'IllegalPolygonException'
 * 
 */

public interface ConvexPolygon extends Polygon {

	/**
	 * calculates the area
	 * 
	 * @return area of the Polygon
	 */
	double getArea();

	/**
	 * calculates the center of gravity
	 * 
	 * @return Point which represents the center of gravity
	 */
	Vertex getCenterOfGravity();

	/**
	 * rotates the polygon about the center of gravity by the given angle
	 * (degree)
	 * 
	 * @param angle
	 *            angle by which the Polygon is rotated
	 */
	void rotate(double angle);

	/**
	 * converts ConvexPolygon to Rectangle the polygon must be a rectangle to
	 * prevent 'IllegalPolygonException'
	 * 
	 * @return Array of all vertices
	 */
	Rectangle toRectangle() throws IllegalPolygonException;

	/**
	 * Gets a Group of other polygons and a direction vector.
	 * Computates the factor you can multiply with the components
	 * of the vector to determine the distance which is save to go
	 * without collision.
	 * 
	 * e.g. b.converge([c],1,0) => 5 or b.converge([c],0.2,0) => 25
	 * -> you can move b 5 units to the right without collision 
	 * 
	 * e.g. b.converge[c],1,2) => 3
	 * -> you can move b 3 units to the right and 6 units up without collision
	 * 
	 * throws IllegalOperationException if b is already overlapping with the other polygons.
	 * returns a value <= (-1) if there is no limitation.
	 * 
	 * @param p list of polygons
	 * @param x x-component of direction vector
	 * @param y y-component of direction vector
	 * @return factor you can multiply with the components of the direction vector 
	 * to determine the distance which is save to go. 
	 * @throws IllegalOperationException
	 */
	double converge(Polygon[] p, double x, double y)
			throws IllegalOperationException;

	/**
	 * Creates the bounding box of a single polygon e.g. a.getboundingBox()
	 * 
	 * @return Rectangle which represents the bounding box
	 */
	Rectangle getBoundingBox();

	/**
	 * Creates the bounding box of n+1 polygons e.g. a.getboundingBox([b,c,d])
	 * 
	 * @param polygons
	 *            n additional polygons
	 * @return Rectangle which represents the bounding box
	 */
	Rectangle getBoundingBox(Polygon[] polygons);

}
