package p_o_m_Waqar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import graphql.Assert;

public class All_Objects {
	
	WebDriver driver=new ChromeDriver();
	
	All_Methods Object = new All_Methods(driver);
	@Test
	public void TestCase1_1(String name) throws InterruptedException {
		driver.get("https://omayo.blogspot.in/");
		Object.setname("Waqar Anjum");
		
	}

}
