package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

    

public class LoginTest extends BaseClass{
	
@Test
	public void Test1() {
			
		
		LoginPage lp = new LoginPage(driver);
		lp.Login("standard_user","secret_sauce");
	    System.out.println("Login successful");
	
	//Step6: Validate the error message on screen
	    
	}

@Test
	   public void Test2() {
		   LoginPage lp = new LoginPage(driver);
			lp.Login("standard_user","Abc@1234");
		
			//Step6: Validate the error message on screen 
		   
       WebElement Error = driver.findElement(By.xpath("//h3[@data-test='error']"));
		
       String ActError = Error.getText();
		String ExpError = "Epic sadface: Username and password do not match any user in this service";
		
		Assert.assertTrue(Error.isDisplayed());
		Assert.assertEquals(ActError, ExpError);
		
		 
		//Search for Products
		WebElement SearchText = driver.findElement(By.id("span class='title'>Products</span"));
		SearchText.sendKeys("products");

		 //Click Search Button
		WebElement SearchButton = driver.findElement(By.id("div id='root'"));
		SearchButton.click();
		
		
		
	
	}
	   
}

  



	
	
	

