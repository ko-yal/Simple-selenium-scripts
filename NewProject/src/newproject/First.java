package newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//this is my first sample selenium script

public class First {
	public static void main(String args[]) 
	{
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver-v0.16.1-win64");
		WebDriver driver = new FirefoxDriver();
		String Baseurl = "https://canopy-cf.slack.com/messages/C0LPQN0M9/";
		
		driver.get(Baseurl);
		String actualTitle = driver.getTitle();
		System.out.println("Title is:" +driver.getTitle());
		
		String expectedTitle = "Slack";
		System.out.println("Expected Title is : Slack");
		
		if(expectedTitle.contentEquals(actualTitle)){
			System.out.println("Test passed");
		}
		else{
			System.out.println("Test Failed");
		}
		
		driver.close();
		System.exit(0);
	}

}
