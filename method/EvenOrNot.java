package method;

import java.util.*;

public class EvenOrNot {

	public static void main(String[] args) {
		even();

	}
	
	public static int  even() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Not Even");
		}
		return n;
		
	}

}
