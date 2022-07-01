package ideyaLabsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Childframe 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
				
		driver.switchTo().frame(frame1);
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		
		driver.switchTo().frame(frame2);
		
		WebElement childframetext = driver.findElement(By.xpath("//body/descendant::p[text()='Child Iframe']"));
		
		System.out.println(childframetext.getText());
		
		driver.close();
				
	}
}
