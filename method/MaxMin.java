package method;
import java.util.Scanner;


public class MaxMin {

	public static void main(String[] args) {
		maxmin();

	}
	
	public static void maxmin() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter the vlue of b: ");
		int b = sc.nextInt();
		System.out.println("The maximun value of both number is:  "+Math.max(a,b));
	
	}

}
