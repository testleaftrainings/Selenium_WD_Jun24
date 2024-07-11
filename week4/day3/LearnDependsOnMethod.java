package week4.day3;

import org.testng.annotations.Test;

public class LearnDependsOnMethod {

	@Test(dependsOnMethods = {"week4.day2.LearnTestNGAnnotations.m1"})
	public void create() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Create lead");
	}
	
	@Test(dependsOnMethods = {"create"} , invocationTimeOut = 100)
	public void edit() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Edit Lead");
	}
	
	@Test(dependsOnMethods = {"merge","edit"} )
	public void delete() {
		System.out.println("Delete Lead");
	}
	
	@Test(dependsOnMethods = {"edit"}, alwaysRun = true)
	public void merge() {
		System.out.println("Merge Lead");
	}
	
	
	
}
