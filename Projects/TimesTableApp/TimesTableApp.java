import java.util.Scanner;

public class TimesTableApp
{
	//the main function
	public static void main(String[] args) {
		int version = 0;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Choose the version you want to run");
		System.out.println("(To exit, type 117 on version)");
		do {
			//getting version from user input
			//in order to avoid the exception if someone inputs a string
			//I just catch it and convert it to a zero integer;
			try {
				version = kb.nextInt();
			} catch (Exception x) {
				version = 0;
			}
			
			//selecting the appropriate version
			switch(version){
				case 1: version1();
						break;
						
				case 2: version2();
						break;
						
				case 3: version3();
						break;
						
				case 4: version4();
						break;
						
				case 5: version5();
						break;
						
				default: System.out.println("No Such Version. Try again (1-5)");
			}
			System.out.println("Choose the version you want to run");
			System.out.println("(To exit, type 117 on version)");
		} while (version != 117);
		
		System.out.println("Bye!");
	}
	
	/*use a for loop to display the 6 times table till 72*/
	public static void version1() {
		for(int i=6; i<=72; i+=6)
			System.out.println(i);
	}
	
	/*Modify the first function so that more meaningful output is displayed
	 * 1 x 6 = 6 etc
	 */
	public static void version2() {
		int times=0;
		
		for(int i=1; i<=12; i++) 
			System.out.println(i + " x 6 = " + (i*6));
		
	}
	
	/*
	 *Modify the function in order to enable the user choose what number does he like
	 */
	public static void version3() {
		int timesN;
		Scanner kb = new Scanner(System.in);
		
		//catching the exception if the user enters some string and
		//converting the input to an invalid integer
		System.out.println("Enter the integer you want to calculate its times table");
		try {
			timesN = kb.nextInt();
		} catch (Exception x){
			timesN = 0;
		}
		
		//Checking user's input. He won't have a second choice on this version.
		if(timesN >= 2 && timesN <= 100){
			for(int i=1; i<=12; i++){
				System.out.println(i + " x " + timesN + " = " + (i*timesN));
			}
		} else {
			System.out.println("The number you have entered is not valid.");
		}
	}
	
	/*
	 *Using a loop to validate user's input and give him another chance to correct it
	 */
	public static void version4() {
		int timesN;
		Scanner kb = new Scanner(System.in);
		
		
		do {
			//catching the exception if the user enters some string and
			//converting the input to an invalid integer
			System.out.println("Enter the integer you want to calculate its times table");
			try {
				timesN = kb.nextInt();
			} catch (Exception x){
				timesN = 0;
			}
			if(timesN >= 2 && timesN <= 100){
				for(int i=1; i<=12; i++){
					System.out.println(i + " x " + timesN + " = " + (i*timesN));
				}
		} else {
			System.out.println("The number you have entered is not valid.");
		}
			
		} while (timesN < 2 || timesN > 100);
		
	}
	
	/*
	 *Using a loop to repeat the programme if a user responds positively
	 */
	public static void version5() {
		char answer;
		Scanner kb = new Scanner(System.in);
		
		do {
			version4();
			System.out.println("Repeat? (Y/y, N)");
			answer = kb.next().charAt(0);
		} while (answer == 'Y' || answer == 'y');
	}
}
