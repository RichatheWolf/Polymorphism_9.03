public class Oval extends Circle {
	// instance variables
	private int radius2;
	
	// Constructor for objects of class Oval
	public Oval(int x, int y, int rad1, int rad2){
		// call superclass
		super(x, y, rad1);
		
		// initialize instance variables
		radius2 = rad2;
	}
	
	public int getRadius(){
		return radius2;
	}
	
	//Additional method to return the name of the shape
	public String getNamemethod(){
		return "Oval";
	}
}
