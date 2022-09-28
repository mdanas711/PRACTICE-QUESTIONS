///Take side of a square from user and print area and perimeter of it.
package userInput;
import java.util.*;

public class AreaAndPerimeterOfSquare {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		int area = a * a;
		int perimeter = a * a * a * a;
		System.out.println("Area = " +area+" \nPerimeter = " +perimeter);
			

	}

}
