package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement ele = driver.findElement(By.id("file-upload"));
		
		ele.sendKeys("C:\\Users\\DELL\\Desktop\\rajkumar-JS-resumeF.pdf");
		
	}
}
