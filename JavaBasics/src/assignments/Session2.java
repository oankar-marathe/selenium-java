package assignments;

public class Session2 {
	
	public static int AdditionOperation(int a, int b) {
		int add = a + b;
		System.out.println("Result of addition is:"+add);
		return add;
	}
		
	public static int SubtractionOperation(int a, int b) {
		int sub = a - b;
		System.out.println("Result of subtraction is:"+sub);
		return sub;
	}
	
	public static int MultiplicationOperation(int a, int b) {
		int mul = a * b;
		System.out.println("Result of multiplication is:"+mul);
		return mul;
	}
	
	public static double DivisionOperation(int a, int b) {
		double div =(double) a / (double)b;
		System.out.println("Result of division is:"+div);
		return div;
	}
	
	public static void AvgOfArray() {
		double avgval = 0;
		double [] newarr = new double[] {5.7,6.3,8,9.3,4.4,2.8};
		int arr_len = newarr.length;
		double sum = 0;
		
		for (int i=0; i<arr_len; i++) {
			sum = sum + newarr[i];
		}
		avgval = (double) sum / (double) arr_len;
		System.out.println("Average of given array is:"+avgval);
	}
	
	public static void SmallestAndLargestNumber() {
		int arr [] = {5,77,11,54,8,33,89,22,5,89};
		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++){
			if (arr[i] > max) {
				max = arr[i];
			}
			else if (arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println("Largest Number in a given array is:" + max);
		System.out.println("Smallest Number in a given array is:" + min);
	}
	
	public static int Factorial(int a) {
		int result = 1;
		for (int x = a; x >=1; x--) {
			result = result * x;
		}
		System.out.println("Factorial of the given no is:"+result);
		return result;
	}

	public static void main(String[] args) {
		AdditionOperation(5,7);
		SubtractionOperation(44,8);
		MultiplicationOperation(11,6);
		DivisionOperation(55,10);
		AvgOfArray();
		SmallestAndLargestNumber();
		Factorial(10);
	}
}
