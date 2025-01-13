package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathDemo1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		try {

			driver.manage().deleteAllCookies();

			// Navigate to Rediff
			driver.get("https://rediff.com");

			driver.manage().window().maximize();

			WebDriverWait wait = new WebDriverWait(driver, 10);

			// Wait and click 'Create Account' link
			WebElement createaccountlinkElement = wait
					.until(ExpectedConditions.elementToBeClickable(By.linkText("Create Account")));
			createaccountlinkElement.click();

			// Enter Full Name
			WebElement fullNameClick = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name, 'name')]")));
			fullNameClick.sendKeys("Charlie Chaplin");

			// Enter Rediff ID
			WebElement rediffIDclick = driver
					.findElement(By.xpath("//input[contains(@name,'login') and (@maxlength='30')]"));
			rediffIDclick.sendKeys("charlie.chaplin");

			// Navigate to Facebook
			driver.navigate().to("https://www.facebook.com");

			// Enter email in Facebook login form
			WebElement emailclick = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
			emailclick.sendKeys("chtgclan@gmail.com");

			// Enter password in Facebook login form
			WebElement passwordclick = driver.findElement(By.xpath("//input[@id='pass']"));
			passwordclick.sendKeys("Cht@12345");

			// Click login button
			WebElement loginclick = driver.findElement(By.xpath("//button[@name='login']"));
			loginclick.click();

			Thread.sleep(5000);

			// locate and find what is placeholder
			String attributevalue = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("placeholder");

			// print the placeholder
			System.out.println("The placeholder value is : " + attributevalue);

			// locate and find what is tagname
			String tagname = driver.findElement(By.xpath("//input[@id='email']")).getTagName();

			// print the placeholder
			System.out.println("The tag name is : " + tagname);

			String uItext = driver.findElement(By.xpath("//div[text()='Log in to Facebook']")).getText();

			// print
			System.out.println("The text on UI is : " + uItext);

		} finally {
			// Ensure the driver quits
			driver.quit();
		}
	}

}
