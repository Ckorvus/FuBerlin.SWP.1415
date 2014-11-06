/**
 * 
 */
package geometryImpl;

import geometry.Vertex;

/**
 * @author Corvus
 *
 */
class TwoDvector {
	double x;
	double y;

	TwoDvector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	TwoDvector(Vertex Vertex) {
		this.x = Vertex.x;
		this.y = Vertex.y;
	}
	
	Vertex toVertex() {
		return new Vertex(this.x, this.y);
	}
	
	TwoDvector add(TwoDvector vector) {
		return new TwoDvector(this.x + vector.x, this.y + vector.y);
	}
	
	TwoDvector sub(TwoDvector vector) {
		return new TwoDvector(this.x - vector.x, this.y - vector.y);
	}
	
	TwoDvector rotate(double degree) {
		double radians = Math.toRadians(degree);
	    double x = this.x * Math.cos(radians) - this.y * Math.sin(radians);
	    double y = this.x * Math.sin(radians) + this.y * Math.cos(radians);
	    return new TwoDvector(x, y);
	}
	
	double length() {
		return Math.sqrt(x*x+y*y);
	}
}
