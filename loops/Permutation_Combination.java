package loops;

import java.util.*;

public class Permutation_Combination {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		System.out.println("Enter the vlue of r: ");
		int r = sc.nextInt();
		int f1 = n;
		for(int i =n-1; i>=1; i--) {
			f1 = f1 * i;
		}
		int num;
		num = n - r;
		int f2 = num;
		for(int i = num-1; i>=1; i--) {
			f2 = f2 * i;
		}
		
		 int p = f1/f2;
		
		System.out.println("The permutation of P(n, r) = " +p);
	}
	

}
