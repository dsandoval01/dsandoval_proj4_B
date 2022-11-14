class ArithmeticTester{
	public static void main(String[] args){
		String postfix = "(3*5)/5";
		ArithmeticApp calc = new ArithmeticApp();

		calc.buildExpression(postfix);
		System.out.println(postfix);

	}
}