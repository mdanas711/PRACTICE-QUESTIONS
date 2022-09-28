package userInput;

import java.util.*;


public class Discount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		int n = sc.nextInt();
		System.out.println("Enter the discount prcentage: ");
		float d = sc.nextFloat();
		float disc = n * (d/100);
		System.out.println("Your discount: " +disc);
		float prize = n - disc;
		System.out.println("Your prize after the discount: " +prize);
		

	}

}
