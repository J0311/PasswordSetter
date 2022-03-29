// We reuse the StringHandler interface. This application determines whether the String contains 
// only valid hexadecimal characters and calculates the decimal equivalent of the hex value represented 
// by the String.

// interface Validator specifies one abstract method to implement: isValid. We created the Validator interface 
// because determining whether a string is valid is a generic operation and not necessarily specific to parsing 
// a hexadecimal number. Thus, other classes can also implement the Validator interface.


@FunctionalInterface

public interface Validator {

// our ABSTRACT method to implement
	
	boolean isValid();


}
