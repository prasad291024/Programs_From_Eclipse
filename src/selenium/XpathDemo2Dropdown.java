package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathDemo2Dropdown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		try {
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

			// Navigate to Rediff
			driver.get("https://rediff.com");

			WebDriverWait wait = new WebDriverWait(driver, 10);

			// Wait and click 'Create Account' link
			WebElement createAccountLinkElement = wait
					.until(ExpectedConditions.elementToBeClickable(By.linkText("Create Account")));
			createAccountLinkElement.click();

			// Wait for Full Name input to be visible and enter Full Name
			WebElement fullNameInput = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name, 'name')]")));
			fullNameInput.sendKeys("Charlie Chaplin");

			// Wait for Rediff ID input to be visible and enter Rediff ID
			WebElement rediffIDInput = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//input[contains(@name,'login') and (@maxlength='30')]")));
			rediffIDInput.sendKeys("charlie.chaplin");

			// Wait for the day dropdown to be visible
			WebElement dayDropdown = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='DOB_Day']")));

			// Create Select object and select by index, visible text, and value
			Select daySelect = new Select(dayDropdown);

			daySelect.selectByIndex(2);
			System.out.println("Selected index 2: " + daySelect.getFirstSelectedOption().getText());

			Thread.sleep(2000);

			daySelect.selectByVisibleText("3");
			System.out.println("Selected visible text 3: " + daySelect.getFirstSelectedOption().getText());

			Thread.sleep(2000);

			daySelect.selectByValue("5");
			System.out.println("Selected value 5: " + daySelect.getFirstSelectedOption().getText());

			Thread.sleep(2000);

		} finally {
			// Ensure the driver quits
			driver.quit();
		}
	}
}
