package introduction.loops;

import java.util.Scanner;

public class MaxOfN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers?");
		int n = sc.nextInt();
		
		System.out.println("Enter the numbers: ");
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			int input = sc.nextInt();
			
			if (input > max) {
				max = input;
			}
		}
		
		System.out.println("The max is : " + max);
		
	}

}
