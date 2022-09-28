package patterns;

public class Floyds_Triangle {

	public static void main(String[] args) {
		int n =15;
		int m =1;
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(m + " ");
				m = m+1;
			}
			System.out.println();
		}

	}

}
