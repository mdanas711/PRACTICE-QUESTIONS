package loops;

import java.util.*;

public class Factor_Number {

	public static void main(String[] args) {
			System.out.println("Enter the value of num: ");
			Scanner sc = new Scanner (System.in);
			int num = sc.nextInt();
			System.out.println("The factors of " +num+ " are:  ");
			for(int i =1; i<=num; i++) {
				if(num%i==0) {
					
					System.out.print(" " +i);
				}
			}
			

	}

}
