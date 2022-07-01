package ideyaLabsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement element = driver.findElement(By.xpath("//form/descendant::input[@id='file-upload']"));
		
		element.sendKeys("C:\\Users\\DELL\\Desktop\\rajkumar-JS-resumeF.pdf");
		
		driver.findElement(By.id("file-submit")).click();
		
		driver.close();
		
	}
}
