/** postfix solution to binary tree image in page 318:
 * 	3, 1, +, 3, *, 9, 5, -, 2, +, /, 3, 7, 4, -, *, 6, +, -
 */

import java.util.*;

public class ArithmeticApp{

	public static boolean operator(char c){
		if(c == '+' || c == '-' || c == '*' || c == '/'){
			return true;
		}
		else{
			return false;
		}
	}

	public static TNode buildExpression(String expression){
		Stack<TNode> stack = new Stack<TNode>();
		for(int i = 0; i<expression.length(); i++){
			char x = expression.charAt(i); // char x to hold the character of aperator or number
			if(operator(x) || Character.isDigit(x)){ //If the character is a number or operator x

				/*create a single-node binary tree temp whose root
				 *stores x */

				TNode temp = new TNode(x, null, null);
				stack.push(temp);

				//BTree tree = new BTree(temp);
				//tree.addRoot(temp);

 		}

			/* On the other hand, if the character is a closed
			 * parenthesis ")" */
			else if(x == ')'){
				//Pop the top three trees from the stack

				//TNode temp = new TNode(x, null, null);

				TNode first = stack.pop();
				TNode second = stack.pop();
				TNode third = stack.pop();

				//Attach the trees for e1 and e2 as children for o

				// temp.left = second;
				// temp.right = first;

				second.attach(third,first); 

				//Push the resulting tree back onto the stack
				stack.push(second);
			}

		}

		/*After the loop, return the top element of the stack which is the
		 * final expression tree */ 
		 return stack.pop();

	}

	public static void postOrder(TNode root){
		if(root.left()!=null){
			postOrder(root.left);
		}
		if(root.right()!=null){
			postOrder(root.right);
		}
		System.out.println(root.element);

	}

	// public static void main(String[] args){
	// 	String postfix = "(3*5)/5";
	// 	//ArithmeticApp calc = new ArithmeticApp();

	// 	TNode r = buildExpression(postfix);

	// 	System.out.println(postOrder(r));

	// }
}