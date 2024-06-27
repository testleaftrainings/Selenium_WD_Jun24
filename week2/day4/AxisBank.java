package week2.day4;

public class AxisBank implements RBI {

	@Override
	public void kyc(String name, long aadharNumber, String dob, long accountNumber) {
		System.out.println("Know your customer");
		System.out.println("Name : "+ name);
		System.out.println("Aadhar Number : " + aadharNumber);
		System.out.println("Dob : "+ dob);
		System.out.println("Account number : "+ accountNumber);
		
	}

	@Override
	public void goldInterest() {
		System.out.println("Gold Interest rate : 7.48");
	}

	@Override
	public void creditCard() {
		System.out.println("Credit card is customer choice");	
	}
	
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.creditCard();
		ab.debitCard();
		ab.kyc("Gokul", 5746123495341798l, "02/09/1995", accountNumber);
		ab.goldInterest();
		System.out.println(ab.accountNumber);
	}

}
