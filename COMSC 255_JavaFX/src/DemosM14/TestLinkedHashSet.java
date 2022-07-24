// COMSC-255  Module 15  Ch21 Sets and Maps
// TestLinkedHashSet.java

package DemosM14;

import java.util.*;

public class TestLinkedHashSet {
  public static void main(String[] args) {
// Create a hash set
	Set<String> set = new LinkedHashSet<>();

// Add strings to the set
	set.add("London");
	set.add("Paris");
	set.add("New York");
	set.add("San Francisco");
	set.add("Beijing");
	set.add("New York");

	System.out.println(set);

// Display the elements in the hash set
	for (Object element: set)
	  System.out.print(((String)element).toLowerCase() + " ");
  }
}