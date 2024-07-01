package week3.day1;

public class Browser {
	//Global Variable or non-static varible
	String browserVersion = "126.25";
	//static variable
	static String browserName = "Chrome";
	
	
	/**
	 * Usage of static keyword
	 * 	If the method or variable is declared as static by using static keyword
	 * 	It will be consider as single memory reference, So that it can be able to access in anywhere based on the acccessiblity(accessmodifier) without the help of object/objectReference.
	 * */
	
	
	/**
	 * static variable can be able access in both static method and non-static method directly.
	 * But non static variable can be able to access directly inside the  non-static method , not able to access directly in static method
	 * */
	
	//Normal method --> non static method
	public void refresh(String name) {
		System.out.println("Web page got reloaded");
//		System.out.println(browserVersion);
		browserVersion = name;
		browserName = name;
	}
	
	// static method
	public static void clearCache() {
		System.out.println("Browser cache got cleared");
		Browser b  = new Browser();
		System.out.println(b.browserVersion);
//		System.out.println(browserVersion); // Non static variable are not possible to call/invoke directly inside the static method
		System.out.println(browserName);
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(browserName);
//		clearCache();
		Browser safari = new Browser();
		safari.refresh("Safari");
		System.out.println("--------------For static varible -----------------");
		System.out.println("Browser name after calling refresh by using safari object ----> "+browserName);
		
		
		Browser edge = new Browser();
		edge.refresh("Microsoft Edge");
		System.out.println("Browser name after calling refresh by using edge object ----> "+browserName);
		
		
		System.out.println("-----------for non static variable---------------------");
		
		safari.refresh("86.72");
		System.out.println("Browser version after calling refresh() by using safari object -->> "+edge.browserVersion);
		
		
		
		
	}
	
	{
	System.out.println("This is non-static block");	
	}

	
	static {
		System.out.println("This is static block");
	}
}
