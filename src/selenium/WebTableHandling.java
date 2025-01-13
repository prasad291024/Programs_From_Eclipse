package selenium;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement tablecheck = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[3]"));
		
		System.out.println("the value is : " +tablecheck.getText());
		
		
		List<WebElement> rowlist = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
		for (int i=2; i<=rowlist.size(); i++)
		{
			
				WebElement wb = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[1]"));
				
				if(wb.getText().equals("Island Trading"))
				{
					String country = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[3]")).getText();
					System.out.println(country);
				}
						
			}
			
		driver.close();
	}
	

}