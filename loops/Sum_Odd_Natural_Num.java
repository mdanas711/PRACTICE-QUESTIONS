package loops;

import java.util.*;

public class Sum_Odd_Natural_Num {

	public static void main(String[] args) {
		System.out.println("Enter the value of n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 0;
		for (int i = 1; i<=n; i++) {
				System.out.println(2*i-1);
				s = s + (2*i-1);
		}
		System.out.println("Sum of first " +n+ " natural number is: " +s);

	}

}
