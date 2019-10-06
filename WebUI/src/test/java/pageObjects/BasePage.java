package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public static final String LOGIN_LINK = "https://evra.geophy.com/login";
	public static final String SEARCH_LINK = "https://evra.geophy.com/search";
	public static final String REPORT_LINK = "https://evra.geophy.com/report";
	
	WebDriver driver;
	
    @FindBy (css=".button-primary")
	WebElement button_Login;    

    @FindBy (css=".button--secondary")
	WebElement button_Signup;
    
    @FindBy (xpath = "//a[contains(text(),'Logout')]")
    WebElement link_Logout;
    
    
    public WebElement get_Logout_Link() {   	
    	return link_Logout;
    }
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateTo_Page(String url) {
		driver.get(url);
	}
	
	public void navigateTo_LoginPage() {
		navigateTo_Page(LOGIN_LINK);
	}
	
	public void navigateTo_SearchPage() {
		navigateTo_Page(SEARCH_LINK);
	}
	
	public String getLocationHref() {
		return driver.getCurrentUrl();
	}
	
}
