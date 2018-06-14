package TestJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractClasses {
	
	public static void main(String [] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "H://MyWorkspace/MyProject/driver/chromedriver.exe");
		
		WebDriver dr1 = new ChromeDriver();
		//dr1.manage().window().maximize();
		dr1.get("https://google.com");
		
		WebElement el1 = dr1.findElement(By.id("q"));
		el1.sendKeys("aksuba");
		el1.submit();
		
		
		
		
	}
		
}
