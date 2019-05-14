package assignments;

public class areaDisplay {

	public static void main(String[] args) {
		areaCalculate areavalue = new areaCalculate();
		
		System.out.println("Area of Circle is: " +areavalue.AreaOfCircle(6));
		System.out.println("Area of Triangle is: "+areavalue.AreaOfTriangle(6, 9));
		System.out.println("Area of Rectangle is: "+areavalue.AreaOfRectangle(3, 5));
		}
	}
