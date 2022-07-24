// COMSC-255  Module 15  Ch21 Sets and Maps
// CountOccurrenceOfWords.java

package DemosM14;

import java.util.*;

public class CountOccurrenceOfWords {
  public static void main(String[] args) {
  // Set text in a string
  String text = "Hello, Everyone: Have a great final exam. Have a wonderful winter break. Have fun!";

  // Create a TreeMap to hold words as key and count as value
  Map<String, Integer> map = new TreeMap<>();
  // Split the whole sentence string into word strings
  String[] words = text.split("[ \n\t\r.,;:!?]");
  for (int i = 0; i < words.length; i++) {
    String key = words[i].toLowerCase();
    if (key.length() > 0) {
	  if (!map.containsKey(key)) {
	    map.put(key, 1); // create a new key
	  }
	  else {
	    int value = map.get(key);
	    value++;
	    map.put(key, value);  // update the value
	  }
    }
  }
  System.out.println("Display entries in the TreeMap");
  System.out.println(map);
  }
}
  /*
  // Get all entries into a set
  Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
  // Get key and value from each entry
  for (Map.Entry<String, Integer> entry: entrySet)
	System.out.println(entry.getValue() + "\t" + entry.getKey());
  System.out.println("\nDisplay entries in the TreeMap");
  System.out.println(map); */
  

		
	