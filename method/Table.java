package method;
import java.util.*;

public class Table {

	public static void main(String[] args) {
		
			printTable();
		

	}

	
	public static int printTable() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int i;
		int t=0;
		for(i =1; i<=10; i++) {
			 t = n*i;
			System.out.println(t);
			
		}
		return n;
		
	}
}
