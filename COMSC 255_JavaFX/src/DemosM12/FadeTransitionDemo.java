// COMSC-255  Module 12  Ch 15
// Animations


package DemosM12;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FadeTransitionDemo extends Application {
  public void start(Stage primaryStage) {
	Pane pane = new Pane();
	Ellipse ellipse = new Ellipse(10, 10, 100, 50);
	ellipse.setFill(Color.RED);
	ellipse.setStroke(Color.BLACK);
	ellipse.centerXProperty().bind(pane.widthProperty().divide(2));
	ellipse.centerYProperty().bind(pane.heightProperty().divide(2));
	ellipse.radiusXProperty().bind(pane.widthProperty().multiply(0.4));
	ellipse.radiusYProperty().bind(pane.heightProperty().multiply(0.4));
	pane.getChildren().add(ellipse);
		
	FadeTransition ft = new FadeTransition(Duration.millis(5000), ellipse);
	ft.setFromValue(1.0);
	ft.setToValue(0.1);
	ft.setCycleCount(Timeline.INDEFINITE);
	ft.setAutoReverse(true);
	ft.play(); // Start animation
	ellipse.setOnMousePressed(e -> ft.pause());
	ellipse.setOnMouseReleased(e -> ft.play());
		
	Scene scene = new Scene(pane, 250, 200);
	primaryStage.setTitle("FadeTransitionDemo"); // Set the stage title
	primaryStage.setScene(scene); // Place the scene in the stage
	primaryStage.show(); // Display the stage
  }
  
  public static void main(String[] args){
	Application.launch(args);
  }
}