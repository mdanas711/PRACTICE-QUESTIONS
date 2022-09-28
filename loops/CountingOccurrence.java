package loops;

public class CountingOccurrence {

	public static void main(String[] args) {
		
		int n = 222223451;	
		int c = 0;
		while (n > 0) {
			int rem =  n % 10;
			if (rem == 2) {
				c++;
			}
			n = n / 10;
			
		}
		System.out.println(c);
	
	}

}
