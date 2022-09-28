package loops;

import java.util.Scanner;

public class Average_N_Number {

	public static void main(String[] args) {
		 
					System.out.println("Enter the value of n: ");
					Scanner sc = new Scanner(System.in);
					 float n =sc.nextFloat();
					 int i;
					 float total = 0;
					 for ( i=1; i<=n;  i++) {
						 System.out.println("Enter the number: " +i);
						 int num = sc.nextInt();
						 total = num + total;
					 }
					 System.out.println(total/n);
			}
				
		}

	


