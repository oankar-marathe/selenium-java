package javaBasics;

public class FibonaciSeries {
	public static void main(String[] args) {
		int [] ser = new int [10]; 
		ser[0] = 0;
		ser[1] = 1;
		
		for (int i=2;i<10;i++) {
			ser[i] = ser [i-1] + ser [i-2];
		}
		for (int a=0;a<ser.length;a++) {
			System.out.println(ser[a]);
		}
	}

}
