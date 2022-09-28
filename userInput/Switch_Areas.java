package userInput;

import java.util.*;

public class Switch_Areas {

	public static void main(String[] args) {
		System.out.println("Enter the value for area: 1.circle  2.Triangle  3.Rectangle  4.Isosceles  5.Parallelogram");
		Scanner sc = new Scanner(System.in);
		int areas = sc.nextInt();
//		System.out.println("Enter the value for volume: ");
//		int volume = sc.nextInt();
//		System.out.println("Enter the value for perimeter: ");
//		int perimeter = sc.nextInt();
		switch(areas) {
		
		case 1:
			System.out.println("Enter the value of r: ");
			float r = sc.nextFloat();
			float ac = 3.14f * r;
			System.out.println("Area of Circle is : " +ac);
			break;
			
		case 2:
			System.out.println("Enter the value of a: ");
			float a = sc.nextFloat();
			System.out.println("Now enter the value of b: ");
			float b = sc.nextFloat();
			float at = a * b/2;
			System.out.println("Area of Traingle is: " +at);
			break;
			
		case 3:
			System.out.println("Enter the e value: ");
			float e = sc.nextFloat();
			System.out.println("Enter the c value: ");
			float c = sc.nextFloat();
			float ar = e * c;
			System.out.println("Area of rectangle is : " +ar);
			break;
			
		case 4:
			System.out.println("Enter the value of p: ");
			float p = sc.nextFloat();
			System.out.println("Now enter the value of q: ");
			float q = sc.nextFloat();
			float ait = p * q/2;
			System.out.println("Area of Isosceles Traingle is: " +ait);
			break;
			
		case 5:
			System.out.println("Enter the value of h: ");
			float h = sc.nextFloat();
			System.out.println("Now enter the value of b: ");
			float s = sc.nextFloat();
			float ap = h * s;
			System.out.println("Area of Parallelogram is: " +ap);
			break;
		default:
			System.out.println("Invalid Shape");
			
//		case 6:
//			switch(volume) {
//			case 7:
//				System.out.println("Enter the value of k: ");
//				int k = sc.nextInt();
//				System.out.println("Now enter the value of l: ");
//				int l = sc.nextInt();
//				float vp = k*l;
//				System.out.println("Volume of Prism is: " +vp);
//				break;
//			case 8:
//				System.out.println("Enter the value of f: ");
//				int f = sc.nextInt();
//				System.out.println("Now enter the value of radius i.e... j: ");
//				float j = sc.nextFloat();
//				float vc = 3.12f * f * j * j;
//				System.out.println("Voluem of Cylinder is: " +vc);
//				break;
//			case 9:
//				System.out.println("Enter the value of radius r1: ");
//				float r1 = sc.nextFloat();
//				float vs = (4 * 3.14f * r1 * r1)/3;
//				System.out.println("Volume of Sphere is: " +vs);
//				break;
//			case 10:
//				System.out.println("Enter the value of g: ");
//				int g = sc.nextInt();
//				System.out.println("Now enter the value of n: ");
//				int n = sc.nextInt();
//				float vlp = (g * n)/3;
//				System.out.println("Volume of Pyramid is: " +vlp);
//				break;
//			case 11:
////				System.out.println("Enter the case value for perimeters of shapes");
//				switch(perimeter) {
//				case 12:
//					System.out.println("Enter the value of radius i: ");
//					float i = sc.nextFloat();
//					float pc = 3.14f * 2 * i;
//					System.out.println("Perimeter of Circle is : " +pc);
//					break;
//				case 13:
//					
				
				}
			
			}

			
			
			
			
		

	

}
	

