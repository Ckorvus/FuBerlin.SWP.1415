/**
 * 
 */
package geometryImpl;

import geometry.APRectangle;
import geometry.ConvexPolygon;
import geometry.IllegalPolygonException;
import geometry.Polygon;
import geometry.Vertex;

/**
 * @author Corvus
 *
 */
public class ConvexPolygonImpl implements Polygon {

	/* (non-Javadoc)
	 * @see geometry.Polygon#rotate(double, geometry.Vertex)
	 */
	@Override
	public void rotate(double angle, Vertex center) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see geometry.Polygon#translate(double, double)
	 */
	@Override
	public void translate(double x, double y) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see geometry.Polygon#isConvex()
	 */
	@Override
	public boolean isConvex() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see geometry.Polygon#getConvexHull()
	 */
	@Override
	public ConvexPolygon getConvexHull() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see geometry.Polygon#getConvexHull(geometry.Polygon[])
	 */
	@Override
	public ConvexPolygon getConvexHull(Polygon[] polygons) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see geometry.Polygon#getAPBoundingBox()
	 */
	@Override
	public APRectangle getAPBoundingBox() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see geometry.Polygon#getAPBoundingBox(geometry.Polygon[])
	 */
	@Override
	public APRectangle getAPBoundingBox(Polygon[] polygons) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see geometry.Polygon#overlaps(geometry.Polygon)
	 */
	@Override
	public boolean overlaps(Polygon polygon) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see geometry.Polygon#getVertices()
	 */
	@Override
	public Vertex[] getVertices() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see geometry.Polygon#toConvexPolygon()
	 */
	@Override
	public ConvexPolygon toConvexPolygon() throws IllegalPolygonException {
		// TODO Auto-generated method stub
		return null;
	}

}
