package userInput;

import java.util.*;

public class Max_of_three_num {

	public static void main(String[] args) {
		Scanner sc=  new Scanner (System.in);
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();
		System.out.println("Enter the value of c: ");
		int c = sc.nextInt();
		if(a > b && a > c ) {
			System.out.println("a is greater");
		}else if (b > a && b > c) {
			System.out.println("b s greater");
		}
		else if (c > a && c > b) {
			System.out.println("c is greater");
		}else {
			System.out.println("All are equal");
		}

	}

}
