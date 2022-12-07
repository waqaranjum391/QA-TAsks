package quiz3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Lab7_HW {
	
	static Logger log = Logger.getLogger(Lab7_HW.class);
	
	WebDriver driver=new ChromeDriver();
	
	Lab7_HW1 Object = new Lab7_HW1(driver);
	
	@BeforeTest (description="Step 0 : Starting Chrome")
	public void openChrome() throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\4368\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject");
		log.info("Open browserstack");
		driver.manage().window().maximize();
		log.info("Maximize window size");
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void quitChrome() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(description="Do manager login and then add customer.")
	public void Testcase1() throws InterruptedException {
	
		Object.ManagerLogin();
	}
	@Test(description="Open Customers Account")
	public void Testcase2() throws InterruptedException {
	
		Object.ManagerLogin();
		Object.OpenCutomerAccount();
	}
	@Test(description="Open Customers Account")
	public void Testcase3() throws InterruptedException {
	
		Object.ManagerLogin();
		Object.OpenCutomerAccount();
		Object.GoToCustomerLogin();
	}

}
