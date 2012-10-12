import java.util.Scanner;

public class CompareApp
{
	
	public static void main(String[] args)
	{
		//Variable declaration and scanner creation
		int num1, num2;
		Scanner kbd = new Scanner(System.in);
		
		//user input
		System.out.print("Please enter the first number: ");
		num1 = kbd.nextInt();
		
		System.out.print("Please enter the second number: ");
		num2 = kbd.nextInt();
		
		//making the comparison and printing the results
		if(num1 == num2)
			System.out.println("Numbers are equal!");
		else {
			System.out.println("Numbers are NOT equal!");
			
			//printing additional info for the numbers
			if(num1 > num2)
				System.out.println("FIRST Number is BIGGER");
			else
				System.out.println("SECOND Number is BIGGER");
		}
		
		System.out.println("END OF PROGRAMME");
	
	}	
}
