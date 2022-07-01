package ideyaLabsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/slider/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		WebElement element = driver.findElement(By.xpath("//div[@id='slider']/descendant::span[@style='left: 0%;']"));
		
		Actions ac=new Actions(driver);
		
		ac.dragAndDropBy(element, 200, 0).perform();
		
		driver.close();
		
	}
}
