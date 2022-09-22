package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver ;
	
	//************************ Objects *******************************
	
	@FindBy(linkText = "Log in")
	WebElement LoginLink;
	
	@FindBy(id = "user-name")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement Password;

		
	@FindBy(id = "login-button")
	WebElement LoginBtn;
	
	public LoginPage(WebDriver baseDriver) {
		
		this.driver = baseDriver;
		PageFactory.initElements(baseDriver, this);
	}
	
	// ***************** Methods **************************************
	
	public void Login(String UserNameVal, String PassVal) {
		
				
		// Step1. Click on the Login Link
				
		LoginBtn.click();
		
		// Step2: Enter UName
	
		UserName.sendKeys(UserNameVal);
		
		//Step3: Enter the Password
      
		Password.sendKeys(PassVal);
      
	}
	
	
	}
	

