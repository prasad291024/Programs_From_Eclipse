package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.msn.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		String pagetitlString = driver.getTitle();
		System.out.println("Tht Title of Page is : " +pagetitlString);
		
		
		System.out.println("Current URL is: " + driver.getCurrentUrl());
		
		//System.out.println("page Source : "+driver.getPageSource());
		
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(2000);
		
		driver.get("https://yahoo.com");
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.get("https://www.google.com");
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com");
		
	    WebElement findlinktext = driver.findElement(By.partialLinkText("Create a Page"));
		
	    
	    findlinktext.click();
	    
	    Thread.sleep(2000);
	    
		driver.quit();
		

	}

}
