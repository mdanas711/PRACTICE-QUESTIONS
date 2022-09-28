package loops;

import java.util.*;

public class Floyd_Triangle {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=0; i<=n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" "+i+" ");
			}
//			System.out.println(i);
			System.out.println();
//			System.out.println(i);
		}
//		System.out.println(" ");
			
	}

}
