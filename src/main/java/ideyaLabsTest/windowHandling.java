package ideyaLabsTest;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("hp laptops");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		WebElement webele = driver.findElement(By.xpath("(//div[@class=\"_4rR01T\"])[1]"));
		String s1 = webele.getText();
		String name = s1.substring(0, 6);
		System.out.println(s1+"   "+name);
		
		webele.click();
		
		Thread.sleep(2000);
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String s:handles)
		{
			String str = driver.switchTo().window(s).getTitle();
			if(str.contains(name))
			{
				break;
			}
		}
		
//		driver.close();
		
	}
}
