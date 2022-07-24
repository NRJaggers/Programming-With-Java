// COMSC-255  Module 14  Ch20 Collections
// Collection demo 1

package DemosM13;

import java.util.*;

public class Test_Collection1 {
  public static void main(String[] args) {
	// sorting demo
	List<String> list = Arrays.asList("yellow", "red", "green", "blue");
	System.out.println("The sorted result:");
	Collections.sort(list);
	System.out.println(list);
	System.out.println("The reverse order result:");
	Collections.sort(list, Collections.reverseOrder());
	System.out.println(list);
	// fill demo
	System.out.println("The filled result:");
	Collections.fill(list, "black");
	System.out.println(list);
	// copy demo	
	List<String> list1 = Arrays.asList("yellow", "red", "green", "blue");
	List<String> list2 = Arrays.asList("white", "black");
	System.out.println("Copy list2 to list 1:");
	Collections.copy(list1, list2);
	System.out.println(list1);
  }
}
