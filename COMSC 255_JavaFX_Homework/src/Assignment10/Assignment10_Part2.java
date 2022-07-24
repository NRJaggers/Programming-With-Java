//Nathan Jaggers
//1547609

package Assignment10;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

//imports

public class Assignment10_Part2 extends Application {
  
	//Override start method
  @Override
  public void start(Stage stage) {
	
	//create FanPanes
	  FanPane fan1 = new FanPane();
	  FanPane fan2 = new FanPane();
	  FanPane fan3 = new FanPane();
	  FanPane fan4 = new FanPane();
	
	//set colors  
	  fan1.setRandomColors();
	  fan2.setRandomColors();
	  fan3.setRandomColors();
	  fan4.setRandomColors();
	  
	//add fans to panes.
	  fan1.addFan();
	  fan2.addFan();
	  fan3.addFan();
	  fan4.addFan();
	  
	//create gridPane
	  GridPane gridPane = new GridPane();
	
	//set alignment and add elements
	  gridPane.setAlignment(Pos.CENTER);
	  gridPane.add(fan1, 0, 0);
	  gridPane.add(fan2, 1, 0);
	  gridPane.add(fan3, 0, 1);
	  gridPane.add(fan4, 1, 1);
	  
	//create scene
	  Scene scene = new Scene(gridPane);
	  
	//place scene on stage
	  stage.setTitle("Assignment 10: Part 2");
	  stage.setScene(scene);
	  stage.show();
  }
  
  public static void main(String[] args) {
	  Application.launch(args);
  }
  
  public class FanPane extends Pane {
	  
	  //member variables
	  	private double xCord ;
	  	private double yCord ;
	  	private double xRad ;
	  	private double yRad ;
	  	private double angle ;
	  	private double length ;
	  //create circle / ellipse
	    public Ellipse ellipse ;
	  //create arcs
	    public Arc arc1 ;
	    public Arc arc2 ;
	    public Arc arc3 ;
	    public Arc arc4 ;
	  	
	 //member functions
	  	public void setRandomColors() {

		  	ellipse.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
			ellipse.setFill(Color.color(Math.random(),Math.random(),Math.random(),0.15));
			
			arc1.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
			arc1.setFill(Color.color(Math.random(),Math.random(),Math.random()));
			
			arc2.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
			arc2.setFill(Color.color(Math.random(),Math.random(),Math.random()));
			
			arc3.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
			arc3.setFill(Color.color(Math.random(),Math.random(),Math.random()));
			
			arc4.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
			arc4.setFill(Color.color(Math.random(),Math.random(),Math.random()));
	  	}
	  	
	  	public void setDefaultColors() {
	  		ellipse.setStroke(Color.BLACK);
			ellipse.setFill(Color.WHITESMOKE);
			
			arc1.setStroke(Color.BLACK);
			arc1.setFill(Color.GRAY);
			arc1.setType(ArcType.ROUND);
			
			arc2.setStroke(Color.BLACK);
			arc2.setFill(Color.GRAY);
			arc2.setType(ArcType.ROUND);
			
			arc3.setStroke(Color.BLACK);
			arc3.setFill(Color.GRAY);
			arc3.setType(ArcType.ROUND);
			
			arc4.setStroke(Color.BLACK);
			arc4.setFill(Color.GRAY);
			arc4.setType(ArcType.ROUND);
	  	}
	  	
	  	public void addFan() {
	  		getChildren().addAll(ellipse, arc1, arc2, arc3, arc4);
	  	}
	  	
	  //constructors
	  	FanPane(){
	  		
	  		if((getWidth() == 0)||(getHeight() == 0))
	  		{
	  			setWidth(300);
		  		setHeight(300);
	  		}
	  		
	  		//set values
	  		xCord = getWidth()/2;
		  	yCord = getHeight()/2 ;
		  	xRad  = xCord/2;
		  	yRad  = yCord/2;
		  	angle = Math.random()*90;
		  	length = 30;
		  	
		  	//set shapes
		  	ellipse = new Ellipse (xCord, yCord, xRad+10, yRad+10);
		  	arc1 = new Arc(xCord, yCord, xRad, yRad, angle, length);
			arc2 = new Arc(xCord, yCord, xRad, yRad, angle + 90, length);
			arc3 = new Arc(xCord, yCord, xRad, yRad, angle + 180, length);
			arc4 = new Arc(xCord, yCord, xRad, yRad, angle + 270, length);
			
			//set default colors
			setDefaultColors();

	  	}
	  	
	  	FanPane(double xC, double yC, double xR, double yR, double ang, double len){
	  		xCord = xC ;
		  	yCord = yC ;
		  	xRad  = xR ;
		  	yRad  = yR ;
		  	angle = ang ;
		  	length = len ;
		  	
		  	ellipse = new Ellipse (xCord, yCord, xRad, yRad);
		  	arc1 = new Arc(xCord, yCord, xRad, yRad, angle, length);
			arc2 = new Arc(xCord, yCord, xRad, yRad, angle + 90, length);
			arc3 = new Arc(xCord, yCord, xRad, yRad, angle + 180, length);
			arc4 = new Arc(xCord, yCord, xRad, yRad, angle + 270, length);
			
			//set default colors
			setDefaultColors();
		  	
	  	}
	  	
  }
}
