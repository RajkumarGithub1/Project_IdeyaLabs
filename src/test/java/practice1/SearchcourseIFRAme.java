package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchcourseIFRAme 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://courses.letskodeit.com/practice");
				
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy(0,800)");
		
		WebElement frame = driver.findElement(By.id("courses-iframe"));
		driver.switchTo().frame(frame);
		WebElement frame1 = driver.findElement(By.xpath("(//div[@class=\"container\"])[2]"));
		Thread.sleep(2000);
		frame1.findElement(By.xpath("//div[@id='page']/descendant::form [@id='search']")).sendKeys("okay");
		
		
		
	}
}
