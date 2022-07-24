// COMSC-255  Module 14  Ch20 Collections
// Iterator Test 1

package DemosM13;

import java.util.*;

public class TestIterator_Part1 {
  public static void main(String[] args) {
	Collection<String> collection = new ArrayList<>();
	collection.add("New York");
	collection.add("Atlanta");
	collection.add("Dallas");
	collection.add("Madison");
		
	Iterator<String> iterator = collection.iterator();
	// Use a while loop to access each element from the iterator
	while (iterator.hasNext()) {
	  System.out.print(iterator.next() + " ");
	}
	System.out.println();
		
	// Use for-Each loop to access each element from the iterator
	for (Iterator i = collection.iterator(); i.hasNext(); ){
	  System.out.print(((String)i.next()).toUpperCase() + " ");
	}
	  System.out.println();
	}
}