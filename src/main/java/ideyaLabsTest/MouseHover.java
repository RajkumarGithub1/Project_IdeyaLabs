package ideyaLabsTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/tool-tips/");
		
		Thread.sleep(1000);
		
		WebElement element = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(element).perform();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement element2 = driver.findElement(By.xpath("//div[@class='tooltip-inner']"));
		
		System.out.println( element2.getText());
		
		driver.close();
		
		
		
	}
}
