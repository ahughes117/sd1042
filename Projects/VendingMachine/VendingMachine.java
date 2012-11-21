import java.util.Scanner;

public class VendingMachine {
	
	public static void main(String[] args) {
		showMenu();
		
	}
	
	public void showMenu() {
		//variable declaration 
		int choice;
		int gum, chocolate, popcorn, juice;
		
		//variable initialization
		gum =0;
		chocolate =0;
		popcorn=0;
		juice=0;
		
		//creation of scanner object
		Scanner kbd = new Scanner(System.in);
		
		//printing menu
		System.out.println("You have the following choices:");
		System.out.println("[1] Get gum");
		System.out.println("[2] Get chocolate");
		System.out.println("[3] Get popcorn");
		System.out.println("[4] Get juice");
		System.out.println("[5] Display total sold so far");
		System.out.println("[6] Quit");
			
		
		//iterating till user enters proper input
		do {
			//getting next user integer, validating for other random things
			try {
				System.out.print("Enter your choice: ");
				choice = kbd.nextInt();
			} catch (Exception e) {
				System.out.println("Please enter some proper input!");
				choice = 0;
			}
			
			//exiting 
			if(choice == 6) {
				System.out.println("Bye!");
				break;
			}
			
			switch (choice) {
				case 1: System.out.println("Here's your gum!");
						gum++;
						break;
				case 2: System.out.println("Here's your chocolate!");
						chocolate++;
						break;
				case 3: System.out.println("Here's your popcorn!");
						popcorn++;
						break;
				case 4: System.out.println("Here's your juice!");
						juice++;
						break;
			}
			
		} while(choice < 1 || choice > 6);
	}
}