package userInput;
import java.util.*; 
public class CheckUpperCaseAndLowerCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTRE THE CHARACTER : ");
		char cha = sc.next().charAt(0); // here charAt(0) means we dont have the charcrter function in user input so we use charAt in string for charcter
		
		if (cha >= 'A' && cha <= 'Z') {
			System.out.println("THE CHARACTER IS UPPER " +cha);
		}
		else {
			System.out.println("THE CHARACTER IS LOWER " +cha);
		} 

	}
}