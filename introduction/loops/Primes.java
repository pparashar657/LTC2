package introduction.loops;

import java.util.Scanner;

public class Primes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		
//		if(checkPrime(num)) {
//			System.out.println("The number is prime");
//		} else {
//			System.out.println("The number is not prime.");
//		}
		
//		boolean isPrime = true;
//		
//		for(int i = 2; i< num; i++) {
//			if(num % i == 0) {
//				isPrime = false;
//				break;
//			}
//		}
//		
//		if(isPrime) {
//			System.out.println("The number is prime");
//		} else {
//			System.out.println("The number is not prime.");
//		}
		
		//printNPrime(num);
		
		
		int count = 0;
		int curr = 2;
		
		while(count < num) {
			
			boolean isPrime = true;
			
			for(int i = 2; i< curr; i++) {
				if(curr % i == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println(curr);
				count++;
			}
			curr++;
		}
		
		
	}
	
	/*
	 * Checks If given number is prime or not
	 */
	
	static boolean checkPrime(int num) {
		for(int i = 2; i< num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	/*
	 * Print first n prime numbers.
	 */
	static void printNPrime(int n) {
		int count = 0;
		int curr = 2;
		
		while(count < n) {
			if(checkPrime(curr)) {
				System.out.println(curr);
				count++;
			}
			curr++;
		}
	}
}
