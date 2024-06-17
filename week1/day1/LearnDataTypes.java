package week1.day1;

public class LearnDataTypes {

	
	public static void main(String[] args) {
		// --> Comment line
		// To store value 
		//All the primitive Datatype starts with lowercase
		//syntax : dataType variableName = value;
		// Variable --> It is used to store a value based on Datatype
		
		//Whole Number / Integer
		 byte number = 127;// byte, short, int, long
		 short pinNumber = 1234;
		 int age = 28;
		 // By default long will be considered as int datatype, it is mentioned as long append l/L at the end of the value.
		 long phNo = 8925411174L;// end of the value append uppercase or lowercase l/L
		 
		 
		 // Decimal values / Float
		 
		 double pieValue = 3.1444444;
		 float usDollar = 84.39f;// By default for decimal value the datatype is double, To typecast/convert as float append f/F at the end of the value.
		 
		 // Boolean
		 boolean doYouKnowJava = true; // yes or no / true or false
		 
		 // Character
		 
		 char logo = 't';
		 char asciiValue = 65;
		 char attribute = '@';
		 
		 System.out.println("highest byte is "+number);// String Concatenation
		 System.out.println("My Mobile number is " + phNo);
		 
		 // Store sequence of characters 
		 String name = "Gokul";
		 System.out.println("My name is " +name);	// \n --> create a new line
		 System.out.println("pinNumber is "+pinNumber+" age is "+age +"\n US Dollar price is "+ usDollar);
	}
	
	
	
}
