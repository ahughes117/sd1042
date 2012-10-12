import java.util.*;

public class Restaurant
{
	protected ArrayList<Food> plates;
	
	public Restaurant(){
		plates = new ArrayList<Food>();
		
		//adding starters
		plates.add(new Food(1, "Carrot Soup", 3.99, "starters"));
		plates.add(new Food(2, "Prawn Salad", 4.29, "starters"));
		plates.add(new Food(3, "Garlic Bread", 2.99, "starters"));	
		
		//adding mains
		plates.add(new Food(4, "Pork Steak", 6.99, "main"));
		plates.add(new Food(5, "Chicken Fillet", 7.5, "main"));
		plates.add(new Food(6, "Fish & Chips", 7.99, "main"));
		
		//adding desserts
		plates.add(new Food(7, "Chocolate Cake", 4.15, "desserts"));
		plates.add(new Food(8, "Caramel Cream", 4.15, "desserts"));
		plates.add(new Food(9, "Ice Cream", 4.15, "desserts"));
		plates.add(new Food(10, "Panacotta", 4.15, "desserts"));
		
		//adding drinks
		plates.add(new Food(11, "Pint of Guinness", 3, "drinks"));
		plates.add(new Food(12, "Glass of Wine", 5, "drinks"));
		plates.add(new Food(13, "Soft Drink", 2, "drinks"));
	}
	
	public void showMenu(){
		for(int i=0; i<plates.size(); i++)
			System.out.println(plates.get(i).id + ", "
			+ plates.get(i).name + ", " + plates.get(i).price
			+ ", " + plates.get(i).type);
	}
}
