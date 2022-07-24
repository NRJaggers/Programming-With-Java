//  COMSC-255  Module 11  JavaFX
//  Event driving programming from Ch 15

package DemosM11;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AnonymousHandlerDemo extends Application {
	public void start(Stage primaryStage) {
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btNew = new Button("New");
		Button btOpen = new Button("Open");
		Button btSave = new Button("Save");
		Button btPrint = new Button("Print");
		hBox.getChildren().addAll(btNew, btOpen, btSave, btPrint);
		
		btNew.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				System.out.println("Process New");
			}
		});
		btOpen.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				System.out.println("Process Open");
			}
		});
		btSave.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				System.out.println("Process Save");
			}
		});
		btPrint.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				System.out.println("Process Print");
			}
		});
		Scene scene = new Scene(hBox, 300, 50);
		primaryStage.setTitle("AnonymousHandlerDemo"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	public static void main(String[] args){
		Application.launch(args);
	}
}