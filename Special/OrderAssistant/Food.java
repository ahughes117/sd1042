/**
 * The Food object, has an id for recognizing the plate, 
 * a name, a price and a type (starter, main, dessert etc)
 **/
public class Food
{
	protected int id;
	protected String name;
	protected double price;
	protected String type;
	
	public Food(int anId, String aName, double aPrice, String aType){
		id = anId;
		name = aName;
		price = aPrice;
		type = aType;
	}
	
	public Food(){
	}
	
	public int getId(){
		return id;
	}
}
