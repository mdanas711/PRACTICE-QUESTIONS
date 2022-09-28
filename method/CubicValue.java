package method;
import java.util.*;

public class CubicValue {
	public static int cube(int i) {
		int cube = i*i*i;
		return cube;
	}

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value for cubic: ");
			int cube = sc.nextInt();
			int i;
			for( i = 1; i<=cube; i++) {
				
				int cubic=cube(i);
				System.out.println("The cubic value of " +i + " is: "+cubic);
				
				
			}

	}

}
