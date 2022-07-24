// COMSC-255  Module 14  Ch20 Collections
// Iterator Test 2

package DemosM13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class TestIterator_Part2 {
  public static void main(String[] args) {
	Collection<String> collection = new ArrayList<>();
	collection.add("New York");
	collection.add("Atlanta");
	collection.add("Dallas");
	collection.add("Madison");
		
	// Create a ListIterator to access each element from the beginning
	ListIterator<String> iterator_list = ((ArrayList<String>)(collection)).listIterator();
	while (iterator_list.hasNext()) {
	  System.out.print(iterator_list.next() + " ");
	}
	System.out.println();
		
	// To access each element from the end of the ListIterator
	while (iterator_list.hasPrevious()) {
	  System.out.print(iterator_list.previous() + " ");
	}
	System.out.println();
  }
}