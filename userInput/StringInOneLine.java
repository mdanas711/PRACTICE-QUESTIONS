//Take name, roll number and field of interest from user and print in the format below :
//Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
package userInput;
import java.util.*;
public class StringInOneLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name ");
		String a = sc.next();
		System.out.println("Enter The Roll no. ");
		int b = sc.nextInt();
		System.out.println("My field of interest in ");
		String c = sc.next();
		System.out.println("Hey, My name is " +a+" and my roll number is " +b+ " My field of interest in " +c );
		
	}

}
