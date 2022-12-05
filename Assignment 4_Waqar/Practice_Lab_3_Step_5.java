package Practice_Lab_3;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Practice_Lab_3_Step_5 {
WebDriver driver=new ChromeDriver();
	
	@BeforeTest (description="Step 0 : Starting Chrome")
	public void openChrome() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\4368\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		driver.get("https://omayo.blogspot.in/");
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void quitChrome() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(description="Select Gender and handle alert")
	public void TestCase1() throws InterruptedException{
		driver.findElement(By.id("radio1")).click();
		driver.findElement(By.id("alert1")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
	
	@Test(description="Select color blue and deselect orange")
	public void TestCase2() throws InterruptedException{
		WebElement OrangeCB = driver.findElement(By.id("checkbox1"));
		WebElement BlueCB = driver.findElement(By.id("checkbox2"));
		
		do 
		{
			OrangeCB.click();
		}
		while(OrangeCB.isSelected());
		Thread.sleep(3000);
		
		if(BlueCB.isSelected()) {
			
		}
		else {
			BlueCB.click();
		}
		Thread.sleep(3000);
		
		assertTrue(BlueCB.isSelected());
		
	}
	
	@Test(description="ReadThisText from text box")
	public void TestCase3() throws InterruptedException{
		String getText =  driver.findElement(By.id("rotb")).getAttribute("value");
		assertEquals(getText,"ReadThisText");
		Thread.sleep(3000);
	}
	
	@Test(description="Click on GetPrompt then click on getConfirmation")
	public void TestCase4() throws InterruptedException{
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		assertEquals(driver.getTitle(), "omayo (QAFox.com)");
		Thread.sleep(2000);
	}
	
	@Test(description="Fill Boxes and Select car")
	public void TaskCase5() throws InterruptedException {
		WebElement fillBox1 =driver.findElement(By.className("classone"));
		fillBox1.sendKeys("Box 1 Data");
		Thread.sleep(3000);
		assertNotNull(fillBox1);
		
		WebElement fillBox2 =driver.findElement(By.xpath("(//*[@class='classone'])[2]"));
		fillBox1.sendKeys("Box 2 Data");
		Thread.sleep(3000);
		assertNotNull(fillBox2);
		
		WebElement car = driver.findElement(By.xpath("//input[@value='Car']"));
		car.click();
		assertTrue(car.isEnabled());
	}
	
	@Test(description="Select bag and book deselect book")
	public void TestCase6() throws InterruptedException{
				
		WebElement bag = driver.findElement(By.xpath("//input[@value='Bag']"));
		
		if(bag.isSelected()) {
			
		}
		else {
			bag.click();
		}
		Thread.sleep(3000);
		
		WebElement book = driver.findElement(By.xpath("//input[@value='Book']"));
			
		if(book.isSelected()) {
			
		}
		else {
			book.click();
		}
		Thread.sleep(3000);
		
		do 
		{
			book.click();
		}
		while(book.isSelected());
		Thread.sleep(2000);
		
		assertTrue(bag.isSelected());
	}
	
	@Test(description="click on the green dropdown button and select one option")
	public void TaskCase7() throws InterruptedException {
		
		WebElement greenButton = driver.findElement(By.xpath("//button[@class='dropbtn']")); 
		greenButton.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Gmail']"))).isDisplayed();
		
		WebElement gmailOption=driver.findElement(By.xpath("//a[text()='Gmail']"));
		gmailOption.click();
		
		assertEquals(driver.getTitle(), "gmail.com");
		
	}
	
	

}
