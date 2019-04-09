package circle;

public class Circle {
	private double radius;
	public Circle() {
		setRadius(0);
	}
	public Circle (double r) {
		setRadius(r);
	}
	public void setRadius(double r) {
		if (r > 0)
			radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea(){
		double area = Math.PI * (radius * radius);
		return area;
	}
	public double getPerimeter() {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
}
