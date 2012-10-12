import java.util.Scanner;
public class Main
{
	
	public static void main(String[] args)
	{
		Restaurant r = new Restaurant();
		Order o = new Order(r);
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Welcome to our restaurant. This is the menu: ");
		while(true){
			int plate =0;
			r.showMenu();
			
			System.out.println("Type the number of the plate."
			+"To complete your order hit 117");
			plate = kbd.nextInt();
			
			if(plate == 117)
				break;
				
			o.addPlate(plate);
		}
		
		System.out.println("ACE! To show your order hit o, "
		+"to see the bill hit b, to exit hit x");
		
		while(true){
			char input = kbd.next().charAt(0);
			if(input == 'o'){
				o.showOrder();
			} else if (input == 'b'){
				o.makeBill();
			} else if (input == 'x'){
				System.exit(0);
			} else {
				System.out.println("Not a valid option");
			}
			
		}
		
	}
}
