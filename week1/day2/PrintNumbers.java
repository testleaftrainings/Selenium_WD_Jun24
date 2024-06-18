package week1.day2;

public class PrintNumbers {

	public static void main(String[] args) {
		// Print number from 1 to 10
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		//print from 20 to 10
		for (int i = 20; i >=10; i--) {
			System.out.println(i);
		}
		
		System.out.println("=========================");
		
		//print only even number from 1 to 20
		int initalValue = 1;
		int endValue = 20;
		// print number from 1 to 20
		for (int i = initalValue; i <= endValue; i++) {
			// condition to check the number is even ?
			if(i%2==0) {
				System.out.println(i);	
			}
			
		}
		
		
	}
	
}
