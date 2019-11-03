package main.java.accessmofifiers;

public class PrivateModifier4Student { // top level classes cannot be private

	private String studentName; // private field. This can be accessed only inside the class were it's defined.
								// Classes inside this class can access this field too (in this example
								// InsideClass defined below)

	private PrivateModifier4Student() {} 	// private constructor. This constructor can be accessed only inside the class
									// were it's defined. Doing a constructor private as the consequence of making
									// this class non instantiable

	private int calcNumberOfBooks() { // private method. This can be accessed only inside the class were it's being
									// defined

		return 9;

	}

	private class InsideClass {} 	// Inside classes (class inside another class can be private) for more about
									// classes and types of classes see java classes

}
