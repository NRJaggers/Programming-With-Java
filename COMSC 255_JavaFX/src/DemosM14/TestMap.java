// COMSC-255  Module 15  Ch21 Sets and Maps
// TestMap.java

package DemosM14;

import java.util.*;

public class TestMap {
  public static void main(String[] args) {
	Map<String, Integer> hashMap = new HashMap<>();
	hashMap.put("Smith", 30);
	hashMap.put("Anderson", 31);
	hashMap.put("Lewis", 29);
	hashMap.put("Cook", 29);
	hashMap.put("Lewis", 27);

	System.out.println("Display entries in HashMap");
	System.out.println(hashMap + "\n");
		
	System.out.println("Display entries in HashMap using entrySet");
	for (Map.Entry<String, Integer> a: hashMap.entrySet()){
	  // increase the value by one for each entrySet
	  a.setValue((int)a.getValue() + 1);
	  System.out.print("The age of " + a.getKey() + " is : ");
	  System.out.println(a.getValue());
    }
		
	// Create a TreeMap from the preceding HashMap
	Map<String, Integer> treeMap = new TreeMap<>(hashMap);
	System.out.println("\nDisplay entries in ascending order of key");
	System.out.println(treeMap);
	
	// Create a LinkedHashMap with the accessing order
	Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
	linkedHashMap.put("Smith", 30);
	linkedHashMap.put("Anderson", 31);
	linkedHashMap.put("Lewis", 27);
	linkedHashMap.put("Cook", 29);
	
	// Display the age for Lewis
	System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
	System.out.println("Display entries in LinkedHashMap");
	System.out.println(linkedHashMap);
  }
}