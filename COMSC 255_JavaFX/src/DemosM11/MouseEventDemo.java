//  COMSC-255  Module 11  JavaFX
//  Event driving programming from Ch 15

package DemosM11;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventDemo extends Application {
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Text text = new Text(20, 20, "Programming is fun");
		pane.getChildren().addAll(text);
		text.setOnMouseDragged(e -> { 
			text.setX(e.getX());
			text.setY(e.getY()); 
		});
 // Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 100);
		primaryStage.setTitle("MouseEventDemo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	public static void main(String[] args){
		Application.launch(args);
	}
}