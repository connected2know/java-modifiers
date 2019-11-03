package main.java.accessmofifiers;

public class ProtectedModifier4Student { // a top level cannot be protected.

	protected String studentName; // protected field. This field can be accessed inside the class were it's
								  // defined, same package (main.java in this example) and by any other subclass
								  // of this class (Student in this example).

	protected ProtectedModifier4Student() {} 	// protected constructor. This means that this class can be instantiated inside
										// the same class, from any class in same package and from any subclass of this
										// class (Student in this example)

	protected int calcNumberOfBooks() { // protected method. This method can be accessed inside the class were it's
										// being defined, from any classes inside same package, and from any subclass of
										// this one (Student in this case)

		return 9;

	}

	protected class InsideClass {} 	// Nested protected class. This nested class is accessible from same super class
									// (Student in this case), any class in the same package, and from any subclass.
									// For more about classes and types of classes see java classes

}
