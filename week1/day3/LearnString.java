package week1.day3;

public class LearnString {

	
	public static void main(String[] args) {
		//Literal Declaration
		String name1 = "TestLeaf";
		String name2 = "TestLeaf";
		
		System.out.println(name1==name2);
		
		//Instantiation Declaration
		String name3 = new String("TestLeaf");
		String name4 = new String("Testleaf");
		
		System.out.println(name2==name3);
		
		System.out.println(name1+" "+name2+" "+name3+" "+ name4);
		
		
		//Methods in String 
		
		// To Get the length of the String --> length()
		int length1 = name1.length();
		int length3 = name3.length();
		System.out.println("The length of name1 is " +length1);
		System.out.println("The length of name3 is " +length3);
		
		//Comparing two string 
				// equals() --> It will check the string value in both variables with case sensitive
		System.out.println(name1.equals(name4));
				// equalsIgnoreCase() --> It will check the string value in both variables without case sensitive
		System.out.println(name1.equalsIgnoreCase(name4));
				// contains() --> it is used to check partiall char or char in the String with case sensitive
		System.out.println(name1.contains("Leaf"));
		System.out.println(name4.contains("Leaf"));
		
		// replace() --> it is used to replace the first resulting input/char/string
		
			String replace = name1.replace("eaf", "EEEEEEE");
			System.out.println(replace);
			
			String replaceFirst = name1.replaceFirst("e", "_");
			System.out.println(replaceFirst);
			
		// concat()
			String concat = name1.concat(" and Qeagle");
			System.out.println(concat);
			
			System.out.println(name1);
			
		// charAt() --> to access/get particular character by using index, and index starts from 0(Zero)
			char charAt = name1.charAt(7);
			System.out.println(charAt);
			
			// toCharArray() --> convert the String into char[] (charArray)
			char[] charArray = name1.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				System.out.println(charArray[i]);
			}
			System.out.println(charArray);
			
			System.out.println("---------------------------------------------");
			
			String name = "Welcome to TestLeaf";
			// split() -->  it is used to split the words by using given input
			String[] split = name.split("");
			for (int i = 0; i < split.length; i++) {
				System.out.println(split[i]);
			}
			
			// toLowerCase() --> change the entire text/String into lowercase
			
			String lowerCase = name.toLowerCase();
			System.out.println(lowerCase);
			// toUpperCase() --> change the entire text/String into uppercase
			String upperCase = name.toUpperCase();
			System.out.println(upperCase);
			
			
			
	}
	
}
