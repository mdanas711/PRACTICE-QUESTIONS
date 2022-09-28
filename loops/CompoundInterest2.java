package loops;
import java.util.*;

public class CompoundInterest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the amount of value : ");
		float amt = sc.nextFloat();
		float rate = 0.08f;
		double limit = 3 * amt;
		int y = 0;
		while (amt  <=  limit) {
			y= y+1;
			amt = amt *(1+rate);
			
			System.out.println("Your amount is : " + amt);
		}
			System.out.println("Your amount " + y + " after become three times");
	}

}
