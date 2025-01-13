package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        
        driver.manage().window().maximize();
        
        Thread.sleep(1000);
        
        WebElement button3 = driver.findElement(By.id("newWindowBtn"));
        
        button3.click();
  

	}

}
