// COMSC-255  Module 14  Ch20 Collections
// EvaluateExpression.java

package Lab14;

import java.util.Stack;
import java.util.Scanner;

public class LabExercise14 {
	public static void main(String[] args) {
		// Check number of arguments passed
		if (args.length != 1) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a mathmatical expression to evaluate : "); //like "(1+2)*5-2+12/4"
			String expression = input.next();
			System.out.print("Evalutation of expression = ") ;
			
			try {
				System.out.println(evaluateExpression(expression));
			}
			catch (Exception ex) {
				System.out.println("Wrong expression: " + expression);
			}
		}
		else
		{
			System.out.print("Evalutation of expression = ") ;
			
			try {
				System.out.println(evaluateExpression(args[0]));
			}
			catch (Exception ex) {
				System.out.println("Wrong expression: " + args[0]);
			}
		}


	}

/** Evaluate an expression */
	public static int evaluateExpression(String expression) {
		Stack<Integer> operandStack = new Stack<>();
		Stack<Character> operatorStack = new Stack<>();

		// Insert blanks around (, ), +, -, /, *, % and ^
		expression = insertBlanks(expression);

		// Extract operands and operators
		String[] tokens = expression.split(" ");

		// Phase 1: Scan tokens
		for (String token: tokens) {
			if (token.length() == 0) // Blank space
				continue; // Back to the while loop to extract the next token
			else if (token.charAt(0) == '+' || token.charAt(0) == '-') {
				// Process all +, -, *, /, %, ^ in the top of the operator stack
				while (!operatorStack.isEmpty() &&
					(operatorStack.peek() == '+' || operatorStack.peek() == '-' || 
					 operatorStack.peek() == '*' || operatorStack.peek() == '/'  ||
					 operatorStack.peek() == '%' || operatorStack.peek() == '^'  )) {
					processAnOperator(operandStack, operatorStack);
				}
				// Push the + or - operator into the operator stack
				operatorStack.push(token.charAt(0));
			}
			else if (token.charAt(0) == '*' || token.charAt(0) == '/' || token.charAt(0) == '%') {
				// Process all *, /, %, ^ in the top of the operator stack
				while (!operatorStack.isEmpty() &&
					(operatorStack.peek() == '*' || operatorStack.peek() == '/' || 
					 operatorStack.peek() == '%' || operatorStack.peek() == '^')) {
					processAnOperator(operandStack, operatorStack);
				}
				// Push the * or / or % operator into the operator stack
				operatorStack.push(token.charAt(0));
			}
			else if (token.charAt(0) == '^' ) {
				// Process all ^ in the top of the operator stack
				while (!operatorStack.isEmpty() && (operatorStack.peek() == '^')) {
					processAnOperator(operandStack, operatorStack);
				}
				// Push the * or / or % operator into the operator stack
				operatorStack.push(token.charAt(0));
			}
			else if (token.trim().charAt(0) == '(') {
				operatorStack.push('('); // Push '(' to stack
			}
			else if (token.trim().charAt(0) == ')') {
				// Process all the operators in the stack until seeing '('
				while (operatorStack.peek() != '(') {
					processAnOperator(operandStack, operatorStack);
				}
				operatorStack.pop(); // Pop the '(' symbol from the stack
			}
			else { // An operand scanned
				// Push an operand to the stack
				operandStack.push(new Integer(token));
			}
		}		
		// Phase 2: Process all the remaining operators in the stack
		while (!operatorStack.isEmpty()) {
			processAnOperator(operandStack, operatorStack);
		}
		// Return the result
		return operandStack.pop();
	}
				
	/** Process one operator: Take an operator from operatorStack and
	/ * apply it on the operands in the operandStack */
	public static void processAnOperator(Stack<Integer> operandStack, Stack<Character> operatorStack) {
		char op = operatorStack.pop();
		int op1 = operandStack.pop();
		int op2 = operandStack.pop();
		
		//trouble shooting
		//System.out.printf("%d %c %d \n",op2, op, op1) ;
		
		if      (op == '+')
			operandStack.push(op2 + op1);
		else if (op == '-')
			operandStack.push(op2 - op1);
		else if (op == '*')
			operandStack.push(op2 * op1);
		else if (op == '/')
			operandStack.push(op2 / op1);
		else if (op == '%')
			operandStack.push(op2 % op1);
		else if (op == '/')
			operandStack.push(op2 / op1);
		else if (op == '^')
			operandStack.push( (int) Math.pow(op2,op1));
		}

	public static String insertBlanks(String s) {
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == ')' ||
				s.charAt(i) == '+' || s.charAt(i) == '-' ||
				s.charAt(i) == '*' || s.charAt(i) == '/' ||
				s.charAt(i) == '%' || s.charAt(i) == '^' )
				result += " " + s.charAt(i) + " ";
			else
				result += s.charAt(i);
		}
		return result;
	}
}