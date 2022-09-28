package userInput;

import java.util.*;

public class Currency_Exchng {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the INR value: ");
			float inr = sc.nextFloat();
			float conv = inr * 0.013f;
//			float usd = ;
			System.out.println("Your converted value of INR TO USD: " +conv);
			

	}

}
