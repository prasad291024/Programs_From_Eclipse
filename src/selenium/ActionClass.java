package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws Exception  {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

		
	        driver.get("C:/Users/prasa/Desktop/Testing%20Class%20Materials/Ignisyst%20training%20Academy/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
		
	     
		
	        Thread.sleep(1000);
	        
	        WebElement EnterEmail = driver.findElement(By.xpath("//input[@id='email']"));
	        
	        EnterEmail.sendKeys("kiran@gmail.com");
	        
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		

	        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
	        driver.findElement(By.xpath("//a[@href='users.html']")).click();
			
	        driver.findElement(By.xpath("//button[text()='Add User']")).click();
	        
	        Thread.sleep(1000);
	        
	        
	        Actions act = new Actions(driver);
	        
	      // WebElement  malexpath = driver.findElement(By.xpath("//input[@id='male']"));
	        
	       // act.contextClick(driver.findElement(By.xpath("//input[@name='gender' and @value='Male']"))).build().perform();
	        
	        act.moveToElement(driver.findElement(By.xpath("//label[text()='Username']"))).build().perform();
	        act.doubleClick().build().perform();
	        
	        Thread.sleep(1000);
	        
	        //act.keyDown(Keys.chord(Keys.CONTROL, 'V'));
	        
		driver.close();
	}

}
