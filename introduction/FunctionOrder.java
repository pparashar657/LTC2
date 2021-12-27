package introduction;

public class FunctionOrder {

	public static void main(String[] args) {
		
		System.out.println("I am inside main");

		func1();
		
		System.out.println("I am exiting main");
		
	}

	private static void func1() {
		System.out.println("I am inside func1");

		func2();
		
		System.out.println("I am exiting func1");
		
	}
	
	
	private static void func2() {
		System.out.println("I am inside func2");

		func3();
		
		System.out.println("I am exiting func2");
		
	}
	
	private static void func3() {
		System.out.println("I am inside func3");
		
		System.out.println("Hello World");
		
		System.out.println("I am exiting func3");
		
	}
	
}
