package week1.day2;

/**
 * score a marks more than 90 -> Playstation, marks is more than 80 --> watch
 * Score more than 70 --> Ice Cream  , Score more than 50 --> Chocolate, Less than 50 nothing.
 */
public class LearnIfElseLadder {
	
	
	public static void main(String[] args) {
		int score = 91;
		
		if(score>90) {
			System.out.println("Play station");
		}else if(score>80) {
			System.out.println("Watch");
		}else if(score>70) {
			System.out.println("Ice cream");
		}else if(score>50) {
			System.out.println("Chocolate");
		}else if(score<=50) {
			System.out.println("Nothing");
		}
		
	}
	
}
