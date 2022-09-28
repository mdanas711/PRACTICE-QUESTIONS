package userInput;

import java.util.*;

public class AlphabetOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of a");
		char a = sc.next().charAt(0);
		if(a >= 'a' && a  <= 'z') { 
			System.out.println("Input start with an small alphabet");
		}else if(a >= 'A' && a  <= 'Z') {
			System.out.println("Input start with an capital alphabet");
		}
		
		else {
			System.out.println("Input is not start with an alphabet");
		}
	
		
	}

}
