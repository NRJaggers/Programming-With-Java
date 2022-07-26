//  COMSC-255  Module 11  JavaFX
//  Event driving programming from Ch 15

package DemosM11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircle extends Application {
	private CirclePane circlePane = new CirclePane();
 
	public void start(Stage primaryStage) {
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btEnlarge = new Button("Enlarge");
		Button btShrink = new Button("Shrink");
		hBox.getChildren().addAll(btEnlarge, btShrink);
		btEnlarge.setOnAction(new EnlargeHandler());
		btShrink.setOnAction(new ShrinkHandler());
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 250, 200);
		primaryStage.setTitle("ControlCircle"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	public static void main(String[] args){
		Application.launch(args);
	}
	class EnlargeHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e){
			circlePane.enlarge();}
	}	
	class ShrinkHandler implements EventHandler<ActionEvent> {
			public void handle(ActionEvent e){
			circlePane.shrink();}
	}
}
		
class CirclePane extends StackPane {
		private Circle circle = new Circle(50);
		public CirclePane() {
			getChildren().add(circle);
			circle.setStroke(Color.BLACK);
			circle.setFill(Color.WHITE);
		}
		public void enlarge() {
			circle.setRadius(circle.getRadius() + 2);
		}
		public void shrink() {
			circle.setRadius(circle.getRadius() > 2 ?
			circle.getRadius() - 2 : circle.getRadius());
		}
}
	
		