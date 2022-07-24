// COMSC-255  Module 12  Ch 15
// Animations


package DemosM12;
import java.util.Random;
import javafx.animation.Animation;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class TimelineDemo_1 extends Application {
  public void start(Stage primaryStage) {
	StackPane pane = new StackPane();
	Random r = new Random();
	Text text = new Text(20, 50, "Let's make\n some ellipses!!");
	text.setFill(Color.BLUE);
	pane.getChildren().add(text); // Place text into the stack pane
    // Create a handler for changing text
	EventHandler<ActionEvent> eventHandler = e -> {
	  if (text.getText().length() != 0) {
		text.setText("");
	  }
	  else
		text.setText("Let's make\nsome ellipses!!");	
	  };
	  
	 EventHandler<ActionEvent> eventHandler_ellipse = e -> {
	 // Create an ellipse and add it to pane
	   Ellipse e1 = new Ellipse(150, 100, 100, 50);
	   e1.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
	   e1.setFill(null);
	   e1.setRotate(r.nextInt(16) * 180 / 16);
	   pane.getChildren().add(e1);
	 };
	
	 // Create an animation for alternating text
	Timeline animation = new Timeline(new KeyFrame(Duration.millis(100), eventHandler_ellipse),
				new KeyFrame(Duration.millis(500), eventHandler));
	animation.setCycleCount(Timeline.INDEFINITE);
	animation.play(); // Start animation
	// Register the Mouse click handler on the text
	text.setOnMouseClicked(e -> {
	  if (animation.getStatus() == Animation.Status.PAUSED)
		animation.play();
	  else
		animation.pause();
	});
	
	Scene scene = new Scene(pane, 250, 250);
	primaryStage.setTitle("TimelineDemo"); // Set the stage title
	primaryStage.setScene(scene); // Place the scene in the stage
	primaryStage.show(); // Display the stage
  }
	
  public static void main(String[] args){
	Application.launch(args);
  }
}