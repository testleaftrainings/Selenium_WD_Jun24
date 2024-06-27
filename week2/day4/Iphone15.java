package week2.day4;

public class Iphone15 extends Iphone { // Execution class / concrete class

	
	public void chargingPort() {
		System.out.println("Its supports type -c charging port and wireless charging");
	}
	
	public void dynamicIsland() {
		System.out.println("Access notification, calls in island");
	}
	
	public static void main(String[] args) {
		// Created an object for the class
		Iphone15 ip = new Iphone15();
		ip.makeCall();
		ip.chargingPort();
		ip.playGames();
		ip.playMusic();
		ip.dynamicIsland();
		// Interface objectName = new Implementation class object ();
		// created object for interface by using implementation class
		SmartPhone p = new Iphone15();
//		p.dynamicIsland(); 
		
	}


	public void batteryCapacity() {
		System.out.println("Battery capacity is 3000mah");
	}

}
