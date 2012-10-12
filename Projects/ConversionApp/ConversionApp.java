import java.util.Scanner;
import java.text.DecimalFormat;

public class ConversionApp {

	private static final double KTP = 2.2;
	
	public static void main(String[] args) {
		double pounds, kilos;
		Scanner kbd = new Scanner(System.in);
		
		//needed to add this to print nicely the result
		DecimalFormat decimal = new DecimalFormat("#.###");
		
		System.out.print("Please enter the value in pounds: ");
		pounds = kbd.nextDouble();
		
		//1k = 2.2 * pounds
		kilos = pounds / KTP;
		System.out.println("The value in kilos is: " 
			+ Double.valueOf(decimal.format(kilos)) + "kg");
	}
}

