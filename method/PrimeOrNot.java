package method;

import java.util.*;

public class PrimeOrNot {

	public static void main(String[] args) {
		prime();

	}
	
	public static void prime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int i;
		for(i = 2; i<= n; i++) 
			
			if (n%i==0) {
				break;
			}
			if(n ==i) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Not Prime");
			}

}
}