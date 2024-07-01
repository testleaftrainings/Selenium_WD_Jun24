package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharFromString {

	
	public static void main(String[] args) {
		
		String companyName = "testleaf";
		
		char[] charArray = companyName.toCharArray();
		
		Set<Character> uniqueChar = new LinkedHashSet<Character>();
		Set<Character> duplicatedChar = new LinkedHashSet<Character>();
		
		for (char c : charArray) {
			if(uniqueChar.add(c)==false) {
				duplicatedChar.add(c);
			}
			
		}
		
		uniqueChar.removeAll(duplicatedChar);
		
		System.out.println(uniqueChar);
		
		
		
	}
	
}
