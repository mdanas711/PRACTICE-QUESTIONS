package loops;

import java.util.*;

public class CompundInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n i.e.. the years : ");
		int n = sc.nextInt();
		double principle = 100000.0;
		double rate = 0.08;

		for(int i = 1; i <= n; i++ ) {
			
			principle = principle *(1+rate);  //formula for comp. interest
			System.out.println("Your amount grows year by year: " +principle);
		}
	
	}

}
