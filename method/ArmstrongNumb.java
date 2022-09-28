package method;

import java.util.*;

public class ArmstrongNumb {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the vlaue of n");
		int n = sc.nextInt();
		
		System.out.println(armstrong(n));
		
	
	}
	
	public static boolean armstrong(int n) {

	int sum=0;
	int original = n;
	
	while(n>0) {
		int rem = n%10;
		n = n/10;
		sum = sum + rem*rem*rem;
		
	}
	
	return sum == original;
	}

}
