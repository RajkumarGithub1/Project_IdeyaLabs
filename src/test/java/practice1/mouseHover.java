package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseHover 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/tool-tips/");
		
		WebElement ele = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		
		Actions ac=new Actions(driver);
		
		Action ab = ac.moveToElement(ele).build();
		
		ab.perform();
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//div[@class='tooltip-inner']"));
		
		System.out.println(ele2.getText());
		
		
		
		
	}
}
