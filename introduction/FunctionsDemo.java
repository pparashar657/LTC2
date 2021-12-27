package introduction;

public class FunctionsDemo {

	public static void main(String[] args) {
		
//		System.out.println("I am going to call a function");
//		
//		sayHello();
//		
//		sayHelloName("Pawan");
//		sayHelloName("Kuldeep");
//		
//		int sum = addTwo(10, 15);
//		
//		System.out.println("The sum is = " + sum);
//
//		System.out.println("I have called a fucntion");
		
		printDetails("Pawan", 12, "23-12-1998", 90.25);
		printDetails("Kuldeep", 13, "23-12-1998", 90.25);

	}
	
	static void sayHello() {
		System.out.println("Hello world");
	}
	
	static void sayHelloName(String name) {
		System.out.println("Helo " + name);
	}
	
	static int addTwo(int num1, int num2) {
		int ans = num1 + num2;
		return ans;
	}
	
	static void printDetails(String name, int rollNo, String dob, double perc) {
		System.out.println("======== STUDENT DETAILS =========");
		System.out.println("Name = " + name);
		System.out.println("Roll No = " + rollNo);
		System.out.println("Date of Birth = " + dob);
		System.out.println("Percentage = " + perc);
		System.out.println("================================");
	}

}
