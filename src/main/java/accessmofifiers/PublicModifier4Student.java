package main.java.accessmofifiers;

public class PublicModifier4Student { // top level classes can be public. This means that they are accessible
									  // everywhere

	public String studentName; // a public field can be accessed everywhere

	public PublicModifier4Student() {} 	// if a constructor is public and the class is non abstract, the class can be
										// instantiated everywhere

	public int calcNumberOfBooks() { // public methods can be accessed everywhere

		return 9;

	}

	public class InsideClass {} // nested classes that are public, can be accessed everywhere.

}
