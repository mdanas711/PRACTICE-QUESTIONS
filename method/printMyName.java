package method;

import java.util.Scanner;

public class printMyName {
	public static void printMyName(String name) {
		
		System.out.println(name);
		return;
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any name: ");
		String name = sc.next();
		printMyName(name);
	}

}
