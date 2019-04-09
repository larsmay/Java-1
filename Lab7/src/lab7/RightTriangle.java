package lab7;


public class RightTriangle {
	private int id, xLoc, yLoc;
	private double base, height, hypotenuse;
	private static double scaleFactor;
	
	public RightTriangle() {
		setBase(0);
		setHeight(0);
		setHypotenuse(0);
		}
	public RightTriangle(int i, double b, double h, int x, int y) {
		double hyp = Math.sqrt(Math.pow(b, 2)+Math.pow(h,2));
		setBase(b);
		setHeight(h);
		setHypotenuse(hyp);
		setID(i);
		setXLoc(x);
		setYLoc(y);
	}
	public static void setScale(double s) {
		scaleFactor = s;
	}
	
	public void setID(int i) {
		id = i;
	}
	
	public void setXLoc(int x) {
		xLoc = x;
	}
	
	public void setYLoc(int y) {
		yLoc = y;
	}
	public void scaleShape() {
		double b = base * scaleFactor;
		double h = height * scaleFactor;
		setBase(b);
		setHeight(h);
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
	public int getID() {
		return id;
	}
	public int getXLoc() {
		return xLoc;
	}
	public int getYLoc() {
		return yLoc;
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
