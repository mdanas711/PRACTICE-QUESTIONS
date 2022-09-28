package patterns;

public class Hollow_Butterfly {

	public static void main(String[] args) {
		int n =4; 
		for(int i =1; i<=n; i++) {
			for(int j =1; j<=n-i; j++) {
				  System.out.println(" ");
				  if(i == 1 || i ==5) {
					  for(j =1; j<=n; j++) {
						  System.out.println("*");
					  }
				  }
//				  else 
//					  for()
			}
		}
	}

}
