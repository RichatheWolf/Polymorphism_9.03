public class Cylinder extends Circle{
	// instance variables
	private int height;
	
	// Constructor for objects of class Cylinder
	public Cylinder(int x, int y, int rad, int h) {
		// call superclass
		super(x, y, rad);
		
		// initialize instance variables
		height = h;
	}
	
	public int getHeight() {
		return height;
	}
	
	//Additional method to return the name of the shape
	public String getNamemethod() {
		return "Cylinder";
	}
}
