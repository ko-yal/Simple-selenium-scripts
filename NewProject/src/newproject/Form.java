package newproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//this is a sample form
public class Form {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver-v0.16.1-win64");
		WebDriver driver = new FirefoxDriver();
		
		// Put an Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String baseUrl = "http://demo.guru99.com/selenium/webform/login.html";

		driver.get(baseUrl);

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("K@yopmail.com");

		WebElement passwd = driver.findElement(By.id("passwd"));
		passwd.sendKeys("komal@123");

		System.out.println("email and password set");

		driver.findElement(By.id("SubmitLogin")).submit();
		System.out.println("Login done!");

		driver.get("http://demo.guru99.com/selenium/webform/radio.html");

		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		radio1.click();
		System.out.println("Radio button 1 is selected!");

		WebElement box1 = driver.findElement(By.id("vfb-6-0"));
		box1.click(); //Selected
		//box1.click(); //De-Selected

		System.out.println("The State of checkbox1 is :"+box1.isSelected());
		
		//dropdown
		
		driver.get("http://demo.guru99.com/selenium/newtours/register.php");
		
		Select country = new Select(driver.findElement(By.name("country")));
		/*country.selectByVisibleText("INDIA");
		System.out.println("Selected country is: INDIA");*/
		//country.selectByIndex(10);
		country.selectByValue("INDIA");
		System.out.println("state of country dropdown : " +country.isMultiple() ); //to check whether the SELECT element support multiple selecting options

		//dropdown selecting multiple values
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		System.out.println("State of fruit dropdown : "+fruits.isMultiple());
		
		driver.close();


	}

}
