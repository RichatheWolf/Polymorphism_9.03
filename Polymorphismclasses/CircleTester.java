import java.util.ArrayList;


public class CircleTester {
	public static void showCenter(Circle2 shape) {
		System.out.println("For this " + shape.getNamemethod() + " the center is at " + shape.getCenter() + ".");
	}
	
	public static void main(String []args) {
		Circle2 Circle = new Circle2 (2, 4, 6);
		Cylinder2 Cylinder = new Cylinder2 (10, 15, 3, 4);
		Oval2 Oval = new Oval2 (25, 10, 4, 7);
		OvalCylinder2 OvalCylinder = new OvalCylinder2 (40, 10, 3, 7, 10);
		
		ArrayList <Circle2> shapes = new ArrayList<Circle2>();
		
		shapes.add(Circle);
		shapes.add(Cylinder);
		shapes.add(Oval);
		shapes.add(OvalCylinder);
		
		for(Circle2 shape : shapes) {
			showCenter(shape);
		}
	}
}