package loops;
import java.util.*;

public class HCF {

	public static void main(String[] args) {
		    
		        Scanner sc = new Scanner(System.in);
		     
		        int dividend, divisor;
		        int remainder, hcf = 0;
		        
		        System.out.print("Enter the first number ");
		        dividend = sc.nextInt();
		        
		        System.out.print("Enter the second number ");
		        divisor = sc.nextInt();        
		        
		        do
			{
		            remainder = dividend % divisor;
		            
		            if(remainder == 0)
		            {
		                hcf = divisor;
		            }
			    else
		            {
		                dividend = divisor;
		                divisor = remainder;
			    }
		            
		        }while(remainder != 0);

		        System.out.println("HCF: " + hcf);
	}
	
}