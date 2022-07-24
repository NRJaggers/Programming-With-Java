// COMSC-255  Module 12  Ch 16
// JavaFX Controls 

package DemosM12;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

public class TextAreaDemo extends Application {
@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
// Declare and create a description pane
	DescriptionPane descriptionPane = new DescriptionPane();
// Set title, text, and image in the description pane
	descriptionPane.setTitle("Canada");
	String description = "The Canadian national flag ...";
	descriptionPane.setImageView(new ImageView
			("http://www.cs.armstrong.edu/liang/image/ca.gif"));
	descriptionPane.setDescription(description);

// Create a scene and place it in the stage
	Scene scene = new Scene(descriptionPane, 450, 200);
	primaryStage.setTitle("TextAreaDemo"); // Set the stage title
	primaryStage.setScene(scene); // Place the scene in the stage
	primaryStage.show(); // Display the stage
	}
	public static void main (String[] args){
		Application.launch(args);
	}
}