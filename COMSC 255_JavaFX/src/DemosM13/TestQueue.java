// COMSC-255  Module 14  Ch20 Collections
// Queue Demo

package DemosM13;

public class TestQueue {
	public static void main(String[] args){
		java.util.Queue<String> queue = new java.util.LinkedList<>(); 
		queue.offer("Oklahoma");
		queue.offer("Indiana");
		queue.offer("Georgia");
		queue.offer("Texas"); 
		
		while (queue.size() > 0)
			System.out.print(queue.remove() + " ");
	}
}
