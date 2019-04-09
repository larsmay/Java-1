package lab8;

abstract class Shape
{
	// declare static variable
	protected static double scaleFactor = 1;

	// declare instance variables
	private int xLoc, yLoc, id;
	private String type;
	// one constructor
	public Shape(int x,int y, int numid, String t) {
		setXLoc(x);
		setYLoc(y);
		setID(numid);
		setType(t);
	}
	private void setType(String t) {
		type = t;
	}
	// get/set methods
	public void setXLoc(int x) {
		xLoc = x;
	}
	
	public void setYLoc(int y) {
		yLoc = y;
	}
	
	public void setID(int numid) {
		id = numid;
	}
	public static void setScale(double s) {
		scaleFactor = s;
	}
	public int getXLoc() {
		return xLoc;
	}
	
	public int getYLoc() {
		return yLoc;
	}
	public int getID() {
		return id;
	}
	public String getType() {
		return type;
	}
	public double getScale() {
		return scaleFactor;
	}
	// abstract methods
	public abstract void calculateArea();
	public abstract void calculatePerimeter();
	public abstract void scaleShape();
	public abstract double GetPerimeter();
	public abstract double GetArea();
}

class Circle extends Shape
{
	// declare instance variable
	private double radius, area, perimeter;
	private static String t="Circle";
	// one constructor
	public Circle(int x, int y, int id, double r) {
		super(x,y,id,t);
		SetRadius(r);
	}
	// get/set methods
	public double GetRadius()
	{
		return radius;
	}
	public void SetRadius(double r)
	{
		if (r > 0.0)
		{
			radius = r;
		}
	}

	// override abstract methods
	public void scaleShape() {
		double r = radius * scaleFactor;
		SetRadius(r);
	}
	
	public void calculateArea() {
		area = Math.PI * (radius*radius);
	}
	
	public void calculatePerimeter() {
		perimeter = 2 * Math.PI * radius;
	}
	// GetPerimeter method
	public double GetPerimeter()
	{
		calculatePerimeter();
		return perimeter;
	}

	// GetArea method
	public double GetArea()
	{
		calculateArea();
		return area;
	}
}

class Rectangle extends Shape
{
	// declare instance variables
	private double base;
	private double height, area, perimeter;
	private static String t="Rectangle";
	// one constructor
	public Rectangle(int x, int y,int id,double b, double h) {
		super(x,y,id, t);
		SetBase(b);
		SetHeight(h);
	}
	// get/set methods
	public double GetBase()
	{
		return base;
	}
	public void SetBase(double b)
	{
		if (b > 0.0)
		{
			base = b;
		}
	}
	public double GetHeight()
	{
		return height;
	}
	public void SetHeight(double h)
	{
		if (h > 0.0)
		{
			height = h;
		}
	}

	// override abstract methods
	public void scaleShape() {
		double b = base * scaleFactor;
		double h = height * scaleFactor;
		SetBase(b);
		SetHeight(h);
	}
	
	public void calculateArea() {
		area = base * height;
	}
	
	public void calculatePerimeter() {
		perimeter = base*2 + height*2;
	}
	// GetPerimeter method
	public double GetPerimeter()
	{
		calculatePerimeter();
		return perimeter;
	}

	// GetArea method
	public double GetArea()
	{
		calculateArea();
		return area;
	}

}

class RightTriangle extends Shape
{
	// declare instance variables
	private double base;
	private double height;
	private double hypotenuse, area, perimeter;
	private static String t="Right Triangle";

	// one constructor
	public RightTriangle(int x, int y, int id, double b, double h) {
		super(x,y,id,t);
		setBase(b);
		setHeight(h);
	}
	// get/set methods
	public void setBase(double b)
	{
		if (b > 0.0)
		{
			base = b;
			double hyp = Math.sqrt(base*base + height*height);
			setHyp(hyp);
		}
	}
	
	public void setHeight(double h) {
		if (h > 0.0)
		{
			height = h;
			double hyp = Math.sqrt(base*base + height*height);
			setHyp(hyp);
		}
	}

	private void setHyp(double h) {
		hypotenuse = h;
	}
	
	public double GetBase()
	{
		return base;
	}
	
	public double GetHeight()
	{
		return height;
	}

	public double GetHypotenuse()
	{
		return hypotenuse;
	}

	// override abstract methods
	public void scaleShape() {
		double b = base * scaleFactor;
		double h = height * scaleFactor;
		setBase(b);
		setHeight(h);
	}
	
	public void calculateArea() {
		area = .5 * base * height;
	}
	
	public void calculatePerimeter() {
		perimeter = base + height + hypotenuse;
	}
	
	// GetPerimeter method
	public double GetPerimeter()
	{
		calculatePerimeter();
		return perimeter;
	}

	// GetArea method
	public double GetArea()
	{
		calculateArea();
		return area;
	}


}