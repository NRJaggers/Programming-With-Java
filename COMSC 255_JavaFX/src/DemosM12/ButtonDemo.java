// COMSC-255  Module 12  Ch 16
// JavaFX Controls 

package DemosM12;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ButtonDemo extends Application {
  protected Text text = new Text(100, 100, "JavaFX Programming");
  
  protected BorderPane getPane() {
    // set up the pane of two buttons with images
	HBox paneForButtons = new HBox(20);
	ImageView lImage = new ImageView("file:left.png");
	lImage.setFitHeight(30);
	lImage.setFitWidth(30);
	ImageView rImage = new ImageView("file:right.png");
	rImage.setFitHeight(30);
	rImage.setFitWidth(30);
	Button btLeft = new Button("Left", lImage);
	Button btRight = new Button("Right", rImage );
	paneForButtons.getChildren().addAll(btLeft, btRight);
	paneForButtons.setAlignment(Pos.CENTER);
	paneForButtons.setStyle("-fx-border-color: blue");;
	// set up the text pane with font
	Pane paneForText = new Pane();
	Font font = Font.font("Times New Roman", 20);
	text.setFont(font);
	paneForText.getChildren().add(text);
	// set up the main pane - borderPane in the scene
	BorderPane pane = new BorderPane();
	pane.setBottom(paneForButtons);
	pane.setCenter(paneForText);
	
	// register the handlers on buttons
	btLeft.setOnAction(e -> text.setX(text.getX() - 10));
	btRight.setOnAction(e -> text.setX(text.getX() + 10));
		
	return pane;
  }

  public void start(Stage primaryStage) {
	Scene scene = new Scene(getPane(), 500, 250);
	primaryStage.setTitle("ButtonDemo"); // Set the stage title
	primaryStage.setScene(scene); // Place the scene in the stage
	primaryStage.show(); // Display the stage
  }
	
  public static void main (String[] args){
	Application.launch(args);
  }
}