package loops;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the n value: ");
		int n = sc.nextInt();
		int ans = 0;
		
		while (n > 0) {
			int r = n % 10;
			n = n / 10;
			ans = ans * 10 + r;
		}
		System.out.println();
			System.out.println("Your reverse number is : " +ans);
	}

}
