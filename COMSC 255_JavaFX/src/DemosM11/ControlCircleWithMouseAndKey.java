//  COMSC-255  Module 11  JavaFX
//  Event driving programming from Ch 15

package DemosM11;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ControlCircleWithMouseAndKey extends Application{
  private CirclePane circlePane = new CirclePane();

  public void start(Stage primaryStage) {
  // setup the GUI, and handle the button events
  HBox hBox = new HBox();
  hBox.setSpacing(10);
  hBox.setAlignment(Pos.CENTER);
  Button btEnlarge = new Button("Enlarge");
  Button btShrink = new Button("Shrink");
  hBox.getChildren().addAll(btEnlarge, btShrink);
  btEnlarge.setOnAction(e -> circlePane.enlarge());
  btShrink.setOnAction(e -> circlePane.shrink());
  
  BorderPane borderPane = new BorderPane();
  borderPane.setCenter(circlePane);
  borderPane.setBottom(hBox);
  BorderPane.setAlignment(hBox, Pos.CENTER);
  
  Scene scene = new Scene(borderPane, 300, 200);
  primaryStage.setTitle("ControlCircle"); // Set the stage title
  primaryStage.setScene(scene); // Place the scene in the stage
  primaryStage.show(); // Display the stage
  
  // handle the Mouse event
  circlePane.setOnMouseClicked(e -> {
    if (e.getButton() == MouseButton.PRIMARY) {
      circlePane.enlarge();}
    else if (e.getButton() == MouseButton.SECONDARY) {
      circlePane.shrink();}
    circlePane.requestFocus(); // Request focus on circlePane
    });
  // handle the Key event
  circlePane.setOnKeyPressed(e -> {
	if (e.getCode() == KeyCode.U) {
      circlePane.enlarge();}
    else if (e.getCode() == KeyCode.D) {
      circlePane.shrink();}
  });
  
  circlePane.requestFocus(); // Request focus on circlePane
  }
	
  public static void main(String[] args) {
	launch(args);
  }
}
