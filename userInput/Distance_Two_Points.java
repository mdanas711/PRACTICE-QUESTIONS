package userInput;

import java.util.*;

public class Distance_Two_Points {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value of x1 = ");
		int x1 =sc.nextInt();
		System.out.print("Enter the value of x2 = ");
		int x2 =sc.nextInt();
		System.out.print("Enter the value of y1 = ");
		int y1 =sc.nextInt();
		System.out.print("Enter the value of y2 = ");
		int y2 =sc.nextInt();
		float d1 = Math.abs(x1*x1 + x2*x2 - 2*x1*x2); //float d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		float d2 = Math.abs(y1*y1 + y2*y2 - 2*y1*y2);
		float d = d1 + d2;
		System.out.println("distance between two points is: " +Math.sqrt(d));
		
		
	}

}
