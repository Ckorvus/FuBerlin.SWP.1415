/**
 * 
 */
package geometryImpl;

import java.util.Map;

import geometry.APRectangle;
import geometry.ConvexPolygon;
import geometry.IllegalPolygonException;
import geometry.Polygon;
import geometry.Vertex;

/**
 * @author Corvus
 *
 */
class PolygonImpl implements Polygon {
	Vertex[] vertices;
	Map<Integer, double[]> adjacencies;
	
	public PolygonImpl(Vertex[] vertices) throws IllegalPolygonException{
		if(vertices.length < 3) {
			throw new IllegalPolygonException();
		} else {
			this.vertices = vertices;
			adjacencies = null;
		}
	}

	/* (non-Javadoc)
	 * @see geometry.Polygon#rotate(double, geometry.Vertex)
	 */
	@Override
	public void rotate(double angle, Vertex center) {
		TwoDvector centre = new TwoDvector(center);
		TwoDvector position = new TwoDvector(vertices[0]);
		TwoDvector first_translation = centre.sub(position);	
		
		TwoDvector second_translation = first_translation.rotate(180);
		second_translation = second_translation.rotate(angle);
		
		TwoDvector merged_translation = first_translation.add(second_translation);

		translate(merged_translation.x, merged_translation.y);
	}

	/* (non-Javadoc)
	 * @see geometry.Polygon#translate(double, double)
	 */
	@Override
	public void translate(double x, double y) {
		TwoDvector translation = new TwoDvector(x, y);
		int size = vertices.length;
		for(; size > 0; size--) {
			vertices[size] = new TwoDvector(vertices[size]).add(translation).toVertex();
		}
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
		return vertices;
	}

	/* (non-Javadoc)
	 * @see geometry.Polygon#toConvexPolygon()
	 */
	@Override
	public ConvexPolygon toConvexPolygon() throws IllegalPolygonException {
		// TODO Auto-generated method stub
		return null;
	}
	
	private double getArea(){
		int n = vertices.length;
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum =+ (vertices[i].x*vertices[(i+1)%n].y-vertices[(i+1)%n].x*vertices[i].y);
		}
		return 0.5*sum;
	}
	
	private Vertex getCentroid() {
		double A = getArea();
		int n = vertices.length;
		double sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum =+ (vertices[i].x+vertices[(i+1)%n].x)*(vertices[i].x*vertices[(i+1)%n].y-vertices[(i+1)%n].x*vertices[i].y);
		}
		double x = (1/(6*A))*sum;
		
		for(int i = 0; i < n; i++) {
			sum =+ (vertices[i].y+vertices[(i+1)%n].y)*(vertices[i].x*vertices[(i+1)%n].y-vertices[(i+1)%n].x*vertices[i].y);
		}
		double y = (1/(6*A))*sum;
		return new Vertex(x, y);
	}
}
