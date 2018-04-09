package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//this code is for uploading a file using selenium script
public class UploadFile {

	public static void main(String[] args) {

		String baseUrl = "http://demo.guru99.com/selenium/upload/";
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver-v0.16.1-win64");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);
		System.out.println("Welcome");
		
		WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));
		
		uploadFile.sendKeys("C:\\Users\\a634969\\Desktop\buildpacks.txt");
		System.out.println("file ready to upload.");
		
		driver.findElement(By.id("terms")).click();
		System.out.println("Terms accepted");
		
		driver.findElement(By.id("submitbutton")).click();
		
		System.out.println("File uploaded!");
		
		driver.close();
	}

}
