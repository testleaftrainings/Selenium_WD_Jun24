package week2.day4;

public interface RBI { // interface --> blueprint/template of class
	// Till java 7 interface is 100% abstract --> What are the methods here declared all are unimplemented method

	long accountNumber = 643812349832l;
	// Unimplemented method --> method without body
	public void kyc(String name, long aadharNumber, String dob, long accountNumber );
	
	//implemented method --> method with body 
		// In interface --> implemented only possible from java 8 and only for default access modifier and static method
		// From Java 8 --> Interface is not 100% abstract.
	default void debitCard() {
		System.out.println("debit card is customer choice");
	}
	
	public static void ageRequired() {
		
	}
	
	public void goldInterest();
	
	
	public void creditCard();
	
	// In interface it is possible to create a main method , because main method is static method
	public static void main(String[] args) {
//		RBI rbi = new RBI(); // It  is not possible to create an object for interface
		System.out.println("This is from main method");
	}
	
}
