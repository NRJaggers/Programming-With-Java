//  COMSC-255  Module 11  JavaFX
//  Event driving programming from Ch 15

package DemosM11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyEventDemo extends Application{
  @Override
  public void start(Stage primaryStage) {
  // create a pane and set its properties (GUI set up)
  Pane pane = new Pane();
  Text text = new Text(100, 100, "A");
  Font font = Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 
       FontPosture.ITALIC, 24);
  text.setFont(font);
  text.setStroke(Color.BLUE);
  pane.getChildren().add(text);
  
  Scene scene = new Scene(pane, 250, 200);
  primaryStage.setTitle("KeyEvent Demo"); // Set the stage title
  primaryStage.setScene(scene); // Place the scene in the stage
  primaryStage.show(); // Display the stage
  
  // handle the KeyEvent  
  text.setOnKeyPressed( e -> {
    switch (e.getCode()){
    	  case DOWN: text.setY(text.getY() + 10); break;
    	  case UP: text.setY(text.getY() - 10); break;
      case LEFT: text.setX(text.getX() - 10); break;
    	  case RIGHT: text.setX(text.getX() + 10); break;
    	  default: 
    	    if (Character.isLetterOrDigit(e.getText().charAt(0)))
    	    	  text.setText(e.getText());
    	}
  });
 
  text.requestFocus();
}
	
  public static void main(String[] args) {
	launch(args);
  }
}
