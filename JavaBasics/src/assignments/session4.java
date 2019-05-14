package assignments;

import java.util.Scanner;

public class session4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first string");
		String first_string = in.nextLine();
		
		System.out.println("Enter second string");
		String second_string = in.nextLine();
		
		String full_string = first_string + " " + second_string;
		System.out.print("New derived string is "+full_string);

	}

}
