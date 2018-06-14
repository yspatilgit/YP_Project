package eventLibraryFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSession extends Session implements BrowserMethods{
	
	
	@Override
	public void user_launches_browser(String strArg1, String strArg2) throws Throwable {
		
		if (strArg1.equalsIgnoreCase("IE")) {
			
			System.setProperty("webdriver.ie.driver", "C:/MyWorkspace/MyProject/driver/IEDriverServer.exe");
			Session.driver = new InternetExplorerDriver();
			Session.driver.manage().window().maximize();
			Session.driver.get(strArg2);
		}
		if (strArg1.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:/MyWorkspace/MyProject/driver/chromedriver.exe");
			Session.driver = new ChromeDriver();
			Session.driver.manage().window().maximize();
			Session.driver.get(strArg2);
		}
			
	}

	@Override
	public void user_enters_something_text_in_textbox_something(String strArg1, String strArg2) throws Throwable {			
		final String gXpath = "//*[contains(text(),"+"'"+strArg2+"'"+")]";	
		Session.element = Session.driver.findElement(By.xpath(gXpath));
		Session.element.sendKeys(strArg1);
		
	}


	@Override
	public void user_selects_something_from_dropdown_something(String strArg1, String strArg2) throws Throwable {
		final String gXpath = "";
		
	}


	@Override
	public void user_selects_something_radio_button_something(String strArg1, String strArg2) throws Throwable {
		
		
	}


	@Override
	public void user_check_something_checkbox_something(String strArg1, String strArg2) throws Throwable {
		
		
	}


	@Override
	public void user_click_something_button(String strArg1) throws Throwable {
		
		final String gXpath = "//button[contains(@value,"+"'"+strArg1+"'"+")]";	
		Session.element = Session.driver.findElement(By.xpath(gXpath));
		Session.element.click();	
	}


	@Override
	public void user_click_something_link(String strArg1) throws Throwable {
		
		
	}


	@Override
	public void user_click_something_image_link(String strArg1) throws Throwable {
		
		
	}


	@Override
	public void user_launch_page_successfully() throws Throwable {
		
		
	}


	@Override
	public void user_enters_text_something_and_something_for_something(String strArg1, String strArg2, String strArg3)
			throws Throwable {
		
		
	}

}
