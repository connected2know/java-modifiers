package main.java.finalexamples;

public class Final4Student { // 1 - final top level class

	final String studentName = "Arthur"; // 2 - final field

	public Final4Student() {} // constructors cannot be final

	public final int numberBooks(final int numberB) { // 3 - method marked as final, containing a final parameter

		final int numberFixedBook = 2; // 4 - final local variable

		return numberB + numberFixedBook;

	}

	final class Grade {} // final nested class

}
