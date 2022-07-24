// COMSC-255  Module 12  Ch 16
// JavaFX Controls 
package DemosM12;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class ComboBoxDemo extends Application {
@Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
	 // Declare an array of Strings for flag titles
	String[] flagTitles = {"Canada", "China", "Denmark","France", "Germany",
	"India", "Norway", "United Kingdom", "United States of America"};
	// Create a combo box for selecting countries
	ObservableList<String> items = FXCollections.observableArrayList(flagTitles);// Set the first country (Canada) for display
    ComboBox<String> cbo = new ComboBox<>(items); // flagTitles;
	cbo.setPrefWidth(300);
	cbo.setValue("Canada");  
	
	// label to display the selection
	Label name = new Label("The Country Selected is: Canada");
	name.setTextFill(Color.RED);
	
	// Add combo box and description pane to the border pane
	BorderPane pane = new BorderPane();
	pane.setPadding(new Insets(10, 10, 10, 10));
	pane.setLeft(new Label("Select a country: "));
	pane.setRight(cbo);
	pane.setBottom(name);
		
	// add event listener to the combobox and display the selected country
	cbo.setOnAction(e -> name.setText("The Country Selected is: " + cbo.getValue()));
	
	// Create a scene and place it in the stage
	Scene scene = new Scene(pane, 450, 150);
	primaryStage.setTitle("ComboBoxDemo"); // Set the stage title
	primaryStage.setScene(scene); // Place the scene in the stage
	primaryStage.show(); // Display the stage
  }
			
  public static void main (String[] args){
	Application.launch(args);
  }
}