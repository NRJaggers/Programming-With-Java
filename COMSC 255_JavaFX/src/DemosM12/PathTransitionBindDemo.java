// COMSC-255  Module 12  Ch 15
// Animations

package DemosM12;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PathTransitionBindDemo extends Application {
  public void start(Stage primaryStage) {
	Pane pane = new Pane();
	Rectangle rectangle = new Rectangle (0, 0, 25, 50);
	rectangle.setFill(Color.ORANGE);
	Circle circle = new Circle(0, 0, 50);
	circle.setFill(Color.WHITE);
	circle.setStroke(Color.BLACK);
		
	circle.centerXProperty().bind(pane.widthProperty().divide(2));
	circle.centerYProperty().bind(pane.heightProperty().divide(2));
		
	// Add circle and rectangle to the pane
	pane.getChildren().addAll(circle, rectangle);
	// Create a scene and place it in the stage
	Scene scene = new Scene(pane, 250, 200);
	primaryStage.setTitle("PathTransitionBindDemo");
	primaryStage.setScene(scene); // Place the scene in the stage
	primaryStage.show(); // Display the stage
		
	// Create a path transition
	PathTransition pt = new PathTransition();
	pt.setDuration(Duration.millis(4000));
	pt.setPath(circle);
	pt.setNode(rectangle);
	pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
	pt.setCycleCount(Timeline.INDEFINITE);
	pt.setAutoReverse(true);
	pt.play(); // Start animation
	
	// add Mouse handlers
	circle.setOnMousePressed(e -> pt.pause());
	circle.setOnMouseReleased(e -> pt.play());
		
	// add listener to the pane Property
	// animation need to stop and restart again to reflect the change
	pane.widthProperty().addListener(e -> {	pt.stop(); pt.play();}); 
	pane.heightProperty().addListener(e -> {pt.stop(); pt.play();}); 
}
  public static void main(String[] args) {
	launch(args);
  }
}
