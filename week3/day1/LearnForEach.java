package week3.day1;

import java.util.Set;
import java.util.TreeSet;

public class LearnForEach {

	
	public static void main(String[] args) {
		
		// for (intalization; condtion to stop the iteration; condition to increment or decrement)
		
		//To iterate all the values present in the Collection(Set,List) , Array --> forEach -->for (int i=0; i<variable.size(); i++)
		
		// Syntax forEach --> for(DataType/WrapperClass  localVaribale : varibaleWantToIterate)
		
		Set<String> names = new TreeSet<String>();
		names.add("Aravind");
		names.add("Ragu");
		names.add("Dilip");
		names.add("Vinoth");
		names.add("Vineeth");
		
		System.out.println(names);
		
		for(String mentorName : names) {
			if(mentorName.equals("Dilip")) {
				System.out.println("The name Dilip is present in Collection");
			}
		}
		
		
		
	}
	
}
