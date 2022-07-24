// COMSC-255  Module 12  Ch 15
// Animations

package DemosM12;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlagRisingAnimation extends Application {
  public void start(Stage primaryStage) {
	Pane pane = new Pane();
	ImageView imageView = new ImageView("file:flag.png");
	pane.getChildren().add(imageView);
	PathTransition pt = new PathTransition(Duration.millis(5000), 
		new Line(100, 200, 200, 0), imageView);
	pt.setCycleCount(2);
	pt.play(); // Start animation
		
	// Create a scene and place it in the stage
	Scene scene = new Scene(pane, 400, 300);
	primaryStage.setTitle("Flag Rising Animation"); // Set the stage title
	primaryStage.setScene(scene); // Place the scene in the stage
	primaryStage.show(); // Display the stage
	}
  public static void main(String[] args) {
	launch(args);
  }
}
