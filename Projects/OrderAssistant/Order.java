import java.util.ArrayList;

public class Order
{
	protected ArrayList<Food> orderPlates;
	protected Restaurant rest;
	
	public Order(Restaurant aRestaurant){
		rest = aRestaurant;
		orderPlates = new ArrayList<Food>();
	}
	
	public void addPlate(int anId){		
		for(int i=0; i<rest.plates.size(); i++){
			if(rest.plates.get(i).getId() == anId){
				orderPlates.add(rest.plates.get(i));
				break;
			}
		}
	}
	
	public void showOrder(){
		System.out.println("Your order is: ");
		for(int i=0; i<orderPlates.size(); i++)
			System.out.println(orderPlates.get(i).id + ", "
			+ orderPlates.get(i).name + ", " + orderPlates.get(i).price
			+ ", " + orderPlates.get(i).type);
	}
	
	public void makeBill(){
		showOrder();
		double sum = 0;
		
		for(int i=0; i<orderPlates.size(); i++)
			sum += orderPlates.get(i).price;
		
		System.out.println("The sum of your bill is: " + sum);
	}
}
