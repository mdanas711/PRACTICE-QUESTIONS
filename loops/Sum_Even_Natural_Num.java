package loops;

import java.util.*;

public class Sum_Even_Natural_Num {

	public static void main(String[] args) {
		
		System.out.println("Enter the first N even natural number: ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int i;
			int s=0;
			for (i=1; i<=n; i++) {
			
					s = s+2*i;
				
			
			
			}
			System.out.println("Sum of first " +n+ " even natural number is:  " +s);
	}
}
