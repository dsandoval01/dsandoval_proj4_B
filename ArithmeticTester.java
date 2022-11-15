class ArithmeticTester{
	public static void main(String[] args){
		String postfix = "((3*5)/5)";
		ArithmeticApp calc = new ArithmeticApp();

		TNode r = calc.buildExpression(postfix);

		///calc.buildExpression(postOrder(postfix));
		calc.postOrder(r);

	}
}