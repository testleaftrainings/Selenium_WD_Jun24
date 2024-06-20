package week1.day3;

public class ConvertStringIntoInteger {

	
	public static void main(String[] args) {
		
		String input = "Rs: 999";
		// replaceAll() --> by using RegularExpression, ^--> represent not
			// [^a-zA-z] --> To get only String
			// [^0-9] --> To get only Numbers
		String replaceAll = input.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		// To Convert String into Integer
		int int1 = Integer.parseInt(replaceAll);
		System.out.println(int1);
	}
	
}
