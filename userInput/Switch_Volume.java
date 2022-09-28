package userInput;

import java.util.*;

public class Switch_Volume {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value for volume:  1.Prism  2.Cylinder  3.Sphere  4.Pyramid  5.Parallelogram");
		int volume = sc.nextInt();

			switch(volume) {
			case 1:
				System.out.println("Enter the value of k: ");
				int k = sc.nextInt();
				System.out.println("Now enter the value of l: ");
				int l = sc.nextInt();
				float vp = k*l;
				System.out.println("Volume of Prism is: " +vp);
				break;
			case 2:
				System.out.println("Enter the value of f: ");
				int f = sc.nextInt();
				System.out.println("Now enter the value of radius i.e... j: ");
				float j = sc.nextFloat();
				float vc = 3.12f * f * j * j;
				System.out.println("Voluem of Cylinder is: " +vc);
				break;
			case 3:
				System.out.println("Enter the value of radius r1: ");
				float r1 = sc.nextFloat();
				float vs = (4 * 3.14f * r1 * r1)/3;
				System.out.println("Volume of Sphere is: " +vs);
				break;
			case 4:
				System.out.println("Enter the value of g: ");
				int g = sc.nextInt();
				System.out.println("Now enter the value of n: ");
				int n = sc.nextInt();
				float vlp = (g * n)/3;
				System.out.println("Volume of Pyramid is: " +vlp);
				break;
			default:
				System.out.println("invalid shape");
				}
			
			}

			
			
			
			
		

	

}
	

