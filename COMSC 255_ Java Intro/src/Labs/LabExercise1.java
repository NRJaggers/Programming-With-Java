//Nathan Jaggers, Daehoon Kwack
//1547609, 1617183
//Jan 29th 2020

package Labs;

import javax.swing.JOptionPane;

public class LabExercise1 {

public static void main(String[] args) {
// Get user input and Display Welcome message in a message dialog Box
	  
	String name ;
	String  introMSG ;
	  
	name = JOptionPane.showInputDialog(null,"Please enter your name:","Lab Exercise 1",1) ;
	
	introMSG = name + ", welcome to Java!" ;
	JOptionPane.showMessageDialog(null, introMSG, "Lab Exercise 1", 1);
	
}

}
