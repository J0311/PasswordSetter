// A specialized class that implements the StringHandler interface to parse 
// the string with a particular objective in mind. 
// A strong password must contain at least eight characters, at least one digit, 
// and at least one special character. A password containing fewer than six 
// characters is considered weak; otherwise, we consider that the password security 
// level is medium.


public class PasswordSecurityHandler implements StringHandler{
	
	private int length;
	private boolean digit;
	private boolean otherCharacter;
	
// Default constructor sets length to 0, digit and otherCharacter
// flags to false
	
	public PasswordSecurityHandler() {
		
		length = 0;
		digit = false;
		otherCharacter = false;
	}

// parameter is c character, process adds 1 to length
	
	@Override
	public void processLetter(char c) {
		length++;
		
	}

// parameter is c character, process adds 1 to length, sets digit 
// flag to true

	
	@Override
	public void processDigit(char c) {
		length++;
		digit = true;
		
	}

// parameter is c character, process adds 1 to length, sets 
// otherCharacter flag to true

	
	@Override
	public void processOther(char c) {
		length++;
		otherCharacter = true;
		
	}

// securityLevel method. Returns "weak" if password contains fewer
// than 6 characters
// Returns "strong" if password has at least 8 characters, at least 
// one digit, and at least one other character that is neither a letter
// nor a digit.
// Returns "medium" otherwise
	
	public String securityLevel() {
		if(length < 6) {
			return "weak";
			
		}
		
		else if(length >= 8 && otherCharacter) {
			return "strong";
			
		}
		
		else { 
			return "medium";
			
			}
		}
	}