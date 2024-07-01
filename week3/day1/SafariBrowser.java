package week3.day1;

public class SafariBrowser extends Browser{

	String browserVersion = "76";
	String browserName = "Safari";
	
	
	public void updateBrowser(String browserVersion) {
		System.out.println("Local  "+browserVersion);
		System.out.println("Global "+this.browserVersion);
		this.openDevTool();
	}
	
	public  void openDevTool() {
		
	System.out.println(this.browserVersion);
		
	}
	
	
	
	public static void main(String[] args) {
	 
		
		SafariBrowser sb = new SafariBrowser();		 
		sb.updateBrowser("85");
		sb.navigate();
		
		
	}
	
	
	public void refresh(String name) {
		System.out.println("The refresh method from same class");
	}

	
	public static void clearCache() {
		System.out.println("Browser cache got cleared");
		
	}
	
	public void navigate() {
		System.out.println(browserVersion);
		System.out.println("Super class browser version -->"+super.browserVersion);
		System.out.println("Same class browser version -->"+this.browserVersion);
		
		super.refresh("Firefox");
	}
	
	
	
}
