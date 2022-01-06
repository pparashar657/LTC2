package introduction.loops;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		
		//printNFibo2(n);
		
		printFiboUptoN(n);
		
		//int ans = findNthFibo(n);
		
		//System.out.println("The " + n +"th Fibonacci number = " + ans);

	}

	static void printNFibo(int n) {
		int first = 0;
		int second = 1;
		int third;
		while(n-- > 0) {
			System.out.print(second +" ");
			
			third = first + second;
			
			first = second;
			second = third;
		}
	}

	private static int findNthFibo(int n) {
		int first = 0;
		int second = 1;
		int third;
		while(n-- > 0) {
			third = first + second;
			
			first = second;
			second = third;
		}
		return first;
	}
	
	static void printNFibo2(int n) {
		
		int count = 0;
		
		int first = 0;
		int second = 1;
		int third;
		while(count < n) {
			System.out.print(second +" ");
			
			third = first + second;
			
			first = second;
			second = third;
			count++;
		}
	}
	
	static void printFiboUptoN(int num) {
		int first = 0;
		int second = 1;
		int third;
		while(second < num) {
			System.out.print(second +" ");
			
			third = first + second;
			
			first = second;
			second = third;
		}
	}
	
	
//	static boolean checkFibo(int num) {
//		
//	}
}
