package rightTriangle;

public class RightTriangle {
	private double base, height, hypotenuse;
	public RightTriangle() {
		setBase(0);
		setHeight(0);
		setHypotenuse(0);
		}
	public RightTriangle(double b, double h) {
		double hyp = Math.sqrt(Math.pow(b, 2)+Math.pow(h,2));
		setBase(b);
		setHeight(h);
		setHypotenuse(hyp);
	}
	public void setBase(double b) {
		if (b > 0)
			base = b;
		double hyp = Math.sqrt(Math.pow(b, 2)+Math.pow(height,2));
		setHypotenuse(hyp);
	}
	public void setHeight(double h) {
		if (h > 0)
			height = h;
		double hyp = Math.sqrt(Math.pow(base, 2)+Math.pow(h,2));
		setHypotenuse(hyp);
	}
	private void setHypotenuse(double h) {
		hypotenuse = h;
	}
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
	public double getHypotenuse() {
		return hypotenuse;
	}
	public double getArea() {
		double area = .5*(base * height);
		return area;
	}
	public double getPerimeter() {
		double perimeter = base + height + hypotenuse;
		return perimeter;
	}

}
