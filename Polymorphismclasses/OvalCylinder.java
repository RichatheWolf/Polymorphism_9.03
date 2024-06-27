public class OvalCylinder extends Oval {
	// instance variables
	private int height;
	
	// Constructor for objects of class OvalCylinder
	public OvalCylinder(int x, int y, int rad1, int rad2, int h) {
		// call superclass
		super(x, y, rad1, rad2);
		
		// initialize instance variables
		height = h;
	}
	
	public int getHeight() {
		return height;
	}
	
	//Additional method to return the name of the shape
	public String getNamemethod() {
		return "Oval Cylinder";
	}
}
