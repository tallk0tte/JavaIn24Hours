package hour12;

import java.awt.Point;

public class PointTester {

	public static void main(String[] args) {
		Point object1 = new Point(11,22);
		Point3D object2 = new Point3D(7, 6, 64);

		System.out.println("The 2D point is located at (" + object1.x + ", " + object1.y + ")");
		System.out.println("\tIt's being moved to (4,13)");
		object1.move(4, 13);
		
		System.out.println("The 2D point is now at(" + object1.x + ", " + object1.y + ")");
		System.out.println();
		
		System.out.println("It's being moved -10 units on both the x and y axes");
		object1.translate(-10, -10);
		System.out.println("The 2D point is now at(" + object1.x + ", " + object1.y + ")\n");
		System.out.println();
		
		
		
		
	}//end main
}//end class
