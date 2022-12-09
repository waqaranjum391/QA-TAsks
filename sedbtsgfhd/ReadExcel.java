package WxcelWorking;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ReadExcel {
	@Test(dataProvider="getdata",dataProviderClass=dataprovider.class)
	public void SuccessfulLogin(String name,String password) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		
		driver.findElement(By.id("login_field")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(password); 
		driver.findElement(By.name("commit")).click();
		Assert.assertEquals(driver.getTitle(), "GitHub");
		

	}
		
}
