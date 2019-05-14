package javaBasics;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		int a = in.nextInt();
		
		System.out.println("Enter the value of b");
		int b = in.nextInt();
		
		int c = a + b;
		System.out.print("Calculated value of c is "+c);
	}

}
