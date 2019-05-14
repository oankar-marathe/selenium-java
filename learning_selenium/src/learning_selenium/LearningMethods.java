package learning_selenium;

public class LearningMethods {
	public static void main(String[] args) {
		calculator calc = new calculator();
		int sumval = calc.getSum(8, 6);
		System.out.println("The Sum is: "+sumval);
		
		System.out.println("The Subtraction is: "+calc.getSub(29, 7));
		System.out.println("The Multiplication is: "+calc.getMult(28, 4));
		System.out.println("The Division is: "+calc.getDiv(77, 7));
	}
}
