package week1.day3;

public class IntegerPalindrome {

	
	public static void main(String[] args) {
		
		int input = 1231;
		int output = 0;
		
		for (int i = input; i > 0 ; i= i/10) {
			int rem = i%10;
			output = (output*10) + rem;
		}
		
		if(input==output) {
			System.out.println("The given input is "+input+" and the output is "+output+" so the number is palindrome");
		}else {
			System.out.println("The given input is "+input+" and the output is "+output+" so the number is not a palindrome");
		}
		
		
	}
	
		
		
	
}
