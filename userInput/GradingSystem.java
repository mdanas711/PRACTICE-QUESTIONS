//A school has following rules for grading system:
//a. Below 25 - F
//b. 25 to 45 - E
//c. 45 to 50 - D
//d. 50 to 60 - C
//e. 60 to 80 - B
//f. Above 80 - A
//Ask user to enter marks and print the corresponding grade.
package userInput;
import java.util.*;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE GRADES");
		int grades = sc.nextInt();
		if (grades > 80) {
			System.out.println("A GRADE");
		}else if (grades >= 60 && grades <= 80  ) {
			System.out.println("B GRADE");
		}else if (grades >= 50 && grades <= 60  ) {
			System.out.println("C GRADE");
		}else if (grades >= 45 && grades <= 50  ) {
			System.out.println("D GRADE");
		}else if (grades >= 25 && grades <= 45  ) {
			System.out.println("E GRADE");
		}else   {
			System.out.println("FAIL");
		}

	}

}
