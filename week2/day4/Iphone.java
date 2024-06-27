package week2.day4;

public abstract class Iphone implements SmartPhone { // Abstract class as partial abstrcation form 0 to 100%

	@Override
	public void makeCall() {
		System.out.println("Hey siri, Make a call .....");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("hey Gokul, you have a call");
	}

	@Override
	public void sendMsg() {
		System.out.println("Hey Siri send a message to ........");
	}

	@Override
	public void receiveMsg() {
		System.out.println("Hey Gokul you got message from ........");
	}

	@Override
	public void camera() {
		System.out.println("Take a picture of the person");		
	}

	@Override
	public void playMusic() {
		System.out.println("Hey siri, Play some music");
	}

	@Override
	public void playGames() {
		System.out.println("Swipe, match, relax");
	}

	@Override
	public void installApps() {
		System.out.println("Install app from App store");
	}

	@Override
	public void accessMail() {
		System.out.println("You got Mail");		
	}
	
	//Normal method from iphone class
	public void voiceAssistance() {
		System.out.println("Siri");
	}
	
	//Abstract method from iphone class
	public abstract void chargingPort();
	
	
	
	public static  void main(String[] args) {
//		Iphone ip = new Iphone(); // for abstract class also it is not possible to create a object 
	}
	
	public  abstract  void batteryCapacity() ;

}
