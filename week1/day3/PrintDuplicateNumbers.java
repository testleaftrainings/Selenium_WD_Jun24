package week1.day3;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		
		int[] num  = {2,1,4,3,4,1,7,5,2, 7};
		
		int length = num.length;
		System.out.println(length);
		for (int i = 0; i < num.length-1; i++) {
			//nested for loop
			for (int j =i+1; j < num.length; j++) {
				
				//compare both index values are same
				if(num[i]==num[j]) {
					System.out.println(num[j]);
				}
				
			}
		}
		
		
		
	}
	
}
