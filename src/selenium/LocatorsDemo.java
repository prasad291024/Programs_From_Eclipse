package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com");
		
		String pagetitlString = driver.getTitle();
		System.out.println("Tht Title of Page is : " +pagetitlString);
		
		System.out.println("Current URL is: " + driver.getCurrentUrl());
		
		Thread.sleep(2000);
		

	    
	    WebElement findlinktext = driver.findElement(By.linkText("Forgotten password?"));

	    findlinktext.click();
	    
	    Thread.sleep(2000);
	    
	    driver.navigate().back();
	    
	    WebElement findpartiallinktext = driver.findElement(By.partialLinkText("Create a Page"));
		
	    findpartiallinktext.click();
	    
	    Thread.sleep(2000);
	    
	    driver.navigate().to("https://rediff.com");
	    
	   // WebElement queryname = driver.findElement(By.name("query"));
	    
	    //queryname.sendKeys("news");
	    
	    WebElement createaccountlinkElement = driver.findElement(By.linkText("Create Account"));
	    
	    createaccountlinkElement.click();
	    
	    //WebElement fullNameClick = driver.findElement(By.xpath(input[@name='name22ff21f7']));
	   // WebElement fullNameClick = driver.findElement(By.xpath("//input[@name contains,='name']"));
	    
	    WebElement fullNameClick = driver.findElement(By.xpath("//input[contains(@name, 'name')]"));


	    
	    fullNameClick.sendKeys("Charlie Chaplin");
	    
	    Thread.sleep(2000);
	    
		driver.quit();

	}

}
