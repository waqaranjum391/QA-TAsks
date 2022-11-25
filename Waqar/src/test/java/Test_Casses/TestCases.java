package Test_Casses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestCases 
{
	
@Test(priority=0)
public void Testcase1() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\4368\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://github.com/login");
	driver.findElement(By.id("login_field")).sendKeys("");
	driver.findElement(By.name("password")).sendKeys("");
	driver.findElement(By.name("commit")).click();
	Thread.sleep(2000);
	
	String actualTitle = driver.getTitle();
	String expectedTitle="GitHub";
	if(actualTitle.contentEquals(expectedTitle))
	{
		System.out.println("Login Succesful!");
	}
	else
	{
		System.out.println("Login Failed!");
	}
	Thread.sleep(2000);
	driver.quit();
	}

@Test(priority=1)	
public void Testcase2() throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\4368\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://github.com/login");
	driver.findElement(By.id("login_field")).sendKeys("waqaranjum391");
	driver.findElement(By.name("password")).sendKeys("sjfsvjff");
	driver.findElement(By.name("commit")).click();
	Thread.sleep(2000);
	
	String actualTitle = driver.getTitle();
	String expectedTitle="GitHub";
	if(actualTitle.contentEquals(expectedTitle))
	{
		System.out.println("Login Succesful!");
	}
	else
	{
		System.out.println("Login Failed!");
	}
	Thread.sleep(2000);
	driver.quit();
	}

@Test(priority=2)	
public void Testcase3() throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\4368\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://github.com/login");
	driver.findElement(By.id("login_field")).sendKeys("waqar(anjum)");
	driver.findElement(By.name("password")).sendKeys("abcdefg");
	driver.findElement(By.name("commit")).click();
	Thread.sleep(2000);
	
	String actualTitle = driver.getTitle();
	String expectedTitle="GitHub";
	if(actualTitle.contentEquals(expectedTitle))
	{
		System.out.println("Login Succesful!");
	}
	else
	{
		System.out.println("Login Failed!");
	}
	Thread.sleep(2000);
	driver.quit();
	}

@Test(priority=3)	
public void Testcase4() throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\4368\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://github.com/login");
	driver.findElement(By.id("login_field")).sendKeys("waqaranjum391");
	driver.findElement(By.name("password")).sendKeys("MyGitHub@1709");
	driver.findElement(By.name("commit")).click();
	Thread.sleep(2000);
	
	String actualTitle = driver.getTitle();
	String expectedTitle="GitHub";
	if(actualTitle.contentEquals(expectedTitle))
	{
		System.out.println("Login Succesful!");
	}
	else
	{
		System.out.println("Login Failed!");
	}
	Thread.sleep(2000);
	driver.quit();
	}

@Test(priority=4)
public void Testcase5() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\4368\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://github.com/login");
	driver.findElement(By.id("login_field")).sendKeys("waqaranjum391");
	driver.findElement(By.name("password")).sendKeys("MyGitHub@1709");
	driver.findElement(By.name("commit")).click();
	
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("teseract"+ Keys.ENTER);
	String actualTitle = driver.getTitle();
	String expectedTitle="Search · teseract";
	
	Assert.assertEquals(actualTitle, expectedTitle, "Search Failed");
	System.out.println("Search Succesful!");
	
	Thread.sleep(2000);
	driver.quit();
	}
	
}


