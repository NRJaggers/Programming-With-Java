// COMSC-255  Module 12  Ch 16
// JavaFX Controls 

package DemosM12;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class CheckBoxDemo extends ButtonDemo {
  protected BorderPane getPane() {
	// call the super constructor - ButtonDemo
	BorderPane pane = super.getPane();
	// set up fonts
	Font fontBoldItalic = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20);
	Font fontBold = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20);
	Font fontItalic = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.ITALIC, 20);
	Font fontNormal = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 20);
	text.setFont(fontNormal);
	// set the pane of check boxes
	VBox paneForCheckBoxes = new VBox(20);
	paneForCheckBoxes.setPadding(new Insets(5, 5, 5, 5));
	paneForCheckBoxes.setStyle("-fx-border-color: blue");
	CheckBox chkBold = new CheckBox("Bold");
	CheckBox chkItalic = new CheckBox("Italic");
	paneForCheckBoxes.getChildren().addAll(chkBold, chkItalic);
	pane.setRight(paneForCheckBoxes);
	// Create the handler class ( for both check boxes)
	EventHandler<ActionEvent> handler = e -> {
	if (chkBold.isSelected() && chkItalic.isSelected()) {
		text.setFont(fontBoldItalic); // Both check boxes checked
	}
	else if (chkBold.isSelected()) {
		text.setFont(fontBold); // The Bold check box checked
	}
	else if (chkItalic.isSelected()) {
		text.setFont(fontItalic); // The Italic check box checked
	}
	else {
		text.setFont(fontNormal); // Both check boxes unchecked
	}};
	
	// Register the event handlers on the check boxes
	chkBold.setOnAction(handler);
	chkItalic.setOnAction(handler);
	return pane; // Return a new pane
  }
	
    public void start(Stage primaryStage) {
		Scene scene = new Scene(getPane(), 500, 250);
		primaryStage.setTitle("CheckBoxDemo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
  }
    
	public static void main (String[] args){
		Application.launch(args);
	}
}