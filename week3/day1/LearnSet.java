package week3.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.checkerframework.common.subtyping.qual.Unqualified;

public class LearnSet {

	public static void main(String[] args) {
		
		// Create a object for set by using implementation class
		
		Set<Integer> number1 = new HashSet<Integer>();
		// HashSet will display/sort the values by using Hashing Algorthim
		number1.add(1);
		number1.add(2);
		number1.add(1);
		number1.add(5);
		number1.add(7);
		number1.add(3);
		number1.add(17);
		number1.add(8);
		number1.add(11);
		
		System.out.println("HashSet"+number1);
		
		Set<Integer> number2 = new LinkedHashSet<Integer>();
		// LinkedHashSet will in Same order (It will not sort)
		number2.add(1);
		number2.add(2);
		number2.add(1);
		number2.add(5);
		number2.add(7);
		number2.add(3);
		number2.add(17);
		number2.add(8);
		number2.add(11);
		
		System.out.println("LinkedHashSet "+number2);
		
		Set<Integer> number3 = new TreeSet<Integer>();
		// HashSet will display/sort the values by using Ascii Order
		number3.add(1);
		number3.add(2);
		number3.add(1);
		number3.add(5);
		number3.add(7);
		number3.add(3);
		number3.add(17);
		number3.add(8);
		number3.add(11);
		
		System.out.println("TreeSet "+number3);
		 
		System.out.println(number1.contains(13));
		
		//To get a particular Value from Set --> convert the set into List
		
		List<Integer> num = new ArrayList<Integer>(number1);
		num.addAll(number3);
		
		System.out.println("ArrayList"+num);
		
		System.out.println(num.get(5));
		
		Set<Integer> uniqueNumber = new LinkedHashSet<Integer>(num); 
		
		System.out.println(uniqueNumber);
		
	}
	
}
