import java.util.Scanner;

public class SecretsApp
{
	
	public static void main(String[] args)
	{
		//level constants declaration
		final int LEVEL1 = 1;
		final int LEVEL2 = 2;
		final int LEVEL3 = 3;
		
		//user level variable declaration and initialization
		int userLevel = -1;
		
		//Scanner object creation
		Scanner kbd = new Scanner(System.in);
		
		//user prompt and input
		System.out.print("Please enter your personal level of clearance: ");
		userLevel = kbd.nextInt();
		
		//programme logic here
		switch(userLevel){
		
		case 1: System.out.println("The security guard is a robot.");
				break;
		case 2: System.out.println("There is a secret room in the basement.");
				break;
		case 3: System.out.println("The PM is an alien");
				break;
		default:  System.out.println("NO SUCH LEVEL");
		}
		
		System.out.println("END OF PROGRAMME");
	
	}	
}
