package userInput;

import java.util.*;

public class LeapYearOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year =  sc.nextInt();
		if(year%400==0 || year%4 == 0) {
			System.out.println("The year is a leap year");}
			
		else if(year%100 != 0) {
			System.out.println("Not a leap year");}
			
//		else if (year%4 == 0) {
//			System.out.println("Leap year");
//		}
		else {
			System.out.println("Not leap year");
		}
	}

}
