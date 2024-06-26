package week2.day3;

public class StandardC extends RE350P{ // child or sub class

	
	public void startType() {
		System.out.println("Kick start only");
	}
	
	public static void main(String[] args) {
		StandardC standard = new StandardC();
		StandardC bike = new StandardC();
		standard.engineCapacity(); // Parent
		standard.startBike(); // grand parent
		standard.startType(); // child
		System.out.println(standard.fuelType);
		System.out.println(standard.noOfMirrors);
		System.out.println(standard.noOfWheels);
		standard.fuelType = "Petrol with Fuel injector";
		System.out.println(standard.fuelType+" by using standard object");
		System.out.println(bike.fuelType+" by using bike object");
		
	}
	
}
