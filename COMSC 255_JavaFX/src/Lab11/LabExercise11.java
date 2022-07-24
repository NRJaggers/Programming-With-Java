//Nathan Jaggers
//1547609

package Lab11;

//imports
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class LabExercise11 extends Application{
	//node declarations
	private TextField tfAnnualInterestRate 	= new TextField();
	private TextField tfNumberOfYears 		= new TextField();
	private TextField tfInvestmentAmount 	= new TextField();
	private TextField tfFutureValue 		= new TextField();
	private Button 	  btCalculate 			= new Button("Calculate");
	
	//Override start
	@Override
	public void start(Stage primaryStage) {
		//create grid Pane
		GridPane gridPane = new GridPane();
		
		//set horizontal and vertical gaps
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		
		//add labels and text fields
		gridPane.add(new Label("Investment Amount:"),	0,0);
		gridPane.add(new Label("Number of Years:"),		0,1);
		gridPane.add(new Label("Annual Interest Rate:"),0,2);
		gridPane.add(new Label("Future Value:"),		0,3);
		
		gridPane.add(tfInvestmentAmount,	1,0);
		gridPane.add(tfNumberOfYears,		1,1);
		gridPane.add(tfAnnualInterestRate,	1,2);
		gridPane.add(tfFutureValue,			1,3);
		
		gridPane.add(btCalculate,1,4);
		
		//set alignment
		gridPane.setAlignment(Pos.CENTER);
		tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
		tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT); 		
		tfInvestmentAmount.setAlignment(Pos.BOTTOM_RIGHT); 	
		tfFutureValue.setAlignment(Pos.BOTTOM_RIGHT); 
		tfFutureValue.setEditable(false);
		GridPane.setHalignment(btCalculate, HPos.RIGHT);
		
		//process events
		btCalculate.setOnAction(e-> calculateFutureValue());
		
		//create scene
		Scene scene = new Scene(gridPane,400,250);
		
		//set Stage
		primaryStage.setTitle("Lab Exercise 11");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
  
  public static void main(String[] args) {
	  Application.launch(args);
  }
  
  private void calculateFutureValue() {
	  
	  //declare and collect values from text fields
	  double futureValue = 0 ;
	  double interest = Double.parseDouble(tfAnnualInterestRate.getText());
	  int years = Integer.parseInt(tfNumberOfYears.getText());
	  double investment = Double.parseDouble(tfInvestmentAmount.getText());
	  
	  //calculate future value
	  futureValue = investment*(Math.pow((1+(interest/1200)),(years*12)));
			  
	  //output future value
	  tfFutureValue.setText(String.format("$%.2f", futureValue));
	  
  }
}
