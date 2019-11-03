package main.java.abstractexamples;

abstract class AbstractClass4Property {

	public String getCityProperty() { // only as example that, we can have methods and their implementation done in an
										// abstract class. Child classes will inherit this method behavior by behavior

		return "New York";

	}

	abstract String propertyTypeName(); // abstract method. This method must be override by any child class (in this
										// example of Student class)

	class Apartment extends AbstractClass4Property {

		@Override // java annotation used to indicate that we are doing an override of the parent
					// class abstract method.

		String propertyTypeName() {

			return "Apartment";

		}

	}

	class House extends AbstractClass4Property {

		@Override // java annotation used to indicate that we are doing an override of the parent
					// class abstract method.

		String propertyTypeName() {

			return "House";

		}

	}
}
