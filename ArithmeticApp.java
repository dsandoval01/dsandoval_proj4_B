/** postfix solution to binary tree image in page 318:
 * 	3, 1, +, 3, *, 9, 5, -, 2, +, /, 3, 7, 4, -, *, 6, +, -
 */

import java.util.*;

 public class ArithmeticApp{

 	public boolean operator(char c){
 		if(c == "+" || c == "-" || c == "*" || c == "/"){
 			return true;
 		}
 		else{
 			return false;
 		}
 	}

 	public void buildExpression(String expression){
 		Stack stack = new Stack();
 		for(int i = 0; i<expression.length(); i++){
 			if(operator(expression.charAt(i))) //If the character is a number or operator x

 				/*create a single-node binary tree temp whose root
 				 *stores x */

 				TNode temp = new TNode();
 				stack.push(temp);

 			/* On the other hand, if the character is a closed
 			 * parenthesis ")" */
 			else if(charAt(i) == ")")
 				//Pop the top three trees from the stack

 				Node temp = new TNode()

 				//Attach the trees for e1 and e2 as children for o

 				//Push the resulting tree back onto the stack

 		}

 		/*After the loop, return the top element of the stack which is the
 		 * final expression tree */ 


 		}

 	}

 	public static void main(String[] args){

 	}
 }