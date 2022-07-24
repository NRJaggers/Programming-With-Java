package DemosM6;//COMSC-255 Module 6
import java.util.Date;

public class GeometryObject {
  private String color = "white";
  private boolean filled;
  private Date dateCreated;
  
  /**Default constructor*/
  public GeometryObject() {
	dateCreated = new Date();
  }

  /**Construct with passed parameters, color and filled*/
  public GeometryObject(String color, boolean filled) {
	this.color = color;
	this.filled = filled;
  }
  
  /**Return a color*/
  public String getColor() {
    return color;
  }

  /**Set a new color*/
  public void setColor(String color) {
	this.color = color;
  }
  
  /**Return filled*/
  public boolean getFilled() {
	return filled;
  }  
	  
  /**Set a filled*/
  public void setFilled(boolean filled) {
	this.filled = filled;
  }
  
  /**Return dateCreated*/
  public String getDateCreated() {
	return dateCreated.toString();
  }  
  
  /**Return a String representation of the object*/
  public String toString() {
	return "created on " + getDateCreated() + "\ncolor: " + color
	  + " and filled: " + filled;
  }  
}
