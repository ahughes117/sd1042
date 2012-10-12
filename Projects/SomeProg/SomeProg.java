import java.util.*;

public class SomeProg
{
	
	public static void main(String[] args)
	{
		Scanner kbd = new Scanner(System.in);
		final int YEAR = 2012;
		int age, bornIn;
		
		System.out.println("How old are you this year? (" + 2012 + ")");
		age = kbd.nextInt();
		bornIn = YEAR - age;
		
		System.out.println("I think you were born in: " + bornIn);
	}	
}
