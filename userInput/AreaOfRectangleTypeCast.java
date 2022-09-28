//Ask user to give two double input for length and breadth of a rectangle 
//and print area type casted to int
package userInput;
import java.util.*;


public class AreaOfRectangleTypeCast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		double areaOfRec = l * b;
//		int myInt = (int)areaOfRec;
//		System.out.println("The Area Of Rectangle: " +myInt);
		System.out.println((int)areaOfRec);

	}

}
