package DemosM6; //COMSC-255 Module 6

public class TestCircleRectangle {
  public static void main(String[] args) {
	// TODO Auto-generated method stub
    Circle circle = new Circle(10);
    System.out.println("A circle " + circle.toString());
    System.out.println("The color is " + circle.getColor());
    System.out.println("The radius is " + circle.getRadius());
    System.out.println("The area is " + circle.getArea());
    System.out.println("The perimeter is " + circle.getPerimeter());
    
    Rectangle rectangle = new Rectangle(6, 10);
    System.out.println("\nA rectangle " + rectangle.toString());
    System.out.println("The area is " + rectangle.getArea());
    System.out.println("The perimeter is " + rectangle.getPerimeter());
  }
}
