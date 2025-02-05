public class Circle{
	// instance variables
	private int x;
	private int y;
	private int radius;
	
	// Constructor for objects of class Circle
	public Circle(int p_x, int p_y, int r) {
		// initialize instance variables
		x = p_x;
		y = p_y;
		radius = r;
	}
	
	public int getRadius() {
		return radius;
	}
	
	// Concatenates a String to show the center x, y point of the circle
	public String getCenter() {
		return "center is at (" + x + ", " + y + ")";
	}
	
	//Additional method to return the name of the shape
	public String getNamemethod() {
		return "Circle";
	}
}
