package p_o_m_Waqar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class All_Methods {
	
	WebDriver driver;

	@FindBy(id="ta1")
	WebElement textAreaOne;
	
	@FindBy(xpath="//textarea[@rows=10 and @cols = 30]")
	WebElement textAreaTwo;

	@FindBy(xpath="//table[@id=\"table1\"]")
	WebElement  allRows;

	@FindBy(tagName="tr")
	WebElement  cells;

	@FindBy(xpath="//*[@id=\"HTML31\"]/div[1]/form/input[1]")
	WebElement  userName;

	@FindBy(xpath="//*[@id=\"HTML31\"]/div[1]/form/input[2]")
	WebElement  password;

	@FindBy(xpath="//*[@id=\"HTML31\"]/div[1]/form/button")
	WebElement  loginButton;

	@FindBy(id="iframe1")
	WebElement  FirstFrame;

	@FindBy(xpath="//*[@id=\"iframe2\"]")
	WebElement  SecondFrame;

	@FindBy(name="userid")
	WebElement  userName2;

	@FindBy(name="pswrd")
	WebElement  password2;

	@FindBy(xpath="//*[@id=\"HTML42\"]/div[1]/form/input[3]")
	WebElement  loginButton2;


	@FindBy(xpath="//*[@id=\"multiselect1\"]/option[3]")
	WebElement  Hyundai;

	@FindBy(id="ironman4")
	WebElement  doc3;

	@FindBy(id="textbox1")
	WebElement  PreloadedTextBox;
	
	@FindBy(id="but2")
	WebElement  enabledButton;

	@FindBy(xpath="//*[@id=\"HTML10\"]/div[1]/button[1]")
	WebElement  submitButton;

	@FindBy(xpath="//*[@id=\"HTML10\"]/div[1]/button[2]")
	WebElement  LoginButton;

	@FindBy(xpath="//*[@id=\"HTML10\"]/div[1]/button[3]")
	WebElement  RegisterButton;

	@FindBy(id="alert2")
	WebElement  getAlert;

	@FindBy(linkText="Open a popup window")
	WebElement  linkTextButton;

	@FindBy(id="para1")
	WebElement  Para1;

	@FindBy(id="para2")
	WebElement  Para2;

	@FindBy(xpath="//*[@id=\"HTML46\"]/div[1]/button")
	WebElement  element;

	@FindBy(xpath="//*[@id=\"HTML47\"]/div[1]/button")
	WebElement  checkThisButton;

	@FindBy(id="dte")
	WebElement  MrOptionCB;
	
	@FindBy(id="radio1")
	WebElement Radio1;

	@FindBy(id="alert1")
	WebElement Alert1;

	@FindBy(id="checkbox1")
	WebElement OrangeCB;

	@FindBy(id="checkbox2")
	WebElement BlueCB;

	@FindBy(id="rotb")
	WebElement getText;

	@FindBy(id="prompt")
	WebElement Prompt;

	@FindBy(id="confirm")
	WebElement Confirm;

	@FindBy(className="classone")
	WebElement fillBox1;

	@FindBy(xpath="(//*[@class='classone'])[2]")
	WebElement fillBox2;

	@FindBy(xpath="//input[@value='Car']")
	WebElement car;
	
	@FindBy(xpath="//input[@value='Bag']")
	WebElement bag;

	@FindBy(xpath="//input[@value='Book']")
	WebElement book;

	@FindBy(xpath="//button[@class='dropbtn']")
	WebElement greenButton;
	
	@FindBy(xpath="//a[text()='Gmail']")
	WebElement gmailOption;
	
All_Methods(WebDriver d){
		driver=d;
		PageFactory.initElements(d,this);
}

}
