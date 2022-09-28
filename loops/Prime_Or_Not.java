package loops;

import java.util.*;

public class Prime_Or_Not {

	public static void main(String[] args) {
		
		System.out.println("Enter the value of n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		for( i = 2; i<n; i++) 
			if(n%i == 0) {
			break;
			
			}if (i == n) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Not Prime");
			}
		}
			

	}


