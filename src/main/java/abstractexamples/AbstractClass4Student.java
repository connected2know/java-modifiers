package main.java.abstractexamples;

abstract public class AbstractClass4Student { // using of abstract to indicate that this class cannot be instantiated

	protected String studentName; // fields cannot be abstract

	protected AbstractClass4Student() {} // constructors cannot be abstract

	abstract String nameBookDiscipline(); 	// abstract method. For being abstract, this method must be override by any
											// child class of Student class

	protected int calcNumberOfBooks() { // protected method. This method can be accessed inside the class were is
										// defined, from any classes inside same package and, from any subclass of this
										// one (Student in this example)

		return 9;

	}

	abstract protected class InnerClass {} // nested classes can be abstract too

}
