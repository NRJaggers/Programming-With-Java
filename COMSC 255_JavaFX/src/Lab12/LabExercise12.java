//Nathan Jaggers
//1547609

package Lab12;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class LabExercise12 extends Application{
	
	//override start
	@Override
	public void start(Stage stage) {
		
		//create Vbox for lights
		  VBox lights = new VBox();
		  Circle redLight = new Circle(0,10,20);
		  Circle yellowLight = new Circle(0,20,20);
		  Circle greenLight = new Circle(0,30,20);
		
		//set colors 
		  redLight.setFill(Color.DARKGRAY);
		  redLight.setStroke(Color.DIMGRAY);
		  redLight.setStrokeWidth(2);
		  yellowLight.setFill(Color.DARKGRAY);
		  yellowLight.setStroke(Color.DIMGRAY);
		  yellowLight.setStrokeWidth(2);
		  greenLight.setFill(Color.DARKGRAY);
		  greenLight.setStroke(Color.DIMGRAY);
		  greenLight.setStrokeWidth(2);
		  
		  lights.getChildren().addAll(redLight,yellowLight,greenLight);
		  lights.setAlignment(Pos.CENTER);
		  
		//create pane for box
		  StackPane pane = new StackPane();
		  Rectangle box = new Rectangle(0,0,50,150);
		  box.setFill(Color.GRAY);
		  pane.setAlignment(Pos.CENTER);
		  pane.getChildren().addAll(box,lights);
		  
		//create HBox, Radio Buttons and Toggle group for changing lights
		  HBox options = new HBox();
		  RadioButton rbGray 	= new RadioButton("Gray(Start)");
		  RadioButton rbRed 	= new RadioButton("Red Light");
		  RadioButton rbYellow 	= new RadioButton("Yellow Light");
		  RadioButton rbGreen 	= new RadioButton("Green Light");
		  RadioButton rbBroken 	= new RadioButton("Broken");
		  options.getChildren().addAll(rbGray, rbRed, rbYellow, rbGreen, rbBroken);
		  options.setAlignment(Pos.CENTER);
		  options.setSpacing(10);
		  rbGray.setSelected(true);
		  
		  ToggleGroup group = new ToggleGroup();
		  rbGray.setToggleGroup(group);
		  rbRed.setToggleGroup(group);
		  rbYellow.setToggleGroup(group);
		  rbGreen.setToggleGroup(group);
		  rbBroken.setToggleGroup(group);
		  
		//create handlers for buttons
		  rbGray.setOnAction(e->{
			  if (rbGray.isSelected())
			  	redLight.setFill(Color.DARKGRAY);
		  		yellowLight.setFill(Color.DARKGRAY);
	  			greenLight.setFill(Color.DARKGRAY);

		  });
		  
		  rbRed.setOnAction(e->{
			  if (rbRed.isSelected())
				  redLight.setFill(Color.RED);
			  	  yellowLight.setFill(Color.DARKGRAY);
	  			  greenLight.setFill(Color.DARKGRAY);
		  });
		  
		  rbYellow.setOnAction(e->{
			  if (rbYellow.isSelected())
			  	  redLight.setFill(Color.DARKGRAY);
			      yellowLight.setFill(Color.YELLOW);
	  			  greenLight.setFill(Color.DARKGRAY);
		  });
		  
		  rbGreen.setOnAction(e->{
			  if (rbGreen.isSelected())
				  redLight.setFill(Color.DARKGRAY);
		  		  yellowLight.setFill(Color.DARKGRAY);
				  greenLight.setFill(Color.GREEN);
		  });
		  
		  rbBroken.setOnAction(e->{
			  if (rbBroken.isSelected())
				redLight.setFill(Color.RED);
		  		yellowLight.setFill(Color.YELLOW);
	  			greenLight.setFill(Color.GREEN);
		  });
		  
		//create border pane
		  BorderPane mainPane = new BorderPane() ;
		  mainPane.setCenter(pane);
		  mainPane.setBottom(options);
		  
		//create Scene
		  Scene scene = new Scene(mainPane,450,250);
		  
		//set Stage
		  stage.setScene(scene);
		  stage.setTitle("Lab Exercise 12");
		  stage.show();
		
	}
	
	public static void main(String[] args) {
		  Application.launch(args);
	  }
}
