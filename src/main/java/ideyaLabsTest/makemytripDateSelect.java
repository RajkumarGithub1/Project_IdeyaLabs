package ideyaLabsTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytripDateSelect 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/flights/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		
		driver.findElement(By.xpath("//div[@class=\"dateInnerCell\"]/descendant::p[text()='31']")).click();
		
		
		
		
	}
}
