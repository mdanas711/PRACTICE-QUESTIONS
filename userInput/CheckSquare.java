//Take values of length and breadth of a rectangle from user and check if it is square or not.
package userInput;
import java .util.*;

public class CheckSquare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length value = ");
		int l = sc.nextInt();
		System.out.println("Enter the breadth value = ");
		int b = sc.nextInt();
		
		if(l == b ) {
			System.out.println("It is a square ");
		}
		else {
			System.out.println("It is not a square");
		}

		
		
	}

}
