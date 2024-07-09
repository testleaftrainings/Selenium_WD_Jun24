package week4.day2;

import org.testng.annotations.Test;

public class LearnAttributes {

	//If methods have same propity it will execute based on ASCII order
	
	// a b c d e
	@Test(priority = 3)
	public void edit() {
		System.out.println("M3");
	}
	
	@Test(priority = 2 )
	public void duplicate() {
		System.out.println("M2");
	}
	
	
	
	@Test(priority = 4 , enabled = false)
	public void delete() {
		System.out.println("M4");
	}
	
	
	@Test(priority = 1 , invocationCount = 5, invocationTimeOut = 5000, threadPoolSize = 2)
	public void create() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("M1 ");
	}
	
	
	
}

