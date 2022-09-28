package userInput;

import java.util.*;

public class Electricity_Bill {

	public static void main(String[] args) {
//		double bill;
		Scanner sc = new Scanner(System.in);
		System.out.println("NAME OF THE CONSUMER: ");
		String name = sc.next();
		System.out.println("UNITS COMSUMED BY COMSUMER: ");
		int units = sc.nextInt();
		double bill = 0;
		if(units <= 100 ) {
			bill = 2 * units;
		}
		else if (units > 100 && units <= 300) {
			bill = 3 * 100 + (units-100)*3;
		}
		else if (units > 300){
			bill = 2 * 100 + 3 * 200 +(units -300)*5;
		}
		System.out.println("Your total bill of electriciy is: " +bill);
	}

}
