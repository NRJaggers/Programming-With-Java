// COMSC-255  Module 14  Ch20 Collections
// Deque Demo

package DemosM13;

public class TestDeque {
	public static void main(String[] args){
		java.util.Deque<String> deque = new java.util.LinkedList<>(); 
		deque.offer("Oklahoma");
		deque.offer("Indiana");
		deque.offer("Georgia");
		deque.offer("Texas"); 
		
		while (deque.size() > 1)
		{	
			System.out.print(deque.removeFirst() + " ");
			System.out.print(deque.removeLast() + " ");
		}
	}
}
