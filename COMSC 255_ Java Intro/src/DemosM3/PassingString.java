package DemosM3;

public class PassingString {

  public static void main(String[] args) {
  // TODO Auto-generated method stub
    String s = "Hello";
    System.out.println("Invoke nPrintln() method 1st time:");
    nPrintln(s, 5);
    System.out.println("Invoke nPrintln() method 2nd time:");
    nPrintln(s, 5);
  }

  public static void nPrintln(String message, int n){
	for (int i = 0; i < n; i++)
	  System.out.println(message);
	message += 'A';
	System.out.printf("The local message content updated, %10s\n", message);
  }
}
