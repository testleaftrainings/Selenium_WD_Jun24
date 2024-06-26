package week2.day3;

public class SmartPhone extends MobilePhones {// Child

	public void playGames() {
		System.out.println("Swap candy ");
		
	}
	
	
	public void makeCall() {
		System.out.println("Make a call to my Dad");
		
	}
	
	
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.sendMsg();
		sp.makeCall();
		sp.playGames();
		sp.playVideo();
		sp.takeSnap();
		String name  = "TestLeaf";
		
	}
	
}
