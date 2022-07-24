// COMSC-255  Module 14  Ch20 Collections
// Stack Demo

package DemosM13;

public class TestStack {
	public static void main(String[] args){
		java.util.Stack<String> stack = new java.util.Stack<>(); 
		stack.push("Oklahoma");
		stack.push("Indiana");
		stack.push("Georgia");
		stack.push("Texas"); 
		
		while (!stack.empty())
			System.out.print(stack.pop() + " ");
	}
}
