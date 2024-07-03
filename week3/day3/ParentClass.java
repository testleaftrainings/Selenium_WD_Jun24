package week3.day3;

public abstract class ParentClass {

	public ParentClass() {
		this(5);
		System.out.println("Default constructor from Parent Class");
	}
	
	public ParentClass(int a) {
		System.out.println("Input argument Constructor from Parent Class and the input is "+a);
	}
	
	public static void main(String[] args) {
//		ParentClass pc = new ParentClass();
	}
	
}
