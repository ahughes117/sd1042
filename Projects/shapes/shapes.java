import java.util.Scanner;
public class shapes
{
	public static void main (String[] args) {
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
				case 1: shape1();
						break;
						
				case 2: shape2();
						break;
						
				case 3: shape3();
						break;
						
				case 4: shape4();
						break;
						
				case 5: shape5();
						break;
						
				default: System.out.println("No Such Version. Try again (1-5)");
			}
			System.out.println("Choose the version you want to run");
			System.out.println("(To exit, type 117 on version)");
		} while (version != 117);
		
		System.out.println("Bye!");
	}
	
	/*
	 *Drawing a 5x5 box. Easy.
	 */
	public static void shape1(){
		System.out.println("Box");
		
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++)
				System.out.print("*");
			System.out.println();
		}
			
	}
	
	/**
	 *Drawing the book example
	 */
	public static void shape2(){
		
	}
	
	public static void shape3(){
		System.out.println("Not Implemented");
	}
	
	public static void shape4(){
		System.out.println("Not Implemented");
	}
	
	public static void shape5(){
		System.out.println("Not Implemented");
	}
	
	
}
