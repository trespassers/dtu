package Uge1_Opgave2;

public class Vector {
	private double x;
	private double y;


	public Vector (double x, double y) {
		this.y = y;
		this.x = x;
	}
	
	public double times(Vector v) {
		double result = x * v.x + y * v.y;
		return result;
	}
	
	public Vector times(double v) {
		double newX = x * v;
		double newY = y * v;
		Vector newVector = new Vector(newX, newY);
		return newVector;
	}
	
	
	public String toString() {
		return "x = " + x + "y = " + y;
	}

	public Vector add(Vector v) {
		double newX = x + v.x;
		double newY = y + v.y;
		Vector newVector = new Vector(newX, newY);
		return newVector;
	}
	
	public boolean equals(Vector v) {
		if (x == v.x && y == v.y)
			return true;
		else return false;
	}
	
	public int compareTo(Vector v) {
		int result = 1000;
		if (x > v.x)
			result = 1;
		else if (x == v.x && y == v.y)
			result = 0;
		else if (x < v.x && y < v.y)
			result = -1;
		else if (x < v.x && y == v.y)
			result = -1;
		else if (x == v.x && y < v.y)
			result = -1;
		else System.out.println("Vektor falder udenfor kategori");
		return result;
			
	}
	

}
