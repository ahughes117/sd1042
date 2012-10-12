import java.util.Scanner;
import java.text.DecimalFormat;

public class Geometry {
	
	public static void main (String[] args) {
		//length and height is meters
		double length, height, area, perimeter;
		Scanner kbd = new Scanner(System.in);
		
		//needed to add this to print nicely the result
		DecimalFormat decimal = new DecimalFormat("#.###");
		
		//input
		System.out.print("Please enter the length in meters: ");
		length = kbd.nextDouble();
		
		System.out.print("Please enter the height in meters: ");
		height = kbd.nextDouble();
		
		//calculation
		area = length * height;
		perimeter = 2 * (length + height);
		
		//printing
		System.out.println("Area of the triangle is: " 
			+ Double.valueOf(decimal.format(area)) + "m");
		System.out.println("Perimeter of the triangle is: "
			+ Double.valueOf(decimal.format(perimeter)) + "m");
		
	}
	
}
