package Waqar;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab8_Objects {
	
	WebDriver driver=new ChromeDriver();	
	Lab8_Methods Object = new Lab8_Methods(driver);
	
	@BeforeTest (description="Step 0 : Starting Chrome")
	public void openChrome() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\4368\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver.get("https://trello.com/en/login");
		PropertyConfigurator.configure("log4j.properties");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void quitChrome() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void Lab8_Tasks() throws InterruptedException {
		
		Object.login();
		Object.CreateBoard();
		Object.CreateTwoLists();
		Object.Addcard();
		Object.Movecard();
		Object.EditCardName();
		Object.DeleteCard();
	}


}
