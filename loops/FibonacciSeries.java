package loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number of n value : ");
		int n = sc.nextInt();
		System.out.println("The series is: ");
		int a = 0;
		int b = 1;
		int i = 2;
		while (i<=n) {
			int temp = b;
			b = b + a;
			a = temp;
			i++;
			System.out.println(i);
		}
		
		System.out.println("Sum of the " + n+" is: " +b);

	}

}
