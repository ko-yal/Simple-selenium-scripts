package AlerPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//this code is to input the keyword in capital letters in search box
public class Capslock {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty(Util.arg0, Util.arg1);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get(Util.url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='search']/input")).sendKeys(Keys.SHIFT,"stackoverflow");
		

	}

}
