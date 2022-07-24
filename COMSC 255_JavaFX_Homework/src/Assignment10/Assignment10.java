//Nathan Jaggers
//1547609

package Assignment10;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene; 
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

//imports

public class Assignment10 extends Application {
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
	  circle1.centerXProperty().bind(pane.widthProperty().divide(2));
	  circle1.centerYProperty().bind(pane.heightProperty().divide(2));
	  circle1.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
	  circle1.setFill(Color.color(Math.random(),Math.random(),Math.random()));
	  
	//coordinates for second circle
	  x = r + (Math.random()*(pane.getWidth()-2*r)) ;
	  y = r + (Math.random()*(pane.getHeight()-2*r)) ;
	  
	//construct second circle
	  Circle circle2 = new Circle(x,y,r) ;
	  circle2.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
	  circle2.setFill(Color.color(Math.random(),Math.random(),Math.random()));
	
	//create line to connect circles
	  Line line = new Line(circle1.getCenterX(), circle1.getCenterY(),
			  			   circle2.getCenterX(), circle2.getCenterY()) ;
	  line.startXProperty().bind(circle1.centerXProperty());
	  line.startYProperty().bind(circle1.centerYProperty());
	  line.endXProperty().bind(circle2.centerXProperty());
	  line.endYProperty().bind(circle2.centerYProperty());
	
	//create text showing distance
	  distance = Math.sqrt(
				  	 Math.pow(circle2.getCenterX()-circle1.getCenterX(), 2) 
				  	 + 
				  	 Math.pow(circle2.getCenterY()-circle1.getCenterY(), 2)
			  	 );
	  Text text = new Text(((circle2.getCenterX()+circle1.getCenterX())/ 2),
			  		       ((circle2.getCenterY()+circle1.getCenterY())/ 2), 
			  		         String.format("Distance is %.2f",distance) ) ;
	  text.xProperty().bind((line.startXProperty().add(line.endXProperty()).divide(2)));
	  text.yProperty().bind((line.startYProperty().add(line.endYProperty()).divide(2)));
	  
	//add circles, line and text to pane
	  pane.getChildren().addAll(circle1,circle2,line,text);
	  
	//place scene on stage
	  stage.setTitle("Assignment 10");
	  stage.setScene(scene);
	  stage.show();
  }
  public static void main(String[] args) {
	  Application.launch(args);
  }
  

}
