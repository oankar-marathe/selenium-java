package assignments;

public class Session1 {
	
	public static void ArithmaticOperations() {
		int a = 155;
		int b = 25;
		int c = a - b;
		int d = a * b;
		double e =(double) a / (double)b;
		
		System.out.println("Result of subtraction of numbers "+a+" and "+b+" is "+c);
		System.out.println("Result of multiplication of numbers "+a+" and "+b+" is "+d);
		System.out.println("Result of division of numbers "+a+" and "+b+" is "+e);
		System.out.println("=============================================================");
	}
	
	public static void AreaQuestions() {
		double pi = 3.14159;
		int r = 5;
		int side = 6;
		int height = 7;
		int base = 6;
		double AreaOfCircle;
		double AreaOfSquare;
		double AreaOfTriangle;
		
		AreaOfCircle = pi * (r * r);
		System.out.println("Area of Circle is: "+AreaOfCircle);
		
		AreaOfSquare = (side * side);
		System.out.println("Area of Square is: "+AreaOfSquare);
		
		AreaOfTriangle = (height * base) / 2;
		System.out.println("Area of Triangle is: "+AreaOfTriangle);
	}
	
	public static void LoopQuestions() {
		//While loop
		int x = 0;
		System.out.println("=============================================================");
		System.out.println("Output of While loop");
		while (x <= 10) {
			System.out.println(x);
			x++;
		}
		
		//Do-While loop
		int y = 10;
		System.out.println("=============================================================");
		System.out.println("Output of Do While loop");
		do {
			System.out.println(y);
			y--;
		}
		while (y > 0);
		
		//Switch case example 1
		int number=10;   
		System.out.println("=============================================================");
	    System.out.println("Switch case example 1:");
	    switch(number) { 
	    case 10: System.out.println("10");
	    break;
	    case 20: System.out.println("20");  
	    break;
	    case 30: System.out.println("30");
	    break;
	    default:System.out.println("Not in 10, 20 or 30");
	    break;
	    }
	    
	    // Switch case example 2
	    String levelname;
	    int level = 2;
	    System.out.println("=============================================================");
	    System.out.println("Switch case example 2:");
	    switch (level) {
	    case 1: levelname = "Beginner";
	    break;
	    case 2: levelname = "Intermediate";
	    break;
	    case 3: levelname = "Expert";
	    break;
	    default: levelname = "Not Defined";
	    break;
	    }
	    System.out.println("Your Level is "+levelname);
	    		
    }
	
	public static void LotterySystem() {
		int number = 123;
		if (number == 123) {
			System.out.println("=============================================================");
			System.out.println("You have won 1 Lakh Rupees");
		} else if (number == 1234){
			System.out.println("=============================================================");
			System.out.println("You have won 10 Lakh Rupees");
		} else {
			System.out.println("=============================================================");
			System.out.println("Better Luck Next Time");			
		}
	}
	
	public static void main(String[] args) {
		ArithmaticOperations();
		AreaQuestions();
		LoopQuestions();
		LotterySystem();
	}

}
