package selenium;

import org.testng.annotations.Test;

public class ClassFive {
	
	@Test(invocationCount = 4, threadPoolSize = 7)
	
	public void testmethod5() throws Exception
	{
		System.out.println("Output: This is test method 5");
		
		Thread.sleep(2000);
	}

}
