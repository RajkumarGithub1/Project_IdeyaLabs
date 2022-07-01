package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class movingCursor 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		WebElement src = driver.findElement(By.xpath("//div/descendant:: span[@tabindex='0']"));

		Actions ac=new Actions(driver);
		
		ac.dragAndDropBy(src, 250, 0).perform();
		
		
		
//		driver.close();
	}
}
