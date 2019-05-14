package assignments;

public class Session3 {
	
	public static void armstrongNumber() {
		int n=153;
	    int c=0,a,temp;
	    temp=n; 
	    while(n>0)  
	    {  
	    a=n%10;
	    n=n/10;
	    c=c+(a*a*a);  
	    }  
	    if(temp==c)  
	    System.out.println("armstrong number");   
	    else  
	        System.out.println("Not armstrong number"); 
	}
	
	public static void palindromeNumber() {
		int num = 1231;
		int reversed = 0;
		int temp = num;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if (temp == reversed) {
        	System.out.println("Number is palindrome");
        } else {
        	System.out.println("Number is not palindrome");
        }
	}
	
	public static void palindromeString() {
		String str = "oankar", rev = "";
		int length = str.length();
		 
		for ( int i = length - 1; i >= 0; i-- ) {
			rev = rev + str.charAt(i);
		}	 
		if (str.equals(rev)) {
			System.out.println(str+" is a palindrome");
		} else {
			System.out.println(str+" is not a palindrome");  
		}
    }
	
	public static void main(String[] args)  {    
//	    armstrongNumber();
//		palindromeNumber();
		palindromeString();
	}
}
