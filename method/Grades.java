package method;
import java.util.*;

public class Grades {

	public static void main(String[] args) {
		grade();
		
		
	}
		
	public static void grade() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE GRADES");
		int grades = sc.nextInt();
		if (grades >= 91 && grades <=100) {
			System.out.println("AA GRADE");
		}else if (grades >= 81 && grades <= 90  ) {
			System.out.println("AB GRADE");
		}else if (grades >= 71 && grades <= 80  ) {
			System.out.println("BB GRADE");
		}else if (grades >= 61 && grades <= 70  ) {
			System.out.println("BC GRADE");
		}else if (grades >= 51 && grades <= 60  ) {
			System.out.println("CD GRADE");
		}else if (grades >= 41 && grades <= 50  ) {
			System.out.println("DD GRADE");
		
		}	else{
			System.out.println("FAIL");
		}
		
	}
}
