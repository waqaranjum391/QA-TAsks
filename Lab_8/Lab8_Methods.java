package Lab_8;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Lab8_Methods {
	
	WebDriver driver;
	
	Logger log=Logger.getLogger(Object_Class.class);
		
		@FindBy(xpath="//input[@id='user' and @type='text']")
		WebElement emailBox;
		
		@FindBy(xpath="//input[@id='login' and @type='submit']")
		WebElement continueBtn;
		
		@FindBy(xpath="//input[@id='password']")
		WebElement passwordBox;
		
		@FindBy(xpath="//button[@id='login-submit']")
		WebElement loginBtn;
		
		@FindBy(xpath="//*[contains(text(),'Create new board')]")
		WebElement createNewBoardBtn;
		
//		@FindBy(xpath="//p[contains(text(),'A board is made up of cards ordered on lists. Use it to manage projects, track information, or organize anything.')]")
//		WebElement create1board1;
		
		@FindBy(xpath="//input[@class='nch-textfield__input Hj0IB7nx8rs7UO Hj0IB7nx8rs7UO ysTE7s-UXRkpYP']")
		WebElement boardTitleBox;
		
		@FindBy(xpath="//button[@class='G2lWjDVJsvar3H Ts+YceGnvTbKoG HPCwi137Em5EYI JIXQq8gDYY04N6']")
		WebElement createBtn;
		
		@FindBy(xpath="//input[@class='list-name-input']")
		WebElement newList_NameBox;
		
		@FindBy(xpath="//span[@class='placeholder']")
		WebElement addAnotherListBtn;
		
		@FindBy(xpath="//input[@class='nch-button nch-button--primary mod-list-add-button js-save-edit']")
		WebElement addListBtn;
		
		@FindBy(xpath="//input[@type='text' and @placeholder='Enter list title…']")
		WebElement secondList;
				
		@FindBy(xpath="//a[@class='open-card-composer js-open-card-composer']")
		WebElement addACardBtn;
		
		@FindBy(xpath="//textarea[@class='list-card-composer-textarea js-card-title']")
		WebElement cardDescriptionBox;
		
		@FindBy(xpath="//input[@type='submit' and @value='Add card']")
		WebElement addCardBtn;
		
		@FindBy(xpath="//a[@class='icon-lg icon-close dark-hover js-cancel']")
		WebElement closeDescriptionBtn;
		
		@FindBy(xpath="//span[contains(text(),'Move')]")
		WebElement click_move2;
		
		@FindBy(xpath="//select[@class='js-select-list']")
		WebElement position;
		
		@FindBy(xpath="//input[@class='nch-button nch-button--primary wide js-submit']")
		WebElement move;
		
		@FindBy(xpath="//textarea[@class='list-card-edit-title js-edit-card-title']")
		WebElement edit_cardname;
		
		@FindBy(xpath="//input[@class='nch-button nch-button--primary wide js-save-edits']")
		WebElement click_save;
		
		@FindBy(xpath="//a[@class='button-link js-archive-card']//child::span[@class='js-sidebar-action-text']")
		WebElement archieve;
		
		@FindBy(xpath="//a[@class='quick-card-editor-buttons-item']//child::span[@class='quick-card-editor-buttons-item-text']")
		WebElement opencard;
		
		@FindBy(xpath="//a[@class='button-link js-delete-card negate']")
		WebElement delete;	
		
		@FindBy(xpath="//textarea[@class='list-card-composer-textarea js-card-title']")
		WebElement text_forsecondcard;
		
		@FindBy(xpath="//span[@class='list-card-title js-card-name']")
		WebElement clicktoopenpoup;
		
		@FindBy(xpath="//span[@class='list-card-title js-card-name']")
		WebElement clicktoopenpoup1;
		
		@FindBy(xpath="//input[@class='list-name-input']")
		WebElement thirdlist;
		
		@FindBy(xpath="//a[@class='BIOyZdkbd7KotX _7xO25yaQAbZ4cb']")
		WebElement boarddisplayed;
		
		@FindBy(xpath="//input[@class='js-confirm full nch-button nch-button--danger']")
		WebElement deletecard;
		
		@FindBy(xpath="//textarea[@class='list-card-edit-title js-edit-card-title']")
		WebElement text2;
		
		@FindBy(xpath = "//textarea[@class='list-card-edit-title js-edit-card-title']")
		WebElement ClearText;
		
		
Lab8_Methods(WebDriver drvr){
			driver=drvr;
			PageFactory.initElements(drvr,this);
	}
		   
		 
	public void login() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		log.info("Waiting for login page to load");
		wait.until(ExpectedConditions.visibilityOf(emailBox));		
		Thread.sleep(2000);
		emailBox.sendKeys("waqaranjum391@gmail.com");
		log.info("Enter user's Email");
		continueBtn.click();
		log.info("Click on continue button");
		log.info("Waiting for password field to load");
		wait.until(ExpectedConditions.visibilityOf(passwordBox));
		passwordBox.sendKeys("Mypwd@123");
		log.info("Enter user's password");
		loginBtn.click();
		log.info("Click on submit button");
		log.info("Waiting for homepage to load");
		wait.until(ExpectedConditions.visibilityOf(createNewBoardBtn));
		Assert.assertTrue(createNewBoardBtn.isDisplayed());
		
	}
	
	public void CreateBoard() {
		
		String RandomName = RandomStringUtils.randomAlphabetic(10);
		log.info("Waiting for desired element to load to load");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(createNewBoardBtn));
		createNewBoardBtn.click();
		log.info("Click on 'Create New Board' button");
		wait.until(ExpectedConditions.visibilityOf(boardTitleBox));
		boardTitleBox.sendKeys(RandomName);
		log.info("Enter title of the new board ");
		createBtn.click();
		log.info("Click on create button  create new board");
				   
	}	
	
	public void CreateTwoLists() throws InterruptedException {
		
		String RandomName = RandomStringUtils.randomAlphabetic(10);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(newList_NameBox));
		newList_NameBox.sendKeys(RandomName);
		log.info("Enter title of the first list");
		addListBtn.click();
		wait.until(ExpectedConditions.visibilityOf(newList_NameBox));
		newList_NameBox.sendKeys(RandomName);
		log.info("Enter title of the second list");
		addListBtn.click();
		log.info("Click on 'addlist' button");
		wait.until(ExpectedConditions.visibilityOf(secondList));
		Assert.assertTrue( secondList.isDisplayed());
	}
	
	public void Addcard() throws InterruptedException {
		
		String RandomName = RandomStringUtils.randomAlphabetic(8);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(addACardBtn));
		addACardBtn.click();
		log.info("Click on 'Add a card' cutton");
		wait.until(ExpectedConditions.visibilityOf(cardDescriptionBox));
		cardDescriptionBox.sendKeys(RandomName);
		log.info("Enter name of the new card");
		Thread.sleep(2000);
		addCardBtn.click();
		log.info("Click on 'add button' to add new card");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(closeDescriptionBtn));
		closeDescriptionBtn.click();
		log.info("Click on cross button to remove extra card option");
		Thread.sleep(2000);
		
	}
				
	public void Movecard() throws InterruptedException {
					
	
		
	}
					
	public void editcardname() throws InterruptedException {
					
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		Actions a = new Actions(driver);
		a.moveToElement(clicktoopenpoup1).contextClick().build().perform();
		log.info("click on card to openpopup ");
		wait.until(ExpectedConditions.visibilityOf(edit_cardname));
		edit_cardname.sendKeys("newcardname");
		log.info("edit card name");
		Thread.sleep(5000);
		String Text = ClearText.getAttribute("value");
		log.info("Get the text");
		System.out.println(Text);
		Assert.assertEquals(Text, "newcardname");
		click_save.click();
		log.info("click on save button to edit new name of the card");
		Thread.sleep(5000);
	
	}
	
	public void deletecard() throws InterruptedException {
	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
					
		Actions a = new Actions(driver);
		a.moveToElement(clicktoopenpoup1).contextClick().build().perform();
		log.info("click on card to openpop ");
		wait.until(ExpectedConditions.visibilityOf(opencard));
		opencard.click();
		log.info("click on open card");
		wait.until(ExpectedConditions.visibilityOf( archieve));
		archieve.click();
		log.info("click on archieve button");
		wait.until(ExpectedConditions.visibilityOf(delete));
		delete.click();
		log.info("click on delete button");
		wait.until(ExpectedConditions.visibilityOf( deletecard));
		deletecard.click();
		log.info("click on delete popup to finally delete card");
		Assert.assertNull(clicktoopenpoup1);
		
	}

}
