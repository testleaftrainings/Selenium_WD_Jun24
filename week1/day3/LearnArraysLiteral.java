package week1.day3;

import java.util.Arrays;

public class LearnArraysLiteral {

	
	public static void main(String[] args) {
		
		// syntax : datatype[] varibleName = {values with comma separation};
		
		long[] phno = {8925411174L, 8925411175L, 8925411176l, 8925411170l, 8925411180l};
		
		// To access values from an Array -> By using Index 
			// The Index values will be Starts from Zero(0)
		System.out.println(phno);
		
		System.out.println(phno[0]);
		
		System.out.println(phno[4]);
		
		int length = phno.length; // ctrl+2, L
		System.out.println("Array length is "+length);
		
		
		for (int i = 0; i < phno.length; i++) {
			System.out.println(phno[i]);
		}
		
		//To sort the Array
		
		Arrays.sort(phno);
		
		System.out.println("After sorting");
		
		for (int i = 0; i < phno.length; i++) {
			System.out.println(phno[i]);
		}
		
		
	}
	
}
