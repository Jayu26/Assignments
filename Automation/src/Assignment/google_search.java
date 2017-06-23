package Assignment;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class google_search
{

	
@Test
	void assign()
	{
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:/Java-Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		
		// to get search result for Times of India
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.id("lst-ib"));
	    a.click();
	    a.sendKeys("Times of India");
	    
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println("Total count of links is : " + links.size());
	    
	  
		
	    // to check whether the links consist text "Times of India"
	    driver.getPageSource().contains("Times of India");
	    boolean isTheTextPresent = driver.getPageSource().contains("Times of India");
	    assertFalse(isTheTextPresent);
	    
	    Boolean ans = driver.findElements(By.tagName("a")).contains("Times of India");
	    
	    if (ans == true)
	    {
	    	System.out.println("All the links contains text Times of India");	    
	    }
	    else
	    {
	    	System.out.println("All the links does not contains text Times of India");
	    }
	    
	   // to check whether all the links are hyperlinks
		List<WebElement> allLinks = driver.findElements(By.partialLinkText("The Times of India"));
		
		for (WebElement e : allLinks) 
	    {
			if (e.getAttribute("href")!=null)
			{
				System.out.println("The link is Hyperlink.");
			}
			
			else
			{
				System.out.println("The link is not Hyperlink.");
			}
		}
	    
		
	}

}
