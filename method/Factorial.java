package method;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		factorial();

	}
	public static void factorial() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value n: ");
		int n = sc.nextInt();
		int fact = 1;
		for(int i =1; i<=n; i++) {
			fact = fact *i;
			
			System.out.println(i);
		}
		System.out.println(fact);
	}

}
