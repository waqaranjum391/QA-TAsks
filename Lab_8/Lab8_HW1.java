package quiz3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.log4testng.Logger;

public class Lab8_HW1 {
	
	static Logger log = Logger.getLogger(Lab8_HW1.class);
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//*[contains(text(),'Create new board')]")
	WebElement CreateNewBoardBtn;
	
	@FindBy(xpath="//*[@id='user']")
	WebElement usrEmailTextArea;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement usrPwdTextArea;
	
	@FindBy(xpath="//*[@id='login-submit']")
	WebElement loginBtn2;

	@FindBy(xpath="//input[@type='text' and @spellcheck='false']")
	WebElement boardNameField;
	
	@FindBy(xpath="//*[@type='number']")
	WebElement deposTextArea;

	@FindBy(xpath="//button[@type='submit' and contains(text(),'Depos')]")
	WebElement usrDeposBtn2;

	@FindBy(xpath="//button[contains(text(),'Withd')]")
	WebElement usrWDBtn1;

	@FindBy(xpath="//*[@type='number']")
	WebElement wDTextArea;
	
	@FindBy(xpath="//button[@type='submit' and contains(text(),'Withd')]")
	WebElement usrWDBtn2;

	@FindBy(xpath="//button[contains(text(),'Logout')]")
	WebElement cstmrLogoutBtn;

	@FindBy(xpath="//button[contains(text(),'Manager')]")
	WebElement mngrLoginBtn;

	@FindBy(xpath="//button[contains(text(),'Add Customer')]")
	WebElement addCstmrBtn;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement frstNameText;
	
	@FindBy(xpath="//*[@type='text' and @placeholder='Last Name']")
	WebElement LastNameText;
	
	@FindBy(xpath="//*[@type='text' and @placeholder='Post Code']")
	WebElement PstCdText;
	
	@FindBy(xpath="//button[@type='submit' and contains(text(),'Add')]")
	WebElement addCstmrBtn2;

	@FindBy(xpath="//button[contains(text(),'Account')]")
	WebElement openAcctBtn;
	
	@FindBy(xpath="//*[@id='userSelect']")
	WebElement usersListDD;
	
	@FindBy(xpath="//*[@id='currency']")
	WebElement crncyDD;
	
	@FindBy(xpath="//button[@type='submit' and contains(text(),'Process')]")
	WebElement processBtn;

	@FindBy(xpath="//button[contains(text(),'Customers')]")
	WebElement listOfCstmrsBtn;

	@FindBy(xpath="//button[contains(text(),'Delete')]")
	WebElement deleteBtn;
	
Lab8_HW1(WebDriver drvr){
		driver=drvr;
		PageFactory.initElements(drvr,this);
		
}
	public void ManagerLogin() throws InterruptedException{
		Thread.sleep(3000);
		mngrLoginBtn.click();
		Thread.sleep(1000);
		addCstmrBtn.click();
		Thread.sleep(1000);
		frstNameText.sendKeys("Waqar");
		Thread.sleep(1000);
		LastNameText.sendKeys("Anjum");
		Thread.sleep(1000);
		PstCdText.sendKeys("44000");
		Thread.sleep(1000);
		addCstmrBtn2.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	public void OpenCutomerAccount() throws InterruptedException{
		Thread.sleep(1000);
		openAcctBtn.click();
		Thread.sleep(1000);
		Select User = new Select(usersListDD);
		Thread.sleep(1000);
		User.selectByVisibleText("Waqar Anjum");
		Thread.sleep(1000);
		Select Currency = new Select(crncyDD);
		Thread.sleep(1000);
		Currency.selectByVisibleText("Rupee");
		Thread.sleep(1000);
		processBtn.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	public void CreateBoard() throws InterruptedException{
		
		usrEmailTextArea.sendKeys("waqaranjum391@gmail.com");
		Thread.sleep(1000);
		loginBtn.click();
		Thread.sleep(1000);
		usrPwdTextArea.sendKeys("Mypwd@123");
		Thread.sleep(1000);
		loginBtn2.click();
		Thread.sleep(5000);
		CreateNewBoardBtn.click();
		Thread.sleep(2000);
		String random1 = RandomStringUtils.randomAlphabetic(8);
		//boardNameField.sendKeys();
	}
	

}
