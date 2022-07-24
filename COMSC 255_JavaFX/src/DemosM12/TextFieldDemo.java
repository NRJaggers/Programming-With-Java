// COMSC-255  Module 12  Ch 16
// JavaFX Controls 

package DemosM12;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class TextFieldDemo extends RadioButtonDemo {
  protected BorderPane getPane() {
	// call the super constructor - RadioButtonDemo
	BorderPane pane = super.getPane();
    // set up the pane of a TextField
	BorderPane paneForTextField = new BorderPane();
	paneForTextField.setPadding(new Insets(5, 5, 5, 5));
	paneForTextField.setStyle("-fx-border-color: blue");
	paneForTextField.setLeft(new Label("Enter a new message: "));

	TextField tf = new TextField();
	tf.setAlignment(Pos.BOTTOM_RIGHT);
	paneForTextField.setCenter(tf);
	// add the pane of the textfield into the main pane
	pane.setTop(paneForTextField);
    // register the handler on the text object
	tf.setOnAction(e -> text.setText(tf.getText()));
		
	return pane;
  }
  
  public static void main(String[] args){
	Application.launch(args);
  }
}