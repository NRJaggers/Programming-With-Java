//Nathan Jaggers
//1547609

package Assignment12;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Assignment12 extends Application {
		//increment and speed declarations
		double increment = 1 ;
		Duration speed = new Duration(10);
	  @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {    
	    
		//create border pane
		  BorderPane pane = new BorderPane();
		  
		//create fan and put it in the center of border pane
		  FanPane fan = new FanPane();
		  fan.addFan();
		  fan.setRandomColors();
		  pane.setCenter(fan);
		  
		  
		//create buttons and put them at the bottom of border pane
		  Button btPlay_Pause = new Button("Play/Pause");
		  Button btReverse = new Button("Reverse");
		  Button btSpeedUp = new Button("Speed Up");
		  Button btSlowDown = new Button("Slow Down");
		  HBox buttons = new HBox(btPlay_Pause,btReverse,btSpeedUp,btSlowDown);
		  buttons.setAlignment(Pos.CENTER);
		  buttons.setSpacing(10);
		  pane.setBottom(buttons);
		
	    //create scene and set it through the stage
	      Scene scene = new Scene(pane, 310, 300);
	      primaryStage.setTitle("Assignment 12"); // Set the stage title
	      primaryStage.setScene(scene); // Place the scene in the stage
	      primaryStage.show(); // Display the stage
	    
	    //event handling of arc increment
	      
	      EventHandler<ActionEvent> arcInc = e-> {
	    	  fan.arc1.setStartAngle(fan.arc1.getStartAngle()+ increment);
	    	  fan.arc2.setStartAngle(fan.arc2.getStartAngle()+ increment);
	    	  fan.arc3.setStartAngle(fan.arc3.getStartAngle()+ increment);
	    	  fan.arc4.setStartAngle(fan.arc4.getStartAngle()+ increment);
	      };
	      
	    //create a time line
	      Timeline blowingFan = new Timeline(new KeyFrame(speed,arcInc));
	      blowingFan.setCycleCount(Timeline.INDEFINITE);
	      blowingFan.play();
	      
	    //register handlers on buttons
	      btPlay_Pause.setOnAction(e->{
	    	  if (blowingFan.getStatus() == Animation.Status.PAUSED) {
	    		  blowingFan.play();
	    	  }
	    	  else {
	    		  blowingFan.pause();
	    	  }
	      });
	      
	      btReverse.setOnAction(e->{
	    	  increment *= -1;
	      });
	      
	      btSpeedUp.setOnAction(e->{
	    	  if(increment >= 0)
	    	  {
	    		  increment += 0.5;
	    	  }
	    	  else
	    	  {
	    		  increment -= 0.5;
	    	  }
	      });
	      
	      btSlowDown.setOnAction(e->{
	    	  if(increment > 0)
	    	  {
	    		  increment -= 0.5;
	    	  }
	    	  else if(increment < 0)
	    	  {
	    		  increment += 0.5;
	    	  }
	      });

	    
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
