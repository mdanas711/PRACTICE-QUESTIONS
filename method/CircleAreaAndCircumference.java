package method;

import java.util.*;

public class CircleAreaAndCircumference {

	public static void main(String[] args) {
		
		areaCircum();
		
	}

	
	public static void areaCircum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value radius: ");
		float radius1 = sc.nextFloat();
		
		float circumference = 2*3.14f*radius1;
		System.out.println("Circumference of the circle is: "+circumference);
		
		float area = 3.14f*radius1*radius1;
		System.out.print("Area of a circle is: "+area);
			
	}
}
