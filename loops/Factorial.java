package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		double n = sc.nextDouble();
		double a = 1;
		for (int i = 1; i <= n; i++) {
			a = a*i;
			System.out.println(i);
			
		}
		System.out.println(a);
	}

}
