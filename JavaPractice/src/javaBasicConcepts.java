
public class javaBasicConcepts {

	public static void main(String[] args) {
		String str1 = "Oankar";
//		String str2 = "";
//		StringBuilder str2 = new StringBuilder();
//		str2.append(str1);
//		str2 = str2.reverse();
//		System.out.println(str2);
		
		char arr[] = str1.toCharArray();  // converted to character array and printed in reverse order
        for(int i=str1.length()-1; i>=0; i--) {
        	System.out.print(arr[i]);
        	}
        }
	}
