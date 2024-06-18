package week1.day2;

//shortcut to create a comment line ctrl + front slash  (to comment/
	
/*for 
multiple line 
comment line use ctrl + shift + front slash (/) 
for uncomment use ctrl + shift back slash (\)
*/
public class Restaurant {
	int price = 90;// globally variable/ class level Variable
	// Able to access global variable anywhere inside the class
	public int dosa(int quantity) {
		int price = 40;
		int totalAmount = price*quantity;
		return totalAmount;
	}
	
	public String idly(int quantity) {
		int price = 30;
		int totalAmout = price*quantity;
			
		return "The amount of idly price is "+totalAmout;
	}
	
	public void chappathi() {
		
		System.out.println("Not Available "+price);
	}
	
	
	
	public static void main(String[] args) {
	
		// Inside the main method ,
			//want to access variable or method create an object for class.
		
		int price = 50;
		Restaurant res = new Restaurant();
		System.out.println(res.price = 150);
		System.out.println(price);
		
		
//		int dosaPrice = res.dosa(3); //store as local variable --> cursor should at end of the line and press a key ctrl+2 and release both keys and press a key l(L)
//		System.out.println("The dosa price is "+dosaPrice);
		System.out.println(res.dosa(3));
		Restaurant me = new Restaurant();
		String idly = me.idly(2);
		System.out.println(idly);
		res.chappathi();
		me.chappathi();
		int dosa = me.dosa(4);
	}
	
}
