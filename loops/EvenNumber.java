package loops;
import java.util.*;

public class EvenNumber {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the value of n = ");
			int n = sc.nextInt();
			if(n%2==0) {
			for (int i=2;i<=n;i+=2) {
				System.out.println(n+i);
			}
		}else {
			System.out.println("It is not an even number");
		}	
		}

}
