package week1.day3;

import java.util.Arrays;

public class LearnArrayInstantiation {

	
	public static void main(String[] args) {
		
		// Syntax : datatype [] variableName =new dataType[size];
		String[] names = new String[6];
		
		// To Assign value to the Array --> use index
		
		names[0] = "Gokul";
		names[1] = "Dilip";
		names[2] = "Aravind";
		names[3] = "Ragu";
		names[4] = "Vinoth";
		names[5] = "Vineeth";
		
		
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		Arrays.sort(names);
		
		System.out.println("After sort");
		
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
	}
	
}
