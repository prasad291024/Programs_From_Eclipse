package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
	    driver.get("https://rediff.com");
	    
	  
	    WebElement createaccountlinkElement = driver.findElement(By.linkText("Create Account"));
	    
	    createaccountlinkElement.click();
	    
	    WebElement fullNameClick = driver.findElement(By.xpath("//input[contains(@name, 'name')]"));
	    
	    fullNameClick.sendKeys("Charlie Chaplin");
	    
	    
	    WebElement rediffIDclick = driver.findElement(By.xpath("//input[contains(@name,'login') and (@maxlength='30')]"));
	    
	    rediffIDclick.sendKeys("charlie.chaplin");
	    
	    WebElement highlight = driver.findElement(By.xpath("//*[text()='Password']")); 
	    
	    highlight.sendKeys();
	 
	    Thread.sleep(2000);
	    
	    driver.navigate().to("https://www.facebook.com");
		
		WebElement emailclick = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));
		
		emailclick.sendKeys("chtgclan@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement passwardclick = driver.findElement(By.xpath("//input[@id='pass']"));
		
		passwardclick.sendKeys("Cht@12345");
		
		Thread.sleep(2000);
		
		WebElement loginclick = driver.findElement(By.xpath("//button[@value='1']"));
		
		loginclick.click();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
