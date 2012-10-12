import java.util.Scanner;

public class MathsApp
{
	
	public static void main(String[] args)
	{
		//variable declaration
		int num1, num2, sum;
		
		//Scanner creation
		Scanner kbd = new Scanner(System.in);
		
		//user prompt and input
		System.out.print("Please enter the first number: ");
		num1 = kbd.nextInt();
		
		System.out.print("Please enter the second number: ");
		num2 = kbd.nextInt();
		
		System.out.print("Please enter your guess for the sum of the numbers: ");
		sum = kbd.nextInt();
		
		//programme logic
		if(sum == num1 + num2)
			System.out.println("Congratulations, this is correct!");
		else
			System.out.println("Sorry, the correct result is: " + (num1 + num2));
	
	}	
}
