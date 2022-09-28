package userInput;
import java.util.*;

public class Calculators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER = ");
		float a = sc.nextFloat();
		System.out.println("ENTER THE SECOND NUMBER = ");
		float b = sc.nextFloat();
		System.out.println("ENTER THE OPERATOR = ");
		int operators = sc.nextInt();
		switch(operators) {
		case 1 : System.out.println(a + b);
		break;
		case 2 : System.out.println(a - b);
		break;
		case 3 : System.out.println(a * b);
		break;
		case 4 :if(b==0) {
					System.out.println("INVALID NUMBER");
				}{
					System.out.println(a/b);
				}
					
		break;
		case 5 :if (b==0) {
					System.out.println("INVALID NUMBER");
				}else {
					System.out.println(a%b);
				}
		break;
		default : System.out.println("INVALID OPERATOR");
		
		}
		
	}

}
