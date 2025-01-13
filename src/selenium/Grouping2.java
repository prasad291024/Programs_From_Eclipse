package selenium;

import org.testng.annotations.Test;

public class Grouping2 {

@Test
	
	public void testmethod2() throws Exception {
	
	Thread.sleep(2000);
	
	System.out.println("This is test method from class 2 ");
		
		
	}
	

	
	@Test
	public void testmethod2_1() throws Exception {
		
		Thread.sleep(2000);
		System.out.println("This is test method from class 2_1 ");
		
		Thread.sleep(1000);
	}
	
}
