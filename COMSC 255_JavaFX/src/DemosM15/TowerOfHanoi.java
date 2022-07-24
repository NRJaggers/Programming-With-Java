//  COMSC-255  Module 13
//  Recursions
//  Tower of Hanoi demostration


package DemosM15;

import java.util.Scanner;

public class TowerOfHanoi {
  static int count;
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter number of disks: ");
	int n = input.nextInt();

	// Find the solution recursively
	count = 0;
	System.out.println("The moves are: ");
	moveDisks(n, 'A', 'B', 'C');
	System.out.println("There are total " + count + " moves.");
	input.close();
  }

  /** The method for finding the solution to move n disks
   from fromTower to toTower with auxTower */
  public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
	count ++;
	if (n == 1) // base case
	  System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
	else {
	  moveDisks(n - 1, fromTower, auxTower, toTower);
	  System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
	  moveDisks(n - 1, auxTower, toTower, fromTower);
	}
  }
}

