package week2.day3;

public class CarP {

	public void applyBrake() {
		System.out.println("brake is applied");
	}
	
	public void playMusic() {
		System.out.println("Play the music");
	}
	
	
	public void startCar() {
		System.out.println("Start the car");
	}
	
	public static void main(String[] args) {
		
		CarP  car = new CarP();
		car.applyBrake();
		car.playMusic();
		car.startCar();
		
	}
	
}
