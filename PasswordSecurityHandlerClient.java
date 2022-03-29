// "Client program" for parsing a password. We ask the user to enter a password. 
// We then instantiate a PasswordSecurityHandler object. We call the parse method, 
// passing the password entered by the user. After the password has been parsed, 
// we call the securityLevel method of the PasswordSecurityHandler class and output 
// the strength of the password.


import java.util.Scanner;

public class PasswordSecurityHandlerClient {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("A strong password has at least 8\n"
			+ "characters and contains at least one digit\n" + 
			"and one special character.");
	
	System.out.println("Enter a password >");
	String password = scan.next();
	
	PasswordSecurityHandler psh = new PasswordSecurityHandler();
	psh.parse(password);
	
	System.out.println(password + "'s security is " + psh.securityLevel());
	
	}

}
