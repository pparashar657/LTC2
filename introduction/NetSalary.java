package introduction;

import java.util.Scanner;

public class NetSalary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you basic salary: ");
		
		int basic = sc.nextInt();
		
		double hra = (12.0/100) * basic;
		double da = (7.0/100) * basic;
		double ta = (5.0/100) * basic;
		
		double bonus = 0;
		
		if(basic > 40000) {
			bonus = 10000;
		} else if(basic > 30000) {
			bonus = 7000;
		} else if (basic > 20000) {
			bonus = 5000;
		} else {
			bonus = 2000;
		}
		
		double totalSalary = basic + hra + da + ta + bonus;
		
		double pf = (11.0/100) * totalSalary;
		
		double taxableSalary = totalSalary - pf;
		
		double tax = (30.0/100) * (taxableSalary);
		// HOMEWORK: Find tax with actual tax slabs for India.
		
		
		
		
		
		
		
		
		
		
		double netSalary = taxableSalary - tax;
		
		System.out.println("The salaray break up is : ");
		System.out.println("-----------------------------");
		System.out.println("Basic Salary : " + basic);
		System.out.println("HRA : " + hra);
		System.out.println("DA : " + da);
		System.out.println("TA : " + ta);
		System.out.println("Bonus : " + bonus);
		System.out.println("Total Salary : " + totalSalary);
		System.out.println("-----------------------------");
		System.out.println("PF : " + pf);
		System.out.println("Tax : " + tax);
		System.out.println("-----------------------------");
		System.out.println("Net Salary : " + netSalary);
		

	}

}
