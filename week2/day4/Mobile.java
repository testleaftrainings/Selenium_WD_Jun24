package week2.day4;

public interface Mobile {

	default void radio() {
		System.out.println("Play radio");
	}
	
	public void makeCall();
	
	public void receiveCall();
	
	public void sendMsg();
	
	public void receiveMsg();
	
	
	
}
