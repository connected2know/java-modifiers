package main.java.accessmofifiers;


class DefaulfModifier4Student {// top level classes can be default. This means that they are accessible is the
							// same package

	String studentName; // default field. This field can be accessed only inside the class or same
						// package were it's being defined (package main.java in this example).

	DefaulfModifier4Student() {} // default constructor. This constructor can be accessed only inside the class
						// were it,s defined and by classes inside the same package.

	int calcNumberOfBooks() { // default method. This method can be accessed only inside the class were it's
							// defined and by classes inside the same package

		return 9;

	}

	class InsideClass {}  // nested class (class inside another class) be default. These classes are
						  // accessible in any other class in the same package. For more about classes and
						  // types of classes see java classes

}
