// COMSC-255  Module 14  Ch20 Collections
// Collection demo 2

package DemosM13;

import java.util.*;

public class Test_Collection2 {
  public static void main(String[] args) {
	List<GregorianCalendar> cal_list= Collections.nCopies(5, new GregorianCalendar(2017, 1, 1));
	System.out.println(cal_list);
	// disjoint demo
	Collection<String> collection1 = Arrays.asList("red", "cyan");
	Collection<String> collection2 = Arrays.asList("red", "blue");
	Collection<String> collection3 = Arrays.asList("pink", "tan");
	System.out.println(Collections.disjoint(collection1, collection2));
	System.out.println(Collections.disjoint(collection1, collection3));
	
	// binarySearch demo	
	List<Integer> list3 = Arrays.asList(2, 4, 7, 10, 11, 45, 50, 59, 60, 66);
	System.out.println("(1) Index: " + Collections.binarySearch(list3, 7));
	System.out.println("(2) Index: " + Collections.binarySearch(list3, 9));
	
	List<String> list4 = Arrays.asList("blue", "green", "red");
	System.out.println("(3) Index: " +
	Collections.binarySearch(list4, "red"));
	System.out.println("(4) Index: " +
	Collections.binarySearch(list4, "cyan"));
  }
}
