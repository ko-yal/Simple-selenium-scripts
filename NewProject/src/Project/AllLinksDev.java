package Project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//this code is to verify hyperlinks on dev env

public class AllLinksDev {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver-v0.16.1-win64");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "-----";
		String underConsTitle = "Under Construction:Test console";					
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);					

		driver.get(baseUrl);
		
		//WebElement login = driver.findElement(By.id("email"));
		//WebElement passwd = driver.findElement(By.)
    List<WebElement> linkElements = driver.findElements(By.tagName("a"));							
    String[] linkTexts = new String[linkElements.size()];							
		int	i = 0;					

		//extract the link texts of each link element		
		for (WebElement e : linkElements) {							
		linkTexts[i] = e.getText();							
		i++;			
    }		

		//test each link		
		for (String t : linkTexts) {							
		driver.findElement(By.linkText(t)).click();					
		if (driver.getTitle().equals(underConsTitle)) {							
            System.out.println("\"" + t + "\""								
            		+ " is under construction.");			
        } else {			
            System.out.println("\"" + t + "\""								
                    + " is working.");			
        }		
		driver.navigate().back();			
    }		
		driver.quit();			

	}

}
