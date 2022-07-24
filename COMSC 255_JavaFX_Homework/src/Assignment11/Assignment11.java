//Nathan Jaggers
//1547609

package Assignment11;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

//imports

public class Assignment11 extends Application {
  
	//Override start method
  @Override
  public void start(Stage stage) {
	
	//create pane
	  Pane pane = new Pane();
	  
	//set event and handle the case
	  pane.setOnMouseClicked(e->{
		  if(e.getButton() == MouseButton.PRIMARY) 
		  {
			  Circle circle = new Circle(e.getX(),e.getY(),5);
			  circle.setFill(Color.color(Math.random(),Math.random(),Math.random()));
			  circle.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
			  pane.getChildren().add(circle);
		  }
		  else if (e.getButton() == MouseButton.SECONDARY)
		  {
			  ObservableList<Node> list = pane.getChildren();
			  
			  for(int i = 0 ; i < list.size(); i++)
			  {
				  if(list.get(i).contains(e.getX(), e.getY()))
				  {
					  pane.getChildren().remove(i) ;
				  }
			  }
		  }
		  
	  });
	  
	  pane.setOnMouseDragged(e->{
		  if(e.getButton() == MouseButton.PRIMARY) 
		  {
			  Circle circle = new Circle(e.getX(),e.getY(),5);
			  circle.setFill(Color.color(Math.random(),Math.random(),Math.random()));
			  circle.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
			  pane.getChildren().add(circle);
		  }
		  else if (e.getButton() == MouseButton.SECONDARY)
		  {
			  ObservableList<Node> list = pane.getChildren();
			  
			  for(int i = 0 ; i < list.size(); i++)
			  {
				  if(list.get(i).contains(e.getX(), e.getY()))
				  {
					  pane.getChildren().remove(i) ;
				  }
			  }
		  }
	  });
	  
	//create scene
	  Scene scene = new Scene(pane, 450, 350);
	  
	  
	//place scene on stage
	  stage.setTitle("Assignment 11");
	  stage.setScene(scene);
	  stage.show();
  }
  
	public static void main(String[] args) {
		  Application.launch(args);
	  }
}
