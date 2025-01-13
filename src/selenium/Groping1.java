package selenium;

import org.testng.annotations.Test;

public class Groping1 {
@Test
	
	public void testmethod1() throws Exception {
	
	Thread.sleep(2000);
	
	System.out.println("This is test method from class 1 ");
		
		
	}
	

	
	@Test
	public void testmethod1_1() throws Exception {
		
		Thread.sleep(2000);
		System.out.println("This is test method from class 1_1 ");
		Thread.sleep(1000);
	}
	

}
