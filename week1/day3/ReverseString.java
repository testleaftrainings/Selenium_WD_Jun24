package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		
		String input  = "TestLeaf"; //Expected output as faeLtseT
		String output = "";
		//How to get the last character --> by using index
		// convert the String to array
		
		
		//Approach 1:
		/*char[] charArray = input.toCharArray();//{'T', 'e', 's', 't', 'L', 'e', 'a', 'f'}
		
		for (int i =charArray.length-1 ; i>=0 ; i--) {
//			System.out.print(charArray[i]);
			
			output = output +charArray[i]; //
			System.out.println(output);
			
		}
		*/
		
		
		//Approach 2:
/*		
		for (int i =input.length()-1; i>=0; i--) {
			output  = output + input.charAt(i);
			
		}
		System.out.println(output);
		*/
		
		
		//Approach 3:
		
		String[] split = input.split("");
		for (int i =split.length-1; i>=0; i--) {
			output  = output + split[i];
			
		}
		System.out.println(output);
	}
	
	
}
