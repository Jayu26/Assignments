package Google_Search;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;
import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

public class login
{
	
	
	public static void main(String[] args) 
	
	{	
		try {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\driver\\chromedriver.exe");
		
		Execution ref = new Execution();
		WebElement newDiscussionBtn = ref.login();
		ref.createNewDiscussion(newDiscussionBtn);
		//ref.enterDiscussion();
		//ref.deleteDiscussion();
		ref.Demographics();
		} catch (InterruptedException e) {
			System.out.println("Exception :: "+e.getMessage());
		
	} 
	
}
}
		class Execution
		{
			 WebDriver driver = new ChromeDriver();
			 WebDriverWait wait = null;
                  WebElement login()
                    {
        	          try {
						driver.manage().window().maximize();
						  driver.get("https://app-test.discuss.io");
						  driver.findElement(By.id("log")).sendKeys("jayashree.durge@afourtech.com");
						  driver.findElement(By.id("pwd")).sendKeys("jayu@testing");
						  driver.findElement(By.id("auth-exec")).click();
						  this.wait = new WebDriverWait(driver, 100);
						 WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class,'btn green')]")));
						 return btn;
					} catch (Exception e) {
						System.out.println("Exception"+ e.getMessage());
						return null;
					}
                     }
                  void createNewDiscussion(WebElement btn)
                     {
                	      btn.click();
                          WebElement element = this.wait.until(ExpectedConditions.elementToBeClickable(By.id("schedule-video")));
                          
						 /* driver.findElement(By.id("datepicker")).sendKeys(" ");
						  try {
							Thread.sleep(30000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						  driver.findElement(By.id("datepicker")).sendKeys("01/12/2017");*/
                          
						  driver.findElement(By.id("timepicker")).sendKeys("11:30pm");
						  element.click();
						  this.wait = new WebDriverWait(driver, 30);
						  WebElement meet = wait.until(ExpectedConditions.elementToBeClickable(By.id("discussion-status"))); //wait till scheduled meeting pop up is displayed - model pop up
					      driver.findElement(By.xpath("//*[@id='ajax-dynamic-modal']/div/div/div[3]/button[2]")).click(); //click on close to remove pop-up
                     }  
                  
                  void enterDiscussion() 
                  {
                	  //remove the last statement in the above method
                	  driver.findElement(By.id("discussion-join-exec")).click();
                  }
                  
					void deleteDiscussion()
					{
						/*//  driver.get("https://app-test.discuss.io/calendar");
						  try {
							Thread.sleep(50000);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						 // driver.findElement(By.xpath("//*[@id='calendar']/div/div/div/div[3]/div/div/div[6]/div[2]")).click();
						  driver.findElement(By.xpath("//*[@id='discussion-delete-button']")).click();
					      try {
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}*/
					      driver.findElement(By.id("deleteDiscussonConfirmation")).sendKeys("delete");
					      driver.findElement(By.id("deleteDiscussonConfirmed")).click();
					      try {
							Thread.sleep(50000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					  } 
					
					void Demographics() throws InterruptedException
					{
						Thread.sleep(5000);
						driver.findElement(By.xpath("//a[@href='/project/recruiter']")).click(); // find & click on Demographics link
						String windowHandle = driver.getWindowHandle();                // getting control of the existing tab 
						driver.findElement(By.id("inviteRespondent")).click();         // click on Recruit Process link i.e. open another tab
						Set<String> allWindows = driver.getWindowHandles();            // getting handles for both the windows
						allWindows.remove(windowHandle);                               // All windows (02) - 1st window handle (01) = only 2nd window  
						driver.switchTo().window((String)allWindows.toArray()[0]);     // control is shifted from 1st tab to 2nd tab by using array [0 1] 0 - 1st tab shifted to 1 - 2nd tab
						driver.findElement(By.id("read_tos")).click();                 // select check-box
						driver.findElement(By.id("exec-next")).click();                // click on Get Started
						driver.findElement(By.xpath("//*[@class='btn btn-lg btn-primary exec-pick']")); // picking time (only 1 available)
						driver.findElement(By.id("exec-pick-10379"));
						
					}
                  
         }
          



