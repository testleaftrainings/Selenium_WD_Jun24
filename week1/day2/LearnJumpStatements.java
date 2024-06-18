package week1.day2;

public class LearnJumpStatements {
// break and continue
	
	public static void main(String[] args) {
		// print even number from 1 to 20 
		
		for (int i = 1; i <= 20; i++) {
			// condition to check the number is odd ? and skip the number multiple of 3
			// i want to stop the execution if the number is 15
			
			if(i==15) {
				break;// break keyword is used to stop/terminate the entire iteration
			}
			
			
			if(i%2==1) {
				// Nested if condition
				if(i%3==0) {
					continue; // continue keyword is used to skip the current iteration	
					}
				
				System.out.println(i);	
			}
			
			
			
			
		}
	}
	
}
