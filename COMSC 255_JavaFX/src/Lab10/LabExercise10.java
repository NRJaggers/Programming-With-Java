//Nathan Jaggers
//1547609

package Lab10;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene; 
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

//imports

public class LabExercise10 extends Application {
  //Override start method
  @Override
  public void start(Stage stage) {
	//create new pane to place circles on
	  Pane pane = new Pane();
	  
	//create scene //place scene on stage
	  Scene scene = new Scene(pane, 400 ,300);
	  
	//declarations for circles
	  double x, y, r = 15, distance ;
	  
	//coordinates for first circle
	  x = r + Math.random()*(pane.getWidth()-2*r) ;
	  y = r + Math.random()*(pane.getHeight()-2*r) ;
	  
	//construct first circle
	  Circle circle1 = new Circle(x,y,r) ;
	  circle1.setStroke(Color.BLACK);
	  circle1.setFill(Color.GREY);
	  
	//coordinates for second circle
	  x = r + (Math.random()*(pane.getWidth()-2*r)) ;
	  y = r + (Math.random()*(pane.getHeight()-2*r)) ;
	  
	//construct first circle
	  Circle circle2 = new Circle(x,y,r) ;
	  circle2.setStroke(Color.BLACK);
	  circle2.setFill(Color.GRAY);
	
	//create line to connect circles
	  Line line = new Line(circle1.getCenterX(), circle1.getCenterY(),
			  			   circle2.getCenterX(), circle2.getCenterY()) ;
	
	//create text showing distance
	  distance = Math.sqrt(
				  	 Math.pow(circle2.getCenterX()-circle1.getCenterX(), 2) 
				  	 + 
				  	 Math.pow(circle2.getCenterY()-circle1.getCenterY(), 2)
			  	 );
	  Text text = new Text(((circle2.getCenterX()+circle1.getCenterX())/ 2),
			  		       ((circle2.getCenterY()+circle1.getCenterY())/ 2), 
			  		         String.format("Distance is %.2f",distance) ) ;
	 
	//color randomizer
	  if ((circle1.getCenterX()+circle2.getCenterY())>= 650)
	  {
		  circle1.setFill(Color.FORESTGREEN);
		  circle2.setFill(Color.SADDLEBROWN);
		  line.setStroke(Color.GREEN);
	  }
	  else if ((circle1.getCenterX()+circle2.getCenterY())>= 600)
	  {
		  circle1.setFill(Color.LIGHTSEAGREEN);
		  circle2.setFill(Color.AQUAMARINE);
		  line.setStroke(Color.DARKBLUE);
	  }
	  else if ((circle1.getCenterX()+circle2.getCenterY())>= 550)
	  {
		  circle1.setFill(Color.YELLOW);
		  circle2.setFill(Color.YELLOW);
		  line.setStroke(Color.BLACK);
	  }
	  else if ((circle1.getCenterX()+circle2.getCenterY())>= 500)
	  {
		  circle1.setFill(Color.LAVENDERBLUSH);
		  circle2.setFill(Color.CORNSILK);
		  line.setStroke(Color.SPRINGGREEN);
	  }
	  else if ((circle1.getCenterX()+circle2.getCenterY())>= 400)
	  {
		  circle1.setFill(Color.MAROON);
		  circle2.setFill(Color.BLACK);
		  line.setStroke(Color.LIGHTGRAY);
	  }
	  else if ((circle1.getCenterX()+circle2.getCenterY())>= 300)
	  {
		  circle1.setFill(Color.GOLD);
		  circle2.setFill(Color.DODGERBLUE);
		  line.setStroke(Color.DODGERBLUE);
	  }
	  else if ((circle1.getCenterX()+circle2.getCenterY())>= 250)
	  {
		  circle1.setFill(Color.PALEGREEN);
		  circle2.setFill(Color.LIGHTSKYBLUE);
		  line.setStroke(Color.SANDYBROWN);
	  }
	  else if ((circle1.getCenterX()+circle2.getCenterY())>= 100)
	  {
		  circle1.setFill(Color.RED);
		  circle2.setFill(Color.BLUE);
		  line.setStroke(Color.DARKGREY);
	  }
	  
	//add circles, line and text to pane
	  pane.getChildren().addAll(circle1,circle2,line,text);
	  
	//place scene on stage
	  stage.setTitle("Lab Exercise 10");
	  stage.setScene(scene);
	  stage.show();
  }
  public static void main(String[] args) {
	  Application.launch(args);
  }
  

}
