package week2.day3;

public class BenzC extends CarP{ // Single level Inheritance

	public void changeGear() {
		System.out.println("Change the Gear");
	}
	
	public void increaseSpeed() {
		System.out.println("Increase the speed of the car");
	}
	
	public static void main(String[] args) {
		BenzC benz = new BenzC();
		benz.changeGear();
		benz.increaseSpeed();
		benz.playMusic();
		benz.startCar();
		benz.applyBrake();
		CarP car = new CarP();
		car.applyBrake();
	}
	
	
}
