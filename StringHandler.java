// @author Joseph Walker

// Each application needs to process the characters of the String, 
// determining whether each character of the String is a digit, a letter, 
// or another character (neither a digit nor a letter). But each application 
// handles digits, letters, and other characters differently. We create an 
// interface, StringHandler, that allows the implementing class to define a 
// strategy for processing a String, one character at a time. 

// The StringHandler interface specifies three abstract methods, and a default 
// parse method that iterates through the String determining the type of each character, 
// and calling the appropriate method. Any class that implements the StringHandler 
// interface automatically inherits the parse method, and must implement the 
// processLetter, processDigit, and processOther methods.


public interface StringHandler {
	
// Here are our ABSTRACT methods to implement.
// Because these methods are ABSTRACT, we do not
// create a body - they are declared and terminated 
// w/semicolon
	
	void processLetter(char c);
	void processDigit(char c);
	void processOther(char c);
	
// Our DEFAULT parse method with parameter being String s
	
	default void parse(String s) {
		
// The parse method, takes the String to parse as a parameter and walks through the String, 
// a character at a time, determining the type of character, and calling the appropriate method 
// of our StringHandler interface.
		
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(Character.isDigit(c)) {
				processDigit(c);
				
			}
			
			else if(Character.isLetter(c)) {
				processLetter(c);
				
			}
			
			else {
				processOther(c);
				
// In order to determine whether a character is a digit or a letter, the parse method calls two static methods 
// of the Character wrapper class, isDigit and isLetter. Any class that implements the StringHandler interface 
// must provide fully implemented versions of the three abstract methods: processDigit, processLetter, and processOther. 
// Additionally, if the implementing class needs to process the String in a different order, perhaps from the last letter 
// to the first, that class can write its own version of the parse method that overrides the parse method in the interface.
				
			}
		}
	}

}
