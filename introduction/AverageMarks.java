package introduction;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		
		int marks1, marks2, marks3;
		String sub1, sub2, sub3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the subject and marks details: ");
		
		sub1 = sc.next();
		marks1 = sc.nextInt();
		
		sub2 = sc.next();
		marks2 = sc.nextInt();
		
		sub3 = sc.next();
		marks3 = sc.nextInt();
		
		int total = marks1 + marks2 + marks3;
		
		float avg = total / 3;
		
		System.out.println("The total of " + sub1 +", "+ sub2 + " and " + sub3 +" is = " + total);
		System.out.println("The average of " + sub1 +", "+ sub2 + " and " + sub3 +" is = " + avg);
	}

}
