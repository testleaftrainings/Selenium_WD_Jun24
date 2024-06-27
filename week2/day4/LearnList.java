package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//syntax : Interface objectName  = new ImplementationClass();
		List<String> mentors = new ArrayList<String>();
		
		mentors.add("Gokul");
		mentors.add("Ragu");
		mentors.add("Dilip");
		mentors.add("vinoth");
		mentors.add("vineeth");
		mentors.add(1, "Aravind");
		mentors.add("Gokul");
		mentors.add("Gokul");
		mentors.remove(0);
		mentors.remove("Arun");
		
		
		System.out.println(mentors);
		
		List<String> coaches = new LinkedList<String>();
		coaches.add("Babu");
		coaches.add("Hari");
		coaches.add("Sudharsan");
		
		System.out.println(coaches);
		
		mentors.addAll(6, coaches);
		
//		mentors.clear();
		
		
		System.out.println(mentors);
		
		System.out.println(coaches.contains("Gokul"));
		
		System.out.println(mentors.size());
		
		Collections.sort(mentors);
		
		System.out.println(mentors);
		
		
		String[] array = (String[]) mentors.toArray();
		System.out.println(array[1]);
		System.out.println(mentors.get(1));
		
		List<Integer> numbers = new ArrayList<Integer>();
		
	}
	
}
