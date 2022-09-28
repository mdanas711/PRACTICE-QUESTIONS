package loops;

import java.util.*;

public class Power_of_a_to_b {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value: ");
		int a = sc.nextInt();
		System.out.println("Enter the second value: ");
		int b = sc.nextInt();
		int res = 1;
		int i;
		for ( i=1; i<=b; i++) {
			res = res * a;
			  			 
			
		}
		System.out.println(res);

	}

}
