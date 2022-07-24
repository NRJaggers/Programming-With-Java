// COMSC-255  Module 12  Ch 16
// JavaFX Controls 

package DemosM12;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class RadioButtonDemo extends CheckBoxDemo {
  protected BorderPane getPane() {
	// call the super constructor - CheckBoxDemp
	BorderPane pane = super.getPane();
	
	// set up the pane of Radio Buttons
	VBox paneForRadioButtons = new VBox(20);
	paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
	paneForRadioButtons.setStyle("-fx-border-width: 2px; -fx-border-color: blue");
	RadioButton rbRed = new RadioButton("Red");
	RadioButton rbGreen = new RadioButton("Green");
	RadioButton rbBlue = new RadioButton("Blue");
	
	// set the Red selected by default
	rbRed.setSelected(true);
	text.setFill(Color.RED);
	paneForRadioButtons.getChildren().addAll(rbRed, rbGreen, rbBlue);
	
	// add the pane of Radio Buttons into the main pane	
	pane.setLeft(paneForRadioButtons);
	
	// group the Radio Buttons
	ToggleGroup group = new ToggleGroup();
	rbRed.setToggleGroup(group);
	rbGreen.setToggleGroup(group);
	rbBlue.setToggleGroup(group);
	
	// register the handler on the Radio Buttons
	rbRed.setOnAction(e -> { if (rbRed.isSelected()) text.setFill(Color.RED);});
	rbGreen.setOnAction(e -> { if (rbGreen.isSelected()) text.setFill(Color.GREEN);});
	rbBlue.setOnAction(e -> { if (rbBlue.isSelected()) text.setFill(Color.BLUE);});
		
	return pane;
  }
  
  public static void main (String[] args){
	Application.launch(args);
  }
}