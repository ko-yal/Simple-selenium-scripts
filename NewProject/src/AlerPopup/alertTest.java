package AlerPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//This code is to check the alert box message after clicking submit button
public class alertTest {

	public static void main(String[] args) throws Exception {

		System.setProperty(Util.arg0, Util.arg1);
		WebDriver driver = new FirefoxDriver();
		
		driver.get(Util.url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Thread.sleep(1000);
		String text = driver.switchTo().alert().getText();
		System.out.println("Alert error msg is: "+text);
		driver.switchTo().alert().dismiss();
		
		System.out.println("Popup closed");
		
		driver.close();
		
	}

}
