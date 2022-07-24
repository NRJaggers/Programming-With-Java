//Nathan Jaggers
//1547609

package Final;

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

public class Final extends Application {	         
	     protected BorderPane getPane() {
	    // set up the pane of two buttons 
	   	HBox paneForButtons = new HBox(20);
	   	Button btLeft = new Button("Left");
	   	Button btRight = new Button("Right");
	   	Button btUp = new Button("Up");
	   	Button btDown = new Button("Down");
	   	paneForButtons.getChildren().addAll(btLeft, btRight, btUp, btDown);
	   	paneForButtons.setAlignment(Pos.CENTER);
	   	paneForButtons.setStyle("-fx-border-color: yellow");;
	   	
	   	
	   	// set up the box pane 
	   	Pane boxPane = new Pane();
	  //create rectangle and put it in the center of border pane
		  int height = 40, width = 80 ;
		  Rectangle box = new Rectangle(width, height) ;
		  box.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
		  box.setFill(Color.color(Math.random(),Math.random(),Math.random()));
		  boxPane.setStyle("-fx-border-color: green");
	   	  boxPane.getChildren().add(box);
	   	  
	   	// set up the main pane - borderPane in the scene
	   	BorderPane pane = new BorderPane();
	   	pane.setBottom(paneForButtons);
	   	pane.setCenter(boxPane);
	   	
	   	// register the handlers on buttons
	   	btLeft.setOnAction(e -> box.setX(box.getX() - 10));
	   	btRight.setOnAction(e -> box.setX(box.getX() + 10));
	   	btUp.setOnAction(e -> box.setY(box.getY() - 10));
	   	btDown.setOnAction(e -> box.setY(box.getY() + 10));
	   		
	   	return pane;
	     }

	     public void start(Stage primaryStage) {
	   	Scene scene = new Scene(getPane(), 500, 250);
	   	primaryStage.setTitle("ButtonDemo"); // Set the stage title
	   	primaryStage.setScene(scene); // Place the scene in the stage
	   	primaryStage.show(); // Display the stage
	     }
	   	
	     public static void main (String[] args){
	   	Application.launch(args);
	     }
	   }
	



