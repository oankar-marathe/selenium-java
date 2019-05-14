package assignments;

public class areaCalculate {
	static double pi = 3.14159;

	public static double AreaOfCircle(int r) {
		double areaofcircle = pi * (r * r);
		return areaofcircle;
	}
	
	public static double AreaOfTriangle(int height, int base) {
		double areaoftriangle = (height * base) / 2;
		return areaoftriangle;
	}
	
	public static double AreaOfRectangle(int length, int width) {
		double areaofrectangle = length * width;
		return areaofrectangle;
	}
}
