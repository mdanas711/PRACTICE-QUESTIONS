package userInput;
import java.util.*;

public class AttendanceExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE TOTAL NO. OF CLASSES ATTENDED");
		float attend = sc.nextFloat();
		System.out.println("ENTER THE TOTAL NO. OF CLASSES HELD");
		float held = sc.nextFloat();
		float percentage = (attend/held) * 100;
		System.out.println("PERCENTAGE OF CLASS ATTENDED = " +percentage );
		if (percentage >= 75) {
			System.out.println("STUDENT IS ALLOWED TO SIT IN  THE EXAM");
		}else {
			System.out.println("STUDENT IS NOT ALLOWED TO SIT IN  THE EXAM");
		}
	}

}
