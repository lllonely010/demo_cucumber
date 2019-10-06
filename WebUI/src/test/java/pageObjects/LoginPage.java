package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.assertEquals;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
    @FindBy (id="email")
	WebElement inputBox_username;    

    @FindBy (id="password")
	WebElement inputBox_password;

    @FindBy (css =".button--primary")
	WebElement submitBtn_login;
    
    @FindBy (css = ".alert")
	WebElement error_message;
    
    public void perform_Login(String username, String password){
    	
    	inputBox_username.sendKeys(username);
    	inputBox_password.sendKeys(password);
    	submitBtn_login.click();    	
    }
    
    public void verify_ErrorMessage(String alert) {
    	assertEquals(alert, error_message.getAttribute("outerText"));	
    } 
}
