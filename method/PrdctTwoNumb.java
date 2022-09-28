package method;

import java.util.*;

public class PrdctTwoNumb {
	public static int product(int a, int b) {
		int product = a*b;
		return product;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		int product = product(a,b);
		System.out.println("Product of two numbers is: " +product);
	}

}
