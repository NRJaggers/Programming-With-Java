package DemosM6;

public class Rectangle extends GeometryObject {
  private double length;
  private double width;

  /**Default constructor*/
  public Rectangle() {
  }

  /**Construct rectangle with specified length and width*/
  public Rectangle(double length, double width) {
	this.length = length;
	this.width = width;
  }
		  
  /**Construct with length, width, color and filled*/
  public Rectangle(double length, double width, 
		 String color, boolean filled) {
	length = this.length;
	width = this.width;
	setColor(color);
	setFilled(filled);
  }
	  
  /**Return a length*/
  public double getLength() {
	return length;
  }
	  
  /**Set a new length*/
  public void setLength(double length) {
	length = this.length;
  }
		  
  /**Return a width*/
  public double getWidth() {
	return width;
  }
	  
  /**Set a new width*/
  public void setWidth(double width) {
	width = this.width;
  }
  
  /**Return the area of this rectangle*/
  public double getArea() {
	return length * width;
  }

  /**Return the perimeter of this rectangle*/
  public double getPerimeter() {
	return 2 * (length + width);
  }  
}
