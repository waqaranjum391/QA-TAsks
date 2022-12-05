package p_o_m_Waqar;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import graphql.Assert;
public class AllMethods {
	
WebDriver driver;
	
	
	@FindBy(how=How.XPATH,using="//textarea[@id='ta1']")
	WebElement entername;
	
	
	
	@FindBy(xpath="//textarea[@rows=10 and @cols=30]")
	WebElement description;
	
	
	
	@FindBy(xpath="//form[contains(text(),'Username: ')]//child::input[@type='text']")
	WebElement username;
	
	@FindBy(xpath="//form[contains(text(),'Username: ')]//child::input[@type='password']")
	WebElement password;

	@FindBy(xpath="//form[contains(text(),'Username: ')]//child::input[@type='password']")
	WebElement login;
	
	@FindBy(xpath="//*[@id='table1']")
	WebElement table;
	
	@FindBy(xpath="//iframe[@id='iframe1']")
	WebElement frame1;
	
	@FindBy(xpath="//iframe[@id='iframe2']")
	WebElement frame2;
	
	
	@FindBy(xpath="//input[@type='text' and @name='userid' ]")
	WebElement username1;
	
	@FindBy(xpath="//input[@type='password' and @name='pswrd' ]")
	WebElement pasword2;
	
	@FindBy(xpath="//input[@type='button' and @value='Login' ]")
	WebElement login2;
	
	
	@FindBy(xpath="//option[@value='Hyundaix']")
	WebElement Hundaix;
	
	@FindBy(xpath="//select[@id='drop1']")
	WebElement dropdown;
	
	@FindBy(xpath="//input[@name='fname']")
	WebElement clearandwrite;
	
	@FindBy(xpath="//button[@id='but2']")
	WebElement clicikonEB;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement clicikonSB;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement clicikonLB;
	
	@FindBy(xpath="//button[text()='Register']")
	WebElement clicikonRG;
	
	@FindBy(xpath="//input[@id='alert2']")
	WebElement Disapertext;
	
	@FindBy(xpath="//button[text()='Try it']")
	WebElement tryit;
	
	@FindBy(xpath="//button[text()=' Double click Here   ']")
	WebElement doubleclick;
	
	@FindBy(xpath="//button[text()='Check this']")
	WebElement checkthis;
	
	@FindBy(xpath="//a[text()='Open a popup window']")
	WebElement popupbutton;
	
	@FindBy(xpath="//input[@id='dte']")
	WebElement enablebox;
	
	@FindBy(xpath="//body")
	WebElement fullbody;
	
	@FindBy(xpath="//input[@id='radio1']")
	WebElement radiobutton;
	
	@FindBy(xpath="//input[@id='alert1']")
	WebElement alerthandle;
	
	@FindBy(xpath="//input[@id='checkbox2']")
	WebElement selectbluecolor;
	
	@FindBy(xpath="//input[@id='checkbox1']")
	WebElement deselectorange;
	
	@FindBy(xpath="//input[@id='rotb']")
	WebElement readtext;
	
	@FindBy(xpath="//input[@id='prompt']")
	WebElement getpromt;
	
	@FindBy(xpath="//input[@id='confirm']")
	WebElement getconfirmation;
	
	@FindBy(xpath="//div[@id='HTML24']/child::div/input[@class='classone']")
	WebElement firstbox;
	
	@FindBy(xpath="//div[@id='HTML28']/child::div/input[@class='classone']")
	WebElement secondbox;
	
	@FindBy(xpath="//input[@value='Car']")
	WebElement clickcar;
	
	@FindBy(xpath="//input[@value='Book']")
	WebElement clickbook;
	
	@FindBy(xpath="//input[@value='Bag']")
	WebElement deselectbag;
	
	@FindBy(xpath="//button[@class='dropbtn']")
	WebElement selectdropdown;
	

	
	@FindBy(xpath="//a[text()='Facebook']")
	WebElement selectfacebook;
	
	//button[text()='My Button']
	
	@FindBy(xpath="//button[text()='My Button']")
	WebElement enablebutton;
	
	
AllMethods(WebDriver d){
		driver=d;
		PageFactory.initElements(d,this);
}

public void setname(String name) throws InterruptedException {
		entername.sendKeys(name);
		Thread.sleep(3000);
		Assert.assertNotNull(entername);
		driver.close();
		
	}
public void enterdescription(String des) throws InterruptedException {
	    description.getText();
	    description.clear();
    	description.sendKeys(des);;
    	Thread.sleep(3000);
    	Assert.assertNotNull(description);
    	driver.close();
    	
    	}

public void table1() {
		List<WebElement> rows=table.findElements(By.tagName("tr"));
   		List<WebElement> headings=table.findElements(By.tagName("th"));
   		for(int i=0;i<headings.size();i++) {
   			System.out.print(headings.get(i).getText()+"  ");
   			
   		}
   		for(int i=0;i<rows.size();i++) {
   			List<WebElement>  coloms= rows.get(i).findElements(By.tagName("td"));
   			
   			for(int j=0;j<coloms.size();j++) {
   				System.out.print(coloms.get(j).getText()+"  ");
   			}
   			System.out.println("  ");
   		}	
	}
public void Login(String uname,String pasword) {
	    username.sendKeys(uname);	
	    password.sendKeys(pasword);
	    login.click();		
	    assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	    driver.close();
}
	
public void frame() throws InterruptedException {
		
		Actions act =new Actions(driver);
    	act.sendKeys(Keys.PAGE_DOWN).build().perform();
    	act.sendKeys(Keys.PAGE_DOWN).build().perform();
   		//Initialize parent window handle 
   		String newwindow=driver.getWindowHandle();
   		driver.switchTo().frame(frame1);
   		Thread.sleep(3000);
   		driver.switchTo().window(newwindow);
   		Thread.sleep(3000);
   		driver.switchTo().frame(frame2);
   		Thread.sleep(3000);
   		driver.switchTo().window(newwindow);
   		Thread.sleep(3000);
   		assertEquals(driver.getTitle(), "omayo (QAFox.com)");
   		//driver.close();
   		
	     	}
public void secondlogin(String unamee,String paswords) throws InterruptedException {
	     username1.sendKeys(unamee);
	     pasword2.sendKeys(paswords);
	     login2.click();
		 Thread.sleep(3000);
		 Alert alert=driver.switchTo().alert();
		 alert.accept();
		 assertEquals(driver.getTitle(), "omayo (QAFox.com)");
		 driver.close();
}
	
public void hundaix1() throws InterruptedException {
		Hundaix.click();
		String text=Hundaix.getText();
		assertEquals("Hyundai", text);
		
	}
public void dropdown1() throws InterruptedException {
		Select select= new Select(dropdown);
		Thread.sleep(3000);
		select.selectByVisibleText("doc 3");
		Thread.sleep(3000);
		String option = select.getFirstSelectedOption().getText();
		assertEquals("doc 3", option);
		
	}
	
	@Test(description="Clear box and enter test")
public void Task4_1(String write) throws InterruptedException {
		clearandwrite.clear();
		Thread.sleep(3000);
		clearandwrite.sendKeys(write);
		Thread.sleep(3000);
		Assert.assertNotNull(clearandwrite);
		}
	
	@Test(description="Click on enabled button")
public void Task4_2() throws InterruptedException {
		clicikonEB.click();
		Thread.sleep(3000);
		String text=clicikonEB.getText();
		assertEquals("Button2", text);
		}
	
	@Test(description="Click on submit button")
public void Task4_3() throws InterruptedException {
		
		clicikonSB.click();
		Thread.sleep(3000);
		String text=clicikonSB.getText();
		assertEquals("Submit", text);
		
	}
	@Test(description="Click on Login button")
public void Task4_4() throws InterruptedException {
		
		clicikonLB.click();
		Thread.sleep(3000);
		String text=clicikonLB.getText();
		assertEquals("Login", text);
		}
	
	@Test(description="Click on Register button")
public void Task4_5() throws InterruptedException {
		
		clicikonRG.click();
		Thread.sleep(3000);
		String text=clicikonRG.getText();
		assertEquals("Register", text);
		}
	
	@Test(description="click on (click after text disappears) button & handle alert")
public void Task4_6() throws InterruptedException {
		
		Disapertext.click();
		Thread.sleep(3000);
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	}

	@Test(description="click on popup button")
public void Task4_7() throws InterruptedException {
		String newwindow=driver.getWindowHandle();
		popupbutton.click();
		//switch to windows and get text of child window
		java.util.Set<String> handles=driver.getWindowHandles();
		
		for(String handle:handles) {
			if(!handle.equals(newwindow)) {
				driver.switchTo().window(handle);
				String text=fullbody.getText();
				
				System.out.println(text);
				assertEquals(driver.getTitle(), "Basic Web Page Title");
				driver.close();
			}
			
			
		}
		driver.switchTo().window(newwindow);
		
	}
	
	@Test(description="click on try it button")
public void Task4_8() throws InterruptedException {
		tryit.click();
		Thread.sleep(5000);
		Assert.assertFalse(enablebutton.isEnabled());
		}
	
	@Test(description="click on double click here button")
	public void Task4_9() throws InterruptedException {
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.doubleClick(doubleclick).perform();
		Thread.sleep(3000);
		Alert alert2=driver.switchTo().alert();
		alert2.accept();
		assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	}
	
	@Test(description="click on check this button")
public void Task4_10() throws InterruptedException {
		checkthis.click();
		Thread.sleep(12000);
		enablebox.click();
		Assert.assertTrue(enablebox.isEnabled());
		driver.close();
	}
	@Test(description="click on Radio button")
	public void Task5_1() throws InterruptedException {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		radiobutton.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='radio1']"))).isEnabled();
		Assert.assertTrue(radiobutton.isEnabled());
		
	}
	@Test(description="click on (click to get alert) and handle elert")
	public void Task5_2() throws InterruptedException {
		alerthandle.click();
		Thread.sleep(3000);
		Alert alert2=driver.switchTo().alert();
		alert2.accept();
		assertEquals(driver.getTitle(), "omayo (QAFox.com)");
		
	}
	@Test(description="select blue color and deselect orange")
	public void Task5_3() throws InterruptedException {
		selectbluecolor.click();
		Thread.sleep(3000);
		deselectorange.click();
		Thread.sleep(3000);
		Assert.assertTrue(selectbluecolor.isEnabled());
	}
	
	@Test(description="read text of box")
	public void Task5_4() throws InterruptedException {
		readtext.isDisplayed();
		Thread.sleep(3000);
		Assert.assertTrue(readtext.isDisplayed());
	}
	
	@Test(description="click on getprompt and handle alert")
	public void Task5_5() throws InterruptedException {
		getpromt.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("asad");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	}
	
	@Test(description="click on getconfirmation and handlealert ")
	public void Task5_6() throws InterruptedException {
		getconfirmation.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	}
	
	@Test(description="send keys to first box")
	public void Task5_7(String box1) throws InterruptedException {
		firstbox.sendKeys(box1);
		Thread.sleep(3000);
		Assert.assertNotNull(firstbox);
	}
	
	@Test(description="send keys to second box")
	public void Task5_8(String box2) throws InterruptedException {
		secondbox.sendKeys(box2);
		Thread.sleep(3000);
		Assert.assertNotNull(secondbox);
		
	}
	
	@Test(description="Click on car")
	public void Task5_9() throws InterruptedException {
		clickcar.click();
		Thread.sleep(3000);
		Assert.assertTrue(clickcar.isEnabled());
	}
	
	@Test(description="Click on book and deselect")
	public void Task5_10() throws InterruptedException {
		Actions act = new Actions(driver);
		act.doubleClick(clickbook).perform();
		Thread.sleep(3000);
		deselectbag.click();
		Thread.sleep(3000);
		clickbook.click();
		Thread.sleep(3000);
		Assert.assertTrue(clickbook.isEnabled());
		
	}
	
	@Test(description="Click on book and deselect")
	public void Task5_11() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		selectdropdown.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Facebook']"))).isDisplayed();
		//Thread.sleep(7000);
		selectfacebook.click();
		assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		
	}

}
