/**
*	Copyright 2012. Property of Goliath National Bank.
*
*/
public class User {
	String firstName;
	String lastName;

	public String accountNumber =	"1093-1029-4848-6666";
	public String personalNumber = 	"900720-1337";

	private double funds;

	/**
	*	Create a new user with default names.
	*/
	public User() {
		firstName = "Johan";
		lastName = "Brook";
		funds = 0.0;
	}

	/**
	* Set the new fund amount of this user.
	*
	* @param funds The new amount
	*/
	public void setFunds(double funds) {
		funds = funds;
	}

	public String toString() {
		return personalNumber;
	}

	/**
	* Helper method to encode a plain text string to a secure password.
	*
	* Important: Do not share this code with anyone outside the IT systems
	* group at Goliath National Bank. 
	*
	* @param clearTextPassword The plain text which should be encoded as password
	* @return The encrypted password
	*/
	public String secretOperationToEncodePassword(String clearTextPassword) {
		// Implement super secret algorithm here
	}

}