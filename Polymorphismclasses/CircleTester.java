import java.util.ArrayList;


public class CircleTester{
	public static void showCenter(Circle shape) {
		System.out.println("For this " + shape.getNamemethod() + " the center is at " + shape.getCenter() + ".");
	}
	
	public static void main(String []args) {
		Circle Circle = new Circle(2, 4, 6);
		Cylinder Cylinder = new Cylinder(10, 15, 3, 4);
		Oval Oval = new Oval(25, 10, 4, 7);
		OvalCylinder OvalCylinder = new OvalCylinder(40, 10, 3, 7, 10);
		
		ArrayList <Circle2> shapes = new ArrayList<Circle2>();
		
		shapes.add(Circle);
		shapes.add(Cylinder);
		shapes.add(Oval);
		shapes.add(OvalCylinder);
		
		for(Circle shape : shapes) {
			showCenter(shape);
		}
	}
}
