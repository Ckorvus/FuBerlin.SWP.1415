package geometry;

public class Vertex {

	public double x;
	public double y;

	public Vertex(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Vertex() {
		this(0, 0);
	}

	public void setLocation(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Vertex))
			return false;

		Vertex v = (Vertex) obj;
		return v.x == x && v.y == y;
	}

	@Override
	public int hashCode() {
		return (int) (x + y);
	}
	
	@Override
	public String toString(){
		return "( " + x + " | " + y +")";
		
	}

}
