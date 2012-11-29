import java.util.Scanner;

public class CircleTester {
	
	public static void main(String [] args) {
		Scanner kbd = new Scanner(System.in);
		Circle c1 = new Circle(10);
		
		System.out.println("This circle's area is: " 
		+ c1.calculateArea());
		
		System.out.println("This circle's circumference is: " 
		+ c1.calculateCircumference());
		
		System.out.println("This circle's diameter is: " 
		+ c1.calculateDiameter());
		
		System.out.print("Enter the radius for the new circle: ");
		c1.setRadius(kbd.nextDouble());
		
		System.out.println("This circle's area is: " 
		+ c1.calculateArea());
		
		System.out.println("This circle's circumference is: " 
		+ c1.calculateCircumference());
		
		System.out.println("This circle's diameter is: " 
		+ c1.calculateDiameter());
	}
}
