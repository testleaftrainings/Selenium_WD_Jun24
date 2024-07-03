package week3.day3;

public class LearnConstructor extends ParentClass {
	/**
	 * If there is no constructor is created for a class, compiler will create default constructor.
	 * If as a user we create either no input arguments / input argument Constructor, In that case compiler will not create a default constructor
	 * */
	
	
	int x = 7;
	String companyName = "TestLeaf";
	
	public void m1() {
		System.out.println("This is m1 method");
	}
	
	public LearnConstructor(String name) {
		super(10);
		System.out.println("This is constructor with input arguments and the input is "+name);
	}
	
	
	// To create a constract --> accessModifier ClassName (Input arguments){}
	
	public LearnConstructor() {
		this("Passing value from default constructor for chaining");
		
		System.out.println("This is constructor with no input arguments");
	}
	
	

	public static void main(String[] args) {
		
		LearnConstructor lc = new LearnConstructor();
		lc.m1();
		System.out.println(lc.x);
		System.out.println(lc.companyName);
		
		LearnConstructor ia = new LearnConstructor("Gokul");
		ia.m1();
		System.out.println(ia.companyName);
		System.out.println(ia.x);
	}
	
}
