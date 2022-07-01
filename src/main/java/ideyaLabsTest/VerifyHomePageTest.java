package ideyaLabsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyHomePageTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		try {
			driver.findElement(By.id("email")).sendKeys("8686919506");
			
			driver.findElement(By.id("pass")).sendKeys("Rajkumar@1807");
		}
		catch (Exception e) {
			System.out.println("Exception while finding elements");
		}
		
		driver.findElement(By.id("u_0_9_Y5")).click();
		
		Thread.sleep(2000);
		String titleHome=driver.getTitle();
		
		if(titleHome.contains("Facebook"));
		{
			System.out.println("HomePage displayed, PASS");
		}
//		 {
//			System.out.println("HomePage Not Displayed, FAIL");
//		}
		
		
		driver.close();
		
	}
}
