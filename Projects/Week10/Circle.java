
public class Circle {
	
	private double radius;
	
	public Circle(double aRadius) {
		radius = aRadius;
	}
	
	public void setRadius(double aRadius) {
		radius = aRadius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double calculateArea() {
		return java.lang.Math.PI * radius * radius;
	}
	
	public double calculateCircumference() {
		return java.lang.Math.PI * 2 * radius;
	}
	
	public double calculateDiameter() {
		return radius * 2;
	}
}
