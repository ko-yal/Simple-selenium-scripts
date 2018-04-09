package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MultipleActions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver-v0.16.1-win64");
		WebDriver driver = new FirefoxDriver();
		String Baseurl = "https://console.sys.preprod.cfdev.canopy-cloud.com/#/login" ;
		driver.get(Baseurl);
		
		WebElement email = driver.findElement(By.id("email"));
		Actions builder = new Actions(driver);
		Action seriesUserName = builder.moveToElement(email)
							.click()
							.keyDown(email , Keys.SHIFT)
							.sendKeys(email , "hello")
							.keyUp(email, Keys.SHIFT)
							.doubleClick(email)
							.contextClick()
							.build();
		seriesUserName.perform();
		

	}

}
