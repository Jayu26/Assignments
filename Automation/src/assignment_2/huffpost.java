package assignment_2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class huffpost {

@Test
	void method_1()
	
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:/Java-Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.huffingtonpost.in/");
		driver.manage().window().maximize();
        
        driver.get("http://www.huffingtonpost.in/tech/");
    
       /*// for single result
        * String title = driver.findElement(By.className("entry-headline")).getText();
        String author = driver.findElement(By.linkText("Ankhi Das")).getText();
        System.out.println("Title :" + title);
        System.out.println("Author:" + author);*/
    
        // to display titles for all the links present on the webpage
        List<WebElement> results = driver.findElements(By.xpath("//*[@class='entry-headline']"));

        for(WebElement e : results)
        {
            System.out.println(e.getText());
        }
        
        // to display the names of authors for all the links
        List<WebElement> authors = driver.findElements(By.xpath("//*[@class='apage__author']")); 
        
        for(WebElement e : authors)
        {
            System.out.println(e.getText());
            
        }
	}
}
