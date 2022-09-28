package method;

import java.util.*;

public class VoteEligibility {

	public static void main(String[] args) {
		voteEligible();

	}
		
		public static void voteEligible() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the age: ");
			int age = sc.nextInt();
			if(age>=18) {
				System.out.println("Eligilbe");
			}
			else {
				System.out.println("Not Eligible");
			}
		}
}
