package week1.day2;

public class Calculator {

	//What are the actions calculator -> add, sub, multiple, division
	
	// void is a keyword and it return nothing

	
	public void add(int a, float b) {
		System.out.println("This is from add method");
	float c = (a+b);
	System.out.println("The addition of given input is "+c);
	}
	
	public void subtract() {
		System.out.println("This is from subtract");
	}
	
	
	
	public void multiple() {
		System.out.println("This is from multiple");
	}
	
	public void division() {
		System.out.println("This is from division");
	}
	
	public static void main(String[] args) {
		System.out.println("This is from main method");
		//Syntax to create obj
			// Classname objectName = new ClassName();
		Calculator cal = new Calculator();
		cal.add(2, 3);
		cal.add(3, 40);
		cal.division();
		cal.subtract();
		cal.add(6, 7);
	}
		
}
