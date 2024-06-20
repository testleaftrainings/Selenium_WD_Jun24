package week1.day3;

public class IsPrime {

	public static void main(String[] args) {
		
		// Logic to check the number is prime number or not.
				// prime number will be starts from 2  and it will be divisble by 1 and itself.
		
		int checkPrime = 11;
		boolean flag = false ;
		
		// Check the number is prime or not
		
		for (int i = 2; i <checkPrime; i++) {
			if(checkPrime%i==0) {
				flag = true; // if the number is not prime , flag will be change as false
				break; 
			}
		}
		
		if(flag==false) {
			System.out.println("The given number "+checkPrime+ " is prime number");
		}else {
			System.out.println("The given number "+checkPrime+ " is not a prime number");
		}
		
		
	}
	
}
