// COMSC-255  Module 12  Ch 15
// Animations

package DemosM12;
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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class TimelineDemo extends Application {
  public void start(Stage primaryStage) {
	StackPane pane = new StackPane();
	Text text = new Text(20, 50, "Java Programming is FUN!!");
	text.setFill(Color.RED);
	text.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 16));
	pane.getChildren().add(text); // Place text into the stack pane
	
	Scene scene = new Scene(pane, 250, 250);
	primaryStage.setTitle("TimelineDemo"); // Set the stage title
	primaryStage.setScene(scene); // Place the scene in the stage
	primaryStage.show(); // Display the stage
    
	// Create a handler for changing the displayed text
	EventHandler<ActionEvent> eventHandler = e -> {
	  if (text.getText().length() != 0)
		 text.setText("");
	  else
		text.setText("Java Programming is FUN!!");
	};
		
	// Create an animation for alternating text
	Timeline animation = new Timeline( new KeyFrame(Duration.millis(500), eventHandler));
	animation.setCycleCount(Timeline.INDEFINITE);
	animation.play(); // Start animation
	
	// Register Mouse click handler on the displayed text
	text.setOnMouseClicked(e -> {
	  if (animation.getStatus() == Animation.Status.PAUSED)
		animation.play();
	  else
		animation.pause();
	});
  }
	
  public static void main(String[] args){
	Application.launch(args);
  }
}