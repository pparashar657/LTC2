package introduction.loops;

import java.util.Scanner;

public class MaxAndSecondMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers?");
		int n = sc.nextInt();
		
		System.out.println("Enter the numbers: ");
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		while(n-- > 0) {
			int input = sc.nextInt();
			
			if(input > max) {
				secondMax = max;
				max = input;
			} else if (input > secondMax) {
				secondMax = input;
			}
		}
		
		System.out.println("The max is : " + max);
		System.out.println("The second max is : " + secondMax);
		

	}

}
