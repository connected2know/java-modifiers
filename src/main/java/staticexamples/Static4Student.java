package main.java.staticexamples;

public class Static4Student {

	static {
		System.out.println("Test");
	} // 1 - static block

	static String studentName; // 2 - static field 

	public Static4Student() {} // constructors cannot be static

	public static int numberBooks() { // 3 - static method 

		return 9;

	}

	static class Grade {} // 4 - static nested class

}
