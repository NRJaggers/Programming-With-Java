// COMSC-255 Loop example with JOptionPane 
// Module 2
// 
// Using JOption dialog boxes to get the user's input
// Display the sum at the end

package DemosM2;
import javax.swing.JOptionPane;

public class LoopUsingDialogboxes {
  public static void main(String[] args) {
  // TODO Auto-generated method stub
    int sum = 0;
    
    // keep reading data until the user answer NO
    int option = JOptionPane.YES_OPTION;
    while (option == JOptionPane.YES_OPTION)
    {
    	  // Read the next data
    	  String input = JOptionPane.showInputDialog("Enter an integer: ");
    	  int data = Integer.parseInt(input);
    	  sum += data;
    	  option = JOptionPane.showConfirmDialog(null, "Continue?");
    }
    
    JOptionPane.showMessageDialog(null, "The sum is " + sum);
  }
}
