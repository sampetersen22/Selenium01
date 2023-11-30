package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;

import Utility.WebUtil;
import engine.pageMethods;

public class loginpage extends pageMethods {
	ExtentReports extent;
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement loginBtn;
	
	@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
	WebElement number;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pswd;
	
	@FindBy(xpath="//body//div[@id='react-root']//div[@data-testid='application-id']//div//div//div[5]//div[3]")
	WebElement cred;
	@FindBy(xpath="//body//div[@id='react-root']//div[@data-testid='application-id']//div//div//div[5]//div[2]//div[1]//div[2]//div[2]")
	WebElement cred1;
	@FindBy(xpath="//div[contains(text(),'USD')]")
	WebElement cred2;
	@FindBy(xpath="(//div)[291]")
	WebElement cred3;
	@FindBy(xpath="(//div[@data-focusable='true'])[20]")
	WebElement cred4;
	@FindBy(xpath="//div[contains(text(),'From')]")
	WebElement cred5;
	@FindBy(xpath="//div[normalize-space()='Kempegowda International Airport']")
	WebElement cred6;
	@FindBy(xpath="//div[normalize-space()='Indira Gandhi International Airport']")
	WebElement cred7;
	@FindBy(xpath="(//div)[483]")
	WebElement cred8;
	@FindBy(xpath="(//div[@data-focusable='true'])[27]")
	WebElement cred9;
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[3]/div[2]")
	WebElement cred10;
	@FindBy(xpath="//input[@data-testid='traveller-0-first-traveller-info-input-box']")
	WebElement cred11;
	@FindBy(xpath="//input[@data-testid='traveller-0-last-traveller-info-input-box']")
	WebElement cred12;
	@FindBy(xpath="(//div[@data-focusable='true'])[13]")
	WebElement cred13;
	@FindBy(xpath="//input[@data-testid='traveller-1-first-traveller-info-input-box']")
	WebElement cred14;
	@FindBy(xpath="//input[@data-testid='traveller-1-last-traveller-info-input-box']")
	WebElement cred15;
	@FindBy(xpath="(//div[@data-focusable='true'])[15]")
	WebElement cred16;
	@FindBy(xpath="//div[@datla-testid='blueRibbonBag']//div[@data-testid='expandableList']//div[@aria-disabled='true']//div//div[@data-testid='expandableList-header']//div//div[@data-focusable='true']")
	WebElement cred17;
	@FindBy(xpath="(//div[@dir='auto'][normalize-space()='BLR - DEL'])[1]")
	WebElement cred18;
	@FindBy(xpath="(//div[contains(text(),'Done')])[1]")
	WebElement cred19;
	@FindBy(xpath="//*[@id=\'main-container\']/div/div[5]/div/div/div[2]/div/div/div[4]")
	WebElement cred20;
	
	@Test
	public void logindetails() throws InterruptedException {
		PageFactory.initElements(driver, this);
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        loginBtn.click();
	   Thread.sleep(5000);
	   number.sendKeys("8667500480");
	   pswd.sendKeys("Maxval123#");
	   try {
		cred.click();
		 test.log(Status.PASS, "Login successfully");
	} catch (Exception e) {
		test.log(Status.FAIL, "Login failed");
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  Thread.sleep(5000);
	  
	   cred1.click();
	   cred2.click();
	   cred3.click();
	   test.log(Status.PASS, "Currency selected");
	   cred4.click();
	   cred5.click();
	   cred6.click();
	   cred7.click();
	   test.log(Status.PASS, "From & to destination selected");
	   cred8.click();
	   cred9.click(); Thread.sleep(4000);
	   test.log(Status.PASS, "Passenger details given successfully");
	   cred10.click(); Thread.sleep(4000);
	   cred11.sendKeys("KUMAR");
	   cred12.sendKeys("M");
	   test.log(Status.PASS, "Passenger 1 details given");
	   cred13.click();
	   cred14.sendKeys("PREM");
	   cred15.sendKeys("M");
	   test.log(Status.PASS, "Passenger 2 details given");
	   cred16.click(); Thread.sleep(5000);
	   test.log(Status.PASS, "Cost of tickets");
	    cred17.click();
		cred18.click();
		cred19.click();
		cred20.click();
	   
		//searchBtn.click();
	}

}
