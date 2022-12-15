package Waqar;

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
	
	Logger log=Logger.getLogger(Lab8_Methods.class);
	
		
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
		
		@FindBy(xpath="//span[@class='list-card-title js-card-name']")
		WebElement clickToOpenPopUp;
		
		@FindBy(xpath="//a[@class='button-link js-move-card']")
		WebElement moveBtn;
		
		@FindBy(xpath="//select[@class='js-select-list']")
		WebElement positionDD;
		
		@FindBy(xpath="//input[@class='nch-button nch-button--primary wide js-submit']")
		WebElement moveBtn2;
		
		@FindBy(xpath="(//a[@role='button'])[4]")
		WebElement closePopUpBtn;
		
		@FindBy(xpath="//textarea[@class='list-card-edit-title js-edit-card-title']")
		WebElement editCardNameBox;
		
		@FindBy(xpath="//input[@class='nch-button nch-button--primary wide js-save-edits']")
		WebElement saveBtn;
		
		@FindBy(xpath="//span[@title='Archive']")
		WebElement archieveBtn;
		
		@FindBy(xpath="//a[@title='Delete']")
		WebElement deleteBtn;			

		@FindBy(xpath="//input[@value='Delete']")
		WebElement deleteBtn2;
		
Lab8_Methods(WebDriver drvr){
			driver=drvr;
			PageFactory.initElements(drvr,this);
	}
		   
		 
	public void login() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		log.info("Waiting for email field to load");
		wait.until(ExpectedConditions.visibilityOf(emailBox));		
		
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
		log.info("Verify that the user has been logged in.");
		
	}
	
	public void CreateBoard() {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		String RandomName = RandomStringUtils.randomAlphabetic(10);
		log.info("Waiting for creat new board button to load");
		wait.until(ExpectedConditions.visibilityOf(createNewBoardBtn));
		
		createNewBoardBtn.click();
		log.info("Click on 'Create New Board' button");
		
		log.info("Waiting for board title box to load");
		wait.until(ExpectedConditions.visibilityOf(boardTitleBox));
		
		boardTitleBox.sendKeys(RandomName);
		log.info("Enter title of the new board ");
		
		createBtn.click();
		log.info("Click on create button  create new board");
				   
	}	
	
	public void CreateTwoLists() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		String RandomName = RandomStringUtils.randomAlphabetic(10);
		
		log.info("Waiting for new list name field to load");
		wait.until(ExpectedConditions.visibilityOf(newList_NameBox));
		
		newList_NameBox.sendKeys(RandomName);
		log.info("Enter title of the first list");
		
		addListBtn.click();
		log.info("Click on 'Add list' button to add first list");
		
		log.info("Waiting for new list name field to load");
		wait.until(ExpectedConditions.visibilityOf(newList_NameBox));
		
		newList_NameBox.sendKeys(RandomName);
		log.info("Enter title of the second list");
		
		addListBtn.click();
		log.info("Click on 'Add list' button to add second list");
		
		log.info("Waiting for second list to be displayed");
		wait.until(ExpectedConditions.visibilityOf(secondList));
		
		Assert.assertTrue(secondList.isDisplayed());
		log.info("Verify that the lists has been added");
		
	}
	
	public void Addcard() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		String RandomName = RandomStringUtils.randomAlphabetic(8);
		
		log.info("Waiting for 'Add card' button to be displayed");
		wait.until(ExpectedConditions.visibilityOf(addACardBtn));
		
		addACardBtn.click();
		log.info("Click on 'Add a card' button");
		
		log.info("Waiting for 'Car Description' field to be displayed");
		wait.until(ExpectedConditions.visibilityOf(cardDescriptionBox));
		
		cardDescriptionBox.sendKeys(RandomName);
		log.info("Enter name of the new card");
		Thread.sleep(2000);
		
		addCardBtn.click();
		log.info("Click on 'add button' to add new card");
		Thread.sleep(2000);
		
		log.info("Waiting for 'cross' button to be displayed");
		wait.until(ExpectedConditions.visibilityOf(closeDescriptionBtn));
		
		closeDescriptionBtn.click();
		log.info("Click on cross button to remove extra card option");
		Thread.sleep(2000);
		
	}
				
	public void Movecard() throws InterruptedException {
					
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		clickToOpenPopUp.click();
		log.info("Click on card to open Pop-Up ");
		
		log.info("Waiting for Pop-Up to load.");
		wait.until(ExpectedConditions.visibilityOf(moveBtn));
		
		moveBtn.click();
		log.info("Click on the move button in the pop-up.");
			
		Select finalPosition = new Select(positionDD);
		finalPosition.selectByIndex(1);
		log.info("Select list in which you want to move the card");
		
		moveBtn2.click();
		log.info("Click the 'move' button to submit the action.");
		
		closePopUpBtn.click();
		log.info("Close the Pop-up.");
		
	}
					
	public void EditCardName() throws InterruptedException {
					
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		Actions act = new Actions(driver);
		
		act.contextClick(clickToOpenPopUp).build().perform();
		
		wait.until(ExpectedConditions.visibilityOf(editCardNameBox));
		editCardNameBox.sendKeys("New Name");
		log.info("Enter new name of the card");
		Thread.sleep(3000);
		
		String cardNewName = editCardNameBox.getAttribute("value");
		log.info("Get the new Name of the card");
		
		System.out.println(cardNewName);
		log.info("Print New Name of the card");
		
		Assert.assertEquals(cardNewName, "New Name");
		log.info("Verify that the name has been changed.");
		
		saveBtn.click();
		log.info("Click on save button to save new name of the card");
		Thread.sleep(5000);
	
	}
	
	public void DeleteCard() throws InterruptedException {
					
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
				
		clickToOpenPopUp.click();
		log.info("Click on card to open Pop-Up ");
		
		log.info("Waiting for Pop-Up to load.");
		wait.until(ExpectedConditions.visibilityOf(archieveBtn));
		
		archieveBtn.click();
		log.info("Click on the archieve button in the pop-up.");
		
		log.info("Waiting for 'delete button' to load.");
		wait.until(ExpectedConditions.visibilityOf(deleteBtn));
		
		deleteBtn.click();
		log.info("click on 'delete' button");
		
		log.info("Waiting for 'delete popup' to be displayed");
		wait.until(ExpectedConditions.visibilityOf(deleteBtn2));
		
		deleteBtn2.click();
		log.info("Click on 'delete popup' to finally delete the card");
		
		Assert.assertNull(clickToOpenPopUp);
		log.info("Verify that the card has been deleted");

	}

}
