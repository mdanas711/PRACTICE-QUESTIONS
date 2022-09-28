package userInput;
import java.util.*;

public class BonusAmount {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the salary = ");
		float salary = sc.nextFloat();
		System.out.print("Enter year of service = ");
		int yearOfServ = sc.nextInt();
		float netAmt = 0.05f*salary;
		float totSalary = netAmt + salary;
		if (yearOfServ > 5) {
			System.out.println("Your net bonus amount = " +netAmt);
		}else {
			System.out.println("No bonus");
		}
		System.out.println("Your total salary is : " +totSalary);
	}

}
