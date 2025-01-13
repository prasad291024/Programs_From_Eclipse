package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		// open URL
		driver.get("https://www.rediff.com/");


		System.out.println("Clicked on Create New Account Button");

		// create account
		driver.findElement(By.xpath("//a[@title='Create Rediffmail Account']")).click();

		
		System.out.println("Current URL :" + driver.getCurrentUrl());


		System.out.println("Filing Form");

		driver.findElement(By.xpath("//input[contains(@name, 'name') and @type='text' and @xpath='1']")).sendKeys("check");
		
		Thread.sleep(1000);
		
		driver.close();

	}

}
