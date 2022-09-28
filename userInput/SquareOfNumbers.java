//Write a program to find square of a number.
//E.g.-
//INPUT : 2        OUTPUT : 4
//INPUT : 5        OUTPUT : 25

package userInput;
import java.util.*;
public class SquareOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int a = sc.nextInt();
		int b = a * a;
		System.out.println("Square of " +a+ " is " +b);

	}

}
