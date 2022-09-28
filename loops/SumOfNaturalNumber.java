package loops;
import java.util.*;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
//		for (int i=1; i<=10; i++) {
//			System.out.println(n*i);  /*table loop*/
//		}
		int sum = 1;
		for (int i=1; i<=n; i++) {
			sum = sum + i;
		}
			System.out.println(sum);
	}

}
