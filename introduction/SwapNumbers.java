package introduction;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("The number before swapping : ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// Logic
		
//		int temp = a;
//		a = b;
//		b = temp;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("The number after swapping : ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
	}

}
