package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//---------------------handling radio button-----------------------------------
public class RadioButton {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		Thread.sleep(1000);

		// find webelement of the button - create new account and stored it in the
		// variable CreateAccount
		WebElement CreateAccount = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));

		// clicked on create account button
		CreateAccount.click();

		// ----------------------1st way - by using click method -----------------------------------//
		Thread.sleep(1000);
		// find element of female button and click on it
		driver.findElement(By.xpath("//input[@id='sex'][@value=1]")).click();

		Thread.sleep(1000);
		// find element of male button and click on it
		driver.findElement(By.xpath("//input[@id='sex'][@value=2]")).click();

		Thread.sleep(1000);
		// find element of custom button and click on it
		WebElement customradio = driver.findElement(By.xpath("//input[@id='sex'][@value=-1]")); // to find one element
		customradio.click();
		

		//----------------------- 2nd way - by making list --------------------------------//
		Thread.sleep(1000);
		System.out.println("-----*****----- This is the second way -----*****-------");
		// find element of female button and click on it
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']")); // to find list of elements
		System.out.println("Total radio buttons: " + radios.size()); // find number of radio buttons here 
		//check properties 
		System.out.println("For Radio button 1:-  ");
		System.out.println(radios.get(0).isDisplayed()); // is it dislaying on webpage to user?
		System.out.println(radios.get(0).isEnabled()); // is it enabled? can user intract with it?
		System.out.println(radios.get(0).isSelected()); // Is it selected or not?  
		System.out.println("------------------------------");
		
		System.out.println("For Radio button 2:-  ");
		System.out.println(radios.get(1).isDisplayed());
		System.out.println(radios.get(1).isEnabled());
		System.out.println(radios.get(1).isSelected());
		System.out.println("------------------------------");
		
		System.out.println("For Radio button 3:-  ");
		System.out.println(radios.get(2).isDisplayed());
		System.out.println(radios.get(2).isEnabled());
		System.out.println(radios.get(2).isSelected());
		System.out.println("------------------------------");
		
		
		radios.get(0).click();
		Thread.sleep(1000);
		System.out.println("Clicked on button 1.  i.e. female ");
		System.out.println("After clicking on first female button, what is result now ");
		System.out.println("Is it displayed on webpage: -  " + radios.get(0).isDisplayed()); 
		System.out.println("Is it enabled on webpage: -  " +radios.get(0).isEnabled()); 
		System.out.println("Is it selected right now: -  " +radios.get(0).isSelected()); 
		
		
		
		driver.close(); // close the window 

	}

}
