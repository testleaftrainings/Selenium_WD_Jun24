package week2.day3;

public class Calculator {
// Overloading / Static polyMorphsim / compile time / early binding
//	--> In Same class inside  same method name with arguments is different(no of arguments, different types of datatypes)
	public void add() {
		System.out.println("This is add method");
	}
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(float a, float b) {
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		
		Calculator cal  = new Calculator();
		cal.add(5, 2);
		cal.add(1.2f, 2.2f);
		cal.add(2, 5.0f);
	}
	
}
