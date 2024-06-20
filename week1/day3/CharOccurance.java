package week1.day3;

public class CharOccurance {

	
	public static void main(String[] args) {
		
		String str = "Hello";
		int count = 0;
		
		//Convert the String into charArray
		char[] charArray = str.toCharArray();
		
		//Iterate the Array
		for (int i = 0; i < charArray.length; i++) {
			// Check the l occurance
			if(charArray[i]=='l') {
				++count; // It will increase the value of count, if the condition is satisfied
			}
			
		}
		
		System.out.println("The occurance of l is the "+str+" is "+count);
		
	}
	
}
