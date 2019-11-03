package main.java.anotations;

@BehaviourAnnotation1
public class Anotation4Property {

	@BehaviourAnnotation2(id=1234, name="abc") 	// annotation applied to method level, defining a specific method level
								// behavior. This example of annotation takes some parameters
	public String getCityProperty() {

		return "New York";

	}

}
